package defpackage;

import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: ohk */
public class ohk implements ofm {
    private static final int a = ozp.f("seig");
    private static final byte[] b = new byte[]{(byte) -94, (byte) 57, (byte) 79, (byte) 82, (byte) 90, (byte) -101, (byte) 79, (byte) 20, (byte) -94, (byte) 68, (byte) 108, (byte) 66, (byte) 124, (byte) 100, (byte) -115, (byte) -12};
    private static final nzw c = nzw.a(null, "application/x-emsg", Long.MAX_VALUE);
    private int A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private ofo F;
    private ofy[] G;
    private ofy[] H;
    private boolean I;
    private final int d;
    private final List e;
    private final SparseArray f;
    private final oza g;
    private final oza h;
    private final oza i;
    private final byte[] j;
    private final oza k;
    private final oza l;
    private final ArrayDeque m;
    private final ArrayDeque n;
    private final ofy o;
    private int p;
    private int q;
    private long r;
    private int s;
    private oza t;
    private long u;
    private int v;
    private long w;
    private long x;
    private long y;
    private ohm z;

    public ohk() {
        this((byte) 0);
    }

    /* Access modifiers changed, original: protected */
    public ohx a(ohx ohx) {
        return ohx;
    }

    public final void c() {
    }

    public ohk(byte b) {
        this(Collections.emptyList(), null);
    }

    public ohk(List list, ofy ofy) {
        this.d = 0;
        this.e = Collections.unmodifiableList(list);
        this.o = ofy;
        this.l = new oza(16);
        this.g = new oza(oyw.a);
        this.h = new oza(5);
        this.i = new oza();
        this.j = new byte[16];
        this.k = new oza(this.j);
        this.m = new ArrayDeque();
        this.n = new ArrayDeque();
        this.f = new SparseArray();
        this.x = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.y = -9223372036854775807L;
        a();
    }

    public final boolean a(ofp ofp) {
        return ohu.a(ofp, true);
    }

    public final void a(ofo ofo) {
        this.F = ofo;
    }

