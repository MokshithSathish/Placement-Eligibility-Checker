public class PlacementEngine {
    public void evaluate(Candidate candidate, Job job, EligibilityRule[] rules) {
        System.out.println("================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("================================");
        System.out.println();

        System.out.println("Candidate : " + candidate.getName());
        System.out.println("Company   : " + job.getCompany());
        System.out.println("Role      : " + job.getRole());
        System.out.println();

        boolean eligible = true;

        for (int i = 0; i < rules.length; i++) {
            boolean passed = rules[i].check(candidate, job);

            if (passed) {
                System.out.println(rules[i].getRuleName() + " : PASS");
            } else {
                System.out.println(rules[i].getRuleName() + " : FAIL");
                eligible = false;
            }
        }

        System.out.println();

        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        System.out.println("================================");
    }
}

