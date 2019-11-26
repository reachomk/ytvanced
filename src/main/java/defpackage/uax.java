package defpackage;

import java.nio.ByteBuffer;

/* renamed from: uax */
public final class uax extends ubb {
    public static uax a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int f;
    public uax g;
    public int h = -1;
    public int i;
    public int j;
    private final int u;

    public uax(int i, int i2) {
        super(i);
        this.u = i2;
    }

    public final int a(ubl ubl) {
        return this.b.length;
    }

    public final int a(ubl ubl, int i) {
        return this.b[i];
    }

    public final String b(ubl ubl, int i) {
        return ubl.a(this.c[i]);
    }

    public final String c(ubl ubl, int i) {
        String str = "static ";
        String b;
        if (i >= 0 && i < this.b.length) {
            String c = c(ubl);
            b = b(ubl, i);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(c).length() + 8) + String.valueOf(b).length());
            stringBuilder.append(str);
            stringBuilder.append(c);
            stringBuilder.append("#");
            stringBuilder.append(b);
            return stringBuilder.toString();
        }
        b = String.valueOf(c(ubl));
        return b.length() == 0 ? new String(str) : str.concat(b);
    }

    public final int b(ubl ubl) {
        return this.j + a.i;
    }

    /* Access modifiers changed, original: final */
    public final String d(ubl ubl, int i) {
        uhy.a(i, this.h);
        int[] iArr = this.d;
        int length = iArr.length;
        if (i < length) {
            return ubl.a(iArr[i]);
        }
        return this.g.d(ubl, i - length);
    }

    /* Access modifiers changed, original: final */
    public final uax a(int i) {
        uhy.a(i, this.h);
        int length = this.d.length;
        return i >= length ? this.g.a(i - length) : this;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        if (this.h == -1) {
            this.h = this.d.length;
            uax uax = this.g;
            if (uax != null) {
                uax.c();
                int i = this.h;
                uax uax2 = this.g;
                this.h = i + uax2.h;
                if ((uax2.o & 2) != 0) {
                    this.o |= 2;
                }
            }
        }
    }

    public final String c(ubl ubl) {
        return ubl.a(this.u);
    }

    public final int a(ubl ubl, int i, int i2) {
        int length = this.d.length;
        if (i2 < length) {
            return ubl.d(i + this.e[i2]);
        }
        return this.g.a(ubl, i + this.f, i2 - length);
    }

    public static void d(ubl ubl) {
        ByteBuffer byteBuffer = ubl.a;
        char c = (char) byteBuffer.getShort();
        for (char c2 = 0; c2 < c; c2++) {
            byteBuffer.getShort();
            ubl.c(ubl.b(byteBuffer.get()));
        }
    }
}
