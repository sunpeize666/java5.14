
package chapter12;
class Box10{
	private int width;
	private int height;
	private int depth;
	private int vol;
	private long idNum;
	private static long box10;
public  Box10(int width,int height, int depth)
{
this.width = width;
this.height = height;
this.depth = depth;
idNum = ++box10;
volume();
}
	private void volume()
	{
		vol = width*height*depth;
	// TODO 自动生成的方法存根
	
}
	public String getvolume() {
		return idNum+"번 박스의 부터 : "+vol;
	}
	public static long getCurrentID() {
		//return idNum;
		return box10;
	}
public class Box10Test1{
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Box10 mybox1;
for(int i=1 ; i<=5 ; i++) {
	mybox1 = new Box10(i,i+1,i+2);
	System.out.println(mybox1.getvolume());
}
System.out.println("마지막 생성된 박스 번호는"+Box10.getCurrentID()+"번입니다");
	}

}
}
