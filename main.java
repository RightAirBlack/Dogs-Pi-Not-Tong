package com.right.t1;
import java.util.*;
import java.util.regex.*;
public class main
{
static	Random ran =new Random();
static	Scanner input = new Scanner(System.in);
static	String[] head=new String[]{
		               "哦，我的上帝，",
		               "诶，见鬼，",
					   "啊，阿们，感谢主，",
					   "看，黑与白交织在一起了，",
					   "瞅，他在干嘛？",
					   "天哪，这声音，",
					   "主啊，看看这漂白了四壁的光，",
					   "因为",
					   "此外，",
					   "虽然，",
					   "请问一下",
		         };
		static String[] body =new String[]{
		           "sb.来了，祂来了，",
                   "sb.祂可是个狼人，",
				   "是祂，sb.！",
				   "sb.长的简直比玛丽太太煮的咖啡还糟糕。",
				   "我真想用马克先生的皮鞋狠狠地踢sb.的屁股。",
				   "听听，听听，sb.的声音简直比艾米小姐拉的小提琴还难听。",
				   "如同上厕所没带纸，",
				   "但是",
				   "宛如",
				   "啊，玛丽太太的咖啡又糊了",
				   "我真想用sb.的屁股狠狠地踢马克先生的皮鞋",
	};
	static String[] end =new String[]{
		               "得把玛丽太太的咖啡️给祂喝",
					   "如果你sb.在用这种翻译腔说话，我就要请上帝让你忏悔",
					   "我向伟大阿门发誓",
					   "你必须向伟大的阿们发誓",
					   "我发誓",
					   "就像上厕所带着砂纸一样",
					   "诶",
					   "求求安迪少爷了",
					   "天哪天哪，这就是你对上帝的态度",
	};
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		int j=0;
		while(true){
		System.out.println("请输入数字\n");
		String s="";
		int c=input.nextInt();
		System.out.println("请输入主语\n");
	   String name=input.next();
	  
	   
		for(int i=0;i<c;i++) {
		s+="   ";
		j=	ran.nextInt()%head.length;
		if(j<0) j*= -1;
		s+=head[j];
		j=ran.nextInt()%body.length;
		if(j<0) j*= -1;
		s+=body[j];
		j=ran.nextInt()%end.length;
		
        if(j<0) j*= -1;
		
		s+=end[j];
		s+="\n";
		}
	s=s.replace("sb.",name);
		System.out.println(s);
		

	}
}
}



























/*
Pattern.CANON_EQ 当且仅当两个字符的"正规分解(canonical decomposition)"都完全相同的情况下，才认定匹配。比如用了这个标志之后，表达式"a\u030A"会匹配"?"。默认情况下，不考虑"规 范相等性(canonical equivalence)"。 
Pattern.CASE_INSENSITIVE(?i) 

默认情况下，大小写不明感的匹配只适用于US-ASCII字符集。这个标志能让表达式忽略大小写进行匹配。要想对Unicode字符进行大小不明感的匹 配，只要将UNICODE_CASE与这个标志合起来就行了。

Pattern.COMMENTS(?x) 
在这种模式下，匹配时会忽略Java正则表达式里的空格字符(译者注：不是指表达式里的"\\s"，而是指表达式里的空格，tab，回车之类)。注释从#开始，一直到这行结束。可以通过嵌入式的标志来启用Unix行模式。 
Pattern.DOTALL(?s) 
在这种模式下，表达式'.'可以匹配任意字符，包括表示一行的结束符。默认情况下，表达式'.'不匹配行的结束符。 
Pattern.MULTILINE(?m) 
在这种模式下，'^'和'$'分别匹配一行的开始和结束。此外，'^'仍然匹配字符串的开始，'$'也匹配字符串的结束。默认情况下，这两个表达式仅仅匹配字符串的开始和结束。 
Pattern.UNICODE_CASE(?u) 
在这个模式下，如果你还启用了CASE_INSENSITIVE标志，那么它会对Unicode字符进行大小写不明感的匹配。默认情况下，大小写不敏感的匹配只适用于US-ASCII字符集。 
Pattern.UNIX_LINES(?d) 
在这个模式下，只有'\n'才被认作一行的中止，并且与'.'，'^'，以及'$'进行匹配。抛开空泛的概念，下面写出几个简单的Java正则用例：


*/
