package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: ogn */
public class ogn implements ofm {
    private static final byte[] A = new byte[]{(byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32};
    private static final byte[] B = ozp.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] C = new byte[]{(byte) 68, (byte) 105, (byte) 97, (byte) 108, (byte) 111, (byte) 103, (byte) 117, (byte) 101, (byte) 58, (byte) 32, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44};
    private static final byte[] D = new byte[]{(byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32};
    public static final UUID a = new UUID(72057594037932032L, -9223371306706625679L);
    private static final byte[] z = new byte[]{(byte) 49, (byte) 10, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 45, (byte) 45, (byte) 62, (byte) 32, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 10};
    private final ogk E;
    private final boolean F;
    private final oza G;
    private final oza H;
    private final oza I;
    private final oza J;
    private final oza K;
    private final oza L;
    private final oza M;
    private ByteBuffer N;
    private long O;
    private long P;
    private boolean Q;
    private boolean R;
    private long S;
    private long T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private byte Z;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private ofo ae;
    public final ogq b;
    public final SparseArray c;
    public final oza d;
    public final oza e;
    public long f;
    public long g;
    public long h;
    public ogp i;
    public int j;
    public long k;
    public long l;
    public oys m;
    public oys n;
    public boolean o;
    public int p;
    public long q;
    public long r;
    public int s;
    public int t;
    public int[] u;
    public int v;
    public int w;
    public int x;
    public boolean y;

    public ogn() {
        this(0);
    }

    /* Access modifiers changed, original: protected */
    public int a(int i) {
        switch (i) {
            case 131:
            case 136:
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
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
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
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public final void c() {
    }

    public ogn(int i) {
        ogj ogj = new ogj();
        this.f = -1;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.P = -9223372036854775807L;
        this.S = -1;
        this.T = -1;
        this.l = -9223372036854775807L;
        this.E = ogj;
        this.E.a(new ogm(this));
        boolean z = true;
        if ((i ^ 1) == 0) {
            z = false;
        }
        this.F = z;
        this.b = new ogq();
        this.c = new SparseArray();
        this.d = new oza(4);
        this.I = new oza(ByteBuffer.allocate(4).putInt(-1).array());
        this.e = new oza(4);
        this.G = new oza(oyw.a);
        this.H = new oza(4);
        this.J = new oza();
        this.K = new oza();
        this.L = new oza(8);
        this.M = new oza();
    }

    public final boolean a(ofp ofp) {
        long i;
        ofp ofp2 = ofp;
        ogr ogr = new ogr();
        long j = ((ofl) ofp2).b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i2 = (int) j2;
        ofp2.c(ogr.a.a, 0, 4);
        ogr.b = 4;
        for (i = ogr.a.i(); i != 440786851; i = ((i << 8) & -256) | ((long) (ogr.a.a[0] & 255))) {
            int i3 = ogr.b + 1;
            ogr.b = i3;
            if (i3 == i2) {
                break;
            }
            ofp2.c(ogr.a.a, 0, 1);
        }
        long a = ogr.a(ofp2);
        i = (long) ogr.b;
        if (a != Long.MIN_VALUE && (j == -1 || i + a < j)) {
            while (true) {
                j = (long) ogr.b;
                long j3 = i + a;
                if (j < j3) {
                    if (ogr.a(ofp2) == Long.MIN_VALUE) {
                        break;
                    }
                    j = ogr.a(ofp2);
                    if (j < 0 || j > 2147483647L) {
                        break;
                    } else if (j != 0) {
                        int i4 = (int) j;
                        ofp2.b(i4);
                        ogr.b += i4;
                    }
                } else if (j == j3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(ofo ofo) {
        this.ae = ofo;
    }

    public void a(long j, long j2) {
        this.l = -9223372036854775807L;
        this.p = 0;
        this.E.a();
        this.b.a();
        a();
        for (int i = 0; i < this.c.size(); i++) {
            ogo ogo = ((ogp) this.c.valueAt(i)).Q;
            if (ogo != null) {
                ogo.b = false;
            }
        }
    }

    public final int a(ofp ofp, ofv ofv) {
        this.ad = false;
        while (!this.ad) {
            if (this.E.a(ofp)) {
                long j = ((ofl) ofp).c;
                if (this.R) {
                    this.T = j;
                    ofv.a = this.S;
                    this.R = false;
                } else if (this.Q) {
                    j = this.T;
                    if (j != -1) {
                        ofv.a = j;
                        this.T = -1;
                    }
                }
                return 1;
            }
            for (int i = 0; i < this.c.size(); i++) {
                ogp ogp = (ogp) this.c.valueAt(i);
                ogo ogo = ogp.Q;
                if (ogo != null && ogo.b && ogo.c > 0) {
                    ogp.U.a(ogo.e, ogo.f, ogo.d, 0, ogp.h);
                    ogo.c = 0;
                }
            }
            return -1;
        }
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, long j, long j2) {
        if (i == 160) {
            this.y = false;
        } else if (i == 174) {
            this.i = new ogp();
        } else if (i == 187) {
            this.o = false;
        } else if (i == 19899) {
            this.j = -1;
            this.k = -1;
        } else if (i == 20533) {
            this.i.f = true;
        } else if (i == 21968) {
            this.i.v = true;
        } else if (i != 408125543) {
            if (i == 475249515) {
                this.m = new oys();
                this.n = new oys();
            } else if (i == 524531317 && !this.Q) {
                if (!this.F || this.S == -1) {
                    this.ae.a(new ofw(this.P));
                    this.Q = true;
                    return;
                }
                this.R = true;
            }
        } else {
            long j3 = this.f;
            if (j3 == -1 || j3 == j) {
                this.f = j;
                this.O = j2;
                return;
            }
            throw new oae("Multiple Segment elements not supported");
        }
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Missing block: B:243:0x0419, code skipped:
            r21 = r9;
            r18 = -1;
            r9 = null;
     */
    /* JADX WARNING: Missing block: B:263:0x049e, code skipped:
            r9 = null;
            r18 = 4096;
     */
    /* JADX WARNING: Missing block: B:271:0x053d, code skipped:
            r9 = r10;
     */
    /* JADX WARNING: Missing block: B:281:0x0557, code skipped:
            r9 = null;
     */
    /* JADX WARNING: Missing block: B:282:0x0558, code skipped:
            r18 = -1;
     */
    /* JADX WARNING: Missing block: B:283:0x055a, code skipped:
            r21 = -1;
     */
    /* JADX WARNING: Missing block: B:284:0x055c, code skipped:
            r10 = r1.S;
     */
    /* JADX WARNING: Missing block: B:285:0x0560, code skipped:
            if (r1.R != false) goto L_0x0564;
     */
    /* JADX WARNING: Missing block: B:286:0x0562, code skipped:
            r11 = 0;
     */
    /* JADX WARNING: Missing block: B:287:0x0564, code skipped:
            r11 = 2;
     */
    /* JADX WARNING: Missing block: B:288:0x0565, code skipped:
            r10 = r10 | r11;
     */
    /* JADX WARNING: Missing block: B:289:0x056a, code skipped:
            if (defpackage.oyu.a(r14) == false) goto L_0x058f;
     */
    /* JADX WARNING: Missing block: B:290:0x056c, code skipped:
            r3 = defpackage.nzw.a(java.lang.Integer.toString(r8), r14, -1, r18, r1.L, r1.N, r21, r9, r1.j, r10, r1.T);
            r13 = 1;
     */
    /* JADX WARNING: Missing block: B:292:0x0593, code skipped:
            if (defpackage.oyu.b(r14) == false) goto L_0x0748;
     */
    /* JADX WARNING: Missing block: B:294:0x0597, code skipped:
            if (r1.o != 0) goto L_0x05a9;
     */
    /* JADX WARNING: Missing block: B:295:0x0599, code skipped:
            r4 = r1.m;
     */
    /* JADX WARNING: Missing block: B:296:0x059b, code skipped:
            if (r4 != -1) goto L_0x059f;
     */
    /* JADX WARNING: Missing block: B:297:0x059d, code skipped:
            r4 = r1.k;
     */
    /* JADX WARNING: Missing block: B:298:0x059f, code skipped:
            r1.m = r4;
            r4 = r1.n;
     */
    /* JADX WARNING: Missing block: B:299:0x05a3, code skipped:
            if (r4 != -1) goto L_0x05a7;
     */
    /* JADX WARNING: Missing block: B:300:0x05a5, code skipped:
            r4 = r1.l;
     */
    /* JADX WARNING: Missing block: B:301:0x05a7, code skipped:
            r1.n = r4;
     */
    /* JADX WARNING: Missing block: B:302:0x05a9, code skipped:
            r4 = r1.m;
     */
    /* JADX WARNING: Missing block: B:303:0x05ad, code skipped:
            if (r4 == -1) goto L_0x05c1;
     */
    /* JADX WARNING: Missing block: B:304:0x05af, code skipped:
            r11 = r1.n;
     */
    /* JADX WARNING: Missing block: B:305:0x05b1, code skipped:
            if (r11 == -1) goto L_0x05c1;
     */
    /* JADX WARNING: Missing block: B:306:0x05b3, code skipped:
            r23 = ((float) (r1.l * r4)) / ((float) (r1.k * r11));
     */
    /* JADX WARNING: Missing block: B:307:0x05c1, code skipped:
            r23 = -1.0f;
     */
    /* JADX WARNING: Missing block: B:309:0x05c5, code skipped:
            if (r1.v != false) goto L_0x05cb;
     */
    /* JADX WARNING: Missing block: B:310:0x05c7, code skipped:
            r26 = null;
     */
    /* JADX WARNING: Missing block: B:312:0x05cf, code skipped:
            if (r1.B == -1.0f) goto L_0x0686;
     */
    /* JADX WARNING: Missing block: B:314:0x05d5, code skipped:
            if (r1.C == -1.0f) goto L_0x0686;
     */
    /* JADX WARNING: Missing block: B:316:0x05db, code skipped:
            if (r1.D == -1.0f) goto L_0x0686;
     */
    /* JADX WARNING: Missing block: B:318:0x05e1, code skipped:
            if (r1.E == -1.0f) goto L_0x0686;
     */
    /* JADX WARNING: Missing block: B:320:0x05e7, code skipped:
            if (r1.F == -1.0f) goto L_0x0686;
     */
    /* JADX WARNING: Missing block: B:322:0x05ed, code skipped:
            if (r1.G == -1.0f) goto L_0x0686;
     */
    /* JADX WARNING: Missing block: B:324:0x05f3, code skipped:
            if (r1.H == -1.0f) goto L_0x0686;
     */
    /* JADX WARNING: Missing block: B:326:0x05f9, code skipped:
            if (r1.I == -1.0f) goto L_0x0686;
     */
    /* JADX WARNING: Missing block: B:328:0x05ff, code skipped:
            if (r1.J == -1.0f) goto L_0x0686;
     */
    /* JADX WARNING: Missing block: B:330:0x0605, code skipped:
            if (r1.K != -1.0f) goto L_0x0609;
     */
    /* JADX WARNING: Missing block: B:331:0x0609, code skipped:
            r4 = new byte[25];
            r10 = java.nio.ByteBuffer.wrap(r4);
            r10.put((byte) 0);
            r10.putShort((short) ((int) ((r1.B * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.C * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.D * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.E * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.F * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.G * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.H * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.I * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) (r1.J + 0.5f)));
            r10.putShort((short) ((int) (r1.K + 0.5f)));
            r10.putShort((short) r1.z);
            r10.putShort((short) r1.A);
     */
    /* JADX WARNING: Missing block: B:332:0x0686, code skipped:
            r4 = null;
     */
    /* JADX WARNING: Missing block: B:333:0x0687, code skipped:
            r26 = new defpackage.ozt(r1.w, r1.y, r1.x, r4);
     */
    /* JADX WARNING: Missing block: B:335:0x069e, code skipped:
            if ("htc_video_rotA-000".equals(r1.a) != false) goto L_0x06c9;
     */
    /* JADX WARNING: Missing block: B:337:0x06a8, code skipped:
            if ("htc_video_rotA-090".equals(r1.a) != false) goto L_0x06c6;
     */
    /* JADX WARNING: Missing block: B:339:0x06b2, code skipped:
            if ("htc_video_rotA-180".equals(r1.a) != false) goto L_0x06c3;
     */
    /* JADX WARNING: Missing block: B:341:0x06bc, code skipped:
            if ("htc_video_rotA-270".equals(r1.a) != false) goto L_0x06c0;
     */
    /* JADX WARNING: Missing block: B:342:0x06be, code skipped:
            r4 = -1;
     */
    /* JADX WARNING: Missing block: B:343:0x06c0, code skipped:
            r4 = 270;
     */
    /* JADX WARNING: Missing block: B:344:0x06c3, code skipped:
            r4 = 180;
     */
    /* JADX WARNING: Missing block: B:345:0x06c6, code skipped:
            r4 = 90;
     */
    /* JADX WARNING: Missing block: B:346:0x06c9, code skipped:
            r4 = 0;
     */
    /* JADX WARNING: Missing block: B:348:0x06cc, code skipped:
            if (r1.p != 0) goto L_0x0720;
     */
    /* JADX WARNING: Missing block: B:350:0x06d5, code skipped:
            if (java.lang.Float.compare(r1.q, 0.0f) != 0) goto L_0x0720;
     */
    /* JADX WARNING: Missing block: B:352:0x06dd, code skipped:
            if (java.lang.Float.compare(r1.r, 0.0f) != 0) goto L_0x0720;
     */
    /* JADX WARNING: Missing block: B:354:0x06e5, code skipped:
            if (java.lang.Float.compare(r1.s, 0.0f) == 0) goto L_0x071d;
     */
    /* JADX WARNING: Missing block: B:356:0x06ef, code skipped:
            if (java.lang.Float.compare(r1.r, 90.0f) == 0) goto L_0x0718;
     */
    /* JADX WARNING: Missing block: B:358:0x06f9, code skipped:
            if (java.lang.Float.compare(r1.r, -180.0f) == 0) goto L_0x0715;
     */
    /* JADX WARNING: Missing block: B:360:0x0703, code skipped:
            if (java.lang.Float.compare(r1.r, 180.0f) == 0) goto L_0x0715;
     */
    /* JADX WARNING: Missing block: B:362:0x070d, code skipped:
            if (java.lang.Float.compare(r1.r, -90.0f) == 0) goto L_0x0710;
     */
    /* JADX WARNING: Missing block: B:363:0x0710, code skipped:
            r22 = 270;
     */
    /* JADX WARNING: Missing block: B:364:0x0715, code skipped:
            r22 = 180;
     */
    /* JADX WARNING: Missing block: B:365:0x0718, code skipped:
            r22 = 90;
     */
    /* JADX WARNING: Missing block: B:366:0x071d, code skipped:
            r22 = 0;
     */
    /* JADX WARNING: Missing block: B:367:0x0720, code skipped:
            r22 = r4;
     */
    /* JADX WARNING: Missing block: B:368:0x0722, code skipped:
            r3 = defpackage.nzw.a(java.lang.Integer.toString(r8), r14, null, r18, r1.k, r1.l, r9, r22, r23, r1.t, r1.u, r26, r1.j);
            r13 = 2;
     */
    /* JADX WARNING: Missing block: B:370:0x074e, code skipped:
            if ("application/x-subrip".equals(r14) == false) goto L_0x075e;
     */
    /* JADX WARNING: Missing block: B:371:0x0750, code skipped:
            r3 = defpackage.nzw.a(java.lang.Integer.toString(r8), r14, r10, r1.T, r1.j);
     */
    /* JADX WARNING: Missing block: B:373:0x0764, code skipped:
            if ("text/x-ssa".equals(r14) == false) goto L_0x0793;
     */
    /* JADX WARNING: Missing block: B:374:0x0766, code skipped:
            r4 = new java.util.ArrayList(2);
            r4.add(B);
            r4.add(r1.i);
            r3 = defpackage.nzw.a(java.lang.Integer.toString(r8), r14, r10, r1.T, -1, r1.j, Long.MAX_VALUE, r4);
     */
    /* JADX WARNING: Missing block: B:376:0x0799, code skipped:
            if ("application/vobsub".equals(r14) != false) goto L_0x07b4;
     */
    /* JADX WARNING: Missing block: B:378:0x07a1, code skipped:
            if ("application/pgs".equals(r14) != false) goto L_0x07b4;
     */
    /* JADX WARNING: Missing block: B:380:0x07a9, code skipped:
            if ("application/dvbsubs".equals(r14) == false) goto L_0x07ac;
     */
    /* JADX WARNING: Missing block: B:382:0x07b3, code skipped:
            throw new defpackage.oae("Unexpected MIME type.");
     */
    /* JADX WARNING: Missing block: B:383:0x07b4, code skipped:
            r3 = defpackage.nzw.a(java.lang.Integer.toString(r8), r14, r10, r9, r1.T, r1.j);
     */
    /* JADX WARNING: Missing block: B:384:0x07ca, code skipped:
            r1.U = r2.a(r1.c, r13);
            r1.U.a(r3);
            r1 = r0.c;
            r2 = r0.i;
            r1.put(r2.c, r2);
     */
    public void b(int r29) {
        /*
        r28 = this;
        r0 = r28;
        r1 = r29;
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r3 = 2;
        r4 = 1;
        r5 = 0;
        if (r1 == r2) goto L_0x07e3;
    L_0x000b:
        r2 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r6 = 0;
        r7 = -1;
        if (r1 == r2) goto L_0x0148;
    L_0x0011:
        r2 = 19899; // 0x4dbb float:2.7884E-41 double:9.8314E-320;
        if (r1 == r2) goto L_0x012c;
    L_0x0015:
        r2 = 25152; // 0x6240 float:3.5245E-41 double:1.24267E-319;
        if (r1 == r2) goto L_0x00ff;
    L_0x0019:
        r2 = 28032; // 0x6d80 float:3.9281E-41 double:1.38496E-319;
        if (r1 == r2) goto L_0x00eb;
    L_0x001d:
        r2 = 357149030; // 0x1549a966 float:4.072526E-26 double:1.76455066E-315;
        r8 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        if (r1 == r2) goto L_0x00d3;
    L_0x0027:
        r2 = 374648427; // 0x1654ae6b float:1.718026E-25 double:1.85100917E-315;
        if (r1 == r2) goto L_0x00bd;
    L_0x002c:
        r2 = 475249515; // 0x1c53bb6b float:7.0056276E-22 double:2.348044586E-315;
        if (r1 == r2) goto L_0x0033;
    L_0x0031:
        goto L_0x07e2;
    L_0x0033:
        r1 = r0.Q;
        if (r1 != 0) goto L_0x07e2;
    L_0x0037:
        r1 = r0.ae;
        r2 = r0.f;
        r10 = -1;
        r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r12 == 0) goto L_0x00ac;
    L_0x0041:
        r2 = r0.P;
        r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r10 == 0) goto L_0x00ac;
    L_0x0047:
        r2 = r0.m;
        if (r2 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x00ac;
    L_0x004c:
        r2 = r2.a;
        if (r2 == 0) goto L_0x00ac;
    L_0x0050:
        r3 = r0.n;
        if (r3 == 0) goto L_0x00ac;
    L_0x0054:
        r3 = r3.a;
        if (r3 != r2) goto L_0x00ac;
    L_0x0058:
        r3 = new int[r2];
        r8 = new long[r2];
        r9 = new long[r2];
        r10 = new long[r2];
        r11 = 0;
    L_0x0061:
        if (r11 >= r2) goto L_0x0079;
    L_0x0063:
        r12 = r0.m;
        r12 = r12.a(r11);
        r10[r11] = r12;
        r12 = r0.f;
        r14 = r0.n;
        r14 = r14.a(r11);
        r12 = r12 + r14;
        r8[r11] = r12;
        r11 = r11 + 1;
        goto L_0x0061;
    L_0x0079:
        r11 = r2 + -1;
        if (r5 >= r11) goto L_0x0090;
    L_0x007d:
        r11 = r5 + 1;
        r12 = r8[r11];
        r14 = r8[r5];
        r12 = r12 - r14;
        r13 = (int) r12;
        r3[r5] = r13;
        r12 = r10[r11];
        r14 = r10[r5];
        r12 = r12 - r14;
        r9[r5] = r12;
        r5 = r11;
        goto L_0x0079;
    L_0x0090:
        r12 = r0.f;
        r14 = r0.O;
        r12 = r12 + r14;
        r14 = r8[r11];
        r12 = r12 - r14;
        r2 = (int) r12;
        r3[r11] = r2;
        r12 = r0.P;
        r14 = r10[r11];
        r12 = r12 - r14;
        r9[r11] = r12;
        r0.m = r6;
        r0.n = r6;
        r2 = new ofj;
        r2.<init>(r3, r8, r9, r10);
        goto L_0x00b7;
    L_0x00ac:
        r0.m = r6;
        r0.n = r6;
        r2 = new ofw;
        r5 = r0.P;
        r2.<init>(r5);
    L_0x00b7:
        r1.a(r2);
        r0.Q = r4;
        return;
    L_0x00bd:
        r1 = r0.c;
        r1 = r1.size();
        if (r1 == 0) goto L_0x00cb;
    L_0x00c5:
        r1 = r0.ae;
        r1.a();
        return;
    L_0x00cb:
        r1 = new oae;
        r2 = "No valid tracks were found";
        r1.<init>(r2);
        throw r1;
    L_0x00d3:
        r1 = r0.g;
        r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r3 != 0) goto L_0x00de;
    L_0x00d9:
        r1 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0.g = r1;
    L_0x00de:
        r1 = r0.h;
        r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r3 == 0) goto L_0x07e2;
    L_0x00e4:
        r1 = r0.a(r1);
        r0.P = r1;
        return;
    L_0x00eb:
        r1 = r0.i;
        r2 = r1.f;
        if (r2 == 0) goto L_0x07e2;
    L_0x00f1:
        r1 = r1.g;
        if (r1 != 0) goto L_0x00f7;
    L_0x00f5:
        goto L_0x07e2;
    L_0x00f7:
        r1 = new oae;
        r2 = "Combining encryption and compression is not supported";
        r1.<init>(r2);
        throw r1;
    L_0x00ff:
        r1 = r0.i;
        r2 = r1.f;
        if (r2 == 0) goto L_0x07e2;
    L_0x0105:
        r2 = r1.h;
        if (r2 == 0) goto L_0x0124;
    L_0x0109:
        r2 = new odq;
        r3 = new defpackage.ods[r4];
        r4 = new ods;
        r6 = defpackage.nyr.a;
        r7 = r0.i;
        r7 = r7.h;
        r7 = r7.b;
        r8 = "video/webm";
        r4.<init>(r6, r8, r7);
        r3[r5] = r4;
        r2.<init>(r3);
        r1.j = r2;
        return;
    L_0x0124:
        r1 = new oae;
        r2 = "Encrypted Track found but ContentEncKeyID was not found";
        r1.<init>(r2);
        throw r1;
    L_0x012c:
        r1 = r0.j;
        if (r1 == r7) goto L_0x0140;
    L_0x0130:
        r2 = r0.k;
        r4 = -1;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0140;
    L_0x0138:
        r4 = 475249515; // 0x1c53bb6b float:7.0056276E-22 double:2.348044586E-315;
        if (r1 != r4) goto L_0x07e2;
    L_0x013d:
        r0.S = r2;
        return;
    L_0x0140:
        r1 = new oae;
        r2 = "Mandatory element SeekID or SeekPosition not found";
        r1.<init>(r2);
        throw r1;
    L_0x0148:
        r1 = r0.i;
        r1 = r1.b;
        r2 = "V_VP8";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x0154:
        r2 = "V_VP9";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x015c:
        r2 = "V_AV1";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x0164:
        r2 = "V_MPEG2";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x016c:
        r2 = "V_MPEG4/ISO/SP";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x0174:
        r2 = "V_MPEG4/ISO/ASP";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x017c:
        r2 = "V_MPEG4/ISO/AP";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x0184:
        r2 = "V_MPEG4/ISO/AVC";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x018c:
        r2 = "V_MPEGH/ISO/HEVC";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x0194:
        r2 = "V_MS/VFW/FOURCC";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x019c:
        r2 = "V_THEORA";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01a4:
        r2 = "A_OPUS";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01ac:
        r2 = "A_VORBIS";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01b4:
        r2 = "A_AAC";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01bc:
        r2 = "A_MPEG/L2";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01c4:
        r2 = "A_MPEG/L3";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01cc:
        r2 = "A_AC3";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01d4:
        r2 = "A_EAC3";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01dc:
        r2 = "A_TRUEHD";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01e4:
        r2 = "A_DTS";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01ec:
        r2 = "A_DTS/EXPRESS";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01f4:
        r2 = "A_DTS/LOSSLESS";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x01fc:
        r2 = "A_FLAC";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x0204:
        r2 = "A_MS/ACM";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x020c:
        r2 = "A_PCM/INT/LIT";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x0214:
        r2 = "S_TEXT/UTF8";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x021c:
        r2 = "S_TEXT/ASS";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x0224:
        r2 = "S_VOBSUB";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x022c:
        r2 = "S_HDMV/PGS";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x023e;
    L_0x0234:
        r2 = "S_DVBSUB";
        r1 = r2.equals(r1);
        if (r1 != 0) goto L_0x023e;
    L_0x023c:
        goto L_0x07e0;
    L_0x023e:
        r1 = r0.i;
        r2 = r0.ae;
        r8 = r1.c;
        r9 = r1.b;
        r10 = ". Setting mimeType to audio/x-unknown";
        r11 = r9.hashCode();
        r12 = 8;
        r13 = 3;
        switch(r11) {
            case -2095576542: goto L_0x03a1;
            case -2095575984: goto L_0x0397;
            case -1985379776: goto L_0x038c;
            case -1784763192: goto L_0x0381;
            case -1730367663: goto L_0x0376;
            case -1482641358: goto L_0x036b;
            case -1482641357: goto L_0x0360;
            case -1373388978: goto L_0x0355;
            case -933872740: goto L_0x034a;
            case -538363189: goto L_0x033f;
            case -538363109: goto L_0x0334;
            case -425012669: goto L_0x0328;
            case -356037306: goto L_0x031c;
            case 62923557: goto L_0x0310;
            case 62923603: goto L_0x0304;
            case 62927045: goto L_0x02f8;
            case 82318131: goto L_0x02ed;
            case 82338133: goto L_0x02e2;
            case 82338134: goto L_0x02d7;
            case 99146302: goto L_0x02cb;
            case 444813526: goto L_0x02bf;
            case 542569478: goto L_0x02b3;
            case 725957860: goto L_0x02a7;
            case 738597099: goto L_0x029b;
            case 855502857: goto L_0x028f;
            case 1422270023: goto L_0x0283;
            case 1809237540: goto L_0x0278;
            case 1950749482: goto L_0x026c;
            case 1950789798: goto L_0x0260;
            case 1951062397: goto L_0x0254;
            default: goto L_0x0252;
        };
    L_0x0252:
        goto L_0x03ab;
    L_0x0254:
        r11 = "A_OPUS";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x025c:
        r9 = 12;
        goto L_0x03ac;
    L_0x0260:
        r11 = "A_FLAC";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0268:
        r9 = 22;
        goto L_0x03ac;
    L_0x026c:
        r11 = "A_EAC3";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0274:
        r9 = 17;
        goto L_0x03ac;
    L_0x0278:
        r11 = "V_MPEG2";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0280:
        r9 = 3;
        goto L_0x03ac;
    L_0x0283:
        r11 = "S_TEXT/UTF8";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x028b:
        r9 = 25;
        goto L_0x03ac;
    L_0x028f:
        r11 = "V_MPEGH/ISO/HEVC";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0297:
        r9 = 8;
        goto L_0x03ac;
    L_0x029b:
        r11 = "S_TEXT/ASS";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x02a3:
        r9 = 26;
        goto L_0x03ac;
    L_0x02a7:
        r11 = "A_PCM/INT/LIT";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x02af:
        r9 = 24;
        goto L_0x03ac;
    L_0x02b3:
        r11 = "A_DTS/EXPRESS";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x02bb:
        r9 = 20;
        goto L_0x03ac;
    L_0x02bf:
        r11 = "V_THEORA";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x02c7:
        r9 = 10;
        goto L_0x03ac;
    L_0x02cb:
        r11 = "S_HDMV/PGS";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x02d3:
        r9 = 28;
        goto L_0x03ac;
    L_0x02d7:
        r11 = "V_VP9";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x02df:
        r9 = 1;
        goto L_0x03ac;
    L_0x02e2:
        r11 = "V_VP8";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x02ea:
        r9 = 0;
        goto L_0x03ac;
    L_0x02ed:
        r11 = "V_AV1";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x02f5:
        r9 = 2;
        goto L_0x03ac;
    L_0x02f8:
        r11 = "A_DTS";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0300:
        r9 = 19;
        goto L_0x03ac;
    L_0x0304:
        r11 = "A_AC3";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x030c:
        r9 = 16;
        goto L_0x03ac;
    L_0x0310:
        r11 = "A_AAC";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0318:
        r9 = 13;
        goto L_0x03ac;
    L_0x031c:
        r11 = "A_DTS/LOSSLESS";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0324:
        r9 = 21;
        goto L_0x03ac;
    L_0x0328:
        r11 = "S_VOBSUB";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0330:
        r9 = 27;
        goto L_0x03ac;
    L_0x0334:
        r11 = "V_MPEG4/ISO/AVC";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x033c:
        r9 = 7;
        goto L_0x03ac;
    L_0x033f:
        r11 = "V_MPEG4/ISO/ASP";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0347:
        r9 = 5;
        goto L_0x03ac;
    L_0x034a:
        r11 = "S_DVBSUB";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0352:
        r9 = 29;
        goto L_0x03ac;
    L_0x0355:
        r11 = "V_MS/VFW/FOURCC";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x035d:
        r9 = 9;
        goto L_0x03ac;
    L_0x0360:
        r11 = "A_MPEG/L3";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0368:
        r9 = 15;
        goto L_0x03ac;
    L_0x036b:
        r11 = "A_MPEG/L2";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0373:
        r9 = 14;
        goto L_0x03ac;
    L_0x0376:
        r11 = "A_VORBIS";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x037e:
        r9 = 11;
        goto L_0x03ac;
    L_0x0381:
        r11 = "A_TRUEHD";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0389:
        r9 = 18;
        goto L_0x03ac;
    L_0x038c:
        r11 = "A_MS/ACM";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x0394:
        r9 = 23;
        goto L_0x03ac;
    L_0x0397:
        r11 = "V_MPEG4/ISO/SP";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x039f:
        r9 = 4;
        goto L_0x03ac;
    L_0x03a1:
        r11 = "V_MPEG4/ISO/AP";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x03ab;
    L_0x03a9:
        r9 = 6;
        goto L_0x03ac;
    L_0x03ab:
        r9 = -1;
    L_0x03ac:
        r11 = "MatroskaExtractor";
        r14 = "audio/x-unknown";
        switch(r9) {
            case 0: goto L_0x0555;
            case 1: goto L_0x0552;
            case 2: goto L_0x054f;
            case 3: goto L_0x054c;
            case 4: goto L_0x053f;
            case 5: goto L_0x053f;
            case 6: goto L_0x053f;
            case 7: goto L_0x052a;
            case 8: goto L_0x0516;
            case 9: goto L_0x0501;
            case 10: goto L_0x04fe;
            case 11: goto L_0x04f1;
            case 12: goto L_0x04ad;
            case 13: goto L_0x04a3;
            case 14: goto L_0x049a;
            case 15: goto L_0x0495;
            case 16: goto L_0x0491;
            case 17: goto L_0x048d;
            case 18: goto L_0x0482;
            case 19: goto L_0x047e;
            case 20: goto L_0x047e;
            case 21: goto L_0x047a;
            case 22: goto L_0x0470;
            case 23: goto L_0x0420;
            case 24: goto L_0x03ee;
            case 25: goto L_0x03ea;
            case 26: goto L_0x03e6;
            case 27: goto L_0x03dc;
            case 28: goto L_0x03d8;
            case 29: goto L_0x03bb;
            default: goto L_0x03b3;
        };
    L_0x03b3:
        r1 = new oae;
        r2 = "Unrecognized codec identifier.";
        r1.<init>(r2);
        throw r1;
    L_0x03bb:
        r9 = 4;
        r9 = new byte[r9];
        r10 = r1.i;
        r11 = r10[r5];
        r9[r5] = r11;
        r11 = r10[r4];
        r9[r4] = r11;
        r11 = r10[r3];
        r9[r3] = r11;
        r10 = r10[r13];
        r9[r13] = r10;
        r9 = java.util.Collections.singletonList(r9);
        r14 = "application/dvbsubs";
        goto L_0x0558;
    L_0x03d8:
        r14 = "application/pgs";
        goto L_0x0557;
    L_0x03dc:
        r9 = r1.i;
        r9 = java.util.Collections.singletonList(r9);
        r14 = "application/vobsub";
        goto L_0x0558;
    L_0x03e6:
        r14 = "text/x-ssa";
        goto L_0x0557;
    L_0x03ea:
        r14 = "application/x-subrip";
        goto L_0x0557;
    L_0x03ee:
        r9 = r1.M;
        r9 = defpackage.ozp.b(r9);
        if (r9 != 0) goto L_0x0417;
    L_0x03f6:
        r9 = r1.M;
        r12 = r14.length();
        r15 = new java.lang.StringBuilder;
        r12 = r12 + 60;
        r15.<init>(r12);
        r12 = "Unsupported PCM bit depth: ";
        r15.append(r12);
        r15.append(r9);
        r15.append(r10);
        r9 = r15.toString();
        defpackage.oyp.a(r11, r9);
        goto L_0x0557;
    L_0x0417:
        r14 = "audio/raw";
    L_0x0419:
        r21 = r9;
        r18 = -1;
        r9 = r6;
        goto L_0x055c;
    L_0x0420:
        r9 = new oza;
        r12 = r1.i;
        r9.<init>(r12);
        r9 = defpackage.ogp.b(r9);
        if (r9 == 0) goto L_0x0459;
    L_0x042d:
        r9 = r1.M;
        r9 = defpackage.ozp.b(r9);
        if (r9 != 0) goto L_0x0456;
    L_0x0435:
        r9 = r1.M;
        r12 = r14.length();
        r15 = new java.lang.StringBuilder;
        r12 = r12 + 60;
        r15.<init>(r12);
        r12 = "Unsupported PCM bit depth: ";
        r15.append(r12);
        r15.append(r9);
        r15.append(r10);
        r9 = r15.toString();
        defpackage.oyp.a(r11, r9);
        goto L_0x0557;
    L_0x0456:
        r14 = "audio/raw";
        goto L_0x0419;
    L_0x0459:
        r9 = "Non-PCM MS/ACM is unsupported. Setting mimeType to ";
        r10 = r14.length();
        if (r10 != 0) goto L_0x0467;
    L_0x0461:
        r10 = new java.lang.String;
        r10.<init>(r9);
        goto L_0x046b;
    L_0x0467:
        r10 = r9.concat(r14);
    L_0x046b:
        defpackage.oyp.a(r11, r10);
        goto L_0x0557;
    L_0x0470:
        r9 = r1.i;
        r9 = java.util.Collections.singletonList(r9);
        r14 = "audio/flac";
        goto L_0x0558;
    L_0x047a:
        r14 = "audio/vnd.dts.hd";
        goto L_0x0557;
    L_0x047e:
        r14 = "audio/vnd.dts";
        goto L_0x0557;
    L_0x0482:
        r9 = new ogo;
        r9.<init>();
        r1.Q = r9;
        r14 = "audio/true-hd";
        goto L_0x0557;
    L_0x048d:
        r14 = "audio/eac3";
        goto L_0x0557;
    L_0x0491:
        r14 = "audio/ac3";
        goto L_0x0557;
    L_0x0495:
        r9 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r14 = "audio/mpeg";
        goto L_0x049e;
    L_0x049a:
        r9 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r14 = "audio/mpeg-L2";
    L_0x049e:
        r9 = r6;
        r18 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        goto L_0x055a;
    L_0x04a3:
        r9 = r1.i;
        r9 = java.util.Collections.singletonList(r9);
        r14 = "audio/mp4a-latm";
        goto L_0x0558;
    L_0x04ad:
        r9 = new java.util.ArrayList;
        r9.<init>(r13);
        r10 = r1.i;
        r9.add(r10);
        r10 = java.nio.ByteBuffer.allocate(r12);
        r11 = java.nio.ByteOrder.nativeOrder();
        r10 = r10.order(r11);
        r14 = r1.O;
        r10 = r10.putLong(r14);
        r10 = r10.array();
        r9.add(r10);
        r10 = java.nio.ByteBuffer.allocate(r12);
        r11 = java.nio.ByteOrder.nativeOrder();
        r10 = r10.order(r11);
        r11 = r1.P;
        r10 = r10.putLong(r11);
        r10 = r10.array();
        r9.add(r10);
        r10 = 5760; // 0x1680 float:8.071E-42 double:2.846E-320;
        r14 = "audio/opus";
        r18 = 5760; // 0x1680 float:8.071E-42 double:2.846E-320;
        goto L_0x055a;
    L_0x04f1:
        r9 = r1.i;
        r9 = defpackage.ogp.a(r9);
        r10 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r14 = "audio/vorbis";
        r18 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        goto L_0x055a;
    L_0x04fe:
        r14 = "video/x-unknown";
        goto L_0x0557;
    L_0x0501:
        r9 = new oza;
        r10 = r1.i;
        r9.<init>(r10);
        r9 = defpackage.ogp.a(r9);
        r10 = r9.first;
        r14 = r10;
        r14 = (java.lang.String) r14;
        r9 = r9.second;
        r9 = (java.util.List) r9;
        goto L_0x0558;
    L_0x0516:
        r9 = new oza;
        r10 = r1.i;
        r9.<init>(r10);
        r9 = defpackage.paa.a(r9);
        r10 = r9.a;
        r9 = r9.b;
        r1.V = r9;
        r14 = "video/hevc";
        goto L_0x053d;
    L_0x052a:
        r9 = new oza;
        r10 = r1.i;
        r9.<init>(r10);
        r9 = defpackage.ozu.a(r9);
        r10 = r9.a;
        r9 = r9.b;
        r1.V = r9;
        r14 = "video/avc";
    L_0x053d:
        r9 = r10;
        goto L_0x0558;
    L_0x053f:
        r9 = r1.i;
        if (r9 == 0) goto L_0x0548;
    L_0x0543:
        r9 = java.util.Collections.singletonList(r9);
        goto L_0x0549;
    L_0x0548:
        r9 = r6;
    L_0x0549:
        r14 = "video/mp4v-es";
        goto L_0x0558;
    L_0x054c:
        r14 = "video/mpeg2";
        goto L_0x0557;
    L_0x054f:
        r14 = "video/av01";
        goto L_0x0557;
    L_0x0552:
        r14 = "video/x-vnd.on2.vp9";
        goto L_0x0557;
    L_0x0555:
        r14 = "video/x-vnd.on2.vp8";
    L_0x0557:
        r9 = r6;
    L_0x0558:
        r18 = -1;
    L_0x055a:
        r21 = -1;
    L_0x055c:
        r10 = r1.S;
        r11 = r1.R;
        if (r11 != 0) goto L_0x0564;
    L_0x0562:
        r11 = 0;
        goto L_0x0565;
    L_0x0564:
        r11 = 2;
    L_0x0565:
        r10 = r10 | r11;
        r11 = defpackage.oyu.a(r14);
        if (r11 == 0) goto L_0x058f;
    L_0x056c:
        r15 = java.lang.Integer.toString(r8);
        r17 = -1;
        r3 = r1.L;
        r5 = r1.N;
        r7 = r1.j;
        r8 = r1.T;
        r16 = r14;
        r19 = r3;
        r20 = r5;
        r22 = r9;
        r23 = r7;
        r24 = r10;
        r25 = r8;
        r3 = defpackage.nzw.a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
        r13 = 1;
        goto L_0x07ca;
    L_0x058f:
        r4 = defpackage.oyu.b(r14);
        if (r4 == 0) goto L_0x0748;
    L_0x0595:
        r4 = r1.o;
        if (r4 != 0) goto L_0x05a9;
    L_0x0599:
        r4 = r1.m;
        if (r4 != r7) goto L_0x059f;
    L_0x059d:
        r4 = r1.k;
    L_0x059f:
        r1.m = r4;
        r4 = r1.n;
        if (r4 != r7) goto L_0x05a7;
    L_0x05a5:
        r4 = r1.l;
    L_0x05a7:
        r1.n = r4;
    L_0x05a9:
        r4 = r1.m;
        r10 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        if (r4 == r7) goto L_0x05c1;
    L_0x05af:
        r11 = r1.n;
        if (r11 == r7) goto L_0x05c1;
    L_0x05b3:
        r12 = r1.l;
        r12 = r12 * r4;
        r4 = (float) r12;
        r12 = r1.k;
        r12 = r12 * r11;
        r11 = (float) r12;
        r4 = r4 / r11;
        r23 = r4;
        goto L_0x05c3;
    L_0x05c1:
        r23 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x05c3:
        r4 = r1.v;
        if (r4 != 0) goto L_0x05cb;
    L_0x05c7:
        r26 = r6;
        goto L_0x0694;
    L_0x05cb:
        r4 = r1.B;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0686;
    L_0x05d1:
        r4 = r1.C;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0686;
    L_0x05d7:
        r4 = r1.D;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0686;
    L_0x05dd:
        r4 = r1.E;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0686;
    L_0x05e3:
        r4 = r1.F;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0686;
    L_0x05e9:
        r4 = r1.G;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0686;
    L_0x05ef:
        r4 = r1.H;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0686;
    L_0x05f5:
        r4 = r1.I;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0686;
    L_0x05fb:
        r4 = r1.J;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0686;
    L_0x0601:
        r4 = r1.K;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 != 0) goto L_0x0609;
    L_0x0607:
        goto L_0x0686;
    L_0x0609:
        r4 = 25;
        r4 = new byte[r4];
        r10 = java.nio.ByteBuffer.wrap(r4);
        r10.put(r5);
        r11 = r1.B;
        r12 = 1195593728; // 0x47435000 float:50000.0 double:5.907017874E-315;
        r11 = r11 * r12;
        r13 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r11 = r11 + r13;
        r11 = (int) r11;
        r11 = (short) r11;
        r10.putShort(r11);
        r11 = r1.C;
        r11 = r11 * r12;
        r11 = r11 + r13;
        r11 = (int) r11;
        r11 = (short) r11;
        r10.putShort(r11);
        r11 = r1.D;
        r11 = r11 * r12;
        r11 = r11 + r13;
        r11 = (int) r11;
        r11 = (short) r11;
        r10.putShort(r11);
        r11 = r1.E;
        r11 = r11 * r12;
        r11 = r11 + r13;
        r11 = (int) r11;
        r11 = (short) r11;
        r10.putShort(r11);
        r11 = r1.F;
        r11 = r11 * r12;
        r11 = r11 + r13;
        r11 = (int) r11;
        r11 = (short) r11;
        r10.putShort(r11);
        r11 = r1.G;
        r11 = r11 * r12;
        r11 = r11 + r13;
        r11 = (int) r11;
        r11 = (short) r11;
        r10.putShort(r11);
        r11 = r1.H;
        r11 = r11 * r12;
        r11 = r11 + r13;
        r11 = (int) r11;
        r11 = (short) r11;
        r10.putShort(r11);
        r11 = r1.I;
        r11 = r11 * r12;
        r11 = r11 + r13;
        r11 = (int) r11;
        r11 = (short) r11;
        r10.putShort(r11);
        r11 = r1.J;
        r11 = r11 + r13;
        r11 = (int) r11;
        r11 = (short) r11;
        r10.putShort(r11);
        r11 = r1.K;
        r11 = r11 + r13;
        r11 = (int) r11;
        r11 = (short) r11;
        r10.putShort(r11);
        r11 = r1.z;
        r11 = (short) r11;
        r10.putShort(r11);
        r11 = r1.A;
        r11 = (short) r11;
        r10.putShort(r11);
        goto L_0x0687;
    L_0x0686:
        r4 = r6;
    L_0x0687:
        r10 = new ozt;
        r11 = r1.w;
        r12 = r1.y;
        r13 = r1.x;
        r10.<init>(r11, r12, r13, r4);
        r26 = r10;
    L_0x0694:
        r4 = r1.a;
        r10 = "htc_video_rotA-000";
        r4 = r10.equals(r4);
        r10 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r4 != 0) goto L_0x06c9;
    L_0x06a0:
        r4 = r1.a;
        r11 = "htc_video_rotA-090";
        r4 = r11.equals(r4);
        if (r4 != 0) goto L_0x06c6;
    L_0x06aa:
        r4 = r1.a;
        r11 = "htc_video_rotA-180";
        r4 = r11.equals(r4);
        if (r4 != 0) goto L_0x06c3;
    L_0x06b4:
        r4 = r1.a;
        r11 = "htc_video_rotA-270";
        r4 = r11.equals(r4);
        if (r4 != 0) goto L_0x06c0;
    L_0x06be:
        r4 = -1;
        goto L_0x06ca;
    L_0x06c0:
        r4 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x06ca;
    L_0x06c3:
        r4 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        goto L_0x06ca;
    L_0x06c6:
        r4 = 90;
        goto L_0x06ca;
    L_0x06c9:
        r4 = 0;
    L_0x06ca:
        r7 = r1.p;
        if (r7 != 0) goto L_0x0720;
    L_0x06ce:
        r7 = r1.q;
        r11 = 0;
        r7 = java.lang.Float.compare(r7, r11);
        if (r7 != 0) goto L_0x0720;
    L_0x06d7:
        r7 = r1.r;
        r7 = java.lang.Float.compare(r7, r11);
        if (r7 != 0) goto L_0x0720;
    L_0x06df:
        r7 = r1.s;
        r7 = java.lang.Float.compare(r7, r11);
        if (r7 == 0) goto L_0x071d;
    L_0x06e7:
        r5 = r1.r;
        r7 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r5 = java.lang.Float.compare(r5, r7);
        if (r5 == 0) goto L_0x0718;
    L_0x06f1:
        r5 = r1.r;
        r7 = -1020002304; // 0xffffffffc3340000 float:-180.0 double:NaN;
        r5 = java.lang.Float.compare(r5, r7);
        if (r5 == 0) goto L_0x0715;
    L_0x06fb:
        r5 = r1.r;
        r7 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r5 = java.lang.Float.compare(r5, r7);
        if (r5 == 0) goto L_0x0715;
    L_0x0705:
        r5 = r1.r;
        r7 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;
        r5 = java.lang.Float.compare(r5, r7);
        if (r5 == 0) goto L_0x0710;
    L_0x070f:
        goto L_0x0720;
    L_0x0710:
        r5 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r22 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x0722;
    L_0x0715:
        r22 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        goto L_0x0722;
    L_0x0718:
        r5 = 90;
        r22 = 90;
        goto L_0x0722;
    L_0x071d:
        r22 = 0;
        goto L_0x0722;
    L_0x0720:
        r22 = r4;
    L_0x0722:
        r15 = java.lang.Integer.toString(r8);
        r17 = 0;
        r4 = r1.k;
        r5 = r1.l;
        r7 = r1.t;
        r8 = r1.u;
        r10 = r1.j;
        r16 = r14;
        r19 = r4;
        r20 = r5;
        r21 = r9;
        r24 = r7;
        r25 = r8;
        r27 = r10;
        r4 = defpackage.nzw.a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
        r3 = r4;
        r13 = 2;
        goto L_0x07ca;
    L_0x0748:
        r4 = "application/x-subrip";
        r4 = r4.equals(r14);
        if (r4 == 0) goto L_0x075e;
    L_0x0750:
        r3 = java.lang.Integer.toString(r8);
        r4 = r1.T;
        r5 = r1.j;
        r3 = defpackage.nzw.a(r3, r14, r10, r4, r5);
        goto L_0x07ca;
    L_0x075e:
        r4 = "text/x-ssa";
        r4 = r4.equals(r14);
        if (r4 == 0) goto L_0x0793;
    L_0x0766:
        r4 = new java.util.ArrayList;
        r4.<init>(r3);
        r3 = B;
        r4.add(r3);
        r3 = r1.i;
        r4.add(r3);
        r15 = java.lang.Integer.toString(r8);
        r3 = r1.T;
        r19 = -1;
        r5 = r1.j;
        r21 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r16 = r14;
        r17 = r10;
        r18 = r3;
        r20 = r5;
        r23 = r4;
        r3 = defpackage.nzw.a(r15, r16, r17, r18, r19, r20, r21, r23);
        goto L_0x07ca;
    L_0x0793:
        r3 = "application/vobsub";
        r3 = r3.equals(r14);
        if (r3 != 0) goto L_0x07b4;
    L_0x079b:
        r3 = "application/pgs";
        r3 = r3.equals(r14);
        if (r3 != 0) goto L_0x07b4;
    L_0x07a3:
        r3 = "application/dvbsubs";
        r3 = r3.equals(r14);
        if (r3 == 0) goto L_0x07ac;
    L_0x07ab:
        goto L_0x07b4;
    L_0x07ac:
        r1 = new oae;
        r2 = "Unexpected MIME type.";
        r1.<init>(r2);
        throw r1;
    L_0x07b4:
        r15 = java.lang.Integer.toString(r8);
        r3 = r1.T;
        r4 = r1.j;
        r16 = r14;
        r17 = r10;
        r18 = r9;
        r19 = r3;
        r20 = r4;
        r3 = defpackage.nzw.a(r15, r16, r17, r18, r19, r20);
    L_0x07ca:
        r4 = r1.c;
        r2 = r2.a(r4, r13);
        r1.U = r2;
        r1 = r1.U;
        r1.a(r3);
        r1 = r0.c;
        r2 = r0.i;
        r3 = r2.c;
        r1.put(r3, r2);
    L_0x07e0:
        r0.i = r6;
    L_0x07e2:
        return;
    L_0x07e3:
        r1 = r0.p;
        if (r1 != r3) goto L_0x0801;
    L_0x07e7:
        r1 = r0.y;
        if (r1 != 0) goto L_0x07f0;
    L_0x07eb:
        r1 = r0.x;
        r1 = r1 | r4;
        r0.x = r1;
    L_0x07f0:
        r1 = r0.c;
        r2 = r0.v;
        r1 = r1.get(r2);
        r1 = (defpackage.ogp) r1;
        r2 = r0.q;
        r0.a(r1, r2);
        r0.p = r5;
    L_0x0801:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogn.b(int):void");
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, String str) {
        if (i != 134) {
            if (i != 17026) {
                if (i == 21358) {
                    this.i.a = str;
                    return;
                } else if (i == 2274716) {
                    this.i.T = str;
                }
            } else if (!("webm".equals(str) || "matroska".equals(str))) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
                stringBuilder.append("DocType ");
                stringBuilder.append(str);
                stringBuilder.append(" not supported");
                throw new oae(stringBuilder.toString());
            }
            return;
        }
        this.i.b = str;
    }

    public final void a(ogp ogp, long j) {
        ogp ogp2 = ogp;
        ogo ogo = ogp2.Q;
        if (ogo == null) {
            ogp ogp3;
            if ("S_TEXT/UTF8".equals(ogp2.b)) {
                ogp3 = ogp;
                a(ogp3, "%02d:%02d:%02d,%03d", 19, 1000, A);
            } else {
                if ("S_TEXT/ASS".equals(ogp2.b)) {
                    ogp3 = ogp;
                    a(ogp3, "%01d:%02d:%02d:%02d", 21, 10000, D);
                }
            }
            ogp2.U.a(j, this.x, this.ac, 0, ogp2.h);
        } else if (ogo.b) {
            int i = ogo.c;
            int i2 = i + 1;
            ogo.c = i2;
            if (i == 0) {
                ogo.e = j;
            }
            if (i2 >= 16) {
                ogp2.U.a(ogo.e, ogo.f, ogo.d, 0, ogp2.h);
                ogo.c = 0;
            }
        }
        this.ad = true;
        a();
    }

    private final void a() {
        this.U = 0;
        this.ac = 0;
        this.ab = 0;
        this.V = false;
        this.W = false;
        this.Y = false;
        this.aa = 0;
        this.Z = (byte) 0;
        this.X = false;
        this.J.a();
    }

    public final void a(ofp ofp, int i) {
        oza oza = this.d;
        if (oza.c < i) {
            byte[] bArr;
            if (oza.c() < i) {
                oza = this.d;
                bArr = oza.a;
                int length = bArr.length;
                oza.a(Arrays.copyOf(bArr, Math.max(length + length, i)), this.d.c);
            }
            oza = this.d;
            bArr = oza.a;
            int i2 = oza.c;
            ofp.b(bArr, i2, i - i2);
            this.d.b(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x021a  */
    public final void a(defpackage.ofp r10, defpackage.ogp r11, int r12) {
        /*
        r9 = this;
        r0 = r11.b;
        r1 = "S_TEXT/UTF8";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x022a;
    L_0x000a:
        r0 = r11.b;
        r1 = "S_TEXT/ASS";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r11 = C;
        r9.a(r10, r11, r12);
        return;
    L_0x001a:
        r0 = r11.U;
        r1 = r9.V;
        r2 = 2;
        r3 = 1;
        r4 = 0;
        if (r1 != 0) goto L_0x0157;
    L_0x0023:
        r1 = r11.f;
        if (r1 == 0) goto L_0x014b;
    L_0x0027:
        r1 = r9.x;
        r5 = -1073741825; // 0xffffffffbfffffff float:-1.9999999 double:NaN;
        r1 = r1 & r5;
        r9.x = r1;
        r1 = r9.W;
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 != 0) goto L_0x0058;
    L_0x0035:
        r1 = r9.d;
        r1 = r1.a;
        r10.b(r1, r4, r3);
        r1 = r9.U;
        r1 = r1 + r3;
        r9.U = r1;
        r1 = r9.d;
        r1 = r1.a;
        r1 = r1[r4];
        r6 = r1 & 128;
        if (r6 == r5) goto L_0x0050;
    L_0x004b:
        r9.Z = r1;
        r9.W = r3;
        goto L_0x0058;
    L_0x0050:
        r10 = new oae;
        r11 = "Extension bit is set in signal byte";
        r10.<init>(r11);
        throw r10;
    L_0x0058:
        r1 = r9.Z;
        r6 = r1 & 1;
        if (r6 == 0) goto L_0x0155;
    L_0x005e:
        r1 = r1 & r2;
        r6 = r9.x;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 | r7;
        r9.x = r6;
        r6 = r9.X;
        if (r6 != 0) goto L_0x00a1;
    L_0x006a:
        r6 = r9.L;
        r6 = r6.a;
        r7 = 8;
        r10.b(r6, r4, r7);
        r6 = r9.U;
        r6 = r6 + r7;
        r9.U = r6;
        r9.X = r3;
        r6 = r9.d;
        r8 = r6.a;
        if (r1 == r2) goto L_0x0081;
    L_0x0080:
        r5 = 0;
    L_0x0081:
        r5 = r5 | r7;
        r5 = (byte) r5;
        r8[r4] = r5;
        r6.c(r4);
        r5 = r9.d;
        r0.a(r5, r3);
        r5 = r9.ac;
        r5 = r5 + r3;
        r9.ac = r5;
        r5 = r9.L;
        r5.c(r4);
        r5 = r9.L;
        r0.a(r5, r7);
        r5 = r9.ac;
        r5 = r5 + r7;
        r9.ac = r5;
    L_0x00a1:
        if (r1 != r2) goto L_0x0155;
    L_0x00a3:
        r1 = r9.Y;
        if (r1 != 0) goto L_0x00c2;
    L_0x00a7:
        r1 = r9.d;
        r1 = r1.a;
        r10.b(r1, r4, r3);
        r1 = r9.U;
        r1 = r1 + r3;
        r9.U = r1;
        r1 = r9.d;
        r1.c(r4);
        r1 = r9.d;
        r1 = r1.d();
        r9.aa = r1;
        r9.Y = r3;
    L_0x00c2:
        r1 = r9.aa;
        r1 = r1 << r2;
        r5 = r9.d;
        r5.a(r1);
        r5 = r9.d;
        r5 = r5.a;
        r10.b(r5, r4, r1);
        r5 = r9.U;
        r5 = r5 + r1;
        r9.U = r5;
        r1 = r9.aa;
        r1 = r1 / r2;
        r1 = r1 + r3;
        r1 = (short) r1;
        r5 = r1 * 6;
        r5 = r5 + r2;
        r6 = r9.N;
        if (r6 == 0) goto L_0x00e8;
    L_0x00e2:
        r6 = r6.capacity();
        if (r6 >= r5) goto L_0x00ee;
    L_0x00e8:
        r6 = java.nio.ByteBuffer.allocate(r5);
        r9.N = r6;
    L_0x00ee:
        r6 = r9.N;
        r6.position(r4);
        r6 = r9.N;
        r6.putShort(r1);
        r1 = 0;
        r6 = 0;
    L_0x00fa:
        r7 = r9.aa;
        if (r1 >= r7) goto L_0x011c;
    L_0x00fe:
        r7 = r9.d;
        r7 = r7.o();
        r8 = r1 % 2;
        if (r8 != 0) goto L_0x0111;
    L_0x0108:
        r8 = r9.N;
        r6 = r7 - r6;
        r6 = (short) r6;
        r8.putShort(r6);
        goto L_0x0118;
    L_0x0111:
        r8 = r9.N;
        r6 = r7 - r6;
        r8.putInt(r6);
    L_0x0118:
        r1 = r1 + 1;
        r6 = r7;
        goto L_0x00fa;
    L_0x011c:
        r1 = r9.U;
        r1 = r12 - r1;
        r1 = r1 - r6;
        r7 = r7 % r2;
        if (r7 != r3) goto L_0x012a;
    L_0x0124:
        r6 = r9.N;
        r6.putInt(r1);
        goto L_0x0135;
    L_0x012a:
        r6 = r9.N;
        r1 = (short) r1;
        r6.putShort(r1);
        r1 = r9.N;
        r1.putInt(r4);
    L_0x0135:
        r1 = r9.M;
        r6 = r9.N;
        r6 = r6.array();
        r1.a(r6, r5);
        r1 = r9.M;
        r0.a(r1, r5);
        r1 = r9.ac;
        r1 = r1 + r5;
        r9.ac = r1;
        goto L_0x0155;
    L_0x014b:
        r1 = r11.g;
        if (r1 == 0) goto L_0x0155;
    L_0x014f:
        r5 = r9.J;
        r6 = r1.length;
        r5.a(r1, r6);
    L_0x0155:
        r9.V = r3;
    L_0x0157:
        r1 = r9.J;
        r1 = r1.c;
        r12 = r12 + r1;
        r1 = r11.b;
        r5 = "V_MPEG4/ISO/AVC";
        r1 = r5.equals(r1);
        r5 = 4;
        if (r1 != 0) goto L_0x01b8;
    L_0x0167:
        r1 = r11.b;
        r6 = "V_MPEGH/ISO/HEVC";
        r1 = r6.equals(r1);
        if (r1 == 0) goto L_0x0172;
    L_0x0171:
        goto L_0x01b8;
    L_0x0172:
        r1 = r11.Q;
        if (r1 != 0) goto L_0x0177;
    L_0x0176:
        goto L_0x01ae;
    L_0x0177:
        r1 = r9.J;
        r1 = r1.c;
        if (r1 != 0) goto L_0x017f;
    L_0x017d:
        r1 = 1;
        goto L_0x0180;
    L_0x017f:
        r1 = 0;
    L_0x0180:
        defpackage.oxz.b(r1);
        r1 = r11.Q;
        r2 = r9.x;
        r6 = r1.b;
        if (r6 != 0) goto L_0x01a1;
    L_0x018b:
        r6 = r1.a;
        r7 = 10;
        r10.c(r6, r4, r7);
        r10.a();
        r6 = r1.a;
        r6 = defpackage.obe.b(r6);
        if (r6 == 0) goto L_0x01ae;
    L_0x019d:
        r1.b = r3;
        r1.c = r4;
    L_0x01a1:
        r3 = r1.c;
        if (r3 != 0) goto L_0x01a9;
    L_0x01a5:
        r1.f = r2;
        r1.d = r4;
    L_0x01a9:
        r2 = r1.d;
        r2 = r2 + r12;
        r1.d = r2;
    L_0x01ae:
        r1 = r9.U;
        if (r1 >= r12) goto L_0x0210;
    L_0x01b2:
        r1 = r12 - r1;
        r9.a(r10, r0, r1);
        goto L_0x01ae;
    L_0x01b8:
        r1 = r9.H;
        r1 = r1.a;
        r1[r4] = r4;
        r1[r3] = r4;
        r1[r2] = r4;
        r2 = r11.V;
        r3 = 4 - r2;
    L_0x01c6:
        r6 = r9.U;
        if (r6 >= r12) goto L_0x0210;
    L_0x01ca:
        r6 = r9.ab;
        if (r6 == 0) goto L_0x01d6;
    L_0x01ce:
        r7 = r9.a(r10, r0, r6);
        r6 = r6 - r7;
        r9.ab = r6;
        goto L_0x01c6;
    L_0x01d6:
        r6 = r9.J;
        r6 = r6.b();
        r6 = java.lang.Math.min(r2, r6);
        r7 = r3 + r6;
        r8 = r2 - r6;
        r10.b(r1, r7, r8);
        if (r6 <= 0) goto L_0x01ee;
    L_0x01e9:
        r7 = r9.J;
        r7.a(r1, r3, r6);
    L_0x01ee:
        r6 = r9.U;
        r6 = r6 + r2;
        r9.U = r6;
        r6 = r9.H;
        r6.c(r4);
        r6 = r9.H;
        r6 = r6.o();
        r9.ab = r6;
        r6 = r9.G;
        r6.c(r4);
        r6 = r9.G;
        r0.a(r6, r5);
        r6 = r9.ac;
        r6 = r6 + r5;
        r9.ac = r6;
        goto L_0x01c6;
    L_0x0210:
        r10 = r11.b;
        r11 = "A_VORBIS";
        r10 = r11.equals(r10);
        if (r10 == 0) goto L_0x0229;
    L_0x021a:
        r10 = r9.I;
        r10.c(r4);
        r10 = r9.I;
        r0.a(r10, r5);
        r10 = r9.ac;
        r10 = r10 + r5;
        r9.ac = r10;
    L_0x0229:
        return;
    L_0x022a:
        r11 = z;
        r9.a(r10, r11, r12);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogn.a(ofp, ogp, int):void");
    }

    private final void a(ofp ofp, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        if (this.K.c() < i2) {
            this.K.a = Arrays.copyOf(bArr, i2 + i);
        } else {
            System.arraycopy(bArr, 0, this.K.a, 0, length);
        }
        ofp.b(this.K.a, length, i);
        this.K.a(i2);
    }

    private final void a(ogp ogp, String str, int i, long j, byte[] bArr) {
        Object c;
        byte[] bArr2;
        byte[] bArr3 = this.K.a;
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            j2 -= ((long) (((int) (j2 / 3600000000L)) * 3600)) * 1000000;
            j2 -= ((long) (((int) (j2 / 60000000)) * 60)) * 1000000;
            j2 = (j2 - (((long) ((int) (j2 / 1000000))) * 1000000)) / j;
            Object[] objArr = new Object[]{Integer.valueOf(r6), Integer.valueOf(r5), Integer.valueOf(r8), Integer.valueOf((int) j2)};
            String str2 = str;
            c = ozp.c(String.format(Locale.US, str, objArr));
            bArr2 = bArr;
        } else {
            bArr2 = bArr;
            c = bArr2;
        }
        System.arraycopy(c, 0, bArr3, i, bArr2.length);
        ofy ofy = ogp.U;
        oza oza = this.K;
        ofy.a(oza, oza.c);
        this.ac += this.K.c;
    }

    private final int a(ofp ofp, ofy ofy, int i) {
        int min;
        int b = this.J.b();
        if (b > 0) {
            min = Math.min(i, b);
            ofy.a(this.J, min);
        } else {
            min = ofy.a(ofp, i, false);
        }
        this.U += min;
        this.ac += min;
        return min;
    }

    public final long a(long j) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L) {
            return ozp.b(j, j2, 1000);
        }
        throw new oae("Can't scale timecode prior to timecodeScale being set.");
    }

    public static int[] a(int[] iArr, int i) {
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
