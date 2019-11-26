package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: airn */
public final class airn extends aiql {
    public static final apxu a(String str, String str2, int i, float f) {
        return (apxu) ((anxl) airn.a(str, str2, i, f, null).build());
    }

    public static final apxx a(String str, String str2, int i, float f, String str3) {
        azjd azjd = (azjd) azje.r.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            azjd.a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            azjd.b(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            azjd.c(str3);
        }
        azjd.a(i);
        azjd.a(f);
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(WatchEndpointOuterClass.watchEndpoint, (azje) ((anxl) azjd.build()));
        return apxx;
    }

    public final anwy a() {
        return WatchEndpointOuterClass.watchEndpoint;
    }

    private static int a(azje azje) {
        return aiqu.a(azje.d, azje.c);
    }

    public final /* synthetic */ boolean a(Object obj, Object obj2) {
        azje azje = (azje) obj;
        azje azje2 = (azje) obj2;
        boolean z = false;
        if (!amqq.a(azje, azje2)) {
            String str = azje.c;
            int a = airn.a(azje);
            String str2 = azje2.c;
            int a2 = airn.a(azje2);
            if (TextUtils.equals(str, str2) && ((TextUtils.equals("", str) || Math.abs(a - a2) <= 1) && TextUtils.equals(azje.b, azje2.b))) {
                if (azje.f != azje2.f) {
                    return false;
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    public final /* bridge */ /* synthetic */ String b(Object obj) {
        return ((azje) obj).c;
    }

    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return ((azje) obj).b;
    }
}
