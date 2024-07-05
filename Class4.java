class Class4 extends BaseClass implements Printable {
    private double value;

    public Class4(String name, double value) {
        super(name);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void print() {
        System.out.println("Class4: name=" + getName() + ", value=" + value);
    }
}