package defpackage;

/* renamed from: lwl */
public final class lwl {
    public boolean a;
    public final boolean[] b = new boolean[3];

    public final boolean a(int i) {
        return (this.a && this.b[i]) ? false : true;
    }

    public final void a() {
        this.a = true;
    }

    public final void b(int i) {
        this.b[i] = true;
    }
}
