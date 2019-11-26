package defpackage;

/* renamed from: jvg */
final /* synthetic */ class jvg implements Runnable {
    private final jvf a;
    private final int b;

    jvg(jvf jvf, int i) {
        this.a = jvf;
        this.b = i;
    }

    public final void run() {
        jvf jvf = this.a;
        int i = this.b;
        jvc jvc = jvf.g;
        if (jvc != null) {
            jvc.a(i, false);
            fgv fgv = jvf.h;
            if (fgv != null) {
                fgv.a();
                jvf.h = null;
            }
        }
    }
}
