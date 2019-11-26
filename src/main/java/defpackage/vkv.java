package defpackage;

import android.text.TextUtils;

/* renamed from: vkv */
final /* synthetic */ class vkv implements bcvk {
    private final vkt a;

    vkv(vkt vkt) {
        this.a = vkt;
    }

    public final void a(Object obj) {
        vkt vkt = this.a;
        ahkn ahkn = (ahkn) obj;
        if (ahkn.a.a()) {
            vky vky = vkt.c;
            vso a = vky.a(vky.b);
            if ((a instanceof vsl) && TextUtils.equals(a.j, ahkn.f)) {
                vkt.d.a(vkt.b, a, new vlq(vkt, ahkn));
            }
        }
    }
}
