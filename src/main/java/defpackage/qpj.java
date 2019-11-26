package defpackage;

/* renamed from: qpj */
public final class qpj extends rio {
    private Long a;
    private Long b;
    private Long c;
    private Long d;
    private Long e;

    public qpj() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        Long l = this.a;
        if (l != null) {
            rim.a(1, l.longValue());
        }
        l = this.b;
        if (l != null) {
            rim.a(2, l.longValue());
        }
        l = this.c;
        if (l != null) {
            rim.a(3, l.longValue());
        }
        l = this.d;
        if (l != null) {
            rim.a(4, l.longValue());
        }
        l = this.e;
        if (l != null) {
            rim.a(5, l.longValue());
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        Long l = this.a;
        if (l != null) {
            a += rim.b(1, l.longValue());
        }
        l = this.b;
        if (l != null) {
            a += rim.b(2, l.longValue());
        }
        l = this.c;
        if (l != null) {
            a += rim.b(3, l.longValue());
        }
        l = this.d;
        if (l != null) {
            a += rim.b(4, l.longValue());
        }
        l = this.e;
        return l != null ? a + rim.b(5, l.longValue()) : a;
    }
}
