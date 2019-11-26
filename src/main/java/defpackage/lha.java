package defpackage;

import android.text.TextUtils;

/* renamed from: lha */
public final class lha extends aisl {
    private final bcaa a;

    public lha(xci xci, abka abka, aisj aisj, bcaa bcaa) {
        super(xci, abka, aisj);
        this.a = bcaa;
    }

    /* Access modifiers changed, original: protected|final */
    public final abkg a(String str, String str2, int i, String str3, byte[] bArr, acxt acxt) {
        atog atog;
        abkg a = super.a(str, str2, i, str3, bArr, acxt);
        aikf aikf = (aikf) this.a.get();
        i = 0;
        xca a2 = aikf.a(0);
        xca a3 = aikf.a(1);
        int a4 = aikf.a();
        if (a2.isEmpty() && a3.isEmpty()) {
            atog = null;
        } else {
            atof atof = (atof) atog.e.createBuilder();
            int size = a2.size();
            int i2 = 0;
            while (i2 < size) {
                atoi a5 = lha.a((enm) a2.get(i2));
                atof.copyOnWrite();
                atog atog2 = (atog) atof.instance;
                if (a5 != null) {
                    if (!atog2.b.a()) {
                        atog2.b = anxl.mutableCopy(atog2.b);
                    }
                    atog2.b.add(a5);
                    i2++;
                } else {
                    throw new NullPointerException();
                }
            }
            atof.copyOnWrite();
            atog atog3 = (atog) atof.instance;
            atog3.a = 1 | atog3.a;
            atog3.d = a4;
            a4 = a3.size();
            while (i < a4) {
                atoi a6 = lha.a((enm) a3.get(i));
                atof.copyOnWrite();
                atog atog4 = (atog) atof.instance;
                if (a6 != null) {
                    if (!atog4.c.a()) {
                        atog4.c = anxl.mutableCopy(atog4.c);
                    }
                    atog4.c.add(a6);
                    i++;
                } else {
                    throw new NullPointerException();
                }
            }
            atog = (atog) ((anxl) atof.build());
        }
        a.p = atog;
        return a;
    }

    private static atoi a(enm enm) {
        atoh atoh = (atoh) atoi.f.createBuilder();
        String c = enm.c();
        atoh.copyOnWrite();
        atoi atoi = (atoi) atoh.instance;
        if (c != null) {
            atoi atoi2;
            atoi.a |= 1;
            atoi.b = c;
            c = enm.e().c();
            int d = enm.e().d();
            if (!"".equals(c)) {
                atoh.copyOnWrite();
                atoi atoi3 = (atoi) atoh.instance;
                if (c != null) {
                    atoi3.a |= 2;
                    atoi3.c = c;
                } else {
                    throw new NullPointerException();
                }
            }
            if (d != -1) {
                atoh.copyOnWrite();
                atoi2 = (atoi) atoh.instance;
                atoi2.a |= 4;
                atoi2.d = d;
            }
            String f = enm.f();
            if (!TextUtils.isEmpty(f)) {
                atoh.copyOnWrite();
                atoi2 = (atoi) atoh.instance;
                if (f != null) {
                    atoi2.a |= 8;
                    atoi2.e = f;
                } else {
                    throw new NullPointerException();
                }
            }
            return (atoi) ((anxl) atoh.build());
        }
        throw new NullPointerException();
    }
}
