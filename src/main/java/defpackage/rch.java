package defpackage;

/* renamed from: rch */
public final class rch extends rhf {
    private static volatile String d;
    private static final Object e = new Object();

    public rch(qui qui, String str, String str2, qpa qpa, int i) {
        super(qui, str, str2, qpa, i, 1);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.b.a = "E";
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = (String) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.a = d;
        }
    }
}
