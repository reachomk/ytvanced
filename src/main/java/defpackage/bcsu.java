package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: bcsu */
public final class bcsu {
    public final bcpl a;
    public bcpt b;
    public Integer c;
    public final Locale d;
    public final Integer e;
    public bcsx[] f = new bcsx[8];
    public int g;
    private final int h;
    private boolean i;
    private Object j;

    public bcsu(bcpl bcpl, Locale locale, Integer num, int i) {
        bcpl = bcpo.a(bcpl);
        this.b = bcpl.a();
        this.a = bcpl.b();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        this.d = locale;
        this.e = num;
        this.h = i;
    }

    public final void a(bcpt bcpt) {
        this.j = null;
        this.b = bcpt;
    }

    public final void a(Integer num) {
        this.j = null;
        this.c = num;
    }

    public final void a(bcpm bcpm, int i) {
        a(new bcsx(bcpm.a(this.a), i));
    }

    public final void a(bcsx bcsx) {
        bcsx[] bcsxArr = this.f;
        int i = this.g;
        int length = bcsxArr.length;
        if (i == length || this.i) {
            if (i == length) {
                length = i + i;
            }
            bcsx[] bcsxArr2 = new bcsx[length];
            System.arraycopy(bcsxArr, 0, bcsxArr2, 0, i);
            this.f = bcsxArr2;
            this.i = false;
            bcsxArr = bcsxArr2;
        }
        this.j = null;
        bcsxArr[i] = bcsx;
        this.g = i + 1;
    }

    public final Object a() {
        if (this.j == null) {
            this.j = new bcsw(this);
        }
        return this.j;
    }

    public final boolean a(Object obj) {
        if (obj instanceof bcsw) {
            bcsw bcsw = (bcsw) obj;
            if (this == bcsw.e) {
                this.b = bcsw.a;
                this.c = bcsw.b;
                this.f = bcsw.c;
                int i = bcsw.d;
                if (i < this.g) {
                    this.i = true;
                }
                this.g = i;
                this.j = obj;
                return true;
            }
        }
        return false;
    }

    public final long a(String str) {
        int i;
        String str2;
        StringBuilder stringBuilder;
        Object[] objArr = this.f;
        int i2 = this.g;
        if (this.i) {
            objArr = (bcsx[]) objArr.clone();
            this.f = objArr;
            this.i = false;
        }
        if (i2 <= 10) {
            for (i = 0; i < i2; i++) {
                int i3 = i;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (objArr[i4].compareTo(objArr[i3]) <= 0) {
                        break;
                    }
                    Object obj = objArr[i3];
                    objArr[i3] = objArr[i4];
                    objArr[i4] = obj;
                    i3 = i4;
                }
            }
        } else {
            Arrays.sort(objArr, 0, i2);
        }
        long j = 0;
        if (i2 > 0) {
            bcpx a = bcpw.e.a(this.a);
            bcpx a2 = bcpw.g.a(this.a);
            bcpx d = objArr[0].a.d();
            if (bcsu.a(d, a) >= 0 && bcsu.a(d, a2) <= 0) {
                a(bcpm.e, this.h);
                return a(str);
            }
        }
        i = 0;
        while (true) {
            str2 = "Cannot parse \"";
            if (i >= i2) {
                break;
            }
            j = objArr[i].a(j, true);
            i++;
        }
        i = 0;
        while (i < i2) {
            try {
                j = objArr[i].a(j, i == i2 + -1);
                i++;
            } catch (bcpy e) {
                if (str != null) {
                    stringBuilder = new StringBuilder(str.length() + 15);
                    stringBuilder.append(str2);
                    stringBuilder.append(str);
                    stringBuilder.append('\"');
                    str = stringBuilder.toString();
                    String str3 = e.a;
                    if (str3 == null) {
                        e.a = str;
                    } else if (str != null) {
                        StringBuilder stringBuilder2 = new StringBuilder((str.length() + 2) + str3.length());
                        stringBuilder2.append(str);
                        stringBuilder2.append(": ");
                        stringBuilder2.append(str3);
                        e.a = stringBuilder2.toString();
                    }
                }
                throw e;
            }
        }
        Integer num = this.c;
        if (num != null) {
            j -= (long) num.intValue();
        } else {
            bcpt bcpt = this.b;
            if (bcpt != null) {
                int e2 = bcpt.e(j);
                j -= (long) e2;
                if (e2 != this.b.b(j)) {
                    String valueOf = String.valueOf(this.b);
                    stringBuilder = new StringBuilder(valueOf.length() + 53);
                    stringBuilder.append("Illegal instant due to time zone offset transition (");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(')');
                    valueOf = stringBuilder.toString();
                    if (str != null) {
                        StringBuilder stringBuilder3 = new StringBuilder((str.length() + 17) + String.valueOf(valueOf).length());
                        stringBuilder3.append(str2);
                        stringBuilder3.append(str);
                        stringBuilder3.append("\": ");
                        stringBuilder3.append(valueOf);
                        valueOf = stringBuilder3.toString();
                    }
                    throw new bcqb(valueOf);
                }
            }
        }
        return j;
    }

    static int a(bcpx bcpx, bcpx bcpx2) {
        return (bcpx == null || !bcpx.b()) ? (bcpx2 == null || !bcpx2.b()) ? 0 : -1 : (bcpx2 == null || !bcpx2.b()) ? 1 : -bcpx.compareTo(bcpx2);
    }
}
