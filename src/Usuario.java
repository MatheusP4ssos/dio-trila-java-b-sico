public class Usuario {
    public static void main(String[] args) throws Exception {
     
        
        SmartTV smartTV = new SmartTV();
        System.out.println("TV ligada ?" + smartTV.ligada);
        System.out.println("Volume atua?" + smartTV.volume);
        System.out.println("Canal atual? " + smartTV.canal);

smartTV.selecionarCanal(13);


        smartTV.avançarCanal();
System.out.println("nOVO STATUS -> Canal atual" + smartTV.canal);


        smartTV.aumentarVolume();
System.out.println("Novo status -> Volume atual" + smartTV.volume);

        smartTV.ligar ();
System.out.println("Novo status -> TV ligada ?" + smartTV.ligada);

smartTV.desligar();
System.out.println("Novo status -> TV ligada ?" + smartTV.ligada);
    }
}


