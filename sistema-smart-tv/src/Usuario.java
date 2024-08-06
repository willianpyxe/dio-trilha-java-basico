public class Usuario {
    
    public static void main(String[] args) throws Exception {
        
        Smartv smartv = new Smartv();

        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.aumentarVolumet();

        System.out.println("Canal Atual: " + smartv.canal);

        smartv.mudarCanal(13);

        System.out.println("Canal Atual: " + smartv.canal);

        System.out.println("Volume Atual: " + smartv.volume);

        System.out.println("TV Ligada ? " + smartv.ligada);
        System.out.println("Canal Atual : " + smartv.canal);
        System.out.println("Volume Atual : " + smartv.volume);

        smartv.ligar();
        System.out.println("Novo Status - TV Ligada ? " + smartv.ligada);

        smartv.desligar();
        System.out.println("TV Ligada ? " + smartv.ligada);
    }
}
