package TPSP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class output {
	File fw ;

	
	public output(String file1) {
		// TODO Auto-generated constructor stub
		 fw = new File(file1);
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
	public boolean valiaddress(String a)
	{
		  Pattern pattern = Pattern.compile("[0-9]{4}");
		  Matcher matcher = pattern.matcher(a);
		  boolean b= matcher.matches();
		if(b)
			return true;
		else 
			return false;
	}
	public void outresult(Cardfile c) throws FileNotFoundException{
			PrintWriter out = new PrintWriter(fw);
			for(int i=0;i<c.count;i++)
			{
//				if(c.arr.get(i).getId().isEmpty()||c.arr.get(i).getName().isEmpty()||c.arr.get(i).getBirthday().isEmpty())
//					continue;
				c.arr.get(i).sortdate();
				if(!c.arr.get(i).getId().isEmpty())	
					out.println("ID "+c.arr.get(i).getId());
				if(!c.arr.get(i).getName().isEmpty())	
					out.println("name "+c.arr.get(i).getName());
				if(!c.arr.get(i).getBirthday().isEmpty())	
					out.println("birthday "+format(c.arr.get(i).getBirthday()));
				if(!c.arr.get(i).getHeight().isEmpty())	
					out.println("height "+c.arr.get(i).getHeight());
				if(!c.arr.get(i).getAddress().isEmpty()){
					String temp= c.arr.get(i).getAddress();
					temp=temp.trim();
					temp=temp.substring(temp.length()-4);
					if(valiaddress(temp))
					out.println("address "+c.arr.get(i).getAddress());
				}

				if(!(c.arr.get(i).spiderman.size()==0))
				{
					out.print("Spiderman Escape ");
					for(int j=0;j<c.arr.get(i).spiderman.size();j++)
					{
						out.print(format(c.arr.get(i).spiderman.get(j))+" ");
					}
					out.println();
				}
				if(!(c.arr.get(i).ice.size()==0))
				{
					out.print("Ice Age Adventure ");
					for(int j=0;j<c.arr.get(i).ice.size();j++)
					{
						out.print(format(c.arr.get(i).ice.get(j))+" ");
					}
					out.println();
				}
				if(!(c.arr.get(i).canyon.size()==0))
				{
					out.print("Canyon Blaster ");
					for(int j=0;j<c.arr.get(i).canyon.size();j++)
					{
						out.print(format(c.arr.get(i).canyon.get(j))+" ");
					}
					out.println();
				}
				if(!(c.arr.get(i).theatre.size()==0))
				{
					out.print("4D Theatre ");
					for(int j=0;j<c.arr.get(i).theatre.size();j++)
					{
						out.print(format(c.arr.get(i).theatre.get(j))+" ");
					}
					out.println();
				}
				if(!(c.arr.get(i).flow.size()==0))
				{
					out.print("Flow Rider ");
					for(int j=0;j<c.arr.get(i).flow.size();j++)
					{
						out.print(format(c.arr.get(i).flow.get(j))+" ");
					}
					out.println();
				}
				if(!(c.arr.get(i).carousel.size()==0))
				{
					out.print("Carousel ");
					for(int j=0;j<c.arr.get(i).carousel.size();j++)
					{
						out.print(format(c.arr.get(i).carousel.get(j))+" ");
					}
					out.println();
				}
				out.println();
			}
			out.close();

	}
}
