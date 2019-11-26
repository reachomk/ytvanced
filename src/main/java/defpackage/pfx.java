package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import java.util.Locale;

/* renamed from: pfx */
public final class pfx extends pgb {
    public String a;
    public String b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;

    public pfx(pgd pgd) {
        super(pgd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        ApplicationInfo applicationInfo;
        Context i = i();
        try {
            applicationInfo = i.getPackageManager().getApplicationInfo(i.getPackageName(), 128);
        } catch (NameNotFoundException e) {
            c("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                int i2 = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i2 > 0) {
                    pfg pfg = (pfg) new pfe(this.g).a(i2);
                    if (pfg != null) {
                        int i3;
                        a("Loading global XML config values");
                        String str = pfg.a;
                        if (str != null) {
                            this.b = str;
                            b("XML config - app name", str);
                        }
                        str = pfg.b;
                        if (str != null) {
                            this.a = str;
                            b("XML config - app version", str);
                        }
                        str = pfg.c;
                        boolean z = false;
                        if (str != null) {
                            str = str.toLowerCase(Locale.US);
                            i3 = !"verbose".equals(str) ? !"info".equals(str) ? !"warning".equals(str) ? !"error".equals(str) ? -1 : 3 : 2 : 1 : 0;
                            if (i3 >= 0) {
                                a("XML config - log level", Integer.valueOf(i3));
                            }
                        }
                        i3 = pfg.d;
                        if (i3 >= 0) {
                            this.d = i3;
                            this.c = true;
                            b("XML config - dispatch period (sec)", Integer.valueOf(i3));
                        }
                        i2 = pfg.e;
                        if (i2 != -1) {
                            if (i2 == 1) {
                                z = true;
                            }
                            this.f = z;
                            this.e = true;
                            b("XML config - dry run", Boolean.valueOf(z));
                        }
                    }
                }
            }
            return;
        }
        b("Couldn't get ApplicationInfo to load global config");
    }

    public final boolean b() {
        f();
        return false;
    }
}
