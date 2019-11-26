package defpackage;

/* renamed from: bkh */
final class bkh implements Runnable {
    private final /* synthetic */ bki a;

    bkh(bki bki) {
        this.a = bki;
    }

    public final void run() {
        if (this.a.a != null) {
            bkf bkf = this.a.a;
            Object obj = bkf.a;
            if (obj != null) {
                this.a.a(obj);
                return;
            }
            this.a.a(bkf.b);
        }
    }
}
