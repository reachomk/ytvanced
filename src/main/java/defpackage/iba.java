package defpackage;

/* renamed from: iba */
abstract class iba {
    private boolean a;

    iba() {
    }

    public abstract void d(boolean z);

    public abstract void e(boolean z);

    public abstract boolean f(boolean z);

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        a(true);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        if (this.a) {
            b(z);
        } else {
            c(z);
        }
    }

    public final void b(boolean z) {
        a(z, true);
    }

    public final void c(boolean z) {
        a(z, false);
    }

    private final void a(boolean z, boolean z2) {
        this.a = z2;
        if (f(z2)) {
            d(z);
        } else {
            e(z);
        }
    }
}
