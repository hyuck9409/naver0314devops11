package day0326;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

/*
 * score.txt 를 읽어서 총갯수와 총점, 평균을 구하시오
 * 단, 점수에 문자가 있는경우 갯수에서 제외하고 총점에서도 제외하고 출력이 되도록 하시오
 * 
 * 
 */
public class Ex17_ExceptionMunje {
	static final String FILENAME="d:/naver0314/score.txt";
	static public void scoreRead() throws IOException
	{
		int score,sum=0,count=0;
		double avg=0;
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			while(true)
			{
				String s=br.readLine();
				if(s==null)//읽을 데이터가 더이상 없을겨우 while 종료
					break;
				try {
					score=Integer.parseInt(s);//문자일경우 바로 catch 이동
					count++;
					sum+=score;
				} catch (NumberFormatException e) {
					// TODO: handle exception
				}
			}
			avg=(double)sum/count;
			System.out.println("점수 갯수 : "+count);
			System.out.println("총 점 : "+sum);
			//소숫점 이하 2자리까지 출력
			NumberFormat nf=NumberFormat.getInstance();
			nf.setMaximumFractionDigits(2);
			System.out.println("평 균 : "+nf.format(avg));
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어요:"+e.getMessage());
		}finally {
			br.close();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			scoreRead();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
