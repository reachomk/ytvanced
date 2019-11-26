package defpackage;

import android.text.TextUtils;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: fcj */
public final class fcj {
    private static final aphg b = aphg.s;
    public final aaas a;
    private final albh c;
    private final akvp d;

    public fcj(albh albh, akvp akvp, aaas aaas) {
        this.c = albh;
        this.d = akvp;
        this.a = aaas;
    }

    public final fck a(auuc auuc, Map map) {
        arml arml;
        arml arml2;
        auue auue = auuc.e;
        if (auue == null) {
            auue = auue.c;
        }
        aphg a = fcj.a(auue);
        auue auue2 = auuc.f;
        if (auue2 == null) {
            auue2 = auue.c;
        }
        aphg a2 = fcj.a(auue2);
        fck fck = (fck) ((fck) ((fck) this.c.b()).c(auuc.m ^ 1)).d(auuc.k ^ 1);
        if ((auuc.a & 2048) != 0) {
            arml = auuc.l;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        fck = (fck) ((fck) fck.d(ajqy.a(arml))).c(TextUtils.join(" ", ajqy.b((arml[]) auuc.d.toArray(new arml[0]))));
        if ((a.a & 128) != 0) {
            arml = a.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        fck fck2 = (fck) fck.a(ajqy.a(arml), a(a, auuc, map));
        if ((a2.a & 128) != 0) {
            arml2 = a2.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        fck2 = (fck) fck2.b(ajqy.a(arml2), a(a2, auuc, null));
        if ((auuc.a & 1) != 0) {
            aygk aygk = auuc.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            fck2.b(aygk);
        }
        if ((auuc.a & 2) != 0) {
            akvp akvp = this.d;
            arwf arwf = auuc.c;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a3 = arwh.a(arwf.b);
            if (a3 == null) {
                a3 = arwh.UNKNOWN;
            }
            fck2.d(akvp.a(a3));
        }
        return fck2;
    }

    private final OnClickListener a(aphg aphg, auuc auuc, Map map) {
        int i = aphg.a;
        if ((i & 2048) == 0 && (i & 4096) == 0) {
            return null;
        }
        return new fcm(this, auuc, map, aphg);
    }

    private static aphg a(auue auue) {
        aphg aphg;
        if (auue == null) {
            aphg = b;
        } else {
            aphg = auue.b;
            if (aphg == null) {
                return aphg.s;
            }
        }
        return aphg;
    }
}
