package defpackage;

import java.util.ArrayList;

/* renamed from: sjg */
final class sjg implements tex {
    private final /* synthetic */ sja a;

    sjg(sja sja) {
        this.a = sja;
    }

    public final /* synthetic */ void a(teu teu) {
        tlv<tls> b = ((tll) teu).b();
        ArrayList arrayList = new ArrayList();
        for (tls tls : b) {
            tls.e();
            arrayList.add(new sjm(tls.a(), tls.b(), siz.a(tls), tls.f()));
        }
        b.a();
        this.a.a(arrayList);
    }
}
