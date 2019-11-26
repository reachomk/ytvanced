package defpackage;

/* renamed from: bbim */
final class bbim extends basc {
    private final bbih a;
    private Object b;

    bbim(bbih bbih) {
        this.a = bbih;
    }

    public final void a(baum baum) {
    }

    public final void a(Object obj) {
        if (this.b == null) {
            this.b = obj;
            return;
        }
        throw bavx.i.a("More than one value received for unary call").b();
    }

    public final void a(bavx bavx, baum baum) {
        if (bavx.a()) {
            if (this.b == null) {
                this.a.a(bavx.i.a("No value received for unary call").a(baum));
            }
            this.a.a_(this.b);
            return;
        }
        this.a.a(bavx.a(baum));
    }
}
