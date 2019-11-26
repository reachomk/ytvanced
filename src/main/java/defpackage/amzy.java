package defpackage;

/* renamed from: amzy */
public final class amzy extends anab {
    public static final anab a = new amzy();

    private amzy() {
    }

    public final int a(anaa anaa, int i, String str, int i2, int i3, int i4) {
        amzt amzu;
        int i5 = i4 + 1;
        char charAt = str.charAt(i4);
        int i6 = charAt & 32;
        amyo a = amyo.a(str, i3, i4, i6 == 0);
        amyl amyl = amyl.b[amyl.a(charAt)];
        amyl amyl2 = null;
        if (!(i6 == 0 && (amyl == null || (amyl.e & 128) == 0))) {
            amyl2 = amyl;
        }
        if (amyl2 == null) {
            String str2 = "invalid format specification";
            if (charAt == 't' || charAt == 'T') {
                if (a.a(160, false)) {
                    i4 = i5 + 1;
                    if (i4 <= str.length()) {
                        amzr amzr = (amzr) amzr.a.get(Character.valueOf(str.charAt(i5)));
                        if (amzr != null) {
                            amzu = new amzu(a, i, amzr);
                            i5 = i4;
                        } else {
                            throw anac.a("illegal date/time conversion", str, i5);
                        }
                    }
                    throw anac.a("truncated format specifier", str, i2);
                }
                throw anac.a(str2, str, i2, i5);
            } else if (charAt != 'h' && charAt != 'H') {
                throw anac.a(str2, str, i2, i5);
            } else if (a.a(160, false)) {
                amzu = new amzx(a, i);
            } else {
                throw anac.a(str2, str, i2, i5);
            }
        } else if (a.a(amyl2.e, amyl2.d.f)) {
            amzu = amzv.a(i, amyl2, a);
        } else {
            throw anac.a("invalid format specifier", str, i2, i5);
        }
        i = amzu.a;
        if (i < 32) {
            anaa.e |= 1 << i;
        }
        anaa.f = Math.max(anaa.f, i);
        amyz amyz = (amyz) anaa;
        anaa.a().a(amyz.c, anaa.b(), amyz.d, i2);
        Object[] objArr = amyz.b;
        i2 = amzu.a;
        if (i2 < objArr.length) {
            Object obj = objArr[i2];
            if (obj != null) {
                amzu.a(anaa, obj);
            } else {
                amyz.c.append("null");
            }
        } else {
            amyz.c.append("[ERROR: MISSING LOG ARGUMENT]");
        }
        amyz.d = i5;
        return i5;
    }
}
