package defpackage;

/* renamed from: upy */
public final class upy implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private upy(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static upy a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new upy(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        Object obj;
        amqp amqp = (amqp) this.a.get();
        bcaa bcaa = this.b;
        bcaa bcaa2 = this.c;
        bcaa bcaa3 = this.d;
        if (amqp.a()) {
            obj = (utc) amqp.b();
        } else {
            int a;
            aott aott = (aott) bcaa.get();
            int i = 1;
            if ((aott.a & 1) != 0) {
                aotv aotv = aott.b;
                if (aotv == null) {
                    aotv = aotv.c;
                }
                a = aotx.a(aotv.b);
                if (a != 0) {
                    i = a;
                }
            }
            a = i - 1;
            if (i == 0) {
                throw null;
            } else if (a != 3) {
                obj = (utc) bcaa2.get();
            } else {
                obj = (utc) bcaa3.get();
            }
        }
        return (utc) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
