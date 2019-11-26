package defpackage;

import com.google.protos.youtube.api.innertube.EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint;

/* renamed from: arax */
public final class arax extends anxo implements anzf {
    private arax() {
        super(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.c);
    }

    public final arax a(String str) {
        copyOnWrite();
        EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint = (EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint) this.instance;
        if (str != null) {
            editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.a |= 1;
            editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public /* synthetic */ arax(byte b) {
        super(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.c);
    }
}
