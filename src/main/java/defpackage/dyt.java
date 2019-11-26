package defpackage;

import java.util.List;

/* renamed from: dyt */
final /* synthetic */ class dyt implements xar {
    private final dyl a;
    private final apxu b;
    private final Object c;
    private final boolean d;

    dyt(dyl dyl, apxu apxu, Object obj, boolean z) {
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
        asuz asuz = (asuz) obj;
        List list = asuz.c;
        apxu apxu2 = asuz.d;
        if (apxu2 == null) {
            apxu2 = apxu.d;
        }
        dyl.a(apxu, obj2, list, apxu2, auac.INDIFFERENT, z);
    }
}
