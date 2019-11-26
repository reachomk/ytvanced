package defpackage;

/* renamed from: bcnd */
final class bcnd implements Runnable {
    private final /* synthetic */ bcmw a;

    bcnd(bcmw bcmw) {
        this.a = bcmw;
    }

    public final void run() {
        bcmw bcmw = this.a;
        bcmw.f.add(bcmw.m);
        this.a.f();
    }
}
