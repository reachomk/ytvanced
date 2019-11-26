package defpackage;

import android.text.TextUtils;

/* renamed from: ycl */
public final class ycl {
    public boolean a;
    public CharSequence b;
    public CharSequence c;
    public boolean d;
    public boolean e;
    public boolean f;
    public aqmz g;
    public apxu h;
    private final String i;
    private final String j;
    private long k;

    public ycl(String str, Object obj, boolean z) {
        String c;
        long j;
        CharSequence charSequence;
        arml arml;
        CharSequence charSequence2;
        apxu apxu;
        Object obj2 = obj;
        if (TextUtils.isEmpty(zcz.b(obj))) {
            c = zcz.c(obj);
        } else {
            c = zcz.b(obj);
        }
        String str2 = c;
        boolean z2 = obj2 instanceof aqoj;
        if (z2) {
            j = ((aqoj) obj2).c;
        } else if (obj2 instanceof ajtu) {
            j = ((ajtu) obj2).l;
        } else if (obj2 instanceof aqnt) {
            j = ((aqnt) obj2).b;
        } else if (obj2 instanceof aqnr) {
            j = ((aqnr) obj2).c;
        } else if (obj2 instanceof aqnx) {
            j = ((aqnx) obj2).c;
        } else if (obj2 instanceof aqmx) {
            j = ((aqmx) obj2).c;
        } else {
            j = 0;
        }
        long j2 = j;
        aqnf f = zcz.f(obj);
        if (f == null) {
            charSequence = null;
        } else {
            if ((f.a & 4) != 0) {
                arml = f.d;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            charSequence = ajqy.a(arml);
        }
        f = zcz.f(obj);
        if (f == null) {
            charSequence2 = null;
        } else {
            if ((f.a & 2) != 0) {
                arml = f.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            charSequence2 = ajqy.a(arml);
        }
        aqmz j3 = zcz.j(obj);
        apxu apxu2;
        if (z2) {
            aqoj aqoj = (aqoj) obj2;
            if ((aqoj.a & 32768) != 0) {
                apxu2 = aqoj.n;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                apxu = apxu2;
                this(str, str2, j2, z, charSequence, charSequence2, false, false, j3, apxu);
            }
        }
        if (obj2 instanceof ajtu) {
            apxu2 = ((ajtu) obj2).h;
        } else if (obj2 instanceof aqnx) {
            aqnx aqnx = (aqnx) obj2;
            if ((aqnx.a & 65536) != 0) {
                apxu2 = aqnx.o;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
            }
        } else if (obj2 instanceof aqmx) {
            aqmx aqmx = (aqmx) obj2;
            if ((aqmx.a & 65536) != 0) {
                apxu2 = aqmx.n;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
            }
        }
        apxu = apxu2;
        this(str, str2, j2, z, charSequence, charSequence2, false, false, j3, apxu);
        apxu = null;
        this(str, str2, j2, z, charSequence, charSequence2, false, false, j3, apxu);
    }

    public ycl(ycm ycm) {
        this(ycm.a, ycm.b, ycm.c, ycm.d, ycm.f, ycm.g, ycm.e, ycm.h, ycm.j, ycm.k);
    }

    private ycl(String str, String str2, long j, boolean z, CharSequence charSequence, CharSequence charSequence2, boolean z2, boolean z3, aqmz aqmz, apxu apxu) {
        this.i = xvd.a(str);
        this.j = xvd.a(str2);
        this.k = j;
        this.a = z;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z2;
        this.e = z3;
        this.g = aqmz;
        this.h = apxu;
    }

    public final ycm a() {
        return new ycm(this.i, this.j, this.k, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
