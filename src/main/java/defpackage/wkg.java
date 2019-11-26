package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: wkg */
final class wkg implements OnClickListener {
    private final /* synthetic */ Dialog a;
    private final /* synthetic */ wjv b;

    wkg(wjv wjv, Dialog dialog) {
        this.b = wjv;
        this.a = dialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.af.a(3, new acvs(acwc.BACKSTAGE_POST_DIALOG_CANCEL_BUTTON), null);
        dialogInterface.dismiss();
        this.a.cancel();
    }
}
