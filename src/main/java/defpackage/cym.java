package defpackage;

/* renamed from: cym */
final class cym extends cma {
    protected cym() {
        super("EmptyComponent");
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        return (cls) cls.a(cmg).c();
    }

    public final boolean a(cma cma) {
        boolean z = true;
        if (this != cma) {
            if (cma != null) {
                return getClass() == cma.getClass() ? z : false;
            } else {
                z = false;
            }
        }
    }
}
