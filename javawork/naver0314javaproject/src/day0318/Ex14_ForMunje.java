package day0318;

import java.util.Scanner;

public class Ex14_ForMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  5개의 점수(score)를 입력하면 갯수(count)와 합계(sum) 출력하기
		 *  (단, 1~100 이 아닐경우는 갯수에서 제외하고 합계에서도 제외하기-continue 사용
		 *  
		 *  (예)
		 *  
		 *  점수는? 80 s1?
		 *  점수는? 12 s2?
		 *  점수는? 70 s3?
		 *  점수는? 60 s4?
		 *  점수는? 100 s5?
		 *  
		 *  입력한 점수 갯수 : 4
		 *  총 합계 : 310
		 */
		Scanner sc=new Scanner(System.in);
		//int s1,s2,s3,s4,s5,sum;
		//int count=0;
		
		//System.out.println("점수는?");
		//s1=sc.nextInt();
		//System.out.println("점수는?");
		//s2=sc.nextInt();
		//System.out.println("점수는?");
		//s3=sc.nextInt();
		//System.out.println("점수는?");
		//s4=sc.nextInt();
		//System.out.println("점수는?");
		//s5=sc.nextInt();
		
		
		//for(int i=1;i<=100;i++)
		//	if(i<1 || i>101)
		//		continue;
		
		//sum=(s1+s2+s3+s4+s5);
		//System.out.println("입력한 점수 갯수:"+count);
		//System.out.println("총 합계 : "+sum);
		int count=0,sum=0,score;
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("숫자 입력"+i);
			score=sc.nextInt();
			if(score<1 || score>100)
			continue;//i++로이동
			
			count++;
			sum+=score;
		}
		System.out.println("입력한 점수 갯수 :"+count);
		System.out.println("총 합계 : "+sum);
	}

}
