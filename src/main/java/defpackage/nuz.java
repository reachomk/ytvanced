package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: nuz */
public class nuz implements nrc {
    public static final UUID a = new UUID(72057594037932032L, -9223371306706625679L);
    private static final byte[] v = new byte[]{(byte) 49, (byte) 10, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 45, (byte) 45, (byte) 62, (byte) 32, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 10};
    private static final byte[] w = new byte[]{(byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32};
    private final nwz A;
    private final nwz B;
    private final nwz C;
    private final nwz D;
    private final nwz E;
    private final nwz F;
    private final nwz G;
    private final nwz H;
    private final nwz I;
    private ByteBuffer J;
    private boolean K;
    private long L;
    private long M;
    private boolean N;
    private long O;
    private int P;
    private int Q;
    private int[] R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private byte Y;
    private int Z;
    private int aa;
    private int ab;
    private boolean ac;
    public final SparseArray b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public nvb h;
    public boolean i;
    public boolean j;
    public int k;
    public long l;
    public long m;
    public nwo n;
    public nwo o;
    public int p;
    public long q;
    public int r;
    public int s;
    public boolean t;
    public nre u;
    private final nuv x;
    private final nva y;
    private final boolean z;

    public nuz() {
        this(new nut(), 0);
    }

    /* Access modifiers changed, original: protected */
    public int a(int i) {
        switch (i) {
            case 131:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    public final void c() {
    }

    public nuz(byte b) {
        this(new nut(), 1);
    }

    private nuz(nuv nuv, int i) {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.m = -1;
        this.L = -1;
        this.M = -1;
        this.x = nuv;
        this.x.a(new nvc(this));
        boolean z = true;
        if (((i & 1) ^ 1) == 0) {
            z = false;
        }
        this.z = z;
        this.y = new nva();
        this.b = new SparseArray();
        this.C = new nwz(4);
        this.D = new nwz(ByteBuffer.allocate(4).putInt(-1).array());
        this.E = new nwz(4);
        this.A = new nwz(nwv.a);
        this.B = new nwz(4);
        this.F = new nwz();
        this.G = new nwz();
        this.H = new nwz(8);
        this.I = new nwz();
    }

    public final boolean a(nrb nrb) {
        long h;
        nrb nrb2 = nrb;
        nux nux = new nux();
        long j = ((nqx) nrb2).b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        nrb2.c(nux.a.a, 0, 4);
        nux.b = 4;
        for (h = nux.a.h(); h != 440786851; h = ((h << 8) & -256) | ((long) (nux.a.a[0] & 255))) {
            int i2 = nux.b + 1;
            nux.b = i2;
            if (i2 == i) {
                break;
            }
            nrb2.c(nux.a.a, 0, 1);
        }
        long a = nux.a(nrb2);
        h = (long) nux.b;
        if (a != Long.MIN_VALUE && (j == -1 || h + a < j)) {
            while (true) {
                j = (long) nux.b;
                long j3 = h + a;
                if (j < j3) {
                    if (nux.a(nrb2) == Long.MIN_VALUE) {
                        break;
                    }
                    j = nux.a(nrb2);
                    if (j < 0 || j > 2147483647L) {
                        break;
                    } else if (j != 0) {
                        nrb2.b((int) j);
                        nux.b = (int) (((long) nux.b) + j);
                    }
                } else if (j == j3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(nre nre) {
        this.u = nre;
    }

    public final void b() {
        this.M = -1;
        this.p = 0;
        this.x.a();
        this.y.a();
        a();
    }

    public final int a(nrb nrb, nrm nrm) {
        this.ac = false;
        while (!this.ac) {
            if (!this.x.a(nrb)) {
                return -1;
            }
            long j = ((nqx) nrb).c;
            if (this.K) {
                this.L = j;
                nrm.a = this.m;
                this.K = false;
            } else if (this.j) {
                j = this.L;
                if (j != -1) {
                    nrm.a = j;
                    this.L = -1;
                }
            }
            return 1;
        }
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, long j, long j2) {
        if (i == 160) {
            this.t = false;
        } else if (i == 174) {
            this.h = new nvb();
        } else if (i == 187) {
            this.N = false;
        } else if (i == 19899) {
            this.k = -1;
            this.l = -1;
        } else if (i == 20533) {
            this.h.e = true;
        } else if (i == 21968) {
            this.h.p = true;
        } else if (i == 25152) {
        } else {
            if (i == 408125543) {
                long j3 = this.c;
                if (j3 == -1 || j3 == j) {
                    this.c = j;
                    this.d = j2;
                    return;
                }
                throw new nnc("Multiple Segment elements not supported");
            } else if (i != 475249515) {
                if (i == 524531317 && !this.j) {
                    if (!this.z || this.m == -1) {
                        this.u.a(nrq.f);
                        this.j = true;
                    } else {
                        this.K = true;
                    }
                }
            } else {
                this.n = new nwo();
                this.o = new nwo();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Missing block: B:36:0x0054, code skipped:
            if (r8 != 7) goto L_0x006b;
     */
    public void a(int r8, long r9) {
        /*
        r7 = this;
        r0 = 20529; // 0x5031 float:2.8767E-41 double:1.01427E-319;
        r1 = 55;
        r2 = " not supported";
        if (r8 == r0) goto L_0x01d7;
    L_0x0008:
        r0 = 20530; // 0x5032 float:2.8769E-41 double:1.0143E-319;
        r3 = 1;
        if (r8 == r0) goto L_0x01b8;
    L_0x000e:
        r0 = 50;
        r1 = 3;
        r5 = 2;
        r6 = 1;
        switch(r8) {
            case 131: goto L_0x01b2;
            case 155: goto L_0x01ab;
            case 159: goto L_0x01a5;
            case 176: goto L_0x019f;
            case 179: goto L_0x0195;
            case 186: goto L_0x018f;
            case 215: goto L_0x0189;
            case 231: goto L_0x0182;
            case 241: goto L_0x0176;
            case 251: goto L_0x0173;
            case 16980: goto L_0x0152;
            case 17029: goto L_0x012b;
            case 17143: goto L_0x010c;
            case 18401: goto L_0x00e9;
            case 18408: goto L_0x00c8;
            case 21420: goto L_0x00c2;
            case 21432: goto L_0x00a1;
            case 21680: goto L_0x009b;
            case 21682: goto L_0x0095;
            case 21690: goto L_0x008f;
            case 22186: goto L_0x008a;
            case 22203: goto L_0x0085;
            case 25188: goto L_0x007f;
            case 2352003: goto L_0x0079;
            case 2807729: goto L_0x0076;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = 7;
        r2 = 6;
        switch(r8) {
            case 21945: goto L_0x0066;
            case 21946: goto L_0x0047;
            case 21947: goto L_0x0028;
            case 21948: goto L_0x0022;
            case 21949: goto L_0x001c;
            default: goto L_0x001b;
        };
    L_0x001b:
        return;
    L_0x001c:
        r8 = r7.h;
        r10 = (int) r9;
        r8.u = r10;
        return;
    L_0x0022:
        r8 = r7.h;
        r10 = (int) r9;
        r8.t = r10;
        return;
    L_0x0028:
        r8 = r7.h;
        r8.p = r6;
        r10 = (int) r9;
        if (r10 == r6) goto L_0x0044;
    L_0x002f:
        r9 = 9;
        if (r10 == r9) goto L_0x0041;
    L_0x0033:
        r9 = 4;
        if (r10 == r9) goto L_0x003e;
    L_0x0036:
        r9 = 5;
        if (r10 == r9) goto L_0x003e;
    L_0x0039:
        if (r10 == r2) goto L_0x003e;
    L_0x003b:
        if (r10 == r0) goto L_0x003e;
    L_0x003d:
        goto L_0x006b;
    L_0x003e:
        r8.q = r5;
        return;
    L_0x0041:
        r8.q = r2;
        return;
    L_0x0044:
        r8.q = r6;
        return;
    L_0x0047:
        r8 = (int) r9;
        if (r8 == r6) goto L_0x0061;
    L_0x004a:
        r9 = 16;
        if (r8 == r9) goto L_0x005c;
    L_0x004e:
        r9 = 18;
        if (r8 == r9) goto L_0x0057;
    L_0x0052:
        if (r8 == r2) goto L_0x0061;
    L_0x0054:
        if (r8 == r0) goto L_0x0061;
    L_0x0056:
        goto L_0x006b;
    L_0x0057:
        r8 = r7.h;
        r8.r = r0;
        return;
    L_0x005c:
        r8 = r7.h;
        r8.r = r2;
        return;
    L_0x0061:
        r8 = r7.h;
        r8.r = r1;
        return;
    L_0x0066:
        r8 = (int) r9;
        if (r8 == r6) goto L_0x0071;
    L_0x0069:
        if (r8 == r5) goto L_0x006c;
    L_0x006b:
        return;
    L_0x006c:
        r8 = r7.h;
        r8.s = r6;
        return;
    L_0x0071:
        r8 = r7.h;
        r8.s = r5;
        return;
    L_0x0076:
        r7.e = r9;
        return;
    L_0x0079:
        r8 = r7.h;
        r10 = (int) r9;
        r8.d = r10;
        return;
    L_0x007f:
        r8 = r7.h;
        r10 = (int) r9;
        r8.G = r10;
        return;
    L_0x0085:
        r8 = r7.h;
        r8.J = r9;
        return;
    L_0x008a:
        r8 = r7.h;
        r8.I = r9;
        return;
    L_0x008f:
        r8 = r7.h;
        r10 = (int) r9;
        r8.l = r10;
        return;
    L_0x0095:
        r8 = r7.h;
        r10 = (int) r9;
        r8.m = r10;
        return;
    L_0x009b:
        r8 = r7.h;
        r10 = (int) r9;
        r8.k = r10;
        return;
    L_0x00a1:
        r8 = (int) r9;
        if (r8 == 0) goto L_0x00bc;
    L_0x00a4:
        if (r8 == r6) goto L_0x00b7;
    L_0x00a6:
        if (r8 == r1) goto L_0x00b2;
    L_0x00a8:
        r9 = 15;
        if (r8 == r9) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00c1;
    L_0x00ad:
        r8 = r7.h;
        r8.o = r1;
        return;
    L_0x00b2:
        r8 = r7.h;
        r8.o = r6;
        return;
    L_0x00b7:
        r8 = r7.h;
        r8.o = r5;
        return;
    L_0x00bc:
        r8 = r7.h;
        r9 = 0;
        r8.o = r9;
    L_0x00c1:
        return;
    L_0x00c2:
        r0 = r7.c;
        r9 = r9 + r0;
        r7.l = r9;
        return;
    L_0x00c8:
        r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r8 != 0) goto L_0x00cd;
    L_0x00cc:
        return;
    L_0x00cd:
        r8 = new nnc;
        r0 = new java.lang.StringBuilder;
        r1 = 56;
        r0.<init>(r1);
        r1 = "AESSettingsCipherMode ";
        r0.append(r1);
        r0.append(r9);
        r0.append(r2);
        r9 = r0.toString();
        r8.<init>(r9);
        throw r8;
    L_0x00e9:
        r0 = 5;
        r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r8 != 0) goto L_0x00f0;
    L_0x00ef:
        return;
    L_0x00f0:
        r8 = new nnc;
        r0 = new java.lang.StringBuilder;
        r1 = 49;
        r0.<init>(r1);
        r1 = "ContentEncAlgo ";
        r0.append(r1);
        r0.append(r9);
        r0.append(r2);
        r9 = r0.toString();
        r8.<init>(r9);
        throw r8;
    L_0x010c:
        r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r8 != 0) goto L_0x0111;
    L_0x0110:
        return;
    L_0x0111:
        r8 = new nnc;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "EBMLReadVersion ";
        r1.append(r0);
        r1.append(r9);
        r1.append(r2);
        r9 = r1.toString();
        r8.<init>(r9);
        throw r8;
    L_0x012b:
        r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r8 < 0) goto L_0x0136;
    L_0x012f:
        r0 = 2;
        r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r8 > 0) goto L_0x0136;
    L_0x0135:
        return;
    L_0x0136:
        r8 = new nnc;
        r0 = new java.lang.StringBuilder;
        r1 = 53;
        r0.<init>(r1);
        r1 = "DocTypeReadVersion ";
        r0.append(r1);
        r0.append(r9);
        r0.append(r2);
        r9 = r0.toString();
        r8.<init>(r9);
        throw r8;
    L_0x0152:
        r3 = 3;
        r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r8 != 0) goto L_0x0159;
    L_0x0158:
        return;
    L_0x0159:
        r8 = new nnc;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "ContentCompAlgo ";
        r1.append(r0);
        r1.append(r9);
        r1.append(r2);
        r9 = r1.toString();
        r8.<init>(r9);
        throw r8;
    L_0x0173:
        r7.t = r6;
        return;
    L_0x0176:
        r8 = r7.N;
        if (r8 != 0) goto L_0x0181;
    L_0x017a:
        r8 = r7.o;
        r8.a(r9);
        r7.N = r6;
    L_0x0181:
        return;
    L_0x0182:
        r8 = r7.a(r9);
        r7.M = r8;
        return;
    L_0x0189:
        r8 = r7.h;
        r10 = (int) r9;
        r8.b = r10;
        return;
    L_0x018f:
        r8 = r7.h;
        r10 = (int) r9;
        r8.j = r10;
        return;
    L_0x0195:
        r8 = r7.n;
        r9 = r7.a(r9);
        r8.a(r9);
        return;
    L_0x019f:
        r8 = r7.h;
        r10 = (int) r9;
        r8.i = r10;
        return;
    L_0x01a5:
        r8 = r7.h;
        r10 = (int) r9;
        r8.F = r10;
        return;
    L_0x01ab:
        r8 = r7.a(r9);
        r7.O = r8;
        return;
    L_0x01b2:
        r8 = r7.h;
        r10 = (int) r9;
        r8.c = r10;
        return;
    L_0x01b8:
        r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r8 != 0) goto L_0x01bd;
    L_0x01bc:
        return;
    L_0x01bd:
        r8 = new nnc;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r1);
        r1 = "ContentEncodingScope ";
        r0.append(r1);
        r0.append(r9);
        r0.append(r2);
        r9 = r0.toString();
        r8.<init>(r9);
        throw r8;
    L_0x01d7:
        r3 = 0;
        r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r8 != 0) goto L_0x01de;
    L_0x01dd:
        return;
    L_0x01de:
        r8 = new nnc;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r1);
        r1 = "ContentEncodingOrder ";
        r0.append(r1);
        r0.append(r9);
        r0.append(r2);
        r9 = r0.toString();
        r8.<init>(r9);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuz.a(int, long):void");
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Missing block: B:78:0x01f4, code skipped:
            throw new defpackage.nnc("EBML lacing sample size out of range.");
     */
    public void a(int r20, int r21, defpackage.nrb r22) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r21;
        r3 = r22;
        r4 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r5 = 4;
        r6 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r7 = 0;
        if (r1 == r4) goto L_0x008d;
    L_0x0010:
        if (r1 == r6) goto L_0x008d;
    L_0x0012:
        r4 = 16981; // 0x4255 float:2.3795E-41 double:8.3897E-320;
        if (r1 == r4) goto L_0x0081;
    L_0x0016:
        r4 = 18402; // 0x47e2 float:2.5787E-41 double:9.092E-320;
        if (r1 == r4) goto L_0x0075;
    L_0x001a:
        r4 = 21419; // 0x53ab float:3.0014E-41 double:1.05824E-319;
        if (r1 == r4) goto L_0x0057;
    L_0x001e:
        r4 = 25506; // 0x63a2 float:3.5742E-41 double:1.26016E-319;
        if (r1 == r4) goto L_0x004b;
    L_0x0022:
        r4 = 30322; // 0x7672 float:4.249E-41 double:1.4981E-319;
        if (r1 != r4) goto L_0x0032;
    L_0x0026:
        r1 = r0.h;
        r4 = new byte[r2];
        r1.n = r4;
        r1 = r1.n;
        r3.b(r1, r7, r2);
        return;
    L_0x0032:
        r2 = new nnc;
        r3 = new java.lang.StringBuilder;
        r4 = 26;
        r3.<init>(r4);
        r4 = "Unexpected id: ";
        r3.append(r4);
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
    L_0x004b:
        r1 = r0.h;
        r4 = new byte[r2];
        r1.h = r4;
        r1 = r1.h;
        r3.b(r1, r7, r2);
        return;
    L_0x0057:
        r1 = r0.E;
        r1 = r1.a;
        java.util.Arrays.fill(r1, r7);
        r1 = r0.E;
        r1 = r1.a;
        r5 = r5 - r2;
        r3.b(r1, r5, r2);
        r1 = r0.E;
        r1.c(r7);
        r1 = r0.E;
        r1 = r1.h();
        r2 = (int) r1;
        r0.k = r2;
        return;
    L_0x0075:
        r1 = r0.h;
        r4 = new byte[r2];
        r1.g = r4;
        r1 = r1.g;
        r3.b(r1, r7, r2);
        return;
    L_0x0081:
        r1 = r0.h;
        r4 = new byte[r2];
        r1.f = r4;
        r1 = r1.f;
        r3.b(r1, r7, r2);
        return;
    L_0x008d:
        r4 = r0.p;
        r8 = -1;
        r10 = 8;
        r11 = 1;
        if (r4 != 0) goto L_0x00ae;
    L_0x0096:
        r4 = r0.y;
        r12 = r4.a(r3, r7, r11, r10);
        r4 = (int) r12;
        r0.r = r4;
        r4 = r0.y;
        r4 = r4.a;
        r0.S = r4;
        r0.O = r8;
        r0.p = r11;
        r4 = r0.C;
        r4.a();
    L_0x00ae:
        r4 = r0.b;
        r12 = r0.r;
        r4 = r4.get(r12);
        r4 = (defpackage.nvb) r4;
        if (r4 != 0) goto L_0x00c4;
    L_0x00ba:
        r1 = r0.S;
        r1 = r2 - r1;
        r3.a(r1);
        r0.p = r7;
        return;
    L_0x00c4:
        r12 = r0.p;
        if (r12 != r11) goto L_0x025d;
    L_0x00c8:
        r12 = 3;
        r0.a(r3, r12);
        r13 = r0.C;
        r13 = r13.a;
        r14 = 2;
        r13 = r13[r14];
        r13 = r13 & 6;
        r13 = r13 >> r11;
        r15 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r13 != 0) goto L_0x00ef;
    L_0x00da:
        r0.Q = r11;
        r5 = r0.R;
        r5 = defpackage.nuz.a(r5, r11);
        r0.R = r5;
        r5 = r0.R;
        r8 = r0.S;
        r2 = r2 - r8;
        r2 = r2 + -3;
        r5[r7] = r2;
        goto L_0x0207;
    L_0x00ef:
        if (r1 != r6) goto L_0x0255;
    L_0x00f1:
        r0.a(r3, r5);
        r5 = r0.C;
        r5 = r5.a;
        r5 = r5[r12];
        r5 = r5 & r15;
        r5 = r5 + r11;
        r0.Q = r5;
        r6 = r0.R;
        r5 = defpackage.nuz.a(r6, r5);
        r0.R = r5;
        if (r13 != r14) goto L_0x0117;
    L_0x0108:
        r5 = r0.S;
        r6 = r0.Q;
        r2 = r2 - r5;
        r2 = r2 + -4;
        r2 = r2 / r6;
        r5 = r0.R;
        java.util.Arrays.fill(r5, r7, r6, r2);
        goto L_0x0207;
    L_0x0117:
        if (r13 != r11) goto L_0x0153;
    L_0x0119:
        r5 = 0;
        r6 = 0;
        r16 = 4;
    L_0x011d:
        r8 = r0.Q;
        r8 = r8 + -1;
        if (r5 >= r8) goto L_0x0147;
    L_0x0123:
        r8 = r0.R;
        r8[r5] = r7;
    L_0x0127:
        r8 = r16 + 1;
        r0.a(r3, r8);
        r9 = r0.C;
        r9 = r9.a;
        r12 = r8 + -1;
        r9 = r9[r12];
        r9 = r9 & r15;
        r12 = r0.R;
        r13 = r12[r5];
        r13 = r13 + r9;
        r12[r5] = r13;
        if (r9 == r15) goto L_0x0144;
    L_0x013e:
        r6 = r6 + r13;
        r5 = r5 + 1;
        r16 = r8;
        goto L_0x011d;
    L_0x0144:
        r16 = r8;
        goto L_0x0127;
    L_0x0147:
        r5 = r0.R;
        r9 = r0.S;
        r2 = r2 - r9;
        r2 = r2 - r16;
        r2 = r2 - r6;
        r5[r8] = r2;
        goto L_0x0207;
    L_0x0153:
        if (r13 != r12) goto L_0x024d;
    L_0x0155:
        r5 = 0;
        r6 = 0;
        r16 = 4;
    L_0x0159:
        r12 = r0.Q;
        r12 = r12 + -1;
        if (r5 >= r12) goto L_0x01fd;
    L_0x015f:
        r12 = r0.R;
        r12[r5] = r7;
        r12 = r16 + 1;
        r0.a(r3, r12);
        r13 = r12 + -1;
        r14 = r0.C;
        r14 = r14.a;
        r14 = r14[r13];
        if (r14 == 0) goto L_0x01f5;
    L_0x0172:
        r14 = 0;
    L_0x0173:
        if (r14 >= r10) goto L_0x01c1;
    L_0x0175:
        r16 = 7 - r14;
        r16 = r11 << r16;
        r11 = r0.C;
        r11 = r11.a;
        r11 = r11[r13];
        r11 = r11 & r16;
        if (r11 == 0) goto L_0x01b8;
    L_0x0183:
        r12 = r12 + r14;
        r0.a(r3, r12);
        r11 = r13 + 1;
        r7 = r0.C;
        r7 = r7.a;
        r7 = r7[r13];
        r7 = r7 & r15;
        r13 = r16 ^ -1;
        r7 = r7 & r13;
        r8 = (long) r7;
    L_0x0194:
        if (r11 >= r12) goto L_0x01a6;
    L_0x0196:
        r7 = r11 + 1;
        r8 = r8 << r10;
        r13 = r0.C;
        r13 = r13.a;
        r11 = r13[r11];
        r11 = r11 & r15;
        r10 = (long) r11;
        r8 = r8 | r10;
        r11 = r7;
        r10 = 8;
        goto L_0x0194;
    L_0x01a6:
        if (r5 <= 0) goto L_0x01b5;
    L_0x01a8:
        r10 = 1;
        r14 = r14 * 7;
        r14 = r14 + 6;
        r10 = r10 << r14;
        r17 = -1;
        r10 = r10 + r17;
        r8 = r8 - r10;
        goto L_0x01c5;
    L_0x01b5:
        r17 = -1;
        goto L_0x01c5;
    L_0x01b8:
        r17 = r8;
        r14 = r14 + 1;
        r7 = 0;
        r10 = 8;
        r11 = 1;
        goto L_0x0173;
    L_0x01c1:
        r17 = r8;
        r8 = 0;
    L_0x01c5:
        r16 = r12;
        r10 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r7 < 0) goto L_0x01ed;
    L_0x01ce:
        r10 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r7 > 0) goto L_0x01ed;
    L_0x01d5:
        r7 = (int) r8;
        r8 = r0.R;
        if (r5 == 0) goto L_0x01df;
    L_0x01da:
        r9 = r5 + -1;
        r9 = r8[r9];
        r7 = r7 + r9;
    L_0x01df:
        r8[r5] = r7;
        r6 = r6 + r7;
        r5 = r5 + 1;
        r8 = r17;
        r7 = 0;
        r10 = 8;
        r11 = 1;
        r14 = 2;
        goto L_0x0159;
    L_0x01ed:
        r1 = new nnc;
        r2 = "EBML lacing sample size out of range.";
        r1.<init>(r2);
        throw r1;
    L_0x01f5:
        r1 = new nnc;
        r2 = "No valid varint length mask found";
        r1.<init>(r2);
        throw r1;
    L_0x01fd:
        r5 = r0.R;
        r7 = r0.S;
        r2 = r2 - r7;
        r2 = r2 - r16;
        r2 = r2 - r6;
        r5[r12] = r2;
    L_0x0207:
        r2 = r0.C;
        r2 = r2.a;
        r5 = 0;
        r6 = r2[r5];
        r5 = 1;
        r2 = r2[r5];
        r7 = r0.M;
        r5 = 8;
        r6 = r6 << r5;
        r2 = r2 & r15;
        r2 = r2 | r6;
        r5 = (long) r2;
        r5 = r0.a(r5);
        r7 = r7 + r5;
        r0.q = r7;
        r2 = r0.C;
        r2 = r2.a;
        r5 = 2;
        r2 = r2[r5];
        r6 = r2 & 8;
        r7 = r4.c;
        if (r7 != r5) goto L_0x0231;
    L_0x022d:
        r2 = 1;
    L_0x022e:
        r5 = 8;
        goto L_0x023d;
    L_0x0231:
        r5 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        if (r1 != r5) goto L_0x023b;
    L_0x0235:
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r2 & r5;
        if (r2 != r5) goto L_0x023b;
    L_0x023a:
        goto L_0x022d;
    L_0x023b:
        r2 = 0;
        goto L_0x022e;
    L_0x023d:
        if (r6 != r5) goto L_0x0242;
    L_0x023f:
        r7 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        goto L_0x0243;
    L_0x0242:
        r7 = 0;
    L_0x0243:
        r2 = r2 | r7;
        r0.s = r2;
        r2 = 2;
        r0.p = r2;
        r2 = 0;
        r0.P = r2;
        goto L_0x025d;
    L_0x024d:
        r1 = new nnc;
        r2 = "Unexpected lacing value: 2";
        r1.<init>(r2);
        throw r1;
    L_0x0255:
        r1 = new nnc;
        r2 = "Lacing only supported in SimpleBlocks.";
        r1.<init>(r2);
        throw r1;
    L_0x025d:
        r2 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        if (r1 != r2) goto L_0x0288;
    L_0x0261:
        r1 = r0.P;
        r2 = r0.Q;
        if (r1 >= r2) goto L_0x0284;
    L_0x0267:
        r2 = r0.R;
        r1 = r2[r1];
        r0.a(r3, r4, r1);
        r1 = r0.q;
        r5 = r0.P;
        r6 = r4.d;
        r5 = r5 * r6;
        r5 = r5 / 1000;
        r5 = (long) r5;
        r1 = r1 + r5;
        r0.a(r4, r1);
        r1 = r0.P;
        r2 = 1;
        r1 = r1 + r2;
        r0.P = r1;
        goto L_0x0261;
    L_0x0284:
        r1 = 0;
        r0.p = r1;
        return;
    L_0x0288:
        r1 = 0;
        r2 = r0.R;
        r1 = r2[r1];
        r0.a(r3, r4, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuz.a(int, int, nrb):void");
    }

    public final void a(nvb nvb, long j) {
        if ("S_TEXT/UTF8".equals(nvb.a)) {
            Object obj;
            byte[] bArr = this.G.a;
            long j2 = this.O;
            if (j2 == -1) {
                obj = w;
            } else {
                j2 -= ((long) ((int) (j2 / 3600000000L))) * 3600000000L;
                int i = (int) ((j2 - ((long) (60000000 * ((int) (j2 / 60000000))))) / 1000000);
                obj = String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(r8), Integer.valueOf(r5), Integer.valueOf(i), Integer.valueOf((int) ((j2 - ((long) (i * 1000000))) / 1000))}).getBytes();
            }
            System.arraycopy(obj, 0, bArr, 19, 12);
            nrs nrs = nvb.L;
            nwz nwz = this.G;
            nrs.a(nwz, nwz.c);
            this.ab += this.G.c;
        }
        nvb.L.a(j, this.s, this.ab, 0, nvb.g);
        this.ac = true;
        a();
    }

    private final void a() {
        this.T = 0;
        this.ab = 0;
        this.aa = 0;
        this.U = false;
        this.V = false;
        this.X = false;
        this.Z = 0;
        this.Y = (byte) 0;
        this.W = false;
        this.F.a();
    }

    private final void a(nrb nrb, int i) {
        nwz nwz = this.C;
        if (nwz.c < i) {
            byte[] bArr;
            if (nwz.c() < i) {
                nwz = this.C;
                bArr = nwz.a;
                int length = bArr.length;
                nwz.a(Arrays.copyOf(bArr, Math.max(length + length, i)), this.C.c);
            }
            nwz = this.C;
            bArr = nwz.a;
            int i2 = nwz.c;
            nrb.b(bArr, i2, i - i2);
            this.C.b(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0207  */
    private final void a(defpackage.nrb r10, defpackage.nvb r11, int r12) {
        /*
        r9 = this;
        r0 = r11.a;
        r1 = "S_TEXT/UTF8";
        r0 = r1.equals(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x0038;
    L_0x000b:
        r11 = v;
        r11 = r11.length;
        r11 = r11 + r12;
        r0 = r9.G;
        r0 = r0.c();
        if (r0 >= r11) goto L_0x0023;
    L_0x0017:
        r0 = r9.G;
        r2 = v;
        r3 = r11 + r12;
        r2 = java.util.Arrays.copyOf(r2, r3);
        r0.a = r2;
    L_0x0023:
        r0 = r9.G;
        r0 = r0.a;
        r2 = v;
        r2 = r2.length;
        r10.b(r0, r2, r12);
        r10 = r9.G;
        r10.c(r1);
        r10 = r9.G;
        r10.b(r11);
        return;
    L_0x0038:
        r0 = r11.L;
        r2 = r9.U;
        r3 = 2;
        r4 = 1;
        if (r2 != 0) goto L_0x0180;
    L_0x0040:
        r2 = r11.e;
        if (r2 == 0) goto L_0x0174;
    L_0x0044:
        r2 = r9.s;
        r2 = r2 & -3;
        r9.s = r2;
        r2 = r9.V;
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 != 0) goto L_0x0073;
    L_0x0050:
        r2 = r9.C;
        r2 = r2.a;
        r10.b(r2, r1, r4);
        r2 = r9.T;
        r2 = r2 + r4;
        r9.T = r2;
        r2 = r9.C;
        r2 = r2.a;
        r2 = r2[r1];
        r6 = r2 & 128;
        if (r6 == r5) goto L_0x006b;
    L_0x0066:
        r9.Y = r2;
        r9.V = r4;
        goto L_0x0073;
    L_0x006b:
        r10 = new nnc;
        r11 = "Extension bit is set in signal byte";
        r10.<init>(r11);
        throw r10;
    L_0x0073:
        r2 = r9.Y;
        r6 = r2 & 1;
        if (r6 == 0) goto L_0x017e;
    L_0x0079:
        r2 = r2 & r3;
        r6 = r9.s;
        r6 = r6 | r3;
        r9.s = r6;
        r6 = r9.W;
        if (r6 != 0) goto L_0x00ba;
    L_0x0083:
        r6 = r9.H;
        r6 = r6.a;
        r7 = 8;
        r10.b(r6, r1, r7);
        r6 = r9.T;
        r6 = r6 + r7;
        r9.T = r6;
        r9.W = r4;
        r6 = r9.C;
        r8 = r6.a;
        if (r2 == r3) goto L_0x009a;
    L_0x0099:
        r5 = 0;
    L_0x009a:
        r5 = r5 | r7;
        r5 = (byte) r5;
        r8[r1] = r5;
        r6.c(r1);
        r5 = r9.C;
        r0.a(r5, r4);
        r5 = r9.ab;
        r5 = r5 + r4;
        r9.ab = r5;
        r5 = r9.H;
        r5.c(r1);
        r5 = r9.H;
        r0.a(r5, r7);
        r5 = r9.ab;
        r5 = r5 + r7;
        r9.ab = r5;
    L_0x00ba:
        if (r2 != r3) goto L_0x017e;
    L_0x00bc:
        r2 = r9.X;
        if (r2 != 0) goto L_0x00db;
    L_0x00c0:
        r2 = r9.C;
        r2 = r2.a;
        r10.b(r2, r1, r4);
        r2 = r9.T;
        r2 = r2 + r4;
        r9.T = r2;
        r2 = r9.C;
        r2.c(r1);
        r2 = r9.C;
        r2 = r2.d();
        r9.Z = r2;
        r9.X = r4;
    L_0x00db:
        r2 = r9.Z;
        r2 = r2 << r3;
        r5 = r9.C;
        r6 = r5.c;
        if (r6 >= r2) goto L_0x00e9;
    L_0x00e4:
        r6 = new byte[r2];
        r5.a(r6, r2);
    L_0x00e9:
        r5 = r9.C;
        r5 = r5.a;
        r10.b(r5, r1, r2);
        r5 = r9.T;
        r5 = r5 + r2;
        r9.T = r5;
        r5 = r9.C;
        r5.c(r1);
        r5 = r9.C;
        r5.b(r2);
        r2 = r9.Z;
        r2 = r2 / r3;
        r2 = r2 + r4;
        r2 = (short) r2;
        r5 = r2 * 6;
        r5 = r5 + r3;
        r6 = r9.J;
        if (r6 == 0) goto L_0x0111;
    L_0x010b:
        r6 = r6.capacity();
        if (r6 >= r5) goto L_0x0117;
    L_0x0111:
        r6 = java.nio.ByteBuffer.allocate(r5);
        r9.J = r6;
    L_0x0117:
        r6 = r9.J;
        r6.position(r1);
        r6 = r9.J;
        r6.putShort(r2);
        r2 = 0;
        r6 = 0;
    L_0x0123:
        r7 = r9.Z;
        if (r2 >= r7) goto L_0x0145;
    L_0x0127:
        r7 = r9.C;
        r7 = r7.n();
        r8 = r2 % 2;
        if (r8 != 0) goto L_0x013a;
    L_0x0131:
        r8 = r9.J;
        r6 = r7 - r6;
        r6 = (short) r6;
        r8.putShort(r6);
        goto L_0x0141;
    L_0x013a:
        r8 = r9.J;
        r6 = r7 - r6;
        r8.putInt(r6);
    L_0x0141:
        r2 = r2 + 1;
        r6 = r7;
        goto L_0x0123;
    L_0x0145:
        r2 = r9.T;
        r2 = r12 - r2;
        r2 = r2 - r6;
        r7 = r7 % r3;
        if (r7 != r4) goto L_0x0153;
    L_0x014d:
        r6 = r9.J;
        r6.putInt(r2);
        goto L_0x015e;
    L_0x0153:
        r6 = r9.J;
        r2 = (short) r2;
        r6.putShort(r2);
        r2 = r9.J;
        r2.putInt(r1);
    L_0x015e:
        r2 = r9.I;
        r6 = r9.J;
        r6 = r6.array();
        r2.a(r6, r5);
        r2 = r9.I;
        r0.a(r2, r5);
        r2 = r9.ab;
        r2 = r2 + r5;
        r9.ab = r2;
        goto L_0x017e;
    L_0x0174:
        r2 = r11.f;
        if (r2 == 0) goto L_0x017e;
    L_0x0178:
        r5 = r9.F;
        r6 = r2.length;
        r5.a(r2, r6);
    L_0x017e:
        r9.U = r4;
    L_0x0180:
        r2 = r9.F;
        r2 = r2.c;
        r12 = r12 + r2;
        r2 = r11.a;
        r5 = "V_MPEG4/ISO/AVC";
        r2 = r5.equals(r2);
        r5 = 4;
        if (r2 != 0) goto L_0x01a5;
    L_0x0190:
        r2 = r11.a;
        r6 = "V_MPEGH/ISO/HEVC";
        r2 = r6.equals(r2);
        if (r2 != 0) goto L_0x01a5;
    L_0x019a:
        r2 = r9.T;
        if (r2 < r12) goto L_0x019f;
    L_0x019e:
        goto L_0x01fd;
    L_0x019f:
        r2 = r12 - r2;
        r9.a(r10, r0, r2);
        goto L_0x019a;
    L_0x01a5:
        r2 = r9.B;
        r2 = r2.a;
        r2[r1] = r1;
        r2[r4] = r1;
        r2[r3] = r1;
        r3 = r11.M;
        r4 = 4 - r3;
    L_0x01b3:
        r6 = r9.T;
        if (r6 >= r12) goto L_0x01fd;
    L_0x01b7:
        r6 = r9.aa;
        if (r6 == 0) goto L_0x01c3;
    L_0x01bb:
        r7 = r9.a(r10, r0, r6);
        r6 = r6 - r7;
        r9.aa = r6;
        goto L_0x01b3;
    L_0x01c3:
        r6 = r9.F;
        r6 = r6.b();
        r6 = java.lang.Math.min(r3, r6);
        r7 = r4 + r6;
        r8 = r3 - r6;
        r10.b(r2, r7, r8);
        if (r6 <= 0) goto L_0x01db;
    L_0x01d6:
        r7 = r9.F;
        r7.a(r2, r4, r6);
    L_0x01db:
        r6 = r9.T;
        r6 = r6 + r3;
        r9.T = r6;
        r6 = r9.B;
        r6.c(r1);
        r6 = r9.B;
        r6 = r6.n();
        r9.aa = r6;
        r6 = r9.A;
        r6.c(r1);
        r6 = r9.A;
        r0.a(r6, r5);
        r6 = r9.ab;
        r6 = r6 + r5;
        r9.ab = r6;
        goto L_0x01b3;
    L_0x01fd:
        r10 = r11.a;
        r11 = "A_VORBIS";
        r10 = r11.equals(r10);
        if (r10 == 0) goto L_0x0216;
    L_0x0207:
        r10 = r9.D;
        r10.c(r1);
        r10 = r9.D;
        r0.a(r10, r5);
        r10 = r9.ab;
        r10 = r10 + r5;
        r9.ab = r10;
    L_0x0216:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuz.a(nrb, nvb, int):void");
    }

    private final int a(nrb nrb, nrs nrs, int i) {
        int min;
        int b = this.F.b();
        if (b > 0) {
            min = Math.min(i, b);
            nrs.a(this.F, min);
        } else {
            min = nrs.a(nrb, i, false);
        }
        this.T += min;
        this.ab += min;
        return min;
    }

    public final long a(long j) {
        long j2 = this.e;
        if (j2 != -1) {
            return nxf.a(j, j2, 1000);
        }
        throw new nnc("Can't scale timecode prior to timecodeScale being set.");
    }

    private static int[] a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        if (length < i) {
            iArr = new int[Math.max(length + length, i)];
        }
        return iArr;
    }
}
