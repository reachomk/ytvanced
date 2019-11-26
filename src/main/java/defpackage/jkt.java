package defpackage;

/* renamed from: jkt */
final /* synthetic */ class jkt implements Runnable {
    private final jkp a;
    private final String b;
    private final double c;

    jkt(jkp jkp, String str, double d) {
        this.a = jkp;
        this.b = str;
        this.c = d;
    }

    public final void run() {
        jkp jkp = this.a;
        String str = this.b;
        double d = this.c;
        fnp a = jkp.a.a(str, null);
        if (a != null) {
            a.i = d;
            jkp.a.a(a);
        }
    }
}
