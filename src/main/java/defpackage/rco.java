package defpackage;

/* renamed from: rco */
public final class rco extends rhf {
    private final StackTraceElement[] d;

    public rco(qui qui, String str, String str2, qpa qpa, int i, StackTraceElement[] stackTraceElementArr) {
        super(qui, str, str2, qpa, i, 45);
        this.d = stackTraceElementArr;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        if (this.d != null) {
            qto qto = new qto((String) this.c.invoke(null, new Object[]{r0}));
            synchronized (this.b) {
                this.b.B = qto.a;
                if (qto.b.booleanValue()) {
                    this.b.J = Integer.valueOf(qto.c.booleanValue() ^ 1);
                } else {
                    this.b.J = Integer.valueOf(2);
                }
            }
        }
    }
}
