package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: aezg */
final class aezg implements aezd, afhi, oqm {
    public static final long a = TimeUnit.HOURS.toMicros(4);
    private long A;
    public aezr b;
    private final String c;
    private final Object d;
    private final ovi e;
    private final oum f;
    private final afgp g;
    private final afaf h;
    private final Map i = new HashMap();
    private final Map j = new HashMap();
    private final aezi k;
    private final aezw m;
    private final boolean n;
    private final aajj o;
    private final boolean p;
    private boolean q;
    private boolean r;
    private aezk s;
    private boolean t;
    private long u;
    private final long v;
    private long w = -9223372036854775807L;
    private final long x;
    private final long y;
    private long z = -9223372036854775807L;

    aezg(aajj aajj, aahr[] aahrArr, afhg afhg, owt owt, aezw aezw, oum oum, afgp afgp, afaf afaf, aezk aezk, String str, int i, boolean z) {
        long j;
        amqw.a(r15 > 0);
        this.c = str;
        this.e = afhg.a(this);
        if (owt != null) {
            this.e.a(owt);
        }
        this.m = aezw;
        this.f = oum;
        this.g = afgp;
        this.h = afaf;
        this.p = false;
        this.o = aajj;
        this.k = new aezi(this);
        for (aahr aahr : aahrArr) {
            ofm ohk;
            nzw H = aahr.H();
            this.i.put(H, aahr);
            String e = aahr.e();
            amuw a = amuw.a((Object) "http://youtube.com/streaming/metadata/segment/102015");
            if (ampq.a("audio/mp4", e) || ampq.a("video/mp4", e) || ampq.a("text/mp4", e)) {
                ohk = new ohk(new ArrayList(), new aeze(a, this));
            } else if (ampq.a("video/x-vnd.on2.vp9", e) || ampq.a("audio/webm", e) || ampq.a("video/webm", e)) {
                ohk = new aezm(new aezh(a, this));
            } else {
                String valueOf = String.valueOf(e);
                e = "ManifestlessExtractorFactory does not support MimeType ";
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String(e) : e.concat(valueOf));
            }
            this.j.put(H, new oqg(ohk, i, H));
        }
        this.t = true;
        this.s = aezk;
        this.u = aezk.c;
        this.A = aezk.d;
        this.n = aezk.k;
        this.q = aezk.o;
        this.v = aezk.e;
        this.x = aezk.f;
        this.d = aezk.b;
        double s = aahrArr[0].s();
        if (s > 0.0d) {
            j = (long) (s * 1000000.0d);
        } else {
            j = a;
        }
        this.y = j;
    }

    public final long a(long j, oap oap) {
        return j;
    }

    public final void a() {
    }

    public final void a(oqh oqh) {
    }

    public final int a(long j, List list) {
        return this.f.a(j, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015a  */
    /* JADX WARNING: Missing block: B:14:0x003f, code skipped:
            if (r15.o != r1) goto L_0x0042;
     */
    /* JADX WARNING: Missing block: B:18:0x004c, code skipped:
            if (r15.o == r1) goto L_0x004f;
     */
    /* JADX WARNING: Missing block: B:24:0x005d, code skipped:
            if (r1 != -9223372036854775807L) goto L_0x0061;
     */
    public final void a(long r43, long r45, java.util.List r47, defpackage.oql r48) {
        /*
        r42 = this;
        r0 = r42;
        r9 = r43;
        r11 = r45;
        r13 = r48;
        r1 = r47.isEmpty();
        r14 = 0;
        if (r1 != 0) goto L_0x001f;
    L_0x000f:
        r1 = r47.size();
        r1 = r1 + -1;
        r8 = r47;
        r1 = r8.get(r1);
        r1 = (defpackage.aezr) r1;
        r15 = r1;
        goto L_0x0022;
    L_0x001f:
        r8 = r47;
        r15 = r14;
    L_0x0022:
        r1 = r0.n;
        r6 = 1;
        r16 = -1;
        if (r1 != 0) goto L_0x002a;
    L_0x0029:
        goto L_0x002c;
    L_0x002a:
        if (r15 == 0) goto L_0x0052;
    L_0x002c:
        r1 = r0.r;
        if (r1 != 0) goto L_0x004f;
    L_0x0030:
        r1 = r0.q;
        if (r1 == 0) goto L_0x0042;
    L_0x0034:
        r1 = r0.A;
        r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1));
        if (r3 != 0) goto L_0x003b;
    L_0x003a:
        goto L_0x0042;
    L_0x003b:
        r3 = r15.o;
        r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r5 != 0) goto L_0x0042;
    L_0x0041:
        goto L_0x004f;
    L_0x0042:
        r1 = r0.x;
        r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1));
        if (r3 == 0) goto L_0x0052;
    L_0x0048:
        r3 = r15.o;
        r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r5 == 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0052;
    L_0x004f:
        r13.b = r6;
        return;
    L_0x0052:
        r18 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        if (r15 == 0) goto L_0x0060;
    L_0x0059:
        r1 = r15.r;
        r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1));
        if (r3 == 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0061;
    L_0x0060:
        r1 = r11;
    L_0x0061:
        r1 = defpackage.afan.b(r1, r9);
        r4 = 0;
        r20 = java.lang.Math.max(r1, r4);
        r1 = r0.u;
        r22 = defpackage.afan.b(r1, r9);
        r1 = r0.f;
        r1 = r1.g();
        r1 = new defpackage.oqq[r1];
        r2 = defpackage.oqq.a;
        java.util.Arrays.fill(r1, r2);
        r1 = r0.f;
        r2 = r43;
        r24 = r4;
        r4 = r20;
        r6 = r22;
        r8 = r47;
        r1.a(r2, r4, r6, r8);
        r1 = r0.f;
        r1 = r1.h();
        if (r1 != 0) goto L_0x0098;
    L_0x0095:
        r13.a = r14;
        return;
    L_0x0098:
        r2 = r0.u;
        r4 = r0.g;
        r4 = r4.c();
        r2 = defpackage.afan.b(r2, r4);
        if (r15 != 0) goto L_0x0104;
    L_0x00a6:
        r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x0104;
    L_0x00aa:
        r2 = r0.n;
        if (r2 == 0) goto L_0x00b3;
    L_0x00ae:
        r2 = r0.a(r11);
        goto L_0x00b5;
    L_0x00b3:
        r2 = r16;
    L_0x00b5:
        r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r4 != 0) goto L_0x00bf;
    L_0x00b9:
        r2 = r0.h;
        r2 = r2.a(r11);
    L_0x00bf:
        r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r4 != 0) goto L_0x00ed;
    L_0x00c3:
        r4 = r0.v;
        r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1));
        if (r6 == 0) goto L_0x00d0;
    L_0x00c9:
        r6 = r0.x;
        r8 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1));
        if (r8 == 0) goto L_0x00d0;
    L_0x00cf:
        r2 = r4;
    L_0x00d0:
        r4 = r0.q;
        if (r4 == 0) goto L_0x0108;
    L_0x00d4:
        r2 = r42.a(r43);
        r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r4 != 0) goto L_0x0108;
    L_0x00dc:
        r2 = r0.u;
        r4 = r0.y;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 < 0) goto L_0x00ea;
    L_0x00e4:
        r2 = r2 - r4;
        r2 = r0.a(r2);
        goto L_0x0108;
    L_0x00ea:
        r2 = r24;
        goto L_0x0108;
    L_0x00ed:
        r4 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1));
        if (r4 == 0) goto L_0x00f7;
    L_0x00f1:
        r4 = r0.v;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x00ff;
    L_0x00f7:
        r4 = r0.d(r2);
        r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0108;
    L_0x00ff:
        r36 = r11;
        r4 = r18;
        goto L_0x0115;
    L_0x0104:
        if (r15 != 0) goto L_0x010d;
    L_0x0106:
        r2 = r16;
    L_0x0108:
        r4 = r18;
        r36 = r4;
        goto L_0x0115;
    L_0x010d:
        r2 = r15.d();
        r4 = r15.r;
        r36 = r18;
    L_0x0115:
        r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1));
        if (r6 != 0) goto L_0x011d;
    L_0x0119:
        r4 = r0.d(r2);
    L_0x011d:
        r6 = r42.b();
        r34 = defpackage.afan.a(r4, r6);
        r6 = r0.i;
        r6 = r6.get(r1);
        r6 = (defpackage.aahr) r6;
        r7 = r6.a();
        r8 = r0.c;
        r7.a(r8);
        r8 = r0.o;
        r8 = defpackage.afix.a(r6, r8);
        r7.a(r8);
        r6 = r0.p;
        r8 = "smb";
        if (r6 != 0) goto L_0x014b;
    L_0x0145:
        r6 = r7.a;
        r6.a(r8);
        goto L_0x0152;
    L_0x014b:
        r6 = r7.a;
        r9 = "1";
        r6.a(r8, r9);
    L_0x0152:
        r6 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r6 == 0) goto L_0x015a;
    L_0x0156:
        r7.b(r2);
        goto L_0x016b;
    L_0x015a:
        r6 = r0.g;
        r6 = r6.a();
        r7.a(r6);
        r6 = 1;
        r0.t = r6;
        r6 = r0.h;
        r6.c(r0);
    L_0x016b:
        r6 = new ovm;
        r7 = r7.a();
        r6.<init>(r7);
        r7 = new aezr;
        r8 = r0.e;
        r9 = r0.f;
        r30 = r9.c();
        r9 = r0.f;
        r31 = r9.d();
        r9 = r0.j;
        r9 = r9.get(r1);
        r40 = r9;
        r40 = (defpackage.oqg) r40;
        r9 = r0.k;
        r26 = r7;
        r27 = r8;
        r28 = r6;
        r29 = r1;
        r32 = r4;
        r38 = r2;
        r41 = r9;
        r26.<init>(r27, r28, r29, r30, r31, r32, r34, r36, r38, r40, r41);
        r0.b = r7;
        r1 = r0.b;
        r13.a = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aezg.a(long, long, java.util.List, oql):void");
    }

    public final boolean a(oqh oqh, boolean z, Exception exception, long j) {
        if ((oqh instanceof aezr) && oqh == this.b) {
            this.h.a();
            if (exception instanceof aezj) {
                c(((aezj) exception).a);
                return false;
            } else if (exception instanceof aezl) {
                long max = Math.max(this.b.o + ((aezl) exception).a, 0);
                long j2 = this.v;
                if (j2 != -1) {
                    max = Math.max(max, j2);
                }
                j2 = this.x;
                if (j2 != -1) {
                    max = Math.min(max, j2);
                }
                j2 = this.A;
                if (j2 != -1) {
                    max = Math.min(max, j2);
                }
                if (max == this.b.o) {
                    return z;
                }
                c(max);
                return false;
            } else if (exception instanceof owd) {
                int i = ((owd) exception).a;
                if (i == 400 || i == 403 || i == 416) {
                    return z;
                }
                return false;
            }
        }
        return false;
    }

    public final void a(Map map) {
        afja afja = new afja(map);
        Long a = afja.a();
        Long b = afja.b();
        synchronized (this) {
            if (!(b == null || a == null)) {
                if (!(b.equals(Long.valueOf(this.A)) || a.equals(Long.valueOf(this.u)))) {
                    this.u = a.longValue();
                    this.A = (long) b.intValue();
                    this.g.h = this.u;
                    c();
                }
            }
        }
        try {
            aezr aezr = this.b;
            Long c = afja.c();
            long longValue = c != null ? c.longValue() : -9223372036854775807L;
            long j = aezr.u;
            if (j != -9223372036854775807L) {
                if (j != longValue) {
                    aezr.u = Math.max(j, longValue);
                    aezr.w = 0;
                    throw new afhy(aezr.p, "x-segment-lmt");
                }
            }
            aezr.u = longValue;
        } catch (afhy e) {
            if ("x-segment-lmt".equals(e.a)) {
                a(8, "manifestless.lmt", this.b.q, null);
            }
            throw e;
        }
    }

    private final void c(long j) {
        long d = d(j);
        long a = afan.a(d, b());
        aahs a2 = aahs.a(this.b.p.a);
        a2.a.a("headm");
        a2.b(j);
        aezr aezr = this.b;
        Uri a3 = a2.a();
        aezr.o = j;
        aezr.q = d;
        aezr.r = a;
        aezr.s = true;
        aezr.p = aezr.p.a(a3);
        aezr.u = -9223372036854775807L;
        aezr.w = 0;
    }

    private final long b() {
        return ((aahr) this.i.values().iterator().next()).p();
    }

    /* Access modifiers changed, original: final */
    public final long a(long j) {
        aezk aezk = this.s;
        if (aezk == null) {
            return -1;
        }
        return aezk.a(j);
    }

    private final long d(long j) {
        aezk aezk = this.s;
        if (aezk == null || j == -1 || j < 0) {
            return -9223372036854775807L;
        }
        long j2 = aezk.d;
        if (j > j2) {
            return -9223372036854775807L;
        }
        long j3 = aezk.e;
        if (j < j3 && j3 != -1) {
            return -9223372036854775807L;
        }
        j3 = aezk.f;
        if (j > j3 && j3 != -1) {
            return -9223372036854775807L;
        }
        return aezk.c - ((j2 - j) * aezk.j);
    }

    public final void a(afho afho) {
        Integer b = afho.b("Sequence-Number");
        if (b != null) {
            aezr aezr = this.b;
            long j = aezr.o;
            long a;
            if (j == -1) {
                aezr.o = (long) b.intValue();
                a = this.h.a(this, (long) b.intValue());
                if (a != ((long) b.intValue())) {
                    long j2 = this.b.q;
                    StringBuilder stringBuilder = new StringBuilder(35);
                    stringBuilder.append("coordinatedSeq.");
                    stringBuilder.append(a);
                    a(8, "manifestless.head.race", j2, stringBuilder.toString());
                    throw new aezj(a);
                }
            } else if (j != ((long) b.intValue())) {
                a = this.b.o;
                String valueOf = String.valueOf(b);
                StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 52);
                stringBuilder2.append("Expected sequence ");
                stringBuilder2.append(a);
                stringBuilder2.append(" got sequence ");
                stringBuilder2.append(valueOf);
                throw new oae(stringBuilder2.toString());
            }
            Long c = afho.c("Ingestion-Walltime-Us");
            if (c != null) {
                this.b.t = c.longValue();
            }
            aezr aezr2 = this.b;
            String a2 = afho.a("Cuepoint-Identifier");
            String a3 = afho.a("Cuepoint-Type");
            String a4 = afho.a("Cuepoint-Event");
            Double d = afho.d("Cuepoint-Playhead-Time-Sec");
            Double d2 = afho.d("Cuepoint-Total-Duration-Sec");
            String a5 = afho.a("Cuepoint-Context");
            aezf aezf = null;
            if (!(a4 == null || d == null || d2 == null)) {
                aezf = new aezf(a2, a3, a4, (long) (d.doubleValue() * 1000.0d), (long) (d2.doubleValue() * 1000.0d), a5);
            }
            aezr2.v = aezf;
            boolean equals = "T".equals(afho.a("Stream-Finished"));
            this.r = equals;
            if (equals) {
                this.q = true;
            }
        } else if (this.p) {
            Long c2 = afho.c("Start-Media-Time-Us");
            if (c2 != null) {
                b(c2.longValue());
                return;
            }
            throw new oae("Start-Media-Time-Us not found in EmbeddedMetadata");
        } else {
            throw new oae("Sequence-Number not found in EmbeddedMetadata");
        }
    }

    public final void a(Exception exception) {
        this.k.a(exception);
    }

    /* Access modifiers changed, original: final */
    public final void b(long j) {
        long j2 = j;
        if (this.t) {
            long j3 = this.b.t;
            if (j3 > 0) {
                this.z = j3 - j2;
                c();
                this.t = false;
            }
        }
        aezr aezr = this.b;
        aezr.r = j2;
        Object obj = 1;
        if (aezr.s) {
            aezr.q = j2;
            aezr.s = false;
            aezf aezf = aezr.v;
            if (aezf != null) {
                aezf.g = nyr.a(j);
            }
        } else {
            obj = null;
        }
        long b = b();
        if (obj != null) {
            long j4 = this.v;
            if (j4 != -1 && this.w == -9223372036854775807L && this.b.o == j4) {
                this.w = j2;
                c();
            }
        }
        if (obj != null) {
            aezr = this.b;
            long j5 = aezr.a;
            if (j5 != -9223372036854775807L) {
                long j6 = aezr.o;
                if (j6 != -1 && b > 0 && ((j5 < -40000 + j2 && j6 != this.v) || j5 > (b + b) + j2)) {
                    double d = (double) (j5 - j2);
                    double d2 = (double) b;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    long floor = (long) Math.floor(d / d2);
                    aezr aezr2 = this.b;
                    b = aezr2.a;
                    long j7 = aezr2.o;
                    StringBuilder stringBuilder = new StringBuilder(129);
                    stringBuilder.append("loadedTimeUs.");
                    stringBuilder.append(j2);
                    stringBuilder.append(";seekTimeUs.");
                    stringBuilder.append(b);
                    stringBuilder.append(";loadedSeq.");
                    stringBuilder.append(j7);
                    stringBuilder.append(";errorChunks.");
                    stringBuilder.append(floor);
                    String stringBuilder2 = stringBuilder.toString();
                    this.m.a("skms", new aetw(stringBuilder2));
                    throw new aezl(floor);
                }
            }
        }
        if (obj != null) {
            aezf aezf2 = this.b.v;
            if (aezf2 != null) {
                this.m.a(aezf2);
            }
        }
    }

    private final void c() {
        long j;
        try {
            long j2 = this.u;
            long j3 = this.A;
            long j4 = this.v;
            j = this.x;
            long j5 = this.w;
            long j6 = this.y;
            long b = b();
            long c = this.g.c();
            long j7 = j6;
            j6 = this.z;
            boolean z = this.n;
            boolean z2 = z;
            long j8 = j;
            long j9 = j5;
            this.s = new aezk(j2, j3, j4, j8, j9, j7, b, c, j6, z2, this.q, this.d);
            this.m.a(this.s);
        } catch (aezn e) {
            aezr aezr = this.b;
            if (aezr == null) {
                j = this.u;
            } else {
                j = aezr.q;
            }
            a(5, "unparseable", j, e.a);
        }
    }

    private final void a(int i, String str, long j, String str2) {
        aezw aezw = this.m;
        aezw.a.post(new aezy(aezw, new afif(i, str, nyr.a(j), str2)));
    }
}
