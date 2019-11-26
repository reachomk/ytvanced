package defpackage;

/* renamed from: bbbq */
public final class bbbq extends bbet {
    private boolean b;
    private final bavx c;
    private final int d;

    public bbbq(bavx bavx) {
        this(bavx, 1);
    }

    public final void a(bazn bazn) {
        amqw.b(this.b ^ 1, (Object) "already started");
        this.b = true;
        bazn.a(this.c, this.d, new baum());
    }

    public bbbq(bavx bavx, int i) {
        amqw.a(bavx.a() ^ 1, (Object) "error must not be OK");
        this.c = bavx;
        this.d = i;
    }
}
