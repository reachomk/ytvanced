package defpackage;

import java.util.Arrays;

/* renamed from: rjy */
public final class rjy extends rio implements Cloneable {
    private byte[] a;
    private String b;
    private byte[][] c;
    private boolean d;

    public rjy() {
        this.a = riv.e;
        this.b = "";
        this.c = riv.d;
        this.d = false;
        this.V = null;
        this.W = -1;
    }

    /* renamed from: e */
    public final rjy clone() {
        try {
            rjy rjy = (rjy) super.clone();
            byte[][] bArr = this.c;
            if (bArr != null && bArr.length > 0) {
                rjy.c = (byte[][]) bArr.clone();
            }
            return rjy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rjy) {
            rjy rjy = (rjy) obj;
            if (Arrays.equals(this.a, rjy.a)) {
                String str = this.b;
                if (str == null) {
                    if (rjy.b != null) {
                        return false;
                    }
                } else if (!str.equals(rjy.b)) {
                    return false;
                }
                if (ris.a(this.c, rjy.c) && this.d == rjy.d) {
                    riq riq = this.V;
                    if (riq != null && !riq.a()) {
                        return this.V.equals(rjy.V);
                    }
                    riq riq2 = rjy.V;
                    return riq2 == null || riq2.a();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.a)) * 31;
        String str = this.b;
        int i = 0;
        hashCode = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + ris.a(this.c)) * 31) + (!this.d ? 1237 : 1231)) * 31;
        riq riq = this.V;
        if (!(riq == null || riq.a())) {
            i = this.V.hashCode();
        }
        return hashCode + i;
    }

    public final void a(rim rim) {
        if (!Arrays.equals(this.a, riv.e)) {
            rim.a(1, this.a);
        }
        byte[][] bArr = this.c;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    rim.a(2, bArr3);
                }
                i++;
            }
        }
        if (this.d) {
            rim.a(3, true);
        }
        String str = this.b;
        if (!(str == null || str.equals(""))) {
            rim.a(4, this.b);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        if (!Arrays.equals(this.a, riv.e)) {
            a += rim.b(1, this.a);
        }
        byte[][] bArr = this.c;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += rim.a(bArr3);
                }
                i++;
            }
            a = (a + i2) + i3;
        }
        if (this.d) {
            a += rim.b(3) + 1;
        }
        String str = this.b;
        return (str == null || str.equals("")) ? a : a + rim.b(4, this.b);
    }
}
