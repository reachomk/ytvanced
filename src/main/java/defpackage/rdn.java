package defpackage;

import java.nio.charset.Charset;

/* renamed from: rdn */
class rdn extends rdo {
    public final byte[] c;

    rdn(byte[] bArr) {
        this.c = bArr;
    }

    /* Access modifiers changed, original: protected */
    public int f() {
        return 0;
    }

    public byte a(int i) {
        return this.c[i];
    }

    public int a() {
        return this.c.length;
    }

    public final rdg b(int i) {
        i = rdg.a(0, i, a());
        if (i == 0) {
            return rdg.a;
        }
        return new rdk(this.c, f(), i);
    }

    /* Access modifiers changed, original: protected */
    public void a(byte[] bArr, int i) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    /* Access modifiers changed, original: final */
    public final void a(rdd rdd) {
        rdd.a(this.c, f(), a());
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(Charset charset) {
        return new String(this.c, f(), a(), charset);
    }

    public final boolean d() {
        int f = f();
        return rib.a(this.c, f, a() + f);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rdg) || a() != ((rdg) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (!(obj instanceof rdn)) {
            return obj.equals(this);
        }
        rdn rdn = (rdn) obj;
        int i = this.b;
        int i2 = rdn.b;
        if (i == 0 || i2 == 0 || i == i2) {
            return a(rdn, a());
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(rdg rdg, int i) {
        StringBuilder stringBuilder;
        int a;
        if (i > rdg.a()) {
            int a2 = a();
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i);
            stringBuilder.append(a2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i > rdg.a()) {
            a = rdg.a();
            stringBuilder = new StringBuilder(59);
            stringBuilder.append("Ran off end of other: 0, ");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(a);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!(rdg instanceof rdn)) {
            return rdg.b(i).equals(b(i));
        } else {
            byte[] bArr = this.c;
            rdn rdn = (rdn) rdg;
            byte[] bArr2 = rdn.c;
            int f = f() + i;
            i = f();
            a = rdn.f();
            while (i < f) {
                if (bArr[i] != bArr2[a]) {
                    return false;
                }
                i++;
                a++;
            }
            return true;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(int i, int i2) {
        return rfc.a(i, this.c, f(), i2);
    }

    public final rdp e() {
        return rdp.a(this.c, f(), a());
    }
}
