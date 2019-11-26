package defpackage;

import android.content.SharedPreferences;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: lva */
public final class lva {
    public static int a(lqz lqz, SharedPreferences sharedPreferences) {
        if (sharedPreferences.getBoolean("theme_dark_watch_panel", false)) {
            return 2;
        }
        if (lqz != null) {
            enm enm = lqz.a;
            if (enm != null) {
                apxu d = enm.d();
                if (d != null) {
                    anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                    d.a(access$000);
                    if (d.h.a(access$000.d)) {
                        access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                        d.a(access$000);
                        Object b = d.h.b(access$000.d);
                        if (b == null) {
                            b = access$000.b;
                        } else {
                            b = access$000.a(b);
                        }
                        azje azje = (azje) b;
                        if ((azje.a & 262144) != 0) {
                            aziy aziy = azje.o;
                            if (aziy == null) {
                                aziy = aziy.c;
                            }
                            int a = auly.a(aziy.b);
                            if (a == 0) {
                                a = 1;
                            }
                            return a + -1 != 2 ? 1 : 2;
                        }
                    }
                }
            }
        }
    }
}
