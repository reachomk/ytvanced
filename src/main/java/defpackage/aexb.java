package defpackage;

import android.net.Uri;

/* renamed from: aexb */
public final class aexb {
    public static npo a(aahr aahr, String str, aajj aajj) {
        aahr aahr2 = aahr;
        aahs a = aahr.a();
        a.a(str);
        a.a(afix.a(aahr2, aajj));
        Uri a2 = a.a();
        arlv arlv = aahr2.a;
        String str2 = aahr2.b;
        long C = aahr.C();
        aajy a3 = aajy.a(aahr);
        String uri = a2.toString();
        armb armb = arlv.l;
        if (armb == null) {
            armb = armb.d;
        }
        long j = armb.b;
        armb = arlv.l;
        if (armb == null) {
            armb = armb.d;
        }
        long j2 = armb.c;
        armb = arlv.m;
        if (armb == null) {
            armb = armb.d;
        }
        long j3 = armb.b;
        armb = arlv.m;
        if (armb == null) {
            armb = armb.d;
        }
        long j4 = armb.c;
        long j5 = j3;
        return new npo(str2, C, a3, new npu(new npj("", j, (j2 - j) + 1), 1, 0, j5, (j4 - j5) + 1), aahr2.h, aahr.c(), uri);
    }
}
