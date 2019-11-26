package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.youtube.R;

/* renamed from: adgk */
public final class adgk extends nd {
    public final Dialog a(Bundle bundle) {
        return new Builder(p()).setMessage(R.string.mdx_sideloaded_dialog_error_message).setPositiveButton(R.string.mdx_sideloaded_dialog_confirm_button, new adgn(this)).create();
    }
}
