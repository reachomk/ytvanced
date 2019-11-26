package defpackage;

import java.nio.charset.Charset;

/* renamed from: anwe */
class anwe extends anwb {
    public static final long serialVersionUID = 1;
    public final byte[] c;

    anwe(byte[] bArr) {
        if (bArr != null) {
            this.c = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected */
    public int k() {
        return 0;
    }

    public byte a(int i) {
        return this.c[i];
    }

    /* Access modifiers changed, original: 0000 */
    public byte b(int i) {
        return this.c[i];
    }

    public int b() {
        return this.c.length;
    }

    public final anvu a(int i, int i2) {
        i2 = anvu.c(i, i2, b());
        if (i2 == 0) {
            return anvu.a;
        }
        return new anvx(this.c, k() + i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    /* Access modifiers changed, original: final */
    public final void a(anvr anvr) {
        anvr.a(this.c, k(), b());
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(Charset charset) {
        return new String(this.c, k(), b(), charset);
    }

    public final boolean f() {
        int k = k();
        return aobd.a(this.c, k, b() + k);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(int i, int i2, int i3) {
        int k = k() + i2;
        return aobd.a.a(i, this.c, k, i3 + k);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anvu) || b() != ((anvu) obj).b()) {
            return false;
        }
        if (b() == 0) {
            return true;
        }
        if (!(obj instanceof anwe)) {
            return obj.equals(this);
        }
        anwe anwe = (anwe) obj;
        int i = this.b;
        int i2 = anwe.b;
        if (i == 0 || i2 == 0 || i == i2) {
            return a(anwe, 0, b());
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anvu anvu, int i, int i2) {
        if (i2 <= anvu.b()) {
            int i3 = i + i2;
            int b;
            if (i3 > anvu.b()) {
                b = anvu.b();
                StringBuilder stringBuilder = new StringBuilder(59);
                stringBuilder.append("Ran off end of other: ");
                stringBuilder.append(i);
                String str = ", ";
                stringBuilder.append(str);
                stringBuilder.append(i2);
                stringBuilder.append(str);
                stringBuilder.append(b);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (!(anvu instanceof anwe)) {
                return anvu.a(i, i3).equals(a(0, i2));
            } else {
                anwe anwe = (anwe) anvu;
                byte[] bArr = this.c;
                byte[] bArr2 = anwe.c;
                int k = k() + i2;
                i2 = k();
                b = anwe.k() + i;
                while (i2 < k) {
                    if (bArr[i2] != bArr2[b]) {
                        return false;
                    }
                    i2++;
                    b++;
                }
                return true;
            }
        }
        i = b();
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("Length too large: ");
        stringBuilder2.append(i2);
        stringBuilder2.append(i);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(int i, int i2, int i3) {
        return anxw.a(i, this.c, k() + i2, i3);
    }

    public final anwf g() {
        return anwf.a(this.c, k(), b(), true);
    }
}
