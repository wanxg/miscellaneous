package newtest;


class TextInput {
	
	private StringBuilder value = new StringBuilder();
	
	public void add(char c){
		this.value.append(c);
	}
	
	public String getValue(){
		return value.toString();
	}
}

class NumericInput extends TextInput {
	
	public void add(char c){
		
		if(!Character.isDigit(c))
			return;
		
		else
			super.add(c);
	}
	
}

public class UserInput {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
