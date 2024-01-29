public class curso02 {
    public static void main(String[] args) {
        
        //==  >  <  >=  <=  !=  !(true/false)

    int pos = 5;

        switch ( pos) {
            case 1:
                System.out.println("primeiro lugar");
                break;
            case 2:
                System.out.println("segundo lugar");
                break;
            case 3:
                System.out.println("terceiro lugar");
                break;

            case 4 :case 5 :case 6 :
            System.out.println(" premio de partipacao");
            break;
        
            default:
            System.out.println("nao ganhou premio");
            break;
        }

    

    }
}
