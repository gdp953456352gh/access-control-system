package TPSP;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cardfile {
	String a=new String();//a is the temp sc;
	ArrayList<Card> arr =new ArrayList<Card>();
	int count=0;  //num of card
	int i=-1;
//	public boolean validate(String te)
//	{
//		if(te.matches("[0-9]{1,2}[/-][0-9]{1,2}[/-][0-9]{4}"))
//		{
//			return true;
//		}
//		return false;
//	}
	public boolean valiID(String te)
	{
		if(te.matches("[0-9]{1,}"))
		{
			return true;
		}
		return false;
	}
	public boolean valiheight(String te)
	{
		if(te.matches("[0-9]{1,}cm"))
		{
			return true;
		}
		return false;
	}
	public boolean validate(String te)
	{
		  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
		  Matcher matcher2 = pattern2.matcher(te);
		  boolean b4= matcher2.matches();
		  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
		  Matcher matcher3 = pattern3.matcher(te);
		  boolean b3= matcher3.matches();
		  Pattern pattern = Pattern.compile("[0-9]{2}[/-][0-9]{2}[/-][0-9]{4}");
		  Matcher matcher = pattern.matcher(te);
		  boolean b= matcher.matches();
		  Pattern pattern1 = Pattern.compile("[0-9][/-][0-9][/-][0-9]{4}");
		  Matcher matcher1 = pattern1.matcher(te);
		  boolean b1= matcher1.matches();
		  if(b)
		  {
			  String judge1=new String();
			  String judge2=new String();
			  String judge3=new String();
			  int judge11=0;
			  int judge22=0;
			  int judge33=0;
			  judge1=te.substring(0,2);
			  judge2=te.substring(3,5);
			  judge3=te.substring(6,te.length());
			  judge11=Integer.parseInt(judge1);
			  judge22=Integer.parseInt(judge2);
			  judge33=Integer.parseInt(judge3);
			  if(judge22>12)
			  {
				  return false;
			  }
			  else if(judge22==1||judge22==3||judge22==5||judge22==7||
					  judge22==8||judge22==10||judge22==12)
			  {
				  if(judge11>31)
					  return false;
				  else
					  return true; 
			  }
			  else if(judge22==4||judge22==6||judge22==9||judge22==11)
			  {
				  if(judge11>30)
					  return false;
				  else
					  return true; 
			  }
			  else if(judge22==2)
			  {
				  if((judge33%4)==0&&(judge33%100)!=0)
				  {
					  if(judge11>29)
						  return false;
					  else
						  return true; 
				  }
				  else if((judge33%400)==0)
				  {
					  if(judge11>29)
						  return false;
					  else
						  return true; 
				  }
				  else
				  {
					  if(judge11>28)
						  return false;
					  else
						  return true; 
				  }
			  }
			  else
				  return false;  
		  }
		  if(b1)
		  {
			  String judge1=new String();
			  String judge2=new String();
			  String judge3=new String();
			  int judge11=0;
			  int judge22=0;
			  int judge33=0;
			  judge1=te.substring(0,1);
			  judge2=te.substring(2,3);
			  judge3=te.substring(4,te.length());
			  judge11=Integer.parseInt(judge1);
			  judge22=Integer.parseInt(judge2);
			  judge33=Integer.parseInt(judge3);
			  if(judge22>12)
			  {
				  return false;
			  }
			  else if(judge22==1||judge22==3||judge22==5||judge22==7||
					  judge22==8||judge22==10||judge22==12)
			  {
				  if(judge11>31)
					  return false;
				  else
					  return true; 
			  }
			  else if(judge22==4||judge22==6||judge22==9||judge22==11)
			  {
				  if(judge11>30)
					  return false;
				  else
					  return true; 
			  }
			  else if(judge22==2)
			  {
				  if((judge33%4)==0&&(judge33%100)!=0)
				  {
					  if(judge11>29)
						  return false;
					  else
						  return true; 
				  }
				  else if((judge33%400)==0)
				  {
					  if(judge11>29)
						  return false;
					  else
						  return true; 
				  }
				  else
				  {
					  if(judge11>28)
						  return false;
					  else
						  return true; 
				  }
			  }
			  else
				  return false;  
		  }
		  if(b3)
		  {
			  String judge1=new String();
			  String judge2=new String();
			  String judge3=new String();
			  int judge11=0;
			  int judge22=0;
			  int judge33=0;
			  judge1=te.substring(0,1);
			  judge2=te.substring(2,4);
			  judge3=te.substring(5,te.length());
			  judge11=Integer.parseInt(judge1);
			  judge22=Integer.parseInt(judge2);
			  judge33=Integer.parseInt(judge3);
			  if(judge22>12)
			  {
				  return false;
			  }
			  else if(judge22==1||judge22==3||judge22==5||judge22==7||
					  judge22==8||judge22==10||judge22==12)
			  {
				  if(judge11>31)
					  return false;
				  else
					  return true; 
			  }
			  else if(judge22==4||judge22==6||judge22==9||judge22==11)
			  {
				  if(judge11>30)
					  return false;
				  else
					  return true; 
			  }
			  else if(judge22==2)
			  {
				  if((judge33%4)==0&&(judge33%100)!=0)
				  {
					  if(judge11>29)
						  return false;
					  else
						  return true; 
				  }
				  else if((judge33%400)==0)
				  {
					  if(judge11>29)
						  return false;
					  else
						  return true; 
				  }
				  else
				  {
					  if(judge11>28)
						  return false;
					  else
						  return true; 
				  }
			  }
			  else
				  return false;  
		  }
		  if(b4)
		  {
			  String judge1=new String();
			  String judge2=new String();
			  String judge3=new String();
			  int judge11=0;
			  int judge22=0;
			  int judge33=0;
			  judge1=te.substring(0,2);
			  judge2=te.substring(3,4);
			  judge3=te.substring(5,te.length());
			  judge11=Integer.parseInt(judge1);
			  judge22=Integer.parseInt(judge2);
			  judge33=Integer.parseInt(judge3);
			  if(judge22>12)
			  {
				  return false;
			  }
			  else if(judge22==1||judge22==3||judge22==5||judge22==7||
					  judge22==8||judge22==10||judge22==12)
			  {
				  if(judge11>31)
					  return false;
				  else
					  return true; 
			  }
			  else if(judge22==4||judge22==6||judge22==9||judge22==11)
			  {
				  if(judge11>30)
					  return false;
				  else
					  return true; 
			  }
			  else if(judge22==2)
			  {
				  if((judge33%4)==0&&(judge33%100)!=0)
				  {
					  if(judge11>29)
						  return false;
					  else
						  return true; 
				  }
				  else if((judge33%400)==0)
				  {
					  if(judge11>29)
						  return false;
					  else
						  return true; 
				  }
				  else
				  {
					  if(judge11>28)
						  return false;
					  else
						  return true; 
				  }
			  }
			  else
				  return false;  
		  }
		return false;
	}
	public boolean valiname(String te)
	{
		if(te.matches("[a-zA-Z ]{1,}"))
		{
			return true;
		}
		return false;
	}
	public void reading(Scanner s) throws Exception
	{
		Card tempc =new Card();
		int flagh=0;
		while(s.hasNextLine())
		{
			a=s.nextLine();
			flagh=0;
			if(a.length()==0)
			{
				if(tempc.getId().isEmpty()||tempc.getName().isEmpty()||tempc.getBirthday().isEmpty()){
					flagh=1;
				}
				if(flagh==0)
				{
				arr.add(tempc);
				count++;
				i++;
				}
				tempc =new Card();
			}
			while(a.length()==0)
			{
				if(s.hasNextLine())
				a=s.nextLine();
				else
					break;
			}
			if(a.length()==0)
			{
				continue;
			}
			a=a.trim();
			System.out.println(a);
			if(a.startsWith("ID"))
			{
				a=a.substring(3);
				a=a.trim();
				if(valiID(a)==false)
					continue;
				int x=Integer.parseInt(a);
				//System.out.println(a);
				tempc.setId(a);
				tempc.setId1(x);
				continue;
			}
			else if(a.startsWith("name"))
			{
				a=a.substring(5);
				a=a.trim();
				Pattern pattern = Pattern.compile("[a-zA-Z ]{1,}");
				  Matcher matcher = pattern.matcher(a);
				  boolean b= matcher.matches();
				if(b)
					tempc.setName(a);
				//System.out.println(arr.get(i).getName());
				continue;
			}
			else if(a.startsWith("birthday"))
			{
				 
				a=a.substring(9); 
				a=a.trim();
				if(validate(a)==false)
					continue;
				tempc.setBirthday(a);
				Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
				Matcher matcher2 = pattern2.matcher(a);
				boolean b2= matcher2.matches();
				Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
				Matcher matcher3 = pattern3.matcher(a);
				boolean b3= matcher3.matches();
				a=a.replaceAll("-", "");
				a=a.replaceAll("/", "");
//				Pattern pattern = Pattern.compile("[0-9]{8}");
//				  Matcher matcher = pattern.matcher(a);
//				  boolean b= matcher.matches();
				  Pattern pattern1 = Pattern.compile("[0-9]{6}");
				  Matcher matcher1 = pattern1.matcher(a);
				  boolean b1= matcher1.matches();
				  if(b1)
				  {
					  a=a.substring(0,1)+"0"+a.substring(1,a.length());
					  a="0"+a.substring(0,a.length());
				  }
				  else if(b2)
				  {
					  a=a.substring(0,2)+"0"+a.substring(2,a.length());
				  }
				  else if(b3)
				  {
					  a="0"+a.substring(0,a.length());
				  }
				  a=a.substring(4,a.length())+a.substring(2,4)+a.substring(0,2);
				  tempc.setBirthday1(Integer.parseInt(a));
				//System.out.println(arr.get(i).getBirthday()+" "+arr.get(i).getBirthday1());
				continue;
			}
			else if(a.startsWith("address"))
			{
				a=a.substring(8);
				a=a.trim();
				tempc.setAddress(a);
				//System.out.println(arr.get(i).getAddress());
				continue;	
			}
			else if(a.startsWith("height"))
			{
				a=a.substring(7);
				a=a.trim();
				if(valiheight(a)==false)
					continue;
				tempc.setHeight(a);
				a=a.replaceAll("cm", "");
				tempc.setHeight1(Integer.parseInt(a));
				continue;
			}
			else if(a.startsWith("Spiderman"))
			{
				a=a.substring(17);
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					tempc.spiderman.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  tempc.spiderman1.add(temp2[j]);
				}
//				  for(int k=0;k<arr.get(i).spiderman.size();k++)
//				  System.out.println(arr.get(i).spiderman.get(k)+arr.get(i).spiderman1.get(k));				
				continue;
			}
			else if(a.startsWith("Ice"))
			{
				a=a.substring(18);
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					tempc.ice.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  tempc.ice1.add(temp2[j]);
				}
//				  for(int k=0;k<arr.get(i).ice.size();k++)
//				  System.out.println(arr.get(i).ice.get(k)+arr.get(i).ice1.get(k));				
				continue;
			}
			else if(a.startsWith("Canyon"))
			{
				a=a.substring(15);
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					tempc.canyon.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  tempc.canyon1.add(temp2[j]);
				}
//				  for(int k=0;k<arr.get(i).canyon.size();k++)
//				  System.out.println(arr.get(i).canyon.get(k)+arr.get(i).canyon1.get(k));				
			continue;
			}
			else if(a.startsWith("4D"))
			{
				a=a.substring(11);
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					tempc.theatre.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  tempc.theatre1.add(temp2[j]);
				}
