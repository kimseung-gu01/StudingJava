import javax.xml.transform.sax.SAXSource;

abstract class Phone {

    abstract void printInfo();
    abstract void exitCamera();
    abstract void notEnoughBattery();
    abstract void update();


    public void call(String receiver, String mode) {
        System.out.println("전화 중 . . .");
    }
    public void sendMassage(String receiver, String message) {
        System.out.println("메시지를 송부합니다. 80자 이상이면 MMS로 전환됩니다.");
    }
    public void launchCamera(String cameraMode) {
        System.out.println("카메라를 시작합니다. 카메라 전환은 불가합니다. ");
    }
}