    public final void a(long j, long j2) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((ohm) this.f.valueAt(i)).a();
        }
        this.n.clear();
        this.v = 0;
        this.w = j2;
        this.m.clear();
        this.E = false;
        a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x0251  */
    public final int a(defpackage.ofp r26, defpackage.ofv r27) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r26;
    L_0x0004:
        r2 = r0.p;
        r3 = -1;
        r4 = 2;
        r5 = 0;
        r6 = 8;
        r7 = 1;
        if (r2 == 0) goto L_0x04ac;
    L_0x000e:
        if (r2 == r7) goto L_0x0314;
    L_0x0010:
        r10 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r3 = 3;
        if (r2 == r4) goto L_0x02ba;
    L_0x0018:
        if (r2 != r3) goto L_0x0153;
    L_0x001a:
        r2 = r0.z;
        if (r2 != 0) goto L_0x0081;
    L_0x001e:
        r2 = r0.f;
        r12 = r2.size();
        r13 = r10;
        r10 = 0;
        r11 = r5;
    L_0x0027:
        if (r10 >= r12) goto L_0x0046;
    L_0x0029:
        r15 = r2.valueAt(r10);
        r15 = (defpackage.ohm) r15;
        r9 = r15.g;
        r4 = r15.b;
        r8 = r4.e;
        if (r9 == r8) goto L_0x0042;
    L_0x0037:
        r4 = r4.g;
        r8 = r4[r9];
        r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1));
        if (r4 < 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0042;
    L_0x0040:
        r13 = r8;
        r11 = r15;
    L_0x0042:
        r10 = r10 + 1;
        r4 = 2;
        goto L_0x0027;
    L_0x0046:
        if (r11 == 0) goto L_0x0067;
    L_0x0048:
        r2 = r11.b;
        r2 = r2.g;
        r4 = r11.g;
        r8 = r2[r4];
        r2 = r1;
        r2 = (defpackage.ofl) r2;
        r12 = r2.c;
        r8 = r8 - r12;
        r8 = (int) r8;
        if (r8 >= 0) goto L_0x0061;
    L_0x0059:
        r2 = "FragmentedMp4Extractor";
        r4 = "Ignoring negative offset to sample data.";
        defpackage.oyp.a(r2, r4);
        r8 = 0;
    L_0x0061:
        r1.a(r8);
        r0.z = r11;
        goto L_0x0081;
    L_0x0067:
        r2 = r0.u;
        r4 = r1;
        r4 = (defpackage.ofl) r4;
        r4 = r4.c;
        r2 = r2 - r4;
        r3 = (int) r2;
        if (r3 < 0) goto L_0x0079;
    L_0x0072:
        r1.a(r3);
        r25.a();
        goto L_0x0004;
    L_0x0079:
        r1 = new oae;
        r2 = "Offset to end of mdat was negative.";
        r1.<init>(r2);
        throw r1;
    L_0x0081:
        r2 = r0.z;
        r4 = r2.b;
        r4 = r4.i;
        r8 = r2.e;
        r4 = r4[r8];
        r0.A = r4;
        r9 = r2.h;
        if (r8 >= r9) goto L_0x00c9;
    L_0x0091:
        r1.a(r4);
        r1 = r0.z;
        r2 = r1.c();
        if (r2 == 0) goto L_0x00ba;
    L_0x009c:
        r4 = r1.b;
        r4 = r4.q;
        r2 = r2.d;
        if (r2 == 0) goto L_0x00a7;
    L_0x00a4:
        r4.d(r2);
    L_0x00a7:
        r2 = r1.b;
        r1 = r1.e;
        r1 = r2.c(r1);
        if (r1 == 0) goto L_0x00ba;
    L_0x00b1:
        r1 = r4.e();
        r1 = r1 * 6;
        r4.d(r1);
    L_0x00ba:
        r1 = r0.z;
        r1 = r1.b();
        if (r1 != 0) goto L_0x00c4;
    L_0x00c2:
        r0.z = r5;
    L_0x00c4:
        r0.p = r3;
    L_0x00c6:
        r1 = 0;
        goto L_0x02b9;
    L_0x00c9:
        r2 = r2.c;
        r2 = r2.g;
        if (r2 != r7) goto L_0x00d6;
    L_0x00cf:
        r4 = r4 + -8;
        r0.A = r4;
        r1.a(r6);
    L_0x00d6:
        r2 = r0.z;
        r4 = r2.c();
        if (r4 == 0) goto L_0x0135;
    L_0x00de:
        r6 = r4.d;
        if (r6 == 0) goto L_0x00e7;
    L_0x00e2:
        r4 = r2.b;
        r4 = r4.q;
        goto L_0x00f2;
    L_0x00e7:
        r4 = r4.e;
        r6 = r2.j;
        r8 = r4.length;
        r6.a(r4, r8);
        r4 = r2.j;
        r6 = r8;
    L_0x00f2:
        r8 = r2.b;
        r9 = r2.e;
        r8 = r8.c(r9);
        r9 = r2.i;
        r10 = r9.a;
        if (r8 != 0) goto L_0x0102;
    L_0x0100:
        r11 = 0;
        goto L_0x0104;
    L_0x0102:
        r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
    L_0x0104:
        r11 = r11 | r6;
        r11 = (byte) r11;
        r12 = 0;
        r10[r12] = r11;
        r9.c(r12);
        r9 = r2.a;
        r10 = r2.i;
        r9.a(r10, r7);
        r9 = r2.a;
        r9.a(r4, r6);
        if (r8 == 0) goto L_0x0132;
    L_0x011a:
        r4 = r2.b;
        r4 = r4.q;
        r8 = r4.e();
        r9 = -2;
        r4.d(r9);
        r8 = r8 * 6;
        r9 = 2;
        r8 = r8 + r9;
        r2 = r2.a;
        r2.a(r4, r8);
        r6 = r6 + r7;
        r8 = r8 + r6;
        goto L_0x0136;
    L_0x0132:
        r8 = r6 + 1;
        goto L_0x0136;
    L_0x0135:
        r8 = 0;
    L_0x0136:
        r0.B = r8;
        r2 = r0.A;
        r2 = r2 + r8;
        r0.A = r2;
        r2 = 4;
        r0.p = r2;
        r2 = 0;
        r0.C = r2;
        r2 = r0.z;
        r2 = r2.c;
        r2 = r2.f;
        r2 = r2.i;
        r4 = "audio/ac4";
        r2 = r4.equals(r2);
        r0.E = r2;
    L_0x0153:
        r2 = r0.z;
        r4 = r2.b;
        r6 = r2.c;
        r8 = r2.a;
        r2 = r2.e;
        r9 = r4.b(r2);
        r11 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r14 = r9 * r11;
        r9 = r6.j;
        if (r9 == 0) goto L_0x022a;
    L_0x0169:
        r10 = r0.h;
        r10 = r10.a;
        r11 = 0;
        r10[r11] = r11;
        r10[r7] = r11;
        r12 = 2;
        r10[r12] = r11;
        r11 = r9 + 1;
        r12 = 4;
        r9 = 4 - r9;
    L_0x017a:
        r12 = r0.B;
        r13 = r0.A;
        if (r12 >= r13) goto L_0x025c;
    L_0x0180:
        r12 = r0.C;
        if (r12 != 0) goto L_0x01d4;
    L_0x0184:
        r1.b(r10, r9, r11);
        r12 = r0.h;
        r13 = 0;
        r12.c(r13);
        r12 = r0.h;
        r12 = r12.k();
        if (r12 <= 0) goto L_0x01cc;
    L_0x0195:
        r12 = r12 + -1;
        r0.C = r12;
        r12 = r0.g;
        r12.c(r13);
        r12 = r0.g;
        r13 = 4;
        r8.a(r12, r13);
        r12 = r0.h;
        r8.a(r12, r7);
        r12 = r0.H;
        r12 = r12.length;
        if (r12 <= 0) goto L_0x01bd;
    L_0x01ae:
        r12 = r6.f;
        r12 = r12.i;
        r7 = r10[r13];
        r7 = defpackage.oyw.a(r12, r7);
        if (r7 != 0) goto L_0x01bb;
    L_0x01ba:
        goto L_0x01bd;
    L_0x01bb:
        r7 = 1;
        goto L_0x01be;
    L_0x01bd:
        r7 = 0;
    L_0x01be:
        r0.D = r7;
        r7 = r0.B;
        r7 = r7 + 5;
        r0.B = r7;
        r7 = r0.A;
        r7 = r7 + r9;
        r0.A = r7;
        goto L_0x0227;
    L_0x01cc:
        r1 = new oae;
        r2 = "Invalid NAL length";
        r1.<init>(r2);
        throw r1;
    L_0x01d4:
        r7 = r0.D;
        if (r7 == 0) goto L_0x0216;
    L_0x01d8:
        r7 = r0.i;
        r7.a(r12);
        r7 = r0.i;
        r7 = r7.a;
        r12 = r0.C;
        r13 = 0;
        r1.b(r7, r13, r12);
        r7 = r0.i;
        r12 = r0.C;
        r8.a(r7, r12);
        r7 = r0.C;
        r12 = r0.i;
        r13 = r12.a;
        r12 = r12.c;
        r12 = defpackage.oyw.a(r13, r12);
        r13 = r0.i;
        r3 = r6.f;
        r3 = r3.i;
        r5 = "video/hevc";
        r3 = r5.equals(r3);
        r13.c(r3);
        r3 = r0.i;
        r3.b(r12);
        r3 = r0.i;
        r5 = r0.H;
        defpackage.ose.a(r14, r3, r5);
        goto L_0x021b;
    L_0x0216:
        r3 = 0;
        r7 = r8.a(r1, r12, r3);
    L_0x021b:
        r3 = r0.B;
        r3 = r3 + r7;
        r0.B = r3;
        r3 = r0.C;
        r3 = r3 - r7;
        r0.C = r3;
        r3 = 3;
        r5 = 0;
    L_0x0227:
        r7 = 1;
        goto L_0x017a;
    L_0x022a:
        r3 = r0.E;
        if (r3 != 0) goto L_0x0230;
    L_0x022e:
        r3 = 0;
        goto L_0x024b;
    L_0x0230:
        r3 = r0.A;
        r5 = r0.k;
        defpackage.obg.a(r3, r5);
        r3 = r0.k;
        r5 = r3.c;
        r8.a(r3, r5);
        r3 = r0.A;
        r3 = r3 + r5;
        r0.A = r3;
        r3 = r0.B;
        r3 = r3 + r5;
        r0.B = r3;
        r3 = 0;
        r0.E = r3;
    L_0x024b:
        r5 = r0.B;
        r6 = r0.A;
        if (r5 >= r6) goto L_0x025c;
    L_0x0251:
        r6 = r6 - r5;
        r5 = r8.a(r1, r6, r3);
        r3 = r0.B;
        r3 = r3 + r5;
        r0.B = r3;
        goto L_0x022e;
    L_0x025c:
        r1 = r4.l;
        r1 = r1[r2];
        r2 = r0.z;
        r2 = r2.c();
        if (r2 == 0) goto L_0x026f;
    L_0x0268:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r1 | r3;
        r5 = r2.c;
        r11 = r1;
        goto L_0x0271;
    L_0x026f:
        r11 = r1;
        r5 = 0;
    L_0x0271:
        r12 = r0.A;
        r13 = 0;
        r9 = r14;
        r1 = r14;
        r14 = r5;
        r8.a(r9, r11, r12, r13, r14);
    L_0x027a:
        r3 = r0.n;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x02a9;
    L_0x0282:
        r3 = r0.n;
        r3 = r3.removeFirst();
        r3 = (defpackage.ohn) r3;
        r4 = r0.v;
        r5 = r3.b;
        r4 = r4 - r5;
        r0.v = r4;
        r4 = r3.a;
        r4 = r4 + r1;
        r13 = r0.G;
        r14 = r13.length;
        r15 = 0;
    L_0x0298:
        if (r15 >= r14) goto L_0x027a;
    L_0x029a:
        r6 = r13[r15];
        r9 = 1;
        r10 = r3.b;
        r11 = r0.v;
        r12 = 0;
        r7 = r4;
        r6.a(r7, r9, r10, r11, r12);
        r15 = r15 + 1;
        goto L_0x0298;
    L_0x02a9:
        r1 = r0.z;
        r1 = r1.b();
        if (r1 != 0) goto L_0x02b4;
    L_0x02b1:
        r1 = 0;
        r0.z = r1;
    L_0x02b4:
        r1 = 3;
        r0.p = r1;
        goto L_0x00c6;
    L_0x02b9:
        return r1;
    L_0x02ba:
        r2 = r0.f;
        r2 = r2.size();
        r3 = 0;
        r4 = 0;
    L_0x02c2:
        if (r3 >= r2) goto L_0x02e4;
    L_0x02c4:
        r5 = r0.f;
        r5 = r5.valueAt(r3);
        r5 = (defpackage.ohm) r5;
        r5 = r5.b;
        r6 = r5.r;
        if (r6 == 0) goto L_0x02e1;
    L_0x02d2:
        r5 = r5.d;
        r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1));
        if (r7 >= 0) goto L_0x02e1;
    L_0x02d8:
        r4 = r0.f;
        r4 = r4.valueAt(r3);
        r4 = (defpackage.ohm) r4;
        r10 = r5;
    L_0x02e1:
        r3 = r3 + 1;
        goto L_0x02c2;
    L_0x02e4:
        if (r4 != 0) goto L_0x02eb;
    L_0x02e6:
        r2 = 3;
        r0.p = r2;
        goto L_0x0004;
    L_0x02eb:
        r2 = r1;
        r2 = (defpackage.ofl) r2;
        r2 = r2.c;
        r10 = r10 - r2;
        r2 = (int) r10;
        if (r2 < 0) goto L_0x030c;
    L_0x02f4:
        r1.a(r2);
        r2 = r4.b;
        r3 = r2.q;
        r3 = r3.a;
        r4 = r2.p;
        r5 = 0;
        r1.b(r3, r5, r4);
        r3 = r2.q;
        r3.c(r5);
        r2.r = r5;
        goto L_0x0004;
    L_0x030c:
        r1 = new oae;
        r2 = "Offset to encryption data was negative.";
        r1.<init>(r2);
        throw r1;
    L_0x0314:
        r4 = r0.r;
        r2 = (int) r4;
        r4 = r0.s;
        r2 = r2 - r4;
        r4 = r0.t;
        if (r4 == 0) goto L_0x049b;
    L_0x031e:
        r4 = r4.a;
        r1.b(r4, r6, r2);
        r2 = new oha;
        r4 = r0.q;
        r5 = r0.t;
        r2.<init>(r4, r5);
        r4 = r1;
        r4 = (defpackage.ofl) r4;
        r4 = r4.c;
        r7 = r0.m;
        r7 = r7.isEmpty();
        if (r7 != 0) goto L_0x0348;
    L_0x0339:
        r3 = r0.m;
        r3 = r3.peek();
        r3 = (defpackage.ohb) r3;
        r3.a(r2);
        r4 = r0;
        r0 = r1;
        goto L_0x04a0;
    L_0x0348:
        r7 = r2.bf;
        r8 = defpackage.ogy.P;
        if (r7 != r8) goto L_0x0417;
    L_0x034e:
        r2 = r2.bg;
        r2.c(r6);
        r3 = r2.k();
        r3 = defpackage.ogy.a(r3);
        r6 = 4;
        r2.d(r6);
        r13 = r2.i();
        if (r3 != 0) goto L_0x036e;
    L_0x0365:
        r6 = r2.i();
        r8 = r2.i();
        goto L_0x0376;
    L_0x036e:
        r6 = r2.q();
        r8 = r2.q();
    L_0x0376:
        r4 = r4 + r8;
        r23 = r4;
        r3 = r6;
        r5 = r23;
        r9 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r7 = r3;
        r11 = r13;
        r18 = defpackage.ozp.b(r7, r9, r11);
        r7 = 2;
        r2.d(r7);
        r15 = r2.e();
        r11 = new int[r15];
        r12 = new long[r15];
        r9 = new long[r15];
        r10 = new long[r15];
        r16 = r3;
        r7 = r18;
        r3 = 0;
    L_0x039a:
        if (r3 >= r15) goto L_0x03ec;
    L_0x039c:
        r4 = r2.k();
        r20 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r20 = r4 & r20;
        if (r20 != 0) goto L_0x03e4;
    L_0x03a6:
        r20 = r2.i();
        r22 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r4 = r4 & r22;
        r11[r3] = r4;
        r12[r3] = r5;
        r10[r3] = r7;
        r16 = r16 + r20;
        r20 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r7 = r16;
        r4 = r9;
        r22 = r15;
        r15 = r10;
        r9 = r20;
        r1 = r11;
        r0 = r12;
        r11 = r13;
        r7 = defpackage.ozp.b(r7, r9, r11);
        r9 = r15[r3];
        r9 = r7 - r9;
        r4[r3] = r9;
        r9 = 4;
        r2.d(r9);
        r10 = r1[r3];
        r10 = (long) r10;
        r5 = r5 + r10;
        r3 = r3 + 1;
        r12 = r0;
        r11 = r1;
        r9 = r4;
        r10 = r15;
        r15 = r22;
        r0 = r25;
        r1 = r26;
        goto L_0x039a;
    L_0x03e4:
        r0 = new oae;
        r1 = "Unhandled indirect reference";
        r0.<init>(r1);
        throw r0;
    L_0x03ec:
        r4 = r9;
        r15 = r10;
        r1 = r11;
        r0 = r12;
        r2 = java.lang.Long.valueOf(r18);
        r3 = new ofj;
        r3.<init>(r1, r0, r4, r15);
        r0 = android.util.Pair.create(r2, r3);
        r1 = r0.first;
        r1 = (java.lang.Long) r1;
        r1 = r1.longValue();
        r4 = r25;
        r4.y = r1;
        r1 = r4.F;
        r0 = r0.second;
        r0 = (defpackage.ofu) r0;
        r1.a(r0);
        r0 = 1;
        r4.I = r0;
        goto L_0x0498;
    L_0x0417:
        r4 = r0;
        r0 = r2.bf;
        r1 = defpackage.ogy.aT;
        if (r0 != r1) goto L_0x0498;
    L_0x041e:
        r0 = r2.bg;
        r1 = r4.G;
        if (r1 == 0) goto L_0x0498;
    L_0x0424:
        r1 = r1.length;
        if (r1 == 0) goto L_0x0498;
    L_0x0427:
        r1 = 12;
        r0.c(r1);
        r2 = r0.b();
        r0.r();
        r0.r();
        r9 = r0.i();
        r5 = r0.i();
        r7 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r5 = defpackage.ozp.b(r5, r7, r9);
        r7 = r0.b;
        r8 = r0.a;
        r9 = r7 + -4;
        r10 = 0;
        r8[r9] = r10;
        r9 = r7 + -3;
        r8[r9] = r10;
        r9 = r7 + -2;
        r8[r9] = r10;
        r7 = r7 + r3;
        r8[r7] = r10;
        r3 = r4.G;
        r7 = r3.length;
        r8 = 0;
    L_0x045d:
        if (r8 >= r7) goto L_0x046a;
    L_0x045f:
        r9 = r3[r8];
        r0.c(r1);
        r9.a(r0, r2);
        r8 = r8 + 1;
        goto L_0x045d;
    L_0x046a:
        r0 = r4.y;
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x0489;
    L_0x0475:
        r0 = r0 + r5;
        r3 = r4.G;
        r12 = r3.length;
        r13 = 0;
    L_0x047a:
        if (r13 >= r12) goto L_0x0498;
    L_0x047c:
        r5 = r3[r13];
        r8 = 1;
        r10 = 0;
        r11 = 0;
        r6 = r0;
        r9 = r2;
        r5.a(r6, r8, r9, r10, r11);
        r13 = r13 + 1;
        goto L_0x047a;
    L_0x0489:
        r0 = r4.n;
        r1 = new ohn;
        r1.<init>(r5, r2);
        r0.addLast(r1);
        r0 = r4.v;
        r0 = r0 + r2;
        r4.v = r0;
    L_0x0498:
        r0 = r26;
        goto L_0x04a0;
    L_0x049b:
        r4 = r0;
        r0 = r1;
        r0.a(r2);
    L_0x04a0:
        r1 = r0;
        r1 = (defpackage.ofl) r1;
        r1 = r1.c;
        r4.a(r1);
    L_0x04a8:
        r1 = r0;
        r0 = r4;
        goto L_0x0004;
    L_0x04ac:
        r4 = r0;
        r0 = r1;
        r1 = r4.s;
        if (r1 != 0) goto L_0x04d7;
    L_0x04b2:
        r1 = r4.l;
        r1 = r1.a;
        r2 = 1;
        r5 = 0;
        r1 = r0.a(r1, r5, r6, r2);
        if (r1 == 0) goto L_0x04d6;
    L_0x04be:
        r4.s = r6;
        r1 = r4.l;
        r1.c(r5);
        r1 = r4.l;
        r1 = r1.i();
        r4.r = r1;
        r1 = r4.l;
        r1 = r1.k();
        r4.q = r1;
        goto L_0x04d7;
    L_0x04d6:
        return r3;
    L_0x04d7:
        r1 = r4.r;
        r7 = 1;
        r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r3 != 0) goto L_0x04f4;
    L_0x04df:
        r1 = r4.l;
        r1 = r1.a;
        r0.b(r1, r6, r6);
        r1 = r4.s;
        r1 = r1 + r6;
        r4.s = r1;
        r1 = r4.l;
        r1 = r1.q();
        r4.r = r1;
        goto L_0x0524;
    L_0x04f4:
        r7 = 0;
        r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r3 != 0) goto L_0x0524;
    L_0x04fa:
        r1 = r0;
        r1 = (defpackage.ofl) r1;
        r2 = r1.b;
        r7 = -1;
        r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r5 != 0) goto L_0x0517;
    L_0x0505:
        r5 = r4.m;
        r5 = r5.isEmpty();
        if (r5 != 0) goto L_0x0517;
    L_0x050d:
        r2 = r4.m;
        r2 = r2.peek();
        r2 = (defpackage.ohb) r2;
        r2 = r2.bg;
    L_0x0517:
        r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r5 == 0) goto L_0x0524;
    L_0x051b:
        r7 = r1.c;
        r2 = r2 - r7;
        r1 = r4.s;
        r7 = (long) r1;
        r2 = r2 + r7;
        r4.r = r2;
    L_0x0524:
        r1 = r4.r;
        r3 = r4.s;
        r7 = (long) r3;
        r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r3 < 0) goto L_0x0666;
    L_0x052d:
        r1 = r0;
        r1 = (defpackage.ofl) r1;
        r2 = r1.c;
        r2 = r2 - r7;
        r5 = r4.q;
        r7 = defpackage.ogy.X;
        if (r5 != r7) goto L_0x0555;
    L_0x0539:
        r5 = r4.f;
        r5 = r5.size();
        r7 = 0;
    L_0x0540:
        if (r7 >= r5) goto L_0x0555;
    L_0x0542:
        r8 = r4.f;
        r8 = r8.valueAt(r7);
        r8 = (defpackage.ohm) r8;
        r8 = r8.b;
        r8.b = r2;
        r8.d = r2;
        r8.c = r2;
        r7 = r7 + 1;
        goto L_0x0540;
    L_0x0555:
        r5 = r4.q;
        r7 = defpackage.ogy.u;
        if (r5 != r7) goto L_0x057b;
    L_0x055b:
        r5 = 0;
        r4.z = r5;
        r5 = r4.r;
        r5 = r5 + r2;
        r4.u = r5;
        r1 = r4.I;
        if (r1 != 0) goto L_0x0576;
    L_0x0567:
        r1 = r4.F;
        r5 = new ofw;
        r6 = r4.x;
        r5.<init>(r6, r2);
        r1.a(r5);
        r1 = 1;
        r4.I = r1;
    L_0x0576:
        r1 = 2;
        r4.p = r1;
        goto L_0x04a8;
    L_0x057b:
        r2 = r4.q;
        r3 = defpackage.ogy.Q;
        if (r2 == r3) goto L_0x063f;
    L_0x0581:
        r3 = defpackage.ogy.S;
        if (r2 == r3) goto L_0x063f;
    L_0x0585:
        r3 = defpackage.ogy.T;
        if (r2 == r3) goto L_0x063f;
    L_0x0589:
        r3 = defpackage.ogy.U;
        if (r2 == r3) goto L_0x063f;
    L_0x058d:
        r3 = defpackage.ogy.V;
        if (r2 == r3) goto L_0x063f;
    L_0x0591:
        r3 = defpackage.ogy.X;
        if (r2 == r3) goto L_0x063f;
    L_0x0595:
        r3 = defpackage.ogy.Y;
        if (r2 == r3) goto L_0x063f;
    L_0x0599:
        r3 = defpackage.ogy.Z;
        if (r2 == r3) goto L_0x063f;
    L_0x059d:
        r3 = defpackage.ogy.ac;
        if (r2 == r3) goto L_0x063f;
    L_0x05a1:
        r1 = r4.q;
        r2 = defpackage.ogy.af;
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r1 == r2) goto L_0x060c;
    L_0x05aa:
        r2 = defpackage.ogy.ae;
        if (r1 == r2) goto L_0x060c;
    L_0x05ae:
        r2 = defpackage.ogy.R;
        if (r1 == r2) goto L_0x060c;
    L_0x05b2:
        r2 = defpackage.ogy.P;
        if (r1 == r2) goto L_0x060c;
    L_0x05b6:
        r2 = defpackage.ogy.ag;
        if (r1 == r2) goto L_0x060c;
    L_0x05ba:
        r2 = defpackage.ogy.L;
        if (r1 == r2) goto L_0x060c;
    L_0x05be:
        r2 = defpackage.ogy.M;
        if (r1 == r2) goto L_0x060c;
    L_0x05c2:
        r2 = defpackage.ogy.ab;
        if (r1 == r2) goto L_0x060c;
    L_0x05c6:
        r2 = defpackage.ogy.N;
        if (r1 == r2) goto L_0x060c;
    L_0x05ca:
        r2 = defpackage.ogy.O;
        if (r1 == r2) goto L_0x060c;
    L_0x05ce:
        r2 = defpackage.ogy.ah;
        if (r1 == r2) goto L_0x060c;
    L_0x05d2:
        r2 = defpackage.ogy.ap;
        if (r1 == r2) goto L_0x060c;
    L_0x05d6:
        r2 = defpackage.ogy.aq;
        if (r1 == r2) goto L_0x060c;
    L_0x05da:
        r2 = defpackage.ogy.au;
        if (r1 == r2) goto L_0x060c;
    L_0x05de:
        r2 = defpackage.ogy.at;
        if (r1 == r2) goto L_0x060c;
    L_0x05e2:
        r2 = defpackage.ogy.ar;
        if (r1 == r2) goto L_0x060c;
    L_0x05e6:
        r2 = defpackage.ogy.as;
        if (r1 == r2) goto L_0x060c;
    L_0x05ea:
        r2 = defpackage.ogy.ad;
        if (r1 == r2) goto L_0x060c;
    L_0x05ee:
        r2 = defpackage.ogy.aa;
        if (r1 == r2) goto L_0x060c;
    L_0x05f2:
        r2 = defpackage.ogy.aT;
        if (r1 == r2) goto L_0x060c;
    L_0x05f6:
        r1 = r4.r;
        r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r3 > 0) goto L_0x0604;
    L_0x05fc:
        r1 = 0;
        r4.t = r1;
        r1 = 1;
        r4.p = r1;
        goto L_0x04a8;
    L_0x0604:
        r0 = new oae;
        r1 = "Skipping atom with length > 2147483647 (unsupported).";
        r0.<init>(r1);
        throw r0;
    L_0x060c:
        r1 = r4.s;
        if (r1 != r6) goto L_0x0637;
    L_0x0610:
        r1 = r4.r;
        r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r3 > 0) goto L_0x062f;
    L_0x0616:
        r3 = new oza;
        r2 = (int) r1;
        r3.<init>(r2);
        r4.t = r3;
        r1 = r4.l;
        r1 = r1.a;
        r2 = r4.t;
        r2 = r2.a;
        r3 = 0;
        java.lang.System.arraycopy(r1, r3, r2, r3, r6);
        r1 = 1;
        r4.p = r1;
        goto L_0x04a8;
    L_0x062f:
        r0 = new oae;
        r1 = "Leaf atom with length > 2147483647 (unsupported).";
        r0.<init>(r1);
        throw r0;
    L_0x0637:
        r0 = new oae;
        r1 = "Leaf atom defines extended atom size (unsupported).";
        r0.<init>(r1);
        throw r0;
    L_0x063f:
        r1 = r1.c;
        r5 = r4.r;
        r1 = r1 + r5;
        r5 = -8;
        r1 = r1 + r5;
        r3 = r4.m;
        r5 = new ohb;
        r6 = r4.q;
        r5.<init>(r6, r1);
        r3.push(r5);
        r5 = r4.r;
        r3 = r4.s;
        r7 = (long) r3;
        r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r3 != 0) goto L_0x0661;
    L_0x065c:
        r4.a(r1);
        goto L_0x04a8;
    L_0x0661:
        r25.a();
        goto L_0x04a8;
    L_0x0666:
        r0 = new oae;
        r1 = "Atom size less than header length (unsupported).";
        r0.<init>(r1);
        goto L_0x066f;
    L_0x066e:
        throw r0;
    L_0x066f:
        goto L_0x066e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohk.a(ofp, ofv):int");
    }

    private final void a() {
        this.p = 0;
        this.s = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:185:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x043f  */
    private final void a(long r54) {
        /*
        r53 = this;
        r0 = r53;
    L_0x0002:
        r1 = r0.m;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x07af;
    L_0x000a:
        r1 = r0.m;
        r1 = r1.peek();
        r1 = (defpackage.ohb) r1;
        r1 = r1.bg;
        r3 = (r1 > r54 ? 1 : (r1 == r54 ? 0 : -1));
        if (r3 != 0) goto L_0x07af;
    L_0x0018:
        r1 = r0.m;
        r1 = r1.pop();
        r1 = (defpackage.ohb) r1;
        r2 = r1.bf;
        r3 = defpackage.ogy.Q;
        r8 = 8;
        r9 = 0;
        r10 = 1;
        if (r2 == r3) goto L_0x0606;
    L_0x002a:
        r2 = r1.bf;
        r3 = defpackage.ogy.X;
        if (r2 == r3) goto L_0x0044;
    L_0x0030:
        r2 = r0.m;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0002;
    L_0x0038:
        r2 = r0.m;
        r2 = r2.peek();
        r2 = (defpackage.ohb) r2;
        r2.a(r1);
        goto L_0x0002;
    L_0x0044:
        r2 = r0.f;
        r3 = r0.j;
        r11 = r1.bi;
        r11 = r11.size();
        r12 = 0;
    L_0x004f:
        if (r12 >= r11) goto L_0x0507;
    L_0x0051:
        r14 = r1.bi;
        r14 = r14.get(r12);
        r14 = (defpackage.ohb) r14;
        r15 = r14.bf;
        r13 = defpackage.ogy.Y;
        if (r15 != r13) goto L_0x04eb;
    L_0x005f:
        r13 = defpackage.ogy.M;
        r13 = r14.d(r13);
        r13 = r13.bg;
        r13.c(r8);
        r15 = r13.k();
        r15 = defpackage.ogy.b(r15);
        r6 = r13.k();
        r7 = r2.size();
        if (r7 != r10) goto L_0x0083;
    L_0x007c:
        r6 = r2.valueAt(r9);
        r6 = (defpackage.ohm) r6;
        goto L_0x0089;
    L_0x0083:
        r6 = r2.get(r6);
        r6 = (defpackage.ohm) r6;
    L_0x0089:
        if (r6 == 0) goto L_0x00d4;
    L_0x008b:
        r7 = r15 & 1;
        if (r7 != 0) goto L_0x0090;
    L_0x008f:
        goto L_0x009a;
    L_0x0090:
        r4 = r13.q();
        r7 = r6.b;
        r7.c = r4;
        r7.d = r4;
    L_0x009a:
        r4 = r6.d;
        r5 = r15 & 2;
        if (r5 == 0) goto L_0x00a7;
    L_0x00a0:
        r5 = r13.o();
        r5 = r5 + -1;
        goto L_0x00a9;
    L_0x00a7:
        r5 = r4.a;
    L_0x00a9:
        r7 = r15 & 8;
        if (r7 != 0) goto L_0x00b0;
    L_0x00ad:
        r7 = r4.b;
        goto L_0x00b4;
    L_0x00b0:
        r7 = r13.o();
    L_0x00b4:
        r18 = r15 & 16;
        if (r18 != 0) goto L_0x00bb;
    L_0x00b8:
        r9 = r4.c;
        goto L_0x00bf;
    L_0x00bb:
        r9 = r13.o();
    L_0x00bf:
        r15 = r15 & 32;
        if (r15 != 0) goto L_0x00c6;
    L_0x00c3:
        r4 = r4.d;
        goto L_0x00ca;
    L_0x00c6:
        r4 = r13.o();
    L_0x00ca:
        r13 = r6.b;
        r15 = new ohi;
        r15.<init>(r5, r7, r9, r4);
        r13.a = r15;
        goto L_0x00d5;
    L_0x00d4:
        r6 = 0;
    L_0x00d5:
        if (r6 != 0) goto L_0x00d9;
    L_0x00d7:
        goto L_0x04eb;
    L_0x00d9:
        r4 = r6.b;
        r9 = r11;
        r10 = r4.s;
        r6.a();
        r7 = defpackage.ogy.L;
        r7 = r14.d(r7);
        if (r7 == 0) goto L_0x0108;
    L_0x00e9:
        r7 = defpackage.ogy.L;
        r7 = r14.d(r7);
        r7 = r7.bg;
        r7.c(r8);
        r10 = r7.k();
        r10 = defpackage.ogy.a(r10);
        r5 = 1;
        if (r10 == r5) goto L_0x0104;
    L_0x00ff:
        r10 = r7.i();
        goto L_0x0108;
    L_0x0104:
        r10 = r7.q();
    L_0x0108:
        r13 = r14.bh;
        r15 = r13.size();
        r5 = 0;
        r7 = 0;
        r8 = 0;
    L_0x0111:
        if (r7 >= r15) goto L_0x0144;
    L_0x0113:
        r21 = r13.get(r7);
        r22 = r2;
        r2 = r21;
        r2 = (defpackage.oha) r2;
        r21 = r7;
        r7 = r2.bf;
        r23 = r9;
        r9 = defpackage.ogy.O;
        if (r7 != r9) goto L_0x013a;
    L_0x0127:
        r2 = r2.bg;
        r7 = 12;
        r2.c(r7);
        r9 = r21;
        r2 = r2.o();
        if (r2 <= 0) goto L_0x013c;
    L_0x0136:
        r8 = r8 + r2;
        r5 = r5 + 1;
        goto L_0x013c;
    L_0x013a:
        r9 = r21;
    L_0x013c:
        r2 = r9 + 1;
        r7 = r2;
        r2 = r22;
        r9 = r23;
        goto L_0x0111;
    L_0x0144:
        r22 = r2;
        r23 = r9;
        r2 = 0;
        r6.g = r2;
        r6.f = r2;
        r6.e = r2;
        r2 = r6.b;
        r2.e = r5;
        r2.f = r8;
        r9 = r2.h;
        if (r9 == 0) goto L_0x015c;
    L_0x0159:
        r9 = r9.length;
        if (r9 >= r5) goto L_0x0164;
    L_0x015c:
        r9 = new long[r5];
        r2.g = r9;
        r5 = new int[r5];
        r2.h = r5;
    L_0x0164:
        r5 = r2.i;
        if (r5 != 0) goto L_0x0169;
    L_0x0168:
        goto L_0x016d;
    L_0x0169:
        r5 = r5.length;
        if (r5 < r8) goto L_0x016d;
    L_0x016c:
        goto L_0x0185;
    L_0x016d:
        r8 = r8 * 125;
        r8 = r8 / 100;
        r5 = new int[r8];
        r2.i = r5;
        r5 = new int[r8];
        r2.j = r5;
        r5 = new long[r8];
        r2.k = r5;
        r5 = new boolean[r8];
        r2.l = r5;
        r5 = new boolean[r8];
        r2.n = r5;
    L_0x0185:
        r2 = 0;
        r8 = 0;
        r9 = 0;
    L_0x0188:
        r24 = 0;
        r5 = 16;
        if (r2 < r15) goto L_0x037b;
    L_0x018e:
        r2 = r6.c;
        r6 = r4.a;
        r6 = r6.a;
        r2 = r2.a(r6);
        r6 = defpackage.ogy.ap;
        r6 = r14.d(r6);
        if (r6 == 0) goto L_0x0212;
    L_0x01a0:
        r6 = r6.bg;
        r8 = r2.d;
        r9 = 8;
        r6.c(r9);
        r10 = r6.k();
        r10 = defpackage.ogy.b(r10);
        r11 = 1;
        r10 = r10 & r11;
        if (r10 != r11) goto L_0x01bb;
    L_0x01b5:
        r10 = 16;
        r6.d(r9);
        goto L_0x01bd;
    L_0x01bb:
        r10 = 16;
    L_0x01bd:
        r9 = r6.d();
        r11 = r6.o();
        r13 = r4.f;
        if (r11 != r13) goto L_0x01f1;
    L_0x01c9:
        if (r9 != 0) goto L_0x01e0;
    L_0x01cb:
        r9 = r4.n;
        r13 = 0;
        r15 = 0;
    L_0x01cf:
        if (r13 >= r11) goto L_0x01ed;
    L_0x01d1:
        r5 = r6.d();
        r15 = r15 + r5;
        if (r5 <= r8) goto L_0x01da;
    L_0x01d8:
        r5 = 1;
        goto L_0x01db;
    L_0x01da:
        r5 = 0;
    L_0x01db:
        r9[r13] = r5;
        r13 = r13 + 1;
        goto L_0x01cf;
    L_0x01e0:
        if (r9 <= r8) goto L_0x01e4;
    L_0x01e2:
        r5 = 1;
        goto L_0x01e5;
    L_0x01e4:
        r5 = 0;
    L_0x01e5:
        r15 = r9 * r11;
        r6 = r4.n;
        r8 = 0;
        java.util.Arrays.fill(r6, r8, r11, r5);
    L_0x01ed:
        r4.a(r15);
        goto L_0x0214;
    L_0x01f1:
        r1 = new oae;
        r2 = new java.lang.StringBuilder;
        r3 = 41;
        r2.<init>(r3);
        r3 = "Length mismatch: ";
        r2.append(r3);
        r2.append(r11);
        r3 = ", ";
        r2.append(r3);
        r2.append(r13);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x0212:
        r10 = 16;
    L_0x0214:
        r5 = defpackage.ogy.aq;
        r5 = r14.d(r5);
        if (r5 == 0) goto L_0x0266;
    L_0x021c:
        r6 = r5.bg;
        r5 = 8;
        r6.c(r5);
        r8 = r6.k();
        r9 = defpackage.ogy.b(r8);
        r11 = 1;
        r9 = r9 & r11;
        if (r9 != r11) goto L_0x0232;
    L_0x022f:
        r6.d(r5);
    L_0x0232:
        r9 = r6.o();
        if (r9 != r11) goto L_0x024d;
    L_0x0238:
        r8 = defpackage.ogy.a(r8);
        r10 = r4.d;
        if (r8 == 0) goto L_0x0245;
    L_0x0240:
        r8 = r6.q();
        goto L_0x0249;
    L_0x0245:
        r8 = r6.i();
    L_0x0249:
        r10 = r10 + r8;
        r4.d = r10;
        goto L_0x0266;
    L_0x024d:
        r1 = new oae;
        r2 = new java.lang.StringBuilder;
        r3 = 40;
        r2.<init>(r3);
        r3 = "Unexpected saio entry count: ";
        r2.append(r3);
        r2.append(r9);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x0266:
        r6 = defpackage.ogy.au;
        r6 = r14.d(r6);
        if (r6 == 0) goto L_0x0274;
    L_0x026e:
        r6 = r6.bg;
        r8 = 0;
        defpackage.ohk.a(r6, r8, r4);
    L_0x0274:
        r6 = defpackage.ogy.ar;
        r6 = r14.d(r6);
        r8 = defpackage.ogy.as;
        r8 = r14.d(r8);
        if (r6 != 0) goto L_0x0284;
    L_0x0282:
        goto L_0x033f;
    L_0x0284:
        if (r8 == 0) goto L_0x033f;
    L_0x0286:
        r6 = r6.bg;
        r8 = r8.bg;
        if (r2 == 0) goto L_0x0293;
    L_0x028c:
        r2 = r2.b;
        r28 = r2;
        r2 = 8;
        goto L_0x0297;
    L_0x0293:
        r2 = 8;
        r28 = 0;
    L_0x0297:
        r6.c(r2);
        r2 = r6.k();
        r9 = r6.k();
        r10 = a;
        if (r9 != r10) goto L_0x033f;
    L_0x02a6:
        r2 = defpackage.ogy.a(r2);
        r9 = 4;
        r5 = 1;
        if (r2 != r5) goto L_0x02b1;
    L_0x02ae:
        r6.d(r9);
    L_0x02b1:
        r2 = r6.k();
        if (r2 != r5) goto L_0x0337;
    L_0x02b7:
        r2 = 8;
        r8.c(r2);
        r2 = r8.k();
        r6 = r8.k();
        r10 = a;
        if (r6 != r10) goto L_0x033f;
    L_0x02c8:
        r2 = defpackage.ogy.a(r2);
        if (r2 != r5) goto L_0x02df;
    L_0x02ce:
        r10 = r8.i();
        r2 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1));
        if (r2 == 0) goto L_0x02d7;
    L_0x02d6:
        goto L_0x02e5;
    L_0x02d7:
        r1 = new oae;
        r2 = "Variable length description in sgpd found (unsupported)";
        r1.<init>(r2);
        throw r1;
    L_0x02df:
        r6 = 2;
        if (r2 < r6) goto L_0x02e5;
    L_0x02e2:
        r8.d(r9);
    L_0x02e5:
        r10 = r8.i();
        r24 = 1;
        r2 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1));
        if (r2 != 0) goto L_0x032f;
    L_0x02ef:
        r2 = 1;
        r8.d(r2);
        r5 = r8.d();
        r6 = r5 & 240;
        r31 = r6 >> 4;
        r32 = r5 & 15;
        r5 = r8.d();
        if (r5 != r2) goto L_0x033f;
    L_0x0303:
        r29 = r8.d();
        r5 = 16;
        r6 = new byte[r5];
        r9 = 0;
        r8.a(r6, r9, r5);
        if (r29 != 0) goto L_0x031d;
    L_0x0311:
        r5 = r8.d();
        r10 = new byte[r5];
        r8.a(r10, r9, r5);
        r33 = r10;
        goto L_0x031f;
    L_0x031d:
        r33 = 0;
    L_0x031f:
        r4.m = r2;
        r2 = new ohw;
        r27 = 1;
        r26 = r2;
        r30 = r6;
        r26.<init>(r27, r28, r29, r30, r31, r32, r33);
        r4.o = r2;
        goto L_0x033f;
    L_0x032f:
        r1 = new oae;
        r2 = "Entry count in sgpd != 1 (unsupported).";
        r1.<init>(r2);
        throw r1;
    L_0x0337:
        r1 = new oae;
        r2 = "Entry count in sbgp != 1 (unsupported).";
        r1.<init>(r2);
        throw r1;
    L_0x033f:
        r2 = r14.bh;
        r2 = r2.size();
        r6 = 0;
    L_0x0346:
        if (r6 >= r2) goto L_0x0375;
    L_0x0348:
        r8 = r14.bh;
        r8 = r8.get(r6);
        r8 = (defpackage.oha) r8;
        r9 = r8.bf;
        r10 = defpackage.ogy.at;
        if (r9 != r10) goto L_0x0370;
    L_0x0356:
        r8 = r8.bg;
        r9 = 8;
        r8.c(r9);
        r9 = 16;
        r10 = 0;
        r8.a(r3, r10, r9);
        r10 = b;
        r10 = java.util.Arrays.equals(r3, r10);
        if (r10 != 0) goto L_0x036c;
    L_0x036b:
        goto L_0x0372;
    L_0x036c:
        defpackage.ohk.a(r8, r9, r4);
        goto L_0x0372;
    L_0x0370:
        r9 = 16;
    L_0x0372:
        r6 = r6 + 1;
        goto L_0x0346;
    L_0x0375:
        r34 = r1;
        r26 = r3;
        goto L_0x04f3;
    L_0x037b:
        r17 = 16;
        r19 = r13.get(r2);
        r5 = r19;
        r5 = (defpackage.oha) r5;
        r7 = r5.bf;
        r26 = r3;
        r3 = defpackage.ogy.O;
        if (r7 != r3) goto L_0x04c0;
    L_0x038d:
        r3 = r9 + 1;
        r7 = r5.bg;
        r5 = 8;
        r7.c(r5);
        r5 = r7.k();
        r5 = defpackage.ogy.b(r5);
        r27 = r3;
        r3 = r6.c;
        r28 = r4;
        r4 = r6.b;
        r29 = r6;
        r6 = r4.a;
        r30 = r10;
        r10 = r4.h;
        r11 = r7.o();
        r10[r9] = r11;
        r10 = r4.g;
        r32 = r13;
        r11 = r14;
        r13 = r4.c;
        r10[r9] = r13;
        r33 = r5 & 1;
        if (r33 == 0) goto L_0x03ce;
    L_0x03c1:
        r33 = r11;
        r11 = r7.k();
        r34 = r1;
        r0 = (long) r11;
        r13 = r13 + r0;
        r10[r9] = r13;
        goto L_0x03d2;
    L_0x03ce:
        r34 = r1;
        r33 = r11;
    L_0x03d2:
        r0 = r5 & 4;
        if (r0 != 0) goto L_0x03d8;
    L_0x03d6:
        r0 = 0;
        goto L_0x03d9;
    L_0x03d8:
        r0 = 1;
    L_0x03d9:
        r1 = r6.d;
        if (r0 == 0) goto L_0x03e1;
    L_0x03dd:
        r1 = r7.o();
    L_0x03e1:
        r10 = r5 & 256;
        r11 = r5 & 512;
        r13 = r5 & 1024;
        r14 = r5 & 2048;
        r5 = r3.h;
        if (r5 == 0) goto L_0x040f;
    L_0x03ed:
        r35 = r1;
        r1 = r5.length;
        r36 = r5;
        r5 = 1;
        if (r1 != r5) goto L_0x0411;
    L_0x03f5:
        r1 = r36;
        r18 = 0;
        r36 = r1[r18];
        r1 = (r36 > r24 ? 1 : (r36 == r24 ? 0 : -1));
        if (r1 != 0) goto L_0x0411;
    L_0x03ff:
        r1 = r3.i;
        r36 = r1[r18];
        r38 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = r6;
        r5 = r3.c;
        r40 = r5;
        r24 = defpackage.ozp.b(r36, r38, r40);
        goto L_0x0412;
    L_0x040f:
        r35 = r1;
    L_0x0411:
        r1 = r6;
    L_0x0412:
        r6 = r4.i;
        r5 = r4.j;
        r36 = r15;
        r15 = r4.k;
        r37 = r12;
        r12 = r4.l;
        r38 = r2;
        r2 = r3.b;
        r2 = r4.h;
        r2 = r2[r9];
        r2 = r2 + r8;
        r46 = r5;
        r45 = r6;
        r5 = r3.c;
        if (r9 <= 0) goto L_0x0433;
    L_0x042f:
        r3 = r8;
        r8 = r4.s;
        goto L_0x0436;
    L_0x0433:
        r3 = r8;
        r8 = r30;
    L_0x0436:
        if (r3 < r2) goto L_0x043f;
    L_0x0438:
        r4.s = r8;
        r8 = r2;
        r9 = r27;
        goto L_0x04d3;
    L_0x043f:
        if (r10 != 0) goto L_0x0446;
    L_0x0441:
        r47 = r2;
        r2 = r1.b;
        goto L_0x044c;
    L_0x0446:
        r47 = r2;
        r2 = r7.o();
    L_0x044c:
        if (r11 != 0) goto L_0x0453;
    L_0x044e:
        r48 = r4;
        r4 = r1.c;
        goto L_0x0459;
    L_0x0453:
        r48 = r4;
        r4 = r7.o();
    L_0x0459:
        if (r3 != 0) goto L_0x0462;
    L_0x045b:
        if (r0 == 0) goto L_0x0462;
    L_0x045d:
        r49 = r0;
        r0 = r35;
        goto L_0x046f;
    L_0x0462:
        if (r13 != 0) goto L_0x0469;
    L_0x0464:
        r49 = r0;
        r0 = r1.d;
        goto L_0x046f;
    L_0x0469:
        r49 = r0;
        r0 = r7.k();
    L_0x046f:
        if (r14 == 0) goto L_0x0485;
    L_0x0471:
        r50 = r1;
        r1 = r7.k();
        r51 = r10;
        r52 = r11;
        r10 = (long) r1;
        r39 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r10 = r10 * r39;
        r10 = r10 / r5;
        r1 = (int) r10;
        r46[r3] = r1;
        goto L_0x048e;
    L_0x0485:
        r50 = r1;
        r51 = r10;
        r52 = r11;
        r1 = 0;
        r46[r3] = r1;
    L_0x048e:
        r41 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r39 = r8;
        r43 = r5;
        r10 = defpackage.ozp.b(r39, r41, r43);
        r10 = r10 - r24;
        r15[r3] = r10;
        r45[r3] = r4;
        r0 = r0 >> 16;
        r1 = 1;
        r0 = r0 & r1;
        r0 = r0 ^ r1;
        r1 = r46;
        if (r0 != 0) goto L_0x04a9;
    L_0x04a7:
        r0 = 0;
        goto L_0x04aa;
    L_0x04a9:
        r0 = 1;
    L_0x04aa:
        r12[r3] = r0;
        r10 = (long) r2;
        r8 = r8 + r10;
        r3 = r3 + 1;
        r46 = r1;
        r2 = r47;
        r4 = r48;
        r0 = r49;
        r1 = r50;
        r10 = r51;
        r11 = r52;
        goto L_0x0436;
    L_0x04c0:
        r34 = r1;
        r38 = r2;
        r28 = r4;
        r29 = r6;
        r3 = r8;
        r30 = r10;
        r37 = r12;
        r32 = r13;
        r33 = r14;
        r36 = r15;
    L_0x04d3:
        r2 = r38 + 1;
        r0 = r53;
        r3 = r26;
        r4 = r28;
        r6 = r29;
        r10 = r30;
        r13 = r32;
        r14 = r33;
        r1 = r34;
        r15 = r36;
        r12 = r37;
        goto L_0x0188;
    L_0x04eb:
        r34 = r1;
        r22 = r2;
        r26 = r3;
        r23 = r11;
    L_0x04f3:
        r37 = r12;
        r12 = r37 + 1;
        r0 = r53;
        r2 = r22;
        r11 = r23;
        r3 = r26;
        r1 = r34;
        r8 = 8;
        r9 = 0;
        r10 = 1;
        goto L_0x004f;
    L_0x0507:
        r0 = r1.bh;
        r0 = defpackage.ohk.a(r0);
        r2 = r53;
        if (r0 == 0) goto L_0x05b8;
    L_0x0511:
        r1 = r2.f;
        r1 = r1.size();
        r3 = 0;
    L_0x0518:
        if (r3 >= r1) goto L_0x05b8;
    L_0x051a:
        r4 = r2.f;
        r4 = r4.valueAt(r3);
        r4 = (defpackage.ohm) r4;
        r5 = r4.c;
        r6 = r4.b;
        r6 = r6.a;
        r6 = r6.a;
        r5 = r5.a(r6);
        if (r5 == 0) goto L_0x0533;
    L_0x0530:
        r13 = r5.b;
        goto L_0x0534;
    L_0x0533:
        r13 = 0;
    L_0x0534:
        r5 = r4.a;
        r4 = r4.c;
        r4 = r4.f;
        r31 = r0.a(r13);
        r6 = new nzw;
        r19 = r6;
        r7 = r4.a;
        r20 = r7;
        r7 = r4.b;
        r21 = r7;
        r7 = r4.c;
        r22 = r7;
        r7 = r4.d;
        r23 = r7;
        r7 = r4.e;
        r24 = r7;
        r7 = r4.f;
        r25 = r7;
        r7 = r4.g;
        r26 = r7;
        r7 = r4.h;
        r27 = r7;
        r7 = r4.i;
        r28 = r7;
        r7 = r4.j;
        r29 = r7;
        r7 = r4.k;
        r30 = r7;
        r7 = r4.m;
        r32 = r7;
        r7 = r4.n;
        r34 = r7;
        r7 = r4.o;
        r35 = r7;
        r7 = r4.p;
        r36 = r7;
        r7 = r4.q;
        r37 = r7;
        r7 = r4.r;
        r38 = r7;
        r7 = r4.t;
        r39 = r7;
        r7 = r4.s;
        r40 = r7;
        r7 = r4.u;
        r41 = r7;
        r7 = r4.v;
        r42 = r7;
        r7 = r4.w;
        r43 = r7;
        r7 = r4.x;
        r44 = r7;
        r7 = r4.y;
        r45 = r7;
        r7 = r4.z;
        r46 = r7;
        r7 = r4.A;
        r47 = r7;
        r4 = r4.B;
        r48 = r4;
        r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48);
        r5.a(r6);
        r3 = r3 + 1;
        goto L_0x0518;
    L_0x05b8:
        r0 = r2.w;
        r3 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x0603;
    L_0x05c3:
        r0 = r2.f;
        r0 = r0.size();
        r1 = 0;
    L_0x05ca:
        if (r1 >= r0) goto L_0x05fc;
    L_0x05cc:
        r3 = r2.f;
        r3 = r3.valueAt(r1);
        r3 = (defpackage.ohm) r3;
        r4 = r2.w;
        r4 = defpackage.nyr.a(r4);
        r6 = r3.e;
    L_0x05dc:
        r7 = r3.b;
        r8 = r7.f;
        if (r6 < r8) goto L_0x05e3;
    L_0x05e2:
        goto L_0x05f9;
    L_0x05e3:
        r7 = r7.b(r6);
        r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r9 >= 0) goto L_0x05f9;
    L_0x05eb:
        r7 = r3.b;
        r7 = r7.l;
        r7 = r7[r6];
        if (r7 != 0) goto L_0x05f4;
    L_0x05f3:
        goto L_0x05f6;
    L_0x05f4:
        r3.h = r6;
    L_0x05f6:
        r6 = r6 + 1;
        goto L_0x05dc;
    L_0x05f9:
        r1 = r1 + 1;
        goto L_0x05ca;
    L_0x05fc:
        r6 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r2.w = r6;
    L_0x0603:
        r0 = r2;
        goto L_0x0002;
    L_0x0606:
        r2 = r0;
        r6 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r0 = "Unexpected moov box.";
        r3 = 1;
        defpackage.oxz.b(r3, r0);
        r0 = r1.bh;
        r0 = defpackage.ohk.a(r0);
        r3 = defpackage.ogy.Z;
        r3 = r1.e(r3);
        r4 = new android.util.SparseArray;
        r4.<init>();
        r8 = r3.bh;
        r8 = r8.size();
        r15 = r6;
        r6 = 0;
    L_0x062b:
        if (r6 >= r8) goto L_0x069d;
    L_0x062d:
        r7 = r3.bh;
        r7 = r7.get(r6);
        r7 = (defpackage.oha) r7;
        r9 = r7.bf;
        r10 = defpackage.ogy.N;
        if (r9 != r10) goto L_0x0677;
    L_0x063b:
        r7 = r7.bg;
        r9 = 12;
        r7.c(r9);
        r10 = r7.k();
        r11 = r7.o();
        r12 = r7.o();
        r13 = r7.o();
        r7 = r7.k();
        r10 = java.lang.Integer.valueOf(r10);
        r14 = new ohi;
        r11 = r11 + -1;
        r14.<init>(r11, r12, r13, r7);
        r7 = android.util.Pair.create(r10, r14);
        r10 = r7.first;
        r10 = (java.lang.Integer) r10;
        r10 = r10.intValue();
        r7 = r7.second;
        r7 = (defpackage.ohi) r7;
        r4.put(r10, r7);
    L_0x0674:
        r10 = 8;
        goto L_0x069a;
    L_0x0677:
        r9 = 12;
        r10 = r7.bf;
        r11 = defpackage.ogy.aa;
        if (r10 != r11) goto L_0x0674;
    L_0x067f:
        r7 = r7.bg;
        r10 = 8;
        r7.c(r10);
        r11 = r7.k();
        r11 = defpackage.ogy.a(r11);
        if (r11 == 0) goto L_0x0695;
    L_0x0690:
        r11 = r7.q();
        goto L_0x0699;
    L_0x0695:
        r11 = r7.i();
    L_0x0699:
        r15 = r11;
    L_0x069a:
        r6 = r6 + 1;
        goto L_0x062b;
    L_0x069d:
        r3 = new android.util.SparseArray;
        r3.<init>();
        r6 = r1.bi;
        r6 = r6.size();
        r7 = 0;
    L_0x06a9:
        if (r7 >= r6) goto L_0x06d6;
    L_0x06ab:
        r8 = r1.bi;
        r8 = r8.get(r7);
        r8 = (defpackage.ohb) r8;
        r9 = r8.bf;
        r10 = defpackage.ogy.S;
        if (r9 != r10) goto L_0x06d3;
    L_0x06b9:
        r9 = defpackage.ogy.R;
        r9 = r1.d(r9);
        r13 = 0;
        r14 = 0;
        r10 = r15;
        r12 = r0;
        r8 = defpackage.ohd.a(r8, r9, r10, r12, r13, r14);
        r8 = r2.a(r8);
        if (r8 != 0) goto L_0x06ce;
    L_0x06cd:
        goto L_0x06d3;
    L_0x06ce:
        r9 = r8.a;
        r3.put(r9, r8);
    L_0x06d3:
        r7 = r7 + 1;
        goto L_0x06a9;
    L_0x06d6:
        r0 = r3.size();
        r1 = r2.f;
        r1 = r1.size();
        if (r1 == 0) goto L_0x070f;
    L_0x06e2:
        r1 = r2.f;
        r1 = r1.size();
        if (r1 != r0) goto L_0x06ec;
    L_0x06ea:
        r5 = 1;
        goto L_0x06ed;
    L_0x06ec:
        r5 = 0;
    L_0x06ed:
        defpackage.oxz.b(r5);
        r1 = 0;
    L_0x06f1:
        if (r1 >= r0) goto L_0x0603;
    L_0x06f3:
        r5 = r3.valueAt(r1);
        r5 = (defpackage.ohx) r5;
        r6 = r2.f;
        r7 = r5.a;
        r6 = r6.get(r7);
        r6 = (defpackage.ohm) r6;
        r7 = r5.a;
        r7 = defpackage.ohk.a(r4, r7);
        r6.a(r5, r7);
        r1 = r1 + 1;
        goto L_0x06f1;
    L_0x070f:
        r1 = 0;
    L_0x0710:
        if (r1 >= r0) goto L_0x0742;
    L_0x0712:
        r6 = r3.valueAt(r1);
        r6 = (defpackage.ohx) r6;
        r7 = new ohm;
        r8 = r2.F;
        r9 = r6.b;
        r8 = r8.a(r1, r9);
        r7.<init>(r8);
        r8 = r6.a;
        r8 = defpackage.ohk.a(r4, r8);
        r7.a(r6, r8);
        r8 = r2.f;
        r9 = r6.a;
        r8.put(r9, r7);
        r7 = r2.x;
        r9 = r6.e;
        r6 = java.lang.Math.max(r7, r9);
        r2.x = r6;
        r1 = r1 + 1;
        goto L_0x0710;
    L_0x0742:
        r0 = r2.G;
        if (r0 != 0) goto L_0x0772;
    L_0x0746:
        r0 = 2;
        r0 = new defpackage.ofy[r0];
        r2.G = r0;
        r0 = r2.o;
        if (r0 == 0) goto L_0x0756;
    L_0x074f:
        r1 = r2.G;
        r3 = 0;
        r1[r3] = r0;
        r0 = 1;
        goto L_0x0758;
    L_0x0756:
        r3 = 0;
        r0 = 0;
    L_0x0758:
        r1 = r2.G;
        r0 = java.util.Arrays.copyOf(r1, r0);
        r0 = (defpackage.ofy[]) r0;
        r2.G = r0;
        r0 = r2.G;
        r1 = r0.length;
        r4 = 0;
    L_0x0766:
        if (r4 >= r1) goto L_0x0773;
    L_0x0768:
        r6 = r0[r4];
        r7 = c;
        r6.a(r7);
        r4 = r4 + 1;
        goto L_0x0766;
    L_0x0772:
        r3 = 0;
    L_0x0773:
        r0 = r2.H;
        if (r0 != 0) goto L_0x07a8;
    L_0x0777:
        r0 = r2.e;
        r0 = r0.size();
        r0 = new defpackage.ofy[r0];
        r2.H = r0;
    L_0x0781:
        r0 = r2.H;
        r0 = r0.length;
        if (r3 >= r0) goto L_0x07a8;
    L_0x0786:
        r0 = r2.F;
        r1 = r2.f;
        r1 = r1.size();
        r4 = 1;
        r1 = r1 + r4;
        r1 = r1 + r3;
        r5 = 3;
        r0 = r0.a(r1, r5);
        r1 = r2.e;
        r1 = r1.get(r3);
        r1 = (defpackage.nzw) r1;
        r0.a(r1);
        r1 = r2.H;
        r1[r3] = r0;
        r3 = r3 + 1;
        goto L_0x0781;
    L_0x07a8:
        r0 = r2.F;
        r0.a();
        goto L_0x0603;
    L_0x07af:
        r2 = r0;
        r53.a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohk.a(long):void");
    }

    private static ohi a(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (ohi) sparseArray.valueAt(0);
        }
        return (ohi) oxz.a((ohi) sparseArray.get(i));
    }

    private static void a(oza oza, int i, ohz ohz) {
        oza.c(i + 8);
        i = ogy.b(oza.k());
        if ((i & 1) == 0) {
            boolean z = (i & 2) != 0;
            int o = oza.o();
            int i2 = ohz.f;
            if (o == i2) {
                Arrays.fill(ohz.n, 0, o, z);
                ohz.a(oza.b());
                oza.a(ohz.q.a, 0, ohz.p);
                ohz.q.c(0);
                ohz.r = false;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("Length mismatch: ");
            stringBuilder.append(o);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            throw new oae(stringBuilder.toString());
        }
        throw new oae("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static odq a(List list) {
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            oha oha = (oha) list.get(i);
            if (oha.bf == ogy.ah) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                byte[] bArr = oha.bg.a;
                ohv b = ohs.b(bArr);
                UUID uuid = b != null ? b.a : null;
                if (uuid != null) {
                    list2.add(new ods(uuid, "video/mp4", bArr));
                } else {
                    oyp.a("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
            }
        }
        if (list2 != null) {
            return new odq(list2);
        }
        return null;
    }
}
