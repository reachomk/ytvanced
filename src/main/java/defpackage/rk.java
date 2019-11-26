package defpackage;

/* renamed from: rk */
final class rk implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ rj b;

    rk(rj rjVar, Object obj) {
        this.b = rjVar;
        this.a = obj;
    }

    public final void run() {
        rj rjVar = this.b;
        Object obj = this.a;
        if (rjVar.c()) {
            rjVar.b();
        } else {
            rjVar.a(obj);
        }
        rjVar.e = 3;
    }
}
