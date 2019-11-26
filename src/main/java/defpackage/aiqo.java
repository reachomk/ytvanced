package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;

/* renamed from: aiqo */
public final class aiqo extends aiql {
    public static apxu a(String str, String str2, int i) {
        avse avse = (avse) avsc.g.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            avse.a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            avse.b(str2);
        }
        avse.a(i);
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (avsc) ((anxl) avse.build()));
        return (apxu) ((anxl) apxx.build());
    }

    public static apxu a(String str, String str2, int i, float f) {
        avse avse = (avse) avsc.g.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            avse.a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            avse.b(str2);
        }
        avse.a(i);
        avse.copyOnWrite();
        avsc avsc = (avsc) avse.instance;
        avsc.a |= 16;
        avsc.f = f;
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (avsc) ((anxl) avse.build()));
        return (apxu) ((anxl) apxx.build());
    }

    public final anwy a() {
        return OfflineWatchEndpointOuterClass.offlineWatchEndpoint;
    }

    private static String a(avsc avsc) {
        return (avsc.a & 1) != 0 ? avsc.b : "";
    }

    private static String b(avsc avsc) {
        return (avsc.a & 2) != 0 ? avsc.c : "";
    }

    private static int c(avsc avsc) {
        return aiqu.a(avsc.d, aiqo.b(avsc));
    }

    public final /* synthetic */ boolean a(Object obj, Object obj2) {
        avsc avsc = (avsc) obj;
        avsc avsc2 = (avsc) obj2;
        boolean z = false;
        if (amqq.a(avsc, avsc2)) {
            z = true;
        } else {
            String b = aiqo.b(avsc);
            int c = aiqo.c(avsc);
            String b2 = aiqo.b(avsc2);
            int c2 = aiqo.c(avsc2);
            if (TextUtils.equals(b, b2) && (TextUtils.equals("", b) || c == c2)) {
                return TextUtils.equals(aiqo.a(avsc), aiqo.a(avsc2));
            }
        }
        return z;
    }
}
