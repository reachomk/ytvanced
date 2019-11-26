package defpackage;

/* renamed from: ast */
final class ast {
    private int a = 0;
    private int b;
    private int c;
    private int d;
    private int e;

    ast() {
    }

    private static int a(int i, int i2) {
        return i > i2 ? 1 : i != i2 ? 4 : 2;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        this.a = i | this.a;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.a = 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        int i = this.a;
        if ((i & 7) != 0 && (i & ast.a(this.d, this.b)) == 0) {
            return false;
        }
        i = this.a;
        if ((i & 112) != 0 && (i & (ast.a(this.d, this.c) << 4)) == 0) {
            return false;
        }
        i = this.a;
        if ((i & 1792) != 0 && (i & (ast.a(this.e, this.b) << 8)) == 0) {
            return false;
        }
        i = this.a;
        if ((i & 28672) == 0 || (i & (ast.a(this.e, this.c) << 12)) != 0) {
            return true;
        }
        return false;
    }
}
