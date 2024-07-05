class Class3 extends BaseClass implements Printable {
    private String description;

    public Class3(String name, String description) {
        super(name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("Class3: name=" + getName() + ", description=" + description);
    }
}
