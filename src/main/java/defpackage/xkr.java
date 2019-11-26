package defpackage;

/* renamed from: xkr */
final class xkr implements Runnable {
    private final xle a;
    private final bqh b;

    xkr(xle xle, bqh bqh) {
        this.a = xle;
        this.b = bqh;
    }

    public final void run() {
        if (this.b.a()) {
            this.a.a(this.b.a);
        } else {
            this.a.b(this.b.c);
        }
    }
}
