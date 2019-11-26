package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: msf */
public final class msf {
    public static apxu a(nhm nhm) {
        int i = nhm.a;
        if (i == 1) {
            return msf.a(nhm.b, (long) nhm.g);
        }
        if (i == 2) {
            return msf.a(nhm.c, nhm.f, (long) nhm.g);
        }
        if (i == 3) {
            return msf.a(nhm.d, nhm.f, (long) nhm.g);
        }
        ammj.b("Malformed description, cannot create navigationEndPoint.", new Object[0]);
        return null;
    }

    public static apxu a(String str, long j) {
        apxx apxx = (apxx) ((anxo) msf.a(j).toBuilder());
        azjd azjd = (azjd) ((anxo) ((azje) apxx.b(WatchEndpointOuterClass.watchEndpoint)).toBuilder());
        azjd.a(str);
        apxx.a(WatchEndpointOuterClass.watchEndpoint, (azje) ((anxl) azjd.build()));
        return (apxu) ((anxl) apxx.build());
    }

    public static apxu a(String str, int i, long j) {
        apxx apxx = (apxx) ((anxo) msf.a(j).toBuilder());
        azjd azjd = (azjd) ((anxo) ((azje) apxx.b(WatchEndpointOuterClass.watchEndpoint)).toBuilder());
        azjd.b(str);
        azjd.a(i);
        apxx.a(WatchEndpointOuterClass.watchEndpoint, (azje) ((anxl) azjd.build()));
        return (apxu) ((anxl) apxx.build());
    }

    public static apxu a(List list, int i, long j) {
        if (list != null && !list.isEmpty()) {
            return msf.a((String) list.get(Math.min(list.size() - 1, Math.max(0, i))), j);
        }
        ammj.b("Malformed parameters. Video list cannot be empty", new Object[0]);
        return null;
    }

    private static apxu a(long j) {
        apxx apxx = (apxx) apxu.d.createBuilder();
        azjd azjd = (azjd) azje.r.createBuilder();
        azjd.a((float) TimeUnit.MILLISECONDS.toSeconds(j));
        apxx.a(WatchEndpointOuterClass.watchEndpoint, (azje) ((anxl) azjd.build()));
        return (apxu) ((anxl) apxx.build());
    }
}
