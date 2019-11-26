package defpackage;

/* renamed from: ebm */
public final class ebm {
    public static String a(String str) {
        str = String.valueOf(str);
        String str2 = "UC";
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }

    public static boolean b(String str) {
        return str.startsWith("VLPL") || str.startsWith("VLLL") || "VLWL".equals(str);
    }

    public static String c(String str) {
        return ebm.b(str) ? str.substring(2) : null;
    }
}
