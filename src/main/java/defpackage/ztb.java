package defpackage;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: ztb */
final /* synthetic */ class ztb implements akok {
    private final zsy a;

    ztb(zsy zsy) {
        this.a = zsy;
    }

    public final boolean a(View view) {
        zsy zsy = this.a;
        AlertDialog alertDialog = zsy.f;
        if (alertDialog != null) {
            alertDialog.dismiss();
            zsy.f = null;
        }
        return false;
    }
}
