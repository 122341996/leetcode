package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsNumber {
	public boolean isnumber(String str)
	{
		if(str!=null&&str.trim()!="")
		{
			Pattern pattern = Pattern.compile("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$"); 
			   Matcher isNum = pattern.matcher(str);
			   if( !isNum.matches() ){
			       return false; 
			   } 
			   return true; 
			
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsNumber in=new IsNumber();
		System.out.println(in.isnumber(null));

	}

}
