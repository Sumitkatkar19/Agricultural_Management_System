
import java.util.*;
public class Goat {

    private String id;
    private int age;
    private String gender;
    private String genetics;
    private double weight;
    private Date dob;

    public Goat(String id, int age, String gender, String genetics, double weight, Date dob) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.genetics = genetics;
        this.weight = weight;
        this.dob = dob;
    }
    // getters and setters for all the fields
    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setage(int age)
    {
        this.age= age;
    }

    public int getage()
    {
        return age;
    }
    public void setgender(String gender)
    {
        this.gender= gender;
    }

    public String getgender()
    {
        return gender;
    }
    public void setgenetics(String genetics)
    {
        this.genetics= genetics;
    }

    public String getgenetics()
    {
        return genetics;
    }
    public void setweight(double weight)
    {
        this.weight= weight;
    }

    public double getweight()
    {
        return weight;
    }
    public void setweight(Date dob)
    {
        this.dob= dob;
    }

    public Date getdob()
    {
        return dob;
    }
}


class GoatFarming {
    private List<Goat> goats;

    public GoatFarming() {
        this.goats = new ArrayList<Goat>();
    }

    public void addGoat(Goat goat) {
        this.goats.add(goat);
    }

    public void displayAgeCategory(int minAge, int maxAge) {
        for (Goat goat : this.goats) {
            if (goat.getage() >= minAge && goat.getage() < maxAge) {
                System.out.println(goat.getId() + " " + goat.getage() + " months old");
            }
        }
    }

    public void displayGenetics(String genetics) {
        for (Goat goat : this.goats) {
            if (goat.getgenetics().equals(genetics)) {
                System.out.println(goat.getId() + " " + goat.getgenetics());
            }
        }
    }

    public void displayMaleFemaleCount() {
        int maleCount = 0;
        int femaleCount = 0;
        for (Goat goat : this.goats) {
            if (goat.getgender().equals("male")) {
                maleCount++;
            }
            else
            {
                femaleCount++;
            }
        }
        System.out.println("Total males: " + maleCount);
        System.out.println("Total females: " + femaleCount);
    }

    public void displayAgeWeight(String id) {
        for (Goat goat : this.goats) {
            if (goat.getId().equals(id)) {
                System.out.println(goat.getId() + " " + goat.getage() + " months old " + goat.getweight() + " kg");
            }
        }
    }

    public static void main(String[] args) {
        // create some goats and add them to the farm

        Goat goat1 = new Goat("A", 12, "male", "pregnant", 23.5, new Date(2022, 1, 1));
        Goat goat2 = new Goat("B", 8, "female", "mulching", 20.3, new Date(2022, 5, 1));
        Goat goat3 = new Goat("C", 4, "male", "dry", 18.7, new Date(2023, 2, 1));
        GoatFarming farm = new GoatFarming();
        farm.addGoat(goat1);
        farm.addGoat(goat2);
        farm.addGoat(goat3);

        // test the various methods
        farm.displayAgeCategory(0, 3); // display goats aged 0-3 months
        farm.displayGenetics("pregnant"); // display all pregnant goats
        farm.displayMaleFemaleCount(); // display male/female count
        farm.displayAgeWeight("weigth=" );


    }

}

