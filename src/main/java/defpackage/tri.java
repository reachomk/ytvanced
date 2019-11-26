package defpackage;

/* renamed from: tri */
final class tri {
    public int a = 0;
    public int b = 0;
    private final int c = 32;

    tri() {
    }

    private static int a(int i) {
        return 1 << i;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, boolean z) {
        if (i < this.c) {
            if ((this.b & tri.a(i)) != 0 && !z) {
                this.a &= tri.a(i) ^ -1;
            } else if ((this.b & tri.a(i)) == 0 && z) {
                this.a |= tri.a(i);
            }
            this.b = tri.a(i) | this.b;
        }
    }
}
