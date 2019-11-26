package defpackage;

/* renamed from: amui */
final class amui extends amut {
    public static final long serialVersionUID = 0;

    amui(amug amug) {
        super(amug);
    }

    /* Access modifiers changed, original: final */
    public final Object readResolve() {
        return a(new amuf());
    }
}
