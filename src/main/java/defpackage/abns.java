package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.List;

/* renamed from: abns */
public final class abns {
    public String a;
    public List b;

    public final void a() {
        this.a = null;
        this.b = null;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, String str, boolean z) {
        if (!str.isEmpty()) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(str);
            if (z) {
                spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
            }
        }
    }
}
