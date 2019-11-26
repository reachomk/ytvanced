package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: nmi */
public abstract class nmi extends nng {
    private static final byte[] a = nxf.d("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean A;
    private boolean B;
    private ByteBuffer[] C;
    private ByteBuffer[] D;
    private long E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    public final nlk b;
    public final nml c;
    public final Handler d;
    public MediaCodec e;
    public int f;
    public boolean g;
    private final nmg h;
    private final npz j;
    private final boolean k;
    private final nnb l;
    private final nmz m;
    private final List n;
    private final BufferInfo o;
    private final boolean p;
    private nmx q;
    private npv r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public nmi(nne nne, nmg nmg, npz npz, boolean z, Handler handler, nml nml) {
        this(new nne[]{nne}, nmg, npz, z, handler, nml);
    }

    /* Access modifiers changed, original: protected */
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    public abstract void a(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto);

    public abstract boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z);

    /* Access modifiers changed, original: protected */
    public boolean a(MediaCodec mediaCodec, boolean z, nmx nmx, nmx nmx2) {
        return false;
    }

    public abstract boolean a(nmg nmg, nmx nmx);

    /* Access modifiers changed, original: protected */
    public void i() {
    }

    /* Access modifiers changed, original: protected */
    public void m() {
    }

    /* Access modifiers changed, original: protected */
    public long r() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:9:0x0039, code skipped:
            if ("NVIDIA".equals(defpackage.nxf.c) == false) goto L_0x003b;
     */
    public nmi(defpackage.nne[] r4, defpackage.nmg r5, defpackage.npz r6, boolean r7, android.os.Handler r8, defpackage.nml r9) {
        /*
        r3 = this;
        r3.<init>(r4);
        r4 = defpackage.nxf.a;
        r0 = 1;
        r1 = 0;
        r2 = 16;
        if (r4 < r2) goto L_0x000d;
    L_0x000b:
        r4 = 1;
        goto L_0x000e;
    L_0x000d:
        r4 = 0;
    L_0x000e:
        defpackage.nwf.b(r4);
        r4 = defpackage.nwf.a(r5);
        r4 = (defpackage.nmg) r4;
        r3.h = r4;
        r3.j = r6;
        r3.k = r7;
        r3.d = r8;
        r3.c = r9;
        r4 = defpackage.nxf.a;
        r5 = 22;
        if (r4 > r5) goto L_0x003b;
    L_0x0027:
        r4 = defpackage.nxf.b;
        r5 = "foster";
        r4 = r5.equals(r4);
        if (r4 == 0) goto L_0x003b;
    L_0x0031:
        r4 = defpackage.nxf.c;
        r5 = "NVIDIA";
        r4 = r5.equals(r4);
        if (r4 != 0) goto L_0x003c;
    L_0x003b:
        r0 = 0;
    L_0x003c:
        r3.p = r0;
        r4 = new nlk;
        r4.<init>();
        r3.b = r4;
        r4 = new nnb;
        r4.<init>(r1);
        r3.l = r4;
        r4 = new nmz;
        r4.<init>();
        r3.m = r4;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r3.n = r4;
        r4 = new android.media.MediaCodec$BufferInfo;
        r4.<init>();
        r3.o = r4;
        r3.J = r1;
        r3.K = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmi.<init>(nne[], nmg, npz, boolean, android.os.Handler, nml):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(nmx nmx) {
        return a(this.h, nmx);
    }

    /* Access modifiers changed, original: protected */
    public nlo a(nmg nmg, String str, boolean z) {
        return nmg.a(str, z);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0203 A:{Catch:{ Exception -> 0x0308 }} */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02c7 A:{Catch:{ Exception -> 0x0308 }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0317  */
    /* JADX WARNING: Missing block: B:99:0x018c, code skipped:
            if ("stvm8".equals(defpackage.nxf.b) != false) goto L_0x018e;
     */
    /* JADX WARNING: Missing block: B:103:0x019c, code skipped:
            if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r11) == false) goto L_0x019f;
     */
    public final void o() {
        /*
        r18 = this;
        r8 = r18;
        r0 = r18.p();
        if (r0 == 0) goto L_0x032c;
    L_0x0008:
        r0 = r8.q;
        r0 = r0.b;
        r1 = r8.r;
        r9 = 3;
        r2 = 0;
        r10 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0055;
    L_0x0014:
        r4 = r8.j;
        if (r4 == 0) goto L_0x004d;
    L_0x0018:
        r5 = r8.H;
        if (r5 != 0) goto L_0x0021;
    L_0x001c:
        r4.a(r1);
        r8.H = r10;
    L_0x0021:
        r1 = r8.j;
        r1 = r1.b();
        if (r1 == 0) goto L_0x0041;
    L_0x0029:
        if (r1 != r9) goto L_0x002c;
    L_0x002b:
        goto L_0x0030;
    L_0x002c:
        r4 = 4;
        if (r1 == r4) goto L_0x0030;
    L_0x002f:
        return;
    L_0x0030:
        r1 = r8.j;
        r1 = r1.c();
        r1 = (defpackage.nqh) r1;
        r1 = r1.a;
        r4 = r8.j;
        r4 = r4.a(r0);
        goto L_0x0057;
    L_0x0041:
        r0 = new nlq;
        r1 = r8.j;
        r1 = r1.d();
        r0.<init>(r1);
        throw r0;
    L_0x004d:
        r0 = new nlq;
        r1 = "Media requires a DrmSessionManager";
        r0.<init>(r1);
        throw r0;
    L_0x0055:
        r1 = r2;
        r4 = 0;
    L_0x0057:
        r5 = r8.h;	 Catch:{ nmq -> 0x005e }
        r0 = r8.a(r5, r0, r4);	 Catch:{ nmq -> 0x005e }
        goto L_0x006d;
    L_0x005e:
        r0 = move-exception;
        r4 = new nmm;
        r5 = r8.q;
        r6 = -49998; // 0xffffffffffff3cb2 float:NaN double:NaN;
        r4.<init>(r5, r0, r6);
        r8.a(r4);
        r0 = r2;
    L_0x006d:
        if (r0 != 0) goto L_0x007c;
    L_0x006f:
        r4 = new nmm;
        r5 = r8.q;
        r6 = -49999; // 0xffffffffffff3cb1 float:NaN double:NaN;
        r4.<init>(r5, r2, r6);
        r8.a(r4);
    L_0x007c:
        r11 = r0.a;
        r2 = r0.c;
        r4 = 19;
        if (r2 == 0) goto L_0x00a4;
    L_0x0084:
        r2 = defpackage.nxf.a;
        if (r2 > r4) goto L_0x00a2;
    L_0x0088:
        r2 = defpackage.nxf.d;
        r5 = "ODROID-XU3";
        r2 = r2.equals(r5);
        if (r2 == 0) goto L_0x00a2;
    L_0x0092:
        r2 = "OMX.Exynos.AVC.Decoder";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x00a4;
    L_0x009a:
        r2 = "OMX.Exynos.AVC.Decoder.secure";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x00a4;
    L_0x00a2:
        r2 = 1;
        goto L_0x00a5;
    L_0x00a4:
        r2 = 0;
    L_0x00a5:
        r8.s = r2;
        r2 = r8.q;
        r5 = defpackage.nxf.a;
        r6 = 21;
        if (r5 >= r6) goto L_0x00c2;
    L_0x00af:
        r2 = r2.f;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x00c2;
    L_0x00b7:
        r2 = "OMX.MTK.VIDEO.DECODER.AVC";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x00c0;
    L_0x00bf:
        goto L_0x00c2;
    L_0x00c0:
        r2 = 1;
        goto L_0x00c3;
    L_0x00c2:
        r2 = 0;
    L_0x00c3:
        r8.t = r2;
        r2 = defpackage.nxf.a;
        r5 = 18;
        if (r2 < r5) goto L_0x0100;
    L_0x00cb:
        r2 = defpackage.nxf.a;
        if (r2 != r5) goto L_0x00df;
    L_0x00cf:
        r2 = "OMX.SEC.avc.dec";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x0100;
    L_0x00d7:
        r2 = "OMX.SEC.avc.dec.secure";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x0100;
    L_0x00df:
        r2 = defpackage.nxf.a;
        if (r2 != r4) goto L_0x00fe;
    L_0x00e3:
        r2 = defpackage.nxf.d;
        r7 = "SM-G800";
        r2 = r2.startsWith(r7);
        if (r2 == 0) goto L_0x00fe;
    L_0x00ed:
        r2 = "OMX.Exynos.avc.dec";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x0100;
    L_0x00f5:
        r2 = "OMX.Exynos.avc.dec.secure";
        r2 = r2.equals(r11);
        if (r2 == 0) goto L_0x00fe;
    L_0x00fd:
        goto L_0x0100;
    L_0x00fe:
        r2 = 0;
        goto L_0x0101;
    L_0x0100:
        r2 = 1;
    L_0x0101:
        r8.u = r2;
        r2 = defpackage.nxf.a;
        r7 = 24;
        if (r2 >= r7) goto L_0x0146;
    L_0x0109:
        r2 = "OMX.Nvidia.h264.decode";
        r2 = r2.equals(r11);
        if (r2 == 0) goto L_0x0112;
    L_0x0111:
        goto L_0x011b;
    L_0x0112:
        r2 = "OMX.Nvidia.h264.decode.secure";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x011b;
    L_0x011a:
        goto L_0x0146;
    L_0x011b:
        r2 = defpackage.nxf.b;
        r7 = "flounder";
        r2 = r2.equals(r7);
        if (r2 != 0) goto L_0x0144;
    L_0x0125:
        r2 = defpackage.nxf.b;
        r7 = "flounder_lte";
        r2 = r2.equals(r7);
        if (r2 != 0) goto L_0x0144;
    L_0x012f:
        r2 = defpackage.nxf.b;
        r7 = "grouper";
        r2 = r2.equals(r7);
        if (r2 != 0) goto L_0x0144;
    L_0x0139:
        r2 = defpackage.nxf.b;
        r7 = "tilapia";
        r2 = r2.equals(r7);
        if (r2 != 0) goto L_0x0144;
    L_0x0143:
        goto L_0x0146;
    L_0x0144:
        r2 = 1;
        goto L_0x0147;
    L_0x0146:
        r2 = 0;
    L_0x0147:
        r8.v = r2;
        r2 = defpackage.nxf.a;
        r7 = 17;
        if (r2 > r7) goto L_0x0162;
    L_0x014f:
        r2 = "OMX.rk.video_decoder.avc";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x0160;
    L_0x0157:
        r2 = "OMX.allwinner.video.decoder.avc";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x0160;
    L_0x015f:
        goto L_0x0162;
    L_0x0160:
        r2 = 1;
        goto L_0x0163;
    L_0x0162:
        r2 = 0;
    L_0x0163:
        r8.w = r2;
        r2 = defpackage.nxf.a;
        r7 = 23;
        if (r2 > r7) goto L_0x0176;
    L_0x016b:
        r2 = "OMX.google.vorbis.decoder";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x0174;
    L_0x0173:
        goto L_0x0176;
    L_0x0174:
        r2 = 1;
        goto L_0x01a0;
    L_0x0176:
        r2 = defpackage.nxf.a;
        if (r2 > r4) goto L_0x019f;
    L_0x017a:
        r2 = defpackage.nxf.b;
        r7 = "hb2000";
        r2 = r7.equals(r2);
        if (r2 != 0) goto L_0x018e;
    L_0x0184:
        r2 = defpackage.nxf.b;
        r7 = "stvm8";
        r2 = r7.equals(r2);
        if (r2 == 0) goto L_0x019f;
    L_0x018e:
        r2 = "OMX.amlogic.avc.decoder.awesome";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x0174;
    L_0x0196:
        r2 = "OMX.amlogic.avc.decoder.awesome.secure";
        r2 = r2.equals(r11);
        if (r2 == 0) goto L_0x019f;
    L_0x019e:
        goto L_0x0174;
    L_0x019f:
        r2 = 0;
    L_0x01a0:
        r8.x = r2;
        r2 = defpackage.nxf.a;
        if (r2 != r6) goto L_0x01b1;
    L_0x01a6:
        r2 = "OMX.google.aac.decoder";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x01af;
    L_0x01ae:
        goto L_0x01b1;
    L_0x01af:
        r2 = 1;
        goto L_0x01b2;
    L_0x01b1:
        r2 = 0;
    L_0x01b2:
        r8.y = r2;
        r2 = r8.q;
        r6 = defpackage.nxf.a;
        if (r6 > r5) goto L_0x01c9;
    L_0x01ba:
        r2 = r2.q;
        if (r2 != r10) goto L_0x01c9;
    L_0x01be:
        r2 = "OMX.MTK.AUDIO.DECODER.MP3";
        r2 = r2.equals(r11);
        if (r2 != 0) goto L_0x01c7;
    L_0x01c6:
        goto L_0x01c9;
    L_0x01c7:
        r2 = 1;
        goto L_0x01ca;
    L_0x01c9:
        r2 = 0;
    L_0x01ca:
        r8.z = r2;
        r12 = -1;
        r5 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x0308 }
        r2 = java.lang.String.valueOf(r11);	 Catch:{ Exception -> 0x0308 }
        r2 = r2.length();	 Catch:{ Exception -> 0x0308 }
        r2 = r2 + r4;
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0308 }
        r4.<init>(r2);	 Catch:{ Exception -> 0x0308 }
        r2 = "createByCodecName(";
        r4.append(r2);	 Catch:{ Exception -> 0x0308 }
        r4.append(r11);	 Catch:{ Exception -> 0x0308 }
        r2 = ")";
        r4.append(r2);	 Catch:{ Exception -> 0x0308 }
        r4.toString();	 Catch:{ Exception -> 0x0308 }
        r2 = android.media.MediaCodec.createByCodecName(r11);	 Catch:{ Exception -> 0x0308 }
        r8.e = r2;	 Catch:{ Exception -> 0x0308 }
        defpackage.nxd.a();	 Catch:{ Exception -> 0x0308 }
        r2 = r8.e;	 Catch:{ Exception -> 0x0308 }
        r0 = r0.c;	 Catch:{ Exception -> 0x0308 }
        r4 = r8.q;	 Catch:{ Exception -> 0x0308 }
        r7 = r4.x;	 Catch:{ Exception -> 0x0308 }
        if (r7 != 0) goto L_0x02c1;
    L_0x0203:
        r7 = new android.media.MediaFormat;	 Catch:{ Exception -> 0x0308 }
        r7.<init>();	 Catch:{ Exception -> 0x0308 }
        r14 = "mime";
        r15 = r4.b;	 Catch:{ Exception -> 0x0308 }
        r7.setString(r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "language";
        r15 = r4.v;	 Catch:{ Exception -> 0x0308 }
        if (r15 != 0) goto L_0x0216;
    L_0x0215:
        goto L_0x0219;
    L_0x0216:
        r7.setString(r14, r15);	 Catch:{ Exception -> 0x0308 }
    L_0x0219:
        r14 = "max-input-size";
        r15 = r4.d;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "width";
        r15 = r4.h;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "height";
        r15 = r4.i;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "rotation-degrees";
        r15 = r4.l;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "max-width";
        r15 = r4.j;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "max-height";
        r15 = r4.k;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "channel-count";
        r15 = r4.q;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "sample-rate";
        r15 = r4.r;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "encoder-delay";
        r15 = r4.t;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "encoder-padding";
        r15 = r4.u;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = 0;
    L_0x0260:
        r15 = r4.f;	 Catch:{ Exception -> 0x0308 }
        r15 = r15.size();	 Catch:{ Exception -> 0x0308 }
        if (r14 >= r15) goto L_0x028e;
    L_0x0268:
        r15 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0308 }
        r10 = 15;
        r15.<init>(r10);	 Catch:{ Exception -> 0x0308 }
        r10 = "csd-";
        r15.append(r10);	 Catch:{ Exception -> 0x0308 }
        r15.append(r14);	 Catch:{ Exception -> 0x0308 }
        r10 = r15.toString();	 Catch:{ Exception -> 0x0308 }
        r15 = r4.f;	 Catch:{ Exception -> 0x0308 }
        r15 = r15.get(r14);	 Catch:{ Exception -> 0x0308 }
        r15 = (byte[]) r15;	 Catch:{ Exception -> 0x0308 }
        r15 = java.nio.ByteBuffer.wrap(r15);	 Catch:{ Exception -> 0x0308 }
        r7.setByteBuffer(r10, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = r14 + 1;
        r10 = 1;
        goto L_0x0260;
    L_0x028e:
        r14 = r4.e;	 Catch:{ Exception -> 0x0308 }
        r10 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r10 == 0) goto L_0x0299;
    L_0x0294:
        r10 = "durationUs";
        r7.setLong(r10, r14);	 Catch:{ Exception -> 0x0308 }
    L_0x0299:
        r10 = r4.p;	 Catch:{ Exception -> 0x0308 }
        if (r10 == 0) goto L_0x02bf;
    L_0x029d:
        r14 = "color-transfer";
        r15 = r10.c;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "color-standard";
        r15 = r10.a;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "color-range";
        r15 = r10.b;	 Catch:{ Exception -> 0x0308 }
        defpackage.nmx.a(r7, r14, r15);	 Catch:{ Exception -> 0x0308 }
        r14 = "hdr-static-info";
        r10 = r10.d;	 Catch:{ Exception -> 0x0308 }
        if (r10 == 0) goto L_0x02bf;
    L_0x02b8:
        r10 = java.nio.ByteBuffer.wrap(r10);	 Catch:{ Exception -> 0x0308 }
        r7.setByteBuffer(r14, r10);	 Catch:{ Exception -> 0x0308 }
    L_0x02bf:
        r4.x = r7;	 Catch:{ Exception -> 0x0308 }
    L_0x02c1:
        r4 = r4.x;	 Catch:{ Exception -> 0x0308 }
        r7 = r8.p;	 Catch:{ Exception -> 0x0308 }
        if (r7 == 0) goto L_0x02cc;
    L_0x02c7:
        r7 = "auto-frc";
        r4.setInteger(r7, r3);	 Catch:{ Exception -> 0x0308 }
    L_0x02cc:
        r8.a(r2, r0, r4, r1);	 Catch:{ Exception -> 0x0308 }
        defpackage.nxd.a();	 Catch:{ Exception -> 0x0308 }
        r0 = r8.e;	 Catch:{ Exception -> 0x0308 }
        r0.start();	 Catch:{ Exception -> 0x0308 }
        defpackage.nxd.a();	 Catch:{ Exception -> 0x0308 }
        r14 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x0308 }
        r16 = r14 - r5;
        r0 = r8.d;	 Catch:{ Exception -> 0x0308 }
        if (r0 == 0) goto L_0x02f7;
    L_0x02e4:
        r1 = r8.c;	 Catch:{ Exception -> 0x0308 }
        if (r1 == 0) goto L_0x02f7;
    L_0x02e8:
        r10 = new nmj;	 Catch:{ Exception -> 0x0308 }
        r1 = r10;
        r2 = r18;
        r3 = r11;
        r4 = r14;
        r6 = r16;
        r1.<init>(r2, r3, r4, r6);	 Catch:{ Exception -> 0x0308 }
        r0.post(r10);	 Catch:{ Exception -> 0x0308 }
    L_0x02f7:
        r0 = r8.e;	 Catch:{ Exception -> 0x0308 }
        r0 = r0.getInputBuffers();	 Catch:{ Exception -> 0x0308 }
        r8.C = r0;	 Catch:{ Exception -> 0x0308 }
        r0 = r8.e;	 Catch:{ Exception -> 0x0308 }
        r0 = r0.getOutputBuffers();	 Catch:{ Exception -> 0x0308 }
        r8.D = r0;	 Catch:{ Exception -> 0x0308 }
        goto L_0x0313;
    L_0x0308:
        r0 = move-exception;
        r1 = new nmm;
        r2 = r8.q;
        r1.<init>(r2, r0, r11);
        r8.a(r1);
    L_0x0313:
        r0 = r8.i;
        if (r0 != r9) goto L_0x031b;
    L_0x0317:
        r12 = android.os.SystemClock.elapsedRealtime();
    L_0x031b:
        r8.E = r12;
        r0 = -1;
        r8.F = r0;
        r8.G = r0;
        r1 = 1;
        r8.P = r1;
        r0 = r8.b;
        r2 = r0.a;
        r2 = r2 + r1;
        r0.a = r2;
    L_0x032c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmi.o():void");
    }

    private final void a(nmm nmm) {
        Handler handler = this.d;
        if (!(handler == null || this.c == null)) {
            handler.post(new nmh(this, nmm));
        }
        throw new nlq((Throwable) nmm);
    }

    /* Access modifiers changed, original: protected */
    public boolean p() {
        return this.e == null && this.q != null;
    }

    /* Access modifiers changed, original: protected */
    public void l() {
        this.q = null;
        this.r = null;
        try {
            q();
            try {
                if (this.H) {
                    this.j.a();
                    this.H = false;
                }
                super.l();
            } catch (Throwable th) {
                super.l();
            }
        } catch (Throwable th2) {
            super.l();
        }
    }

    /* Access modifiers changed, original: protected */
    public void q() {
        if (this.e != null) {
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.O = false;
            this.n.clear();
            this.C = null;
            this.D = null;
            this.I = false;
            this.L = false;
            this.s = false;
            this.t = false;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = false;
            this.z = false;
            this.A = false;
            this.B = false;
            this.M = false;
            this.J = 0;
            this.K = 0;
            nlk nlk = this.b;
            nlk.b++;
            try {
                this.e.stop();
                try {
                    this.e.release();
                } finally {
                    this.e = null;
                }
            } catch (Throwable th) {
                this.e.release();
            } finally {
                this.e = null;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(long j) {
        this.f = 0;
        this.N = false;
        this.g = false;
        if (this.e != null) {
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.P = true;
            this.O = false;
            this.n.clear();
            this.A = false;
            this.B = false;
            if (this.u || (this.x && this.M)) {
                q();
                o();
            } else if (this.K != 0) {
                q();
                o();
            } else {
                this.e.flush();
                this.L = false;
            }
            if (this.I && this.q != null) {
                this.J = 1;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(long j, long j2, boolean z) {
        int i;
        long j3 = j;
        boolean z2 = false;
        if (z) {
            i = this.f;
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        this.f = i;
        if (this.q == null && a(j3, this.m, null) == -4) {
            a(this.m);
        }
        o();
        if (this.e != null) {
            while (!this.g) {
                i = this.G;
                if (i < 0) {
                    if (this.y && this.M) {
                        try {
                            i = this.e.dequeueOutputBuffer(this.o, r());
                            this.G = i;
                        } catch (IllegalStateException unused) {
                            k();
                            if (this.g) {
                                q();
                            }
                        }
                    } else {
                        i = this.e.dequeueOutputBuffer(this.o, r());
                        this.G = i;
                    }
                }
                nlk nlk;
                if (i == -2) {
                    MediaFormat outputFormat = this.e.getOutputFormat();
                    if (this.v && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.B = true;
                    } else {
                        if (this.z) {
                            outputFormat.setInteger("channel-count", 1);
                        }
                        a(this.e, outputFormat);
                        nlk = this.b;
                        nlk.d++;
                    }
                } else {
                    if (i != -3) {
                        if (i >= 0) {
                            if (!this.B) {
                                if ((this.o.flags & 4) == 0) {
                                    int i2;
                                    int i3;
                                    boolean a;
                                    long j4 = this.o.presentationTimeUs;
                                    int size = this.n.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        if (((Long) this.n.get(i4)).longValue() == j4) {
                                            i2 = i4;
                                            break;
                                        }
                                    }
                                    i2 = -1;
                                    MediaCodec mediaCodec;
                                    ByteBuffer[] byteBufferArr;
                                    int i5;
                                    if (this.y && this.M) {
                                        try {
                                            mediaCodec = this.e;
                                            byteBufferArr = this.D;
                                            i5 = this.G;
                                            i3 = i2;
                                            a = a(j, j2, mediaCodec, byteBufferArr[i5], this.o, i5, i2 != -1);
                                        } catch (IllegalStateException unused2) {
                                            k();
                                            if (this.g) {
                                                q();
                                            }
                                        }
                                    } else {
                                        i3 = i2;
                                        mediaCodec = this.e;
                                        byteBufferArr = this.D;
                                        i5 = this.G;
                                        a = a(j, j2, mediaCodec, byteBufferArr[i5], this.o, i5, i3 != -1);
                                    }
                                    if (!a) {
                                        break;
                                    }
                                    j4 = this.o.presentationTimeUs;
                                    if (i3 != -1) {
                                        this.n.remove(i3);
                                    }
                                    this.G = -1;
                                } else {
                                    k();
                                    break;
                                }
                            }
                            this.B = z2;
                            this.e.releaseOutputBuffer(i, z2);
                            this.G = -1;
                        } else if (!this.w || (!this.N && this.K != 2)) {
                            break;
                        } else {
                            k();
                        }
                    } else {
                        this.D = this.e.getOutputBuffers();
                        nlk = this.b;
                        nlk.e++;
                    }
                    z2 = false;
                }
            }
            if (a(j3, true)) {
                do {
                } while (a(j3, false));
            }
            nxd.a();
        }
        this.b.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x0140  */
    private final boolean a(long r18, boolean r20) {
        /*
        r17 = this;
        r1 = r17;
        r0 = r1.N;
        r2 = 0;
        if (r0 != 0) goto L_0x01c2;
    L_0x0007:
        r0 = r1.K;
        r3 = 2;
        if (r0 == r3) goto L_0x01c2;
    L_0x000c:
        r0 = r1.F;
        if (r0 >= 0) goto L_0x0029;
    L_0x0010:
        r0 = r1.e;
        r4 = 0;
        r0 = r0.dequeueInputBuffer(r4);
        r1.F = r0;
        if (r0 < 0) goto L_0x0028;
    L_0x001c:
        r4 = r1.l;
        r5 = r1.C;
        r0 = r5[r0];
        r4.b = r0;
        r4.d();
        goto L_0x0029;
    L_0x0028:
        return r2;
    L_0x0029:
        r0 = r1.K;
        r4 = -1;
        r5 = 1;
        if (r0 != r5) goto L_0x0046;
    L_0x002f:
        r0 = r1.w;
        if (r0 != 0) goto L_0x0043;
    L_0x0033:
        r1.M = r5;
        r6 = r1.e;
        r7 = r1.F;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r12 = 4;
        r6.queueInputBuffer(r7, r8, r9, r10, r12);
        r1.F = r4;
    L_0x0043:
        r1.K = r3;
        return r2;
    L_0x0046:
        r0 = r1.A;
        if (r0 == 0) goto L_0x0068;
    L_0x004a:
        r1.A = r2;
        r0 = r1.l;
        r0 = r0.b;
        r2 = a;
        r0.put(r2);
        r6 = r1.e;
        r7 = r1.F;
        r8 = 0;
        r0 = a;
        r9 = r0.length;
        r10 = 0;
        r12 = 0;
        r6.queueInputBuffer(r7, r8, r9, r10, r12);
        r1.F = r4;
        r1.L = r5;
        return r5;
    L_0x0068:
        r0 = r1.O;
        r6 = -2;
        if (r0 != 0) goto L_0x00a9;
    L_0x006d:
        r0 = r1.J;
        if (r0 == r5) goto L_0x0072;
    L_0x0071:
        goto L_0x0093;
    L_0x0072:
        r0 = 0;
    L_0x0073:
        r7 = r1.q;
        r7 = r7.f;
        r7 = r7.size();
        if (r0 >= r7) goto L_0x0091;
    L_0x007d:
        r7 = r1.q;
        r7 = r7.f;
        r7 = r7.get(r0);
        r7 = (byte[]) r7;
        r8 = r1.l;
        r8 = r8.b;
        r8.put(r7);
        r0 = r0 + 1;
        goto L_0x0073;
    L_0x0091:
        r1.J = r3;
    L_0x0093:
        r0 = r1.m;
        r7 = r1.l;
        r8 = r18;
        r0 = r1.a(r8, r0, r7);
        if (r20 == 0) goto L_0x00aa;
    L_0x009f:
        r7 = r1.f;
        if (r7 == r5) goto L_0x00a4;
    L_0x00a3:
        goto L_0x00aa;
    L_0x00a4:
        if (r0 != r6) goto L_0x00aa;
    L_0x00a6:
        r1.f = r3;
        goto L_0x00aa;
    L_0x00a9:
        r0 = -3;
    L_0x00aa:
        if (r0 == r6) goto L_0x01c2;
    L_0x00ac:
        r6 = -4;
        if (r0 != r6) goto L_0x00c0;
    L_0x00af:
        r0 = r1.J;
        if (r0 != r3) goto L_0x00ba;
    L_0x00b3:
        r0 = r1.l;
        r0.d();
        r1.J = r5;
    L_0x00ba:
        r0 = r1.m;
        r1.a(r0);
        return r5;
    L_0x00c0:
        if (r0 != r4) goto L_0x00f6;
    L_0x00c2:
        r0 = r1.J;
        if (r0 != r3) goto L_0x00cd;
    L_0x00c6:
        r0 = r1.l;
        r0.d();
        r1.J = r5;
    L_0x00cd:
        r1.N = r5;
        r0 = r1.L;
        if (r0 != 0) goto L_0x00d7;
    L_0x00d3:
        r17.k();
        return r2;
    L_0x00d7:
        r0 = r1.w;	 Catch:{ CryptoException -> 0x00ec }
        if (r0 != 0) goto L_0x00eb;
    L_0x00db:
        r1.M = r5;	 Catch:{ CryptoException -> 0x00ec }
        r6 = r1.e;	 Catch:{ CryptoException -> 0x00ec }
        r7 = r1.F;	 Catch:{ CryptoException -> 0x00ec }
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r12 = 4;
        r6.queueInputBuffer(r7, r8, r9, r10, r12);	 Catch:{ CryptoException -> 0x00ec }
        r1.F = r4;	 Catch:{ CryptoException -> 0x00ec }
    L_0x00eb:
        return r2;
    L_0x00ec:
        r0 = move-exception;
        r1.a(r0);
        r2 = new nlq;
        r2.<init>(r0);
        throw r2;
    L_0x00f6:
        r0 = r1.P;
        if (r0 == 0) goto L_0x0110;
    L_0x00fa:
        r0 = r1.l;
        r0 = r0.c();
        if (r0 != 0) goto L_0x010e;
    L_0x0102:
        r0 = r1.l;
        r0.d();
        r0 = r1.J;
        if (r0 != r3) goto L_0x010d;
    L_0x010b:
        r1.J = r5;
    L_0x010d:
        return r5;
    L_0x010e:
        r1.P = r2;
    L_0x0110:
        r0 = r1.l;
        r0 = r0.a();
        r3 = r1.H;
        if (r3 == 0) goto L_0x013b;
    L_0x011a:
        r3 = r1.j;
        r3 = r3.b();
        if (r3 == 0) goto L_0x012f;
    L_0x0122:
        r6 = 4;
        if (r3 != r6) goto L_0x0126;
    L_0x0125:
        goto L_0x013b;
    L_0x0126:
        if (r0 == 0) goto L_0x012a;
    L_0x0128:
        r3 = 1;
        goto L_0x013c;
    L_0x012a:
        r3 = r1.k;
        if (r3 != 0) goto L_0x013b;
    L_0x012e:
        goto L_0x0128;
    L_0x012f:
        r0 = new nlq;
        r2 = r1.j;
        r2 = r2.d();
        r0.<init>(r2);
        throw r0;
    L_0x013b:
        r3 = 0;
    L_0x013c:
        r1.O = r3;
        if (r3 != 0) goto L_0x01c2;
    L_0x0140:
        r3 = r1.t;
        if (r3 != 0) goto L_0x0145;
    L_0x0144:
        goto L_0x015c;
    L_0x0145:
        if (r0 != 0) goto L_0x015c;
    L_0x0147:
        r3 = r1.l;
        r3 = r3.b;
        defpackage.nwv.a(r3);
        r3 = r1.l;
        r3 = r3.b;
        r3 = r3.position();
        if (r3 == 0) goto L_0x015b;
    L_0x0158:
        r1.t = r2;
        goto L_0x015c;
    L_0x015b:
        return r5;
    L_0x015c:
        r3 = r1.l;	 Catch:{ CryptoException -> 0x01b8 }
        r3 = r3.b;	 Catch:{ CryptoException -> 0x01b8 }
        r9 = r3.position();	 Catch:{ CryptoException -> 0x01b8 }
        r3 = r1.l;	 Catch:{ CryptoException -> 0x01b8 }
        r6 = r3.c;	 Catch:{ CryptoException -> 0x01b8 }
        r6 = r9 - r6;
        r14 = r3.e;	 Catch:{ CryptoException -> 0x01b8 }
        r3 = r3.b();	 Catch:{ CryptoException -> 0x01b8 }
        if (r3 == 0) goto L_0x017b;
    L_0x0172:
        r3 = r1.n;	 Catch:{ CryptoException -> 0x01b8 }
        r7 = java.lang.Long.valueOf(r14);	 Catch:{ CryptoException -> 0x01b8 }
        r3.add(r7);	 Catch:{ CryptoException -> 0x01b8 }
    L_0x017b:
        r3 = r1.l;	 Catch:{ CryptoException -> 0x01b8 }
        if (r0 != 0) goto L_0x018a;
    L_0x017f:
        r6 = r1.e;	 Catch:{ CryptoException -> 0x01b8 }
        r7 = r1.F;	 Catch:{ CryptoException -> 0x01b8 }
        r8 = 0;
        r12 = 0;
        r10 = r14;
        r6.queueInputBuffer(r7, r8, r9, r10, r12);	 Catch:{ CryptoException -> 0x01b8 }
        goto L_0x01aa;
    L_0x018a:
        r0 = r3.a;	 Catch:{ CryptoException -> 0x01b8 }
        r13 = r0.g;	 Catch:{ CryptoException -> 0x01b8 }
        if (r6 != 0) goto L_0x0191;
    L_0x0190:
        goto L_0x01a0;
    L_0x0191:
        r0 = r13.numBytesOfClearData;	 Catch:{ CryptoException -> 0x01b8 }
        if (r0 != 0) goto L_0x0199;
    L_0x0195:
        r0 = new int[r5];	 Catch:{ CryptoException -> 0x01b8 }
        r13.numBytesOfClearData = r0;	 Catch:{ CryptoException -> 0x01b8 }
    L_0x0199:
        r0 = r13.numBytesOfClearData;	 Catch:{ CryptoException -> 0x01b8 }
        r3 = r0[r2];	 Catch:{ CryptoException -> 0x01b8 }
        r3 = r3 + r6;
        r0[r2] = r3;	 Catch:{ CryptoException -> 0x01b8 }
    L_0x01a0:
        r10 = r1.e;	 Catch:{ CryptoException -> 0x01b8 }
        r11 = r1.F;	 Catch:{ CryptoException -> 0x01b8 }
        r12 = 0;
        r16 = 0;
        r10.queueSecureInputBuffer(r11, r12, r13, r14, r16);	 Catch:{ CryptoException -> 0x01b8 }
    L_0x01aa:
        r1.F = r4;	 Catch:{ CryptoException -> 0x01b8 }
        r1.L = r5;	 Catch:{ CryptoException -> 0x01b8 }
        r1.J = r2;	 Catch:{ CryptoException -> 0x01b8 }
        r0 = r1.b;	 Catch:{ CryptoException -> 0x01b8 }
        r2 = r0.c;	 Catch:{ CryptoException -> 0x01b8 }
        r2 = r2 + r5;
        r0.c = r2;	 Catch:{ CryptoException -> 0x01b8 }
        return r5;
    L_0x01b8:
        r0 = move-exception;
        r1.a(r0);
        r2 = new nlq;
        r2.<init>(r0);
        throw r2;
    L_0x01c2:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmi.a(long, boolean):boolean");
    }

    /* Access modifiers changed, original: protected */
    public void a(nmz nmz) {
        nmx nmx = this.q;
        this.q = nmz.a;
        this.r = nmz.b;
        boolean z = false;
        Object obj = (this.r == null || this.H) ? null : 1;
        if (!nxf.a(this.q, (Object) nmx) || obj != null) {
            MediaCodec mediaCodec = this.e;
            if (mediaCodec != null && obj == null && a(mediaCodec, this.s, nmx, this.q)) {
                this.I = true;
                this.J = 1;
                if (this.v) {
                    nmx nmx2 = this.q;
                    if (nmx2.h == nmx.h && nmx2.i == nmx.i) {
                        z = true;
                    }
                }
                this.A = z;
            } else if (this.L) {
                this.K = 1;
            } else {
                q();
                o();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean c() {
        return this.g;
    }

    /* Access modifiers changed, original: protected */
    public boolean d() {
        boolean z = false;
        if (!(this.q == null || this.O)) {
            if (this.f != 0 || this.G >= 0) {
                z = true;
            } else if (SystemClock.elapsedRealtime() >= this.E + 1000) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    private final void k() {
        if (this.K == 2) {
            q();
            o();
            return;
        }
        this.g = true;
        m();
    }

    private final void a(CryptoException cryptoException) {
        Handler handler = this.d;
        if (handler != null && this.c != null) {
            handler.post(new nmk(this, cryptoException));
        }
    }
}
