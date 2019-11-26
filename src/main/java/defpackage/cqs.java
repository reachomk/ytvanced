package defpackage;

/* renamed from: cqs */
public class cqs {
    public final int a;
    public int b = 0;
    private final boolean c = true;
    private final zy d;

    public cqs(int i) {
        this.a = i;
        this.d = new aaa(i);
    }

    public Object a() {
        Object a;
        if (this.c) {
            synchronized (this) {
                a = this.d.a();
                this.b = Math.max(0, this.b - 1);
            }
            return a;
        }
        a = this.d.a();
        this.b = Math.max(0, this.b - 1);
        return a;
    }

    public final void a(Object obj) {
        if (this.c) {
            synchronized (this) {
                this.d.a(obj);
                this.b = Math.min(this.a, this.b + 1);
            }
            return;
        }
        this.d.a(obj);
        this.b = Math.min(this.a, this.b + 1);
    }
}
