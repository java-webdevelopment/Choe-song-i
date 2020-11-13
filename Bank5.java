import java.util.Scanner;

public class Bank5 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      int sum = 0;
      while (true) {
         System.out.println("입금A\n출금B\n잔액C\n종료D");

         Scanner sc = new Scanner(System.in);
         System.out.println("--------------------");
         System.out.println("원하시는 메뉴를 입력하시오");
         System.out.println("--------------------");
         String input = sc.nextLine();
         input=input.toUpperCase();
         
         switch (input)

         {
         case "A"://입금
        	 System.out.println("--------------------");
            System.out.println("금액을 입력하세요");
            System.out.println("--------------------");
            int money = sc.nextInt();
            sum += money;
            System.out.println("--------------------");
            System.out.println("잔액은" + sum + "입니다");
            System.out.println("--------------------");
            break;
         case "B"://출금
        	 System.out.println("--------------------");
            System.out.println("금액을 입력하세요");
            System.out.println("--------------------");
            money = sc.nextInt();
            sum -= money;
            if (sum <= 0) {
            	 System.out.println("--------------------");
               System.out.println("잔액이 부족합니다.");
               System.out.println("--------------------");
               sum = 0;
            } else if (sum >= 0) {
            	 System.out.println("--------------------");
               System.out.println("잔액" + sum + "원 입니다.");
               System.out.println("--------------------");
            }

            break;

         case "C":// 잔액 조회

            if (sum <= 0) {
            	 System.out.println("--------------------");
               System.out.println("잔액이 없습니다.");
               System.out.println("--------------------");
            } else if (sum >= 0) {
            	 System.out.println("--------------------");
               System.out.println("잔액" + sum + "원 입니다.");
               System.out.println("--------------------");
            }

            break;

         case "D"://종료
            System.exit(0);
            break;
         default://잘못입력
        	 System.out.println("--------------------");
            System.out.println("잘 못 입력 하셨습니다.");
            System.out.println("--------------------");
            
            break;
         }
      }

   }
}