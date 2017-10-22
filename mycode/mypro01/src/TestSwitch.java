/*
 * 测试switch语句,利用case穿透
 */
public class TestSwitch {
     public static void main(String[] args) {
    	 /*
    	  char c = 'a';
    	  int rand = (int)(26*Math.random());
    	  char c2 = (char)(c+rand);
    	  System.out.println(c2+": ");
    	  switch(c2) {
    	  case 'a':
    	  case 'e':
    	  case 'i':
    	  case 'o':
    	  case 'u':
    		    System.out.println("元音");
    		    break;
    	  case 'y':
    	  case 'w':
    		    System.out.println("半元音");
    		    break;
		  default:
			    System.out.println("辅音");
    	  }
    	  */
    	 String a = "高清";
    	 
    	 switch (a) {  //JDK7新特性,表达式结果可以是字符串
    	 case "马上兵":
    		 System.out.println("落马");
    		 break;
    	 case "高清":
    		 System.out.println("五码");
    		 break;
		 default:
			 System.out.println("大家好！");
			 break;
    	 }
     }
}
