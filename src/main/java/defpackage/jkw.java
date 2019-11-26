package defpackage;

/* renamed from: jkw */
final /* synthetic */ class jkw implements Runnable {
    private final jkp a;
    private final String b;
    private final boolean c;
    private final boolean d;

    jkw(jkp jkp, String str, boolean z, boolean z2) {
        this.a = jkp;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final void run() {
        jkp jkp = this.a;
        String str = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        fnp a = jkp.a.a(str, null);
        if (a != null) {
            a.a(z, z2);
        }
    }
}
