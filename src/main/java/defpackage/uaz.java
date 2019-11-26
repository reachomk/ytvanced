package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: uaz */
public final class uaz implements bpm {
    private final ubl a;
    private final ubn b;

    public static uaz a(ubl ubl, ubn ubn) {
        return new uaz(ubl, ubn);
    }

    private uaz(ubl ubl, ubn ubn) {
        this.a = (ubl) uhy.a((Object) ubl);
        this.b = (ubn) uhy.a((Object) ubn);
    }

    public final /* synthetic */ void b(Object obj, Object obj2) {
        ((bpp) obj).a((bpp) obj2);
    }

    public final /* synthetic */ Iterable b(Object obj) {
        bpp bpp = (bpp) obj;
        if (bpp instanceof ubp) {
            return bpp.b();
        }
        if (!(bpp instanceof ubb)) {
            return Collections.emptyList();
        }
        ubb ubb = (ubb) bpp;
        int a = ubb.a(this.a);
        ArrayList arrayList = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            int a2 = ubb.a(this.a, i);
            Object obj2 = (ubb) this.b.b.b(a2);
            if (obj2 == null) {
                obj2 = (ubb) this.b.a.b(a2);
            }
            if (!(obj2 == null || ubb.a(ubb))) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((bpp) obj).a();
    }
}
