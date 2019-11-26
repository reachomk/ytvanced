package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.List;

/* renamed from: gzd */
public final class gzd {
    public static boolean a(fiw fiw, zzl zzl, zyw zyw) {
        if (wvl.a(zyw) || fiw == null || gzd.a(fiw.a(), zzl) != 3) {
            return false;
        }
        return true;
    }

    public static int a(apxu apxu, zzl zzl) {
        if (apxu == null) {
            return 1;
        }
        String a = aapu.a(apxu);
        if (a != null) {
            List g;
            arvt b = zzl.b();
            if (b == null) {
                g = amul.g();
            } else {
                aume aume = b.e;
                if (aume == null) {
                    aume = aume.af;
                }
                g = amul.a(aume.s);
            }
            if (g.contains(a)) {
                return 3;
            }
        }
        anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
        apxu.a(access$000);
        Object b2 = apxu.h.b(access$000.d);
        if (b2 == null) {
            b2 = access$000.b;
        } else {
            b2 = access$000.a(b2);
        }
        apgk apgk = ((apge) b2).f;
        if (apgk == null) {
            apgk = apgk.d;
        }
        apgg apgg = apgk.b;
        if (apgg == null) {
            apgg = apgg.c;
        }
        int a2 = apgf.a(apgg.b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
