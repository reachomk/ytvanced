package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;

/* renamed from: airm */
public final class airm extends aiql {
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return "";
    }

    public final anwy a() {
        return WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint;
    }

    private static String a(azjv azjv) {
        return (azjv.a & 1) != 0 ? azjv.b : "";
    }

    public final /* synthetic */ boolean a(Object obj, Object obj2) {
        azjv azjv = (azjv) obj;
        azjv azjv2 = (azjv) obj2;
        boolean z = true;
        if (!amqq.a(azjv, azjv2)) {
            if (!TextUtils.equals(airm.a(azjv), airm.a(azjv2))) {
                z = false;
            } else if (Math.abs(azjv.c - azjv2.c) <= 1) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public final /* synthetic */ String b(Object obj) {
        return airm.a((azjv) obj);
    }
}
