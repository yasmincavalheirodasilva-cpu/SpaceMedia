public class VideoEspacial {

    String titulo;
    String formato;

    public VideoEspacial(String titulo, String formato) {
        this.titulo = titulo;
        this.formato = formato;

    }

    public void processar(){
        System.out.println("Processando video" +  titulo + "," + formato);
        
    } 

}