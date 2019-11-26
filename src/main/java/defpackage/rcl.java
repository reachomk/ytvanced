package defpackage;

/* renamed from: rcl */
public final class rcl extends rhf {
    private final boolean d;

    public rcl(qui qui, String str, String str2, qpa qpa, int i) {
        super(qui, str, str2, qpa, i, 61);
        this.d = qui.p;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        long longValue = ((Long) this.c.invoke(null, new Object[]{this.a.a, Boolean.valueOf(this.d)})).longValue();
        synchronized (this.b) {
            this.b.O = Long.valueOf(longValue);
        }
    }
}
