package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: okt */
public abstract class okt extends nys {
    private static final byte[] e = ozp.g("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private float A = 1.0f;
    private nzw B;
    private float C = -1.0f;
    private ArrayDeque D;
    private oks E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private ByteBuffer[] P;
    private ByteBuffer[] Q;
    private long R;
    private int S;
    private int T;
    private ByteBuffer U;
    private boolean V;
    private boolean W;
    private int X = 0;
    private int Y = 0;
    private int Z = 0;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private final okv f;
    public MediaCodec g;
    public okq h;
    public boolean i;
    public odk j;
    private final odw k;
    private final boolean l;
    private final float m;
    private final odj n = new odj(0);
    private final odj o = odj.a();
    private final nzy p = new nzy();
    private final ozl q = new ozl();
    private final ArrayList r = new ArrayList();
    private final BufferInfo s = new BufferInfo();
    private nzw t;
    private nzw u;
    private odu v;
    private odu w;
    private MediaCrypto x;
    private boolean y;
    private final long z = -9223372036854775807L;

    public okt(int i, okv okv, odw odw, boolean z, float f) {
        super(i);
        this.f = (okv) oxz.a((Object) okv);
        this.k = odw;
        this.l = z;
        this.m = f;
    }

    /* Access modifiers changed, original: protected */
    public float a(float f, nzw[] nzwArr) {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public int a(MediaCodec mediaCodec, okq okq, nzw nzw, nzw nzw2) {
        throw null;
    }

    public abstract int a(okv okv, odw odw, nzw nzw);

    public abstract List a(okv okv, nzw nzw, boolean z);

    /* Access modifiers changed, original: protected */
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* Access modifiers changed, original: protected */
    public void a(String str, long j, long j2) {
    }

    /* Access modifiers changed, original: protected */
    public void a(odj odj) {
    }

    public abstract void a(okq okq, MediaCodec mediaCodec, nzw nzw, MediaCrypto mediaCrypto, float f);

    public abstract boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, nzw nzw);

    /* Access modifiers changed, original: protected */
    public boolean a(okq okq) {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void c(long j) {
    }

    public final int o() {
        return 8;
    }

    /* Access modifiers changed, original: protected */
    public void w() {
    }

    /* Access modifiers changed, original: protected */
    public boolean y() {
        return false;
    }

    public final int a(nzw nzw) {
        try {
            return a(this.f, this.k, nzw);
        } catch (old e) {
            throw nyy.a(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x033d A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0335 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0335 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x033d A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02f7 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0327 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0326 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02ea A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02e9 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02c8 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02e9 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02ea A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02c8 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02ea A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02e9 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x028d A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02b8 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02c8 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02e9 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02ea A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0253 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x028d A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02b8 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02c8 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02ea A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02e9 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0246 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0245 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0221 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0245 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0246 A:{Catch:{ Exception -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x037c A:{Catch:{ Exception -> 0x0383 }} */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x037c A:{Catch:{ Exception -> 0x0383 }} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03bb A:{Catch:{ old -> 0x03fd, oks -> 0x0409 }} */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03b8 A:{Catch:{ old -> 0x03fd, oks -> 0x0409 }} */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x03e9 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x03e4 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03b8 A:{Catch:{ old -> 0x03fd, oks -> 0x0409 }} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03bb A:{Catch:{ old -> 0x03fd, oks -> 0x0409 }} */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x03e4 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x03e9 A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:30:0x006f, code skipped:
            if ("AFTB".equals(defpackage.ozp.d) == false) goto L_0x0089;
     */
    public final void x() {
        /*
        r27 = this;
        r7 = r27;
        r0 = r7.g;
        if (r0 != 0) goto L_0x040f;
    L_0x0006:
        r0 = r7.t;
        if (r0 == 0) goto L_0x040f;
    L_0x000a:
        r0 = r7.w;
        r7.b(r0);
        r0 = r7.t;
        r0 = r0.i;
        r1 = r7.v;
        r8 = "Amazon";
        r9 = 1;
        r10 = 0;
        if (r1 == 0) goto L_0x0089;
    L_0x001b:
        r2 = r7.x;
        if (r2 != 0) goto L_0x0055;
    L_0x001f:
        r1 = r1.h();
        r1 = (defpackage.oeg) r1;
        if (r1 != 0) goto L_0x0031;
    L_0x0027:
        r0 = r7.v;
        r0 = r0.g();
        if (r0 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0055;
    L_0x0030:
        return;
    L_0x0031:
        r2 = new android.media.MediaCrypto;	 Catch:{ MediaCryptoException -> 0x004f }
        r3 = r1.a;	 Catch:{ MediaCryptoException -> 0x004f }
        r4 = r1.b;	 Catch:{ MediaCryptoException -> 0x004f }
        r2.<init>(r3, r4);	 Catch:{ MediaCryptoException -> 0x004f }
        r7.x = r2;	 Catch:{ MediaCryptoException -> 0x004f }
        r1 = r1.c;
        if (r1 != 0) goto L_0x004b;
    L_0x0040:
        r1 = r7.x;
        r0 = r1.requiresSecureDecoderComponent(r0);
        if (r0 != 0) goto L_0x0049;
    L_0x0048:
        goto L_0x004b;
    L_0x0049:
        r0 = 1;
        goto L_0x004c;
    L_0x004b:
        r0 = 0;
    L_0x004c:
        r7.y = r0;
        goto L_0x0055;
    L_0x004f:
        r0 = move-exception;
        r0 = defpackage.nyy.a(r0);
        throw r0;
    L_0x0055:
        r0 = defpackage.ozp.c;
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x0089;
    L_0x005d:
        r0 = defpackage.ozp.d;
        r1 = "AFTM";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0072;
    L_0x0067:
        r0 = defpackage.ozp.d;
        r1 = "AFTB";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0072;
    L_0x0071:
        goto L_0x0089;
    L_0x0072:
        r0 = r7.v;
        r0 = r0.f();
        if (r0 == r9) goto L_0x007e;
    L_0x007a:
        r1 = 4;
        if (r0 == r1) goto L_0x0089;
    L_0x007d:
        return;
    L_0x007e:
        r0 = r7.v;
        r0 = r0.g();
        r0 = defpackage.nyy.a(r0);
        throw r0;
    L_0x0089:
        r11 = r7.x;	 Catch:{ oks -> 0x0409 }
        r12 = r7.y;	 Catch:{ oks -> 0x0409 }
        r0 = r7.D;	 Catch:{ oks -> 0x0409 }
        r13 = "MediaCodecRenderer";
        r14 = 0;
        if (r0 == 0) goto L_0x0095;
    L_0x0094:
        goto L_0x00fe;
    L_0x0095:
        r0 = r7.f;	 Catch:{ old -> 0x03fd }
        r1 = r7.t;	 Catch:{ old -> 0x03fd }
        r0 = r7.a(r0, r1, r12);	 Catch:{ old -> 0x03fd }
        r1 = r0.isEmpty();	 Catch:{ old -> 0x03fd }
        if (r1 == 0) goto L_0x00eb;
    L_0x00a3:
        if (r12 == 0) goto L_0x00eb;
    L_0x00a5:
        r0 = r7.f;	 Catch:{ old -> 0x03fd }
        r1 = r7.t;	 Catch:{ old -> 0x03fd }
        r0 = r7.a(r0, r1, r10);	 Catch:{ old -> 0x03fd }
        r1 = r0.isEmpty();	 Catch:{ old -> 0x03fd }
        if (r1 != 0) goto L_0x00eb;
    L_0x00b3:
        r1 = r7.t;	 Catch:{ old -> 0x03fd }
        r1 = r1.i;	 Catch:{ old -> 0x03fd }
        r2 = java.lang.String.valueOf(r0);	 Catch:{ old -> 0x03fd }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ old -> 0x03fd }
        r3 = r3.length();	 Catch:{ old -> 0x03fd }
        r3 = r3 + 99;
        r4 = r2.length();	 Catch:{ old -> 0x03fd }
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;	 Catch:{ old -> 0x03fd }
        r4.<init>(r3);	 Catch:{ old -> 0x03fd }
        r3 = "Drm session requires secure decoder for ";
        r4.append(r3);	 Catch:{ old -> 0x03fd }
        r4.append(r1);	 Catch:{ old -> 0x03fd }
        r1 = ", but no secure decoder available. Trying to proceed with ";
        r4.append(r1);	 Catch:{ old -> 0x03fd }
        r4.append(r2);	 Catch:{ old -> 0x03fd }
        r1 = ".";
        r4.append(r1);	 Catch:{ old -> 0x03fd }
        r1 = r4.toString();	 Catch:{ old -> 0x03fd }
        defpackage.oyp.a(r13, r1);	 Catch:{ old -> 0x03fd }
    L_0x00eb:
        r1 = new java.util.ArrayDeque;	 Catch:{ old -> 0x03fd }
        r0 = r0.get(r10);	 Catch:{ old -> 0x03fd }
        r0 = (defpackage.okq) r0;	 Catch:{ old -> 0x03fd }
        r0 = java.util.Collections.singletonList(r0);	 Catch:{ old -> 0x03fd }
        r1.<init>(r0);	 Catch:{ old -> 0x03fd }
        r7.D = r1;	 Catch:{ old -> 0x03fd }
        r7.E = r14;	 Catch:{ old -> 0x03fd }
    L_0x00fe:
        r0 = r7.D;	 Catch:{ oks -> 0x0409 }
        r0 = r0.isEmpty();	 Catch:{ oks -> 0x0409 }
        if (r0 != 0) goto L_0x03f1;
    L_0x0106:
        r0 = r7.g;	 Catch:{ oks -> 0x0409 }
        if (r0 != 0) goto L_0x03ed;
    L_0x010a:
        r0 = r7.D;	 Catch:{ oks -> 0x0409 }
        r0 = r0.peekFirst();	 Catch:{ oks -> 0x0409 }
        r15 = r0;
        r15 = (defpackage.okq) r15;	 Catch:{ oks -> 0x0409 }
        r0 = r7.a(r15);	 Catch:{ oks -> 0x0409 }
        if (r0 == 0) goto L_0x03ec;
    L_0x0119:
        r0 = r15.a;	 Catch:{ Exception -> 0x0385 }
        r1 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        r2 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r6 = 23;
        if (r1 < r6) goto L_0x012c;
    L_0x0123:
        r1 = r7.A;	 Catch:{ Exception -> 0x0385 }
        r3 = r7.d;	 Catch:{ Exception -> 0x0385 }
        r1 = r7.a(r1, r3);	 Catch:{ Exception -> 0x0385 }
        goto L_0x012e;
    L_0x012c:
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x012e:
        r3 = r7.m;	 Catch:{ Exception -> 0x0385 }
        r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x0136;
    L_0x0134:
        r5 = r1;
        goto L_0x0138;
    L_0x0136:
        r5 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x0138:
        r16 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x0376 }
        r1 = "createCodec:";
        r2 = java.lang.String.valueOf(r0);	 Catch:{ Exception -> 0x0376 }
        r3 = r2.length();	 Catch:{ Exception -> 0x0376 }
        if (r3 != 0) goto L_0x014e;
    L_0x0148:
        r2 = new java.lang.String;	 Catch:{ Exception -> 0x0376 }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0376 }
        goto L_0x0151;
    L_0x014e:
        r1.concat(r2);	 Catch:{ Exception -> 0x0376 }
    L_0x0151:
        r4 = android.media.MediaCodec.createByCodecName(r0);	 Catch:{ Exception -> 0x0376 }
        defpackage.ozn.a();	 Catch:{ Exception -> 0x0371 }
        r3 = r7.t;	 Catch:{ Exception -> 0x0371 }
        r1 = r27;
        r2 = r15;
        r18 = r3;
        r3 = r4;
        r19 = r4;
        r4 = r18;
        r18 = r5;
        r5 = r11;
        r14 = 23;
        r6 = r18;
        r1.a(r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x036d }
        defpackage.ozn.a();	 Catch:{ Exception -> 0x036d }
        r19.start();	 Catch:{ Exception -> 0x036d }
        defpackage.ozn.a();	 Catch:{ Exception -> 0x036d }
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x036d }
        r1 = defpackage.ozp.a;	 Catch:{ Exception -> 0x036d }
        r2 = 21;
        if (r1 >= r2) goto L_0x018d;
    L_0x0181:
        r1 = r19.getInputBuffers();	 Catch:{ Exception -> 0x036d }
        r7.P = r1;	 Catch:{ Exception -> 0x036d }
        r1 = r19.getOutputBuffers();	 Catch:{ Exception -> 0x036d }
        r7.Q = r1;	 Catch:{ Exception -> 0x036d }
    L_0x018d:
        r1 = r19;
        r7.g = r1;	 Catch:{ Exception -> 0x0385 }
        r7.h = r15;	 Catch:{ Exception -> 0x0385 }
        r1 = r18;
        r7.C = r1;	 Catch:{ Exception -> 0x0385 }
        r1 = r7.t;	 Catch:{ Exception -> 0x0385 }
        r7.B = r1;	 Catch:{ Exception -> 0x0385 }
        r1 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        r5 = 25;
        r6 = "OMX.Exynos.avc.dec.secure";
        if (r1 > r5) goto L_0x01d4;
    L_0x01a3:
        r1 = r6.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x01d4;
    L_0x01a9:
        r1 = defpackage.ozp.d;	 Catch:{ Exception -> 0x0385 }
        r5 = "SM-T585";
        r1 = r1.startsWith(r5);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x01d2;
    L_0x01b3:
        r1 = defpackage.ozp.d;	 Catch:{ Exception -> 0x0385 }
        r5 = "SM-A510";
        r1 = r1.startsWith(r5);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x01d2;
    L_0x01bd:
        r1 = defpackage.ozp.d;	 Catch:{ Exception -> 0x0385 }
        r5 = "SM-A520";
        r1 = r1.startsWith(r5);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x01d2;
    L_0x01c7:
        r1 = defpackage.ozp.d;	 Catch:{ Exception -> 0x0385 }
        r5 = "SM-J700";
        r1 = r1.startsWith(r5);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x01d2;
    L_0x01d1:
        goto L_0x01d4;
    L_0x01d2:
        r1 = 2;
        goto L_0x0215;
    L_0x01d4:
        r1 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        r5 = 24;
        if (r1 >= r5) goto L_0x0214;
    L_0x01da:
        r1 = "OMX.Nvidia.h264.decode";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x01ea;
    L_0x01e2:
        r1 = "OMX.Nvidia.h264.decode.secure";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x0214;
    L_0x01ea:
        r1 = "flounder";
        r5 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0385 }
        r1 = r1.equals(r5);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x0212;
    L_0x01f4:
        r1 = "flounder_lte";
        r5 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0385 }
        r1 = r1.equals(r5);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x0212;
    L_0x01fe:
        r1 = "grouper";
        r5 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0385 }
        r1 = r1.equals(r5);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x0212;
    L_0x0208:
        r1 = "tilapia";
        r5 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0385 }
        r1 = r1.equals(r5);	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x0214;
    L_0x0212:
        r1 = 1;
        goto L_0x0215;
    L_0x0214:
        r1 = 0;
    L_0x0215:
        r7.F = r1;	 Catch:{ Exception -> 0x0385 }
        r1 = defpackage.ozp.d;	 Catch:{ Exception -> 0x0385 }
        r5 = "SM-T230";
        r1 = r1.startsWith(r5);	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x022c;
    L_0x0221:
        r1 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x022a;
    L_0x0229:
        goto L_0x022c;
    L_0x022a:
        r1 = 1;
        goto L_0x022d;
    L_0x022c:
        r1 = 0;
    L_0x022d:
        r7.G = r1;	 Catch:{ Exception -> 0x0385 }
        r1 = r7.B;	 Catch:{ Exception -> 0x0385 }
        r5 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        if (r5 >= r2) goto L_0x0248;
    L_0x0235:
        r1 = r1.k;	 Catch:{ Exception -> 0x0385 }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x0248;
    L_0x023d:
        r1 = "OMX.MTK.VIDEO.DECODER.AVC";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x0246;
    L_0x0245:
        goto L_0x0248;
    L_0x0246:
        r1 = 1;
        goto L_0x0249;
    L_0x0248:
        r1 = 0;
    L_0x0249:
        r7.H = r1;	 Catch:{ Exception -> 0x0385 }
        r1 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        r5 = 19;
        r10 = 18;
        if (r1 < r10) goto L_0x0286;
    L_0x0253:
        r1 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        if (r1 != r10) goto L_0x0267;
    L_0x0257:
        r1 = "OMX.SEC.avc.dec";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x0287;
    L_0x025f:
        r1 = "OMX.SEC.avc.dec.secure";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x0287;
    L_0x0267:
        r1 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        if (r1 != r5) goto L_0x0284;
    L_0x026b:
        r1 = defpackage.ozp.d;	 Catch:{ Exception -> 0x0385 }
        r9 = "SM-G800";
        r1 = r1.startsWith(r9);	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x0284;
    L_0x0275:
        r1 = "OMX.Exynos.avc.dec";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x0286;
    L_0x027d:
        r1 = r6.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x0284;
    L_0x0283:
        goto L_0x0286;
    L_0x0284:
        r9 = 0;
        goto L_0x0287;
    L_0x0286:
        r9 = 1;
    L_0x0287:
        r7.I = r9;	 Catch:{ Exception -> 0x0385 }
        r1 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        if (r1 > r14) goto L_0x0298;
    L_0x028d:
        r1 = "OMX.google.vorbis.decoder";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x0296;
    L_0x0295:
        goto L_0x0298;
    L_0x0296:
        r1 = 1;
        goto L_0x02c2;
    L_0x0298:
        r1 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        if (r1 > r5) goto L_0x02c1;
    L_0x029c:
        r1 = "hb2000";
        r5 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0385 }
        r1 = r1.equals(r5);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x02b0;
    L_0x02a6:
        r1 = "stvm8";
        r5 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0385 }
        r1 = r1.equals(r5);	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x02c1;
    L_0x02b0:
        r1 = "OMX.amlogic.avc.decoder.awesome";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x0296;
    L_0x02b8:
        r1 = "OMX.amlogic.avc.decoder.awesome.secure";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x02c1;
    L_0x02c0:
        goto L_0x0296;
    L_0x02c1:
        r1 = 0;
    L_0x02c2:
        r7.J = r1;	 Catch:{ Exception -> 0x0385 }
        r1 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        if (r1 != r2) goto L_0x02d3;
    L_0x02c8:
        r1 = "OMX.google.aac.decoder";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x02d1;
    L_0x02d0:
        goto L_0x02d3;
    L_0x02d1:
        r1 = 1;
        goto L_0x02d4;
    L_0x02d3:
        r1 = 0;
    L_0x02d4:
        r7.K = r1;	 Catch:{ Exception -> 0x0385 }
        r1 = r7.B;	 Catch:{ Exception -> 0x0385 }
        r2 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        if (r2 > r10) goto L_0x02ec;
    L_0x02dc:
        r1 = r1.v;	 Catch:{ Exception -> 0x0385 }
        r2 = 1;
        if (r1 != r2) goto L_0x02ec;
    L_0x02e1:
        r1 = "OMX.MTK.AUDIO.DECODER.MP3";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x02ea;
    L_0x02e9:
        goto L_0x02ec;
    L_0x02ea:
        r1 = 1;
        goto L_0x02ed;
    L_0x02ec:
        r1 = 0;
    L_0x02ed:
        r7.L = r1;	 Catch:{ Exception -> 0x0385 }
        r1 = r15.a;	 Catch:{ Exception -> 0x0385 }
        r2 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0385 }
        r5 = 17;
        if (r2 > r5) goto L_0x030a;
    L_0x02f7:
        r2 = "OMX.rk.video_decoder.avc";
        r2 = r2.equals(r1);	 Catch:{ Exception -> 0x0385 }
        if (r2 != 0) goto L_0x0308;
    L_0x02ff:
        r2 = "OMX.allwinner.video.decoder.avc";
        r1 = r2.equals(r1);	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x0308;
    L_0x0307:
        goto L_0x030a;
    L_0x0308:
        r1 = 1;
        goto L_0x0328;
    L_0x030a:
        r1 = defpackage.ozp.c;	 Catch:{ Exception -> 0x0385 }
        r1 = r8.equals(r1);	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x0320;
    L_0x0312:
        r1 = "AFTS";
        r2 = defpackage.ozp.d;	 Catch:{ Exception -> 0x0385 }
        r1 = r1.equals(r2);	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x0320;
    L_0x031c:
        r1 = r15.d;	 Catch:{ Exception -> 0x0385 }
        if (r1 != 0) goto L_0x0308;
    L_0x0320:
        r1 = r27.y();	 Catch:{ Exception -> 0x0385 }
        if (r1 == 0) goto L_0x0327;
    L_0x0326:
        goto L_0x0308;
    L_0x0327:
        r1 = 0;
    L_0x0328:
        r7.O = r1;	 Catch:{ Exception -> 0x0385 }
        r27.E();	 Catch:{ Exception -> 0x0385 }
        r27.F();	 Catch:{ Exception -> 0x0385 }
        r1 = r7.c;	 Catch:{ Exception -> 0x0385 }
        r2 = 2;
        if (r1 != r2) goto L_0x033d;
    L_0x0335:
        r1 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x0385 }
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = r1 + r5;
        goto L_0x0342;
    L_0x033d:
        r1 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
    L_0x0342:
        r7.R = r1;	 Catch:{ Exception -> 0x0385 }
        r9 = 0;
        r7.W = r9;	 Catch:{ Exception -> 0x036b }
        r7.X = r9;	 Catch:{ Exception -> 0x036b }
        r7.ab = r9;	 Catch:{ Exception -> 0x036b }
        r7.aa = r9;	 Catch:{ Exception -> 0x036b }
        r7.Y = r9;	 Catch:{ Exception -> 0x036b }
        r7.Z = r9;	 Catch:{ Exception -> 0x036b }
        r7.M = r9;	 Catch:{ Exception -> 0x036b }
        r7.N = r9;	 Catch:{ Exception -> 0x036b }
        r7.V = r9;	 Catch:{ Exception -> 0x036b }
        r10 = 1;
        r7.ae = r10;	 Catch:{ Exception -> 0x0383 }
        r1 = r7.j;	 Catch:{ Exception -> 0x0383 }
        r2 = r1.a;	 Catch:{ Exception -> 0x0383 }
        r2 = r2 + r10;
        r1.a = r2;	 Catch:{ Exception -> 0x0383 }
        r5 = r3 - r16;
        r1 = r27;
        r2 = r0;
        r1.a(r2, r3, r5);	 Catch:{ Exception -> 0x0383 }
        goto L_0x03e4;
    L_0x036b:
        r0 = move-exception;
        goto L_0x0387;
    L_0x036d:
        r0 = move-exception;
        r1 = r19;
        goto L_0x0373;
    L_0x0371:
        r0 = move-exception;
        r1 = r4;
    L_0x0373:
        r9 = 0;
        r10 = 1;
        goto L_0x037a;
    L_0x0376:
        r0 = move-exception;
        r9 = 0;
        r10 = 1;
        r1 = 0;
    L_0x037a:
        if (r1 == 0) goto L_0x0382;
    L_0x037c:
        r27.C();	 Catch:{ Exception -> 0x0383 }
        r1.release();	 Catch:{ Exception -> 0x0383 }
    L_0x0382:
        throw r0;	 Catch:{ Exception -> 0x0383 }
    L_0x0383:
        r0 = move-exception;
        goto L_0x0388;
    L_0x0385:
        r0 = move-exception;
        r9 = 0;
    L_0x0387:
        r10 = 1;
    L_0x0388:
        r1 = java.lang.String.valueOf(r15);	 Catch:{ oks -> 0x0409 }
        r2 = r1.length();	 Catch:{ oks -> 0x0409 }
        r2 = r2 + 30;
        r3 = new java.lang.StringBuilder;	 Catch:{ oks -> 0x0409 }
        r3.<init>(r2);	 Catch:{ oks -> 0x0409 }
        r2 = "Failed to initialize decoder: ";
        r3.append(r2);	 Catch:{ oks -> 0x0409 }
        r3.append(r1);	 Catch:{ oks -> 0x0409 }
        r1 = r3.toString();	 Catch:{ oks -> 0x0409 }
        defpackage.oyp.a(r13, r1, r0);	 Catch:{ oks -> 0x0409 }
        r1 = r7.D;	 Catch:{ oks -> 0x0409 }
        r1.removeFirst();	 Catch:{ oks -> 0x0409 }
        r1 = new oks;	 Catch:{ oks -> 0x0409 }
        r2 = r7.t;	 Catch:{ oks -> 0x0409 }
        r3 = r15.a;	 Catch:{ oks -> 0x0409 }
        r1.<init>(r2, r0, r12, r3);	 Catch:{ oks -> 0x0409 }
        r0 = r7.E;	 Catch:{ oks -> 0x0409 }
        if (r0 != 0) goto L_0x03bb;
    L_0x03b8:
        r7.E = r1;	 Catch:{ oks -> 0x0409 }
        goto L_0x03dc;
    L_0x03bb:
        r1 = new oks;	 Catch:{ oks -> 0x0409 }
        r21 = r0.getMessage();	 Catch:{ oks -> 0x0409 }
        r22 = r0.getCause();	 Catch:{ oks -> 0x0409 }
        r2 = r0.a;	 Catch:{ oks -> 0x0409 }
        r3 = r0.b;	 Catch:{ oks -> 0x0409 }
        r4 = r0.c;	 Catch:{ oks -> 0x0409 }
        r0 = r0.d;	 Catch:{ oks -> 0x0409 }
        r20 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r26 = r0;
        r20.<init>(r21, r22, r23, r24, r25, r26);	 Catch:{ oks -> 0x0409 }
        r7.E = r1;	 Catch:{ oks -> 0x0409 }
    L_0x03dc:
        r0 = r7.D;	 Catch:{ oks -> 0x0409 }
        r0 = r0.isEmpty();	 Catch:{ oks -> 0x0409 }
        if (r0 != 0) goto L_0x03e9;
    L_0x03e4:
        r9 = 1;
        r10 = 0;
        r14 = 0;
        goto L_0x0106;
    L_0x03e9:
        r0 = r7.E;	 Catch:{ oks -> 0x0409 }
        throw r0;	 Catch:{ oks -> 0x0409 }
    L_0x03ec:
        return;
    L_0x03ed:
        r1 = r14;
        r7.D = r1;	 Catch:{ oks -> 0x0409 }
        return;
    L_0x03f1:
        r0 = new oks;	 Catch:{ oks -> 0x0409 }
        r1 = r7.t;	 Catch:{ oks -> 0x0409 }
        r2 = -49999; // 0xffffffffffff3cb1 float:NaN double:NaN;
        r3 = 0;
        r0.<init>(r1, r3, r12, r2);	 Catch:{ oks -> 0x0409 }
        throw r0;	 Catch:{ oks -> 0x0409 }
    L_0x03fd:
        r0 = move-exception;
        r1 = new oks;	 Catch:{ oks -> 0x0409 }
        r2 = r7.t;	 Catch:{ oks -> 0x0409 }
        r3 = -49998; // 0xffffffffffff3cb2 float:NaN double:NaN;
        r1.<init>(r2, r0, r12, r3);	 Catch:{ oks -> 0x0409 }
        throw r1;	 Catch:{ oks -> 0x0409 }
    L_0x0409:
        r0 = move-exception;
        r0 = defpackage.nyy.a(r0);
        throw r0;
    L_0x040f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okt.x():void");
    }

    /* Access modifiers changed, original: protected|final */
    public final nzw d(long j) {
        nzw nzw = (nzw) this.q.a(j);
        if (nzw != null) {
            this.u = nzw;
        }
        return nzw;
    }

    /* Access modifiers changed, original: protected */
    public void a(boolean z) {
        this.j = new odk();
    }

    /* Access modifiers changed, original: protected */
    public void a(long j, boolean z) {
        this.ac = false;
        this.i = false;
        A();
        this.q.a();
    }

    public final void a(float f) {
        this.A = f;
        if (this.g != null && this.Z != 3 && this.c != 0) {
            H();
        }
    }

    /* Access modifiers changed, original: protected */
    public void r() {
        this.t = null;
        if (this.w == null && this.v == null) {
            B();
        } else {
            s();
        }
    }

    /* Access modifiers changed, original: protected */
    public void s() {
        try {
            z();
        } finally {
            a(null);
        }
    }

    /* Access modifiers changed, original: protected */
    public void z() {
        this.D = null;
        this.h = null;
        this.B = null;
        E();
        F();
        C();
        this.ad = false;
        this.R = -9223372036854775807L;
        this.r.clear();
        try {
            MediaCodec mediaCodec = this.g;
            if (mediaCodec != null) {
                odk odk = this.j;
                odk.b++;
                mediaCodec.stop();
                this.g.release();
            }
            this.g = null;
            try {
                MediaCrypto mediaCrypto = this.x;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                this.x = null;
                this.y = false;
                b(null);
            } catch (Throwable th) {
                this.x = null;
                this.y = false;
                b(null);
            }
        } catch (Throwable th2) {
            this.g = null;
            try {
                MediaCrypto mediaCrypto2 = this.x;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                this.x = null;
                this.y = false;
                b(null);
            } catch (Throwable th3) {
                this.x = null;
                this.y = false;
                b(null);
            }
        }
    }

    public final void a(long j, long j2) {
        if (this.i) {
            w();
        } else if (this.t != null || b(true)) {
            x();
            if (this.g != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                while (true) {
                    int dequeueOutputBuffer;
                    boolean z;
                    if (!D()) {
                        if (this.K && this.ab) {
                            try {
                                dequeueOutputBuffer = this.g.dequeueOutputBuffer(this.s, 0);
                            } catch (IllegalStateException unused) {
                                K();
                                if (this.i) {
                                    z();
                                }
                            }
                        } else {
                            dequeueOutputBuffer = this.g.dequeueOutputBuffer(this.s, 0);
                        }
                        if (dequeueOutputBuffer >= 0) {
                            if (!this.N) {
                                if (this.s.size == 0 && (this.s.flags & 4) != 0) {
                                    K();
                                    break;
                                }
                                ByteBuffer outputBuffer;
                                this.T = dequeueOutputBuffer;
                                if (ozp.a >= 21) {
                                    outputBuffer = this.g.getOutputBuffer(dequeueOutputBuffer);
                                } else {
                                    outputBuffer = this.Q[dequeueOutputBuffer];
                                }
                                this.U = outputBuffer;
                                outputBuffer = this.U;
                                if (outputBuffer != null) {
                                    outputBuffer.position(this.s.offset);
                                    this.U.limit(this.s.offset + this.s.size);
                                }
                                long j3 = this.s.presentationTimeUs;
                                int size = this.r.size();
                                for (int i = 0; i < size; i++) {
                                    if (((Long) this.r.get(i)).longValue() == j3) {
                                        this.r.remove(i);
                                        z = true;
                                        break;
                                    }
                                }
                                z = false;
                                this.V = z;
                                d(this.s.presentationTimeUs);
                            } else {
                                this.N = false;
                                this.g.releaseOutputBuffer(dequeueOutputBuffer, false);
                            }
                        } else if (dequeueOutputBuffer == -2) {
                            MediaFormat outputFormat = this.g.getOutputFormat();
                            if (this.F != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                                this.N = true;
                            } else {
                                if (this.L) {
                                    outputFormat.setInteger("channel-count", 1);
                                }
                                a(this.g, outputFormat);
                            }
                        } else if (dequeueOutputBuffer == -3) {
                            if (ozp.a < 21) {
                                this.Q = this.g.getOutputBuffers();
                            }
                        } else if (this.O && (this.ac || this.Y == 2)) {
                            K();
                        }
                    }
                    if (this.K && this.ab) {
                        try {
                            z = a(j, j2, this.g, this.U, this.T, this.s.flags, this.s.presentationTimeUs, this.V, this.u);
                        } catch (IllegalStateException unused2) {
                            K();
                            if (this.i) {
                                z();
                            }
                        }
                    } else {
                        z = a(j, j2, this.g, this.U, this.T, this.s.flags, this.s.presentationTimeUs, this.V, this.u);
                    }
                    if (!z) {
                        break;
                    }
                    c(this.s.presentationTimeUs);
                    dequeueOutputBuffer = this.s.flags;
                    F();
                    if ((dequeueOutputBuffer & 4) != 0) {
                        K();
                        break;
                    }
                }
                while (G()) {
                    if (this.z != -9223372036854775807L) {
                        if (SystemClock.elapsedRealtime() - elapsedRealtime >= this.z) {
                            break;
                        }
                    }
                }
                ozn.a();
            } else {
                odk odk = this.j;
                odk.d += b(j);
                b(false);
            }
            this.j.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean A() {
        boolean B = B();
        if (B) {
            x();
        }
        return B;
    }

    /* Access modifiers changed, original: protected */
    public boolean B() {
        MediaCodec mediaCodec = this.g;
        if (mediaCodec == null) {
            return false;
        }
        if (this.Z == 3 || this.I || (this.J && this.ab)) {
            z();
            return true;
        }
        mediaCodec.flush();
        E();
        F();
        this.R = -9223372036854775807L;
        this.ab = false;
        this.aa = false;
        this.ae = true;
        this.M = false;
        this.N = false;
        this.V = false;
        this.ad = false;
        this.r.clear();
        this.Y = 0;
        this.Z = 0;
        this.X = this.W;
        return false;
    }

    private final boolean b(boolean z) {
        this.o.clear();
        int a = a(this.p, this.o, z);
        if (a != -5) {
            if (a == -4 && this.o.isEndOfStream()) {
                this.ac = true;
                K();
            }
            return false;
        }
        a(this.p);
        return true;
    }

    private final void C() {
        if (ozp.a < 21) {
            this.P = null;
            this.Q = null;
        }
    }

    private final boolean D() {
        return this.T >= 0;
    }

    private final void E() {
        this.S = -1;
        this.n.b = null;
    }

    private final void F() {
        this.T = -1;
        this.U = null;
    }

    private final void a(odu odu) {
        odu odu2 = this.w;
        this.w = odu;
        c(odu2);
    }

    private final void b(odu odu) {
        odu odu2 = this.v;
        this.v = odu;
        c(odu2);
    }

    private final void c(odu odu) {
        if (odu != null && odu != this.w && odu != this.v) {
            this.k.a(odu);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d3 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0143  */
    private final boolean G() {
        /*
        r13 = this;
        r0 = r13.g;
        r1 = 0;
        if (r0 == 0) goto L_0x01df;
    L_0x0005:
        r2 = r13.Y;
        r3 = 2;
        if (r2 == r3) goto L_0x01df;
    L_0x000a:
        r2 = r13.ac;
        if (r2 != 0) goto L_0x01df;
    L_0x000e:
        r2 = r13.S;
        if (r2 >= 0) goto L_0x0038;
    L_0x0012:
        r4 = 0;
        r0 = r0.dequeueInputBuffer(r4);
        r13.S = r0;
        if (r0 < 0) goto L_0x0037;
    L_0x001c:
        r2 = r13.n;
        r4 = defpackage.ozp.a;
        r5 = 21;
        if (r4 < r5) goto L_0x002b;
    L_0x0024:
        r4 = r13.g;
        r0 = r4.getInputBuffer(r0);
        goto L_0x002f;
    L_0x002b:
        r4 = r13.P;
        r0 = r4[r0];
    L_0x002f:
        r2.b = r0;
        r0 = r13.n;
        r0.clear();
        goto L_0x0038;
    L_0x0037:
        return r1;
    L_0x0038:
        r0 = r13.Y;
        r2 = 1;
        if (r0 != r2) goto L_0x0055;
    L_0x003d:
        r0 = r13.O;
        if (r0 != 0) goto L_0x0052;
    L_0x0041:
        r13.ab = r2;
        r4 = r13.g;
        r5 = r13.S;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r10 = 4;
        r4.queueInputBuffer(r5, r6, r7, r8, r10);
        r13.E();
    L_0x0052:
        r13.Y = r3;
        return r1;
    L_0x0055:
        r0 = r13.M;
        if (r0 == 0) goto L_0x0078;
    L_0x0059:
        r13.M = r1;
        r0 = r13.n;
        r0 = r0.b;
        r1 = e;
        r0.put(r1);
        r3 = r13.g;
        r4 = r13.S;
        r5 = 0;
        r0 = e;
        r6 = r0.length;
        r7 = 0;
        r9 = 0;
        r3.queueInputBuffer(r4, r5, r6, r7, r9);
        r13.E();
        r13.aa = r2;
        return r2;
    L_0x0078:
        r0 = r13.ad;
        if (r0 == 0) goto L_0x007f;
    L_0x007c:
        r0 = -4;
        r4 = 0;
        goto L_0x00b8;
    L_0x007f:
        r0 = r13.X;
        if (r0 == r2) goto L_0x0084;
    L_0x0083:
        goto L_0x00a5;
    L_0x0084:
        r0 = 0;
    L_0x0085:
        r4 = r13.B;
        r4 = r4.k;
        r4 = r4.size();
        if (r0 >= r4) goto L_0x00a3;
    L_0x008f:
        r4 = r13.B;
        r4 = r4.k;
        r4 = r4.get(r0);
        r4 = (byte[]) r4;
        r5 = r13.n;
        r5 = r5.b;
        r5.put(r4);
        r0 = r0 + 1;
        goto L_0x0085;
    L_0x00a3:
        r13.X = r3;
    L_0x00a5:
        r0 = r13.n;
        r0 = r0.b;
        r0 = r0.position();
        r4 = r13.p;
        r5 = r13.n;
        r4 = r13.a(r4, r5, r1);
        r12 = r4;
        r4 = r0;
        r0 = r12;
    L_0x00b8:
        r5 = -3;
        if (r0 == r5) goto L_0x01df;
    L_0x00bb:
        r5 = -5;
        if (r0 != r5) goto L_0x00cf;
    L_0x00be:
        r0 = r13.X;
        if (r0 != r3) goto L_0x00c9;
    L_0x00c2:
        r0 = r13.n;
        r0.clear();
        r13.X = r2;
    L_0x00c9:
        r0 = r13.p;
        r13.a(r0);
        return r2;
    L_0x00cf:
        r0 = r13.n;
        r0 = r0.isEndOfStream();
        if (r0 == 0) goto L_0x0108;
    L_0x00d7:
        r0 = r13.X;
        if (r0 != r3) goto L_0x00e2;
    L_0x00db:
        r0 = r13.n;
        r0.clear();
        r13.X = r2;
    L_0x00e2:
        r13.ac = r2;
        r0 = r13.aa;
        if (r0 != 0) goto L_0x00ec;
    L_0x00e8:
        r13.K();
        return r1;
    L_0x00ec:
        r0 = r13.O;	 Catch:{ CryptoException -> 0x0102 }
        if (r0 != 0) goto L_0x0101;
    L_0x00f0:
        r13.ab = r2;	 Catch:{ CryptoException -> 0x0102 }
        r3 = r13.g;	 Catch:{ CryptoException -> 0x0102 }
        r4 = r13.S;	 Catch:{ CryptoException -> 0x0102 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r9 = 4;
        r3.queueInputBuffer(r4, r5, r6, r7, r9);	 Catch:{ CryptoException -> 0x0102 }
        r13.E();	 Catch:{ CryptoException -> 0x0102 }
    L_0x0101:
        return r1;
    L_0x0102:
        r0 = move-exception;
        r0 = defpackage.nyy.a(r0);
        throw r0;
    L_0x0108:
        r0 = r13.ae;
        if (r0 == 0) goto L_0x0120;
    L_0x010c:
        r0 = r13.n;
        r0 = r0.isKeyFrame();
        if (r0 != 0) goto L_0x0120;
    L_0x0114:
        r0 = r13.n;
        r0.clear();
        r0 = r13.X;
        if (r0 != r3) goto L_0x011f;
    L_0x011d:
        r13.X = r2;
    L_0x011f:
        return r2;
    L_0x0120:
        r13.ae = r1;
        r0 = r13.n;
        r0 = r0.c();
        r3 = r13.v;
        if (r3 != 0) goto L_0x012e;
    L_0x012c:
        r3 = 0;
        goto L_0x013f;
    L_0x012e:
        if (r0 != 0) goto L_0x0135;
    L_0x0130:
        r5 = r13.l;
        if (r5 == 0) goto L_0x0135;
    L_0x0134:
        goto L_0x012c;
    L_0x0135:
        r3 = r3.f();
        if (r3 == r2) goto L_0x01d4;
    L_0x013b:
        r5 = 4;
        if (r3 == r5) goto L_0x012c;
    L_0x013e:
        r3 = 1;
    L_0x013f:
        r13.ad = r3;
        if (r3 != 0) goto L_0x01d3;
    L_0x0143:
        r3 = r13.H;
        if (r3 != 0) goto L_0x0148;
    L_0x0147:
        goto L_0x015f;
    L_0x0148:
        if (r0 != 0) goto L_0x015f;
    L_0x014a:
        r3 = r13.n;
        r3 = r3.b;
        defpackage.oyw.a(r3);
        r3 = r13.n;
        r3 = r3.b;
        r3 = r3.position();
        if (r3 == 0) goto L_0x015e;
    L_0x015b:
        r13.H = r1;
        goto L_0x015f;
    L_0x015e:
        return r2;
    L_0x015f:
        r3 = r13.n;	 Catch:{ CryptoException -> 0x01cd }
        r9 = r3.c;	 Catch:{ CryptoException -> 0x01cd }
        r3 = r3.isDecodeOnly();	 Catch:{ CryptoException -> 0x01cd }
        if (r3 == 0) goto L_0x0172;
    L_0x0169:
        r3 = r13.r;	 Catch:{ CryptoException -> 0x01cd }
        r5 = java.lang.Long.valueOf(r9);	 Catch:{ CryptoException -> 0x01cd }
        r3.add(r5);	 Catch:{ CryptoException -> 0x01cd }
    L_0x0172:
        r3 = r13.af;	 Catch:{ CryptoException -> 0x01cd }
        if (r3 == 0) goto L_0x017f;
    L_0x0176:
        r3 = r13.q;	 Catch:{ CryptoException -> 0x01cd }
        r5 = r13.t;	 Catch:{ CryptoException -> 0x01cd }
        r3.a(r9, r5);	 Catch:{ CryptoException -> 0x01cd }
        r13.af = r1;	 Catch:{ CryptoException -> 0x01cd }
    L_0x017f:
        r3 = r13.n;	 Catch:{ CryptoException -> 0x01cd }
        r3.d();	 Catch:{ CryptoException -> 0x01cd }
        r3 = r13.n;	 Catch:{ CryptoException -> 0x01cd }
        r13.a(r3);	 Catch:{ CryptoException -> 0x01cd }
        if (r0 == 0) goto L_0x01ad;
    L_0x018b:
        r0 = r13.n;	 Catch:{ CryptoException -> 0x01cd }
        r0 = r0.a;	 Catch:{ CryptoException -> 0x01cd }
        r8 = r0.g;	 Catch:{ CryptoException -> 0x01cd }
        if (r4 != 0) goto L_0x0194;
    L_0x0193:
        goto L_0x01a3;
    L_0x0194:
        r0 = r8.numBytesOfClearData;	 Catch:{ CryptoException -> 0x01cd }
        if (r0 != 0) goto L_0x019c;
    L_0x0198:
        r0 = new int[r2];	 Catch:{ CryptoException -> 0x01cd }
        r8.numBytesOfClearData = r0;	 Catch:{ CryptoException -> 0x01cd }
    L_0x019c:
        r0 = r8.numBytesOfClearData;	 Catch:{ CryptoException -> 0x01cd }
        r3 = r0[r1];	 Catch:{ CryptoException -> 0x01cd }
        r3 = r3 + r4;
        r0[r1] = r3;	 Catch:{ CryptoException -> 0x01cd }
    L_0x01a3:
        r5 = r13.g;	 Catch:{ CryptoException -> 0x01cd }
        r6 = r13.S;	 Catch:{ CryptoException -> 0x01cd }
        r7 = 0;
        r11 = 0;
        r5.queueSecureInputBuffer(r6, r7, r8, r9, r11);	 Catch:{ CryptoException -> 0x01cd }
        goto L_0x01be;
    L_0x01ad:
        r5 = r13.g;	 Catch:{ CryptoException -> 0x01cd }
        r6 = r13.S;	 Catch:{ CryptoException -> 0x01cd }
        r0 = r13.n;	 Catch:{ CryptoException -> 0x01cd }
        r0 = r0.b;	 Catch:{ CryptoException -> 0x01cd }
        r8 = r0.limit();	 Catch:{ CryptoException -> 0x01cd }
        r7 = 0;
        r11 = 0;
        r5.queueInputBuffer(r6, r7, r8, r9, r11);	 Catch:{ CryptoException -> 0x01cd }
    L_0x01be:
        r13.E();	 Catch:{ CryptoException -> 0x01cd }
        r13.aa = r2;	 Catch:{ CryptoException -> 0x01cd }
        r13.X = r1;	 Catch:{ CryptoException -> 0x01cd }
        r0 = r13.j;	 Catch:{ CryptoException -> 0x01cd }
        r1 = r0.c;	 Catch:{ CryptoException -> 0x01cd }
        r1 = r1 + r2;
        r0.c = r1;	 Catch:{ CryptoException -> 0x01cd }
        return r2;
    L_0x01cd:
        r0 = move-exception;
        r0 = defpackage.nyy.a(r0);
        throw r0;
    L_0x01d3:
        return r1;
    L_0x01d4:
        r0 = r13.v;
        r0 = r0.g();
        r0 = defpackage.nyy.a(r0);
        throw r0;
    L_0x01df:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okt.G():boolean");
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARNING: Missing block: B:63:0x00c3, code skipped:
            if (r6.o == r2.o) goto L_0x00b3;
     */
    public void a(defpackage.nzy r6) {
        /*
        r5 = this;
        r0 = r5.t;
        r6 = r6.a;
        r5.t = r6;
        r1 = 1;
        r5.af = r1;
        r2 = r6.l;
        r3 = 0;
        if (r0 == 0) goto L_0x0011;
    L_0x000e:
        r0 = r0.l;
        goto L_0x0012;
    L_0x0011:
        r0 = r3;
    L_0x0012:
        r0 = defpackage.ozp.a(r2, r0);
        r0 = r0 ^ r1;
        if (r0 == 0) goto L_0x004b;
    L_0x0019:
        r0 = r6.l;
        if (r0 == 0) goto L_0x0048;
    L_0x001d:
        r0 = r5.k;
        if (r0 == 0) goto L_0x003c;
    L_0x0021:
        r2 = android.os.Looper.myLooper();
        r3 = r6.l;
        r0 = r0.a(r2, r3);
        r2 = r5.w;
        if (r0 == r2) goto L_0x0033;
    L_0x002f:
        r2 = r5.v;
        if (r0 != r2) goto L_0x0038;
    L_0x0033:
        r2 = r5.k;
        r2.a(r0);
    L_0x0038:
        r5.a(r0);
        goto L_0x004b;
    L_0x003c:
        r6 = new java.lang.IllegalStateException;
        r0 = "Media requires a DrmSessionManager";
        r6.<init>(r0);
        r6 = defpackage.nyy.a(r6);
        throw r6;
    L_0x0048:
        r5.a(r3);
    L_0x004b:
        r0 = r5.g;
        if (r0 != 0) goto L_0x0053;
    L_0x004f:
        r5.x();
        return;
    L_0x0053:
        r0 = r5.w;
        if (r0 != 0) goto L_0x005b;
    L_0x0057:
        r2 = r5.v;
        if (r2 != 0) goto L_0x0075;
    L_0x005b:
        if (r0 == 0) goto L_0x0061;
    L_0x005d:
        r2 = r5.v;
        if (r2 == 0) goto L_0x0075;
    L_0x0061:
        if (r0 == 0) goto L_0x0069;
    L_0x0063:
        r0 = r5.h;
        r0 = r0.d;
        if (r0 == 0) goto L_0x0075;
    L_0x0069:
        r0 = defpackage.ozp.a;
        r2 = 23;
        if (r0 >= r2) goto L_0x0079;
    L_0x006f:
        r0 = r5.w;
        r2 = r5.v;
        if (r0 == r2) goto L_0x0079;
    L_0x0075:
        r5.J();
        return;
    L_0x0079:
        r0 = r5.g;
        r2 = r5.h;
        r3 = r5.B;
        r0 = r5.a(r0, r2, r3, r6);
        if (r0 == 0) goto L_0x00ef;
    L_0x0085:
        if (r0 == r1) goto L_0x00d7;
    L_0x0087:
        r2 = 2;
        if (r0 == r2) goto L_0x00a2;
    L_0x008a:
        r1 = 3;
        if (r0 != r1) goto L_0x009c;
    L_0x008d:
        r5.B = r6;
        r5.H();
        r6 = r5.w;
        r0 = r5.v;
        if (r6 == r0) goto L_0x00f2;
    L_0x0098:
        r5.I();
        return;
    L_0x009c:
        r6 = new java.lang.IllegalStateException;
        r6.<init>();
        throw r6;
    L_0x00a2:
        r0 = r5.G;
        if (r0 == 0) goto L_0x00aa;
    L_0x00a6:
        r5.J();
        return;
    L_0x00aa:
        r5.W = r1;
        r5.X = r1;
        r0 = r5.F;
        r3 = 0;
        if (r0 != r2) goto L_0x00b5;
    L_0x00b3:
        r3 = 1;
        goto L_0x00c6;
    L_0x00b5:
        if (r0 != r1) goto L_0x00c6;
    L_0x00b7:
        r0 = r6.n;
        r2 = r5.B;
        r4 = r2.n;
        if (r0 != r4) goto L_0x00c6;
    L_0x00bf:
        r0 = r6.o;
        r2 = r2.o;
        if (r0 != r2) goto L_0x00c6;
    L_0x00c5:
        goto L_0x00b3;
    L_0x00c6:
        r5.M = r3;
        r5.B = r6;
        r5.H();
        r6 = r5.w;
        r0 = r5.v;
        if (r6 == r0) goto L_0x00f2;
    L_0x00d3:
        r5.I();
        return;
    L_0x00d7:
        r5.B = r6;
        r5.H();
        r6 = r5.w;
        r0 = r5.v;
        if (r6 == r0) goto L_0x00e6;
    L_0x00e2:
        r5.I();
        return;
    L_0x00e6:
        r6 = r5.aa;
        if (r6 == 0) goto L_0x00f2;
    L_0x00ea:
        r5.Y = r1;
        r5.Z = r1;
        return;
    L_0x00ef:
        r5.J();
    L_0x00f2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okt.a(nzy):void");
    }

    public boolean v() {
        return this.i;
    }

    public boolean u() {
        boolean z = false;
        if (!(this.t == null || this.ad)) {
            if (t() || D()) {
                z = true;
            } else if (this.R == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.R) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    private final void H() {
        if (ozp.a >= 23) {
            float a = a(this.A, this.d);
            float f = this.C;
            if (f == a) {
                return;
            }
            if (a == -1.0f) {
                J();
            } else if (f != -1.0f || a > this.m) {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", a);
                this.g.setParameters(bundle);
                this.C = a;
            }
        }
    }

    private final void I() {
        if (ozp.a < 23) {
            J();
        } else if (this.aa) {
            this.Y = 1;
            this.Z = 2;
        } else {
            M();
        }
    }

    private final void J() {
        if (this.aa) {
            this.Y = 1;
            this.Z = 3;
            return;
        }
        L();
    }

    private final void K() {
        int i = this.Z;
        if (i == 1) {
            A();
        } else if (i == 2) {
            M();
        } else if (i != 3) {
            this.i = true;
            w();
        } else {
            L();
        }
    }

    private final void L() {
        z();
        x();
    }

    private final void M() {
        oeg oeg = (oeg) this.w.h();
        if (oeg == null) {
            L();
        } else if (nyr.e.equals(oeg.a)) {
            L();
        } else if (!A()) {
            try {
                this.x.setMediaDrmSession(oeg.b);
                b(this.w);
                this.Y = 0;
                this.Z = 0;
            } catch (MediaCryptoException e) {
                throw nyy.a(e);
            }
        }
    }
}
