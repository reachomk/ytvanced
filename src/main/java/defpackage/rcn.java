package defpackage;

/* renamed from: rcn */
public final class rcn extends rhf {
    public rcn(qui qui, String str, String str2, qpa qpa, int i) {
        super(qui, str, str2, qpa, i, 51);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        synchronized (this.b) {
            qtt qtt = new qtt((String) this.c.invoke(null, new Object[0]));
            qpa qpa = this.b;
            qpa.G = qtt.a;
            qpa.H = qtt.b;
        }
    }
}
