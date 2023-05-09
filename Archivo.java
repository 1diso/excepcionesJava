import java.io.*;
//ejercicio 2 propagacion
class Archivo {
   public String LeerArchivo(String fileName) throws IOException
   {
      File archivo = new File (fileName);
      FileReader   fr = new FileReader(archivo);
      BufferedReader br = new BufferedReader(fr);
      // Lectura del fichero
      String linea="";
      linea+=br.readLine();
      br.close();

      return linea;

   }
}