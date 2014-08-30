
package assignmentprt451;
public class Assignmentprt451 
{

           static int i,j,k;
           static int c=0,w;
           static int large;
           static char m; 
           static String a="";
    

    static String frequencycount(String s)
    {
        
        char[] z=new char[s.length()];
        for(w=0;w<s.length();w++)
        z[w]=s.charAt(w);
        for(i=0;i<w;i++)
        {
            char ch=z[i];
            for(j=i+1;j<w;j++)
            {
                if(z[j]==ch)
                {
                    for(k=j;k<(w-1);k++)
                    z[k]=z[k+1];
                    w--;
                    j=i;
                }
            }
        }
        
        int[] t=new int[w];
        for(i=0;i<w;i++)
        {
            for(j=0,c=0;j<s.length();j++)
            {
                if(z[i]==s.charAt(j))
                c++;
            }
            t[i]=c ;
           //System.out.print(z[i]+"====="+c+",\n");
            
            
        }
        
        int maximum = t[0];
        int sec=t[0];
    for (int i=1; i<t.length; i++) 
    {
        if (t[i] > maximum) {
            sec = maximum;  
                maximum = t[i]; 
            
        }
        else if(t[i] > sec)
        {  
                sec = t[i];  
        }
        else if (sec == maximum)
        {  
                sec= t[i];  
            } 
        
        } 
        //System.out.println("second highest is=="+sec);
          int flag=1;
  
            for (int i=0; i<t.length; i++) 
    {
        
        if(t[i]==sec)
        {
           flag++;
           if((flag>=3))
            {
                a=a+",";
            }
            a=a+"{"+z[i]+","+t[i]+"}";
          
             
          
        }
       
        
        
        
    
  }
  return "{"+a+"}";
    }
    }
    






