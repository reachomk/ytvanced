package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: zse */
final class zse implements OnCancelListener {
    private final /* synthetic */ zsg a;

    zse(zsg zsg) {
        this.a = zsg;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        zsg zsg = this.a;
        if (zsg != null) {
            zsg.a();
        }
    }
}
