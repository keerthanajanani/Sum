# Sum
import java.io.*;
import java.util.*;
public class Sum
{
public static void main(String args[])throws IOException
{
int i,n,sum=0;
Bufferedreader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Number");
n=Integer.parseInt(br.readLine());
for(i=0;i<=n;i++)
{
System.out.println("The sum of the number is: "+sum);
}
}
}
