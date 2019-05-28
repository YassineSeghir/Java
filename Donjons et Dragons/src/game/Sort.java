package game;

// Create a class
public class Sort {
    private String[] sorts = {"Fireball", "Waterblade", "Earthwall"};
    private String sort;
    private String philtre;
    private int sortLevel;

    // Create a class constructor
    public Sort() {
        this.sort = sorts[this.getRandom(0, 2)];
        this.sortLevel = 5;
        this.philtre = "Potion de vie";
    }

    //Getter/Setter
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {

        this.sort = sort;
    }

    public int getSortLevel() {

        return sortLevel;
    }

    public void setSortLevel(int sortLevel) {

        this.sortLevel = sortLevel;
    }

    public String getPhiltre() {

        return philtre;
    }

    public void setPhiltre(String philtre) {

        this.philtre = philtre;
    }

    //Méthodes
    @Override
    public String toString() {
        return "Sort{" +
                "sort='" + sort + '\'' +
                ", philtre='" + philtre + '\'' +
                ", sortLevel=" + sortLevel +
                '}';
    }

    private int getRandom(int min, int max) {

        return ((int) (Math.random() * (max - min)) + min);

    }
}


