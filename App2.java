

public class App2 {
    public static void main(String[] args) {
         
        if (args.length !=3) {
                
            System.out.println( "Uso correcto: java App <operando1> <operador> <operando2>");
            System.out.println(args.length);
            System.exit(1);

        }


        int resultado = 0;

        try {
            int numero1 = Integer.parseInt(args[0]);
            int numero2 = Integer.parseInt(args[2]);
            char operador = args[1].charAt(0);
            

            switch (operador) {
                case '+': 
                    resultado = numero1 + numero2;
                    break;

                case '-': 
                    resultado = numero1 - numero2;
                    break;

                case 'x': 
                    resultado = numero1 * numero2;
                    break;

                case '/': 
                    if (numero2 == 0) { 
                        System.out.println("ERROR!: Division por cero");
                        System.exit(1);
                    }
                    resultado = numero1 / numero2;
                    break;
                
                default:
                    System.out.println("ERROR!: Operador invalido");
                    System.exit(1);
            }
            
            System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + resultado);
        
        } catch (NumberFormatException n) {
            System.out.println("ERROR!: los operandos debe de ser numeros enteros");
            System.exit(1);
        }

    
    }

}

