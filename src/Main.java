public class Main {
    public static void main(String[] args) {
        System.out.println("---------------");
        usoIf(-2);
        System.out.println("---------------");
        usoWhile(-3);
        System.out.println("---------------");
        usoDoWhile(1);
        System.out.println("---------------");
        usoFor();
        System.out.println("---------------");
        usoSwitch(1);
        usoSwitch(2);
        usoSwitch(3);
        usoSwitch(4);
        usoSwitch(5);
        System.out.println("---------------");
    }

    public static void usoIf(int numeroIf){
        if(numeroIf < 0){
            System.out.println("El valor es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El valor es positivo");
        } else {
            System.out.println("El valor es 0");
        }
    }

    public static void usoWhile(int numeroWhile){
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }

    public static void usoDoWhile(int numeroDoWhile){
        int detente = 1;
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
            detente = 0;
        }while(detente == 1);
    }

    public static void usoFor(){
        int numeroFor = 0;
        for (int i = 0; numeroFor <= 3;i++){
            System.out.println(numeroFor);
            numeroFor++;
        }
    }

    public static void usoSwitch(int estacion){
        switch (estacion) {
            case 1:
                System.out.println("VERANO");
                break;
            case 2:
                System.out.println("OTOÑO");
                break;
            case 3:
                System.out.println("INVIERNO");
                break;
            case 4:
                System.out.println("PRIMAVERA");
                break;
            default:
                System.out.println("Valor no valido");
        }
    }
}