public class User {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ON ? " + smartTv.ligada);
        System.out.println("Channel : " + smartTv.canal);
        System.out.println("Volume : " + smartTv.volume);

        smartTv.turOn();
        System.out.println("Novo Status Tv Ligada ? " + smartTv.ligada);

        smartTv.turOff();
        System.out.println("Novo Status Tv Ligada ? " + smartTv.ligada);

        smartTv.increaseVolume();
        System.out.println("Volume : " + smartTv.volume);

        smartTv.decreaseVolume();
        System.out.println("Volume : " + smartTv.volume);

        smartTv.nextChannel();
        System.out.println("Channel : " + smartTv.canal);

        smartTv.previousChannel();
        System.out.println("Channel : " + smartTv.canal);

        smartTv.changeChannel(17);
        System.out.println("Channel : " + smartTv.canal);

    }

}
