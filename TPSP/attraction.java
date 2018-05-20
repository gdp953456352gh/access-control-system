package TPSP;

public class attraction {
    private String name=new String();
    private int age=0;
    private int maxheight=0;
    private int minheight=0;
	public attraction(String a,int b, int c,int d)
	{
		name=a;
		age=b;
		maxheight=c;
		minheight=d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMaxheight() {
		return maxheight;
	}
	public void setMaxheight(int maxheight) {
		this.maxheight = maxheight;
	}
	public int getMinheight() {
		return minheight;
	}
	public void setMinheight(int minheight) {
		this.minheight = minheight;
	}
	

}
