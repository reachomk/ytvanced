package defpackage;

/* renamed from: nwt */
public final class nwt {
    public static boolean a(String str) {
        return nwt.c(str).equals("audio");
    }

    public static boolean b(String str) {
        return nwt.c(str).equals("video");
    }

    public static String c(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        String str2 = "Invalid mime type: ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalArgumentException(str);
    }
}
