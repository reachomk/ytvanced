package defpackage;

import java.util.List;

/* renamed from: bmf */
public final class bmf {
    public final List a;
    public final double b;
    private final char c;
    private final String d;
    private final String e;

    public static int a(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public bmf(List list, char c, double d, String str, String str2) {
        this.a = list;
        this.c = c;
        this.b = d;
        this.d = str;
        this.e = str2;
    }

    public final int hashCode() {
        return bmf.a(this.c, this.e, this.d);
    }
}
