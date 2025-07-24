package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum PaymentType {
        DEBIT_CARD {
            @Override
            public double calculateDiscount(double value) {
                return value * 0.1;
            }
        },
    CREDIT_CARD {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
    };
    public abstract double calculateDiscount(double value);
    }
