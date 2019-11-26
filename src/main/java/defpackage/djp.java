package defpackage;

/* renamed from: djp */
final class djp implements zie {
    public volatile bcaa a;
    public volatile bcaa b;
    public final /* synthetic */ djm c;
    private volatile bcaa d;

    public final void a(zhu zhu) {
        zhu.c = this.c.c.c();
        zhu.Z = this.c.a();
        bcaa bcaa = this.d;
        if (bcaa == null) {
            bcaa = new djo(this, 0);
            this.d = bcaa;
        }
        zhu.aa = bapx.b(bcaa);
        djm djm = this.c;
        Object obj = djm.b;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = djm.b;
                if (obj2 instanceof baqe) {
                    obj2 = new xnu(xex.a(djm.a));
                    djm.b = bapx.a(djm.b, obj2);
                }
            }
            obj = obj2;
        }
        zhu.ab = (xnu) obj;
    }

    /* synthetic */ djp(djm djm) {
        this.c = djm;
        zje zje = new zje();
    }
}
