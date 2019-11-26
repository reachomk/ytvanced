package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: wtc */
public final class wtc {
    public final xoi a;
    private final Activity b;
    private AlertDialog c;

    public wtc(Activity activity, xoi xoi) {
        this.b = (Activity) amqw.a((Object) activity);
        this.a = (xoi) amqw.a((Object) xoi);
    }

    public final void a(CharSequence charSequence) {
        if (this.c == null) {
            this.c = new Builder(this.b, R.style.f554Theme.YouTube.YpcDialog).setPositiveButton(R.string.commerce_dialog_ok, null).create();
        }
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.b.getString(R.string.commerce_error_generic);
        }
        this.c.setMessage(charSequence);
        this.c.show();
    }
}
