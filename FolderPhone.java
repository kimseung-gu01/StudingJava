package Ver1;

public class FolderPhone extends Phone {
    String modelName;
    int releaseYear;
    boolean isDMB;

    public FolderPhone(String modelName, int releaseYear, boolean isDMB) {
        this.modelName = modelName;
        this.releaseYear = releaseYear;
        this.isDMB = isDMB;
    }

    void printInfo() {
        System.out.println("모델명 : " + this.modelName + "\n출시년도 : " + this.releaseYear + "\nDMB지원 : " + this.isDMB);
    }

    void exitCamera() {
        System.out.println("카메라를 종료합니다.");
    }

    void notEnoughBattery() {
        System.out.println("배터리가 부족합니다.");
    }

    void update() {
    }

    public void call(String receiver, String mode) {
        super.call(receiver, mode);
    }

    public void sendMassage(String receiver, String message) {
        super.sendMassage(receiver, message);
    }

    public void launchCamera(String cameraMode) {
        super.launchCamera(cameraMode);
    }

    public void folder() {
        System.out.println("핸드폰을 접어 자동으로 절전모드로 전환합니다.");
    }
}