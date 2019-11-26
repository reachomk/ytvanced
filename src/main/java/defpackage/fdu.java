package defpackage;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.youtube.R;

/* renamed from: fdu */
final /* synthetic */ class fdu implements OnClickListener {
    private final fdn a;
    private final EditText b;
    private final ViewGroup c;
    private final fdl d;

    fdu(fdn fdn, EditText editText, ViewGroup viewGroup, fdl fdl) {
        this.a = fdn;
        this.b = editText;
        this.c = viewGroup;
        this.d = fdl;
    }

    public final void onClick(View view) {
        fdn fdn = this.a;
        EditText editText = this.b;
        ViewGroup viewGroup = this.c;
        fdl fdl = this.d;
        if (editText.getText().length() > 0) {
            new Builder(viewGroup.getContext()).setMessage(R.string.hats_free_text_dismiss_dialog).setCancelable(false).setPositiveButton(R.string.hats_free_text_confirm_dismiss, new fea(fdn, fdl)).setNegativeButton(R.string.hats_free_text_cancel_dismiss, fds.a).create().show();
        } else {
            fdn.a(fdl);
        }
    }
}
