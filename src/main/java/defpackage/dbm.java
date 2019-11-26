package defpackage;

import com.facebook.litho.ComponentTree;

/* renamed from: dbm */
final /* synthetic */ class dbm implements Runnable {
    private final cpq a;

    public dbm(cpq cpq) {
        this.a = cpq;
    }

    public final void run() {
        cpq cpq = this.a;
        ComponentTree componentTree = cpq.t;
        if (componentTree != null) {
            cpg cpg = componentTree.w;
            if (cpg != null) {
                int d = cpg.d();
                for (int i = 0; i < d; i++) {
                    coj coj = cpg.c(i).g;
                    if (coj != null) {
                        boolean d2 = cno.d();
                        if (d2) {
                            cno.a();
                        }
                        if (cok.g == null) {
                            cok.g = new cpn();
                        }
                        cok.g.a = cpq;
                        coj.a(cok.g);
                        cok.g.a = null;
                        if (d2) {
                            cno.c();
                        }
                    }
                }
            }
        }
    }
}
