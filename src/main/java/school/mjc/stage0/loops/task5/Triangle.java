package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= cathetusLength; i++) {
            sb.append("8".repeat(i));
            sb.append(" ".repeat(cathetusLength - i));
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
