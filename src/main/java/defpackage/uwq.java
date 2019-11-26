package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.youtube.R;

/* renamed from: uwq */
public final class uwq extends nd {
    public uwx Z;

    public final Dialog a(Bundle bundle) {
        ((uws) ((xfc) p()).n()).a(this);
        return new Builder(p()).setMessage(R.string.camera_permission_description).setPositiveButton(R.string.camera_permission_positive_button, new uwt(this)).create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.Z.f();
    }
}
