public class App2 {
    public static void main(String[] args) {
         
        if (args.length != 3) {
            System.out.println("Uso correcto: java App2 <operando1> <operador> <operando2>");
            System.exit(1);
        }
     
        if (!esNumero(args[0]) || !esNumero(args[2])) {
            System.out.println("ERROR!: Los operandos deben ser números enteros.");
            System.exit(1);
        }

        int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[2]);
        char operador = args[1].charAt(0);
        int resultado = 0;
        
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
                    System.out.println("ERROR!: Division por cero.");
                    System.exit(1);
                }
                resultado = numero1 / numero2;
                break;
            
            default:
                System.out.println("ERROR!: Operador invalido.");
                System.exit(1);
        }
        
        
        System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
    }

 
    public static boolean esNumero(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c) && c != '-') { 
                return false;
            }
        }
        return true;
    }
}
