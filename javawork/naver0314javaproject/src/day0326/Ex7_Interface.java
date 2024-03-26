package day0326;


interface StudyInter
{
public void JavaStudy();
public void springStudy();
}

interface PlayInter
{
	public void run();
	public void game();
	}

class MyStudy implements StudyInter
{
	@Override
	public void JavaStudy() {
		// TODO Auto-generated method stub
System.out.println("자바");
	}
	@Override
	public void springStudy() {
		// TODO Auto-generated method stub
		System.out.println("스프링");
	}
}

class MyPlay implements PlayInter
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("달리기");
	}
	@Override
	public void game() {
		// TODO Auto-generated method stub
	System.out.println("게임");	
	}
}
public class Ex7_Interface {
	
	static public void study(StudyInter s)
	{
		s.JavaStudy();
		s.springStudy();
		
	}
static public void play(PlayInter p)
{
p.run();
p.game();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//MyStudy myStudy=new MyStudy();
//myStudy.JavaStudy();
//myStudy.springStudy();
//
//MyPlay myPlay=new MyPlay();
//myPlay.run();
//myPlay.game();
		study(new MyStudy());
		play(new MyPlay());
	}

}
