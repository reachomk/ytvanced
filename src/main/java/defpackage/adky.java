package defpackage;

import android.net.Uri;

/* renamed from: adky */
final /* synthetic */ class adky implements Runnable {
    private final adkv a;
    private final bbs b;
    private final adlb c;

    adky(adkv adkv, bbs bbs, adlb adlb) {
        this.a = adkv;
        this.b = bbs;
        this.c = adlb;
    }

    public final void run() {
        adkv adkv = this.a;
        bbs bbs = this.b;
        adlb adlb = this.c;
        if (adhn.c(bbs)) {
            Uri a = adiq.a(bbs.r);
            if (a == null) {
                adkv.c.post(new adkx(adlb));
                return;
            }
            adhw a2 = adkv.a.a(a);
            if (a2.b() != 2) {
                a2.b();
                adkv.c.post(new adla(adlb));
                return;
            }
        }
        adkv.c.post(new adkz(adkv, adlb));
    }
}
