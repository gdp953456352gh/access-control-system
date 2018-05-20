package TPSP;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import TPSP.attraction;
import TPSP.Cardfile;

public class instructionFile {
	attraction[] att =new attraction[6];
	String a=new String();//a is the temp sc;
	String b2=new String();
	String[] temp;
	String id =new String();
	String name =new String();
	String birthday =new String();
	String address =new String();
	String height =new String();
	String spiderman =new String();
	String ice =new String();
	String canyon =new String();
	String theatre =new String();
	String flow =new String();
	String carousel =new String();
	int in=0;
	int k=0;
	int[] namearr ;
	public instructionFile()
	{
		att[0] =new attraction("Spiderman Escape",8,1000,100);
		att[1] =new attraction("Ice Age Adventure",8,200,0);
		att[2] =new attraction("Canyon Blaster",8,1000,120);
		att[3] =new attraction("4D Theatre",0,1000,0);
		att[4] =new attraction("Flow Rider",0,1000,100);
		att[5] =new attraction("Carousel",0,200,0);
    }
	public String format(String a){
		  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
		  Matcher matcher2 = pattern2.matcher(a);
		  boolean b4= matcher2.matches();
		  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
		  Matcher matcher3 = pattern3.matcher(a);
		  boolean b3= matcher3.matches();
		  Pattern pattern = Pattern.compile("[0-9]{2}[/-][0-9]{2}[/-][0-9]{4}");
		  Matcher matcher = pattern.matcher(a);
		  boolean b= matcher.matches();
		  Pattern pattern1 = Pattern.compile("[0-9][/-][0-9][/-][0-9]{4}");
		  Matcher matcher1 = pattern1.matcher(a);
		  boolean b1= matcher1.matches();
		  a=a.replaceAll("-", "/");
		  if(b)
		  {
			  return a;
		  }
		  if(b1)
		  {
			  a=a.substring(0,2)+"0"+a.substring(2,a.length());
			  a="0"+a.substring(0,a.length());
			  return a;
		  }
		  if(b3)
		  {
			  a="0"+a.substring(0,a.length());
			  return a;
		  }
		  if(b4)
		  {
			  a=a.substring(0,3)+"0"+a.substring(3,a.length());
			  return a;
		  }
		return null;
	}
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
	public void read(Cardfile c,Scanner s,String file1) throws Exception
	{
		File fw = new File(file1);
		PrintWriter out = new PrintWriter(fw);
		
		while(s.hasNext())
		{
			a=s.next();
			if(a.equals("add"))
			{
				in=-1;
				a=s.nextLine();
				a=a.trim();
				temp=a.split(";");
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=temp[j].trim();
					id=temp[j].substring(0, 2);
					name=temp[j].substring(0, 4);
					birthday=temp[j].substring(0, 4);
					address=temp[j].substring(0, 4);
					height=temp[j].substring(0, 4);
					spiderman=temp[j].substring(0, 4);
					ice=temp[j].substring(0, 3);
					canyon=temp[j].substring(0, 4);
					theatre=temp[j].substring(0, 2);
					flow=temp[j].substring(0, 4);
					carousel=temp[j].substring(0, 4);
					if(id.equals("ID"))
					{
						b2=temp[j].substring(2,temp[j].length());
						b2=b2.trim();
						if(valiID(b2)==false)
							break;
						for(k=0;k<c.count;k++)
						{
							if(b2.equals(c.arr.get(k).getId()))
							{
								in=k;
								break;
							}
						}
						if(k==c.count)
						{
							c.count=c.arr.size()+1;
							in=c.count-1;
							int x=Integer.parseInt(b2);
							//System.out.println(a);
							Card temp1 =new Card(b2,x);
							c.arr.add(temp1);
						}
						System.out.println(in+""+c.arr.size());
					}
					else if(name.equals("name"))
					{
						b2=temp[j].substring(4,temp[j].length());
						b2=b2.trim();
						Pattern pattern = Pattern.compile("[a-zA-Z ]{1,}");
						  Matcher matcher = pattern.matcher(b2);
						  boolean b= matcher.matches();
						if(b)
						c.arr.get(in).setName(b2);
					}
					else if(birthday.equals("birt"))
					{
						b2=temp[j].substring(8,temp[j].length());
						b2=b2.trim();
						if(validate(b2)==false)
							continue;
						c.arr.get(in).setBirthday(b2);
						  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
						  Matcher matcher2 = pattern2.matcher(b2);
						  boolean b4= matcher2.matches();
						  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
						  Matcher matcher3 = pattern3.matcher(b2);
						  boolean b3= matcher3.matches();
						  b2=b2.replaceAll("-", "");
						  b2=b2.replaceAll("/", "");
//						Pattern pattern = Pattern.compile("[0-9]{8}");
//						  Matcher matcher = pattern.matcher(a);
//						  boolean b= matcher.matches();
						  Pattern pattern1 = Pattern.compile("[0-9]{6}");
						  Matcher matcher1 = pattern1.matcher(b2);
						  boolean b1= matcher1.matches();
						  if(b1)
						  {
							  b2=b2.substring(0,1)+"0"+b2.substring(1,b2.length());
							  b2="0"+b2.substring(0,b2.length());
						  }
						  else if(b4)
						  {
							  b2=b2.substring(0,2)+"0"+b2.substring(2,b2.length());
						  }
						  else if(b3)
						  {
							  b2="0"+b2.substring(0,b2.length());
						  }
						  b2=b2.substring(4,b2.length())+b2.substring(2,4)+b2.substring(0,2);
						  c.arr.get(in).setBirthday1(Integer.parseInt(b2));
						System.out.println(c.arr.get(in).getBirthday()+" "+c.arr.get(in).getBirthday1()+in);
					}
					else if(address.equals("addr"))
					{
						b2=temp[j].substring(7,temp[j].length());
						b2=b2.trim();
						c.arr.get(in).setAddress(b2);
					}
					else if(height.equals("heig"))
					{
						b2=temp[j].substring(6,temp[j].length());
						b2=b2.trim();
						if(valiheight(b2)==false)
							continue;
						c.arr.get(in).setHeight(b2);
						b2=b2.replaceAll("cm", "");
						c.arr.get(in).setHeight1(Integer.parseInt(b2));
					}
					else if(spiderman.equals("Spid"))
					{
						b2=temp[j].substring(16,temp[j].length());
						b2=b2.trim();
						String[] tempp=b2.split(" ");
						String[] temp1=new String[tempp.length];
						int[] temp2=new int[tempp.length];
						for(int k=0;k<tempp.length;k++)
						{
							tempp[k]=tempp[k].trim();
							temp1[k]=tempp[k];
							if(validate(tempp[k])==false)
								continue;
							c.arr.get(in).spiderman.add(temp1[k]);
							  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
							  Matcher matcher2 = pattern2.matcher(tempp[k]);
							  boolean b4= matcher2.matches();
							  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
							  Matcher matcher3 = pattern3.matcher(tempp[k]);
							  boolean b3= matcher3.matches();
							tempp[k]=tempp[k].replaceAll("-", "");
							tempp[k]=tempp[k].replaceAll("/", "");
//							Pattern pattern = Pattern.compile("[0-9]{8}");
//							  Matcher matcher = pattern.matcher(temp[j]);
//							  boolean b= matcher.matches();
							  Pattern pattern1 = Pattern.compile("[0-9]{6}");
							  Matcher matcher1 = pattern1.matcher(tempp[k]);
							  boolean b1= matcher1.matches();
							  if(b1)
							  {
								  tempp[k]=tempp[k].substring(0,1)+"0"+tempp[k].substring(1,tempp[k].length());
								  
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
								  
							  }
							  else if(b4)
							  {
								  tempp[k]=tempp[k].substring(0,2)+"0"+tempp[k].substring(2,tempp[k].length());
							  }
							  else if(b3)
							  {
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
							  }
							  System.out.println(tempp[k]);		
							  tempp[k]=tempp[k].substring(4,tempp[k].length())+tempp[k].substring(2,4)+tempp[k].substring(0,2);
							  temp2[k]=Integer.parseInt(tempp[k]);
							  c.arr.get(in).spiderman1.add(temp2[k]);
						}
						  for(int k=0;k<c.arr.get(in).spiderman.size();k++)
						  System.out.println(c.arr.get(in).spiderman.get(k)+c.arr.get(in).spiderman1.get(k));				
					}
					else if(ice.equals("Ice"))
					{
						b2=temp[j].substring(17,temp[j].length());
						b2=b2.trim();
						String[] tempp=b2.split(" ");
						String[] temp1=new String[tempp.length];
						int[] temp2=new int[tempp.length];
						for(int k=0;k<tempp.length;k++)
						{
							tempp[k]=tempp[k].trim();
							temp1[k]=tempp[k];
							if(validate(tempp[k])==false)
								continue;
							c.arr.get(in).ice.add(temp1[k]);
							  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
							  Matcher matcher2 = pattern2.matcher(tempp[k]);
							  boolean b4= matcher2.matches();
							  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
							  Matcher matcher3 = pattern3.matcher(tempp[k]);
							  boolean b3= matcher3.matches();
							tempp[k]=tempp[k].replaceAll("-", "");
							tempp[k]=tempp[k].replaceAll("/", "");
//							Pattern pattern = Pattern.compile("[0-9]{8}");
//							  Matcher matcher = pattern.matcher(temp[j]);
//							  boolean b= matcher.matches();
							  Pattern pattern1 = Pattern.compile("[0-9]{6}");
							  Matcher matcher1 = pattern1.matcher(tempp[k]);
							  boolean b1= matcher1.matches();
							  if(b1)
							  {
								  tempp[k]=tempp[k].substring(0,1)+"0"+tempp[k].substring(1,tempp[k].length());
								  
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
								  
							  }
							  else if(b4)
							  {
								  tempp[k]=tempp[k].substring(0,2)+"0"+tempp[k].substring(2,tempp[k].length());
							  }
							  else if(b3)
							  {
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
							  }
							  System.out.println(tempp[k]);		
							  tempp[k]=tempp[k].substring(4,tempp[k].length())+tempp[k].substring(2,4)+tempp[k].substring(0,2);
							  temp2[k]=Integer.parseInt(tempp[k]);
							  c.arr.get(in).ice1.add(temp2[k]);
						}
						  for(int k=0;k<c.arr.get(in).ice.size();k++)
						  System.out.println(c.arr.get(in).ice.get(k)+c.arr.get(in).ice1.get(k));				
					}
					else if(canyon.equals("Cany"))
					{
						b2=temp[j].substring(14,temp[j].length());
						b2=b2.trim();
						String[] tempp=b2.split(" ");
						String[] temp1=new String[tempp.length];
						int[] temp2=new int[tempp.length];
						for(int k=0;k<tempp.length;k++)
						{
							tempp[k]=tempp[k].trim();
							temp1[k]=tempp[k];
							if(validate(tempp[k])==false)
								continue;
							c.arr.get(in).canyon.add(temp1[k]);
							  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
							  Matcher matcher2 = pattern2.matcher(tempp[k]);
							  boolean b4= matcher2.matches();
							  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
							  Matcher matcher3 = pattern3.matcher(tempp[k]);
							  boolean b3= matcher3.matches();
							tempp[k]=tempp[k].replaceAll("-", "");
							tempp[k]=tempp[k].replaceAll("/", "");
//							Pattern pattern = Pattern.compile("[0-9]{8}");
//							  Matcher matcher = pattern.matcher(temp[j]);
//							  boolean b= matcher.matches();
							  Pattern pattern1 = Pattern.compile("[0-9]{6}");
							  Matcher matcher1 = pattern1.matcher(tempp[k]);
							  boolean b1= matcher1.matches();
							  if(b1)
							  {
								  tempp[k]=tempp[k].substring(0,1)+"0"+tempp[k].substring(1,tempp[k].length());
								  
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
								  
							  }
							  else if(b4)
							  {
								  tempp[k]=tempp[k].substring(0,2)+"0"+tempp[k].substring(2,tempp[k].length());
							  }
							  else if(b3)
							  {
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
							  }
							  System.out.println(tempp[k]);		
							  tempp[k]=tempp[k].substring(4,tempp[k].length())+tempp[k].substring(2,4)+tempp[k].substring(0,2);
							  temp2[k]=Integer.parseInt(tempp[k]);
							  c.arr.get(in).canyon1.add(temp2[k]);
						}
						  for(int k=0;k<c.arr.get(in).canyon.size();k++)
						  System.out.println(c.arr.get(in).canyon.get(k)+c.arr.get(in).canyon1.get(k));				
					}
					else if(theatre.equals("4D"))
					{
						b2=temp[j].substring(10,temp[j].length());
						b2=b2.trim();
						String[] tempp=b2.split(" ");
						String[] temp1=new String[tempp.length];
						int[] temp2=new int[tempp.length];
						for(int k=0;k<tempp.length;k++)
						{
							tempp[k]=tempp[k].trim();
							temp1[k]=tempp[k];
							if(validate(tempp[k])==false)
								continue;
							c.arr.get(in).theatre.add(temp1[k]);
							  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
							  Matcher matcher2 = pattern2.matcher(tempp[k]);
							  boolean b4= matcher2.matches();
							  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
							  Matcher matcher3 = pattern3.matcher(tempp[k]);
							  boolean b3= matcher3.matches();
							tempp[k]=tempp[k].replaceAll("-", "");
							tempp[k]=tempp[k].replaceAll("/", "");
//							Pattern pattern = Pattern.compile("[0-9]{8}");
//							  Matcher matcher = pattern.matcher(temp[j]);
//							  boolean b= matcher.matches();
							  Pattern pattern1 = Pattern.compile("[0-9]{6}");
							  Matcher matcher1 = pattern1.matcher(tempp[k]);
							  boolean b1= matcher1.matches();
							  if(b1)
							  {
								  tempp[k]=tempp[k].substring(0,1)+"0"+tempp[k].substring(1,tempp[k].length());
								  
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
								  
							  }
							  else if(b4)
							  {
								  tempp[k]=tempp[k].substring(0,2)+"0"+tempp[k].substring(2,tempp[k].length());
							  }
							  else if(b3)
							  {
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
							  }
							  System.out.println(tempp[k]);		
							  tempp[k]=tempp[k].substring(4,tempp[k].length())+tempp[k].substring(2,4)+tempp[k].substring(0,2);
							  temp2[k]=Integer.parseInt(tempp[k]);
							  c.arr.get(in).theatre1.add(temp2[k]);
						}
						  for(int k=0;k<c.arr.get(in).theatre.size();k++)
						  System.out.println(c.arr.get(in).theatre.get(k)+c.arr.get(in).theatre1.get(k));				
					}
					else if(flow.equals("Flow"))
					{
						b2=temp[j].substring(10,temp[j].length());
						b2=b2.trim();
						String[] tempp=b2.split(" ");
						String[] temp1=new String[tempp.length];
						int[] temp2=new int[tempp.length];
						for(int k=0;k<tempp.length;k++)
						{
							tempp[k]=tempp[k].trim();
							temp1[k]=tempp[k];
							if(validate(tempp[k])==false)
								continue;
							c.arr.get(in).flow.add(temp1[k]);
							  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
							  Matcher matcher2 = pattern2.matcher(tempp[k]);
							  boolean b4= matcher2.matches();
							  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
							  Matcher matcher3 = pattern3.matcher(tempp[k]);
							  boolean b3= matcher3.matches();
							tempp[k]=tempp[k].replaceAll("-", "");
							tempp[k]=tempp[k].replaceAll("/", "");
//							Pattern pattern = Pattern.compile("[0-9]{8}");
//							  Matcher matcher = pattern.matcher(temp[j]);
//							  boolean b= matcher.matches();
							  Pattern pattern1 = Pattern.compile("[0-9]{6}");
							  Matcher matcher1 = pattern1.matcher(tempp[k]);
							  boolean b1= matcher1.matches();
							  if(b1)
							  {
								  tempp[k]=tempp[k].substring(0,1)+"0"+tempp[k].substring(1,tempp[k].length());
								  
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
								  
							  }
							  else if(b4)
							  {
								  tempp[k]=tempp[k].substring(0,2)+"0"+tempp[k].substring(2,tempp[k].length());
							  }
							  else if(b3)
							  {
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
							  }
							  System.out.println(tempp[k]);		
							  tempp[k]=tempp[k].substring(4,tempp[k].length())+tempp[k].substring(2,4)+tempp[k].substring(0,2);
							  temp2[k]=Integer.parseInt(tempp[k]);
							  c.arr.get(in).flow1.add(temp2[k]);
						}
						  for(int k=0;k<c.arr.get(in).flow.size();k++)
						  System.out.println(c.arr.get(in).flow.get(k)+c.arr.get(in).flow1.get(k));				
					}
					else if(carousel.equals("Caro"))
					{
						b2=temp[j].substring(8,temp[j].length());
						b2=b2.trim();
						String[] tempp=b2.split(" ");
						String[] temp1=new String[tempp.length];
						int[] temp2=new int[tempp.length];
						for(int k=0;k<tempp.length;k++)
						{
							tempp[k]=tempp[k].trim();
							temp1[k]=tempp[k];
							if(validate(tempp[k])==false)
								continue;
							c.arr.get(in).carousel.add(temp1[k]);
							  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
							  Matcher matcher2 = pattern2.matcher(tempp[k]);
							  boolean b4= matcher2.matches();
							  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
							  Matcher matcher3 = pattern3.matcher(tempp[k]);
							  boolean b3= matcher3.matches();
							tempp[k]=tempp[k].replaceAll("-", "");
							tempp[k]=tempp[k].replaceAll("/", "");
//							Pattern pattern = Pattern.compile("[0-9]{8}");
//							  Matcher matcher = pattern.matcher(temp[j]);
//							  boolean b= matcher.matches();
							  Pattern pattern1 = Pattern.compile("[0-9]{6}");
							  Matcher matcher1 = pattern1.matcher(tempp[k]);
							  boolean b1= matcher1.matches();
							  if(b1)
							  {
								  tempp[k]=tempp[k].substring(0,1)+"0"+tempp[k].substring(1,tempp[k].length());
								  
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
								  
							  }
							  else if(b4)
							  {
								  tempp[k]=tempp[k].substring(0,2)+"0"+tempp[k].substring(2,tempp[k].length());
							  }
							  else if(b3)
							  {
								  tempp[k]="0"+tempp[k].substring(0,tempp[k].length());
							  }
							  System.out.println(tempp[k]);		
							  tempp[k]=tempp[k].substring(4,tempp[k].length())+tempp[k].substring(2,4)+tempp[k].substring(0,2);
							  temp2[k]=Integer.parseInt(tempp[k]);
							  c.arr.get(in).carousel1.add(temp2[k]);
						}
						  for(int k=0;k<c.arr.get(in).carousel.size();k++)
						  System.out.println(c.arr.get(in).carousel.get(k)+c.arr.get(in).carousel1.get(k));				
					}
					else
					{
						continue;
					}
				}
				if(in!=-1)
				{
				if(c.arr.get(in).getId().isEmpty()||c.arr.get(in).getName().isEmpty()||c.arr.get(in).getBirthday().isEmpty())
				{
					c.arr.remove(in);
					c.count=c.arr.size();
				}
			    }
				continue;
			}
			else if(a.equals("delete"))
			{
					a=s.nextLine();
					a=a.trim();
					temp=a.split(" ");
					temp[1]=temp[1].trim();
					for(k=0;k<c.count;k++)
					{
						if(temp[1].equals(c.arr.get(k).getId()))
						{
							in=k;
							c.arr.remove(k);
							break;
						}
					}
					if(k==c.count)
					{
						continue;
					}
					c.count=c.arr.size();;
					continue;		
			}
			else if(a.equals("request"))
			{
				String requ=a;
				a=s.nextLine();
				requ = requ+a;
				a=a.trim();
				temp=a.split(";");
					temp[0]=temp[0].trim();
					id=temp[0].substring(0, 2);
					if(id.equals("ID"))
					{
						b2=temp[0].substring(2,temp[0].length());
						b2=b2.trim();
						for(k=0;k<c.count;k++)
						{
							if(b2.equals(c.arr.get(k).getId()))
							{
								in=k;
								break;
							}
						}
						if(k==c.count)
						{
							continue;
						}
				    }
					temp[1]=temp[1].trim();
					temp[2]=temp[2].trim();
					if(validate(temp[2])==false)
						continue;
					for(k=0;k<6;k++)
					{
						if(temp[1].equals(att[k].getName()))
						{
							temp[2]=temp[2].trim();
							String tem=new String();
							tem=temp[2];
							  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
							  Matcher matcher2 = pattern2.matcher(temp[2]);
							  boolean b4= matcher2.matches();
							  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
							  Matcher matcher3 = pattern3.matcher(temp[2]);
							  boolean b3= matcher3.matches();
							temp[2]=temp[2].replaceAll("-", "");
							temp[2]=temp[2].replaceAll("/", "");
//							Pattern pattern = Pattern.compile("[0-9]{8}");
//							  Matcher matcher = pattern.matcher(temp[2]);
//							  boolean b= matcher.matches();
							  Pattern pattern1 = Pattern.compile("[0-9]{6}");
							  Matcher matcher1 = pattern1.matcher(temp[2]);
							  boolean b1= matcher1.matches();
							  if(b1)
							  {
								  temp[2]=temp[2].substring(0,1)+"0"+temp[2].substring(1,temp[2].length());
								  
								  temp[2]="0"+temp[2].substring(0,temp[2].length());
								  
							  }
							  else if(b4)
							  {
								  temp[2]=temp[2].substring(0,2)+"0"+temp[2].substring(2,temp[2].length());
							  }
							  else if(b3)
							  {
								  temp[2]="0"+temp[2].substring(0,temp[2].length());
							  }
							  temp[2]=temp[2].substring(4,temp[2].length())+temp[2].substring(2,4)+temp[2].substring(0,2);
							  int temp2 ,age;
							temp2=Integer.parseInt(temp[2]);
							age=temp2-c.arr.get(in).getBirthday1();
							if(c.arr.get(in).getHeight1()<=att[k].getMaxheight()&&
									c.arr.get(in).getHeight1()>=att[k].getMinheight()
							&&age>=((att[k].getAge())*10000))
							{
								if(k==0)
								{
									c.arr.get(in).spiderman.add(tem);
									c.arr.get(in).spiderman1.add(temp2);
								}
								else if(k==1)
								{
									c.arr.get(in).ice.add(tem);
									c.arr.get(in).ice1.add(temp2);
								}
								else if(k==2)
								{
									c.arr.get(in).canyon.add(tem);
									c.arr.get(in).canyon1.add(temp2);
								}
								else if(k==3)
								{
									c.arr.get(in).theatre.add(tem);
									c.arr.get(in).theatre1.add(temp2);
								}
								else if(k==4)
								{
									c.arr.get(in).flow.add(tem);
									c.arr.get(in).flow1.add(temp2);
								}
								else if(k==5)
								{
									c.arr.get(in).carousel.add(tem);
									c.arr.get(in).carousel1.add(temp2);
								}
								else
								{
									
								}
								//文件输出 日期修改
								System.out.println("inputs written into file successfully!");
							}
							else
							{
								out.println("------ "+requ+" ------");
								out.println("Request denied: "+att[k].getName()+" "+format(tem));
								out.print("Reasons: ");
								int flag1=0;
								if(c.arr.get(in).getHeight1()>att[k].getMaxheight()||
										c.arr.get(in).getHeight1()<att[k].getMinheight()
										&&c.arr.get(in).getHeight1()!=0)
								{
									out.println("height requirement not met");
									flag1=1;
								}
								if(c.arr.get(in).getHeight1()==0)
								{
									out.println("height information missing");
									flag1=1;
								}
								if(age<=((att[k].getAge())*10000))
								{
									if(flag1==1)
									out.println("         age requirement not met");
									else
									out.println("age requirement not met");
								}
								System.out.println("inputs written into file successfully!");
								//Request denied
								out.println("-------------------------------------------	");
							}
						}
					}
					
			}
			else if(a.equals("query"))
			{
				String requ=a;
				a=s.nextLine();
				requ = requ+a;
				a=a.trim();
				out.println("------ "+requ+" ------");
				if(a.charAt(0)!='n')
				{
					temp=a.split(";");
					String[] temp1=new String[temp.length];
					int[] temp2=new int[temp.length];
					for(int j=0;j<2;j++)
					{
						temp[j]=temp[j].trim();
						temp1[j]=temp[j];
						  Pattern pattern2 = Pattern.compile("[0-9]{2}[/-][0-9][/-][0-9]{4}");
						  Matcher matcher2 = pattern2.matcher(temp[j]);
						  boolean b2= matcher2.matches();
						  Pattern pattern3 = Pattern.compile("[0-9][/-][0-9]{2}[/-][0-9]{4}");
						  Matcher matcher3 = pattern3.matcher(temp[j]);
						  boolean b3= matcher3.matches();
						temp[j]=temp[j].replaceAll("-", "");
						temp[j]=temp[j].replaceAll("/", "");
//						Pattern pattern = Pattern.compile("[0-9]{8}");
//						  Matcher matcher = pattern.matcher(temp[j]);
//						  boolean b= matcher.matches();
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
					}
					temp[2]=temp[2].trim();
					id=temp[2].substring(0, 2);
					if(id.equals("ID"))
					{
						b2=temp[2].substring(2,temp[2].length());
						b2=b2.trim();
						for(k=0;k<c.count;k++)
						{
							if(b2.equals(c.arr.get(k).getId()))
							{
								in=k;
								break;
							}
						}
						if(k==c.count)
						{
							continue;
						}
						int [] times =new int [6];
						int [] times1 =new int [6];
						times[0]=0;
						times[1]=0;
						times[2]=0;
						times[3]=0;
						times[4]=0;
						times[5]=0;
						for(int z=0;z<c.arr.get(k).spiderman1.size();z++)
						{
							if(c.arr.get(k).spiderman1.get(z)>=temp2[0]&&
									c.arr.get(k).spiderman1.get(z)<=temp2[1])
							{
								times[0]++;
							}
						}
						for(int z=0;z<c.arr.get(k).ice1.size();z++)
						{
							if(c.arr.get(k).ice1.get(z)>=temp2[0]&&
									c.arr.get(k).ice1.get(z)<=temp2[1])
							{
								times[1]++;
							}
						}
						for(int z=0;z<c.arr.get(k).canyon1.size();z++)
						{
							if(c.arr.get(k).canyon1.get(z)>=temp2[0]&&
									c.arr.get(k).canyon1.get(z)<=temp2[1])
							{
								times[2]++;
							}
						}
						for(int z=0;z<c.arr.get(k).theatre1.size();z++)
						{
							if(c.arr.get(k).theatre1.get(z)>=temp2[0]&&
									c.arr.get(k).theatre1.get(z)<=temp2[1])
							{
								times[3]++;
							}
						}
						for(int z=0;z<c.arr.get(k).flow1.size();z++)
						{
							if(c.arr.get(k).flow1.get(z)>=temp2[0]&&
									c.arr.get(k).flow1.get(z)<=temp2[1])
							{
								times[4]++;
							}	
						}
						for(int z=0;z<c.arr.get(k).carousel1.size();z++)
						{
							if(c.arr.get(k).carousel1.get(z)>=temp2[0]&&
									c.arr.get(k).carousel1.get(z)<=temp2[1])
							{
								times[5]++;
							}
						}
						int total =times[0]+times[1]+times[2]+times[3]+times[4]+times[5];
						//排序 排出频率最大的 输出
						out.println("Total visits: "+total);
						times1=times;
							Arrays.sort(times);
							int flagg=0;
						for(int x=0;x<6;x++)
						{
							if(times[5]==0)
								break;
							if(times[x]==times[5])
							{
								flagg++;
								out.println("Most-visited: "+att[x].getName()+" "+times[5]);
							}
						}
						for(int x=0;x<6;x++)
						{
							if(times[5-flagg]==0)
								break;
							if(times[x]==times[5-flagg])
							{
								out.println("2nd-most-visited: "+att[x].getName()+" "+times[5-flagg]);
							}
						}
						
				    }
					else if(id.equals("ag"))
					{
						double popu=0;
						int sym=0;
						int[] flag =new int [c.count];
						for(k=0;k<c.count;k++)
						{
							sym=0;
							for(int z=0;z<c.arr.get(k).spiderman1.size();z++)
							{
								if(c.arr.get(k).spiderman1.get(z)>=temp2[0]&&
										c.arr.get(k).spiderman1.get(z)<=temp2[1])
								{
									sym=1;
								}
							}
							for(int z=0;z<c.arr.get(k).ice1.size();z++)
							{
								if(c.arr.get(k).ice1.get(z)>=temp2[0]&&
										c.arr.get(k).ice1.get(z)<=temp2[1])
								{
									sym=1;
								}
							}
							for(int z=0;z<c.arr.get(k).canyon1.size();z++)
							{
								if(c.arr.get(k).canyon1.get(z)>=temp2[0]&&
										c.arr.get(k).canyon1.get(z)<=temp2[1])
								{
									sym=1;
								}
							}
							for(int z=0;z<c.arr.get(k).theatre1.size();z++)
							{
								if(c.arr.get(k).theatre1.get(z)>=temp2[0]&&
										c.arr.get(k).theatre1.get(z)<=temp2[1])
								{
									sym=1;
								}
							}
							for(int z=0;z<c.arr.get(k).flow1.size();z++)
							{
								if(c.arr.get(k).flow1.get(z)>=temp2[0]&&
										c.arr.get(k).flow1.get(z)<=temp2[1])
								{
									sym=1;
								}	
							}
							for(int z=0;z<c.arr.get(k).carousel1.size();z++)
							{
								if(c.arr.get(k).carousel1.get(z)>=temp2[0]&&
										c.arr.get(k).carousel1.get(z)<=temp2[1])
								{
									sym=1;
								}
							}
							int age=temp2[0]-c.arr.get(k).getBirthday1();
							if(sym==1)
							{
								popu++;
								//算年龄。划分年龄段
								if(age<80000)
									flag[k]=1;
								else if(age>=80000&&age<180000)
									flag[k]=2;
								else if(age>=180000&&age<650000)
									flag[k]=3;
								else 
									flag[k]=4;
							}
							else
							{
								flag[k]=0;
							}
						}
						int[] ages =new int[4];
						for(int x=0;x<4;x++)
						{
							ages[x]=0;
						}
						for(int x=0;x<c.count;x++)
						{
							if(flag[x]==1)
							{
								ages[0]++;
							}
							else if(flag[x]==2)
							{
								ages[1]++;
							}
							else if(flag[x]==3)
							{
								ages[2]++;
							}
							else if(flag[x]==4)
							{
								ages[3]++;
							}
							else
								continue;
						}
						out.println("Population size: "+popu);
						out.println("Age profile");
						out.println("Below 8: "+(ages[0]*100)/popu+"%");
						out.println("Over 8 and below 18: "+(ages[1]*100)/popu+"%");
						out.println("Over 18 and below 65: "+(ages[2]*100)/popu+"%");
						out.println("Over 65: "+(ages[3]*100)/popu+"%");
					}
				}
				else//第二种query
				{
					a=a.trim();
					a=a.substring(4,a.length());
					a=a.trim();
					int sym=0;
					for(k=0;k<c.count;k++)
					{
						if(a.equals(c.arr.get(k).getName()))
						{
							sym++;
						}
					}
					namearr=new int[sym];
					int j=0,z,y;
					for(k=0;k<c.count;k++)
					{
						if(a.equals(c.arr.get(k).getName()))
						{
							namearr[j]=c.arr.get(k).getId1();
							//排序 输出
							j++;
						}
					}
					for(z=0;z<namearr.length;z++)
					{
						for(y=z+1;y<namearr.length;y++)
						{
							if(namearr[z]>namearr[y])
							{
							int temp;
							temp=namearr[z];
							namearr[z]=namearr[y];
							namearr[y]=temp;								
							}
						}
					}	
					for(z=0;z<namearr.length;z++)
					{
						for(k=0;k<c.count;k++)
					   {
							if(c.arr.get(k).getId1()==namearr[z])
							{
								c.arr.get(k).sortdate();
								out.println("ID "+c.arr.get(k).getId());
								if(c.arr.get(k).spiderman.size()>0)
								{
									out.print("Spiderman Escape");
									for(int p=0;p<c.arr.get(k).spiderman.size();p++)
									{
										out.print(" "+format(c.arr.get(k).spiderman.get(p)));
									}
									out.println();		
								}
								if(c.arr.get(k).ice.size()>0)
								{
									out.print("Ice Age Adventure");
									for(int p=0;p<c.arr.get(k).ice.size();p++)
									{
										out.print(" "+format(c.arr.get(k).ice.get(p)));
									}
									out.println();		
								}
								if(c.arr.get(k).canyon.size()>0)
								{
									out.print("Canyon Blaster");
									for(int p=0;p<c.arr.get(k).canyon.size();p++)
									{
										out.print(" "+format(c.arr.get(k).canyon.get(p)));
									}
									out.println();		
								}
								if(c.arr.get(k).theatre.size()>0)
								{
									out.print("4D Theatre");
									for(int p=0;p<c.arr.get(k).theatre.size();p++)
									{
										out.print(" "+format(c.arr.get(k).theatre.get(p)));
									}
									out.println();		
								}
								if(c.arr.get(k).flow.size()>0)
								{
									out.print("Flow Rider");
									for(int p=0;p<c.arr.get(k).flow.size();p++)
									{
										out.print(" "+format(c.arr.get(k).flow.get(p)));
									}
									out.println();		
								}
								if(c.arr.get(k).carousel.size()>0)
								{
									out.print("carousel");
									for(int p=0;p<c.arr.get(k).carousel.size();p++)
									{
										out.print(" "+format(c.arr.get(k).carousel.get(p)));
									}
									out.println();		
								}
								out.println();	
							}
					   }
					}

					//排序 输出
				}
				out.println("-------------------------------------------	");
			}
			
		}
		out.close();
	}
	

}
