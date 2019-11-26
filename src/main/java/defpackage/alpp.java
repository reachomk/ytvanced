package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: alpp */
public final class alpp {
    private final CharSequence a;
    private final CharSequence b;

    public alpp(CharSequence charSequence, CharSequence charSequence2) {
        amqw.a(TextUtils.isEmpty(charSequence) ^ 1);
        amqw.a(TextUtils.isEmpty(charSequence2) ^ 1);
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final void a(Context context) {
        new Builder(context).setMessage(this.a).setPositiveButton(this.b, null).show();
    }
}
