package FileAndStreams;

import java.io.File;
import java.io.IOException;

public class File1{

	public static void main(String[] args) throws IOException 
	{
//		File ref1=new File("z:\\deljava\\cmd.java");
//		System.out.println(ref1.getAbsolutePath());
		
		//File ref2=new File("cmd.txt");
		//System.out.println(ref2.getCanonicalPath());
		
//		File path=new File("e:\\","deljava\\cmd.java");
//		if(path.exists())
//			{
//				System.out.println("Yes");
//				System.out.println(path.delete());
//			} 
//		else
//			System.out.println("NO");
			
//		File dir=new File("e:\\deljava");
//		File path=new File(dir,"Aryy2.java");
//		boolean res=path.renameTo(new File("e:\\deljava\\circle.class"));
//		if(res==true)
//		System.out.println("Renamed");
//  	else 
//			System.out.println("File Not Found/file may exist already"); 
			
		File dir=new File("sdcard//JAVA");
		
		File ary[]=dir.listFiles();//returns array of File class objects
		int files=0,dirs=0;
		for (File ref:ary)
		{
			if(ref.isFile())
			{
				System.out.println(ref.getName()+"-File "+ref.length()+" Bytes");
				files++;
			}
			else
			{
				System.out.println("[ "+ref.getName()+" ]");
				dirs++;
			}
		}
		System.out.println("Files Count:"+files);
		System.out.println("Folders count="+dirs);
		

	}

}