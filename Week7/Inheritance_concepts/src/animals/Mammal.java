package animals;

public class Mammal extends Animal{

    /**
     * @param species
     * @param habitat
     * @param age
     * @param hasFur
     */
    
    private boolean hasFur;

    public Mammal(String species, String habitat, int age, boolean hasFur) {
        super(species, habitat, age);
        this.hasFur = hasFur;
    }

    public boolean getHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
