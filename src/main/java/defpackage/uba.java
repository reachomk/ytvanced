package defpackage;

/* renamed from: uba */
public final class uba extends ubb {
    public final uax a;

    protected uba(int i, uax uax) {
        super(i);
        this.a = (uax) uhy.a((Object) uax);
    }

    public final int a(ubl ubl) {
        return this.a.h;
    }

    public final int a(ubl ubl, int i) {
        uax uax = this.a;
        uhy.a(i, uax.h);
        int i2 = this.k;
        int i3 = ubl.b;
        return uax.a(ubl, (((i2 + i3) + 4) + i3) + 4, i);
    }

    public final String b(ubl ubl, int i) {
        return this.a.d(ubl, i);
    }

    public final String c(ubl ubl, int i) {
        if (i >= 0) {
            uax uax = this.a;
            if (i < uax.h) {
                uax = uax.a(i);
                uax uax2 = this.a;
                String c;
                String b;
                if (uax == uax2) {
                    c = uax2.c(ubl);
                    b = b(ubl, i);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(c).length() + 1) + String.valueOf(b).length());
                    stringBuilder.append(c);
                    stringBuilder.append('#');
                    stringBuilder.append(b);
                    return stringBuilder.toString();
                }
                String c2 = uax2.c(ubl);
                c = uax.c(ubl);
                b = b(ubl, i);
                i = String.valueOf(c2).length();
                StringBuilder stringBuilder2 = new StringBuilder(((i + 2) + String.valueOf(c).length()) + String.valueOf(b).length());
                stringBuilder2.append(c2);
                stringBuilder2.append(':');
                stringBuilder2.append(c);
                stringBuilder2.append('#');
                stringBuilder2.append(b);
                return stringBuilder2.toString();
            }
        }
        return this.a.c(ubl);
    }

    public final int b(ubl ubl) {
        return this.a.i;
    }
}
