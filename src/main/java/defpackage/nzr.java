package defpackage;

/* renamed from: nzr */
final class nzr {
    public oad a;
    public int b;
    public boolean c;
    public int d;

    private nzr() {
    }

    public final void a(int i) {
        this.b += i;
    }

    public final void b(int i) {
        boolean z = true;
        if (!this.c || this.d == 4) {
            this.c = true;
            this.d = i;
            return;
        }
        if (i != 4) {
            z = false;
        }
        oxz.a(z);
    }

    /* synthetic */ nzr(byte b) {
    }
}
