package defpackage;

/* renamed from: al */
final class al implements Runnable {
    private final /* synthetic */ am a;

    al(am amVar) {
        this.a = amVar;
    }

    public final void run() {
        Object obj;
        synchronized (this.a.a) {
            obj = this.a.e;
            this.a.e = am.b;
        }
        this.a.a(obj);
    }
}
