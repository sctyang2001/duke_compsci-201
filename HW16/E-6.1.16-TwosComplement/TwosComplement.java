import java.lang.String;

public class TwosComplement
{
    public static String binary(int n)// keep dividing 2 from high degrees to low degrees 
    {
    if ((n/2)==0)
  {
  int m=n%2;
  return ""+m;
  }
  else 
  {
  return ""+n%2+binary(n/2);
  }
 }
 
 public static String reverse(String a )//The operation of reversing the string 
 {
  String s="";
  for (int i=a.length()-1;i>=0;i--)
  {
   s+=a.charAt(i);
  }
  return s;
 }
   
    public static String fill(String b, int size,int input)
    {
        if (input>0)
        {
        while (b.length()<size)
        {
            b="0"+b;
        }
        }
        else   
        {
            while (b.length()<size)
        {
            b="1"+b;
        }
        
        }
        return b;
    }

    public static String hex(String a)
    {
        String hex="";
        for (int i=0;i<a.length();i=i+4)
        {
        if ((a.charAt(i)=='0')&&(a.charAt(i+1)=='0')&&(a.charAt(i+2)=='0')&&(a.charAt(i+3)=='0'))
        hex+="0";
        else if ((a.charAt(i)=='0')&&(a.charAt(i+1)=='0')&&(a.charAt(i+2)=='0')&&(a.charAt(i+3)=='1'))
        hex+="1";
        else if ((a.charAt(i)=='0')&&(a.charAt(i+1)=='0')&&(a.charAt(i+2)=='1')&&(a.charAt(i+3)=='0'))
        hex+="2";
        else if ((a.charAt(i)=='0')&&(a.charAt(i+1)=='0')&&(a.charAt(i+2)=='1')&&(a.charAt(i+3)=='1'))
        hex+="3";
        else if ((a.charAt(i)=='0')&&(a.charAt(i+1)=='1')&&(a.charAt(i+2)=='0')&&(a.charAt(i+3)=='0'))
        hex+="4";
        else if ((a.charAt(i)=='0')&&(a.charAt(i+1)=='1')&&(a.charAt(i+2)=='0')&&(a.charAt(i+3)=='1'))
        hex+="5";
        else if ((a.charAt(i)=='0')&&(a.charAt(i+1)=='1')&&(a.charAt(i+2)=='1')&&(a.charAt(i+3)=='0'))
        hex+="6";
        else if ((a.charAt(i)=='0')&&(a.charAt(i+1)=='1')&&(a.charAt(i+2)=='1')&&(a.charAt(i+3)=='1'))
        hex+="7";
        else if ((a.charAt(i)=='1')&&(a.charAt(i+1)=='0')&&(a.charAt(i+2)=='0')&&(a.charAt(i+3)=='0'))
        hex+="8";
        else if ((a.charAt(i)=='1')&&(a.charAt(i+1)=='0')&&(a.charAt(i+2)=='0')&&(a.charAt(i+3)=='1'))
        hex+="9";
        else if ((a.charAt(i)=='1')&&(a.charAt(i+1)=='0')&&(a.charAt(i+2)=='1')&&(a.charAt(i+3)=='0'))
        hex+="A";
        else if ((a.charAt(i)=='1')&&(a.charAt(i+1)=='0')&&(a.charAt(i+2)=='1')&&(a.charAt(i+3)=='1'))
        hex+="B";
        else if ((a.charAt(i)=='1')&&(a.charAt(i+1)=='1')&&(a.charAt(i+2)=='0')&&(a.charAt(i+3)=='0'))
        hex+="C";
        else if ((a.charAt(i)=='1')&&(a.charAt(i+1)=='1')&&(a.charAt(i+2)=='0')&&(a.charAt(i+3)=='1'))
        hex+="D";
        else if ((a.charAt(i)=='1')&&(a.charAt(i+1)=='1')&&(a.charAt(i+2)=='1')&&(a.charAt(i+3)=='0'))
        hex+="E";
        else    
        hex+="F";
        }
        return hex;
    }

    public static void main(String[] args)  {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int input=Integer.parseInt(args[0]);
        int store=input;
        int size=Integer.parseInt(args[1]);
        if ((input<0)&&(size<32))
        {
            input=(int)Math.pow(2,size)-Math.abs(input);
        }
        if ((input<0)&&(size==32))
        {
            input=Math.abs(input);
        }
        else if ((input<0)&&(size==64))
        {
            input=1+(int)Math.pow(2,size)-Math.abs(input);
        }
        System.out.print(       fill(reverse(binary(input)),size,store) +" "+hex(fill(reverse(binary(input)),size,store))      );
           

    }
}