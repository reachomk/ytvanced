package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.net.MalformedURLException;

/* renamed from: vmw */
public final class vmw {
    private static final SparseIntArray a = new vmz();
    private static final SparseIntArray b = new vmy();
    private static final SparseIntArray c = new vnb();

    public static aagw a(astv astv) {
        if (astv == null) {
            return null;
        }
        SparseIntArray sparseIntArray = a;
        int a = astx.a(astv.b);
        if (a == 0) {
            a = 1;
        }
        aagy aagy = new aagy(sparseIntArray.get(a - 1, 0));
        for (astz a2 : astv.c) {
            aaha a3 = vmw.a(a2);
            if (a3 != null) {
                aagy.b.add(a3);
            }
        }
        for (asuh a4 : astv.d) {
            aahi a5 = vmw.a(a4);
            if (a5 != null) {
                aagy.c.add(a5);
            }
        }
        asud asud = astv.e;
        if (asud == null) {
            asud = asud.i;
        }
        aahe a6 = vmw.a(asud);
        if (a6 != null) {
            aagy.d = a6;
        }
        return new aagw(aagy.a, aagy.b, aagy.c, aagy.d);
    }

    private static aahi a(asuh asuh) {
        if (asuh == null) {
            return null;
        }
        try {
            Uri a = (asuh.a & 2) != 0 ? xvt.a(asuh.c) : null;
            SparseIntArray sparseIntArray = c;
            int a2 = asuj.a(asuh.b);
            if (a2 == 0) {
                a2 = 1;
            }
            return new aahi(sparseIntArray.get(a2 - 1, 0), a);
        } catch (MalformedURLException unused) {
            xtl.d("Badly formed InfoCardTrackingEvent base URL - ignoring");
            return null;
        }
    }

    private static aaha a(astz astz) {
        Uri uri = null;
        if (astz == null) {
            return null;
        }
        try {
            if ((astz.a & 4) != 0) {
                uri = xvt.a(astz.c);
            }
        } catch (MalformedURLException unused) {
            xtl.d("Badly formed InfoCardAction link URL - ignoring");
        }
        SparseIntArray sparseIntArray = b;
        int a = asub.a(astz.b);
        if (a == 0) {
            a = 1;
        }
        aahc aahc = new aahc(sparseIntArray.get(a - 1, 0), uri, astz.d);
        if (astz.e.size() > 0) {
            for (asuh a2 : astz.e) {
                aahi a3 = vmw.a(a2);
                if (a3 != null) {
                    aahc.d.add(a3.b);
                }
            }
        }
        return new aaha(aahc.a, aahc.b, aahc.c, aahc.d);
    }

    private static aahe a(asud asud) {
        if (asud == null) {
            return null;
        }
        aahg aahg = new aahg(asud.c, asud.e);
        aahg.e = asud.g;
        float max = Math.max(0.0f, Math.min(5.0f, asud.h));
        if (max > 0.1f) {
            aahg.c = true;
            aahg.d = max;
        }
        aahg.h = asud.b;
        if ((asud.a & 128) != 0) {
            try {
                aahg.g = xvt.a(asud.f);
            } catch (MalformedURLException unused) {
                xtl.d("Badly formed rating image uri - ignoring");
            }
        }
        if ((asud.a & 32) != 0) {
            asuf asuf = asud.d;
            if (asuf == null) {
                asuf = asuf.d;
            }
            String str = asuf.b;
            if (TextUtils.isEmpty(str)) {
                asuf asuf2 = asud.d;
                if (asuf2 == null) {
                    asuf2 = asuf.d;
                }
                str = asuf2.c;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    aahg.f = xvt.a(str);
                } catch (MalformedURLException unused2) {
                    xtl.d("Badly formed app icon - ignoring");
                }
            }
        }
        return new aahe(aahg.a, aahg.h, aahg.f, aahg.b, aahg.c, aahg.d, aahg.g, aahg.e);
    }
}
