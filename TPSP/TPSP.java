package TPSP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import TPSP.Cardfile;

public class TPSP {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		args[0]=args[0].replaceAll("?", "");
		File file = new File(args[0].substring(1,args[0].length()));
		Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Cardfile a=new Cardfile();
		a.reading(input);
		File file2 = new File(args[1].substring(1,args[1].length()));
		Scanner input2 = null;
		try {
			input2 = new Scanner(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		instructionFile b =new instructionFile();
		b.read(a,input2,args[2].substring(1,args[2].length()));
		String file11=args[3].substring(1,args[2].length());
		output gh=new output(file11);
		gh.outresult(a);
	}
	

}
