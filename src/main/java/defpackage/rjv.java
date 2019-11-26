package defpackage;

/* renamed from: rjv */
public final class rjv extends rio implements Cloneable {
    private String[] a;
    private String[] b;
    private int[] c;
    private long[] d;
    private long[] e;

    public rjv() {
        this.a = riv.c;
        this.b = riv.c;
        this.c = riv.a;
        this.d = riv.b;
        this.e = riv.b;
        this.V = null;
        this.W = -1;
    }

    /* renamed from: e */
    public final rjv clone() {
        try {
            rjv rjv = (rjv) super.clone();
            String[] strArr = this.a;
            if (strArr != null && strArr.length > 0) {
                rjv.a = (String[]) strArr.clone();
            }
            strArr = this.b;
            if (strArr != null && strArr.length > 0) {
                rjv.b = (String[]) strArr.clone();
            }
            int[] iArr = this.c;
            if (iArr != null && iArr.length > 0) {
                rjv.c = (int[]) iArr.clone();
            }
            long[] jArr = this.d;
            if (jArr != null && jArr.length > 0) {
                rjv.d = (long[]) jArr.clone();
            }
            jArr = this.e;
            if (jArr != null && jArr.length > 0) {
                rjv.e = (long[]) jArr.clone();
            }
            return rjv;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rjv) {
            rjv rjv = (rjv) obj;
            if (ris.a(this.a, rjv.a) && ris.a(this.b, rjv.b) && ris.a(this.c, rjv.c) && ris.a(this.d, rjv.d) && ris.a(this.e, rjv.e)) {
                riq riq = this.V;
                if (riq != null && !riq.a()) {
                    return this.V.equals(rjv.V);
                }
                riq riq2 = rjv.V;
                return riq2 == null || riq2.a();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + ris.a(this.a)) * 31) + ris.a(this.b)) * 31) + ris.a(this.c)) * 31) + ris.a(this.d)) * 31) + ris.a(this.e)) * 31;
        riq riq = this.V;
        int i = 0;
        if (!(riq == null || riq.a())) {
            i = this.V.hashCode();
        }
        return hashCode + i;
    }

    public final void a(rim rim) {
        int i;
        String[] strArr;
        String str;
        String[] strArr2 = this.a;
        int i2 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.a;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    rim.a(1, str);
                }
                i++;
            }
        }
        strArr2 = this.b;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.b;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    rim.a(2, str);
                }
                i++;
            }
        }
        int[] iArr = this.c;
        if (iArr != null && iArr.length > 0) {
            i = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i >= iArr2.length) {
                    break;
                }
                rim.a(3, iArr2[i]);
                i++;
            }
        }
        long[] jArr = this.d;
        if (jArr != null && jArr.length > 0) {
            i = 0;
            while (true) {
                long[] jArr2 = this.d;
                if (i >= jArr2.length) {
                    break;
                }
                rim.a(4, jArr2[i]);
                i++;
            }
        }
        jArr = this.e;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                jArr = this.e;
                if (i2 >= jArr.length) {
                    break;
                }
                rim.a(5, jArr[i2]);
                i2++;
            }
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int i;
        int i2;
        int i3;
        String[] strArr;
        String str;
        int length;
        int a = super.a();
        String[] strArr2 = this.a;
        int i4 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.a;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += rim.a(str);
                }
                i++;
            }
            a = (a + i2) + i3;
        }
        strArr2 = this.b;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.b;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += rim.a(str);
                }
                i++;
            }
            a = (a + i2) + i3;
        }
        int[] iArr = this.c;
        if (iArr != null && iArr.length > 0) {
            i = 0;
            i2 = 0;
            while (true) {
                int[] iArr2 = this.c;
                length = iArr2.length;
                if (i >= length) {
                    break;
                }
                i2 += rim.a(iArr2[i]);
                i++;
            }
            a = (a + i2) + length;
        }
        long[] jArr = this.d;
        if (jArr != null && jArr.length > 0) {
            i = 0;
            i2 = 0;
            while (true) {
                long[] jArr2 = this.d;
                length = jArr2.length;
                if (i >= length) {
                    break;
                }
                i2 += rim.b(jArr2[i]);
                i++;
            }
            a = (a + i2) + length;
        }
        jArr = this.e;
        if (jArr == null || jArr.length <= 0) {
            return a;
        }
        i = 0;
        while (true) {
            long[] jArr3 = this.e;
            i3 = jArr3.length;
            if (i4 >= i3) {
                return (a + i) + i3;
            }
            i += rim.b(jArr3[i4]);
            i4++;
        }
    }
}
