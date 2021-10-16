package Ver1;

import java.util.Scanner;

public class MainTest {
    public MainTest() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone sm1 = new SmartPhone("Galaxy 21", "Android", "C", 2021, 4100);
        FolderPhone fo1 = new FolderPhone("Corby F", 2010, true);
        System.out.println("안녕하세요 인하 핸드폰 매장입니다.\n핸드폰을 선택해주세요. \n1. Galaxy S21 / 2. Corby F");
        switch(sc.nextInt()) {
            case 1:
                sm1.printInfo();
                sm1.call("오일남", "영상통화");
                sm1.sendMassage("오일남", "우린 깐부잖아");
                sm1.launchCamera("파노라마");
                sm1.exitCamera();
                sm1.notEnoughBattery();
                sm1.update();
                break;
            case 2:
                fo1.printInfo();
                fo1.call("오일남", "영상통화");
                fo1.sendMassage("오일남", "우린 깐부잖아");
                fo1.launchCamera("파노라마");
                fo1.exitCamera();
                fo1.notEnoughBattery();
                fo1.folder();
                break;
            default:
                System.out.println("잘못된 번호입니다.");
        }

    }
}
