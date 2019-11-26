package defpackage;

import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;

/* renamed from: hnz */
public final class hnz extends hnn {
    public hnz() {
        super(agqk.class, auvp.class);
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        agqk agqk = (agqk) obj;
        ets ets = new ets();
        String str = agqk.a.a;
        xvd.a(str);
        avot avot = (avot) OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.e.createBuilder();
        avot.copyOnWrite();
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) avot.instance;
        if (str != null) {
            offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a |= 1;
            offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b = str;
            avot.a(1);
            OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2 = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) ((anxl) avot.build());
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2);
            ets.a = (apxu) ((anxl) apxx.build());
            return ets.a();
        }
        throw new NullPointerException();
    }
}
