package com.wanxg.classfinder;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarFile;

import org.apache.openejb.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassFinder {

	static Logger logger = LoggerFactory.getLogger(ClassFinder.class);
	//static final String PATH = "D:\\Users\\WanX\\git\\ibo\\itp\\target\\apache-tomee";
	static Map<String, String> report = new HashMap<String, String>();
	static final String usage = "\nUsage: findclass [PATH] (-c CLASS_NAME | -p PACKAGE_NAME) \n" + "\n"
			+ "Argument list:\n" + "\t" + "PATH              " + "\t"
			+ "Optional argument. It can be the path of a jar file or a directory.\n" + "\t" + "                  "
			+ "\t" + "If it is not provided, the current path '.' is used.\n" + "\t" + "-c CLASS_NAME     " + "\t"
			+ "Class name that will be searched, OR \n" + "\t" + "-p PACKAGE_NAME   " + "\t"
			+ "Package name that will be searched.\n";

	public static void main(String[] args) {

		String path=null;
		String option=null;
		String target=null;
		

		logger.info("Starting ......");

		if (args.length < 2) {
			System.out.println(usage);
			return;
		}

		if (args.length == 2) {
			if (!(args[0].trim().equalsIgnoreCase("-p") || args[0].trim().equalsIgnoreCase("-c"))) {
				System.out.println(usage);
				return;
			} else {
				path = ".";
				option=args[0];
				target = args[1];
			}
		}

		if (args.length > 2) {
			path = args[0];
			if (!(args[1].trim().equalsIgnoreCase("-p") || args[1].trim().equalsIgnoreCase("-c"))) {
				System.out.println(usage);
				return;
			} else {
				path = args[0];
				option=args[1];
				target = args[2];
			}
		}
		StringBuilder sb = new StringBuilder();
		Arrays.asList(args).forEach(arg->sb.append(arg+" "));
		logger.info("Argument list : " + sb);
		
		Arrays.asList(args).forEach(arg->{
			logger.info("arg: " +arg);
		});
		
		if (option.trim().equalsIgnoreCase("-c")) {

			File file = new File(path);

			if (file.isFile()) {
				logger.info("Provided path refers to a file: " + file.getPath());
				searchInsideAJar(target, file);
			}

			if (file.isDirectory()) {
				logger.info("Provided path refers to a directory: " + file.getPath());
				searchInsideADirectory(target, file);
			}
		}

		else if (option.trim().equalsIgnoreCase("-p")) {

		}

		if (!report.isEmpty())
			report.forEach((key, value) -> System.out.println(value + " -> " + key));

	}

	private static void searchInsideADirectory(String className, File file) {

		// logger.info("Processing in a directory " + file);

		if (!file.isDirectory()) {
			logger.error("Error: the provided path is not a directory.");
			return;
		}

		Arrays.asList(file.listFiles(aFile -> {
			if (aFile.getName().endsWith(".jar") || aFile.isDirectory())
				return true;
			else
				return false;
		})).forEach(aFile -> {
			if (aFile.isFile())
				searchInsideAJar(className, aFile);
			else if (aFile.isDirectory())
				searchInsideADirectory(className, aFile);
		});
	}

	private static void searchInsideAJar(String className, File file) {

		// logger.info("Processing in a jar " + file);

		if (!file.getName().endsWith(".jar")) {
			logger.info(file + " is not a jar.");
			return;
		}

		JarFile jarFile;

		try {
			jarFile = new JarFile(file);

			jarFile.stream().filter(entry -> {
				if (!entry.isDirectory() && entry.getName().endsWith(".class"))
					return true;
				else
					return false;
			}).forEach(entry -> {
				String[] entryParts = entry.getName().split("/");
				if (className.endsWith(".class") && className.equals(entryParts[entryParts.length - 1]))
					report.put(file.getAbsolutePath(), entry.getName().replace("/", "."));

				else if (entryParts[entryParts.length - 1].substring(0, entryParts[entryParts.length - 1].indexOf("."))
						.equals(className))
					report.put(file.getAbsolutePath(), entry.getName().replace("/", "."));

			});
		} catch (IOException e) {
			logger.error("IOException" + e.getMessage());
		}
	}
}
