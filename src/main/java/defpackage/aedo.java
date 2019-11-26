package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aedo */
public final class aedo {
    public static boolean a(arvt arvt) {
        if (arvt != null) {
            auuo auuo = arvt.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            avtg avtg = auuo.c;
            if (avtg == null) {
                avtg = avtg.k;
            }
            avte avte = avtg.e;
            if (avte == null) {
                avte = avte.x;
            }
            if (avte.s) {
                return true;
            }
        }
        return false;
    }

    public static ovx a(String str, aedf aedf, Executor executor, aeqo aeqo, avtc avtc) {
        if (avtc == null) {
            return new ovr(str);
        }
        int i = avtc.k;
        int i2 = 8000;
        if (i <= 0) {
            i = 8000;
        }
        int i3 = avtc.l;
        if (i3 > 0) {
            i2 = i3;
        }
        if (avtc.i) {
            bciz a = aedf.a(avtc.j);
            if (a != null) {
                oep oep = new oep(a, executor, ovx.i, i, i2, false);
                if (!(avtc.v || aeqo == null)) {
                    oep.a((owt) aeqo);
                }
                return oep;
            }
        }
        return new ovr(str, null, i, i2, null);
    }

    public static avtc a(zyw zyw) {
        apxn a = zyw.a();
        if (a != null) {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            if ((auya.b & 4) != 0) {
                auya auya2 = a.i;
                if (auya2 == null) {
                    auya2 = auya.J;
                }
                avtc avtc = auya2.u;
                if (avtc == null) {
                    avtc = avtc.w;
                }
                return avtc;
            }
        }
        return null;
    }
}
