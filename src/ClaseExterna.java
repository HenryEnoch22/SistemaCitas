public class ClaseExterna {
    private String nombre = "Morales";

    public void metodoExtero(){
        class ClaseLocal{
            public void saludar(){
                System.out.println("Saludando a " + nombre);
            }
        }
        ClaseLocal cl = new ClaseLocal();
        cl.saludar();
    }

    Maestro ejemplo1 = new Maestro(){
        public void saludar(){
            System.out.println("Hola");
        }
    };

//    public class ClaseInterna {
//        public void salidar(){
//            System.out.println("Hola");
//        }
//    }
}
