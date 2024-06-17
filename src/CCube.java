import mcu.javap.*;
public class CCube extends CRec{
	int height;
	CCube(){
		this(0,0,0);
	}
	CCube(int l,int w,int h){
		this.length=l;
		this.width=w;
		this.height=h;
	}
	public int calArea(){
		return length*width*height;
	}
	public void show(){
		System.out.println("長："+length);
		System.out.println("寬："+width);
		System.out.println("高："+height);
		System.out.println("面積："+calArea());
	}
}
