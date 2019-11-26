package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.libraries.youtube.media.player.exo.libvpx.VpxDecoder;
import com.google.android.libraries.youtube.media.player.exo.libvpx.VpxOutputBuffer;

/* renamed from: aewo */
public final class aewo extends nng {
    private int A;
    private int B;
    private int C;
    private long D;
    public final nlk a = new nlk();
    public final aeww b;
    private final int c;
    private final int d;
    private final boolean e = true;
    private final boolean f;
    private final Handler g;
    private final int h;
    private final nmz j;
    private final boolean k;
    private final int l;
    private nmx m;
    private VpxDecoder n;
    private aewx o;
    private VpxOutputBuffer p;
    private VpxOutputBuffer q;
    private Bitmap r;
    private boolean s;
    private boolean t;
    private Surface u;
    private aewz v;
    private final int w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* JADX WARNING: Missing block: B:6:0x0028, code skipped:
            if (r4.aY == false) goto L_0x002a;
     */
    public aewo(defpackage.nne r4, android.os.Handler r5, defpackage.aeww r6, int r7, defpackage.aajj r8, defpackage.afjc r9) {
        /*
        r3 = this;
        r0 = 1;
        r1 = new defpackage.nne[r0];
        r2 = 0;
        r1[r2] = r4;
        r3.<init>(r1);
        r4 = new nlk;
        r4.<init>();
        r3.a = r4;
        r3.e = r0;
        r3.g = r5;
        r3.b = r6;
        r3.h = r7;
        r4 = r8.c;
        r5 = r4.a;
        r6 = 2;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x002a;
    L_0x0020:
        r4 = r4.d;
        if (r4 != 0) goto L_0x0026;
    L_0x0024:
        r4 = defpackage.arhh.bv;
    L_0x0026:
        r4 = r4.aY;
        if (r4 != 0) goto L_0x002b;
    L_0x002a:
        r0 = 0;
    L_0x002b:
        r3.f = r0;
        r4 = r8.ac();
        if (r4 == 0) goto L_0x004d;
    L_0x0033:
        r4 = defpackage.arhi.EXO_PLAYER_FEATURES_LIBVPX_ZERO_COPY;
        r5 = r9.a();
        r6 = new anyc;
        r5 = r5.w;
        r7 = defpackage.arhk.x;
        r6.<init>(r5, r7);
        r4 = r6.contains(r4);
        if (r4 != 0) goto L_0x0049;
    L_0x0048:
        goto L_0x004a;
    L_0x0049:
        r2 = 3;
    L_0x004a:
        r3.w = r2;
        goto L_0x004f;
    L_0x004d:
        r3.w = r6;
    L_0x004f:
        r4 = r9.e();
        r3.k = r4;
        r4 = r9.b();
        r3.l = r4;
        r4 = r9.c();
        r3.c = r4;
        r4 = r9.d();
        r3.d = r4;
        r4 = -1;
        r3.A = r4;
        r3.B = r4;
        r4 = new nmz;
        r4.<init>();
        r3.j = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aewo.<init>(nne, android.os.Handler, aeww, int, aajj, afjc):void");
    }

    public static String k() {
        if (VpxDecoder.a) {
            return VpxDecoder.getLibvpxVersion();
        }
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(nmx nmx) {
        return "video/x-vnd.on2.vp9".equalsIgnoreCase(nmx.b);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017a A:{Catch:{ aewy -> 0x018f }} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0179 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0179 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017a A:{Catch:{ aewy -> 0x018f }} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0106 A:{Catch:{ aewy -> 0x018f }} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017a A:{Catch:{ aewy -> 0x018f }} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0179 A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:26:0x0092, code skipped:
            if (r7.p != null) goto L_0x0094;
     */
    /* JADX WARNING: Missing block: B:60:0x0116, code skipped:
            if (r2 != null) goto L_0x0118;
     */
    public final void a(long r23, long r25, boolean r27) {
        /*
        r22 = this;
        r7 = r22;
        r8 = r23;
        r0 = r7.y;
        if (r0 != 0) goto L_0x01a7;
    L_0x0008:
        r0 = r27;
        r7.z = r0;
        r0 = r7.m;
        r10 = -4;
        r11 = 0;
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0026;
    L_0x0013:
        r0 = r7.j;
        r0 = r7.a(r8, r0, r11);
        if (r0 != r10) goto L_0x01a7;
    L_0x001b:
        r0 = r7.j;
        r0 = r0.a;
        r7.m = r0;
        r0 = r7.m;
        r7.b(r0);
    L_0x0026:
        r12 = android.os.SystemClock.elapsedRealtime();	 Catch:{ aewy -> 0x018f }
        r0 = r7.n;	 Catch:{ aewy -> 0x018f }
        r14 = 1;
        if (r0 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0074;
    L_0x0030:
        r0 = new com.google.android.libraries.youtube.media.player.exo.libvpx.VpxDecoder;	 Catch:{ aewy -> 0x018f }
        r1 = r7.c;	 Catch:{ aewy -> 0x018f }
        r2 = r7.d;	 Catch:{ aewy -> 0x018f }
        r3 = r7.f;	 Catch:{ aewy -> 0x018f }
        r4 = r7.w;	 Catch:{ aewy -> 0x018f }
        r5 = r7.k;	 Catch:{ aewy -> 0x018f }
        r6 = r7.l;	 Catch:{ aewy -> 0x018f }
        r15 = r0;
        r16 = r1;
        r17 = r2;
        r18 = r3;
        r19 = r4;
        r20 = r5;
        r21 = r6;
        r15.<init>(r16, r17, r18, r19, r20, r21);	 Catch:{ aewy -> 0x018f }
        r7.n = r0;	 Catch:{ aewy -> 0x018f }
        r0 = r7.n;	 Catch:{ aewy -> 0x018f }
        r0.start();	 Catch:{ aewy -> 0x018f }
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ aewy -> 0x018f }
        r0 = r7.g;	 Catch:{ aewy -> 0x018f }
        if (r0 == 0) goto L_0x006d;
    L_0x005d:
        r1 = r7.b;	 Catch:{ aewy -> 0x018f }
        if (r1 == 0) goto L_0x006d;
    L_0x0061:
        r15 = new aewv;	 Catch:{ aewy -> 0x018f }
        r1 = r15;
        r2 = r22;
        r5 = r12;
        r1.<init>(r2, r3, r5);	 Catch:{ aewy -> 0x018f }
        r0.post(r15);	 Catch:{ aewy -> 0x018f }
    L_0x006d:
        r0 = r7.a;	 Catch:{ aewy -> 0x018f }
        r1 = r0.a;	 Catch:{ aewy -> 0x018f }
        r1 = r1 + r14;
        r0.a = r1;	 Catch:{ aewy -> 0x018f }
    L_0x0074:
        r0 = r7.y;	 Catch:{ aewy -> 0x018f }
        r1 = 0;
        if (r0 != 0) goto L_0x0101;
    L_0x0079:
        r0 = r7.p;	 Catch:{ aewy -> 0x018f }
        if (r0 != 0) goto L_0x0094;
    L_0x007d:
        r0 = r7.q;	 Catch:{ aewy -> 0x018f }
        if (r0 == 0) goto L_0x0086;
    L_0x0081:
        r7.p = r0;	 Catch:{ aewy -> 0x018f }
        r7.q = r11;	 Catch:{ aewy -> 0x018f }
        goto L_0x0090;
    L_0x0086:
        r0 = r7.n;	 Catch:{ aewy -> 0x018f }
        r0 = r0.e();	 Catch:{ aewy -> 0x018f }
        r0 = (com.google.android.libraries.youtube.media.player.exo.libvpx.VpxOutputBuffer) r0;	 Catch:{ aewy -> 0x018f }
        r7.p = r0;	 Catch:{ aewy -> 0x018f }
    L_0x0090:
        r0 = r7.p;	 Catch:{ aewy -> 0x018f }
        if (r0 == 0) goto L_0x0101;
    L_0x0094:
        r0 = r7.q;	 Catch:{ aewy -> 0x018f }
        if (r0 != 0) goto L_0x00a2;
    L_0x0098:
        r0 = r7.n;	 Catch:{ aewy -> 0x018f }
        r0 = r0.e();	 Catch:{ aewy -> 0x018f }
        r0 = (com.google.android.libraries.youtube.media.player.exo.libvpx.VpxOutputBuffer) r0;	 Catch:{ aewy -> 0x018f }
        r7.q = r0;	 Catch:{ aewy -> 0x018f }
    L_0x00a2:
        r0 = r7.p;	 Catch:{ aewy -> 0x018f }
        r0 = r0.getFlag(r14);	 Catch:{ aewy -> 0x018f }
        if (r0 == 0) goto L_0x00b4;
    L_0x00aa:
        r7.y = r14;	 Catch:{ aewy -> 0x018f }
        r0 = r7.p;	 Catch:{ aewy -> 0x018f }
        r0.release();	 Catch:{ aewy -> 0x018f }
        r7.p = r11;	 Catch:{ aewy -> 0x018f }
        goto L_0x0101;
    L_0x00b4:
        r0 = r7.q;	 Catch:{ aewy -> 0x018f }
        r2 = -1;
        if (r0 == 0) goto L_0x00bd;
    L_0x00ba:
        r4 = r0.timestampUs;	 Catch:{ aewy -> 0x018f }
        goto L_0x00be;
    L_0x00bd:
        r4 = r2;
    L_0x00be:
        r0 = r7.p;	 Catch:{ aewy -> 0x018f }
        r10 = r0.timestampUs;	 Catch:{ aewy -> 0x018f }
        r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x00c7;
    L_0x00c6:
        goto L_0x00e8;
    L_0x00c7:
        r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x00e8;
    L_0x00cb:
        r0 = r7.a;	 Catch:{ aewy -> 0x018f }
        r2 = r0.h;	 Catch:{ aewy -> 0x018f }
        r2 = r2 + r14;
        r0.h = r2;	 Catch:{ aewy -> 0x018f }
        r0 = r7.C;	 Catch:{ aewy -> 0x018f }
        r0 = r0 + r14;
        r7.C = r0;	 Catch:{ aewy -> 0x018f }
        r2 = r7.h;	 Catch:{ aewy -> 0x018f }
        if (r0 != r2) goto L_0x00de;
    L_0x00db:
        r22.o();	 Catch:{ aewy -> 0x018f }
    L_0x00de:
        r0 = r7.p;	 Catch:{ aewy -> 0x018f }
        r0.release();	 Catch:{ aewy -> 0x018f }
        r0 = 0;
        r7.p = r0;	 Catch:{ aewy -> 0x018f }
        r0 = 1;
        goto L_0x0102;
    L_0x00e8:
        r0 = r7.t;	 Catch:{ aewy -> 0x018f }
        if (r0 != 0) goto L_0x00f2;
    L_0x00ec:
        r22.m();	 Catch:{ aewy -> 0x018f }
        r7.t = r14;	 Catch:{ aewy -> 0x018f }
        goto L_0x0101;
    L_0x00f2:
        r0 = r7.i;	 Catch:{ aewy -> 0x018f }
        r2 = 3;
        if (r0 != r2) goto L_0x0101;
    L_0x00f7:
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r2 = r2 + r8;
        r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x0101;
    L_0x00fe:
        r22.m();	 Catch:{ aewy -> 0x018f }
    L_0x0101:
        r0 = 0;
    L_0x0102:
        r2 = r7.x;	 Catch:{ aewy -> 0x018f }
        if (r2 != 0) goto L_0x0174;
    L_0x0106:
        r2 = r7.o;	 Catch:{ aewy -> 0x018f }
        if (r2 != 0) goto L_0x0118;
    L_0x010a:
        r2 = r7.n;	 Catch:{ aewy -> 0x018f }
        r2 = r2.d();	 Catch:{ aewy -> 0x018f }
        r2 = (defpackage.aewx) r2;	 Catch:{ aewy -> 0x018f }
        r7.o = r2;	 Catch:{ aewy -> 0x018f }
        r2 = r7.o;	 Catch:{ aewy -> 0x018f }
        if (r2 == 0) goto L_0x0174;
    L_0x0118:
        r3 = r7.j;	 Catch:{ aewy -> 0x018f }
        r2 = r2.a;	 Catch:{ aewy -> 0x018f }
        r2 = r7.a(r8, r3, r2);	 Catch:{ aewy -> 0x018f }
        r3 = -2;
        if (r2 != r3) goto L_0x0124;
    L_0x0123:
        goto L_0x0174;
    L_0x0124:
        r3 = -4;
        if (r2 != r3) goto L_0x0135;
    L_0x0127:
        r1 = r7.j;	 Catch:{ aewy -> 0x018f }
        r1 = r1.a;	 Catch:{ aewy -> 0x018f }
        r7.m = r1;	 Catch:{ aewy -> 0x018f }
        r1 = r7.m;	 Catch:{ aewy -> 0x018f }
        r7.b(r1);	 Catch:{ aewy -> 0x018f }
        r1 = 1;
    L_0x0133:
        r2 = 0;
        goto L_0x0176;
    L_0x0135:
        r4 = -1;
        if (r2 != r4) goto L_0x014a;
    L_0x0138:
        r2 = r7.o;	 Catch:{ aewy -> 0x018f }
        r2.setFlag(r14);	 Catch:{ aewy -> 0x018f }
        r2 = r7.n;	 Catch:{ aewy -> 0x018f }
        r4 = r7.o;	 Catch:{ aewy -> 0x018f }
        r2.a(r4);	 Catch:{ aewy -> 0x018f }
        r2 = 0;
        r7.o = r2;	 Catch:{ aewy -> 0x018f }
        r7.x = r14;	 Catch:{ aewy -> 0x018f }
        goto L_0x0133;
    L_0x014a:
        r1 = r7.o;	 Catch:{ aewy -> 0x018f }
        r2 = r7.m;	 Catch:{ aewy -> 0x018f }
        r4 = r2.h;	 Catch:{ aewy -> 0x018f }
        r1.b = r4;	 Catch:{ aewy -> 0x018f }
        r4 = r2.i;	 Catch:{ aewy -> 0x018f }
        r1.c = r4;	 Catch:{ aewy -> 0x018f }
        r2 = r2.p;	 Catch:{ aewy -> 0x018f }
        r1.d = r2;	 Catch:{ aewy -> 0x018f }
        r1 = r1.a;	 Catch:{ aewy -> 0x018f }
        r1 = r1.b();	 Catch:{ aewy -> 0x018f }
        if (r1 == 0) goto L_0x0168;
    L_0x0162:
        r1 = r7.o;	 Catch:{ aewy -> 0x018f }
        r2 = 2;
        r1.setFlag(r2);	 Catch:{ aewy -> 0x018f }
    L_0x0168:
        r1 = r7.n;	 Catch:{ aewy -> 0x018f }
        r2 = r7.o;	 Catch:{ aewy -> 0x018f }
        r1.a(r2);	 Catch:{ aewy -> 0x018f }
        r2 = 0;
        r7.o = r2;	 Catch:{ aewy -> 0x018f }
        r1 = 1;
        goto L_0x0176;
    L_0x0174:
        r2 = 0;
        r3 = -4;
    L_0x0176:
        r0 = r0 | r1;
        if (r0 != 0) goto L_0x017a;
    L_0x0179:
        goto L_0x0185;
    L_0x017a:
        r0 = android.os.SystemClock.elapsedRealtime();	 Catch:{ aewy -> 0x018f }
        r0 = r0 - r12;
        r4 = 50;
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 < 0) goto L_0x018b;
    L_0x0185:
        r0 = r7.a;
        r0.a();
        return;
    L_0x018b:
        r11 = r2;
        r10 = -4;
        goto L_0x0074;
    L_0x018f:
        r0 = move-exception;
        r1 = r7.g;
        if (r1 == 0) goto L_0x01a1;
    L_0x0194:
        r2 = r7.b;
        if (r2 != 0) goto L_0x0199;
    L_0x0198:
        goto L_0x01a1;
    L_0x0199:
        r2 = new aews;
        r2.<init>(r7, r0);
        r1.post(r2);
    L_0x01a1:
        r1 = new nlq;
        r1.<init>(r0);
        throw r1;
    L_0x01a7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aewo.a(long, long, boolean):void");
    }

    /* JADX WARNING: Missing block: B:5:0x001a, code skipped:
            if (r5 != r0) goto L_0x001c;
     */
    private final void m() {
        /*
        r7 = this;
        r0 = r7.a;
        r1 = r0.f;
        r2 = 1;
        r1 = r1 + r2;
        r0.f = r1;
        r0 = r7.p;
        r1 = r0.width;
        r0 = r0.height;
        r3 = r7.A;
        r4 = -1;
        if (r3 == r4) goto L_0x001c;
    L_0x0013:
        r5 = r7.B;
        if (r5 != r4) goto L_0x0018;
    L_0x0017:
        goto L_0x001c;
    L_0x0018:
        if (r3 != r1) goto L_0x001c;
    L_0x001a:
        if (r5 == r0) goto L_0x0030;
    L_0x001c:
        r7.A = r1;
        r7.B = r0;
        r3 = r7.g;
        if (r3 == 0) goto L_0x0030;
    L_0x0024:
        r5 = r7.b;
        if (r5 == 0) goto L_0x0030;
    L_0x0028:
        r5 = new aewr;
        r5.<init>(r7, r1, r0);
        r3.post(r5);
    L_0x0030:
        r0 = r7.p;
        r1 = r0.mode;
        r3 = 0;
        if (r1 != r2) goto L_0x0099;
    L_0x0037:
        r2 = r7.u;
        if (r2 == 0) goto L_0x0099;
    L_0x003b:
        r1 = r7.e;
        r2 = r7.r;
        if (r2 == 0) goto L_0x0053;
    L_0x0041:
        r2 = r2.getWidth();
        r4 = r0.width;
        if (r2 != r4) goto L_0x0053;
    L_0x0049:
        r2 = r7.r;
        r2 = r2.getHeight();
        r4 = r0.height;
        if (r2 == r4) goto L_0x005f;
    L_0x0053:
        r2 = r0.width;
        r4 = r0.height;
        r5 = android.graphics.Bitmap.Config.RGB_565;
        r2 = android.graphics.Bitmap.createBitmap(r2, r4, r5);
        r7.r = r2;
    L_0x005f:
        r2 = r7.r;
        r4 = r0.data;
        r2.copyPixelsFromBuffer(r4);
        r2 = r7.u;
        r2 = r2.lockCanvas(r3);
        if (r1 == 0) goto L_0x0083;
    L_0x006e:
        r1 = r2.getWidth();
        r1 = (float) r1;
        r4 = r0.width;
        r4 = (float) r4;
        r1 = r1 / r4;
        r4 = r2.getHeight();
        r4 = (float) r4;
        r0 = r0.height;
        r0 = (float) r0;
        r4 = r4 / r0;
        r2.scale(r1, r4);
    L_0x0083:
        r0 = r7.r;
        r1 = 0;
        r2.drawBitmap(r0, r1, r1, r3);
        r0 = r7.u;
        r0.unlockCanvasAndPost(r2);
        r0 = r7.u;
        r7.a(r0);
        r0 = r7.p;
        r0.release();
        goto L_0x00d3;
    L_0x0099:
        if (r1 == 0) goto L_0x009f;
    L_0x009b:
        r2 = 3;
        if (r1 == r2) goto L_0x009f;
    L_0x009e:
        goto L_0x00ac;
    L_0x009f:
        r2 = r7.v;
        if (r2 == 0) goto L_0x00ac;
    L_0x00a3:
        r2.a(r0);
        r0 = r7.u;
        r7.a(r0);
        goto L_0x00d3;
    L_0x00ac:
        r2 = 2;
        if (r1 != r2) goto L_0x00d0;
    L_0x00af:
        r1 = r7.u;
        if (r1 == 0) goto L_0x00d0;
    L_0x00b3:
        r2 = r7.n;
        r5 = r2.b;
        r0 = r2.vpxRenderFrame(r5, r1, r0);
        if (r0 == r4) goto L_0x00c8;
    L_0x00bd:
        r0 = r7.u;
        r7.a(r0);
        r0 = r7.p;
        r0.release();
        goto L_0x00d3;
    L_0x00c8:
        r0 = new aewy;
        r1 = "Buffer render failed.";
        r0.<init>(r1);
        throw r0;
    L_0x00d0:
        r0.release();
    L_0x00d3:
        r7.p = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aewo.m():void");
    }

    private final void n() {
        this.o = null;
        VpxOutputBuffer vpxOutputBuffer = this.p;
        if (vpxOutputBuffer != null) {
            vpxOutputBuffer.release();
            this.p = null;
        }
        vpxOutputBuffer = this.q;
        if (vpxOutputBuffer != null) {
            vpxOutputBuffer.release();
            this.q = null;
        }
        this.n.f();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return this.y;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d() {
        return this.m != null && ((this.z || this.p != null) && this.t);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(long j) {
        this.z = false;
        this.x = false;
        this.y = false;
        this.t = false;
        if (this.n != null) {
            n();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void i() {
        this.C = 0;
        this.D = SystemClock.elapsedRealtime();
    }

    /* Access modifiers changed, original: protected|final */
    public final void j() {
        o();
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        this.o = null;
        this.p = null;
        this.m = null;
        try {
            if (this.n != null) {
                n();
                this.n.b();
                this.n = null;
                nlk nlk = this.a;
                nlk.b++;
            }
            super.l();
        } catch (Throwable th) {
            super.l();
        }
    }

    public final void a(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (this.w == 2 && this.u != surface) {
                this.u = surface;
                this.s = false;
            }
        } else if (i == 2) {
            aewz aewz = (aewz) obj;
            if (this.v != aewz) {
                i = this.w;
                if (i == 0 || i == 3) {
                    this.v = aewz;
                    this.s = false;
                }
            }
        }
    }

    private final void o() {
        if (this.g != null && this.b != null && this.C > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = this.C;
            long j = this.D;
            this.C = 0;
            this.D = elapsedRealtime;
            this.g.post(new aewq(this, i, elapsedRealtime - j));
        }
    }

    private final void a(Surface surface) {
        if (!this.s) {
            Handler handler = this.g;
            if (handler != null && this.b != null) {
                handler.post(new aewt(this, surface));
                this.s = true;
            }
        }
    }

    private final void b(nmx nmx) {
        Handler handler = this.g;
        if (handler != null && this.b != null) {
            handler.post(new aewu(this, nmx));
        }
    }
}
