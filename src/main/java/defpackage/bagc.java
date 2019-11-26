package defpackage;

/* renamed from: bagc */
public final class bagc {
    public String a;
    public String b;
    public String c;
    public String d;
    public Float e;
    public Float f;
    public Float g;

    public bagc(String str, String str2, String str3, String str4, Float f, Float f2, Float f3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f;
        this.f = f2;
        this.g = f3;
    }

    public bagc(String str, String str2, String str3, String str4, float f, float f2) {
        this(str, str2, str3, str4, Float.valueOf(f), Float.valueOf(f2), null);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(String str, String str2, String str3, String str4) {
        String str5 = this.a;
        boolean z = false;
        if (str5 == null || str5.equals(str)) {
            str = this.b;
            if (str == null || str.equals(str2)) {
                str = this.c;
                if (str == null || str.equals(str3)) {
                    str = this.d;
                    if (str == null) {
                        z = true;
                    } else if (str.equals(str4)) {
                        return true;
                    } else {
                        return z;
                    }
                }
            }
        }
        return z;
    }
}
