import java.util.Scanner;

public class Bank5 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      int sum = 0;
      while (true) {
         System.out.println("�Ա�A\n���B\n�ܾ�C\n����D");

         Scanner sc = new Scanner(System.in);
         System.out.println("--------------------");
         System.out.println("���Ͻô� �޴��� �Է��Ͻÿ�");
         System.out.println("--------------------");
         String input = sc.nextLine();
         input=input.toUpperCase();
         
         switch (input)

         {
         case "A"://�Ա�
        	 System.out.println("--------------------");
            System.out.println("�ݾ��� �Է��ϼ���");
            System.out.println("--------------------");
            int money = sc.nextInt();
            sum += money;
            System.out.println("--------------------");
            System.out.println("�ܾ���" + sum + "�Դϴ�");
            System.out.println("--------------------");
            break;
         case "B"://���
        	 System.out.println("--------------------");
            System.out.println("�ݾ��� �Է��ϼ���");
            System.out.println("--------------------");
            money = sc.nextInt();
            sum -= money;
            if (sum <= 0) {
            	 System.out.println("--------------------");
               System.out.println("�ܾ��� �����մϴ�.");
               System.out.println("--------------------");
               sum = 0;
            } else if (sum >= 0) {
            	 System.out.println("--------------------");
               System.out.println("�ܾ�" + sum + "�� �Դϴ�.");
               System.out.println("--------------------");
            }

            break;

         case "C":// �ܾ� ��ȸ

            if (sum <= 0) {
            	 System.out.println("--------------------");
               System.out.println("�ܾ��� �����ϴ�.");
               System.out.println("--------------------");
            } else if (sum >= 0) {
            	 System.out.println("--------------------");
               System.out.println("�ܾ�" + sum + "�� �Դϴ�.");
               System.out.println("--------------------");
            }

            break;

         case "D"://����
            System.exit(0);
            break;
         default://�߸��Է�
        	 System.out.println("--------------------");
            System.out.println("�� �� �Է� �ϼ̽��ϴ�.");
            System.out.println("--------------------");
            
            break;
         }
      }

   }
}