package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: acyh */
final class acyh implements xcn {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    private final /* synthetic */ acyi f;

    public final void a(Object obj) {
        acyh.a(obj, this.c);
        acyh.a(obj, this.a);
        acyh.a(obj, this.b);
        acyh.a(obj, this.d);
        acyh.a(obj, this.e);
        acyi acyi = this.f;
        for (acxv acxv : acyi.e) {
            if (!acxv.e) {
                acyi.b.a(acxv.a());
            }
        }
        acyi.e.clear();
    }

    private static void a(Object obj, List list) {
        if (!list.isEmpty()) {
            for (xcn a : list) {
                a.a(obj);
            }
        }
    }

    /* synthetic */ acyh(acyi acyi) {
        this.f = acyi;
    }
}
