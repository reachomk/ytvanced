package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: aeyj */
final class aeyj extends ozz {
    private final aexc f;
    private aewi k = aewi.a;

    aeyj(Context context, pah pah, aexc aexc, Handler handler, aeya aeya) {
        super(context, aeya, aexc.b.m(), true, handler, pah, 10);
        this.f = aexc;
    }

    public final void a(int i, Object obj) {
        if (i == 10001) {
            aewi aewi = (aewi) obj;
            if (aewi == null) {
                aewi = aewi.a;
            }
            this.k = aewi;
            return;
        }
        super.a(i, obj);
    }

    public final void p() {
        super.p();
        this.k.b();
    }

    public final boolean u() {
        if (!super.u()) {
            return false;
        }
        this.k.a();
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(MediaCodec mediaCodec, okq okq, nzw nzw, nzw nzw2) {
        return !this.f.c().W() ? super.a(mediaCodec, okq, nzw, nzw2) : 0;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:10:0x0021, code skipped:
            if (r0 != 0) goto L_0x0023;
     */
    public final boolean a(java.lang.String r4) {
        /*
        r3 = this;
        r0 = r3.f;
        r0 = r0.c;
        r0 = r0.d;
        r0 = r0.b();
        r1 = 1;
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        r0 = 1;
        goto L_0x0023;
    L_0x000f:
        r0 = r0.k;
        if (r0 != 0) goto L_0x0015;
    L_0x0013:
        r0 = defpackage.auuo.k;
    L_0x0015:
        r0 = r0.i;
        if (r0 != 0) goto L_0x001b;
    L_0x0019:
        r0 = defpackage.aorz.j;
    L_0x001b:
        r0 = r0.d;
        r0 = defpackage.aosj.a(r0);
        if (r0 == 0) goto L_0x000d;
    L_0x0023:
        r2 = r0 + -1;
        if (r0 == 0) goto L_0x0035;
    L_0x0027:
        r0 = 2;
        if (r2 == r0) goto L_0x0034;
    L_0x002a:
        r0 = 3;
        if (r2 == r0) goto L_0x0032;
    L_0x002d:
        r4 = super.a(r4);
        return r4;
    L_0x0032:
        r4 = 0;
        return r4;
    L_0x0034:
        return r1;
    L_0x0035:
        r4 = 0;
        goto L_0x0038;
    L_0x0037:
        throw r4;
    L_0x0038:
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyj.a(java.lang.String):boolean");
    }
}
