package defpackage;

/* renamed from: xtn */
final /* synthetic */ class xtn implements Runnable {
    private final xto a;

    xtn(xto xto) {
        this.a = xto;
    }

    public final void run() {
        this.a.get();
    }
}
