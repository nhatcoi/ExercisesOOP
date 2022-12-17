import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceAccount serviceAccount = new ServiceAccount();
        // input Information
        Account accountNguyen = new Account("222220062004", "NGUYEN VAN NHAT \n MB Bank ",50000);
        // chose number process
        Scanner sc = new Scanner(System.in);
        System.out.println(accountNguyen);
        System.out.println(" ");
        System.out.println("Choose 1 to load Money");
        System.out.println("Choose 2 to draw Money");
        System.out.print("Moi Ban Chon : ");
        int chooseNumber = sc.nextInt();
        // chosen and implementation
        switch (chooseNumber) {
            case 1:
                System.out.println("The money you want to add is : ");
                double inMoney = sc.nextDouble();
                serviceAccount.addMoney(accountNguyen, inMoney);
                System.out.println("The balance is: "  + accountNguyen.getSoTien());
                break;
            case 2:
                System.out.println("The money you want to draw is : ");
                double outMoney = sc.nextDouble();
                serviceAccount.outMoney(accountNguyen, outMoney);
                System.out.println("The balance is : " + accountNguyen.getSoTien());
                break;
        }
        System.out.println(" ");
        System.out.println(accountNguyen);
    }

}