package defpackage;

import android.text.TextUtils;

/* renamed from: adgj */
public final class adgj {
    private static final String a = xtl.b("MDX.RouteSelector");
    private final bcaa b;
    private final bapu c;

    public adgj(bcaa bcaa, bapu bapu) {
        this.b = bcaa;
        this.c = bapu;
    }

    /* Access modifiers changed, original: final */
    public final void a(adis adis, String str) {
        adgc adgc = (adgc) this.b.get();
        amqw.a(TextUtils.isEmpty(str) ^ 1);
        adge b = adgf.b();
        synchronized (adgc.d) {
            amqs amqs = adgc.c;
            if (amqs != null) {
                if (adhn.a((String) amqs.a, str)) {
                    adpw a = ((adgf) adgc.c.b).a();
                    if (a == null) {
                        a = adpw.k;
                    }
                    b.a(a);
                    adgc.c = null;
                }
            }
            b.a(adgc.a.a(adgc.b.a()));
            adgc.c = null;
        }
        ((adgi) this.c.get()).a(adis, b.a().a());
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        adgh adgh;
        adgc adgc = (adgc) this.b.get();
        amqw.a(TextUtils.isEmpty(str) ^ 1);
        synchronized (adgc.f) {
            amqs amqs = adgc.e;
            if (amqs != null) {
                if (adhn.a((String) amqs.a, str)) {
                    adgh = (adgh) adgc.e.b;
                }
            }
            adgh = adgh.b().a();
        }
        boolean a = adgh.a();
        String str2 = a;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("Unselect route, is user initiated: ");
        stringBuilder.append(a);
        xtl.c(str2, stringBuilder.toString());
        ((adgi) this.c.get()).a(a);
    }
}
