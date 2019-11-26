package defpackage;

/* renamed from: ctc */
public final class ctc extends cma {
    public static final aaa b = new aaa(2);
    public cma a;

    private ctc() {
        super("Wrapper");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        return this;
    }

    public static ctb a(cmg cmg) {
        ctb ctb = (ctb) b.a();
        if (ctb == null) {
            ctb = new ctb();
        }
        ctb.a(ctb, cmg, new ctc());
        return ctb;
    }

    /* Access modifiers changed, original: protected|final */
    public final cmn c(cmg cmg) {
        cma cma = this.a;
        if (cma == null) {
            return cmg.a;
        }
        return cmg.a(cma);
    }

    public final boolean a(cma cma) {
        if (this == cma) {
            return true;
        }
        if (cma == null || getClass() != cma.getClass()) {
            return false;
        }
        ctc ctc = (ctc) cma;
        if (this.j != ctc.j) {
            cma cma2 = this.a;
            cma = ctc.a;
            return cma2 == null ? cma == null : cma2.equals(cma);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final cma c() {
        return this.a;
    }
}
