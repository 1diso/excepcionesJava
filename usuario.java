public class usuario {

   private int id;
   private String email,contraseña;

   public usuario(int id, String email, String contraseña) throws emailException
   {
        this.contraseña=contraseña;
        this.id=id;
        if(email.contains("@")){
            this.email=email;
        }
        else{
            throw new emailException("El correo no es valido");
        }
    
   }

   public static void main(String[] args) throws emailException
    {
    usuario user = new usuario(1, "correo_hotmail.com", "1234asd");

   }
    
}
