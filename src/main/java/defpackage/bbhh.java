package defpackage;

/* renamed from: bbhh */
final class bbhh implements Runnable {
    private final /* synthetic */ bbhk a;
    private final /* synthetic */ bbhj b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ bbhf d;

    bbhh(bbhf bbhf, bbhk bbhk, bbhj bbhj, Object obj) {
        this.d = bbhf;
        this.a = bbhk;
        this.b = bbhj;
        this.c = obj;
    }

    public final void run() {
        synchronized (this.d) {
            if (this.a.b == 0) {
                this.b.a(this.c);
                this.d.a.remove(this.b);
                if (this.d.a.isEmpty()) {
                    this.d.b.shutdown();
                    this.d.b = null;
                }
            }
        }
    }
}
