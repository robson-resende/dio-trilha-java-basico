public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Método ligar/desligar TV
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    //Método mudar de canal da TV
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando canal: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo canal: " + canal);
    }

    //Método aumentar/diminuir volume da TV
    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

   
}