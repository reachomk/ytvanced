package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: abue */
final class abue implements InputFilter {
    private final String a;
    private final char b;
    private final StringBuilder c = new StringBuilder();
    private final int d;
    private final int e;

    abue(String str, char c, int i, int i2) {
        this.a = str;
        this.b = c;
        this.d = i;
        this.e = i2;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i == i2) {
            return null;
        }
        int length;
        this.c.setLength(0);
        StringBuilder stringBuilder = this.c;
        stringBuilder.append(spanned.subSequence(0, i3));
        stringBuilder.append(charSequence.subSequence(i, i2));
        stringBuilder.append(spanned.subSequence(i4, spanned.length()));
        int indexOf = this.c.indexOf(this.a);
        String str = "";
        if (indexOf == -1) {
            length = this.c.length();
            indexOf = 0;
        } else if ((this.e == 0 && this.c.indexOf(this.a) != -1) || this.c.lastIndexOf(this.a) != indexOf) {
            return str;
        } else {
            indexOf = (this.c.length() - 1) - indexOf;
            length = (this.c.length() - 1) - indexOf;
        }
        if (indexOf > this.e || length > this.d) {
            return str;
        }
        String stringBuilder2;
        indexOf = this.c.indexOf(this.a);
        if (indexOf == -1) {
            stringBuilder2 = this.c.toString();
        } else {
            stringBuilder2 = this.c.substring(0, indexOf);
        }
        length = stringBuilder2.length();
        if (length > 1 && stringBuilder2.charAt(0) == '0' && stringBuilder2.charAt(1) == '0') {
            return str;
        }
        if (length > 1 && stringBuilder2.charAt(length - 2) == this.b && stringBuilder2.charAt(length - 1) == this.b) {
            return str;
        }
        return null;
    }
}
