package com.right.t1;
import java.util.*;
public class main
{
static	Random ran =new Random();
static	Scanner input = new Scanner(System.in);
static	String[] head=new String[]{
		               "哦，我的上帝，",
					   "哦,，亲爱的上帝啊，",
					   "哦，我的老伙计，",
					   "哦，说实话，",
		               "哦",
					   "哦，好的先生，",
					   "哦，好的伙计，",
					   "哦，可敬的绅士们，",
					   "哦，见鬼，",
					   "我的孩子",
					   "我的孩子们",
					   "嘿，兄弟们",
					   "嘿，冷静点",
					   "啊，阿们，感谢主，",
					  
					   "看，他在干嘛？",
					   "嘿，sb.你真该死的家伙",
					   "天哪，这声音，",
					   "主啊，看看这漂白了四壁的光，",
					   "因为",
					   "此外，",
					   "虽然，",
					   "哦，先生，我是说......我的老伙计，",
					   "喔，你不会相信",
					   "令人难以置信",
					  "哦，天呐" ,
		         };
		static String[] body =new String[]{
			       "sb.的腔调能让隔壁苏珊阿姨笑得像土坡鼠一样，",
				   "sb.说的的东西就连吉姆叔叔的那头蠢驴也会笑到跳踢踏舞的，",
				   "莉莉夫人可没有告诉sb.她们家的肥皂捡不起来，",
		           "sb.来了，祂来了,",
                    "看在上帝的份上,",
				   "是祂，sb.！"
				   ,"我发誓我会的,",
				   "sb.长的简直比玛丽太太煮的咖啡还糟糕,",
				   "我真想用马克先生的皮鞋狠狠地踢sb.的屁股,",
				   "听听，听听，sb.的声音简直比艾米小姐拉的小提琴还难听,",
				   "如同上厕所没带纸，",
				   "但是",
				   "宛如",
				   "天呐，玛丽太太的咖啡又糊了,",
				   "我真想用sb.的屁股狠狠地踢马克先生的皮鞋,",
				  // "您三连没有?",
				   "我真希望sb.至少能长得比莫利家门前的金菊花好看些,",
				   "请sb.你收起那糟糕的译制腔，",
				   "我真想用马修连恩先生的皮鞭好好地轻吻你那像腐烂的皮革一般的屁股，",
	};
	static String[] end =new String[]{
		               "得把玛丽太太的咖啡️给祂喝!",
					   "如果你sb.在用这种翻译腔说话，我就要请上帝让你忏悔!",
					   "我向伟大阿门发誓!",
					   "你必须向伟大的阿们发誓!",
					   "我发誓!",
					   "就像上厕所带着砂纸一样!",
					   "诶.....",
					   "求求安迪少爷了!",
					   "天呐天呐，这就是你对上帝的态度?!",
					//   "诶,我想要三连啊.....",
					   "亲爱的。",
					   "我向圣母玛利亚保证。",
					   "是的，我的伙计，就是这样。",
					   "不是吗？",
					   "我们为什么不能?",
					   "该死的！",
	};
	public static void main(String[] args)
	{
		System.out.println("#copyright 瑞特\n#瑞特制作的一个狗屁不通的翻译腔的生成器，希望大家能喜欢\n");
		int j=0;
		while(true){
		System.out.println("请输入句子的主语:\n");
	  
		String name=input.next();
		System.out.println("请输入所生成的句子数量:\n");
		String s="";
		int c=input.nextInt();
		
	  
	   
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

