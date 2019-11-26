package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

/* renamed from: psn */
public final class psn extends nd {
    public OnCancelListener Z = null;
    public Dialog c = null;

    public final Dialog a(Bundle bundle) {
        Dialog dialog = this.c;
        if (dialog == null) {
            this.b = false;
        }
        return dialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.Z;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
