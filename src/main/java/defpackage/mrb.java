package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.RemoteDataBus;
import java.util.concurrent.TimeUnit;

/* renamed from: mrb */
public final class mrb implements xcp {
    private static final long a = TimeUnit.SECONDS.toMillis(2);
    private final RemoteDataBus b;
    private long c;
    private ahkn d;
    private ahkr e = new ahkr(4);
    private nhb f;
    private int g = 1;

    mrb(RemoteDataBus remoteDataBus) {
        this.b = remoteDataBus;
    }

    public final void a(int i) {
        a(i, this.c);
    }

    private final void a(int i, long j) {
        aakj aakj = this.d.b;
        String b = aakj != null ? aakj.b() : null;
        nhb nhb = this.f;
        if (nhb == null || !TextUtils.equals(nhb.b, b) || this.f.a != i) {
            long j2;
            ahkn ahkn = this.d;
            if (ahkn != null) {
                aakj aakj2 = ahkn.b;
                if (aakj2 != null) {
                    aajs aajs = aakj2.c;
                    if (aajs != null) {
                        j2 = aajs.d;
                        this.f = new nhb(i, b, j, j2);
                        this.b.a(this.f);
                    }
                }
            }
            j2 = 0;
            this.f = new nhb(i, b, j, j2);
            this.b.a(this.f);
        }
    }

    /* JADX WARNING: Missing block: B:14:0x0031, code skipped:
            if (r1 != 3) goto L_0x0053;
     */
    private final void a() {
        /*
        r6 = this;
        r0 = r6.d;
        if (r0 == 0) goto L_0x005f;
    L_0x0004:
        r0 = r0.a;
        r1 = defpackage.airi.PLAYBACK_PENDING;
        r2 = 0;
        r3 = 1;
        r4 = 2;
        r5 = 3;
        if (r0 == r1) goto L_0x0049;
    L_0x000e:
        r0 = r6.d;
        r1 = r0.a;
        r1 = r1.d();
        if (r1 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x003e;
    L_0x0019:
        r0 = r0.a;
        r0 = r0.a();
        if (r0 != 0) goto L_0x003e;
    L_0x0021:
        r0 = r6.e;
        r0 = r0.a;
        if (r0 != r4) goto L_0x003e;
    L_0x0027:
        r0 = r6.g;
        r1 = r0 + -1;
        if (r0 == 0) goto L_0x003d;
    L_0x002d:
        if (r1 == 0) goto L_0x0034;
    L_0x002f:
        if (r1 == r3) goto L_0x0037;
    L_0x0031:
        if (r1 == r5) goto L_0x0037;
    L_0x0033:
        goto L_0x0053;
    L_0x0034:
        r6.a(r3);
    L_0x0037:
        r6.a(r4);
        r6.g = r5;
        return;
    L_0x003d:
        throw r2;
    L_0x003e:
        r0 = r6.g;
        if (r0 != r5) goto L_0x0053;
    L_0x0042:
        r6.a(r5);
        r0 = 4;
        r6.g = r0;
        goto L_0x0053;
    L_0x0049:
        r0 = r6.g;
        r1 = r0 + -1;
        if (r0 == 0) goto L_0x005e;
    L_0x004f:
        if (r1 == 0) goto L_0x0058;
    L_0x0051:
        if (r1 == r4) goto L_0x0054;
    L_0x0053:
        return;
    L_0x0054:
        r6.a(r5);
        goto L_0x005b;
    L_0x0058:
        r6.a(r3);
    L_0x005b:
        r6.g = r4;
        return;
    L_0x005e:
        throw r2;
    L_0x005f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrb.a():void");
    }

    /* JADX WARNING: Missing block: B:11:0x0022, code skipped:
            if (r12 != 3) goto L_0x0030;
     */
    public final java.lang.Class[] a(java.lang.Class r11, java.lang.Object r12, int r13) {
        /*
        r10 = this;
        r11 = -1;
        r0 = 2;
        r1 = 1;
        r2 = 0;
        r3 = 3;
        if (r13 == r11) goto L_0x0088;
    L_0x0007:
        if (r13 == 0) goto L_0x0080;
    L_0x0009:
        if (r13 == r1) goto L_0x004d;
    L_0x000b:
        if (r13 != r0) goto L_0x0034;
    L_0x000d:
        r12 = (defpackage.ahkr) r12;
        r10.e = r12;
        r11 = r10.e;
        r11 = r11.a;
        r12 = 4;
        if (r11 != r12) goto L_0x0030;
    L_0x0018:
        r11 = r10.g;
        r12 = r11 + -1;
        if (r11 == 0) goto L_0x002f;
    L_0x001e:
        if (r12 == r1) goto L_0x0028;
    L_0x0020:
        if (r12 == r0) goto L_0x0025;
    L_0x0022:
        if (r12 == r3) goto L_0x0028;
    L_0x0024:
        goto L_0x0030;
    L_0x0025:
        r10.a(r3);
    L_0x0028:
        r11 = 5;
        r10.a(r11);
        r10.g = r1;
        goto L_0x0030;
    L_0x002f:
        throw r2;
    L_0x0030:
        r10.a();
        goto L_0x0097;
    L_0x0034:
        r11 = new java.lang.IllegalStateException;
        r12 = new java.lang.StringBuilder;
        r0 = 32;
        r12.<init>(r0);
        r0 = "unsupported op code: ";
        r12.append(r0);
        r12.append(r13);
        r12 = r12.toString();
        r11.<init>(r12);
        throw r11;
    L_0x004d:
        r12 = (defpackage.ahkm) r12;
        r4 = r12.a;
        r6 = 0;
        r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r11 < 0) goto L_0x007b;
    L_0x0057:
        r11 = r12.d;
        r13 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1));
        if (r13 <= 0) goto L_0x005e;
    L_0x005d:
        goto L_0x007b;
    L_0x005e:
        r11 = r10.c;
        r6 = a;
        r8 = r4 - r11;
        r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r13 < 0) goto L_0x006c;
    L_0x0068:
        r13 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x0078;
    L_0x006c:
        r11 = r10.c;
        r13 = r10.g;
        if (r13 != r3) goto L_0x0078;
    L_0x0072:
        r10.a(r3, r11);
        r10.a(r0, r4);
    L_0x0078:
        r10.c = r4;
        goto L_0x0097;
    L_0x007b:
        r11 = -9223372036854775808;
        r10.c = r11;
        goto L_0x0097;
    L_0x0080:
        r12 = (defpackage.ahkn) r12;
        r10.d = r12;
        r10.a();
        goto L_0x0097;
    L_0x0088:
        r2 = new java.lang.Class[r3];
        r11 = 0;
        r12 = defpackage.ahkn.class;
        r2[r11] = r12;
        r11 = defpackage.ahkm.class;
        r2[r1] = r11;
        r11 = defpackage.ahkr.class;
        r2[r0] = r11;
    L_0x0097:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrb.a(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
