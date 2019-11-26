package defpackage;

import android.text.TextUtils;

/* renamed from: ahce */
public final class ahce {
    public static void a(avsj avsj, acvx acvx, String str, String str2, avsi avsi, boolean z, agqq agqq) {
        if (acvx != null) {
            amqw.a(TextUtils.isEmpty(str) != TextUtils.isEmpty(str2));
            atss atss = (atss) atst.q.createBuilder();
            atsu atsu = (atsu) atsv.g.createBuilder();
            atsu.copyOnWrite();
            atsv atsv = (atsv) atsu.instance;
            if (avsi != null) {
                atsv.a |= 1;
                atsv.b = avsi.k;
                atsu.copyOnWrite();
                atsv atsv2 = (atsv) atsu.instance;
                atsv2.a |= 2;
                atsv2.c = z;
                int ordinal = agqq.ordinal();
                if (ordinal == 0) {
                    atsu.a(2);
                } else if (ordinal != 1) {
                    atsu.a(1);
                } else {
                    atsu.a(3);
                }
                if (!TextUtils.isEmpty(str)) {
                    atsu.b(2);
                    atsu.a(str);
                } else if (!TextUtils.isEmpty(str2)) {
                    atsu.b(3);
                    atsu.a(str2);
                }
                atss.copyOnWrite();
                atst atst = (atst) atss.instance;
                atst.f = (atsv) ((anxl) atsu.build());
                atst.a |= 16;
                if ((avsj.a & 64) == 0 || avsj.g.b() <= 0) {
                    Object str3;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = str2;
                    }
                    acvx.c(acvx.a(str3, acwc.OFFLINEABILITY_RENDERER), (atst) ((anxl) atss.build()));
                    return;
                }
                acvx.a(3, new acvs(avsj.g), (atst) ((anxl) atss.build()));
                return;
            }
            throw new NullPointerException();
        }
    }
}
