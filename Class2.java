class Class2 extends BaseClass implements Printable {
    private int value;

    public Class2(String name, int value) {
        super(name);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void print() {
        System.out.println("Class2: name=" + getName() + ", value=" + value);
    }
}
