package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        StringBuilder sb = new StringBuilder();
        int eights;
        for (eights = height; eights > 1; eights -= 2) {
            int fills = (height - eights) / 2;
            sb.append(" ".repeat(fills));
            sb.append("8".repeat(eights));
            sb.append(" ".repeat(fills));
            sb.append("\n");
        }
        if (eights == 1) {
            int fills = (height - eights) / 2;
            sb.append(" ".repeat(fills));
            sb.append("8".repeat(eights));
            sb.append(" ".repeat(fills));
            sb.append("\n");
        }
        for (eights = eights + 2; eights <= height; eights += 2) {
            int fills = (height - eights) / 2;
            sb.append(" ".repeat(fills));
            sb.append("8".repeat(eights));
            sb.append(" ".repeat(fills));
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
