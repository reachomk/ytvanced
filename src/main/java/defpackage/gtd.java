package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: gtd */
final /* synthetic */ class gtd implements OnCancelListener {
    public static final OnCancelListener a = new gtd();

    private gtd() {
    }

    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
    }
}
