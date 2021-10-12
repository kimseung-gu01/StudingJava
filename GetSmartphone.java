package Day1;
import java.util.Scanner;

public class GetSmartphone {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PhoneInfo info01 = new PhoneInfo("Galaxy S21", "Android",
                2021, 4100, "C");
        PhoneInfo info02 = new PhoneInfo("IPhone XS","IOS",
                2018, 2658, "8pin");
        PhoneInfo info03 = new PhoneInfo("V50 ThinQ", "Android",
                2019, 4000, "C");

        System.out.println("안녕하세요. 인하 핸드폰 매장입니다.\n" +
                            "핸드폰을 선택해주세요.\n" +
                            "1. Galaxy S21" + "2. IPhone XS" + "3. V50 ThinQ");

        switch (s.nextInt()) {
            case 1 : info01.showInfo(); break;
            case 2 : info02.showInfo(); break;
            case 3 : info03.showInfo(); break;
            default:
                System.out.println("잘못된 번호입니다.");
        }
    }
}
