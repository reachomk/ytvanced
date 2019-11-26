package defpackage;

import android.text.TextUtils;

/* renamed from: aajy */
public final class aajy extends nom {
    public static aajy a(aahr aahr) {
        String str = aahr.e;
        String d = aahr.d();
        int f = aahr.f();
        int g = aahr.g();
        int i = aahr.i();
        int i2 = aahr.f;
        aahr.k();
        aahr.j();
        return new aajy(str, d, f, g, (float) i, i2);
    }

    private aajy(String str, String str2, int i, int i2, float f, int i3) {
        super(str, str2, i, i2, f, -1, -1, i3, null, aaja.d(str2));
    }

    public aajy(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4) {
        super(str, str2, i, i2, f, i3, i4, i5, str3, str4);
    }

    public static int a(String str) {
        String[] split = str.split(":", 2);
        try {
            if (split.length != 0) {
                return Integer.parseInt(split[0]);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String b(String str) {
        String[] split = str.split(":", 2);
        return split.length >= 2 ? split[1] : "";
    }

    public static String a(int i, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String valueOf = String.valueOf(i);
        if (isEmpty) {
            return valueOf;
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(":");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
