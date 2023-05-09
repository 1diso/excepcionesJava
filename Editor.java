import java.io.IOException;
//ejercicio 2 propagacion
public class Editor {

      public void imprimir() throws IOException
        {
            Archivo archivo1= new Archivo();
            String cadena=archivo1.LeerArchivo("D://miarchivoo.txt");
            System.out.println(cadena);

        }
}
