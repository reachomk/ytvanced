package defpackage;

/* renamed from: agnd */
public final class agnd {
    public static String a(String str, String str2) {
        int i = 0;
        amqw.b(str2.charAt(0) == '.');
        Object obj = "(invalid)";
        if (str == null || str.isEmpty() || ".".equals(str) || "..".equals(str)) {
            return str2.length() == 0 ? new String(obj) : obj.concat(str2);
        }
        StringBuilder stringBuilder = new StringBuilder(str.length());
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == 0 || charAt == '/' || charAt <= 31 || charAt == '\"' || charAt == '*' || charAt == '/' || charAt == ':' || charAt == '<' || charAt == '\\' || charAt == '|' || charAt == 127 || charAt == '>' || charAt == '?' || (i == 0 && charAt == '.')) {
                stringBuilder.append('_');
            } else {
                stringBuilder.append(charAt);
            }
            i++;
        }
        int a = 230 - amrt.a(str2);
        String str3 = "...";
        int a2 = a - amrt.a(str3);
        try {
            int a3 = amrt.a(stringBuilder);
            if (a3 > a) {
                while (a3 > a2) {
                    stringBuilder.deleteCharAt(stringBuilder.length() / 2);
                    a3 = amrt.a(stringBuilder);
                }
                stringBuilder.insert(stringBuilder.length() / 2, str3);
            }
            obj = stringBuilder.toString();
        } catch (IllegalArgumentException unused) {
        }
        str = String.valueOf(obj);
        return str2.length() == 0 ? new String(str) : str.concat(str2);
    }
}
