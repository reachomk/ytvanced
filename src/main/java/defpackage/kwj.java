package defpackage;

import java.util.List;

/* renamed from: kwj */
final /* synthetic */ class kwj implements epk {
    private final vod a;
    private final aaas b;

    kwj(vod vod, aaas aaas) {
        this.a = vod;
        this.b = aaas;
    }

    public final void a(Object obj, List list) {
        vod vod = this.a;
        aaas aaas = this.b;
        if (obj != null && !vod.a(obj)) {
            aabd.a(aaas, list, acwi.a(obj));
        }
    }
}
