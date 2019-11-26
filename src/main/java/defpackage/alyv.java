package defpackage;

import java.util.concurrent.Executor;

/* renamed from: alyv */
public class alyv {
    private final String a;
    private final xvx b;
    private final amdg c;
    private final zyw d;
    private final amac e;

    public alyv(zzf zzf, xvx xvx, amdg amdg, zyw zyw, amac amac) {
        this.a = zzf.j().c;
        this.b = xvx;
        this.c = amdg;
        this.d = zyw;
        this.e = amac;
    }

    /* Access modifiers changed, original: protected */
    public String a() {
        return "0";
    }

    /* Access modifiers changed, original: protected */
    public String b() {
        return this.b.a();
    }

    public final String a(int i, boolean z) {
        String str = this.a;
        String b = b();
        String a = a();
        i--;
        String str2 = i != 1 ? i != 3 ? i != 4 ? "ut=0" : "ut=2" : "ut=3" : "ut=1";
        apxn a2 = this.d.a();
        String str3 = "um=2";
        if (i == 1 || i == 4) {
            this.e.n();
            ayuw ayuw = a2.p;
            if (ayuw == null) {
                ayuw = ayuw.h;
            }
            if (ayuw.g && !z) {
                str3 = "um=3";
            }
        }
        StringBuilder stringBuilder = new StringBuilder(((((String.valueOf(str).length() + 4) + String.valueOf(b).length()) + String.valueOf(a).length()) + str2.length()) + str3.length());
        stringBuilder.append(str);
        String str4 = ":";
        stringBuilder.append(str4);
        stringBuilder.append(b);
        stringBuilder.append(str4);
        stringBuilder.append(a);
        stringBuilder.append(str4);
        stringBuilder.append(str2);
        stringBuilder.append(",");
        stringBuilder.append(str3);
        str4 = stringBuilder.toString();
        amdg amdg = this.c;
        tgv tgv = amdg.b;
        if (tgv != null) {
            Executor executor = amdg.c;
            if (executor != null) {
                executor.execute(new amdf(amdg.a, tgv, str4, amdg.d));
            }
        }
        return str4;
    }
}
