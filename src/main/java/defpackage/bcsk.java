package defpackage;

/* renamed from: bcsk */
abstract class bcsk implements bcsv, bcsz {
    public final bcpm a;
    public final int b;
    public final boolean c;

    bcsk(bcpm bcpm, int i, boolean z) {
        this.a = bcpm;
        this.b = i;
        this.c = z;
    }

    public final int b() {
        return this.b;
    }

    public int a(bcsu bcsu, String str, int i) {
        int min = Math.min(this.b, str.length() - i);
        int i2 = i;
        i = 0;
        int i3 = 0;
        while (i < min) {
            char charAt = str.charAt(i2 + i);
            if (i != 0 || ((charAt != '-' && charAt != '+') || !this.c)) {
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i++;
            } else {
                int i4 = charAt == '-' ? 1 : 0;
                if (min > 1) {
                    i3 = i2 + 1;
                    char charAt2 = str.charAt(i3);
                    if (charAt2 >= '0' && charAt2 <= '9') {
                        if (charAt != '-') {
                            i2 = i3;
                        }
                        min = Math.min(min + 1, str.length() - i2);
                        i = i4;
                        i3 = i;
                    }
                }
                i3 = i4;
                break;
            }
        }
        if (i == 0) {
            return i2 ^ -1;
        }
        int parseInt;
        if (i >= 9) {
            i += i2;
            parseInt = Integer.parseInt(str.substring(i2, i));
        } else {
            min = i3 != 0 ? i2 + 1 : i2;
            try {
                min = str.charAt(min) - 48;
                i += i2;
                for (int i5 = min + 1; i5 < i; i5++) {
                    min = (((min << 3) + (min + min)) + str.charAt(i5)) - 48;
                }
                parseInt = i3 != 0 ? -min : min;
            } catch (StringIndexOutOfBoundsException unused) {
                return i2 ^ -1;
            }
        }
        bcsu.a(this.a, parseInt);
        return i;
    }
}
