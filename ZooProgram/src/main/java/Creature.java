public abstract class Creature {
    protected String type;
    protected String name;

    public Creature(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Type='" + type + '\'' +
                ", name='" + name + '\'';
    }

    abstract void breathe();

    abstract void move();

    public void printInfo() {
        this.move();
        this.breathe();
    }

}
