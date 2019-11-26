package defpackage;

import android.text.TextUtils;

/* renamed from: yqx */
final /* synthetic */ class yqx implements xsd {
    private final yqy a;

    yqx(yqy yqy) {
        this.a = yqy;
    }

    public final void a(Object obj) {
        yqy yqy = this.a;
        ykt ykt = (ykt) obj;
        yqy.g.clear();
        if (ykt.e.isEmpty()) {
            yqy.a(amul.g());
            return;
        }
        amuo amuo = new amuo();
        amxo amxo = (amxo) ykt.e.iterator();
        while (amxo.hasNext()) {
            ykr ykr = (ykr) amxo.next();
            if (!TextUtils.equals(yqy.i, ykr.a())) {
                amuo.c(ykr.a());
                yqy.g.put(ykr.a(), ykr);
            }
        }
        yqy.f.a(amuo.a(), new yra(yqy), yqy.c);
    }
}
