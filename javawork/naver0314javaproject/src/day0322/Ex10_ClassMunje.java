package day0322;


class Member
{
	String name,addr,ph;
	Member()
	{
		System.out.println("디폴트 생성자");
		name=" 정상혁 ";
		addr=" 서울 ";
		ph=" 010-9450-9409 ";
		
	}
	Member(String name)
	{
		this(name," 010-2828-1818 "," 파리");
		
		
	}
	Member(String name, String ph)
	{
		
		
		this(name,ph,"영국");
		
	}
	Member(String name, String ph, String addr)
	{
		this.name=name;
		this.ph=ph;
		this.addr=addr;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	
}
public class Ex10_ClassMunje {
	
	public static void writeMember(Member a)
	{
		System.out.println(a.getName()+a.getPh()+a.getAddr());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Member m1=new Member();
Member m2=new Member(" 이강인 ");
Member m3=new Member(" 손흥민 "," 010-2222-3333 ");
Member m4=new Member(" Candy "," 010-444-5555 "," 제주도");

System.out.println("** 멤버 명단 출력 **");
writeMember(m1);
writeMember(m2);
writeMember(m3);
writeMember(m4);

System.out.println("** m1 멤버의 값 변경하기");
m1.setName("이영자");
m1.setPh("011-2323-6767");
m1.setAddr("부산");

writeMember(m1);
	}

}
