package defpackage;

/* renamed from: bcmp */
public final class bcmp implements Runnable {
    private final /* synthetic */ bcov a;
    private final /* synthetic */ bcko b;

    public bcmp(bcov bcov, bcko bcko) {
        this.a = bcov;
        this.b = bcko;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
