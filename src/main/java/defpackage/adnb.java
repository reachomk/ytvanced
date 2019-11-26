package defpackage;

import android.text.TextUtils;

/* renamed from: adnb */
final class adnb implements xcp {
    private final /* synthetic */ adnc a;

    adnb(adnc adnc) {
        this.a = adnc;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        aizy aizy;
        if (i == -1) {
            clsArr = new Class[]{adpt.class, adqk.class, adqj.class};
        } else if (i == 0) {
            adpt adpt = (adpt) obj;
            amqw.a(this.a.c());
            adqe c = this.a.c.c();
            if (c != null) {
                adpw adpw = adpt.a;
                if (adpw.m()) {
                    int i2 = adpt.b;
                    if (i2 == 1) {
                        this.a.a(adpw);
                        return null;
                    } else if (i2 == 2) {
                        this.a.b(adpw);
                        return null;
                    }
                } else if (adpw.b(c.E()) && !TextUtils.isEmpty(c.F())) {
                    this.a.b(adpw);
                } else if (c.f() && c.H()) {
                    String.valueOf(adpt).length();
                } else {
                    adnc adnc = this.a;
                    ((aizy) amqw.a(adnc.c())).i();
                    adnc.a.d(adng.CONNECTED_ONLY);
                }
            }
        } else if (i == 1) {
            aizy = (aizy) amqw.a(this.a.c());
            adqe adqe = ((adqk) obj).a;
            if (adqe == null) {
                this.a.b.d();
                this.a.a();
            } else {
                int d = adqe.d();
                if (d == 0) {
                    aizy.b();
                    return null;
                } else if (d == 1) {
                    this.a.b.d();
                    this.a.b();
                    return null;
                } else if (d == 2) {
                    this.a.b.d();
                    this.a.a();
                    return null;
                }
            }
        } else if (i == 2) {
            aizy = (aizy) amqw.a(this.a.c());
            ajis ajis = ((adqj) obj).a;
            if (!amqq.a(ajis, aizy.A())) {
                aizy.a(ajis);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
