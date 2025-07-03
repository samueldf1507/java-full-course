package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum PaymentType {
    DEBITO{
        @Override
        public double calculateDiscount(double value) {
            return value * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
    };

    public abstract double calculateDiscount(double value);
}
