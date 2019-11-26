package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ScaleXSpan;
import android.text.style.TextAppearanceSpan;
import java.util.Arrays;

/* renamed from: abxz */
public final class abxz {
    public static void a(Context context, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i, boolean z) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        if (i != 0) {
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, i), length, charSequence.length() + length, (!z ? 0 : 65536) | 33);
        }
    }

    public static void a(Context context, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i) {
        abxz.a(context, spannableStringBuilder, charSequence, i, false);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, float f) {
        char[] cArr = new char[1];
        Arrays.fill(cArr, 0, 1, ' ');
        spannableStringBuilder.append(new String(cArr));
        if (f != 0.0f) {
            abxz.a(spannableStringBuilder, 1, new ScaleXSpan(f));
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, Object obj) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(obj, length - i, length, 33);
    }
}
