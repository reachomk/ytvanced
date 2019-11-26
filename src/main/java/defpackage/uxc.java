package defpackage;

import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;

/* renamed from: uxc */
final class uxc implements afsw {
    private final /* synthetic */ uwy a;

    uxc(uwy uwy) {
        this.a = uwy;
    }

    public final void a(bqn bqn) {
        arml arml;
        uwy uwy = this.a;
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = uwy.ae;
        if ((uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.a & 64) != 0) {
            arml = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        uwy.a(ajqy.a(arml).toString(), new uwz((Throwable) bqn));
    }
}
