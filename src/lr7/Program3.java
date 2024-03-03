package lr7;

class Praded {
    public int leschei;

    public Praded(int leschei) {
        this.leschei = leschei;
    }

    public void set(int leschei) {
        this.leschei = leschei;
    }

    @Override
    public String toString() {
        return "Praded{" +
                "leschei=" + leschei +
                '}';
    }
}

class Ded extends Praded {
    public char zvuk;

    public Ded(char zvuk, int leschei) {
        super(leschei);
        this.zvuk = zvuk;
    }

    public void set(char zvuk, int leschei) {
        this.set(leschei);
        this.zvuk = zvuk;
    }

    @Override
    public void set(int leschei) {
        super.set(leschei);
    }

    @Override
    public String toString() {
        return "Ded{" +
                "leschei=" + leschei +
                ", zvuk=" + zvuk +
                '}';
    }
}

class Otech extends Ded {
    public String slovo;

    public Otech(String slovo, char zvuk, int leschei) {
        super(zvuk, leschei);
        this.slovo = slovo;
    }

    public void set(String slovo, char zvuk, int leschei) {
        this.set(zvuk, leschei);
        this.slovo = slovo;
    }

    @Override
    public void set(char zvuk, int leschei) {
        super.set(zvuk, leschei);
    }

    @Override
    public String toString() {
        return "Otech{" +
                "leschei=" + leschei +
                ", zvuk=" + zvuk +
                ", slovo='" + slovo + '\'' +
                '}';
    }
}

public class Program3 {
    private static Otech otech = new Otech("bla-bla-bla", 'h', 3);

    public static void main(String[] args) {
        System.out.println(otech);
    }
}
