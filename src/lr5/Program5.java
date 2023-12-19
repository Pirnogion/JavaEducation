package lr5;

public class Program5 {
    public static void main(String[] args) {
        Health health = new Health(50);
        System.out.format("Initial health: %s.\n", health.getHealth());

        health.setHealth();
        System.out.format("Zero health: %s.\n", health.getHealth());

        health.setHealth(63);
        System.out.format("Another health: %s.\n", health.getHealth());

        health.setHealth(500);
        System.out.format("Big health: %s.\n", health.getHealth());
    }

    static class Health {
        private int health;

        public Health(int health) {
            setHealth(health);
        }

        public void setHealth() {
            this.health = 0;
        }

        public void setHealth(int health) {
            this.health = Math.min(health, 100);
        }

        public int getHealth() {
            return health;
        }
    }
}

