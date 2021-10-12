package Day1;

public class PhoneInfo {
    String modelName, OS, usbType;
    int releaseYear, batterySize;

    public PhoneInfo(String modelName, String OS, int releaseYear, int batterySize, String usbType) {
        this.modelName = modelName;
        this.OS = OS;
        this.usbType = usbType;
        this.releaseYear = releaseYear;
        this.batterySize = batterySize;
    }
    public void showInfo() {
        System.out.println("모델명 : " + modelName + "\n" +
                            "운영체제 : " + OS + "\n" +
                            "출시년도 : " + releaseYear + "\n" +
                            "배터리용량 : " + batterySize + "\n" +
                            "USB타입 : " + usbType + "\n");
    }
}
