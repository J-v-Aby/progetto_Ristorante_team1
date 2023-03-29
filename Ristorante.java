public class Ristorante {
    public static void main(String[] args) {
        dessert();



    }

    private static void dessert(){
        Dessert dessert1=new Dessert("Creme Brulee", 2.30f);
        Dessert dessert2=new Dessert("Cheesecake alle albicocche", 5.90f);
        Dessert dessert3=new Dessert("Coppette agli amaretti", 7.40f);
        Dessert dessert4=new Dessert("Sfoglia con Ananas sciroppata", 6.38f);
        Dessert dessert5=new Dessert("Macedonia di Anguria", 3.99f);



        System.out.println( dessert1.getNome()+" "+ "euro: "+dessert1.getPrezzo());
        System.out.println( dessert2.getNome()+" "+ "euro: "+dessert2.getPrezzo());
        System.out.println( dessert3.getNome()+" "+ "euro: "+dessert3.getPrezzo());
        System.out.println( dessert4.getNome()+" "+ "euro: "+dessert4.getPrezzo());
        System.out.println( dessert5.getNome()+" "+ "euro: "+dessert5.getPrezzo());
    }

}
