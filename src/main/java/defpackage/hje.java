package defpackage;

/* renamed from: hje */
final /* synthetic */ class hje implements Runnable {
    private final hja a;
    private final boolean b;

    hje(hja hja, boolean z) {
        this.a = hja;
        this.b = z;
    }

    public final void run() {
        this.a.a(true, this.b);
    }
}
