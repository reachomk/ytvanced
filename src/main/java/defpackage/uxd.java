package defpackage;

import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;

/* renamed from: uxd */
final class uxd implements Runnable {
    private final /* synthetic */ Exception a;
    private final /* synthetic */ uxb b;

    uxd(uxb uxb, Exception exception) {
        this.b = uxb;
        this.a = exception;
    }

    public final void run() {
        arml arml;
        uxb uxb = this.b;
        uwy uwy = uxb.b;
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = uxb.a;
        if ((uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.a & 64) != 0) {
            arml = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        uwy.a(ajqy.a(arml).toString(), new uwz(this.a));
    }
}
