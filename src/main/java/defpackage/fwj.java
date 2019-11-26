package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint;

/* renamed from: fwj */
final /* synthetic */ class fwj implements OnClickListener {
    private final fwk a;
    private final ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint b;

    fwj(fwk fwk, ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint) {
        this.a = fwk;
        this.b = reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint;
    }

    public final void onClick(View view) {
        fwk fwk = this.a;
        ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint = this.b;
        aaas aaas = fwk.a;
        apxu apxu = reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint.b;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
