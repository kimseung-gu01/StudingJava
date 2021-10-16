package Ver1;

public class SmartPhone extends Phone {
    String receiver;
    String mode;
    String message;
    String cameraMode;
    String modelName;
    String os;
    String usbType;
    int releaseYear;
    int batterySize;

    public SmartPhone(String modelName, String os, String usbType, int releaseYear, int batterySize) {
        this.modelName = modelName;
        this.os = os;
        this.usbType = usbType;
        this.releaseYear = releaseYear;
        this.batterySize = batterySize;
    }

    void printInfo() {
        System.out.println("모델명 : " + this.modelName + "\n운영체제 : " + this.os + "\n출시년도 : " + this.releaseYear + "\n배터리용량 : " + this.batterySize + "mAh\nUSB타입 : " + this.usbType);
    }

    void exitCamera() {
        System.out.println("카메라앱을 종료합니다");
    }

    void notEnoughBattery() {
        System.out.println("핸드폰 배터리가 15% 미만입니다. 충전기를 꽂아주세요 . .");
    }

    void update() {
        System.out.println("펌웨어 업데이트가 필요합니다. 새벽에 업데이트를 진행합니다.");
    }

    public void call(String receiver, String mode) {
        this.receiver = receiver;
        this.mode = mode;
        System.out.println(receiver + "에게 " + mode + "로(으로) 전화를 겁니다.\n블루투스 이어폰으로 통화가 자동으로 연결됩니다.");
    }

    public void sendMassage(String receiver, String message) {
        this.receiver = receiver;
        this.message = message;
        System.out.println(receiver + "님에게 '" + message + "'와 같이 메시지를 보냅니다.\ntip) 문자메시지 기본앱을 카카오톡으로 변경하실 수 있습니다.");
    }

    public void launchCamera(String cameraMode) {
        this.cameraMode = cameraMode;
        System.out.println("카메라앱을 실행합니다. 현재 " + cameraMode + " 모드입니다.");
    }
}
