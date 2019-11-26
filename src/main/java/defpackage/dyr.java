package defpackage;

import java.util.List;

/* renamed from: dyr */
final /* synthetic */ class dyr implements xar {
    private final dyl a;
    private final apxu b;
    private final Object c;
    private final boolean d;

    dyr(dyl dyl, apxu apxu, Object obj, boolean z) {
        this.a = dyl;
        this.b = apxu;
        this.c = obj;
        this.d = z;
    }

    public final void accept(Object obj) {
        dyl dyl = this.a;
        apxu apxu = this.b;
        Object obj2 = this.c;
        boolean z = this.d;
        asuv asuv = (asuv) obj;
        apxu apxu2 = null;
        List list = asuv.c.size() > 0 ? asuv.c : null;
        if ((asuv.a & 2) != 0) {
            apxu apxu3 = asuv.d;
            if (apxu3 == null) {
                apxu3 = apxu.d;
            }
            apxu2 = apxu3;
        }
        dyl.a(apxu, obj2, list, apxu2, auac.LIKE, z);
    }
}
