public class PetService {

    private static final double BASE_FEE = 50.0;
    private static final double VACCINATION_FEE = 25.0;
    private static final double GROOMING_FEE = 30.0;

    public double calculateFee() {
        return BASE_FEE;
    }

    public double calculateFee(boolean withVaccination) {
        if (withVaccination) {
            return BASE_FEE + VACCINATION_FEE;
        }
        return BASE_FEE;
    }

    public double calculateFee(boolean withVaccination, boolean withGrooming) {
        double totalFee = BASE_FEE;
        if (withVaccination) {
            totalFee += VACCINATION_FEE;
        }
        if (withGrooming) {
            totalFee += GROOMING_FEE;
        }
        return totalFee;
    }

    public double calculateFee(String emergencyType) {
        return 200.0;
    }
}
