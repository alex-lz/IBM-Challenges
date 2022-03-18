public enum Letter {
    A(0), B(1), C(2), D(3), E(4), F(5),
    G(6), H(7), I(8), J(9), K(10);

    public final Integer label;

    private Letter(Integer label) {
        this.label = label;
    }

    public static Letter valueOfLabel(Integer label) {
        for (Letter e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }

    public static Letter valueOfLabel2(String label) {
        for (Letter e : values()) {
            if (e.equals(label)) {
                return e;
            }
        }
        return null;
    }
}
