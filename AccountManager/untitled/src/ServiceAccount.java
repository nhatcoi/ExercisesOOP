public class ServiceAccount {

    //TODO create variable for drawMoneyFee
    public void addMoney (Account account, double inMoney) {
        double preMoney = account.getSoTien();
        account.setSoTien(preMoney + inMoney);
    }

    public void outMoney (Account account, double drawMoney) {
        double nowMoney = account.getSoTien();
        if (nowMoney > drawMoney) {
            account.setSoTien(nowMoney - drawMoney);
        }
        else {
            System.out.println("Account is not enough Money");
        }
    }
}
