import java.util.*;
class comp
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
int arr[]={16,18,27,16,23,21,19};
int len=arr.length;
int com=0;
for(int i=0;i<len;i++)
{
 int c=0;
 for(int j=1;j<100;j++)
 {
 if(arr[i]%j==0)
 {
 c++;
 }
 }
 if(c>2)
 com++;
}
System.out.println(+com);
	}
} 