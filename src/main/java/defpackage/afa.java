package defpackage;

import android.content.IntentFilter;

/* renamed from: afa */
final class afa extends aey {
    private final aft a;
    private final /* synthetic */ aek b;

    afa(aek aek, aft aft) {
        this.b = aek;
        super(aek);
        this.a = aft;
    }

    /* JADX WARNING: Missing block: B:19:0x005a, code skipped:
            if (r1 < 22) goto L_0x00fe;
     */
    /* JADX WARNING: Missing block: B:43:0x00fa, code skipped:
            if (r1 != false) goto L_0x00fc;
     */
    /* JADX WARNING: Missing block: B:46:0x00fe, code skipped:
            return 1;
     */
    public final int a() {
        /*
        r27 = this;
        r0 = r27;
        r1 = r0.a;
        r2 = r1.c;
        r3 = r2.f;
        r5 = java.lang.System.currentTimeMillis();
        r7 = 1;
        r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r8 > 0) goto L_0x00f7;
    L_0x0011:
        r3 = r1.b;
        r4 = "android.permission.ACCESS_COARSE_LOCATION";
        r3 = defpackage.rn.a(r3, r4);
        r4 = 0;
        if (r3 != 0) goto L_0x0023;
    L_0x001c:
        r3 = "network";
        r3 = r1.a(r3);
        goto L_0x0024;
    L_0x0023:
        r3 = r4;
    L_0x0024:
        r5 = r1.b;
        r6 = "android.permission.ACCESS_FINE_LOCATION";
        r5 = defpackage.rn.a(r5, r6);
        if (r5 != 0) goto L_0x0034;
    L_0x002e:
        r4 = "gps";
        r4 = r1.a(r4);
    L_0x0034:
        if (r4 == 0) goto L_0x0045;
    L_0x0036:
        if (r3 == 0) goto L_0x0045;
    L_0x0038:
        r5 = r4.getTime();
        r8 = r3.getTime();
        r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r10 > 0) goto L_0x0048;
    L_0x0044:
        goto L_0x0049;
    L_0x0045:
        if (r4 != 0) goto L_0x0048;
    L_0x0047:
        goto L_0x0049;
    L_0x0048:
        r3 = r4;
    L_0x0049:
        if (r3 != 0) goto L_0x005e;
    L_0x004b:
        r1 = java.util.Calendar.getInstance();
        r2 = 11;
        r1 = r1.get(r2);
        r2 = 6;
        if (r1 < r2) goto L_0x00fc;
    L_0x0058:
        r2 = 22;
        if (r1 < r2) goto L_0x00fe;
    L_0x005c:
        goto L_0x00fc;
    L_0x005e:
        r1 = r1.c;
        r4 = java.lang.System.currentTimeMillis();
        r6 = defpackage.afq.a;
        if (r6 != 0) goto L_0x006f;
    L_0x0068:
        r6 = new afq;
        r6.<init>();
        defpackage.afq.a = r6;
    L_0x006f:
        r6 = defpackage.afq.a;
        r8 = -86400000; // 0xfffffffffad9a400 float:-5.6502737E35 double:NaN;
        r10 = r4 + r8;
        r12 = r3.getLatitude();
        r14 = r3.getLongitude();
        r8 = r6;
        r9 = r10;
        r11 = r12;
        r13 = r14;
        r8.a(r9, r11, r13);
        r13 = r6.b;
        r11 = r3.getLatitude();
        r15 = r3.getLongitude();
        r9 = r4;
        r17 = r13;
        r13 = r15;
        r8.a(r9, r11, r13);
        r8 = r6.d;
        if (r8 != r7) goto L_0x009c;
    L_0x009a:
        r15 = 1;
        goto L_0x009e;
    L_0x009c:
        r8 = 0;
        r15 = 0;
    L_0x009e:
        r13 = r6.c;
        r11 = r6.b;
        r8 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r19 = r4 + r8;
        r21 = r3.getLatitude();
        r23 = r3.getLongitude();
        r8 = r6;
        r9 = r19;
        r25 = r11;
        r11 = r21;
        r16 = r2;
        r2 = r13;
        r13 = r23;
        r8.a(r9, r11, r13);
        r13 = r6.c;
        r8 = -1;
        r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x00c9;
    L_0x00c6:
        r10 = r25;
        goto L_0x00e0;
    L_0x00c9:
        r10 = r25;
        r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r6 == 0) goto L_0x00e0;
    L_0x00cf:
        r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r6 > 0) goto L_0x00db;
    L_0x00d3:
        r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r6 <= 0) goto L_0x00d9;
    L_0x00d7:
        r4 = r10;
        goto L_0x00dc;
    L_0x00d9:
        r4 = r2;
        goto L_0x00dc;
    L_0x00db:
        r4 = r13;
    L_0x00dc:
        r8 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        goto L_0x00e3;
    L_0x00e0:
        r8 = 43200000; // 0x2932e00 float:2.1626111E-37 double:2.1343636E-316;
    L_0x00e3:
        r4 = r4 + r8;
        r1.a = r15;
        r8 = r17;
        r1.b = r8;
        r1.c = r2;
        r1.d = r10;
        r1.e = r13;
        r1.f = r4;
        r1 = r16;
        r1 = r1.a;
        goto L_0x00fa;
    L_0x00f7:
        r1 = r2;
        r1 = r1.a;
    L_0x00fa:
        if (r1 == 0) goto L_0x00fe;
    L_0x00fc:
        r1 = 2;
        return r1;
    L_0x00fe:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afa.a():int");
    }

    public final void b() {
        this.b.q();
    }

    /* Access modifiers changed, original: final */
    public final IntentFilter d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }
}
