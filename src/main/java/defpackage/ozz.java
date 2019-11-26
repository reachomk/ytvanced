package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import java.util.Collections;
import java.util.List;

/* renamed from: ozz */
public class ozz extends okt {
    private static final int[] f = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean k;
    private static boolean l;
    private long A;
    private long B;
    private long C;
    private int D;
    private int E;
    private int F;
    private long G;
    private int H;
    private float I;
    private int J;
    private int K;
    private int L;
    private float M;
    private int N;
    private int O;
    private int P;
    private float Q;
    private boolean R;
    private int S;
    private long T;
    private long U;
    private int V;
    private pae W;
    public pab e;
    private final Context m;
    private final pad n;
    private final pak o;
    private final long p = 5000;
    private final int q;
    private final boolean r;
    private final long[] s;
    private final long[] t;
    private pac u;
    private boolean v;
    private Surface w;
    private Surface x;
    private int y;
    private boolean z;

    public ozz(Context context, okv okv, odw odw, boolean z, Handler handler, pah pah, int i) {
        super(2, okv, odw, z, 30.0f);
        this.q = i;
        this.m = context.getApplicationContext();
        this.n = new pad(this.m);
        this.o = new pak(handler, pah);
        this.r = "NVIDIA".equals(ozp.c);
        this.s = new long[10];
        this.t = new long[10];
        this.U = -9223372036854775807L;
        this.T = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.J = -1;
        this.K = -1;
        this.M = -1.0f;
        this.I = -1.0f;
        this.y = 1;
        G();
    }