//				  for(int k=0;k<arr.get(i).theatre.size();k++)
//				  System.out.println(arr.get(i).theatre.get(k)+arr.get(i).theatre1.get(k));				
				continue;
			}
			else if(a.startsWith("Flow"))
			{
				a=a.substring(11);
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					tempc.flow.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  tempc.flow1.add(temp2[j]);
				}
//				  for(int k=0;k<arr.get(i).flow.size();k++)
//				  System.out.println(arr.get(i).flow.get(k)+arr.get(i).flow1.get(k));				
				continue;
			}
			else if(a.startsWith("Carousel"))
			{
				a=a.substring(9);
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					tempc.carousel.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  tempc.carousel1.add(temp2[j]);
				}
//				  for(int k=0;k<arr.get(i).carousel.size();k++)
//				  System.out.println(arr.get(i).carousel.get(k)+arr.get(i).carousel1.get(k));				
				continue;
			}
			else
			{
				String temp =new String();
				temp=tempc.getAddress()+" "+a;
				a=s.nextLine(); 
				a=a.trim();
				temp=temp+" "+a;
				tempc.setAddress(temp);
				//System.out.println(arr.get(i).getAddress());
				continue;	
			}
			
			
		}
		flagh=0;
			if(tempc.getId().isEmpty()||tempc.getName().isEmpty()||tempc.getBirthday().isEmpty()){
				flagh=1;
			}
			if(flagh==0)
			{
			arr.add(tempc);
			count++;
			i++;
			}
			count=arr.size();
		System.out.println(count);
		}
	public void read(Scanner s) throws Exception
	{
		while(s.hasNext())
		{
			a=s.next();
			a=a.trim();
			if(a.equals("ID"))
			{
				a=s.nextLine();
				a=a.trim();
				if(valiID(a)==false)
					continue;
				int x=Integer.parseInt(a);
				//System.out.println(a);
				Card temp =new Card(a,x);
				arr.add(temp);
				System.out.println(arr.get(count).getId());
				count++;
				i++;
				continue;
			}
			else if(a.equals("name"))
			{
				a=s.nextLine();
				a=a.trim();
				Pattern pattern = Pattern.compile("[a-zA-Z ]{1,}");
				  Matcher matcher = pattern.matcher(a);
				  boolean b= matcher.matches();
				if(b)
				arr.get(i).setName(a);
				else
					arr.get(i).setName("wrong name");
				System.out.println(arr.get(i).getName());
				continue;
			}
			else if(a.equals("birthday"))
			{
				 
				a=s.nextLine(); 
				a=a.trim();
				if(validate(a)==false)
					continue;
				arr.get(i).setBirthday(a);
				  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
				  Matcher matcher2 = pattern2.matcher(a);
				  boolean b2= matcher2.matches();
				  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
				  Matcher matcher3 = pattern3.matcher(a);
				  boolean b3= matcher3.matches();
				a=a.replaceAll("-", "");
				a=a.replaceAll("/", "");
//				Pattern pattern = Pattern.compile("[0-9]{8}");
//				  Matcher matcher = pattern.matcher(a);
//				  boolean b= matcher.matches();
				  Pattern pattern1 = Pattern.compile("[0-9]{6}");
				  Matcher matcher1 = pattern1.matcher(a);
				  boolean b1= matcher1.matches();
				  if(b1)
				  {
					  a=a.substring(0,1)+"0"+a.substring(1,a.length());
					  a="0"+a.substring(0,a.length());
				  }
				  else if(b2)
				  {
					  a=a.substring(0,2)+"0"+a.substring(2,a.length());
				  }
				  else if(b3)
				  {
					  a="0"+a.substring(0,a.length());
				  }
				  a=a.substring(4,a.length())+a.substring(2,4)+a.substring(0,2);
				  arr.get(i).setBirthday1(Integer.parseInt(a));
				System.out.println(arr.get(i).getBirthday()+" "+arr.get(i).getBirthday1());
				continue;
			}
			else if(a.equals("address"))
			{
				a=s.nextLine();
				a=a.trim();
				arr.get(i).setAddress(a);
				System.out.println(arr.get(i).getAddress());
				continue;	
			}
			else if(a.equals("height"))
			{
				a=s.nextLine();
				a=a.trim();
				if(valiheight(a)==false)
					continue;
				arr.get(i).setHeight(a);
				a=a.replaceAll("cm", "");
				arr.get(i).setHeight1(Integer.parseInt(a));
				continue;
			}
			else if(a.equals("Spiderman"))
			{
				a=s.next();
				a=s.nextLine();
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					arr.get(i).spiderman.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  arr.get(i).spiderman1.add(temp2[j]);
				}
				  for(int k=0;k<arr.get(i).spiderman.size();k++)
				  System.out.println(arr.get(i).spiderman.get(k)+arr.get(i).spiderman1.get(k));				
				continue;
			}
			else if(a.equals("Ice"))
			{
				a=s.next();
				a=s.next();
				a=s.nextLine();
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					arr.get(i).ice.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  arr.get(i).ice1.add(temp2[j]);
				}
				  for(int k=0;k<arr.get(i).ice.size();k++)
				  System.out.println(arr.get(i).ice.get(k)+arr.get(i).ice1.get(k));				
				continue;
			}
			else if(a.equals("Canyon"))
			{
				a=s.next();
				a=s.nextLine();
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					arr.get(i).canyon.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  arr.get(i).canyon1.add(temp2[j]);
				}
				  for(int k=0;k<arr.get(i).canyon.size();k++)
				  System.out.println(arr.get(i).canyon.get(k)+arr.get(i).canyon1.get(k));				
				continue;
			}
			else if(a.equals("4D"))
			{
				a=s.next();
				a=s.nextLine();
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					arr.get(i).theatre.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  arr.get(i).theatre1.add(temp2[j]);
				}
				  for(int k=0;k<arr.get(i).theatre.size();k++)
				  System.out.println(arr.get(i).theatre.get(k)+arr.get(i).theatre1.get(k));				
				continue;
			}
			else if(a.equals("Flow"))
			{
				a=s.next();
				a=s.nextLine();
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					arr.get(i).flow.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  arr.get(i).flow1.add(temp2[j]);
				}
				  for(int k=0;k<arr.get(i).flow.size();k++)
				  System.out.println(arr.get(i).flow.get(k)+arr.get(i).flow1.get(k));				
				continue;
			}
			else if(a.equals("Carousel"))
			{
				a=s.nextLine();
				a=a.trim();
				String[] temp=a.split(" ");
				String[] temp1=new String[temp.length];
				int[] temp2=new int[temp.length];
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					temp1[j]=temp[j];
					if(validate(temp[j])==false)
						continue;
					arr.get(i).carousel.add(temp1[j]);
					  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
					  Matcher matcher2 = pattern2.matcher(temp[j]);
					  boolean b2= matcher2.matches();
					  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
					  Matcher matcher3 = pattern3.matcher(temp[j]);
					  boolean b3= matcher3.matches();
					temp[j]=temp[j].replaceAll("-", "");
					temp[j]=temp[j].replaceAll("/", "");
//					Pattern pattern = Pattern.compile("[0-9]{8}");
//					  Matcher matcher = pattern.matcher(temp[j]);
//					  boolean b= matcher.matches();
					  Pattern pattern1 = Pattern.compile("[0-9]{6}");
					  Matcher matcher1 = pattern1.matcher(temp[j]);
					  boolean b1= matcher1.matches();
					  if(b1)
					  {
						  temp[j]=temp[j].substring(0,1)+"0"+temp[j].substring(1,temp[j].length());
						  
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
						  
					  }
					  else if(b2)
					  {
						  temp[j]=temp[j].substring(0,2)+"0"+temp[j].substring(2,temp[j].length());
					  }
					  else if(b3)
					  {
						  temp[j]="0"+temp[j].substring(0,temp[j].length());
					  }
					  temp[j]=temp[j].substring(4,temp[j].length())+temp[j].substring(2,4)+temp[j].substring(0,2);
					  temp2[j]=Integer.parseInt(temp[j]);
					  arr.get(i).carousel1.add(temp2[j]);
				}
				  for(int k=0;k<arr.get(i).carousel.size();k++)
				  System.out.println(arr.get(i).carousel.get(k)+arr.get(i).carousel1.get(k));				
				continue;
			}
			else
			{
				String temp =new String();
				temp=arr.get(i).getAddress()+" "+a;
				a=s.nextLine(); 
				a=a.trim();
				temp=temp+" "+a;
				arr.get(i).setAddress(temp);
				System.out.println(arr.get(i).getAddress());
				continue;	
			}
			
			
		}
	}
		

}
