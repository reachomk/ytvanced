package defpackage;

/* renamed from: ampq */
public final class ampq {
    public static String a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (ampq.a(str.charAt(i))) {
                char[] toCharArray = str.toCharArray();
                while (i < length) {
                    char c = toCharArray[i];
                    if (ampq.a(c)) {
                        toCharArray[i] = (char) (c ^ 32);
                    }
                    i++;
                }
                return String.valueOf(toCharArray);
            }
            i++;
        }
        return str;
    }

    public static boolean a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private static int b(char c) {
        return (char) ((c | 32) - 97);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2) {
                int b = ampq.b(charAt);
                if (b >= 26 || b != ampq.b(charAt2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
