package defpackage;

/* renamed from: bagx */
public final class bagx implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ bagn b;

    public bagx(bagn bagn, boolean z) {
        this.b = bagn;
        this.a = z;
    }

    public final void run() {
        this.b.b.setVisibility(bagn.a(this.a));
    }
}
