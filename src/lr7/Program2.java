package lr7;

class StringWrapper {
    private String string;

    public StringWrapper(String string) {
        this.string = string;
    }

    public void setString() {
        this.string = "";
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getLength() {
        return this.string.length();
    }
}

class StringId extends StringWrapper {
    public int id;

    public StringId(int id, String string) {
        super("*" + string);
        this.id = id;
    }

    public void setId(int id) {
        this.setString("*");
        this.id = id;
    }

    public void setId(int id, String string) {
        this.setString("*" + string);
        this.id = id;
    }

    @Override
    public void setString() {
        super.setString("*");
        this.id = -1;
    }

    @Override
    public void setString(String string) {
        super.setString("*" + string);
        this.id = -1;
    }

    @Override
    public String toString() {
        return "StringId{" + "id=" + id + ", length=" + this.getLength() + '}';
    }
}

public class Program2 {
    private static StringId id1 = new StringId(2, "Aleksey");
    private static StringId id2 = new StringId(11, "Ivanovich");

    public static void main(String[] args) {
        System.out.println(id1);
        System.out.println(id2);
    }
}
