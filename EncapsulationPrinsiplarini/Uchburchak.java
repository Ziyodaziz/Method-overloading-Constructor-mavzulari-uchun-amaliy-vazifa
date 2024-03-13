package Vazifa.EncapsulationPrinsiplarini;

public class Uchburchak {

        private double uzunlikA;
        private double uzunlikB;
        private double uzunlikC;


        public Uchburchak(double a, double b, double c) {
            this.uzunlikA = a;
            this.uzunlikB = b;
            this.uzunlikC = c;
        }


        public double getUzunlikA() {
            return uzunlikA;
        }

        public void setUzunlikA(double a) {
            this.uzunlikA = a;
        }

        public double getUzunlikB() {
            return uzunlikB;
        }

        public void setUzunlikB(double b) {
            this.uzunlikB = b;
        }

        public double getUzunlikC() {
            return uzunlikC;
        }

        public void setUzunlikC(double c) {
            this.uzunlikC = c;
        }


        public double hisoblaYuz() {
            double s = (uzunlikA * uzunlikB) / 2.0;
            return s;
        }


        public double hisoblaPerimetr() {
            return uzunlikA + uzunlikB + uzunlikC;
        }

}


