package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;

/* renamed from: iss */
public abstract class iss implements akot {
    public final Context a;
    private final aaas b;

    public iss(Context context, aaas aaas) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final void a(akpb akpb) {
    }

    /* Access modifiers changed, original: protected|final */
    public final CharSequence a(CharSequence charSequence, CharSequence charSequence2, apxu apxu, String str) {
        if (charSequence == null || charSequence2 == null) {
            return null;
        }
        new SpannableString(charSequence2).setSpan(new isv(this, this.b, apxu, str), 0, charSequence2.length(), 33);
        return TextUtils.concat(new CharSequence[]{charSequence, " ", r0});
    }
}
