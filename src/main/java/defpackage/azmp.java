package defpackage;

import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;

/* renamed from: azmp */
public final class azmp extends anxo implements anzf {
    private azmp() {
        super(YpcGetCartEndpoint$YPCGetCartEndpoint.k);
    }

    public final azmp a(long j) {
        copyOnWrite();
        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) this.instance;
        ypcGetCartEndpoint$YPCGetCartEndpoint.a |= 8;
        ypcGetCartEndpoint$YPCGetCartEndpoint.e = j;
        return this;
    }

    public /* synthetic */ azmp(byte b) {
        super(YpcGetCartEndpoint$YPCGetCartEndpoint.k);
    }
}
