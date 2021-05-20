package JavaPracticePrograms.JavaPracticePrograms;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class ReverseIndividualStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Pavan Kumar Ennam JPMorgan Chase Company with";
StringBuffer sb,sb1;
String s2 = "";

Character ch[]= {'a','e','i','o','u','A','E','I','O','U'};
List<Character> al=Arrays.asList(ch);
LinkedHashSet hs =new LinkedHashSet();
LinkedHashSet hs2 =new LinkedHashSet();

String arr[]=s.split(" ");
int sz=arr.length;

for(int i=0;i <sz;i++)
{
	if(i%2==0)
	{
		sb=new StringBuffer(arr[i]);
		for(int j=0;j<sb.length();j++)
		{
			if(al.contains(sb.charAt(j)))
			{
				sb.replace(j, j+1, "");
			}
		}
		//System.out.println("REmoved voewls:"+sb);
		hs.add(sb);
	}
	else if(i%2!=0)
	{
		sb1=new StringBuffer(arr[i]);
		for(int k=sb1.length()-1;k>=0;k--)
		{
			//sb2=sb2.append(sb1.charAt(k));
			s2=s2+sb1.charAt(k);
		}
		hs2.add(s2);
		s2="";
	}
}
System.out.print("Even List:"+hs + " ");
System.out.println("odd List:"+hs2 + " ");

	}

}
