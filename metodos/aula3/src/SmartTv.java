public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 10;

    public void ligar() {
        ligado = true;
        System.out.println("Ligando");
    }
    public void desligar() {
        ligado = false;
        System.out.println("Desligando");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando para: " + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo para: "+ volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Trocando para o canal: " + canal);
    }
    public void aumentarCanal() {
        canal++;
        System.out.println("Trocando de canal (pra cima): " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Trocando de canal (pra baixo): " + canal);
    }
}
