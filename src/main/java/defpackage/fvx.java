package defpackage;

import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import java.util.Map;

/* renamed from: fvx */
final /* synthetic */ class fvx implements xar {
    private final fvw a;
    private final DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint b;
    private final apxu c;
    private final Map d;

    fvx(fvw fvw, DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint, apxu apxu, Map map) {
        this.a = fvw;
        this.b = deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
        this.c = apxu;
        this.d = map;
    }

    public final void accept(Object obj) {
        fvw fvw = this.a;
        DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = this.b;
        apxu apxu = this.c;
        Map map = this.d;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            if (deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.b.isEmpty()) {
                fvw.a();
            } else {
                fvw.c(apxu, map);
            }
        }
    }
}
