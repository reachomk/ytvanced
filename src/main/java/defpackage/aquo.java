package defpackage;

import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;

/* renamed from: aquo */
public final class aquo extends anxo implements anzf {
    private aquo() {
        super(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d);
    }

    public final aquo a(String str) {
        copyOnWrite();
        DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) this.instance;
        if (str != null) {
            deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.a |= 4;
            deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    public /* synthetic */ aquo(byte b) {
        super(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d);
    }
}
