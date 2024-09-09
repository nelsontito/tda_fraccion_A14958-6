import java.util.Random;

public class main{
    static Random random = new Random();

    static int generarNumeroAleatorio(int extremoInferior, int extremoSuperior){

        return random.nextInt((extremoSuperior - extremoInferior));
    }

    public static void main(String[] args) {
        fraccion fraccion1 = new fraccion(generarNumeroAleatorio(1, 10), generarNumeroAleatorio(1,10));
        fraccion fraccion2 = new fraccion(generarNumeroAleatorio(1, 10), generarNumeroAleatorio(1, 10));
        System.out.println();
        System.out.println();
        System.out.println("*******Pruebas a realizar para su respuesta*****");
        System.out.println();

        System.out.print("fraccion 1: "+ fraccion1.toString());
        System.out.print("fraccion 2: "+ fraccion2.toString());

        fraccion fraccionSuma = fraccion1.suma(fraccion1, fraccion2);
        System.out.println("fraccion suma : " + fraccionSuma.toString());

        fraccion fraccionResta = fraccion1.resta(fraccion1, fraccion2);
        System.out.println("fraccion resta : " + fraccionResta.toString());

        fraccion fraccionMultiplicacion = fraccion1.multiplicacion(fraccion1, fraccion2);
        System.out.println("fraccion multiplicacion : " + fraccionMultiplicacion.toString());
        
        fraccion fraccionDivision = fraccion1.division(fraccion1, fraccion2);
        System.out.println("fraccion division : " + fraccionDivision.toString());
    }
}