package defpackage;

/* renamed from: amyo */
public final class amyo {
    public static final amyo a = new amyo(0, -1, -1);
    private static final long e;
    public final int b;
    public final int c;
    public final int d;

    private static int a(char c) {
        return ((int) ((e >>> ((c - 32) * 3)) & 7)) - 1;
    }

    public static amyo a(String str, int i, int i2, boolean z) {
        if (i == i2 && !z) {
            return a;
        }
        int i3 = !z ? 0 : 128;
        while (i != i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            String str2 = "invalid flag";
            int a;
            if (charAt >= ' ' && charAt <= '0') {
                a = amyo.a(charAt);
                if (a >= 0) {
                    i = 1 << a;
                    if ((i3 & i) == 0) {
                        i3 |= i;
                        i = i4;
                    } else {
                        throw anac.a("repeated flag", str, i4 - 1);
                    }
                } else if (charAt == '.') {
                    return new amyo(i3, -1, amyo.a(str, i4, i2));
                } else {
                    throw anac.a(str2, str, i4 - 1);
                }
            }
            a = i4 - 1;
            if (charAt <= '9') {
                i = charAt - 48;
                while (i4 != i2) {
                    int i5 = i4 + 1;
                    char charAt2 = str.charAt(i4);
                    if (charAt2 == '.') {
                        return new amyo(i3, i, amyo.a(str, i5, i2));
                    }
                    charAt2 = (char) (charAt2 - 48);
                    if (charAt2 < 10) {
                        i = (i * 10) + charAt2;
                        if (i <= 999999) {
                            i4 = i5;
                        } else {
                            throw anac.a("width too large", str, a, i2);
                        }
                    }
                    throw anac.a("invalid width character", str, i5 - 1);
                }
                return new amyo(i3, i, -1);
            }
            throw anac.a(str2, str, a);
        }
        return new amyo(i3, -1, -1);
    }

    private static int a(String str, int i, int i2) {
        if (i != i2) {
            int i3 = i;
            int i4 = 0;
            while (i3 < i2) {
                char charAt = (char) (str.charAt(i3) - 48);
                if (charAt < 10) {
                    i4 = (i4 * 10) + charAt;
                    if (i4 <= 999999) {
                        i3++;
                    } else {
                        throw anac.a("precision too large", str, i, i2);
                    }
                }
                throw anac.a("invalid precision character", str, i3);
            }
            if (i4 != 0 || i2 == i + 1) {
                return i4;
            }
            throw anac.a("invalid precision", str, i, i2);
        }
        throw anac.a("missing precision", str, i - 1);
    }

    static int a(String str, boolean z) {
        int i = 0;
        int i2 = !z ? 0 : 128;
        while (i < str.length()) {
            int a = amyo.a(str.charAt(i));
            if (a >= 0) {
                i2 |= 1 << a;
                i++;
            } else {
                String str2 = "invalid flags: ";
                throw new IllegalArgumentException(str.length() == 0 ? new String(str2) : str2.concat(str));
            }
        }
        return i2;
    }

    public amyo(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean a() {
        return this == a;
    }

    public final boolean a(int i, boolean z) {
        boolean z2 = true;
        if (a()) {
            return true;
        }
        int i2 = this.b;
        if (((i ^ -1) & i2) != 0) {
            return false;
        }
        if (!z && this.d != -1) {
            return false;
        }
        i = this.c;
        if ((i2 & 9) != 9) {
            i2 &= 96;
            if (i2 != 96) {
                if (i2 != 0 && i == -1) {
                    return false;
                }
                return z2;
            }
        }
        z2 = false;
        return z2;
    }

    public final boolean b() {
        return (this.b & 128) != 0;
    }

    public final StringBuilder a(StringBuilder stringBuilder) {
        if (!a()) {
            int i = this.b & -129;
            int i2 = 0;
            while (true) {
                int i3 = 1 << i2;
                if (i3 > i) {
                    break;
                }
                if ((i3 & i) != 0) {
                    stringBuilder.append(" #(+,-0".charAt(i2));
                }
                i2++;
            }
            i = this.c;
            if (i != -1) {
                stringBuilder.append(i);
            }
            if (this.d != -1) {
                stringBuilder.append('.');
                stringBuilder.append(this.d);
            }
        }
        return stringBuilder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amyo) {
            amyo amyo = (amyo) obj;
            return amyo.b == this.b && amyo.c == this.c && amyo.d == this.d;
        }
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - 32)) * 3));
        }
        e = j;
    }
}