    private static boolean f(long j) {
        return j < -30000;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(okv okv, odw odw, nzw nzw) {
        int i = false;
        if (!oyu.b(nzw.i)) {
            return 0;
        }
        odq odq = nzw.l;
        boolean z = odq != null;
        List a = ozz.a(okv, nzw, z, false);
        if (z && a.isEmpty()) {
            a = ozz.a(okv, nzw, false, false);
        }
        if (a.isEmpty()) {
            return 1;
        }
        if (!nys.a(odw, odq)) {
            return 2;
        }
        okq okq = (okq) a.get(0);
        boolean a2 = okq.a(nzw);
        int i2 = !okq.b(nzw) ? 8 : 16;
        if (a2) {
            List a3 = ozz.a(okv, nzw, z, true);
            if (!a3.isEmpty()) {
                okq okq2 = (okq) a3.get(0);
                if (okq2.a(nzw) && okq2.b(nzw)) {
                    i = 32;
                }
            }
        }
        return (!a2 ? 3 : 4) | (i2 | i);
    }

    /* Access modifiers changed, original: protected|final */
    public final List a(okv okv, nzw nzw, boolean z) {
        return ozz.a(okv, nzw, z, this.R);
    }

    private static List a(okv okv, nzw nzw, boolean z, boolean z2) {
        List a = okx.a(okv.a(nzw.i, z, z2), nzw);
        if ("video/dolby-vision".equals(nzw.i)) {
            Pair b = okx.b(nzw.f);
            if (b != null) {
                int intValue = ((Integer) b.first).intValue();
                if (intValue == 4 || intValue == 8) {
                    a.addAll(okv.a("video/hevc", z, z2));
                } else if (intValue == 9) {
                    a.addAll(okv.a("video/avc", z, z2));
                }
            }
        }
        return Collections.unmodifiableList(a);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        super.a(z);
        int i = this.S;
        int i2 = this.a.b;
        this.S = i2;
        this.R = i2 != 0;
        if (i2 != i) {
            z();
        }
        this.o.a(this.j);
        pad pad = this.n;
        pad.i = false;
        if (pad.a != null) {
            pad.b.c.sendEmptyMessage(1);
            pag pag = pad.c;
            if (pag != null) {
                pag.a.registerDisplayListener(pag, null);
            }
            pad.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nzw[] nzwArr, long j) {
        if (this.U == -9223372036854775807L) {
            this.U = j;
            return;
        }
        int i = this.V;
        long[] jArr = this.s;
        if (i == jArr.length) {
            long j2 = jArr[i - 1];
            StringBuilder stringBuilder = new StringBuilder(65);
            stringBuilder.append("Too many stream changes, so dropping offset: ");
            stringBuilder.append(j2);
            oyp.a("MediaCodecVideoRenderer", stringBuilder.toString());
        } else {
            this.V = i + 1;
        }
        int i2 = this.V - 1;
        this.s[i2] = j;
        this.t[i2] = this.T;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, boolean z) {
        super.a(j, z);
        E();
        this.A = -9223372036854775807L;
        this.E = 0;
        this.T = -9223372036854775807L;
        int i = this.V;
        if (i != 0) {
            this.U = this.s[i - 1];
            this.V = 0;
        }
        if (z) {
            D();
        } else {
            this.B = -9223372036854775807L;
        }
    }

    /* JADX WARNING: Missing block: B:7:0x0016, code skipped:
            if (r9.w == r0) goto L_0x0022;
     */
    /* JADX WARNING: Missing block: B:11:0x001f, code skipped:
            if (r9.R != false) goto L_0x0022;
     */
    public boolean u() {
        /*
        r9 = this;
        r0 = super.u();
        r1 = 1;
        r2 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        if (r0 == 0) goto L_0x0025;
    L_0x000c:
        r0 = r9.z;
        if (r0 != 0) goto L_0x0022;
    L_0x0010:
        r0 = r9.x;
        if (r0 == 0) goto L_0x0018;
    L_0x0014:
        r4 = r9.w;
        if (r4 == r0) goto L_0x0022;
    L_0x0018:
        r0 = r9.g;
        if (r0 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0022;
    L_0x001d:
        r0 = r9.R;
        if (r0 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0025;
    L_0x0022:
        r9.B = r2;
        return r1;
    L_0x0025:
        r4 = r9.B;
        r0 = 0;
        r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r6 == 0) goto L_0x003a;
    L_0x002c:
        r4 = android.os.SystemClock.elapsedRealtime();
        r6 = r9.B;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 < 0) goto L_0x0039;
    L_0x0036:
        r9.B = r2;
        return r0;
    L_0x0039:
        return r1;
    L_0x003a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozz.u():boolean");
    }

    /* Access modifiers changed, original: protected */
    public void p() {
        this.D = 0;
        this.C = SystemClock.elapsedRealtime();
        this.G = SystemClock.elapsedRealtime() * 1000;
    }

    /* Access modifiers changed, original: protected|final */
    public final void q() {
        this.B = -9223372036854775807L;
        J();
    }

    /* Access modifiers changed, original: protected|final */
    public final void r() {
        this.T = -9223372036854775807L;
        this.U = -9223372036854775807L;
        this.V = 0;
        G();
        E();
        pad pad = this.n;
        if (pad.a != null) {
            pag pag = pad.c;
            if (pag != null) {
                pag.a.unregisterDisplayListener(pag);
            }
            pad.b.c.sendEmptyMessage(2);
        }
        this.e = null;
        try {
            super.r();
        } finally {
            this.o.b(this.j);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void s() {
        try {
            super.s();
        } finally {
            Surface surface = this.x;
            if (surface != null) {
                if (this.w == surface) {
                    this.w = null;
                }
                surface.release();
                this.x = null;
            }
        }
    }

    public void a(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.x;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    okq okq = this.h;
                    if (okq != null && b(okq)) {
                        this.x = ozy.a(this.m, okq.d);
                        surface = this.x;
                    }
                }
            }
            if (this.w != surface) {
                this.w = surface;
                i = this.c;
                MediaCodec mediaCodec = this.g;
                if (mediaCodec != null) {
                    if (ozp.a < 23 || surface == null || this.v) {
                        z();
                        x();
                    } else {
                        mediaCodec.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.x) {
                    G();
                    E();
                } else {
                    I();
                    E();
                    if (i == 2) {
                        D();
                    }
                }
            } else if (!(surface == null || surface == this.x)) {
                I();
                if (this.z) {
                    this.o.a(this.w);
                }
            }
        } else if (i == 4) {
            i = ((Integer) obj).intValue();
            this.y = i;
            MediaCodec mediaCodec2 = this.g;
            if (mediaCodec2 != null) {
                mediaCodec2.setVideoScalingMode(i);
            }
        } else if (i == 6) {
            this.W = (pae) obj;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(okq okq) {
        return this.w != null || b(okq);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean y() {
        return this.R;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0122 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0132 A:{SYNTHETIC, EDGE_INSN: B:105:0x0132->B:56:0x0132 ?: BREAK  } */
    /* JADX WARNING: Missing block: B:55:0x0131, code skipped:
            r15 = r6;
     */
    /* JADX WARNING: Missing block: B:56:0x0132, code skipped:
            r2 = r17;
     */
    public final void a(defpackage.okq r24, android.media.MediaCodec r25, defpackage.nzw r26, android.media.MediaCrypto r27, float r28) {
        /*
        r23 = this;
        r0 = r23;
        r1 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r28;
        r5 = r0.d;
        r6 = r3.n;
        r7 = r3.o;
        r8 = defpackage.ozz.a(r1, r3);
        r9 = r5.length;
        r10 = -1;
        r11 = 1;
        r12 = 0;
        if (r9 == r11) goto L_0x0170;
    L_0x001a:
        r14 = r6;
        r13 = r8;
        r6 = 0;
        r8 = r7;
        r7 = 0;
    L_0x001f:
        if (r6 >= r9) goto L_0x0050;
    L_0x0021:
        r15 = r5[r6];
        r16 = r1.a(r3, r15, r12);
        if (r16 != 0) goto L_0x002a;
    L_0x0029:
        goto L_0x004b;
    L_0x002a:
        r11 = r15.n;
        if (r11 == r10) goto L_0x0035;
    L_0x002e:
        r12 = r15.o;
        if (r12 != r10) goto L_0x0033;
    L_0x0032:
        goto L_0x0035;
    L_0x0033:
        r12 = 0;
        goto L_0x0036;
    L_0x0035:
        r12 = 1;
    L_0x0036:
        r7 = r7 | r12;
        r11 = java.lang.Math.max(r14, r11);
        r12 = r15.o;
        r8 = java.lang.Math.max(r8, r12);
        r12 = defpackage.ozz.a(r1, r15);
        r12 = java.lang.Math.max(r13, r12);
        r14 = r11;
        r13 = r12;
    L_0x004b:
        r6 = r6 + 1;
        r11 = 1;
        r12 = 0;
        goto L_0x001f;
    L_0x0050:
        if (r7 == 0) goto L_0x016a;
    L_0x0052:
        r5 = new java.lang.StringBuilder;
        r6 = 66;
        r5.<init>(r6);
        r6 = "Resolutions unknown. Codec max resolution: ";
        r5.append(r6);
        r5.append(r14);
        r6 = "x";
        r5.append(r6);
        r5.append(r8);
        r5 = r5.toString();
        r7 = "MediaCodecVideoRenderer";
        defpackage.oyp.a(r7, r5);
        r5 = r3.o;
        r9 = r3.n;
        if (r5 > r9) goto L_0x007a;
    L_0x0078:
        r10 = r9;
        goto L_0x007b;
    L_0x007a:
        r10 = r5;
    L_0x007b:
        if (r5 > r9) goto L_0x007f;
    L_0x007d:
        r11 = r5;
        goto L_0x0080;
    L_0x007f:
        r11 = r9;
    L_0x0080:
        r12 = (float) r11;
        r15 = (float) r10;
        r12 = r12 / r15;
        r15 = f;
        r2 = r15.length;
        r4 = 0;
    L_0x0087:
        r17 = 0;
        if (r4 >= r2) goto L_0x0131;
    L_0x008b:
        r18 = r2;
        r2 = r15[r4];
        r19 = r15;
        r15 = (float) r2;
        r15 = r15 * r12;
        r15 = (int) r15;
        if (r2 > r10) goto L_0x0099;
    L_0x0097:
        goto L_0x0131;
    L_0x0099:
        if (r15 > r11) goto L_0x009d;
    L_0x009b:
        goto L_0x0131;
    L_0x009d:
        r20 = r10;
        r10 = defpackage.ozp.a;
        r21 = r11;
        r11 = 21;
        if (r10 >= r11) goto L_0x00d3;
    L_0x00a7:
        r10 = 16;
        r2 = defpackage.ozp.a(r2, r10);
        r2 = r2 << 4;
        r10 = defpackage.ozp.a(r15, r10);
        r10 = r10 << 4;
        r11 = r2 * r10;
        r15 = defpackage.okx.a();
        if (r11 <= r15) goto L_0x00c2;
    L_0x00bd:
        r22 = r5;
        r15 = r6;
        goto L_0x0122;
    L_0x00c2:
        if (r5 > r9) goto L_0x00c6;
    L_0x00c4:
        r4 = r2;
        goto L_0x00c7;
    L_0x00c6:
        r4 = r10;
    L_0x00c7:
        if (r5 > r9) goto L_0x00ca;
    L_0x00c9:
        goto L_0x00cb;
    L_0x00ca:
        r10 = r2;
    L_0x00cb:
        r2 = new android.graphics.Point;
        r2.<init>(r4, r10);
        r15 = r6;
        goto L_0x0134;
    L_0x00d3:
        if (r5 > r9) goto L_0x00d7;
    L_0x00d5:
        r10 = r2;
        goto L_0x00d8;
    L_0x00d7:
        r10 = r15;
    L_0x00d8:
        if (r5 > r9) goto L_0x00db;
    L_0x00da:
        goto L_0x00dc;
    L_0x00db:
        r15 = r2;
    L_0x00dc:
        r2 = r1.c;
        if (r2 != 0) goto L_0x00ea;
    L_0x00e0:
        r2 = "align.caps";
        r1.a(r2);
    L_0x00e5:
        r22 = r5;
        r5 = r17;
        goto L_0x0111;
    L_0x00ea:
        r2 = r2.getVideoCapabilities();
        if (r2 != 0) goto L_0x00f6;
    L_0x00f0:
        r2 = "align.vCaps";
        r1.a(r2);
        goto L_0x00e5;
    L_0x00f6:
        r11 = r2.getWidthAlignment();
        r2 = r2.getHeightAlignment();
        r22 = r5;
        r5 = new android.graphics.Point;
        r10 = defpackage.ozp.a(r10, r11);
        r10 = r10 * r11;
        r11 = defpackage.ozp.a(r15, r2);
        r11 = r11 * r2;
        r5.<init>(r10, r11);
    L_0x0111:
        r2 = r3.p;
        r10 = r5.x;
        r11 = r5.y;
        r17 = r5;
        r15 = r6;
        r5 = (double) r2;
        r2 = r1.a(r10, r11, r5);
        if (r2 == 0) goto L_0x0122;
    L_0x0121:
        goto L_0x0132;
    L_0x0122:
        r4 = r4 + 1;
        r6 = r15;
        r2 = r18;
        r15 = r19;
        r10 = r20;
        r11 = r21;
        r5 = r22;
        goto L_0x0087;
    L_0x0131:
        r15 = r6;
    L_0x0132:
        r2 = r17;
    L_0x0134:
        if (r2 != 0) goto L_0x0137;
    L_0x0136:
        goto L_0x016a;
    L_0x0137:
        r4 = r2.x;
        r14 = java.lang.Math.max(r14, r4);
        r2 = r2.y;
        r8 = java.lang.Math.max(r8, r2);
        r2 = r3.i;
        r2 = defpackage.ozz.a(r1, r2, r14, r8);
        r13 = java.lang.Math.max(r13, r2);
        r2 = new java.lang.StringBuilder;
        r4 = 57;
        r2.<init>(r4);
        r4 = "Codec max resolution adjusted to: ";
        r2.append(r4);
        r2.append(r14);
        r4 = r15;
        r2.append(r4);
        r2.append(r8);
        r2 = r2.toString();
        defpackage.oyp.a(r7, r2);
    L_0x016a:
        r2 = new pac;
        r2.<init>(r14, r8, r13);
        goto L_0x018d;
    L_0x0170:
        if (r8 == r10) goto L_0x0188;
    L_0x0172:
        r2 = r3.i;
        r4 = r3.n;
        r5 = r3.o;
        r2 = defpackage.ozz.a(r1, r2, r4, r5);
        if (r2 == r10) goto L_0x0188;
    L_0x017e:
        r4 = (float) r8;
        r5 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r4 = r4 * r5;
        r4 = (int) r4;
        r8 = java.lang.Math.min(r4, r2);
    L_0x0188:
        r2 = new pac;
        r2.<init>(r6, r7, r8);
    L_0x018d:
        r0.u = r2;
        r2 = r0.u;
        r4 = r0.r;
        r5 = r0.S;
        r6 = new android.media.MediaFormat;
        r6.<init>();
        r7 = r3.i;
        r8 = "mime";
        r6.setString(r8, r7);
        r7 = r3.n;
        r8 = "width";
        r6.setInteger(r8, r7);
        r7 = r3.o;
        r8 = "height";
        r6.setInteger(r8, r7);
        r7 = r3.k;
        defpackage.olg.a(r6, r7);
        r7 = r3.p;
        r8 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r9 == 0) goto L_0x01c1;
    L_0x01bc:
        r9 = "frame-rate";
        r6.setFloat(r9, r7);
    L_0x01c1:
        r7 = r3.q;
        r9 = "rotation-degrees";
        defpackage.olg.a(r6, r9, r7);
        r7 = r3.u;
        if (r7 != 0) goto L_0x01cd;
    L_0x01cc:
        goto L_0x01ef;
    L_0x01cd:
        r9 = r7.c;
        r10 = "color-transfer";
        defpackage.olg.a(r6, r10, r9);
        r9 = r7.a;
        r10 = "color-standard";
        defpackage.olg.a(r6, r10, r9);
        r9 = r7.b;
        r10 = "color-range";
        defpackage.olg.a(r6, r10, r9);
        r7 = r7.d;
        if (r7 == 0) goto L_0x01ef;
    L_0x01e6:
        r7 = java.nio.ByteBuffer.wrap(r7);
        r9 = "hdr-static-info";
        r6.setByteBuffer(r9, r7);
    L_0x01ef:
        r7 = r3.i;
        r9 = "video/dolby-vision";
        r7 = r9.equals(r7);
        if (r7 == 0) goto L_0x020e;
    L_0x01f9:
        r3 = r3.f;
        r3 = defpackage.okx.b(r3);
        if (r3 == 0) goto L_0x020e;
    L_0x0201:
        r3 = r3.first;
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r7 = "profile";
        defpackage.olg.a(r6, r7, r3);
    L_0x020e:
        r3 = r2.a;
        r7 = "max-width";
        r6.setInteger(r7, r3);
        r3 = r2.b;
        r7 = "max-height";
        r6.setInteger(r7, r3);
        r2 = r2.c;
        r3 = "max-input-size";
        defpackage.olg.a(r6, r3, r2);
        r2 = defpackage.ozp.a;
        r3 = 23;
        if (r2 < r3) goto L_0x023a;
    L_0x0229:
        r2 = "priority";
        r7 = 0;
        r6.setInteger(r2, r7);
        r2 = r28;
        r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r7 == 0) goto L_0x023a;
    L_0x0235:
        r7 = "operating-rate";
        r6.setFloat(r7, r2);
    L_0x023a:
        if (r4 == 0) goto L_0x0249;
    L_0x023c:
        r2 = "no-post-process";
        r4 = 1;
        r6.setInteger(r2, r4);
        r2 = "auto-frc";
        r7 = 0;
        r6.setInteger(r2, r7);
        goto L_0x024a;
    L_0x0249:
        r4 = 1;
    L_0x024a:
        if (r5 == 0) goto L_0x0256;
    L_0x024c:
        r2 = "tunneled-playback";
        r6.setFeatureEnabled(r2, r4);
        r2 = "audio-session-id";
        r6.setInteger(r2, r5);
    L_0x0256:
        r2 = r0.w;
        if (r2 != 0) goto L_0x0273;
    L_0x025a:
        r2 = r23.b(r24);
        defpackage.oxz.b(r2);
        r2 = r0.x;
        if (r2 != 0) goto L_0x026f;
    L_0x0265:
        r2 = r0.m;
        r1 = r1.d;
        r1 = defpackage.ozy.a(r2, r1);
        r0.x = r1;
    L_0x026f:
        r1 = r0.x;
        r0.w = r1;
    L_0x0273:
        r1 = r0.w;
        r2 = r25;
        r4 = r27;
        r5 = 0;
        r2.configure(r6, r1, r4, r5);
        r1 = defpackage.ozp.a;
        if (r1 < r3) goto L_0x028c;
    L_0x0281:
        r1 = r0.R;
        if (r1 == 0) goto L_0x028c;
    L_0x0285:
        r1 = new pab;
        r1.<init>(r0, r2);
        r0.e = r1;
    L_0x028c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozz.a(okq, android.media.MediaCodec, nzw, android.media.MediaCrypto, float):void");
    }

    /* Access modifiers changed, original: protected */
    public int a(MediaCodec mediaCodec, okq okq, nzw nzw, nzw nzw2) {
        if (okq.a(nzw, nzw2, true)) {
            int i = nzw2.n;
            pac pac = this.u;
            if (i <= pac.a && nzw2.o <= pac.b && ozz.a(okq, nzw2) <= this.u.c) {
                return !nzw.a(nzw2) ? 2 : 3;
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void z() {
        try {
            super.z();
        } finally {
            this.F = 0;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean B() {
        try {
            boolean B = super.B();
            return B;
        } finally {
            this.F = 0;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(float f, nzw[] nzwArr) {
        float f2 = -1.0f;
        for (nzw nzw : nzwArr) {
            float f3 = nzw.p;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 != -1.0f) {
            return f2 * f;
        }
        return -1.0f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, long j, long j2) {
        this.o.a(str, j, j2);
        this.v = a(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nzy nzy) {
        super.a(nzy);
        nzw nzw = nzy.a;
        this.o.a(nzw);
        this.I = nzw.r;
        this.H = nzw.q;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(odj odj) {
        this.F++;
        this.T = Math.max(odj.c, this.T);
        if (ozp.a < 23 && this.R) {
            e(odj.c);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        String str = "crop-right";
        String str2 = "crop-top";
        String str3 = "crop-bottom";
        String str4 = "crop-left";
        Object obj = null;
        if (mediaFormat.containsKey(str) && mediaFormat.containsKey(str4) && mediaFormat.containsKey(str3) && mediaFormat.containsKey(str2)) {
            obj = 1;
        }
        if (obj != null) {
            integer = (mediaFormat.getInteger(str) - mediaFormat.getInteger(str4)) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (obj != null) {
            integer2 = (mediaFormat.getInteger(str3) - mediaFormat.getInteger(str2)) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        a(mediaCodec, integer, integer2);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0139  */
    public final boolean a(long r24, long r26, android.media.MediaCodec r28, java.nio.ByteBuffer r29, int r30, int r31, long r32, boolean r34, defpackage.nzw r35) {
        /*
        r23 = this;
        r0 = r23;
        r1 = r24;
        r3 = r28;
        r4 = r30;
        r5 = r32;
        r7 = r0.A;
        r9 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 != 0) goto L_0x0017;
    L_0x0015:
        r0.A = r1;
    L_0x0017:
        r7 = 1;
        if (r34 != 0) goto L_0x018e;
    L_0x001a:
        r11 = r5 - r1;
        r8 = r0.w;
        r13 = r0.x;
        r14 = 0;
        if (r8 != r13) goto L_0x002e;
    L_0x0023:
        r1 = defpackage.ozz.f(r11);
        if (r1 == 0) goto L_0x002d;
    L_0x0029:
        r0.a(r3, r4);
        return r7;
    L_0x002d:
        return r14;
    L_0x002e:
        r15 = android.os.SystemClock.elapsedRealtime();
        r17 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r15 = r15 * r17;
        r8 = r0.c;
        r13 = r0.z;
        r9 = 21;
        if (r13 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0054;
    L_0x003f:
        r10 = 2;
        if (r8 != r10) goto L_0x018c;
    L_0x0042:
        r7 = r0.G;
        r7 = r15 - r7;
        r10 = defpackage.ozz.f(r11);
        if (r10 == 0) goto L_0x0068;
    L_0x004c:
        r19 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        r10 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1));
        if (r10 > 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0068;
    L_0x0054:
        r1 = java.lang.System.nanoTime();
        r23.C();
        r5 = defpackage.ozp.a;
        if (r5 < r9) goto L_0x0063;
    L_0x005f:
        r0.a(r3, r4, r1);
        goto L_0x0066;
    L_0x0063:
        r0.b(r3, r4);
    L_0x0066:
        r1 = 1;
        return r1;
    L_0x0068:
        r7 = r0.A;
        r10 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r10 == 0) goto L_0x018c;
    L_0x006e:
        r7 = java.lang.System.nanoTime();
        r15 = r15 - r26;
        r11 = r11 - r15;
        r11 = r11 * r17;
        r11 = r11 + r7;
        r10 = r0.n;
        r14 = r5 * r17;
        r13 = r10.i;
        if (r13 == 0) goto L_0x00c2;
    L_0x0080:
        r1 = r10.f;
        r13 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r13 == 0) goto L_0x0092;
    L_0x0086:
        r1 = r10.l;
        r19 = 1;
        r1 = r1 + r19;
        r10.l = r1;
        r1 = r10.h;
        r10.g = r1;
    L_0x0092:
        r1 = r10.l;
        r19 = 6;
        r13 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1));
        if (r13 < 0) goto L_0x00b9;
    L_0x009a:
        r3 = r10.k;
        r3 = r14 - r3;
        r3 = r3 / r1;
        r1 = r10.g;
        r1 = r1 + r3;
        r3 = r10.a(r1, r11);
        if (r3 == 0) goto L_0x00ac;
    L_0x00a8:
        r3 = 0;
        r10.i = r3;
        goto L_0x00c2;
    L_0x00ac:
        r3 = r10.j;
        r3 = r3 + r1;
        r26 = r1;
        r1 = r10.k;
        r1 = r3 - r1;
        r3 = r1;
        r1 = r26;
        goto L_0x00c4;
    L_0x00b9:
        r1 = r10.a(r14, r11);
        if (r1 == 0) goto L_0x00c2;
    L_0x00bf:
        r1 = 0;
        r10.i = r1;
    L_0x00c2:
        r3 = r11;
        r1 = r14;
    L_0x00c4:
        r13 = r10.i;
        if (r13 != 0) goto L_0x00d3;
    L_0x00c8:
        r10.k = r14;
        r10.j = r11;
        r11 = 0;
        r10.l = r11;
        r11 = 1;
        r10.i = r11;
    L_0x00d3:
        r10.f = r5;
        r10.h = r1;
        r1 = r10.b;
        if (r1 == 0) goto L_0x010e;
    L_0x00db:
        r5 = r10.d;
        r11 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r2 == 0) goto L_0x010e;
    L_0x00e6:
        r1 = r1.a;
        r5 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1));
        if (r5 == 0) goto L_0x010e;
    L_0x00ec:
        r5 = r10.d;
        r11 = r3 - r1;
        r11 = r11 / r5;
        r11 = r11 * r5;
        r1 = r1 + r11;
        r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r11 > 0) goto L_0x0100;
    L_0x00f8:
        r5 = r1 - r5;
        r21 = r1;
        r1 = r5;
        r5 = r21;
        goto L_0x0101;
    L_0x0100:
        r5 = r5 + r1;
    L_0x0101:
        r11 = r5 - r3;
        r3 = r3 - r1;
        r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1));
        if (r13 >= 0) goto L_0x0109;
    L_0x0108:
        goto L_0x010a;
    L_0x0109:
        r5 = r1;
    L_0x010a:
        r1 = r10.e;
        r3 = r5 - r1;
    L_0x010e:
        r1 = r3 - r7;
        r1 = r1 / r17;
        r5 = -500000; // 0xfffffffffff85ee0 float:NaN double:NaN;
        r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r7 < 0) goto L_0x011a;
    L_0x0119:
        goto L_0x0133;
    L_0x011a:
        r5 = r23.b(r24);
        if (r5 == 0) goto L_0x0133;
    L_0x0120:
        r1 = r0.j;
        r2 = r1.i;
        r3 = 1;
        r2 = r2 + r3;
        r1.i = r2;
        r1 = r0.F;
        r1 = r1 + r5;
        r0.b(r1);
        r23.A();
        r1 = 0;
        return r1;
    L_0x0133:
        r5 = defpackage.ozz.f(r1);
        if (r5 != 0) goto L_0x017c;
    L_0x0139:
        r5 = defpackage.ozp.a;
        if (r5 < r9) goto L_0x0150;
    L_0x013d:
        r5 = 50000; // 0xc350 float:7.0065E-41 double:2.47033E-319;
        r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r7 >= 0) goto L_0x017a;
    L_0x0144:
        r23.C();
        r5 = r28;
        r6 = r30;
        r0.a(r5, r6, r3);
        r1 = 1;
        return r1;
    L_0x0150:
        r5 = r28;
        r6 = r30;
        r3 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r7 >= 0) goto L_0x017a;
    L_0x015a:
        r3 = 11000; // 0x2af8 float:1.5414E-41 double:5.4347E-320;
        r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r7 <= 0) goto L_0x0172;
    L_0x0160:
        r3 = -10000; // 0xffffffffffffd8f0 float:NaN double:NaN;
        r1 = r1 + r3;
        r1 = r1 / r17;
        java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x0169 }
        goto L_0x0172;
    L_0x0169:
        r1 = java.lang.Thread.currentThread();
        r1.interrupt();
        r1 = 0;
        return r1;
    L_0x0172:
        r23.C();
        r0.b(r5, r6);
        r2 = 1;
        return r2;
    L_0x017a:
        r1 = 0;
        return r1;
    L_0x017c:
        r5 = r28;
        r6 = r30;
        r1 = 0;
        r2 = 1;
        r5.releaseOutputBuffer(r6, r1);
        defpackage.ozn.a();
        r0.b(r2);
        return r2;
    L_0x018c:
        r1 = 0;
        return r1;
    L_0x018e:
        r5 = r3;
        r6 = r4;
        r2 = 1;
        r0.a(r5, r6);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozz.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, nzw):boolean");
    }

    private final void a(MediaCodec mediaCodec, int i, int i2) {
        this.J = i;
        this.K = i2;
        this.M = this.I;
        if (ozp.a >= 21) {
            i = this.H;
            if (i == 90 || i == 270) {
                i = this.J;
                this.J = this.K;
                this.K = i;
                this.M = 1.0f / this.M;
            }
        } else {
            this.L = this.H;
        }
        mediaCodec.setVideoScalingMode(this.y);
    }

    private final void C() {
        pae pae = this.W;
        if (pae != null) {
            pae.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(long j) {
        nzw d = d(j);
        if (d != null) {
            a(this.g, d.n, d.o);
        }
        H();
        F();
        c(j);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(long j) {
        this.F--;
        while (true) {
            int i = this.V;
            if (i != 0 && j >= this.t[0]) {
                long[] jArr = this.s;
                this.U = jArr[0];
                i--;
                this.V = i;
                System.arraycopy(jArr, 1, jArr, 0, i);
                long[] jArr2 = this.t;
                System.arraycopy(jArr2, 1, jArr2, 0, this.V);
            } else {
                return;
            }
        }
    }

    private final void a(MediaCodec mediaCodec, int i) {
        mediaCodec.releaseOutputBuffer(i, false);
        ozn.a();
        odk odk = this.j;
        odk.f++;
    }

    private final void b(int i) {
        odk odk = this.j;
        odk.g += i;
        this.D += i;
        int i2 = this.E + i;
        this.E = i2;
        odk.h = Math.max(i2, odk.h);
        i = this.q;
        if (i > 0 && this.D >= i) {
            J();
        }
    }

    private final void b(MediaCodec mediaCodec, int i) {
        H();
        mediaCodec.releaseOutputBuffer(i, true);
        ozn.a();
        this.G = SystemClock.elapsedRealtime() * 1000;
        odk odk = this.j;
        odk.e++;
        this.E = 0;
        F();
    }

    private final void a(MediaCodec mediaCodec, int i, long j) {
        H();
        mediaCodec.releaseOutputBuffer(i, j);
        ozn.a();
        this.G = SystemClock.elapsedRealtime() * 1000;
        odk odk = this.j;
        odk.e++;
        this.E = 0;
        F();
    }

    private final boolean b(okq okq) {
        boolean z = false;
        if (!(ozp.a < 23 || this.R || a(okq.a))) {
            if (!okq.d) {
                z = true;
            } else if (ozy.a(this.m)) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    private final void D() {
        this.B = this.p > 0 ? SystemClock.elapsedRealtime() + this.p : -9223372036854775807L;
    }

    private final void E() {
        this.z = false;
        if (ozp.a >= 23 && this.R) {
            MediaCodec mediaCodec = this.g;
            if (mediaCodec != null) {
                this.e = new pab(this, mediaCodec);
            }
        }
    }

    private final void F() {
        if (!this.z) {
            this.z = true;
            this.o.a(this.w);
        }
    }

    private final void G() {
        this.N = -1;
        this.O = -1;
        this.Q = -1.0f;
        this.P = -1;
    }

    private final void H() {
        int i = this.J;
        if (i != -1 || this.K != -1) {
            if (this.N != i || this.O != this.K || this.P != this.L || this.Q != this.M) {
                this.o.a(i, this.K, this.L, this.M);
                this.N = this.J;
                this.O = this.K;
                this.P = this.L;
                this.Q = this.M;
            }
        }
    }

    private final void I() {
        int i = this.N;
        if (i != -1 || this.O != -1) {
            this.o.a(i, this.O, this.P, this.Q);
        }
    }

    private final void J() {
        if (this.D > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.o.a(this.D, elapsedRealtime - this.C);
            this.D = 0;
            this.C = elapsedRealtime;
        }
    }

    private static int a(okq okq, nzw nzw) {
        if (nzw.j == -1) {
            return ozz.a(okq, nzw.i, nzw.n, nzw.o);
        }
        int i = 0;
        for (int i2 = 0; i2 < nzw.k.size(); i2++) {
            i += ((byte[]) nzw.k.get(i2)).length;
        }
        return nzw.j + i;
    }

    /* JADX WARNING: Missing block: B:41:0x008a, code skipped:
            if (r7.d != false) goto L_0x009b;
     */
    private static int a(defpackage.okq r7, java.lang.String r8, int r9, int r10) {
        /*
        r0 = -1;
        if (r9 == r0) goto L_0x00a3;
    L_0x0003:
        if (r10 == r0) goto L_0x00a3;
    L_0x0005:
        r1 = r8.hashCode();
        r2 = 5;
        r3 = 1;
        r4 = 4;
        r5 = 3;
        r6 = 2;
        switch(r1) {
            case -1664118616: goto L_0x0044;
            case -1662541442: goto L_0x003a;
            case 1187890754: goto L_0x0030;
            case 1331836730: goto L_0x0026;
            case 1599127256: goto L_0x001c;
            case 1599127257: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x004e;
    L_0x0012:
        r1 = "video/x-vnd.on2.vp9";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x004e;
    L_0x001a:
        r8 = 5;
        goto L_0x004f;
    L_0x001c:
        r1 = "video/x-vnd.on2.vp8";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x004e;
    L_0x0024:
        r8 = 3;
        goto L_0x004f;
    L_0x0026:
        r1 = "video/avc";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x004e;
    L_0x002e:
        r8 = 2;
        goto L_0x004f;
    L_0x0030:
        r1 = "video/mp4v-es";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x004e;
    L_0x0038:
        r8 = 1;
        goto L_0x004f;
    L_0x003a:
        r1 = "video/hevc";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x004e;
    L_0x0042:
        r8 = 4;
        goto L_0x004f;
    L_0x0044:
        r1 = "video/3gpp";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x004e;
    L_0x004c:
        r8 = 0;
        goto L_0x004f;
    L_0x004e:
        r8 = -1;
    L_0x004f:
        if (r8 == 0) goto L_0x009c;
    L_0x0051:
        if (r8 == r3) goto L_0x009c;
    L_0x0053:
        if (r8 == r6) goto L_0x0060;
    L_0x0055:
        if (r8 == r5) goto L_0x009c;
    L_0x0057:
        if (r8 == r4) goto L_0x005c;
    L_0x0059:
        if (r8 == r2) goto L_0x005c;
    L_0x005b:
        return r0;
    L_0x005c:
        r9 = r9 * r10;
        r6 = 4;
        goto L_0x009e;
    L_0x0060:
        r8 = defpackage.ozp.d;
        r1 = "BRAVIA 4K 2015";
        r8 = r1.equals(r8);
        if (r8 != 0) goto L_0x009b;
    L_0x006a:
        r8 = defpackage.ozp.c;
        r1 = "Amazon";
        r8 = r1.equals(r8);
        if (r8 == 0) goto L_0x008c;
    L_0x0074:
        r8 = defpackage.ozp.d;
        r1 = "KFSOWI";
        r8 = r1.equals(r8);
        if (r8 != 0) goto L_0x009b;
    L_0x007e:
        r8 = defpackage.ozp.d;
        r1 = "AFTS";
        r8 = r1.equals(r8);
        if (r8 == 0) goto L_0x008c;
    L_0x0088:
        r7 = r7.d;
        if (r7 != 0) goto L_0x009b;
    L_0x008c:
        r7 = 16;
        r8 = defpackage.ozp.a(r9, r7);
        r7 = defpackage.ozp.a(r10, r7);
        r8 = r8 * r7;
        r9 = r8 << 8;
        goto L_0x009e;
    L_0x009b:
        return r0;
    L_0x009c:
        r9 = r9 * r10;
    L_0x009e:
        r9 = r9 * 3;
        r6 = r6 + r6;
        r9 = r9 / r6;
        return r9;
    L_0x00a3:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozz.a(okq, java.lang.String, int, int):int");
    }

    /* Access modifiers changed, original: protected */
    public boolean a(java.lang.String r7) {
        /*
        r6 = this;
        r0 = "OMX.google";
        r7 = r7.startsWith(r0);
        r0 = 0;
        if (r7 != 0) goto L_0x072a;
    L_0x0009:
        r7 = defpackage.ozz.class;
        monitor-enter(r7);
        r1 = k;	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0723;
    L_0x0010:
        r1 = defpackage.ozp.a;	 Catch:{ all -> 0x0727 }
        r2 = 27;
        r3 = 1;
        if (r1 > r2) goto L_0x002f;
    L_0x0017:
        r1 = "dangal";
        r4 = defpackage.ozp.b;	 Catch:{ all -> 0x0727 }
        r1 = r1.equals(r4);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x002b;
    L_0x0021:
        r1 = "HWEML";
        r4 = defpackage.ozp.b;	 Catch:{ all -> 0x0727 }
        r1 = r1.equals(r4);	 Catch:{ all -> 0x0727 }
        if (r1 == 0) goto L_0x002f;
    L_0x002b:
        l = r3;	 Catch:{ all -> 0x0727 }
        goto L_0x0721;
    L_0x002f:
        r1 = defpackage.ozp.a;	 Catch:{ all -> 0x0727 }
        if (r1 >= r2) goto L_0x0721;
    L_0x0033:
        r1 = defpackage.ozp.b;	 Catch:{ all -> 0x0727 }
        r4 = r1.hashCode();	 Catch:{ all -> 0x0727 }
        r5 = -1;
        switch(r4) {
            case -2144781245: goto L_0x06e2;
            case -2144781185: goto L_0x06d5;
            case -2144781160: goto L_0x06c8;
            case -2097309513: goto L_0x06bb;
            case -2022874474: goto L_0x06ae;
            case -1978993182: goto L_0x06a1;
            case -1978990237: goto L_0x0694;
            case -1936688988: goto L_0x0687;
            case -1936688066: goto L_0x0679;
            case -1936688065: goto L_0x066b;
            case -1931988508: goto L_0x065d;
            case -1696512866: goto L_0x064f;
            case -1680025915: goto L_0x0641;
            case -1615810839: goto L_0x0633;
            case -1554255044: goto L_0x0625;
            case -1481772737: goto L_0x0617;
            case -1481772730: goto L_0x0609;
            case -1481772729: goto L_0x05fb;
            case -1320080169: goto L_0x05ed;
            case -1217592143: goto L_0x05df;
            case -1180384755: goto L_0x05d1;
            case -1139198265: goto L_0x05c3;
            case -1052835013: goto L_0x05b5;
            case -993250464: goto L_0x05a8;
            case -965403638: goto L_0x059a;
            case -958336948: goto L_0x058c;
            case -879245230: goto L_0x057e;
            case -842500323: goto L_0x0570;
            case -821392978: goto L_0x0563;
            case -797483286: goto L_0x0555;
            case -794946968: goto L_0x0547;
            case -788334647: goto L_0x0539;
            case -782144577: goto L_0x052b;
            case -575125681: goto L_0x051d;
            case -521118391: goto L_0x050f;
            case -430914369: goto L_0x0501;
            case -290434366: goto L_0x04f3;
            case -282781963: goto L_0x04e5;
            case -277133239: goto L_0x04d7;
            case -173639913: goto L_0x04c9;
            case -56598463: goto L_0x04bb;
            case 2126: goto L_0x04ad;
            case 2564: goto L_0x049f;
            case 2715: goto L_0x0491;
            case 2719: goto L_0x0483;
            case 3483: goto L_0x0475;
            case 73405: goto L_0x0467;
            case 75739: goto L_0x0459;
            case 76779: goto L_0x044b;
            case 78669: goto L_0x043d;
            case 79305: goto L_0x042f;
            case 80618: goto L_0x0421;
            case 88274: goto L_0x0413;
            case 98846: goto L_0x0405;
            case 98848: goto L_0x03f7;
            case 99329: goto L_0x03e9;
            case 101481: goto L_0x03db;
            case 1513190: goto L_0x03ce;
            case 1514184: goto L_0x03c1;
            case 1514185: goto L_0x03b4;
            case 2436959: goto L_0x03a6;
            case 2463773: goto L_0x0398;
            case 2464648: goto L_0x038a;
            case 2689555: goto L_0x037c;
            case 3154429: goto L_0x036e;
            case 3284551: goto L_0x0360;
            case 3351335: goto L_0x0352;
            case 3386211: goto L_0x0344;
            case 41325051: goto L_0x0336;
            case 55178625: goto L_0x0328;
            case 61542055: goto L_0x031b;
            case 65355429: goto L_0x030d;
            case 66214468: goto L_0x02ff;
            case 66214470: goto L_0x02f1;
            case 66214473: goto L_0x02e3;
            case 66215429: goto L_0x02d5;
            case 66215431: goto L_0x02c7;
            case 66215433: goto L_0x02b9;
            case 66216390: goto L_0x02ab;
            case 76402249: goto L_0x029d;
            case 76404105: goto L_0x028f;
            case 76404911: goto L_0x0281;
            case 80963634: goto L_0x0273;
            case 82882791: goto L_0x0265;
            case 98715550: goto L_0x0257;
            case 102844228: goto L_0x0249;
            case 165221241: goto L_0x023c;
            case 182191441: goto L_0x022e;
            case 245388979: goto L_0x0220;
            case 287431619: goto L_0x0212;
            case 307593612: goto L_0x0204;
            case 308517133: goto L_0x01f6;
            case 316215098: goto L_0x01e8;
            case 316215116: goto L_0x01da;
            case 316246811: goto L_0x01cc;
            case 316246818: goto L_0x01be;
            case 407160593: goto L_0x01b0;
            case 507412548: goto L_0x01a2;
            case 793982701: goto L_0x0194;
            case 794038622: goto L_0x0186;
            case 794040393: goto L_0x0178;
            case 835649806: goto L_0x016a;
            case 917340916: goto L_0x015d;
            case 958008161: goto L_0x014f;
            case 1060579533: goto L_0x0141;
            case 1150207623: goto L_0x0133;
            case 1176899427: goto L_0x0125;
            case 1280332038: goto L_0x0117;
            case 1306947716: goto L_0x0109;
            case 1349174697: goto L_0x00fb;
            case 1522194893: goto L_0x00ed;
            case 1691543273: goto L_0x00df;
            case 1709443163: goto L_0x00d1;
            case 1865889110: goto L_0x00c3;
            case 1906253259: goto L_0x00b5;
            case 1977196784: goto L_0x00a8;
            case 2006372676: goto L_0x009b;
            case 2029784656: goto L_0x008e;
            case 2030379515: goto L_0x0081;
            case 2033393791: goto L_0x0074;
            case 2047190025: goto L_0x0067;
            case 2047252157: goto L_0x005a;
            case 2048319463: goto L_0x004d;
            case 2048855701: goto L_0x0040;
            default: goto L_0x003d;
        };	 Catch:{ all -> 0x0727 }
    L_0x003d:
        r1 = -1;
        goto L_0x06ee;
    L_0x0040:
        r2 = "HWWAS-H";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0049;
    L_0x0048:
        goto L_0x003d;
    L_0x0049:
        r1 = 54;
        goto L_0x06ee;
    L_0x004d:
        r2 = "HWVNS-H";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0056;
    L_0x0055:
        goto L_0x003d;
    L_0x0056:
        r1 = 53;
        goto L_0x06ee;
    L_0x005a:
        r4 = "ELUGA_Prim";
        r1 = r1.equals(r4);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0063;
    L_0x0062:
        goto L_0x003d;
    L_0x0063:
        r1 = 27;
        goto L_0x06ee;
    L_0x0067:
        r2 = "ELUGA_Note";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0070;
    L_0x006f:
        goto L_0x003d;
    L_0x0070:
        r1 = 26;
        goto L_0x06ee;
    L_0x0074:
        r2 = "ASUS_X00AD_2";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x007d;
    L_0x007c:
        goto L_0x003d;
    L_0x007d:
        r1 = 11;
        goto L_0x06ee;
    L_0x0081:
        r2 = "HWCAM-H";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x008a;
    L_0x0089:
        goto L_0x003d;
    L_0x008a:
        r1 = 52;
        goto L_0x06ee;
    L_0x008e:
        r2 = "HWBLN-H";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0097;
    L_0x0096:
        goto L_0x003d;
    L_0x0097:
        r1 = 51;
        goto L_0x06ee;
    L_0x009b:
        r2 = "BRAVIA_ATV3_4K";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x003d;
    L_0x00a4:
        r1 = 15;
        goto L_0x06ee;
    L_0x00a8:
        r2 = "Infinix-X572";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x00b1;
    L_0x00b0:
        goto L_0x003d;
    L_0x00b1:
        r1 = 57;
        goto L_0x06ee;
    L_0x00b5:
        r2 = "PB2-670M";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x00bf;
    L_0x00bd:
        goto L_0x003d;
    L_0x00bf:
        r1 = 85;
        goto L_0x06ee;
    L_0x00c3:
        r2 = "santoni";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x00cd;
    L_0x00cb:
        goto L_0x003d;
    L_0x00cd:
        r1 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x06ee;
    L_0x00d1:
        r2 = "iball8735_9806";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x00db;
    L_0x00d9:
        goto L_0x003d;
    L_0x00db:
        r1 = 56;
        goto L_0x06ee;
    L_0x00df:
        r2 = "CPH1609";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x00e9;
    L_0x00e7:
        goto L_0x003d;
    L_0x00e9:
        r1 = 19;
        goto L_0x06ee;
    L_0x00ed:
        r2 = "woods_f";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x00f7;
    L_0x00f5:
        goto L_0x003d;
    L_0x00f7:
        r1 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        goto L_0x06ee;
    L_0x00fb:
        r2 = "htc_e56ml_dtul";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0105;
    L_0x0103:
        goto L_0x003d;
    L_0x0105:
        r1 = 49;
        goto L_0x06ee;
    L_0x0109:
        r2 = "EverStar_S";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0113;
    L_0x0111:
        goto L_0x003d;
    L_0x0113:
        r1 = 29;
        goto L_0x06ee;
    L_0x0117:
        r2 = "hwALE-H";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0121;
    L_0x011f:
        goto L_0x003d;
    L_0x0121:
        r1 = 50;
        goto L_0x06ee;
    L_0x0125:
        r2 = "itel_S41";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x012f;
    L_0x012d:
        goto L_0x003d;
    L_0x012f:
        r1 = 59;
        goto L_0x06ee;
    L_0x0133:
        r2 = "LS-5017";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x013d;
    L_0x013b:
        goto L_0x003d;
    L_0x013d:
        r1 = 65;
        goto L_0x06ee;
    L_0x0141:
        r2 = "panell_d";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x014b;
    L_0x0149:
        goto L_0x003d;
    L_0x014b:
        r1 = 81;
        goto L_0x06ee;
    L_0x014f:
        r2 = "j2xlteins";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0159;
    L_0x0157:
        goto L_0x003d;
    L_0x0159:
        r1 = 60;
        goto L_0x06ee;
    L_0x015d:
        r2 = "A7000plus";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0167;
    L_0x0165:
        goto L_0x003d;
    L_0x0167:
        r1 = 7;
        goto L_0x06ee;
    L_0x016a:
        r2 = "manning";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0174;
    L_0x0172:
        goto L_0x003d;
    L_0x0174:
        r1 = 67;
        goto L_0x06ee;
    L_0x0178:
        r2 = "GIONEE_WBL7519";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0182;
    L_0x0180:
        goto L_0x003d;
    L_0x0182:
        r1 = 47;
        goto L_0x06ee;
    L_0x0186:
        r2 = "GIONEE_WBL7365";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0190;
    L_0x018e:
        goto L_0x003d;
    L_0x0190:
        r1 = 46;
        goto L_0x06ee;
    L_0x0194:
        r2 = "GIONEE_WBL5708";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x019e;
    L_0x019c:
        goto L_0x003d;
    L_0x019e:
        r1 = 45;
        goto L_0x06ee;
    L_0x01a2:
        r2 = "QM16XE_U";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x01ac;
    L_0x01aa:
        goto L_0x003d;
    L_0x01ac:
        r1 = 99;
        goto L_0x06ee;
    L_0x01b0:
        r2 = "Pixi5-10_4G";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x01ba;
    L_0x01b8:
        goto L_0x003d;
    L_0x01ba:
        r1 = 91;
        goto L_0x06ee;
    L_0x01be:
        r2 = "TB3-850M";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x01c8;
    L_0x01c6:
        goto L_0x003d;
    L_0x01c8:
        r1 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        goto L_0x06ee;
    L_0x01cc:
        r2 = "TB3-850F";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x01d6;
    L_0x01d4:
        goto L_0x003d;
    L_0x01d6:
        r1 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        goto L_0x06ee;
    L_0x01da:
        r2 = "TB3-730X";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x01e4;
    L_0x01e2:
        goto L_0x003d;
    L_0x01e4:
        r1 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        goto L_0x06ee;
    L_0x01e8:
        r2 = "TB3-730F";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x01f2;
    L_0x01f0:
        goto L_0x003d;
    L_0x01f2:
        r1 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        goto L_0x06ee;
    L_0x01f6:
        r2 = "A7020a48";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0200;
    L_0x01fe:
        goto L_0x003d;
    L_0x0200:
        r1 = 9;
        goto L_0x06ee;
    L_0x0204:
        r2 = "A7010a48";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x020e;
    L_0x020c:
        goto L_0x003d;
    L_0x020e:
        r1 = 8;
        goto L_0x06ee;
    L_0x0212:
        r2 = "griffin";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x021c;
    L_0x021a:
        goto L_0x003d;
    L_0x021c:
        r1 = 48;
        goto L_0x06ee;
    L_0x0220:
        r2 = "marino_f";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x022a;
    L_0x0228:
        goto L_0x003d;
    L_0x022a:
        r1 = 68;
        goto L_0x06ee;
    L_0x022e:
        r2 = "CPY83_I00";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0238;
    L_0x0236:
        goto L_0x003d;
    L_0x0238:
        r1 = 20;
        goto L_0x06ee;
    L_0x023c:
        r2 = "A2016a40";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0246;
    L_0x0244:
        goto L_0x003d;
    L_0x0246:
        r1 = 5;
        goto L_0x06ee;
    L_0x0249:
        r2 = "le_x6";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0253;
    L_0x0251:
        goto L_0x003d;
    L_0x0253:
        r1 = 64;
        goto L_0x06ee;
    L_0x0257:
        r2 = "i9031";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0261;
    L_0x025f:
        goto L_0x003d;
    L_0x0261:
        r1 = 55;
        goto L_0x06ee;
    L_0x0265:
        r2 = "X3_HK";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x026f;
    L_0x026d:
        goto L_0x003d;
    L_0x026f:
        r1 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        goto L_0x06ee;
    L_0x0273:
        r2 = "V23GB";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x027d;
    L_0x027b:
        goto L_0x003d;
    L_0x027d:
        r1 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        goto L_0x06ee;
    L_0x0281:
        r2 = "Q4310";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x028b;
    L_0x0289:
        goto L_0x003d;
    L_0x028b:
        r1 = 97;
        goto L_0x06ee;
    L_0x028f:
        r2 = "Q4260";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0299;
    L_0x0297:
        goto L_0x003d;
    L_0x0299:
        r1 = 95;
        goto L_0x06ee;
    L_0x029d:
        r2 = "PRO7S";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x02a7;
    L_0x02a5:
        goto L_0x003d;
    L_0x02a7:
        r1 = 93;
        goto L_0x06ee;
    L_0x02ab:
        r2 = "F3311";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x02b5;
    L_0x02b3:
        goto L_0x003d;
    L_0x02b5:
        r1 = 36;
        goto L_0x06ee;
    L_0x02b9:
        r2 = "F3215";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x02c3;
    L_0x02c1:
        goto L_0x003d;
    L_0x02c3:
        r1 = 35;
        goto L_0x06ee;
    L_0x02c7:
        r2 = "F3213";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x02d1;
    L_0x02cf:
        goto L_0x003d;
    L_0x02d1:
        r1 = 34;
        goto L_0x06ee;
    L_0x02d5:
        r2 = "F3211";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x02df;
    L_0x02dd:
        goto L_0x003d;
    L_0x02df:
        r1 = 33;
        goto L_0x06ee;
    L_0x02e3:
        r2 = "F3116";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x02ed;
    L_0x02eb:
        goto L_0x003d;
    L_0x02ed:
        r1 = 32;
        goto L_0x06ee;
    L_0x02f1:
        r2 = "F3113";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x02fb;
    L_0x02f9:
        goto L_0x003d;
    L_0x02fb:
        r1 = 31;
        goto L_0x06ee;
    L_0x02ff:
        r2 = "F3111";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0309;
    L_0x0307:
        goto L_0x003d;
    L_0x0309:
        r1 = 30;
        goto L_0x06ee;
    L_0x030d:
        r2 = "E5643";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0317;
    L_0x0315:
        goto L_0x003d;
    L_0x0317:
        r1 = 24;
        goto L_0x06ee;
    L_0x031b:
        r2 = "A1601";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0325;
    L_0x0323:
        goto L_0x003d;
    L_0x0325:
        r1 = 4;
        goto L_0x06ee;
    L_0x0328:
        r2 = "Aura_Note_2";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0332;
    L_0x0330:
        goto L_0x003d;
    L_0x0332:
        r1 = 12;
        goto L_0x06ee;
    L_0x0336:
        r2 = "MEIZU_M5";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0340;
    L_0x033e:
        goto L_0x003d;
    L_0x0340:
        r1 = 69;
        goto L_0x06ee;
    L_0x0344:
        r2 = "p212";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x034e;
    L_0x034c:
        goto L_0x003d;
    L_0x034e:
        r1 = 78;
        goto L_0x06ee;
    L_0x0352:
        r2 = "mido";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x035c;
    L_0x035a:
        goto L_0x003d;
    L_0x035c:
        r1 = 71;
        goto L_0x06ee;
    L_0x0360:
        r2 = "kate";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x036a;
    L_0x0368:
        goto L_0x003d;
    L_0x036a:
        r1 = 63;
        goto L_0x06ee;
    L_0x036e:
        r2 = "fugu";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0378;
    L_0x0376:
        goto L_0x003d;
    L_0x0378:
        r1 = 38;
        goto L_0x06ee;
    L_0x037c:
        r2 = "XE2X";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0386;
    L_0x0384:
        goto L_0x003d;
    L_0x0386:
        r1 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        goto L_0x06ee;
    L_0x038a:
        r2 = "Q427";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0394;
    L_0x0392:
        goto L_0x003d;
    L_0x0394:
        r1 = 96;
        goto L_0x06ee;
    L_0x0398:
        r2 = "Q350";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x03a2;
    L_0x03a0:
        goto L_0x003d;
    L_0x03a2:
        r1 = 94;
        goto L_0x06ee;
    L_0x03a6:
        r2 = "P681";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x03b0;
    L_0x03ae:
        goto L_0x003d;
    L_0x03b0:
        r1 = 79;
        goto L_0x06ee;
    L_0x03b4:
        r2 = "1714";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x03be;
    L_0x03bc:
        goto L_0x003d;
    L_0x03be:
        r1 = 2;
        goto L_0x06ee;
    L_0x03c1:
        r2 = "1713";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x03cb;
    L_0x03c9:
        goto L_0x003d;
    L_0x03cb:
        r1 = 1;
        goto L_0x06ee;
    L_0x03ce:
        r2 = "1601";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x03d8;
    L_0x03d6:
        goto L_0x003d;
    L_0x03d8:
        r1 = 0;
        goto L_0x06ee;
    L_0x03db:
        r2 = "flo";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x03e5;
    L_0x03e3:
        goto L_0x003d;
    L_0x03e5:
        r1 = 37;
        goto L_0x06ee;
    L_0x03e9:
        r2 = "deb";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x03f3;
    L_0x03f1:
        goto L_0x003d;
    L_0x03f3:
        r1 = 23;
        goto L_0x06ee;
    L_0x03f7:
        r2 = "cv3";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0401;
    L_0x03ff:
        goto L_0x003d;
    L_0x0401:
        r1 = 22;
        goto L_0x06ee;
    L_0x0405:
        r2 = "cv1";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x040f;
    L_0x040d:
        goto L_0x003d;
    L_0x040f:
        r1 = 21;
        goto L_0x06ee;
    L_0x0413:
        r2 = "Z80";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x041d;
    L_0x041b:
        goto L_0x003d;
    L_0x041d:
        r1 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        goto L_0x06ee;
    L_0x0421:
        r2 = "QX1";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x042b;
    L_0x0429:
        goto L_0x003d;
    L_0x042b:
        r1 = 100;
        goto L_0x06ee;
    L_0x042f:
        r2 = "PLE";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0439;
    L_0x0437:
        goto L_0x003d;
    L_0x0439:
        r1 = 92;
        goto L_0x06ee;
    L_0x043d:
        r2 = "P85";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0447;
    L_0x0445:
        goto L_0x003d;
    L_0x0447:
        r1 = 80;
        goto L_0x06ee;
    L_0x044b:
        r2 = "MX6";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0455;
    L_0x0453:
        goto L_0x003d;
    L_0x0455:
        r1 = 72;
        goto L_0x06ee;
    L_0x0459:
        r2 = "M5c";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0463;
    L_0x0461:
        goto L_0x003d;
    L_0x0463:
        r1 = 66;
        goto L_0x06ee;
    L_0x0467:
        r2 = "JGZ";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0471;
    L_0x046f:
        goto L_0x003d;
    L_0x0471:
        r1 = 61;
        goto L_0x06ee;
    L_0x0475:
        r2 = "mh";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x047f;
    L_0x047d:
        goto L_0x003d;
    L_0x047f:
        r1 = 70;
        goto L_0x06ee;
    L_0x0483:
        r2 = "V5";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x048d;
    L_0x048b:
        goto L_0x003d;
    L_0x048d:
        r1 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        goto L_0x06ee;
    L_0x0491:
        r2 = "V1";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x049b;
    L_0x0499:
        goto L_0x003d;
    L_0x049b:
        r1 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        goto L_0x06ee;
    L_0x049f:
        r2 = "Q5";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x04a9;
    L_0x04a7:
        goto L_0x003d;
    L_0x04a9:
        r1 = 98;
        goto L_0x06ee;
    L_0x04ad:
        r2 = "C1";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x04b7;
    L_0x04b5:
        goto L_0x003d;
    L_0x04b7:
        r1 = 16;
        goto L_0x06ee;
    L_0x04bb:
        r2 = "woods_fn";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x04c5;
    L_0x04c3:
        goto L_0x003d;
    L_0x04c5:
        r1 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        goto L_0x06ee;
    L_0x04c9:
        r2 = "ELUGA_A3_Pro";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x04d3;
    L_0x04d1:
        goto L_0x003d;
    L_0x04d3:
        r1 = 25;
        goto L_0x06ee;
    L_0x04d7:
        r2 = "Z12_PRO";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x04e1;
    L_0x04df:
        goto L_0x003d;
    L_0x04e1:
        r1 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        goto L_0x06ee;
    L_0x04e5:
        r2 = "BLACK-1X";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x04ef;
    L_0x04ed:
        goto L_0x003d;
    L_0x04ef:
        r1 = 13;
        goto L_0x06ee;
    L_0x04f3:
        r2 = "taido_row";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x04fd;
    L_0x04fb:
        goto L_0x003d;
    L_0x04fd:
        r1 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        goto L_0x06ee;
    L_0x0501:
        r2 = "Pixi4-7_3G";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x050b;
    L_0x0509:
        goto L_0x003d;
    L_0x050b:
        r1 = 90;
        goto L_0x06ee;
    L_0x050f:
        r2 = "GIONEE_GBL7360";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0519;
    L_0x0517:
        goto L_0x003d;
    L_0x0519:
        r1 = 41;
        goto L_0x06ee;
    L_0x051d:
        r2 = "GiONEE_CBL7513";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0527;
    L_0x0525:
        goto L_0x003d;
    L_0x0527:
        r1 = 39;
        goto L_0x06ee;
    L_0x052b:
        r2 = "OnePlus5T";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0535;
    L_0x0533:
        goto L_0x003d;
    L_0x0535:
        r1 = 77;
        goto L_0x06ee;
    L_0x0539:
        r2 = "whyred";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0543;
    L_0x0541:
        goto L_0x003d;
    L_0x0543:
        r1 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        goto L_0x06ee;
    L_0x0547:
        r2 = "watson";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0551;
    L_0x054f:
        goto L_0x003d;
    L_0x0551:
        r1 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x06ee;
    L_0x0555:
        r2 = "SVP-DTV15";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x055f;
    L_0x055d:
        goto L_0x003d;
    L_0x055f:
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        goto L_0x06ee;
    L_0x0563:
        r2 = "A7000-a";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x056d;
    L_0x056b:
        goto L_0x003d;
    L_0x056d:
        r1 = 6;
        goto L_0x06ee;
    L_0x0570:
        r2 = "nicklaus_f";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x057a;
    L_0x0578:
        goto L_0x003d;
    L_0x057a:
        r1 = 74;
        goto L_0x06ee;
    L_0x057e:
        r2 = "tcl_eu";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0588;
    L_0x0586:
        goto L_0x003d;
    L_0x0588:
        r1 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        goto L_0x06ee;
    L_0x058c:
        r2 = "ELUGA_Ray_X";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0596;
    L_0x0594:
        goto L_0x003d;
    L_0x0596:
        r1 = 28;
        goto L_0x06ee;
    L_0x059a:
        r2 = "s905x018";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x05a4;
    L_0x05a2:
        goto L_0x003d;
    L_0x05a4:
        r1 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        goto L_0x06ee;
    L_0x05a8:
        r2 = "A10-70F";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x05b2;
    L_0x05b0:
        goto L_0x003d;
    L_0x05b2:
        r1 = 3;
        goto L_0x06ee;
    L_0x05b5:
        r2 = "namath";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x05bf;
    L_0x05bd:
        goto L_0x003d;
    L_0x05bf:
        r1 = 73;
        goto L_0x06ee;
    L_0x05c3:
        r2 = "Slate_Pro";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x05cd;
    L_0x05cb:
        goto L_0x003d;
    L_0x05cd:
        r1 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        goto L_0x06ee;
    L_0x05d1:
        r2 = "iris60";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x05db;
    L_0x05d9:
        goto L_0x003d;
    L_0x05db:
        r1 = 58;
        goto L_0x06ee;
    L_0x05df:
        r2 = "BRAVIA_ATV2";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x05e9;
    L_0x05e7:
        goto L_0x003d;
    L_0x05e9:
        r1 = 14;
        goto L_0x06ee;
    L_0x05ed:
        r2 = "GiONEE_GBL7319";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x05f7;
    L_0x05f5:
        goto L_0x003d;
    L_0x05f7:
        r1 = 40;
        goto L_0x06ee;
    L_0x05fb:
        r2 = "panell_dt";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0605;
    L_0x0603:
        goto L_0x003d;
    L_0x0605:
        r1 = 84;
        goto L_0x06ee;
    L_0x0609:
        r2 = "panell_ds";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0613;
    L_0x0611:
        goto L_0x003d;
    L_0x0613:
        r1 = 83;
        goto L_0x06ee;
    L_0x0617:
        r2 = "panell_dl";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0621;
    L_0x061f:
        goto L_0x003d;
    L_0x0621:
        r1 = 82;
        goto L_0x06ee;
    L_0x0625:
        r2 = "vernee_M5";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x062f;
    L_0x062d:
        goto L_0x003d;
    L_0x062f:
        r1 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        goto L_0x06ee;
    L_0x0633:
        r2 = "Phantom6";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x063d;
    L_0x063b:
        goto L_0x003d;
    L_0x063d:
        r1 = 89;
        goto L_0x06ee;
    L_0x0641:
        r2 = "ComioS1";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x064b;
    L_0x0649:
        goto L_0x003d;
    L_0x064b:
        r1 = 17;
        goto L_0x06ee;
    L_0x064f:
        r2 = "XT1663";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0659;
    L_0x0657:
        goto L_0x003d;
    L_0x0659:
        r1 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        goto L_0x06ee;
    L_0x065d:
        r2 = "AquaPowerM";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0667;
    L_0x0665:
        goto L_0x003d;
    L_0x0667:
        r1 = 10;
        goto L_0x06ee;
    L_0x066b:
        r2 = "PGN611";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0675;
    L_0x0673:
        goto L_0x003d;
    L_0x0675:
        r1 = 88;
        goto L_0x06ee;
    L_0x0679:
        r2 = "PGN610";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0683;
    L_0x0681:
        goto L_0x003d;
    L_0x0683:
        r1 = 87;
        goto L_0x06ee;
    L_0x0687:
        r2 = "PGN528";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0691;
    L_0x068f:
        goto L_0x003d;
    L_0x0691:
        r1 = 86;
        goto L_0x06ee;
    L_0x0694:
        r2 = "NX573J";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x069e;
    L_0x069c:
        goto L_0x003d;
    L_0x069e:
        r1 = 76;
        goto L_0x06ee;
    L_0x06a1:
        r2 = "NX541J";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x06ab;
    L_0x06a9:
        goto L_0x003d;
    L_0x06ab:
        r1 = 75;
        goto L_0x06ee;
    L_0x06ae:
        r2 = "CP8676_I02";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x06b8;
    L_0x06b6:
        goto L_0x003d;
    L_0x06b8:
        r1 = 18;
        goto L_0x06ee;
    L_0x06bb:
        r2 = "K50a40";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x06c5;
    L_0x06c3:
        goto L_0x003d;
    L_0x06c5:
        r1 = 62;
        goto L_0x06ee;
    L_0x06c8:
        r2 = "GIONEE_SWW1631";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x06d2;
    L_0x06d0:
        goto L_0x003d;
    L_0x06d2:
        r1 = 44;
        goto L_0x06ee;
    L_0x06d5:
        r2 = "GIONEE_SWW1627";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x06df;
    L_0x06dd:
        goto L_0x003d;
    L_0x06df:
        r1 = 43;
        goto L_0x06ee;
    L_0x06e2:
        r2 = "GIONEE_SWW1609";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x06ec;
    L_0x06ea:
        goto L_0x003d;
    L_0x06ec:
        r1 = 42;
    L_0x06ee:
        switch(r1) {
            case 0: goto L_0x06f2;
            case 1: goto L_0x06f2;
            case 2: goto L_0x06f2;
            case 3: goto L_0x06f2;
            case 4: goto L_0x06f2;
            case 5: goto L_0x06f2;
            case 6: goto L_0x06f2;
            case 7: goto L_0x06f2;
            case 8: goto L_0x06f2;
            case 9: goto L_0x06f2;
            case 10: goto L_0x06f2;
            case 11: goto L_0x06f2;
            case 12: goto L_0x06f2;
            case 13: goto L_0x06f2;
            case 14: goto L_0x06f2;
            case 15: goto L_0x06f2;
            case 16: goto L_0x06f2;
            case 17: goto L_0x06f2;
            case 18: goto L_0x06f2;
            case 19: goto L_0x06f2;
            case 20: goto L_0x06f2;
            case 21: goto L_0x06f2;
            case 22: goto L_0x06f2;
            case 23: goto L_0x06f2;
            case 24: goto L_0x06f2;
            case 25: goto L_0x06f2;
            case 26: goto L_0x06f2;
            case 27: goto L_0x06f2;
            case 28: goto L_0x06f2;
            case 29: goto L_0x06f2;
            case 30: goto L_0x06f2;
            case 31: goto L_0x06f2;
            case 32: goto L_0x06f2;
            case 33: goto L_0x06f2;
            case 34: goto L_0x06f2;
            case 35: goto L_0x06f2;
            case 36: goto L_0x06f2;
            case 37: goto L_0x06f2;
            case 38: goto L_0x06f2;
            case 39: goto L_0x06f2;
            case 40: goto L_0x06f2;
            case 41: goto L_0x06f2;
            case 42: goto L_0x06f2;
            case 43: goto L_0x06f2;
            case 44: goto L_0x06f2;
            case 45: goto L_0x06f2;
            case 46: goto L_0x06f2;
            case 47: goto L_0x06f2;
            case 48: goto L_0x06f2;
            case 49: goto L_0x06f2;
            case 50: goto L_0x06f2;
            case 51: goto L_0x06f2;
            case 52: goto L_0x06f2;
            case 53: goto L_0x06f2;
            case 54: goto L_0x06f2;
            case 55: goto L_0x06f2;
            case 56: goto L_0x06f2;
            case 57: goto L_0x06f2;
            case 58: goto L_0x06f2;
            case 59: goto L_0x06f2;
            case 60: goto L_0x06f2;
            case 61: goto L_0x06f2;
            case 62: goto L_0x06f2;
            case 63: goto L_0x06f2;
            case 64: goto L_0x06f2;
            case 65: goto L_0x06f2;
            case 66: goto L_0x06f2;
            case 67: goto L_0x06f2;
            case 68: goto L_0x06f2;
            case 69: goto L_0x06f2;
            case 70: goto L_0x06f2;
            case 71: goto L_0x06f2;
            case 72: goto L_0x06f2;
            case 73: goto L_0x06f2;
            case 74: goto L_0x06f2;
            case 75: goto L_0x06f2;
            case 76: goto L_0x06f2;
            case 77: goto L_0x06f2;
            case 78: goto L_0x06f2;
            case 79: goto L_0x06f2;
            case 80: goto L_0x06f2;
            case 81: goto L_0x06f2;
            case 82: goto L_0x06f2;
            case 83: goto L_0x06f2;
            case 84: goto L_0x06f2;
            case 85: goto L_0x06f2;
            case 86: goto L_0x06f2;
            case 87: goto L_0x06f2;
            case 88: goto L_0x06f2;
            case 89: goto L_0x06f2;
            case 90: goto L_0x06f2;
            case 91: goto L_0x06f2;
            case 92: goto L_0x06f2;
            case 93: goto L_0x06f2;
            case 94: goto L_0x06f2;
            case 95: goto L_0x06f2;
            case 96: goto L_0x06f2;
            case 97: goto L_0x06f2;
            case 98: goto L_0x06f2;
            case 99: goto L_0x06f2;
            case 100: goto L_0x06f2;
            case 101: goto L_0x06f2;
            case 102: goto L_0x06f2;
            case 103: goto L_0x06f2;
            case 104: goto L_0x06f2;
            case 105: goto L_0x06f2;
            case 106: goto L_0x06f2;
            case 107: goto L_0x06f2;
            case 108: goto L_0x06f2;
            case 109: goto L_0x06f2;
            case 110: goto L_0x06f2;
            case 111: goto L_0x06f2;
            case 112: goto L_0x06f2;
            case 113: goto L_0x06f2;
            case 114: goto L_0x06f2;
            case 115: goto L_0x06f2;
            case 116: goto L_0x06f2;
            case 117: goto L_0x06f2;
            case 118: goto L_0x06f2;
            case 119: goto L_0x06f2;
            case 120: goto L_0x06f2;
            case 121: goto L_0x06f2;
            case 122: goto L_0x06f2;
            case 123: goto L_0x06f2;
            default: goto L_0x06f1;
        };	 Catch:{ all -> 0x0727 }
    L_0x06f1:
        goto L_0x06f4;
    L_0x06f2:
        l = r3;	 Catch:{ all -> 0x0727 }
    L_0x06f4:
        r1 = defpackage.ozp.d;	 Catch:{ all -> 0x0727 }
        r2 = r1.hashCode();	 Catch:{ all -> 0x0727 }
        r4 = 2006354; // 0x1e9d52 float:2.811501E-39 double:9.912706E-318;
        if (r2 == r4) goto L_0x0710;
    L_0x06ff:
        r0 = 2006367; // 0x1e9d5f float:2.811519E-39 double:9.91277E-318;
        if (r2 == r0) goto L_0x0705;
    L_0x0704:
        goto L_0x071a;
    L_0x0705:
        r0 = "AFTN";
        r0 = r1.equals(r0);	 Catch:{ all -> 0x0727 }
        if (r0 != 0) goto L_0x070e;
    L_0x070d:
        goto L_0x071a;
    L_0x070e:
        r5 = 1;
        goto L_0x071a;
    L_0x0710:
        r2 = "AFTA";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0727 }
        if (r1 != 0) goto L_0x0719;
    L_0x0718:
        goto L_0x071a;
    L_0x0719:
        r5 = 0;
    L_0x071a:
        if (r5 == 0) goto L_0x071f;
    L_0x071c:
        if (r5 == r3) goto L_0x071f;
    L_0x071e:
        goto L_0x0721;
    L_0x071f:
        l = r3;	 Catch:{ all -> 0x0727 }
    L_0x0721:
        k = r3;	 Catch:{ all -> 0x0727 }
    L_0x0723:
        monitor-exit(r7);	 Catch:{ all -> 0x0727 }
        r7 = l;
        return r7;
    L_0x0727:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0727 }
        throw r0;
    L_0x072a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozz.a(java.lang.String):boolean");
    }
}
