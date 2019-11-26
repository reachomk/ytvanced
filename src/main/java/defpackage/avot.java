package defpackage;

import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;

/* renamed from: avot */
public final class avot extends anxo implements anzf {
    private avot() {
        super(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.e);
    }

    public /* synthetic */ avot(byte b) {
        super(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.e);
    }

    public final avot a(int i) {
        copyOnWrite();
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) this.instance;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a |= 2;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c = i - 1;
        return this;
    }
}
