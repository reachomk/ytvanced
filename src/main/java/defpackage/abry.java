package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: abry */
public final class abry implements InputFilter {
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            String str = "\n";
            String str2 = "\r";
            if (charSequence2.contains(str) || charSequence2.contains(str2)) {
                String str3 = "";
                return charSequence2.replace(str, str3).replace(str2, str3);
            }
        }
        return null;
    }
}
