package defpackage;

/* renamed from: bags */
final class bags implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ bagn b;

    bags(bagn bagn, boolean z) {
        this.b = bagn;
        this.a = z;
    }

    public final void run() {
        if (this.a || this.b.h != null) {
            this.b.a().setVisibility(bagn.a(this.a));
        }
    }
}
