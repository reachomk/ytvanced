package defpackage;

/* renamed from: jxd */
final /* synthetic */ class jxd implements Runnable {
    private final jxa a;

    jxd(jxa jxa) {
        this.a = jxa;
    }

    public final void run() {
        jxa jxa = this.a;
        if (jxa.e != null && jxa.d.getLineCount() >= 2 && jxa.d.getLineCount() + jxa.c.getLineCount() >= 4) {
            jxa.d.a(jxa.a(jxa.e(jxa.e), null));
        }
    }
}
