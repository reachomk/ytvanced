package defpackage;

/* renamed from: aihp */
public abstract class aihp implements aiha {
    public int a = 1;

    public abstract void a(int i);

    public final void a(int i, long j) {
        if (i == 1) {
            a();
        } else if (i != 2) {
            a();
        } else {
            a();
        }
    }

    private final void a() {
        int i = this.a;
        this.a = 1;
        a(i);
    }
}
