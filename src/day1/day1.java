package day1;

import java.util.Scanner;

import org.junit.Test;

public class Day1 {
	@Test
	public void test1() {

		int year = 2017;
		if (((year % 4 == 0) && (year % 100 != 0)) 
				|| (year % 400 == 0)) {
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


	@Test
	public void test4(){
		int num = 1;//1、循环条件的初始化
		while (num <= 5){//2、循环条件的判断
			num++;//3、循环条件的改变（趋向于循环条件
			System.out.println("HelloWorld!");
		}
	}
	
	@Test
	public void test5(){
		int num = 1;//1、循环条件的初始化
		int a = 0;
		while (num <= 100){//2、循环条件的判断
			System.out.println(num);
			
			a = a + num;//a += num
			num++;//3、循环条件的改变（趋向于循环条件
		}
		System.out.println("a:" + a);
	}
	
	
	@Test
	public void for1(){
		for (int i = 1; i <= 5; i++){
			System.out.println("HelloWord!");
		}
	}
	
	@Test
	public void for2(){
		int a = 0;
		for (int i = 1; i <= 100; i++){
			a = a + i;
			//System.out.println(i);
		}
		System.out.println("a:" + a);
	}
	
	@Test
	public void for3(){
		int a = 0;
		for (int i = 1; i <= 100; i ++){
			if (i % 7 == 0){
				System.out.println(i);
				a = a + 1;
			}
		}
		System.out.println("一共有" + a +"个");
	}
	
	public void for4(){
		for (int i = 0; i <= 3; i ++){
			for (int j = 1;j <= 3; j ++){
				System.out.print("*");
				
			}
		}
	}
	
	@Test
	public void for5(){
		for (int i=1;i<=9;i++) {
			for (int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.print("\n");
		}
	}
	
}
