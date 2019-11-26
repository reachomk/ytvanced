package defpackage;

import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;

/* renamed from: avrh */
public final class avrh extends anxo implements anzf {
    private avrh() {
        super(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.f);
    }

    public final avrh a(String str) {
        copyOnWrite();
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) this.instance;
        if (str != null) {
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint.a |= 1;
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public /* synthetic */ avrh(byte b) {
        super(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.f);
    }

    public final avrh a(int i) {
        copyOnWrite();
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) this.instance;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.a |= 4;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d = i - 1;
        return this;
    }
}
