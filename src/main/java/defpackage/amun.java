package defpackage;

/* renamed from: amun */
final class amun extends amry {
    private final amul a;

    amun(amul amul, int i) {
        super(amul.size(), i);
        this.a = amul;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(int i) {
        return this.a.get(i);
    }
}
