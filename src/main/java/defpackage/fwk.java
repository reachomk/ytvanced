package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint;
import java.util.Map;

/* renamed from: fwk */
public final class fwk implements aaap {
    public final aaas a;
    public final fda b;
    private final Activity c;

    public fwk(Activity activity, aaas aaas, fda fda) {
        this.c = activity;
        this.a = aaas;
        this.b = fda;
    }

    public final void a(apxu apxu, Map map) {
        CharSequence string;
        anxr access$000 = anxl.checkIsLite(ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint.reelUploadSnackbarEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint = (ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint) b;
        if (amqu.a(reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint.c)) {
            string = this.c.getString(R.string.reel_upload_default_snackbar_text);
        } else {
            string = this.c.getString(R.string.reel_upload_snackbar_text, new Object[]{r6});
        }
        fdd fdd = (fdd) fde.h().b(string);
        if ((reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint.a & 1) != 0) {
            fdd.a(this.c.getText(R.string.reel_upload_snackbar_action_button_text), new fwj(this, reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint));
        }
        this.c.runOnUiThread(new fwm(this, fdd));
    }
}
