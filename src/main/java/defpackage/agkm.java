package defpackage;

import android.app.ProgressDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineStreamsActivity;

/* renamed from: agkm */
public final /* synthetic */ class agkm implements OnClickListener {
    private final DebugOfflineStreamsActivity a;

    public agkm(DebugOfflineStreamsActivity debugOfflineStreamsActivity) {
        this.a = debugOfflineStreamsActivity;
    }

    public final void onClick(View view) {
        DebugOfflineStreamsActivity debugOfflineStreamsActivity = this.a;
        ProgressDialog progressDialog = new ProgressDialog(debugOfflineStreamsActivity);
        progressDialog.setMessage("Please wait");
        progressDialog.setCancelable(false);
        progressDialog.setIndeterminate(true);
        progressDialog.show();
        new agko(debugOfflineStreamsActivity, progressDialog).execute(new Void[0]);
    }
}
