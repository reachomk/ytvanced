package defpackage;

import java.util.regex.Pattern;

/* renamed from: otf */
final class otf {
    public static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public final oza b = new oza();
    public final StringBuilder c = new StringBuilder();

    static void a(oza oza) {
        while (true) {
            Object obj = 1;
            while (oza.b() > 0 && obj != null) {
                int i = oza.b;
                byte[] bArr = oza.a;
                byte b = bArr[i];
                char c = (char) b;
                if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                    oza.d(1);
                } else {
                    int i2 = oza.c;
                    if (i + 2 <= i2) {
                        i++;
                        if (b == (byte) 47) {
                            int i3 = i + 1;
                            if (bArr[i] == (byte) 42) {
                                while (true) {
                                    i = i3 + 1;
                                    if (i >= i2) {
                                        break;
                                    } else if (((char) bArr[i3]) == '*' && ((char) bArr[i]) == '/') {
                                        i3 = i + 1;
                                        i2 = i3;
                                    } else {
                                        i3 = i;
                                    }
                                }
                                oza.d(i2 - oza.b);
                            }
                        } else {
                            continue;
                        }
                    }
                    obj = null;
                }
            }
            return;
        }
    }

    static String a(oza oza, StringBuilder stringBuilder) {
        otf.a(oza);
        if (oza.b() == 0) {
            return null;
        }
        String b = otf.b(oza, stringBuilder);
        if (!"".equals(b)) {
            return b;
        }
        int d = oza.d();
        stringBuilder = new StringBuilder(1);
        stringBuilder.append((char) d);
        return stringBuilder.toString();
    }

    public static String b(oza oza, StringBuilder stringBuilder) {
        int i = 0;
        stringBuilder.setLength(0);
        int i2 = oza.b;
        int i3 = oza.c;
        while (i2 < i3 && i == 0) {
            char c = (char) oza.a[i2];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                i = 1;
            } else {
                i2++;
                stringBuilder.append(c);
            }
        }
        oza.d(i2 - oza.b);
        return stringBuilder.toString();
    }
}
