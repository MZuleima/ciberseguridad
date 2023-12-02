import java.util.Scanner;
    class ejercicio7{
        public static void main(String[] args) {
            String contraseña;
            Scanner myObj = new Scanner(System.in);
            System.out. println("Introduce la contraseña");
            int i=1;
            while(i<=3) {
                contraseña = myObj.nextLine();
                if (contraseña.equals("Admin")) {
                    System.out.println("Enhorabuena"); 
                    break;
                } 
                else{
                    System.out.println("Contraseña incorrecta, introducela de nuevo:");
                    i++;
                }
                  
            }
        }
}
