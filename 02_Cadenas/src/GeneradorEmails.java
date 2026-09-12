public class GeneradorEmails {
    static void main() {
        //Ejercicio Generador de Emails
        System.out.println("*** Generador de Emails ***");

        //Nombre del Usuario
        var nombre = "Ignacio";
        var segundoNombre = "Ramón";
        var apellido = "Roldán";
        var nombreUsuario = new StringBuilder();
        nombreUsuario.append(nombre).append(" ").append(segundoNombre).append(" ").append(apellido);
        var usuario = nombreUsuario.toString().strip();
        var subNombre = nombre.substring(0,3);
        var nuevoNombre = "oct";
        var numero = "36";
        var email = String.join(".", subNombre, nuevoNombre, numero).toLowerCase();

        //Extension del dominio
        var nombreEmpresa = "\tLa Veranada";
        var extensionDominio1 = "@gmail";
        var extensionDominio2 = ".com";
        var extensionDominioFinal = new StringBuffer();
        extensionDominioFinal.append(extensionDominio1).append(extensionDominio2);
        var dominioEmailNormalizado = extensionDominioFinal.toString();

        //Email Final
        var emailFinal = email + dominioEmailNormalizado;

        //se imprime
        System.out.println("Nombre Usuario = " + usuario);
        System.out.println("Nombre Usuario Normalizado = " + email);
        System.out.println("\nNombre Empresa = " + nombreEmpresa);
        System.out.println("Extensión del Dominio = " + extensionDominio2);
        System.out.println("Dominio del Email Normalizado = " + dominioEmailNormalizado);
        System.out.println("\nEmail Final Generado = " + emailFinal);
    }
}
