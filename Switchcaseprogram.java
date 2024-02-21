package java2024;

public class Switchcaseprogram {

	public static void main(String[] args) {
		int weekno = 1;
		switch(weekno) {
		case 1: System.out.println("sun");break;
		case 2: System.out.println("mon");break;
		case 3: System.out.println("tues");break;
		case 4: System.out.println("wed");break;
		case 5: System.out.println("thur");break;
		case 6: System.out.println("fri");break;
		case 7: System.out.println("sat");break;
		default :System.out.println("invalidday");
		}
//Break is jumping statement but why are we using it here ?
		//it will execute the next case automatically without checking the condition thats why break is used 
		//for example if we are removing the break from line no :8 
		// this will be the output 
		//sun
		//mon
		//why there is no break statement in the default ?
		//Break is not needed here because that is the last statement 
		// when having more conditions use switch case statements 
	}

}
