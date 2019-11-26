package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: yvj */
final /* synthetic */ class yvj implements Runnable {
    private final yvh a;
    private final String b;
    private final String c;

    yvj(yvh yvh, String str, String str2) {
        this.a = yvh;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        yvh yvh = this.a;
        String str = this.b;
        String str2 = this.c;
        yvl b = yvh.b(str, str2);
        if (b.c != null) {
            Collection arrayList = new ArrayList(b.a.e);
            arrayList.set(b.b, b.c.d().a(false).a(yvh.c.a()).b());
            aaea b2 = yvh.a.b();
            ykw h = b.a.h();
            h.c = amul.a(arrayList);
            b2.a(h.a()).a();
            yvh.a(str, str2, 2);
        }
    }
}
