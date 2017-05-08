package day1;

import java.util.Scanner;

import org.junit.Test;

public class hello {

	@Test
	public void test1() {

		int year = 2017;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
	}

	@Test

	public void change() {
	       int num1 = 5;
	       int num2 = 3;
	       System.out.println("before: " + num1);
	       System.out.println("before: " + num2);

           int temp = num1;
	       num1 = num2;
	       num2 = temp;

	       System.out.println("after: " + num1);
	       System.out.println("after: " + num2);
	}
	
	
	
	
	
	
	
	
	@Test
	public void test3(){
		Scanner scanner = new Scanner(System.in);
	    System.out.println("请输入学生的成绩：");
	    int score = scanner.nextInt();
	    System.out.println("score: " + score);

		
		if (score > 100 || score < 0) {
	        System.out.println("非法的输入");
	        return;
	    }
	    
	    if (score >= 90 && score <= 100) {
	        System.out.println("优秀");
	    } else if (score >= 80) {
	        System.out.println("良好");
	    } else if (score >= 70) {
	        System.out.println("一般");
	    } else if (score >= 60) {
	        System.out.println("及格");
	    } else {
	        System.out.println("不及格");
	    }

	}
}
