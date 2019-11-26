package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* renamed from: anqd */
public final class anqd implements anom {
    public final anpi a;
    private final anlf b;
    private final anpc c;
    private final Executor d;

    public anqd(anlf anlf, anpc anpc, Executor executor) {
        anpi anpi = new anpi(anlf.a(), anpc);
        this.b = anlf;
        this.c = anpc;
        this.a = anpi;
        this.d = executor;
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return this.c.a() != 0;
    }

    public final ryi c() {
        return rym.a();
    }

    public final ryi a(String str, String str2, String str3) {
        return b(a(str, str2, str3, new Bundle()));
    }

    public final ryi b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        if (valueOf.length() == 0) {
            valueOf = new String(str4);
        } else {
            valueOf = str4.concat(valueOf);
        }
        bundle.putString("gcm.topic", valueOf);
        str3 = String.valueOf(str3);
        if (str3.length() == 0) {
            str3 = new String(str4);
        } else {
            str3 = str4.concat(str3);
        }
        return anqd.a(b(a(str, str2, str3, bundle)));
    }

    public final ryi c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        if (valueOf.length() == 0) {
            valueOf = new String(str4);
        } else {
            valueOf = str4.concat(valueOf);
        }
        bundle.putString("gcm.topic", valueOf);
        bundle.putString("delete", "1");
        str3 = String.valueOf(str3);
        if (str3.length() == 0) {
            str3 = new String(str4);
        } else {
            str3 = str4.concat(str3);
        }
        return anqd.a(b(a(str, str2, str3, bundle)));
    }

    private final ryi a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.b.b().a);
        bundle.putString("gmsv", Integer.toString(this.c.d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.c.b());
        bundle.putString("app_ver_name", this.c.c());
        bundle.putString("cliv", "fiid-13280000");
        ryl ryl = new ryl();
        this.d.execute(new anqg(this, bundle, ryl));
        return ryl.a;
    }

    private static ryi a(ryi ryi) {
        return ryi.a(anpv.a, new anqf());
    }

    private final ryi b(ryi ryi) {
        return ryi.a(this.d, new anqi());
    }
}
