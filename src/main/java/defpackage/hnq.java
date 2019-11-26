package defpackage;

import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;

/* renamed from: hnq */
final class hnq {
    static apxu a(String str, String str2, int i) {
        xvd.a(str);
        avrh avrh = (avrh) OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.f.createBuilder();
        avrh.a(str);
        if (str2 != null) {
            avrh.copyOnWrite();
            OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) avrh.instance;
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint.a |= 2;
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c = str2;
        }
        avrh.a(1);
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) ((anxl) avrh.build()));
        return (apxu) ((anxl) apxx.build());
    }
}
