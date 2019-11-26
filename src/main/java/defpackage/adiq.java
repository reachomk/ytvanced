package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Map;

/* renamed from: adiq */
public abstract class adiq extends adis {
    private static final adhw a = adhw.a(-2);
    public adhw k;

    adiq() {
    }

    public abstract Uri a();

    public final int bs_() {
        return 3;
    }

    public abstract Uri bu_();

    public abstract String c();

    public abstract adjg d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract int i();

    public abstract boolean j();

    public abstract adip k();

    public final Bundle l() {
        String str;
        Bundle l = super.l();
        Uri a = a();
        if (a == null) {
            str = "";
        } else {
            str = a.toString();
        }
        l.putString("dial.dial_app_uri", str);
        return l;
    }

    public static Uri a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("dial.dial_app_uri", "");
            if (!amqu.a(string)) {
                return Uri.parse(string);
            }
        }
        return null;
    }

    public final String b() {
        return d().a;
    }

    public final String bv_() {
        return c();
    }

    public final Map m() {
        adhw adhw = this.k;
        return adhw != null ? adhw.i() : null;
    }

    public final boolean n() {
        return h() != null;
    }

    public final boolean o() {
        return n() && a() == null;
    }

    public final adiq a(adhw adhw) {
        adip p = p();
        p.a = adhw;
        return p.b();
    }

    public final adip p() {
        adip k = k();
        k.a = this.k;
        return k;
    }

    public static adip q() {
        adid adid = new adid();
        adid.a = a;
        adid.a(-1);
        return adid;
    }
}
