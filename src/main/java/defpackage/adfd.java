package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.youtube.R;

/* renamed from: adfd */
public final class adfd extends nd {
    public adga Z;

    public final Dialog a(Bundle bundle) {
        return new Builder(p()).setTitle(R.string.mdx_logged_out_watch_history_dialog_title).setMessage(R.string.mdx_logged_out_watch_history_dialog_message).setNegativeButton(17039360, new adfg(this)).setPositiveButton(R.string.mdx_logged_out_watch_history_dialog_confirm_button, new adff(this)).create();
    }
}
