package defpackage;

/* renamed from: rda */
public final class rda extends rhf {
    public rda(qui qui, String str, String str2, qpa qpa, int i) {
        super(qui, str, str2, qpa, i, 48);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.b.E = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.c.invoke(null, new Object[]{this.a.a})).booleanValue();
        synchronized (this.b) {
            if (booleanValue) {
                this.b.E = Integer.valueOf(1);
            } else {
                this.b.E = Integer.valueOf(0);
            }
        }
    }
}
