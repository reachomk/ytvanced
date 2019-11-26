package defpackage;

/* renamed from: bbiu */
public final class bbiu {
    public static boolean a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~') {
                return false;
            }
        }
        return true;
    }
}
