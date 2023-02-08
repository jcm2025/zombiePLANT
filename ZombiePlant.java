public class ZombiePlant {

    private final int treatmentPotency;
    private int treatmentsNecessary;


    public ZombiePlant(int treatmentPotency, int treatmentsNecessary) {
        this.treatmentPotency = treatmentPotency;
        this.treatmentsNecessary = treatmentsNecessary;
    }

    public int treatmentsNeeded(){
        return treatmentsNecessary;
    }

    public int getPotencyRequired(){
        return treatmentPotency;
    }

    public boolean isDangerous() {
//      return true if
        return treatmentsNecessary >= 1;
    }


    public void treat(int potencyInput) {
        if (treatmentsNecessary != 0 && 0 < potencyInput) {
            if (treatmentPotency >= potencyInput) {
                treatmentsNecessary -= 1;
            }
        }
        if (treatmentsNecessary == 0 && potencyInput > treatmentPotency) {
            treatmentsNecessary += 1;
        }
    }

}