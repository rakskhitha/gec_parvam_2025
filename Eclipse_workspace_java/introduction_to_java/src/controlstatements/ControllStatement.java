package controlstatements;

public class ControllStatement {
	public static void main(String[] args) {
		/*
		 * if,if else, else if and switch statement
		 * 
		 * if(condition){
		 * }
		 * 
		 * 
		 * 
		 * 
		 * if(condition){
		 * }
		 * else{
		 * }
		 * 
		 * 
		 * 
		 * 
		 * if(condition){
		 * }
		 * else if(condition){
		 * }
		 * else{
		 * }
		 * 
		 * 
		 * switch(condition){
		 * case 1 : {
		 * break;
		 * }
		 * }
		 * 
		 * 
		 * */
		
		
		
		//if condition
		String name="Raksha";
		if(name=="Raksha") {
			System.out.println("NAME: "+name);
		}
		
		//if else
		
		int age=18;
		if(age<18) {
			System.out.println("he cannot  vote");
		}
		else {
			System.out.println("he can vote");
		}
		
		
		
		//else if
		
		int percentage=100;
		if(percentage<=60 && percentage>=35) {
			System.out.println("PASS");
		}
		else if(percentage>=60 && percentage<=70){
			System.out.println("AVERAGE");
			
		}
		else if(percentage>=70 && percentage<=80){
			System.out.println("GOOD");
			
		}
		else if(percentage>=80 && percentage<=90){
			System.out.println("BEST");
			
		}
		else {
			System.out.println("EXCELENT");
			
		}
		
		
		
		//SWITCH1 other mrthod after java8 in difined in the other file 
		
		int grade= 1;
		switch(grade) {
		case 1 : {
			System.out.println("EXCELLENT");
			
		}
		case 2 :{
			System.out.println("GOOD");
		}
		case 3 :{
			System.out.println("AVERAGE");
		}
		default :{
			System.out.println("KKEP IT UP");
		}
		}
	}

}

