package defpackage;

/* renamed from: jkz */
final /* synthetic */ class jkz implements Runnable {
    private final jkp a;
    private final String b;

    jkz(jkp jkp, String str) {
        this.a = jkp;
        this.b = str;
    }

    public final void run() {
        jkp jkp = this.a;
        fnp a = jkp.a.a(this.b, null);
        if (a != null) {
            a.a();
            jkp.a.a(a);
        }
    }
}
