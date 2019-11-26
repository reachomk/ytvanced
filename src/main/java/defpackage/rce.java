package defpackage;

/* renamed from: rce */
public final class rce extends rhf {
    private final long d;

    public rce(qui qui, String str, String str2, qpa qpa, long j, int i) {
        super(qui, str, str2, qpa, i, 25);
        this.d = j;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        long longValue = ((Long) this.c.invoke(null, new Object[0])).longValue();
        synchronized (this.b) {
            this.b.T = Long.valueOf(longValue);
            long j = this.d;
            if (j != 0) {
                this.b.j = Long.valueOf(longValue - j);
                this.b.m = Long.valueOf(this.d);
            }
        }
    }
}
