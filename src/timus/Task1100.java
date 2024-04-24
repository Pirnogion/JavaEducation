package timus;

import java.io.PrintWriter;
import java.util.*;

public class Task1100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        List<Team> records = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            records.add(new Team(in.nextInt(), in.nextInt()));
        }

        records.sort(Collections.reverseOrder(Comparator.comparingInt(a -> a.score)));

        for (Team team: records) {
            out.println(team.id + " " + team.score);
        }

        out.flush();
        out.close();
        in.close();
    }

    public static class Team {
        public int id, score;

        public Team(int id, int score) {
            this.id = id; this.score = score;
        }
    }
}
