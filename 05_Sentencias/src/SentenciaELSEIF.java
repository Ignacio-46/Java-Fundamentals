public class SentenciaELSEIF {
    static void main() {
        //Uso de sentencia else
        var edad = 15;
        //Else significa 'caso contrario' cuando el if no es verdadero
        if (edad >= 18){
            System.out.println("Eres un Adulto");
        }
        else if (edad >= 13 && edad <= 18) {
            System.out.println("Eres un Adolescente");
        }
        else {
            System.out.println("Eres un niño");
        }
    }
}
