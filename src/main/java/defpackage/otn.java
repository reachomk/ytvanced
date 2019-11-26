package defpackage;

import java.util.Arrays;

/* renamed from: otn */
final class otn {
    private static final String[] e = new String[0];
    public final String a;
    public final int b;
    public final String c;
    public final String[] d;

    public otn(String str, int i, String str2, String[] strArr) {
        this.b = i;
        this.a = str;
        this.c = str2;
        this.d = strArr;
    }

    public static otn a(String str, int i) {
        str = str.trim();
        if (str.isEmpty()) {
            return null;
        }
        String str2;
        String trim;
        int indexOf = str.indexOf(" ");
        if (indexOf == -1) {
            str2 = "";
        } else {
            trim = str.substring(indexOf).trim();
            str = str.substring(0, indexOf);
            str2 = trim;
        }
        String[] a = ozp.a(str, "\\.");
        trim = a[0];
        int length = a.length;
        if (length > 1) {
            a = (String[]) Arrays.copyOfRange(a, 1, length);
        } else {
            a = e;
        }
        return new otn(trim, i, str2, a);
    }
}
