package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import com.google.android.youtube.R;

/* renamed from: fek */
public final class fek {
    private final Context a;

    public fek(Context context) {
        this.a = context;
    }

    public final CharSequence a(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.a.getString(i));
        spannableStringBuilder.setSpan(new TextAppearanceSpan(this.a, R.style.f485TextAppearance.YouTube.Subhead), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final CharSequence b(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.a.getString(i));
        spannableStringBuilder.setSpan(new TextAppearanceSpan(this.a, R.style.f463TextAppearance.YouTube.Body1), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }
}
