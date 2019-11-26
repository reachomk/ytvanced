package defpackage;

/* renamed from: zbv */
final class zbv implements zbx {
    private final zbw a;
    private final zbt b;

    zbv(zbw zbw) {
        this(zbw, null);
    }

    zbv(zbw zbw, zbt zbt) {
        this.a = (zbw) amqw.a((Object) zbw);
        this.b = zbt;
    }

    public final void a(zbq zbq) {
        zbw zbw = this.a;
        zbt zbt = this.b;
        zbq.b = zbw;
        if (zbt != null) {
            zbq.a.a(zbt);
        }
    }
}
