/*
 * ����switch���,����case��͸
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
    		    System.out.println("Ԫ��");
    		    break;
    	  case 'y':
    	  case 'w':
    		    System.out.println("��Ԫ��");
    		    break;
		  default:
			    System.out.println("����");
    	  }
    	  */
    	 String a = "����";
    	 
    	 switch (a) {  //JDK7������,���ʽ����������ַ���
    	 case "���ϱ�":
    		 System.out.println("����");
    		 break;
    	 case "����":
    		 System.out.println("����");
    		 break;
		 default:
			 System.out.println("��Һã�");
			 break;
    	 }
     }
}
