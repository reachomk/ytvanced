package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: ruk */
public final class ruk extends pxw implements ruo {
    public ruk(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final String a() {
        return a("account_name");
    }

    public final String b() {
        String str = "display_name";
        return !TextUtils.isEmpty(a(str)) ? a(str) : a();
    }

    public final String c() {
        return d() ? a("given_name") : "null";
    }

    public final boolean d() {
        return !TextUtils.isEmpty(a("given_name"));
    }

    public final String e() {
        return a("gaia_id");
    }

    public final String f() {
        return qsm.a.a(a("avatar"));
    }
}
