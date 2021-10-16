import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.sax.SAXSource;

public class SmartPhone extends Phone{
    String receiver, mode, message, cameraMode;
    String modelName, os, usbType;
    int releaseYear, batterySize;

    public SmartPhone(String modelName, String os, String usbType, int releaseYear, int batterySize) {
        this.modelName = modelName;
        this.os = os;
        this.usbType = usbType;
        this.releaseYear = releaseYear;
        this.batterySize = batterySize;

    }
    // --- abstract method
    @Override
    void printInfo() {
        System.out.println("모델명 : " + modelName + "\n" + "운영체제 : " + os + "\n" + "출시년도 : " + releaseYear + "\n" +
                "배터리용량 : " + batterySize + "mAh" + "\n" + "USB타입 : " + usbType);
    }
    @Override
    void exitCamera() {
        System.out.println("카메라앱을 종료합니다");
    }
    @Override
    void notEnoughBattery() {
        System.out.println("핸드폰 배터리가 15% 미만입니다. 충전기를 꽂아주세요 . .");
    }

    @Override
    void update() {
        System.out.println("펌웨어 업데이트가 필요합니다. 새벽에 업데이트를 진행합니다. ");
    }
    //--------------

    @Override
    public void call(String receiver, String mode) {
        this.receiver = receiver;
        this.mode = mode;
        System.out.println(receiver + "에게 " + mode + "로(으로) " + "전화를 겁니다.\n" +
                        "블루투스 이어폰으로 통화가 자동으로 연결됩니다.");
    }
    @Override
    public void sendMassage(String receiver, String message) {
        this.receiver = receiver;
        this.message = message;
        System.out.println(receiver + "님에게 " + "'" + message + "'" + "와 같이 메시지를 보냅니다.\n" +
                        "tip) 문자메시지 기본앱을 카카오톡으로 변경하실 수 있습니다.");
    }
    @Override
    public void launchCamera(String cameraMode) {
        this.cameraMode = cameraMode;
        System.out.println("카메라앱을 실행합니다. 현재 " + cameraMode + " 모드입니다.");
    }
}

