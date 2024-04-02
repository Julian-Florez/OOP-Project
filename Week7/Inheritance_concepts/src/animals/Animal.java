package animals;
public class Animal {

    /**
     * @param species
     * @param habitat
     * @param age
     */
    
    protected String species;
    protected String habitat;
    protected int age;

    public Animal(String species, String habitat, int age) {
        this.species = species;
        this.habitat = habitat;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getAge() {
        return age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return species + ": " + age;
    }
}
