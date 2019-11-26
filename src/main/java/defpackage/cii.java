package defpackage;

/* renamed from: cii */
final class cii extends cif {
    private volatile boolean a;

    cii() {
    }

    public final void b() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }

    public final void a(boolean z) {
        this.a = z;
    }
}
