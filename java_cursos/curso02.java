public class curso02 {
    public static void main(String[] args) {
        
        //==  >  <  >=  <=  !=  !(true/false)

        int nota = 70 ;
        int media = 60;

        if (nota >= media) {
            System.out.println("aprovado");
        }else if (nota >= 40) {
            System.out.println("recuperacao");
        }
        else{
            System.out.println("reprovado");
        }
        System.out.println("fim do programa");

    }
}
