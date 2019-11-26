package defpackage;

/* renamed from: rcf */
public final class rcf extends rhf {
    private static volatile Long d;
    private static final Object e = new Object();

    public rcf(qui qui, String str, String str2, qpa qpa, int i) {
        super(qui, str, str2, qpa, i, 22);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = (Long) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.l = d;
        }
    }
}
