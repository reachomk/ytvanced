package defpackage;

import android.graphics.drawable.ColorDrawable;

/* renamed from: ezr */
public final class ezr extends eyi {
    public final int b;
    public final int c;

    public ezr(int i, int i2) {
        super(new ColorDrawable(i));
        this.b = i;
        this.c = i2;
    }

    public final boolean a(eyi eyi) {
        if (!(eyi instanceof ezr)) {
            return false;
        }
        ezr ezr = (ezr) eyi;
        if (a(ezr.b, ezr.c) || this.a == eyi.a) {
            return true;
        }
        return false;
    }

    public final boolean a(int i, int i2) {
        Object obj = (i == -1 || i != this.b) ? null : 1;
        Object obj2 = (i2 == -1 || i2 != this.c) ? null : 1;
        return (obj == null || obj2 == null) ? false : true;
    }

    public final String toString() {
        String toHexString = Integer.toHexString(0);
        String toHexString2 = Integer.toHexString(this.b);
        String toHexString3 = Integer.toHexString(this.c);
        String valueOf = String.valueOf(this.a);
        int length = String.valueOf(toHexString).length();
        int length2 = String.valueOf(toHexString2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 40) + length2) + String.valueOf(toHexString3).length()) + valueOf.length());
        stringBuilder.append("resId 0x");
        stringBuilder.append(toHexString);
        stringBuilder.append(" abColor 0x");
        stringBuilder.append(toHexString2);
        stringBuilder.append(" sbColor 0x");
        stringBuilder.append(toHexString3);
        stringBuilder.append(" drawable ");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
