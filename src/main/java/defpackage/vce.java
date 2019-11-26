package defpackage;

import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: vce */
public final class vce implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;
    private final bcaa k;
    private final bcaa l;

    private vce(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
        this.h = bcaa8;
        this.i = bcaa9;
        this.j = bcaa10;
        this.k = bcaa11;
        this.l = bcaa12;
    }

    public static vce a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12) {
        return new vce(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8, bcaa9, bcaa10, bcaa11, bcaa12);
    }

    public static vnx a(vdj vdj, xsc xsc, SharedPreferences sharedPreferences, xhv xhv, TelephonyManager telephonyManager, vmn vmn, airt airt, bcaa bcaa, xpt xpt) {
        vnw vnw = new vnw(xsc, sharedPreferences, xhv);
        vnw.a = (vmn) amqw.a((Object) vmn);
        Locale locale = Locale.getDefault();
        String a = xvw.a(telephonyManager);
        if (TextUtils.isEmpty(a) || a.length() < 2) {
            xvw.a(locale.getCountry());
        }
        vnw.e = (bcaa) amqw.a((Object) bcaa);
        vnw.g = airt;
        if (vdj.g()) {
            vnw.f = xpt;
        }
        amqw.a(vnw.a);
        return (vnx) baqd.a(new vnx(vnw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        vdj vdj = (vdj) this.a.get();
        this.b.get();
        xsc xsc = (xsc) this.c.get();
        SharedPreferences sharedPreferences = (SharedPreferences) this.d.get();
        xhv xhv = (xhv) this.e.get();
        TelephonyManager telephonyManager = (TelephonyManager) this.f.get();
        vmn vmn = (vmn) this.g.get();
        this.h.get();
        airt airt = (airt) this.i.get();
        bcaa bcaa = this.j;
        xpt xpt = (xpt) this.k.get();
        this.l.get();
        return vce.a(vdj, xsc, sharedPreferences, xhv, telephonyManager, vmn, airt, bcaa, xpt);
    }
}
