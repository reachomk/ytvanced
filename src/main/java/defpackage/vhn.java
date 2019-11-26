package defpackage;

/* renamed from: vhn */
final /* synthetic */ class vhn implements Runnable {
    private final vhk a;
    private final vhq b;
    private final boolean c;

    vhn(vhk vhk, vhq vhq, boolean z) {
        this.a = vhk;
        this.b = vhq;
        this.c = z;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
