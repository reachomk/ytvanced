package defpackage;

/* renamed from: bcng */
final class bcng implements Runnable {
    private final /* synthetic */ bcmw a;

    bcng(bcmw bcmw) {
        this.a = bcmw;
    }

    public final void run() {
        bcmw bcmw = this.a;
        bcmw.m = bcmw.p;
        bcmw.p = null;
        bcmw.f();
    }
}
