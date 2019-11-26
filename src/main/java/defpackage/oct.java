package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.util.Collections;
import java.util.List;

/* renamed from: oct */
public class oct extends okt implements oyr {
    public final obr e;
    public boolean f;
    private final Context k;
    private final oca l;
    private final long[] m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private MediaFormat r;
    private int s;
    private int t;
    private int u;
    private int v;
    private long w;
    private boolean x;
    private long y;
    private int z;

    public oct(Context context, okv okv, odw odw, Handler handler, obs obs) {
        this(context, okv, odw, true, handler, obs, null, new obq[0]);
    }

    public final oyr c() {
        return this;
    }

    public oct(Context context, okv okv, odw odw, boolean z, Handler handler, obs obs, obk obk, obq... obqArr) {
        ocm ocm = new ocm(obk, obqArr);
        super(1, okv, odw, z, 44100.0f);
        this.k = context.getApplicationContext();
        this.l = ocm;
        this.y = -9223372036854775807L;
        this.m = new long[10];
        this.e = new obr(handler, obs);
        ocm.b = new ocw(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(okv okv, odw odw, nzw nzw) {
        String str = nzw.i;
        if (!oyu.a(str)) {
            return 0;
        }
        int i = ozp.a >= 21 ? 32 : 0;
        boolean a = nys.a(odw, nzw.l);
        if (a && a(nzw.v, str) && okv.a() != null) {
            return i | 12;
        }
        if ((!"audio/raw".equals(str) || this.l.a(nzw.v, nzw.x)) && this.l.a(nzw.v, 2)) {
            List a2 = a(okv, nzw, false);
            if (!a2.isEmpty()) {
                if (!a) {
                    return 2;
                }
                okq okq = (okq) a2.get(0);
                a = okq.a(nzw);
                int i2 = 8;
                if (a && okq.b(nzw)) {
                    i2 = 16;
                }
                return (!a ? 3 : 4) | (i2 | i);
            }
        }
        return 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final List a(okv okv, nzw nzw, boolean z) {
        if (a(nzw.v, nzw.i)) {
            okq a = okv.a();
            if (a != null) {
                return Collections.singletonList(a);
            }
        }
        List a2 = okx.a(okv.a(nzw.i, z, false), nzw);
        if ("audio/eac3-joc".equals(nzw.i)) {
            a2.addAll(okv.a("audio/eac3", z, false));
        }
        return Collections.unmodifiableList(a2);
    }

    private final boolean a(int i, String str) {
        return this.l.a(i, oyu.h(str));
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:56:0x0114, code skipped:
            if ("AXON 7 mini".equals(defpackage.ozp.d) == false) goto L_0x0116;
     */
    public final void a(defpackage.okq r9, android.media.MediaCodec r10, defpackage.nzw r11, android.media.MediaCrypto r12, float r13) {
        /*
        r8 = this;
        r0 = r8.d;
        r1 = r8.a(r9, r11);
        r2 = r0.length;
        r3 = 0;
        r4 = 1;
        if (r2 == r4) goto L_0x0023;
    L_0x000b:
        r5 = r1;
        r1 = 0;
    L_0x000d:
        if (r1 >= r2) goto L_0x0022;
    L_0x000f:
        r6 = r0[r1];
        r7 = r9.a(r11, r6, r3);
        if (r7 == 0) goto L_0x001f;
    L_0x0017:
        r6 = r8.a(r9, r6);
        r5 = java.lang.Math.max(r5, r6);
    L_0x001f:
        r1 = r1 + 1;
        goto L_0x000d;
    L_0x0022:
        r1 = r5;
    L_0x0023:
        r8.n = r1;
        r0 = r9.a;
        r1 = defpackage.ozp.a;
        r2 = 24;
        r5 = "samsung";
        if (r1 >= r2) goto L_0x0060;
    L_0x002f:
        r1 = "OMX.SEC.aac.dec";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0060;
    L_0x0037:
        r0 = defpackage.ozp.c;
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x0060;
    L_0x003f:
        r0 = defpackage.ozp.b;
        r1 = "zeroflte";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x005e;
    L_0x0049:
        r0 = defpackage.ozp.b;
        r1 = "herolte";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x005e;
    L_0x0053:
        r0 = defpackage.ozp.b;
        r1 = "heroqlte";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x005e;
    L_0x005d:
        goto L_0x0060;
    L_0x005e:
        r0 = 1;
        goto L_0x0061;
    L_0x0060:
        r0 = 0;
    L_0x0061:
        r8.p = r0;
        r0 = r9.a;
        r1 = defpackage.ozp.a;
        r2 = 21;
        if (r1 >= r2) goto L_0x00ba;
    L_0x006b:
        r1 = "OMX.SEC.mp3.dec";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00ba;
    L_0x0073:
        r0 = defpackage.ozp.c;
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x00ba;
    L_0x007b:
        r0 = defpackage.ozp.b;
        r1 = "baffin";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x00b8;
    L_0x0085:
        r0 = defpackage.ozp.b;
        r1 = "grand";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x00b8;
    L_0x008f:
        r0 = defpackage.ozp.b;
        r1 = "fortuna";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x00b8;
    L_0x0099:
        r0 = defpackage.ozp.b;
        r1 = "gprimelte";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x00b8;
    L_0x00a3:
        r0 = defpackage.ozp.b;
        r1 = "j2y18lte";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x00b8;
    L_0x00ad:
        r0 = defpackage.ozp.b;
        r1 = "ms01";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x00b8;
    L_0x00b7:
        goto L_0x00ba;
    L_0x00b8:
        r0 = 1;
        goto L_0x00bb;
    L_0x00ba:
        r0 = 0;
    L_0x00bb:
        r8.q = r0;
        r0 = r9.e;
        r8.o = r0;
        if (r0 == 0) goto L_0x00c6;
    L_0x00c3:
        r9 = "audio/raw";
        goto L_0x00c8;
    L_0x00c6:
        r9 = r9.b;
    L_0x00c8:
        r0 = r8.n;
        r1 = new android.media.MediaFormat;
        r1.<init>();
        r2 = "mime";
        r1.setString(r2, r9);
        r9 = r11.v;
        r5 = "channel-count";
        r1.setInteger(r5, r9);
        r9 = r11.w;
        r5 = "sample-rate";
        r1.setInteger(r5, r9);
        r9 = r11.k;
        defpackage.olg.a(r1, r9);
        r9 = "max-input-size";
        defpackage.olg.a(r1, r9, r0);
        r9 = defpackage.ozp.a;
        r0 = 23;
        if (r9 < r0) goto L_0x011b;
    L_0x00f2:
        r9 = "priority";
        r1.setInteger(r9, r3);
        r9 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1));
        if (r9 != 0) goto L_0x00fe;
    L_0x00fd:
        goto L_0x011b;
    L_0x00fe:
        r9 = defpackage.ozp.a;
        if (r9 != r0) goto L_0x0116;
    L_0x0102:
        r9 = defpackage.ozp.d;
        r0 = "ZTE B2017G";
        r9 = r0.equals(r9);
        if (r9 != 0) goto L_0x011b;
    L_0x010c:
        r9 = defpackage.ozp.d;
        r0 = "AXON 7 mini";
        r9 = r0.equals(r9);
        if (r9 != 0) goto L_0x011b;
    L_0x0116:
        r9 = "operating-rate";
        r1.setFloat(r9, r13);
    L_0x011b:
        r9 = defpackage.ozp.a;
        r13 = 28;
        if (r9 > r13) goto L_0x0130;
    L_0x0121:
        r9 = r11.i;
        r13 = "audio/ac4";
        r9 = r13.equals(r9);
        if (r9 == 0) goto L_0x0130;
    L_0x012b:
        r9 = "ac4-is-sync";
        r1.setInteger(r9, r4);
    L_0x0130:
        r9 = 0;
        r10.configure(r1, r9, r12, r3);
        r10 = r8.o;
        if (r10 == 0) goto L_0x0142;
    L_0x0138:
        r8.r = r1;
        r9 = r8.r;
        r10 = r11.i;
        r9.setString(r2, r10);
        return;
    L_0x0142:
        r8.r = r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oct.a(okq, android.media.MediaCodec, nzw, android.media.MediaCrypto, float):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(MediaCodec mediaCodec, okq okq, nzw nzw, nzw nzw2) {
        if (a(okq, nzw2) > this.n || nzw.y != 0 || nzw.z != 0 || nzw2.y != 0 || nzw2.z != 0) {
            return 0;
        }
        if (okq.a(nzw, nzw2, true)) {
            return 3;
        }
        return (ozp.a(nzw.i, nzw2.i) && nzw.v == nzw2.v && nzw.w == nzw2.w && nzw.a(nzw2)) ? 1 : 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(float f, nzw[] nzwArr) {
        int i = -1;
        for (nzw nzw : nzwArr) {
            int i2 = nzw.w;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        return i != -1 ? ((float) i) * f : -1.0f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, long j, long j2) {
        this.e.a(str, j, j2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nzy nzy) {
        super.a(nzy);
        nzw nzw = nzy.a;
        this.e.a(nzw);
        this.s = "audio/raw".equals(nzw.i) ? nzw.x : 2;
        this.t = nzw.v;
        this.u = nzw.y;
        this.v = nzw.z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int h;
        int[] iArr;
        MediaFormat mediaFormat2 = this.r;
        if (mediaFormat2 != null) {
            h = oyu.h(mediaFormat2.getString("mime"));
            mediaFormat = this.r;
        } else {
            h = this.s;
        }
        int i = h;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.p && integer == 6) {
            int i2 = this.t;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.t; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
                this.l.a(i, integer, integer2, iArr, this.u, this.v);
            }
        }
        iArr = null;
        try {
            this.l.a(i, integer, integer2, iArr, this.u, this.v);
        } catch (obz e) {
            throw nyy.a(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        super.a(z);
        this.e.a(this.j);
        int i = this.a.b;
        if (i != 0) {
            this.l.a(i);
        } else {
            this.l.g();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nzw[] nzwArr, long j) {
        if (this.y != -9223372036854775807L) {
            int i = this.z;
            long[] jArr = this.m;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder stringBuilder = new StringBuilder(67);
                stringBuilder.append("Too many stream changes, so dropping change at ");
                stringBuilder.append(j2);
                oyp.a("MediaCodecAudioRenderer", stringBuilder.toString());
            } else {
                this.z = i + 1;
            }
            this.m[this.z - 1] = this.y;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, boolean z) {
        super.a(j, z);
        this.l.i();
        this.w = j;
        this.x = true;
        this.f = true;
        this.y = -9223372036854775807L;
        this.z = 0;
    }

    /* Access modifiers changed, original: protected */
    public void p() {
        this.l.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void q() {
        C();
        this.l.h();
    }

    /* Access modifiers changed, original: protected|final */
    public final void r() {
        try {
            this.y = -9223372036854775807L;
            this.z = 0;
            this.l.i();
            try {
                super.r();
            } finally {
                this.e.b(this.j);
            }
        } catch (Throwable th) {
            super.r();
        } finally {
            this.e.b(this.j);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void s() {
        try {
            super.s();
        } finally {
            this.l.j();
        }
    }

    public final boolean v() {
        return this.i && this.l.d();
    }

    public boolean u() {
        return this.l.e() || super.u();
    }

    public final long aQ_() {
        if (this.c == 2) {
            C();
        }
        return this.w;
    }

    public final oag a(oag oag) {
        return this.l.a(oag);
    }

    public final oag aR_() {
        return this.l.f();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(odj odj) {
        if (this.x && !odj.isDecodeOnly()) {
            if (Math.abs(odj.c - this.w) > 500000) {
                this.w = odj.c;
            }
            this.x = false;
        }
        this.y = Math.max(odj.c, this.y);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(long j) {
        while (this.z != 0 && j >= this.m[0]) {
            this.l.b();
            int i = this.z - 1;
            this.z = i;
            long[] jArr = this.m;
            System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:7:0x0017, code skipped:
            if (r1 != -9223372036854775807L) goto L_0x001b;
     */
    public final boolean a(long r1, long r3, android.media.MediaCodec r5, java.nio.ByteBuffer r6, int r7, int r8, long r9, boolean r11, defpackage.nzw r12) {
        /*
        r0 = this;
        r1 = r0.q;
        if (r1 == 0) goto L_0x001a;
    L_0x0004:
        r1 = 0;
        r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1));
        if (r3 != 0) goto L_0x001a;
    L_0x000a:
        r1 = r8 & 4;
        if (r1 == 0) goto L_0x001a;
    L_0x000e:
        r1 = r0.y;
        r3 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r12 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x001b;
    L_0x001a:
        r1 = r9;
    L_0x001b:
        r3 = r0.o;
        r4 = 0;
        r9 = 1;
        if (r3 == 0) goto L_0x002a;
    L_0x0021:
        r3 = r8 & 2;
        if (r3 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x002a;
    L_0x0026:
        r5.releaseOutputBuffer(r7, r4);
        return r9;
    L_0x002a:
        if (r11 == 0) goto L_0x003c;
    L_0x002c:
        r5.releaseOutputBuffer(r7, r4);
        r1 = r0.j;
        r2 = r1.f;
        r2 = r2 + r9;
        r1.f = r2;
        r1 = r0.l;
        r1.b();
        return r9;
    L_0x003c:
        r3 = r0.l;	 Catch:{ occ -> 0x0052, occ | oce -> 0x0050 }
        r1 = r3.a(r6, r1);	 Catch:{ occ -> 0x0052, occ | oce -> 0x0050 }
        if (r1 == 0) goto L_0x004f;
    L_0x0044:
        r5.releaseOutputBuffer(r7, r4);	 Catch:{ occ -> 0x0052, occ | oce -> 0x0050 }
        r1 = r0.j;	 Catch:{ occ -> 0x0052, occ | oce -> 0x0050 }
        r2 = r1.e;	 Catch:{ occ -> 0x0052, occ | oce -> 0x0050 }
        r2 = r2 + r9;
        r1.e = r2;	 Catch:{ occ -> 0x0052, occ | oce -> 0x0050 }
        return r9;
    L_0x004f:
        return r4;
    L_0x0050:
        r1 = move-exception;
        goto L_0x0053;
    L_0x0052:
        r1 = move-exception;
    L_0x0053:
        r1 = defpackage.nyy.a(r1);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oct.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, nzw):boolean");
    }

    /* Access modifiers changed, original: protected|final */
    public final void w() {
        try {
            this.l.c();
        } catch (oce e) {
            throw nyy.a(e);
        }
    }

    public void a(int i, Object obj) {
        if (i == 2) {
            this.l.a(((Float) obj).floatValue());
        } else if (i == 3) {
            this.l.a((obi) obj);
        } else if (i == 5) {
            this.l.a((och) obj);
        }
    }

    private final int a(okq okq, nzw nzw) {
        if (!"OMX.google.raw.decoder".equals(okq.a) || ozp.a >= 24 || (ozp.a == 23 && ozp.c(this.k))) {
            return nzw.j;
        }
        return -1;
    }

    private final void C() {
        long a = this.l.a(v());
        if (a != Long.MIN_VALUE) {
            if (!this.f) {
                a = Math.max(this.w, a);
            }
            this.w = a;
            this.f = false;
        }
    }
}
