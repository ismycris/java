public class curso02 {
    public static void main(String[] args) {
        
        //==  >  <  >=  <=  !=  !(true/false)

        int nota = 70 ;
        int faltas = 10;
        int maxFaltas = 5;
        int media = 60;
        //tabela verdade AND
        /*  v v = v
            v f = f
            f v = f
            f f = f
         */

        if (nota >= media && faltas<= maxFaltas) {
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
