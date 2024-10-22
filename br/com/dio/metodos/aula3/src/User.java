public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        //System.out.println("Ligando tv");
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(24);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.desligar();
        //System.out.println("Desligando tv");
    }
}
