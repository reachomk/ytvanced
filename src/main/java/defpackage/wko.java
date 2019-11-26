package defpackage;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: wko */
final class wko implements OnClickListener {
    private final /* synthetic */ wjv a;

    wko(wjv wjv) {
        this.a = wjv;
    }

    public final void onClick(View view) {
        Dialog dialog = this.a.c;
        if (dialog != null && dialog.isShowing()) {
            ajrq ajrq = this.a.al;
            ajrn ajrn = ajrq.f;
            if (!TextUtils.isEmpty(ajqy.a(ajrq.e)) || (ajrn != null && ajrn.e != null)) {
                wjv wjv = this.a;
                if ((TextUtils.equals(wjv.aq.getText().toString().trim(), xvd.a(ajqy.a(wjv.al.e))) ^ 1) != 0) {
                    this.a.b(dialog, R.string.discard_edits);
                    return;
                }
            } else if (this.a.ad() || this.a.af()) {
                this.a.b(dialog, R.string.discard_post);
            }
            this.a.af.a(3, new acvs(acwc.BACKSTAGE_POST_DIALOG_CANCEL_BUTTON), null);
            dialog.cancel();
        }
    }
}
