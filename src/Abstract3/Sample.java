package Abstract3;

public abstract class Sample {
          public void test() {
        	  
        	  System.out.println("hello");
          }
         
          public void reverse(String original,String reverse) {
        	  for(int i=original.length()-1;i>=0;i--) {
        		  reverse=reverse+original.charAt(i);
        		   }
        	  System.out.println("the reverse string is="+reverse);
          }
          
          
         
          }

