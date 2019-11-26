package defpackage;

import android.text.TextUtils;

/* renamed from: adnq */
final class adnq extends adqq {
    private final /* synthetic */ adnh a;

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            xtl.b(adnh.a, "Trying to sync down empty Autonav videoId. Discarding request.");
            return;
        }
        adnh adnh = this.a;
        adnh.c.a(str, new adnp(adnh.m));
    }

    public final void a(adih adih) {
        aikc aikc = this.a.m;
        if (adih == adih.UNSUPPORTED || adih == adih.DISABLED) {
            aikc.a(1, 0, aikc.a(1));
        }
    }

    /* synthetic */ adnq(adnh adnh) {
        this.a = adnh;
    }
}
