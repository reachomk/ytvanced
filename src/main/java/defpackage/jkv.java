package defpackage;

/* renamed from: jkv */
final /* synthetic */ class jkv implements Runnable {
    private final jkp a;
    private final String b;
    private final amec c;

    jkv(jkp jkp, String str, amec amec) {
        this.a = jkp;
        this.b = str;
        this.c = amec;
    }

    public final void run() {
        jkp jkp = this.a;
        String str = this.b;
        amec amec = this.c;
        fnp a = jkp.a.a(str, null);
        if (a != null) {
            a.a(amec);
            jkp.a.a(a);
        }
    }
}
