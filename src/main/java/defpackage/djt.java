package defpackage;

/* renamed from: djt */
final class djt implements xds {
    private final /* synthetic */ diu a;

    public final Class a() {
        diu diu = this.a;
        Object obj = diu.bY;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = diu.bY;
                if (obj2 instanceof baqe) {
                    obj2 = xdh.a();
                    diu.bY = bapx.a(diu.bY, obj2);
                }
            }
            obj = obj2;
        }
        return (Class) obj;
    }

    /* synthetic */ djt(diu diu) {
        this.a = diu;
    }
}
