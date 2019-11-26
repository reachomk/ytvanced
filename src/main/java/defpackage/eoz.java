package defpackage;

/* renamed from: eoz */
final class eoz {
    private eow a;
    private boolean b;

    eoz() {
    }

    /* Access modifiers changed, original: final */
    public final void a(eow eow) {
        this.a = eow;
        this.b = false;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            eow eow = this.a;
            if (eow != null) {
                eow.a(z);
            }
        }
    }
}
