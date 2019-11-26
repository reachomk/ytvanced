package defpackage;

/* renamed from: bbvb */
public final class bbvb extends bbsp {
    private final bbmj b;

    public bbvb(bbmm bbmm, bbmj bbmj) {
        super(bbmm);
        this.b = bbmj;
    }

    public final void a(bbmo bbmo) {
        try {
            Object a = this.b.a(bbmo);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Operator ");
            stringBuilder.append(this.b);
            stringBuilder.append(" returned a null Observer");
            this.a.b((bbmo) bbow.a(a, stringBuilder.toString()));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
        }
    }
}
