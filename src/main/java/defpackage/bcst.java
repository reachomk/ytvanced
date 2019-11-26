package defpackage;

import java.util.Locale;

/* renamed from: bcst */
public final class bcst implements bcsv, bcsz {
    private final bcpm a;
    private final int b;
    private final boolean c;

    public bcst(bcpm bcpm, int i, boolean z) {
        this.a = bcpm;
        this.b = i;
        this.c = z;
    }

    public final int a() {
        return 2;
    }

    public final int b() {
        return !this.c ? 2 : 4;
    }

    public final int a(bcsu bcsu, String str, int i) {
        int parseInt;
        int i2;
        int length = str.length() - i;
        if (this.c) {
            int i3 = i;
            i = 0;
            Object obj = null;
            Object obj2 = null;
            while (i < length) {
                char charAt = str.charAt(i3 + i);
                if (i != 0 || (charAt != '-' && charAt != '+')) {
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    i++;
                } else {
                    obj2 = charAt == '-' ? 1 : null;
                    if (obj2 == null) {
                        i3++;
                        length--;
                    } else {
                        i = 1;
                    }
                    obj = 1;
                }
            }
            if (i == 0) {
                return i3 ^ -1;
            }
            if (obj == null && i == 2) {
                i = i3;
            } else {
                if (i >= 9) {
                    i += i3;
                    parseInt = Integer.parseInt(str.substring(i3, i));
                } else {
                    length = obj2 != null ? i3 + 1 : i3;
                    try {
                        length = str.charAt(length) - 48;
                        i += i3;
                        for (i2 = length + 1; i2 < i; i2++) {
                            length = (((length << 3) + (length + length)) + str.charAt(i2)) - 48;
                        }
                        parseInt = obj2 != null ? -length : length;
                    } catch (StringIndexOutOfBoundsException unused) {
                        return i3 ^ -1;
                    }
                }
                bcsu.a(this.a, parseInt);
                return i;
            }
        } else if (Math.min(2, length) < 2) {
            return i ^ -1;
        }
        char charAt2 = str.charAt(i);
        if (charAt2 < '0' || charAt2 > '9') {
            return i ^ -1;
        }
        length = charAt2 - 48;
        char charAt3 = str.charAt(i + 1);
        if (charAt3 < '0' || charAt3 > '9') {
            return i ^ -1;
        }
        int i4;
        i2 = (((length << 3) + (length + length)) + charAt3) - 48;
        parseInt = this.b;
        Integer num = bcsu.e;
        if (num != null) {
            parseInt = num.intValue();
        }
        parseInt -= 50;
        length = 100;
        if (parseInt < 0) {
            i4 = ((parseInt + 1) % 100) + 99;
        } else {
            i4 = parseInt % 100;
        }
        if (i2 >= i4) {
            length = 0;
        }
        bcsu.a(this.a, i2 + ((parseInt + length) - i4));
        return i + 2;
    }

    public final void a(StringBuffer stringBuffer, long j, bcpl bcpl, int i, bcpt bcpt, Locale locale) {
        int a;
        try {
            a = this.a.a(bcpl).a(j);
            if (a < 0) {
                a = -a;
            }
            a %= 100;
        } catch (RuntimeException unused) {
            a = -1;
        }
        if (a >= 0) {
            bcsy.a(stringBuffer, a, 2);
            return;
        }
        stringBuffer.append(65533);
        stringBuffer.append(65533);
    }
}
