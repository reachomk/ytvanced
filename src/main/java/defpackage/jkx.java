package defpackage;

/* renamed from: jkx */
final /* synthetic */ class jkx implements Runnable {
    private final jkp a;
    private final String b;
    private final int c;

    jkx(jkp jkp, String str, int i) {
        this.a = jkp;
        this.b = str;
        this.c = i;
    }

    public final void run() {
        jkp jkp = this.a;
        String str = this.b;
        int i = this.c;
        fnp a = jkp.a.a(str, null);
        if (a != null) {
            a.a(i);
            jkp.a.a(a);
        }
    }
}
