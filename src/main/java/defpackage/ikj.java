package defpackage;

import java.util.List;

/* renamed from: ikj */
final /* synthetic */ class ikj implements bbnv {
    private final ikh a;
    private final String b;

    ikj(ikh ikh, String str) {
        this.a = ikh;
        this.b = str;
    }

    public final Object a(Object obj) {
        ikh ikh = this.a;
        String str = this.b;
        List list = (List) obj;
        aaea b = ikh.a.b();
        aadt aadt = (aveg) aveh.a.a(str);
        if (!(list == null || list.isEmpty())) {
            avek avek = aadt.a;
            avek.copyOnWrite();
            avel avel = (avel) avek.instance;
            if (!avel.c.a()) {
                avel.c = anxl.mutableCopy(avel.c);
            }
            anvf.addAll(list, avel.c);
        }
        return b.a(aadt).a();
    }
}
