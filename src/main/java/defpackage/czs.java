package defpackage;

/* renamed from: czs */
public final class czs implements czn {
    private final int a;
    private final int b;
    private final int c;
    private int d;

    public czs(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean a() {
        int i;
        if (this.c != 1) {
            i = this.a;
        } else {
            i = this.b;
        }
        if (this.d >= i) {
            return false;
        }
        return true;
    }

    public final void a(int i, int i2) {
        int i3 = this.d;
        if (this.c == 1) {
            i = i2;
        }
        this.d = i3 + i;
    }

    public final int b() {
        return this.d;
    }
}
