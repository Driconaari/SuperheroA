
class Superhero {
    private String name;
    private String realName;
    private boolean isHuman;
    private int creationYear;
    private String strength;

    public Superhero(String name, String realName, boolean isHuman, int creationYear, String strength) {
        this.name = name;
        this.realName = realName;
        this.isHuman = isHuman;
        this.creationYear = creationYear;
        this.strength = strength;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getStrength() {
        return strength;
    }
}

class Database {
    private Superhero[] superheroes;
    private int count;

    public Database() {
        superheroes = new Superhero[5]; // You can adjust the size as needed
        count = 0;
    }

    public void addSuperhero(Superhero superhero) {
        if (count < superheroes.length) {
            superheroes[count++] = superhero;
        } else {
            System.out.println("Database is full. Cannot add more superheroes.");
        }
    }
}
