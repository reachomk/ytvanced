package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: vms */
public final class vms {
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final tar e;
    private final bapu f;
    private final aoqb g;
    private final xsc h;
    private final SharedPreferences i;
    private final afpu j;

    public vms(Context context, String str, String str2, String str3, tar tar) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = tar;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public vms(Context context, String str, String str2, String str3, tar tar, bapu bapu, zyw zyw, xsc xsc, SharedPreferences sharedPreferences, afpu afpu) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = (tar) amqw.a((Object) tar);
        this.f = (bapu) amqw.a((Object) bapu);
        apxn a = zyw.a();
        aoqb aoqb = null;
        if (a != null) {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            if ((auya.a & aocf.UNSET_ENUM_VALUE) != 0) {
                auya auya2 = a.i;
                if (auya2 == null) {
                    auya2 = auya.J;
                }
                aoqb = auya2.s;
                if (aoqb == null) {
                    aoqb = aoqb.m;
                }
            }
        }
        this.g = aoqb;
        this.h = (xsc) amqw.a((Object) xsc);
        this.i = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.j = (afpu) amqw.a((Object) afpu);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARNING: Missing block: B:33:0x0051, code skipped:
            if (r0 != 0) goto L_0x0055;
     */
    public final defpackage.vmr a() {
        /*
        r25 = this;
        r6 = r25;
        r0 = r6.g;
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0010;
    L_0x0008:
        r3 = r0.a;
        r3 = r3 & r2;
        if (r3 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0010;
    L_0x000e:
        r3 = 1;
        goto L_0x0011;
    L_0x0010:
        r3 = 0;
    L_0x0011:
        if (r0 == 0) goto L_0x001a;
    L_0x0013:
        r4 = r0.f;
        if (r4 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x001a;
    L_0x0018:
        r4 = 0;
        goto L_0x001b;
    L_0x001a:
        r4 = 1;
    L_0x001b:
        if (r0 == 0) goto L_0x0024;
    L_0x001d:
        r5 = r0.g;
        if (r5 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0024;
    L_0x0022:
        r5 = 1;
        goto L_0x0025;
    L_0x0024:
        r5 = 0;
    L_0x0025:
        if (r0 == 0) goto L_0x0037;
    L_0x0027:
        r0 = r0.l;
        if (r0 != 0) goto L_0x002d;
    L_0x002b:
        r0 = defpackage.aoqd.c;
    L_0x002d:
        r0 = r0.b;
        r0 = defpackage.aoqc.a(r0);
        if (r0 == 0) goto L_0x0037;
    L_0x0035:
        r15 = r0;
        goto L_0x0038;
    L_0x0037:
        r15 = 1;
    L_0x0038:
        r0 = r6.h;
        if (r0 != 0) goto L_0x0041;
    L_0x003c:
        r0 = r6.a(r4, r5, r15);
        return r0;
    L_0x0041:
        if (r3 == 0) goto L_0x0054;
    L_0x0043:
        r0 = r6.g;
        r0 = r0.b;
        if (r0 != 0) goto L_0x004b;
    L_0x0049:
        r0 = defpackage.aopx.c;
    L_0x004b:
        r0 = r0.b;
        r0 = defpackage.aopw.a(r0);
        if (r0 == 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0055;
    L_0x0054:
        r0 = 1;
    L_0x0055:
        r1 = r0 + -1;
        if (r0 == 0) goto L_0x00c4;
    L_0x0059:
        if (r1 == r2) goto L_0x00bc;
    L_0x005b:
        r0 = 2;
        if (r1 == r0) goto L_0x00a8;
    L_0x005e:
        r0 = 3;
        if (r1 == r0) goto L_0x006e;
    L_0x0061:
        r7 = defpackage.vmn.a;
        r0 = r25;
        r1 = r4;
        r2 = r5;
        r3 = r7;
        r5 = r15;
        r0 = r0.a(r1, r2, r3, r5);
        return r0;
    L_0x006e:
        r0 = new vne;
        r8 = r6.a;
        r9 = r6.b;
        r10 = r6.g;
        r11 = r6.c;
        r12 = r6.d;
        r13 = r6.e;
        r14 = r6.f;
        r1 = r6.h;
        r2 = r10.c;
        r7 = r10.d;
        if (r7 == 0) goto L_0x008d;
    L_0x0086:
        r22 = r4;
        r23 = r5;
        r4 = r10.e;
        goto L_0x0093;
    L_0x008d:
        r22 = r4;
        r23 = r5;
        r4 = -1;
    L_0x0093:
        r18 = r4;
        r4 = r6.i;
        r20 = r4;
        r4 = r6.j;
        r21 = r4;
        r7 = r0;
        r5 = r15;
        r15 = r1;
        r16 = r2;
        r24 = r5;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24);
        return r0;
    L_0x00a8:
        r22 = r4;
        r23 = r5;
        r5 = r15;
        r0 = r6.g;
        r3 = r0.c;
        r0 = r25;
        r1 = r22;
        r2 = r23;
        r0 = r0.a(r1, r2, r3, r5);
        return r0;
    L_0x00bc:
        r2 = r4;
        r1 = r5;
        r5 = r15;
        r0 = r6.a(r2, r1, r5);
        return r0;
    L_0x00c4:
        r0 = 0;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vms.a():vmr");
    }

    private final vmq a(boolean z, boolean z2, int i) {
        return new vmq(this.a, this.b, this.g, this.c, this.d, this.e, z, z2, i);
    }

    private final vnd a(boolean z, boolean z2, long j, int i) {
        return new vnd(this.a, this.b, this.g, this.c, this.d, this.e, this.h, j, this.j, z, z2, i);
    }
}
