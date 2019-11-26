package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: yvm */
final /* synthetic */ class yvm implements Runnable {
    private final yvh a;
    private final String b;
    private final String c;

    yvm(yvh yvh, String str, String str2) {
        this.a = yvh;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        yvh yvh = this.a;
        yvl b = yvh.b(this.b, this.c);
        if (b.c != null) {
            Collection arrayList = new ArrayList(b.a.e);
            arrayList.remove(b.b);
            aaea b2 = yvh.a.b();
            ykw h = b.a.h();
            h.c = amul.a(arrayList);
            b2.a(h.a()).a();
        }
    }
}
