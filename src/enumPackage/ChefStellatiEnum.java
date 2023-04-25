package enumPackage;

public enum ChefStellatiEnum {


    MARCUS_SAMUELSSON ( "Marcus Samuelsson"),
    MARIO_PARMEGGIANI("Mario Parmeggiani"),
    VICKY_LAU(" Vicky Lau");


  private  String nomeChef;
   ChefStellatiEnum(String nomeChef) {
        this.nomeChef = nomeChef;

    }

    public String getNomeChef() {
        return nomeChef;
    }
}
