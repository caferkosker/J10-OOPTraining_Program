public class Traning {
    private int burpee_sayısı;
    private int pushup_sayısı;
    private int situp_sayısı;
    private int squat_sayısı;

    public Traning(int burpee_sayısı,int pushup_sayısı,int situp_sayısı,int squat_sayısı) {
        this.setBurpee_sayısı(burpee_sayısı);
        this.setPushup_sayısı(pushup_sayısı);
        this.setSitup_sayısı(situp_sayısı);
        this.setSquat_sayısı(squat_sayısı);
    }


    public int getBurpee_sayısı() {
        return burpee_sayısı;
    }

    public void setBurpee_sayısı(int burpee_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
    }

    public int getPushup_sayısı() {
        return pushup_sayısı;
    }

    public void setPushup_sayısı(int pushup_sayısı) {
        this.pushup_sayısı = pushup_sayısı;
    }

    public int getSitup_sayısı() {
        return situp_sayısı;
    }

    public void setSitup_sayısı(int situp_sayısı) {
        this.situp_sayısı = situp_sayısı;
    }

    public int getSquat_sayısı() {
        return squat_sayısı;
    }

    public void setSquat_sayısı(int squat_sayısı) {
        this.squat_sayısı = squat_sayısı;
    }
    public void hareketYap(String HareketTuru,int sayi){
        if (HareketTuru.equals("Burpee")|| HareketTuru.equals("burpee")){
            burpeeYap(sayi);
        }
        else if (HareketTuru.equals("Pushup") || HareketTuru.equals("pushup")){
            pushupYap(sayi);
        }
        else if (HareketTuru.equals("Situp") || HareketTuru.equals("situp")){
            situpYap(sayi);
        }
        else if (HareketTuru.equals("Squat") || HareketTuru.equals("squat")){
            squatYap(sayi);
        }
        else {
            System.out.println("Geçersiz Hareket...");
        }
    }
    public void burpeeYap(int sayi){
        if (burpee_sayısı == 0){
            System.out.println("Yapacak Burpee kalmadı TEBRİKLER!!!");
        }
        if (burpee_sayısı-sayi < 0){
            System.out.println("Hedeflediğiniz Burpee sayısını geçtiniz TEBRİKLER!!! ");
            burpee_sayısı = 0;
            System.out.println("Kalan Burpee : " + burpee_sayısı);
        }
        else {
            burpee_sayısı -= sayi;
            System.out.println("Kalan Burpee sayınız : " + burpee_sayısı);
        }

    }
    public void pushupYap(int sayi){
        if (pushup_sayısı == 0){
            System.out.println("Yapacak Pushup kalmadı TEBRİKLER!!!");
        }
        if (pushup_sayısı-sayi < 0){
            System.out.println("Hedeflediğiniz Pushup sayısını geçtiniz TEBRİKLER!!! ");
            pushup_sayısı = 0;
            System.out.println("Kalan Pushup sayısı : " + pushup_sayısı);
        }
        else {
            pushup_sayısı -= sayi;
            System.out.println("Kalan Pushup sayınız : " + pushup_sayısı);
        }

    }
    public void situpYap(int sayi){
        if (situp_sayısı == 0){
            System.out.println("Yapacak Situp kalmadı TEBRİKLER!!!");
        }
        if (situp_sayısı-sayi < 0){
            System.out.println("Hedeflediğiniz Situp sayısını geçtiniz TEBRİKLER!!! ");
            situp_sayısı = 0;
            System.out.println("Kalan Situp sayınız : " + situp_sayısı);
        }
        else {
            situp_sayısı -= sayi;
            System.out.println("Kalan Situp sayınız : " + situp_sayısı);
        }

    }
    public void squatYap(int sayi){
        if (squat_sayısı == 0){
            System.out.println("Yapacak Squat kalmadı TEBRİKLER!!!");
        }
        if (burpee_sayısı-sayi < 0){
            System.out.println("Hedeflediğiniz Squat sayısını geçtiniz TEBRİKLER!!! ");
            squat_sayısı = 0;
            System.out.println("Kalan Squat : " + squat_sayısı);
        }
        else {
            squat_sayısı -= sayi;
            System.out.println("Kalan Squat sayınız : " + squat_sayısı);
        }

    }
    public boolean Training_Finish(){
        return (burpee_sayısı == 0) && (pushup_sayısı == 0) && (situp_sayısı == 0) && (squat_sayısı == 0);
    }

}
