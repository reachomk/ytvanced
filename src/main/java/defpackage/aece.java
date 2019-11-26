package defpackage;

import android.text.TextUtils;

/* renamed from: aece */
final class aece implements xcp {
    private final /* synthetic */ aeca a;

    aece(aeca aeca) {
        this.a = aeca;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        int i2 = 1;
        Class[] clsArr = null;
        aeca aeca;
        if (i == -1) {
            clsArr = new Class[]{voy.class, vpa.class, vvk.class, adng.class, adpx.class};
        } else if (i == 0) {
            voy voy = (voy) obj;
            if (this.a.g.a() == 2) {
                aeca = this.a;
                aeca.a(aeca.g.f().f().b(voy.b));
                aeca = this.a;
                aeca.f = voy.a;
                aeca.b(0);
                return null;
            }
        } else if (i == 1) {
            vpa vpa = (vpa) obj;
            aaga aaga = vpa.f;
            if (aaga == null || aaga.q() == null) {
                this.a.a(null, null);
            } else {
                aakj q = vpa.f.q();
                this.a.a(q.c(), q.g() != null ? q.g().d() : null);
            }
        } else if (i == 2) {
            vvk vvk = (vvk) obj;
            aeca = this.a;
            CharSequence a = vvk.a();
            if (!TextUtils.equals(a, aeca.g.f().b())) {
                aeca.a(aeca.g.f().f().b(a));
                aeca.b(3);
            }
            aeca = this.a;
            boolean z = vvk.a;
            boolean z2 = vvk.b;
            if (!(aeca.b == z && aeca.c == z2)) {
                aeca.b = z;
                aeca.c = z2;
                aeca.b(0);
                return null;
            }
        } else if (i != 3) {
            if (i == 4) {
                adpx adpx = (adpx) obj;
                aeca = this.a;
                adpy adpy = adpx.a;
                if (adpy == adpy.UNSTARTED) {
                    i2 = 0;
                } else if (adpy.a()) {
                    i2 = 2;
                }
                aeca.a(i2);
            } else {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
        } else if (((adng) obj) == adng.CONNECTED_ONLY) {
            this.a.a(0, 0);
            aeca = this.a;
            aeca.a(aeca.g.k().a(null));
            return null;
        }
        return clsArr;
    }
}
