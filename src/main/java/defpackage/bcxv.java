package defpackage;

/* renamed from: bcxv */
final class bcxv {
    public int a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;

    bcxv() {
    }

    public final synchronized int a(Object obj) {
        int i;
        this.b = obj;
        this.c = true;
        i = this.a + 1;
        this.a = i;
        return i;
    }

    public final synchronized void a() {
        this.a++;
        this.b = null;
        this.c = false;
    }
}
