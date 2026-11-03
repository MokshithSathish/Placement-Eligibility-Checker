import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        Candidate candidate = new Candidate(
            name,
            percentage,
            backlogs,
            graduationYear
        );

        Job job = new Job(
            "Infosys",
            "Java Developer",
            65.0,
            0,
            2026
        );

        EligibilityRule[] rules = {
            new PercentageRule(),
            new BacklogRule(),
            new GraduationYearRule()
        };

        PlacementEngine engine = new PlacementEngine();
        engine.evaluate(candidate, job, rules);

        scanner.close();
    }
}
