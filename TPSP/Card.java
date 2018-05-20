package TPSP;

import java.util.ArrayList;

public class Card {
	private String id =new String();
	private String name =new String();
	private String birthday =new String();
	private String address =new String();
	private String height =new String();
	ArrayList<String> spiderman =new ArrayList<String>() ;
	ArrayList<String> ice =new ArrayList<String>() ;
	ArrayList<String> canyon =new ArrayList<String>() ;
	ArrayList<String> theatre =new ArrayList<String>() ;
	ArrayList<String> flow =new ArrayList<String>() ;
	ArrayList<String> carousel =new ArrayList<String>() ;
	private int id1;
	private int birthday1;
	private int height1=0 ;
	ArrayList<Integer> spiderman1 =new ArrayList<Integer>() ;
	ArrayList<Integer> ice1 =new ArrayList<Integer>() ;
	ArrayList<Integer> canyon1 =new ArrayList<Integer>() ;
	ArrayList<Integer> theatre1 =new ArrayList<Integer>() ;
	ArrayList<Integer> flow1 =new ArrayList<Integer>() ;
	ArrayList<Integer> carousel1 =new ArrayList<Integer>() ;
	public Card(String a,int b)
	{
		id=a;
		id1=b;
	}
	public Card()
	{
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public int getBirthday1() {
		return birthday1;
	}
	public void setBirthday1(int birthday1) {
		this.birthday1 = birthday1;
	}
	public int getHeight1() {
		return height1;
	}
	public void setHeight1(int height1) {
		this.height1 = height1;
	}
	public void sortdate()
	{
		for(int i=0;i<spiderman.size();i++)
		{
			for(int j=i+1;j<spiderman.size();j++)
			{
				if(spiderman1.get(i)>spiderman1.get(j))
				{
					int temp1=spiderman1.get(i);
					spiderman1.set(i,spiderman1.get(j));
					spiderman1.set(j,temp1);
					String  temp=spiderman.get(i);
					spiderman.set(i,spiderman.get(j));
					spiderman.set(j,temp);
				}
			}
		}
		for(int i=0;i<ice.size();i++)
		{
			for(int j=i+1;j<ice.size();j++)
			{
				if(ice1.get(i)>ice1.get(j))
				{
					int temp1=ice1.get(i);
					ice1.set(i,ice1.get(j));
					spiderman1.set(j,temp1);
					String  temp=ice.get(i);
					ice.set(i,ice.get(j));
					ice.set(j,temp);
				}
			}
		}
		for(int i=0;i<canyon.size();i++)
		{
			for(int j=i+1;j<canyon.size();j++)
			{
				if(canyon1.get(i)>canyon1.get(j))
				{
					int temp1=canyon1.get(i);
					canyon1.set(i,canyon1.get(j));
					canyon1.set(j,temp1);
					String  temp=canyon.get(i);
					canyon.set(i,canyon.get(j));
					canyon.set(j,temp);
				}
			}
		}

		for(int i=0;i<theatre.size();i++)
		{
			for(int j=i+1;j<theatre.size();j++)
			{
				if(theatre1.get(i)>theatre1.get(j))
				{
					int temp1=theatre1.get(i);
					theatre1.set(i,theatre1.get(j));
					theatre1.set(j,temp1);
					String  temp=theatre.get(i);
					theatre.set(i,theatre.get(j));
					theatre.set(j,temp);
				}
			}
		}
		for(int i=0;i<flow.size();i++)
		{
			for(int j=i+1;j<flow.size();j++)
			{
				if(flow1.get(i)>flow1.get(j))
				{
					int temp1=flow1.get(i);
					flow1.set(i,flow1.get(j));
					flow1.set(j,temp1);
					String  temp=flow.get(i);
					flow.set(i,flow.get(j));
					flow.set(j,temp);
				}
			}
		}

		for(int i=0;i<carousel.size();i++)
		{
			for(int j=i+1;j<carousel.size();j++)
			{
				if(carousel1.get(i)>carousel1.get(j))
				{
					int temp1=carousel1.get(i);
					carousel1.set(i,carousel1.get(j));
					carousel1.set(j,temp1);
					String  temp=carousel.get(i);
					carousel.set(i,carousel.get(j));
					carousel.set(j,temp);
				}
			}
		}

	}
}
