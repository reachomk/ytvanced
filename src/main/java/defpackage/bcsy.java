package defpackage;

/* renamed from: bcsy */
public final class bcsy {
    private static final double a = Math.log(10.0d);

    public static void a(StringBuffer stringBuffer, int i, int i2) {
        if (i < 0) {
            stringBuffer.append('-');
            if (i != aocf.UNSET_ENUM_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    stringBuffer.append('0');
                    i2--;
                }
                stringBuffer.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                stringBuffer.append('0');
                i2--;
            }
            stringBuffer.append((char) (i + 48));
        } else if (i >= 100) {
            int log = i < 1000 ? 3 : i >= 10000 ? ((int) (Math.log((double) i) / a)) + 1 : 4;
            while (i2 > log) {
                stringBuffer.append('0');
                i2--;
            }
            stringBuffer.append(Integer.toString(i));
        } else {
            while (i2 > 2) {
                stringBuffer.append('0');
                i2--;
            }
            i2 = ((i + 1) * 13421772) >> 27;
            stringBuffer.append((char) (i2 + 48));
            stringBuffer.append((char) (((i - (i2 << 3)) - (i2 + i2)) + 48));
        }
    }

    public static void a(StringBuffer stringBuffer, int i) {
        if (i < 0) {
            stringBuffer.append('-');
            if (i != aocf.UNSET_ENUM_VALUE) {
                i = -i;
            } else {
                stringBuffer.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            stringBuffer.append((char) (i + 48));
        } else if (i < 100) {
            int i2 = ((i + 1) * 13421772) >> 27;
            stringBuffer.append((char) (i2 + 48));
            stringBuffer.append((char) (((i - (i2 << 3)) - (i2 + i2)) + 48));
        } else {
            stringBuffer.append(Integer.toString(i));
        }
    }

    public static void a(StringBuffer stringBuffer, long j) {
        int i = (int) j;
        if (((long) i) != j) {
            stringBuffer.append(Long.toString(j));
        } else {
            bcsy.a(stringBuffer, i);
        }
    }

    static int a(String str, int i) {
        int charAt = str.charAt(i) - 48;
        return (((charAt << 3) + (charAt + charAt)) + str.charAt(i + 1)) - 48;
    }

    public static String b(String str, int i) {
        int i2 = i + 32;
        Object concat = str.length() > i2 + 3 ? str.substring(0, i2).concat("...") : str;
        String str2 = "Invalid format: \"";
        StringBuilder stringBuilder;
        if (i <= 0) {
            stringBuilder = new StringBuilder(String.valueOf(concat).length() + 18);
            stringBuilder.append(str2);
            stringBuilder.append(concat);
            stringBuilder.append('\"');
            return stringBuilder.toString();
        } else if (i >= str.length()) {
            stringBuilder = new StringBuilder(String.valueOf(concat).length() + 31);
            stringBuilder.append(str2);
            stringBuilder.append(concat);
            stringBuilder.append("\" is too short");
            return stringBuilder.toString();
        } else {
            str = concat.substring(i);
            StringBuilder stringBuilder2 = new StringBuilder((concat.length() + 37) + String.valueOf(str).length());
            stringBuilder2.append(str2);
            stringBuilder2.append(concat);
            stringBuilder2.append("\" is malformed at \"");
            stringBuilder2.append(str);
            stringBuilder2.append('\"');
            return stringBuilder2.toString();
        }
    }
}
