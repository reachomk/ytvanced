package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;

/* renamed from: ocx */
public abstract class ocx extends nys implements oyr {
    public final obr e;
    public final oca f;
    public boolean g;
    private final nzy h = new nzy();
    private final odj i = odj.a();
    private odk j;
    private nzw k;
    private int l;
    private int m;
    private odl n;
    private odj o;
    private SimpleOutputBuffer p;
    private odu q;
    private odu r;
    private int s = 0;
    private boolean t;
    private boolean u = true;
    private long v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ocx(Handler handler, obs obs, obq... obqArr) {
        ocm ocm = new ocm(null, obqArr);
        super(1);
        this.e = new obr(handler, obs);
        this.f = ocm;
        ocm.b = new oda(this);
    }

    public abstract odl a(nzw nzw, ExoMediaCrypto exoMediaCrypto);

    public abstract int b(nzw nzw);

    public final oyr c() {
        return this;
    }

    /* Access modifiers changed, original: protected */
    public nzw w() {
        throw null;
    }

    public final int a(nzw nzw) {
        int i = 0;
        if (!oyu.a(nzw.i)) {
            return 0;
        }
        int b = b(nzw);
        if (b > 2) {
            if (ozp.a >= 21) {
                i = 32;
            }
            b |= i | 8;
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:95:0x0182 A:{SYNTHETIC, EDGE_INSN: B:95:0x0182->B:84:0x0182 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0147 A:{Catch:{ obj | obz | occ | oce -> 0x018b }} */
    public final void a(long r11, long r13) {
        /*
        r10 = this;
        r11 = r10.y;
        if (r11 == 0) goto L_0x0010;
    L_0x0004:
        r11 = r10.f;	 Catch:{ oce -> 0x000a }
        r11.c();	 Catch:{ oce -> 0x000a }
        return;
    L_0x000a:
        r11 = move-exception;
        r11 = defpackage.nyy.a(r11);
        throw r11;
    L_0x0010:
        r11 = r10.k;
        r12 = -4;
        r13 = -5;
        r14 = 1;
        if (r11 != 0) goto L_0x003f;
    L_0x0017:
        r11 = r10.i;
        r11.clear();
        r11 = r10.h;
        r0 = r10.i;
        r11 = r10.a(r11, r0, r14);
        if (r11 != r13) goto L_0x002e;
    L_0x0026:
        r11 = r10.h;
        r11 = r11.a;
        r10.c(r11);
        goto L_0x003f;
    L_0x002e:
        if (r11 != r12) goto L_0x003e;
    L_0x0030:
        r11 = r10.i;
        r11 = r11.isEndOfStream();
        defpackage.oxz.b(r11);
        r10.x = r14;
        r10.x();
    L_0x003e:
        return;
    L_0x003f:
        r10.y();
        r11 = r10.n;
        if (r11 == 0) goto L_0x0197;
    L_0x0046:
        r11 = r10.p;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r0 = 2;
        r1 = 0;
        r2 = 0;
        if (r11 != 0) goto L_0x006e;
    L_0x004d:
        r11 = r10.n;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r11.c();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = (defpackage.odm) r11;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = (com.google.android.exoplayer2.decoder.SimpleOutputBuffer) r11;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.p = r11;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r10.p;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 != 0) goto L_0x005e;
    L_0x005d:
        goto L_0x00c5;
    L_0x005e:
        r11 = r11.skippedOutputBufferCount;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 <= 0) goto L_0x006e;
    L_0x0062:
        r3 = r10.j;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r4 = r3.f;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r4 = r4 + r11;
        r3.f = r4;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r10.f;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11.b();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
    L_0x006e:
        r11 = r10.p;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r11.isEndOfStream();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 == 0) goto L_0x008e;
    L_0x0076:
        r11 = r10.s;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 != r0) goto L_0x0083;
    L_0x007a:
        r10.z();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.y();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.u = r14;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        goto L_0x00c5;
    L_0x0083:
        r11 = r10.p;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11.release();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.p = r2;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.x();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        goto L_0x00c5;
    L_0x008e:
        r11 = r10.u;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 == 0) goto L_0x00a8;
    L_0x0092:
        r11 = r10.w();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r3 = r10.f;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r4 = r11.x;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r5 = r11.v;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r6 = r11.w;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r8 = r10.l;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r9 = r10.m;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r7 = 0;
        r3.a(r4, r5, r6, r7, r8, r9);	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.u = r1;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
    L_0x00a8:
        r11 = r10.f;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r3 = r10.p;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r4 = r3.data;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r5 = r3.timeUs;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r11.a(r4, r5);	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 == 0) goto L_0x00c5;
    L_0x00b6:
        r11 = r10.j;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r0 = r11.e;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r0 = r0 + r14;
        r11.e = r0;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r10.p;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11.release();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.p = r2;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        goto L_0x0046;
    L_0x00c5:
        r11 = r10.n;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 == 0) goto L_0x0182;
    L_0x00c9:
        r3 = r10.s;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r3 == r0) goto L_0x0182;
    L_0x00cd:
        r3 = r10.x;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r3 != 0) goto L_0x0182;
    L_0x00d1:
        r3 = r10.o;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r3 == 0) goto L_0x00d6;
    L_0x00d5:
        goto L_0x00e2;
    L_0x00d6:
        r11 = r11.b();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = (defpackage.odj) r11;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.o = r11;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r3 = r10.o;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r3 == 0) goto L_0x0182;
    L_0x00e2:
        r11 = r10.s;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r4 = 4;
        if (r11 != r14) goto L_0x00f7;
    L_0x00e7:
        r3.setFlags(r4);	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r10.n;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r12 = r10.o;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11.a(r12);	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.o = r2;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.s = r0;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        goto L_0x0182;
    L_0x00f7:
        r11 = r10.z;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 != 0) goto L_0x0102;
    L_0x00fb:
        r11 = r10.h;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r10.a(r11, r3, r1);	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        goto L_0x0103;
    L_0x0102:
        r11 = -4;
    L_0x0103:
        r3 = -3;
        if (r11 == r3) goto L_0x0182;
    L_0x0106:
        if (r11 != r13) goto L_0x0110;
    L_0x0108:
        r11 = r10.h;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r11.a;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.c(r11);	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        goto L_0x00c5;
    L_0x0110:
        r11 = r10.o;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r11.isEndOfStream();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 == 0) goto L_0x0124;
    L_0x0118:
        r10.x = r14;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r10.n;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r12 = r10.o;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11.a(r12);	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.o = r2;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        goto L_0x0182;
    L_0x0124:
        r11 = r10.o;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11.c();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r10.q;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 == 0) goto L_0x0142;
    L_0x012d:
        r11 = r11.f();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 == r14) goto L_0x0137;
    L_0x0133:
        if (r11 == r4) goto L_0x0142;
    L_0x0135:
        r11 = 1;
        goto L_0x0143;
    L_0x0137:
        r11 = r10.q;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r11.g();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = defpackage.nyy.a(r11);	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        throw r11;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
    L_0x0142:
        r11 = 0;
    L_0x0143:
        r10.z = r11;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r11 != 0) goto L_0x0182;
    L_0x0147:
        r11 = r10.o;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11.d();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r10.o;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r3 = r10.w;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r3 == 0) goto L_0x016e;
    L_0x0152:
        r3 = r11.isDecodeOnly();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        if (r3 != 0) goto L_0x016e;
    L_0x0158:
        r3 = r11.c;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r5 = r10.v;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r3 = r3 - r5;
        r3 = java.lang.Math.abs(r3);	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r5 = 500000; // 0x7a120 float:7.00649E-40 double:2.47033E-318;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x016c;
    L_0x0168:
        r3 = r11.c;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.v = r3;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
    L_0x016c:
        r10.w = r1;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
    L_0x016e:
        r11 = r10.n;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r3 = r10.o;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11.a(r3);	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.t = r14;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r10.j;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r3 = r11.c;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r3 = r3 + r14;
        r11.c = r3;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r10.o = r2;	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        goto L_0x00c5;
    L_0x0182:
        defpackage.ozn.a();	 Catch:{ obj -> 0x0191, obz -> 0x018f, occ -> 0x018d, obj | obz | occ | oce -> 0x018b }
        r11 = r10.j;
        r11.a();
        goto L_0x0197;
    L_0x018b:
        r11 = move-exception;
        goto L_0x0192;
    L_0x018d:
        r11 = move-exception;
        goto L_0x0192;
    L_0x018f:
        r11 = move-exception;
        goto L_0x0192;
    L_0x0191:
        r11 = move-exception;
    L_0x0192:
        r11 = defpackage.nyy.a(r11);
        throw r11;
    L_0x0197:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocx.a(long, long):void");
    }

    private final void x() {
        this.y = true;
        try {
            this.f.c();
        } catch (oce e) {
            throw nyy.a(e);
        }
    }

    public final boolean v() {
        return this.y && this.f.d();
    }

    public final boolean u() {
        boolean z = true;
        if (!this.f.e()) {
            if (this.k == null || this.z) {
                z = false;
            } else if (t() || this.p != null) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public final long aQ_() {
        if (this.c == 2) {
            B();
        }
        return this.v;
    }

    public final oag a(oag oag) {
        return this.f.a(oag);
    }

    public final oag aR_() {
        return this.f.f();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        this.j = new odk();
        this.e.a(this.j);
        int i = this.a.b;
        if (i != 0) {
            this.f.a(i);
        } else {
            this.f.g();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, boolean z) {
        this.f.i();
        this.v = j;
        this.w = true;
        this.g = true;
        this.x = false;
        this.y = false;
        if (this.n != null) {
            this.z = false;
            if (this.s != 0) {
                z();
                y();
            } else {
                this.o = null;
                SimpleOutputBuffer simpleOutputBuffer = this.p;
                if (simpleOutputBuffer != null) {
                    simpleOutputBuffer.release();
                    this.p = null;
                }
                this.n.d();
                this.t = false;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void p() {
        this.f.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void q() {
        B();
        this.f.h();
    }

    /* Access modifiers changed, original: protected|final */
    public final void r() {
        this.k = null;
        this.u = true;
        this.z = false;
        try {
            A();
            z();
            this.f.j();
        } finally {
            this.e.b(this.j);
        }
    }

    public final void a(int i, Object obj) {
        if (i == 2) {
            this.f.a(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f.a((obi) obj);
        } else if (i == 5) {
            this.f.a((och) obj);
        }
    }

    private final void y() {
        if (this.n == null) {
            ExoMediaCrypto exoMediaCrypto = null;
            a(null);
            odu odu = this.q;
            if (odu != null) {
                exoMediaCrypto = odu.h();
                if (exoMediaCrypto == null && this.q.g() == null) {
                    return;
                }
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.n = a(this.k, exoMediaCrypto);
                ozn.a();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                this.e.a(this.n.a(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                odk odk = this.j;
                odk.a++;
            } catch (obj e) {
                throw nyy.a(e);
            }
        }
    }

    private final void z() {
        this.o = null;
        this.p = null;
        this.s = 0;
        this.t = false;
        odl odl = this.n;
        if (odl != null) {
            odl.e();
            this.n = null;
            odk odk = this.j;
            odk.b++;
        }
        a(null);
    }

    private final void A() {
        this.r = null;
        b(null);
    }

    private final void a(odu odu) {
        odu = this.q;
        this.q = null;
        b(odu);
    }

    private final void b(odu odu) {
        if (odu != null && odu != this.q) {
            odw odw = null;
            odw.a(odu);
        }
    }

    private final void c(nzw nzw) {
        nzw nzw2 = this.k;
        this.k = nzw;
        if ((ozp.a(this.k.l, nzw2 != null ? nzw2.l : null) ^ 1) != 0) {
            if (this.k.l == null) {
                A();
            } else {
                throw nyy.a(new IllegalStateException("Media requires a DrmSessionManager"));
            }
        }
        if (this.t) {
            this.s = 1;
        } else {
            z();
            y();
            this.u = true;
        }
        this.l = nzw.y;
        this.m = nzw.z;
        this.e.a(nzw);
    }

    private final void B() {
        long a = this.f.a(v());
        if (a != Long.MIN_VALUE) {
            if (!this.g) {
                a = Math.max(this.v, a);
            }
            this.v = a;
            this.g = false;
        }
    }
}
