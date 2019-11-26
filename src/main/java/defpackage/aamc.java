package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: aamc */
public final class aamc extends afsv implements bqm {
    private static final xsy H = new xsy(100, 10000, 3);
    private static final ammw a;
    private final boolean A;
    private final long B;
    private final boolean C;
    private final boolean D;
    private final wxm E;
    private final wxj F;
    private final aftt G;
    private final boolean I;
    private final xsw J;
    private final xsc K;
    private byte[] L;
    private Map M;
    private String N;
    private String O;
    private Boolean P = Boolean.valueOf(false);
    private final aaml b;
    private final anze k;
    private final bqj l;
    private final afpd m;
    private final afqa n;
    private final Set o;
    private final Set q;
    private final aalx r;
    private final afmh s;
    private final String t;
    private final String u;
    private final bqi v;
    private final zzl w;
    private final boolean x;
    private final afpu y;
    private final bcaa z;

    public final afpt bm_() {
        return this.b.m;
    }

    public final String k() {
        return this.b.k;
    }

    public final boolean l() {
        return this.b.l();
    }

    public final bqn a(bqn bqn) {
        return bqn instanceof bql ? new xvc(bqn) : bqn;
    }

    public final Map c() {
        this.b.getClass();
        if (this.M == null) {
            this.M = new HashMap();
            this.M.put("Content-Type", "application/x-protobuf");
            this.M.put("X-GOOG-API-FORMAT-VERSION", "2");
            this.m.a(this.M, a(Boolean.valueOf(false)), a());
            if (!l() && this.G.a()) {
                this.G.a(f());
            }
            for (afsa a : this.o) {
                a.a(this.M, this);
            }
        }
        Map map = this.M;
        xvj.a();
        return map;
    }

    private final String a(Boolean bool) {
        this.b.getClass();
        if (this.N == null || bool.booleanValue()) {
            Uri g;
            String str = this.b.l;
            if (this.C) {
                g = this.s.g();
            } else {
                g = this.s.f();
            }
            Builder appendQueryParameter = g.buildUpon().appendEncodedPath(this.s.h()).appendEncodedPath(str).appendQueryParameter("key", this.t);
            if (!TextUtils.isEmpty(this.u)) {
                appendQueryParameter.appendQueryParameter("asig", this.u);
            }
            for (Entry entry : this.b.f().entrySet()) {
                appendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            if (bool.booleanValue()) {
                appendQueryParameter.appendQueryParameter("retry", "1");
            }
            this.N = appendQueryParameter.build().toString();
        }
        return this.N;
    }

    public final String f() {
        return a(this.P);
    }

    public final byte[] a() {
        aaml aaml = this.b;
        aaml.getClass();
        if (this.L == null) {
            aaml.h();
            this.L = p().toByteArray();
        }
        return this.L;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0069 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:10|11|12|13|14|15|16|17) */
    public final defpackage.bqh a(defpackage.bqd r11) {
        /*
        r10 = this;
        r0 = r10.b;
        r0.getClass();
        defpackage.xak.b();
        r0 = r10.K;	 Catch:{ anyg -> 0x0154 }
        r0 = r0.b();	 Catch:{ anyg -> 0x0154 }
        r2 = r10.b;	 Catch:{ anyg -> 0x0154 }
        r2 = r2.n;	 Catch:{ anyg -> 0x0154 }
        if (r2 == 0) goto L_0x0017;
    L_0x0014:
        r2.c();	 Catch:{ anyg -> 0x0154 }
    L_0x0017:
        r3 = r11.b;	 Catch:{ anyg -> 0x0154 }
        r4 = r10.k;	 Catch:{ anyg -> 0x0154 }
        r4 = r4.getParserForType();	 Catch:{ anyg -> 0x0154 }
        r3 = r10.a(r3, r4);	 Catch:{ anyg -> 0x0154 }
        r4 = r10.F;	 Catch:{ anyg -> 0x0154 }
        r4 = r4.a(r3);	 Catch:{ anyg -> 0x0154 }
        r4 = (defpackage.asic) r4;	 Catch:{ anyg -> 0x0154 }
        r5 = r10.K;	 Catch:{ anyg -> 0x0154 }
        r5 = r5.b();	 Catch:{ anyg -> 0x0154 }
        if (r2 == 0) goto L_0x0036;
    L_0x0033:
        r2.d();	 Catch:{ anyg -> 0x0154 }
    L_0x0036:
        r2 = r11.b;	 Catch:{ anyg -> 0x0154 }
        r7 = r10.x;	 Catch:{ anyg -> 0x0154 }
        if (r7 == 0) goto L_0x006e;
    L_0x003c:
        r7 = r10.z;	 Catch:{ IOException -> 0x0069 }
        r7 = r7.get();	 Catch:{ IOException -> 0x0069 }
        r7 = (defpackage.aalr) r7;	 Catch:{ IOException -> 0x0069 }
        r8 = r10.b;	 Catch:{ IOException -> 0x0069 }
        r8 = r8.i();	 Catch:{ IOException -> 0x0069 }
        r7.a(r8, r4);	 Catch:{ IOException -> 0x0069 }
        r7 = r11.b;	 Catch:{ IOException -> 0x0069 }
        r7 = defpackage.anwf.a(r7);	 Catch:{ IOException -> 0x0069 }
        r8 = a;	 Catch:{ IOException -> 0x0069 }
        r9 = new abmr;	 Catch:{ all -> 0x0152 }
        r9.<init>();	 Catch:{ all -> 0x0152 }
        r9.a(r7, r8);	 Catch:{ all -> 0x0152 }
        r7 = r9.a;	 Catch:{ all -> 0x0152 }
        r2 = new byte[r7];	 Catch:{ IOException -> 0x0069 }
        r7 = defpackage.anwm.a(r2);	 Catch:{ IOException -> 0x0069 }
        r9.a(r7);	 Catch:{ IOException -> 0x0069 }
        goto L_0x006e;
    L_0x0069:
        r7 = "Failed rewriting consistency token";
        defpackage.xtl.c(r7);	 Catch:{ anyg -> 0x0154 }
    L_0x006e:
        r7 = r10.y;	 Catch:{ anyg -> 0x0154 }
        r7 = r7.c();	 Catch:{ anyg -> 0x0154 }
        r7 = r7.a();	 Catch:{ anyg -> 0x0154 }
        r8 = r10.b;	 Catch:{ anyg -> 0x0154 }
        r8 = r8.m;	 Catch:{ anyg -> 0x0154 }
        r8 = r8.a();	 Catch:{ anyg -> 0x0154 }
        r9 = r10.w;	 Catch:{ anyg -> 0x0154 }
        r9 = r9.b();	 Catch:{ anyg -> 0x0154 }
        r9 = r9.f;	 Catch:{ anyg -> 0x0154 }
        if (r9 != 0) goto L_0x008c;
    L_0x008a:
        r9 = defpackage.avao.f;	 Catch:{ anyg -> 0x0154 }
    L_0x008c:
        r9 = r9.b;	 Catch:{ anyg -> 0x0154 }
        if (r9 == 0) goto L_0x00b9;
    L_0x0090:
        r9 = r10.b;	 Catch:{ anyg -> 0x0154 }
        r9 = r9.j();	 Catch:{ anyg -> 0x0154 }
        if (r9 == 0) goto L_0x00b9;
    L_0x0098:
        if (r8 == 0) goto L_0x009b;
    L_0x009a:
        goto L_0x009e;
    L_0x009b:
        if (r7 != 0) goto L_0x009e;
    L_0x009d:
        goto L_0x00b9;
    L_0x009e:
        r7 = r7.equals(r8);	 Catch:{ anyg -> 0x0154 }
        if (r7 == 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00b9;
    L_0x00a5:
        r7 = r10.b;	 Catch:{ anyg -> 0x0154 }
        r7 = r7.l();	 Catch:{ anyg -> 0x0154 }
        if (r7 != 0) goto L_0x00b9;
    L_0x00ad:
        r11 = new bpx;	 Catch:{ anyg -> 0x0154 }
        r0 = "Authentication changed while request was being made";
        r11.<init>(r0);	 Catch:{ anyg -> 0x0154 }
        r11 = defpackage.bqh.a(r11);	 Catch:{ anyg -> 0x0154 }
        return r11;
    L_0x00b9:
        if (r4 == 0) goto L_0x00db;
    L_0x00bb:
        r7 = r10.q;	 Catch:{ anyg -> 0x0154 }
        r7 = r7.iterator();	 Catch:{ anyg -> 0x0154 }
    L_0x00c1:
        r8 = r7.hasNext();	 Catch:{ anyg -> 0x0154 }
        if (r8 == 0) goto L_0x00db;
    L_0x00c7:
        r8 = r7.next();	 Catch:{ anyg -> 0x0154 }
        r8 = (defpackage.aams) r8;	 Catch:{ anyg -> 0x0154 }
        r9 = r8 instanceof defpackage.aamy;	 Catch:{ anyg -> 0x0154 }
        if (r9 == 0) goto L_0x00d7;
    L_0x00d1:
        r9 = r10.l();	 Catch:{ anyg -> 0x0154 }
        if (r9 != 0) goto L_0x00c1;
    L_0x00d7:
        r8.a(r4);	 Catch:{ anyg -> 0x0154 }
        goto L_0x00c1;
    L_0x00db:
        r7 = defpackage.afsv.c(r11);	 Catch:{ anyg -> 0x0154 }
        if (r7 != 0) goto L_0x00ea;
    L_0x00e1:
        r7 = r10.r;	 Catch:{ anyg -> 0x0154 }
        r7.a(r3, r4);	 Catch:{ anyg -> 0x0154 }
        r11 = defpackage.afsv.d(r11);	 Catch:{ anyg -> 0x0154 }
    L_0x00ea:
        r7 = r10.b;	 Catch:{ anyg -> 0x0154 }
        r7 = r7.d();	 Catch:{ anyg -> 0x0154 }
        if (r7 == 0) goto L_0x00f9;
    L_0x00f2:
        r7 = r11.c;	 Catch:{ anyg -> 0x0154 }
        r2 = defpackage.abmj.a(r2, r7, r4);	 Catch:{ anyg -> 0x0154 }
        goto L_0x00fa;
    L_0x00f9:
        r2 = 0;
    L_0x00fa:
        r4 = r10.b;	 Catch:{ anyg -> 0x0154 }
        r7 = defpackage.afkt.a(r2);	 Catch:{ anyg -> 0x0154 }
        r4.g = r7;	 Catch:{ anyg -> 0x0154 }
        r2 = defpackage.bqh.a(r3, r2);	 Catch:{ anyg -> 0x0154 }
        r3 = r10.D;	 Catch:{ anyg -> 0x0154 }
        if (r3 == 0) goto L_0x014e;
    L_0x010a:
        r3 = defpackage.aals.class;
        r3 = r10.a(r3);	 Catch:{ anyg -> 0x0154 }
        r3 = (defpackage.aals) r3;	 Catch:{ anyg -> 0x0154 }
        r10.c(r3);	 Catch:{ anyg -> 0x0154 }
        r3 = defpackage.aals.f();	 Catch:{ anyg -> 0x0154 }
        r5 = r5 - r0;
        r0 = java.lang.Long.valueOf(r5);	 Catch:{ anyg -> 0x0154 }
        r0 = r3.a(r0);	 Catch:{ anyg -> 0x0154 }
        r11 = r11.b;	 Catch:{ anyg -> 0x0154 }
        if (r11 == 0) goto L_0x0128;
    L_0x0126:
        r11 = r11.length;	 Catch:{ anyg -> 0x0154 }
        goto L_0x0129;
    L_0x0128:
        r11 = 0;
    L_0x0129:
        r11 = r0.a(r11);	 Catch:{ anyg -> 0x0154 }
        r0 = r10.b;	 Catch:{ anyg -> 0x0154 }
        r0 = r0.l;	 Catch:{ anyg -> 0x0154 }
        r11 = r11.a(r0);	 Catch:{ anyg -> 0x0154 }
        r0 = r10.b();	 Catch:{ anyg -> 0x0154 }
        r11 = r11.b(r0);	 Catch:{ anyg -> 0x0154 }
        r0 = r10.b;	 Catch:{ anyg -> 0x0154 }
        r0 = r0.m();	 Catch:{ anyg -> 0x0154 }
        r11 = r11.a(r0);	 Catch:{ anyg -> 0x0154 }
        r11 = r11.a();	 Catch:{ anyg -> 0x0154 }
        r10.b(r11);	 Catch:{ anyg -> 0x0154 }
    L_0x014e:
        defpackage.xvj.a();
        return r2;
    L_0x0152:
        r11 = move-exception;
        goto L_0x0164;
    L_0x0154:
        r11 = move-exception;
        r0 = "Failed while attempting to deserialize network response";
        defpackage.xtl.a(r0, r11);	 Catch:{  }
        r0 = new bqf;	 Catch:{  }
        r0.<init>(r11);	 Catch:{  }
        r11 = defpackage.bqh.a(r0);	 Catch:{  }
        return r11;
    L_0x0164:
        goto L_0x0166;
    L_0x0165:
        throw r11;
    L_0x0166:
        goto L_0x0165;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aamc.a(bqd):bqh");
    }

    public final String g() {
        if (this.O == null) {
            String a = this.b.a();
            if ("NO_CACHE_KEY_VALUE".equals(a)) {
                this.O = f();
            } else {
                this.O = a;
            }
        }
        return this.O;
    }

    public final List m() {
        ArrayList arrayList = new ArrayList();
        String simpleName = p().getClass().getSimpleName();
        StringBuilder stringBuilder = new StringBuilder(simpleName.length() + 15);
        stringBuilder.append("Request type: ");
        stringBuilder.append(simpleName);
        simpleName = "\n";
        stringBuilder.append(simpleName);
        arrayList.add(stringBuilder.toString());
        String str = !this.b.e() ? "CACHE READ DISABLED" : !this.b.d() ? "CACHE DISABLED" : !o() ? "CACHE MISS" : "CACHE HIT";
        StringBuilder stringBuilder2 = new StringBuilder(str.length() + 9);
        stringBuilder2.append("Cached: ");
        stringBuilder2.append(str);
        stringBuilder2.append(simpleName);
        arrayList.add(stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        try {
            stringBuilder3.append("curl ");
            Map c = c();
            for (String str2 : c.keySet()) {
                if (!str2.equals("Content-Type")) {
                    String str3 = (String) c.get(str2);
                    StringBuilder stringBuilder4 = new StringBuilder((str2.length() + 7) + String.valueOf(str3).length());
                    stringBuilder4.append("-H \"");
                    stringBuilder4.append(str2);
                    stringBuilder4.append(":");
                    stringBuilder4.append(str3);
                    stringBuilder4.append("\" ");
                    stringBuilder3.append(stringBuilder4.toString());
                }
            }
        } catch (bpx e) {
            xtl.c("Curl command line not available", e);
        }
        str = aamq.a(p()).toString();
        stringBuilder3.append("-H \"Content-Type:application/json\" -d '");
        String str4 = "'\\''";
        String str22 = "'";
        stringBuilder3.append(str.replace(str22, str4));
        stringBuilder3.append("' '");
        stringBuilder3.append(f().replace(str22, str4));
        stringBuilder3.append('\'');
        arrayList.addAll(xvd.b(stringBuilder3.toString()));
        return arrayList;
    }

    private final anze p() {
        anzd c = this.b.c();
        Object obj = (asib) ((anxo) this.b.i().toBuilder());
        if (this.x) {
            obj = ((aalr) this.z.get()).a(obj);
        }
        return ((anzd) this.E.a(c, obj)).build();
    }

    public final bqi d() {
        return this.v;
    }

    public final void n() {
        this.L = null;
    }

    private final anze a(byte[] bArr, anzq anzq) {
        this.b.getClass();
        anze anze = (anze) anzq.a(bArr, anxa.c());
        xvj.a();
        return anze;
    }

    public final synchronized List b(bqd bqd) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String name = this.k.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder(name.length() + 16);
        stringBuilder.append("Response type: ");
        stringBuilder.append(name);
        stringBuilder.append("\n");
        arrayList.add(stringBuilder.toString());
        int i = bqd.a;
        StringBuilder stringBuilder2 = new StringBuilder(20);
        stringBuilder2.append("Status: ");
        stringBuilder2.append(i);
        stringBuilder2.append("\n");
        arrayList.add(stringBuilder2.toString());
        boolean z = this.b.g;
        stringBuilder2 = new StringBuilder(14);
        stringBuilder2.append("Cached: ");
        stringBuilder2.append(z);
        stringBuilder2.append("\n");
        arrayList.add(stringBuilder2.toString());
        for (String str : bqd.c.keySet()) {
            String str2 = (String) bqd.c.get(str);
            StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(str).length() + 9) + String.valueOf(str2).length());
            stringBuilder3.append("Header:");
            stringBuilder3.append(str);
            stringBuilder3.append(":");
            stringBuilder3.append(str2);
            stringBuilder3.append("\n");
            arrayList.add(stringBuilder3.toString());
        }
        if (bqd.a == 200) {
            try {
                i = bqd.b.length;
                stringBuilder2 = new StringBuilder(46);
                stringBuilder2.append("Actual response length (as proto): ");
                stringBuilder2.append(i);
                arrayList.add(stringBuilder2.toString());
                arrayList.addAll(xvd.b(aamq.a(a(bqd.b, this.k.getParserForType())).toString()));
            } catch (anyg e) {
                arrayList.add("Could not parse response. See earlier logcat.");
                xtl.a("Could not parse response", e);
            }
        } else {
            name = new String(bqd.b);
            String str3 = "Error response: ";
            arrayList.add(name.length() == 0 ? new String(str3) : str3.concat(name));
        }
        return arrayList;
    }

    public final int aZ_() {
        if (this.A) {
            long j = this.B;
            if (j > 0) {
                return (int) j;
            }
        }
        return (int) this.J.b();
    }

    public final int b() {
        return (int) this.J.b;
    }

    public final void a_(bqn bqn) {
        arvt b = this.w.b();
        if (b != null) {
            avao avao = b.f;
            if (avao == null) {
                avao = avao.f;
            }
            if (avao.c) {
                this.P = Boolean.valueOf(true);
            }
        }
        boolean z = bqn instanceof bpx;
        if (!z && (!xic.a(bqn) || (this.I && !j()))) {
            throw bqn;
        } else if (!this.J.a()) {
            throw bqn;
        } else if (!z) {
        } else {
            if (b() <= 1) {
                afpt bm_ = bm_();
                if (bm_ != afpt.g) {
                    afqa afqa = this.n;
                    if (afqa != null) {
                        this.M = null;
                        afqa.a(bm_).a(bm_);
                        return;
                    }
                    return;
                }
                return;
            }
            throw bqn;
        }
    }

    public final boolean o() {
        return this.b.g;
    }

    public final boolean j() {
        return this.b.h;
    }

    /* synthetic */ aamc(aaml aaml, anze anze, afsw afsw, afpd afpd, afqa afqa, Set set, Set set2, afmh afmh, String str, String str2, bqi bqi, boolean z, boolean z2, boolean z3, long j, boolean z4, xsv xsv, xsc xsc, afpu afpu, zzl zzl, aalx aalx, boolean z5, bcaa bcaa, wxm wxm, wxj wxj, aftt aftt) {
        bqi bqi2 = bqi;
        afsw afsw2 = afsw;
        afmh afmh2 = afmh;
        super("", new aflz(afsw, afmh), aaml.e() ^ 1);
        this.b = (aaml) amqw.a((Object) aaml);
        this.k = anze;
        this.l = (bqj) amqw.a((Object) afsw);
        this.m = (afpd) amqw.a((Object) afpd);
        this.n = afqa;
        this.o = (Set) amqw.a((Object) set);
        this.q = (Set) amqw.a((Object) set2);
        this.s = (afmh) amqw.a((Object) afmh);
        this.t = str;
        this.u = str2;
        this.v = bqi2;
        this.w = zzl;
        if (bqi2 == bqi.IMMEDIATE) {
            i();
        }
        this.C = z;
        this.I = z2;
        this.A = z3;
        this.B = j;
        this.J = xsv.a(H);
        this.D = z4;
        this.K = (xsc) amqw.a((Object) xsc);
        this.y = (afpu) amqw.a((Object) afpu);
        this.f = this;
        this.r = aalx;
        this.x = z5;
        this.z = bcaa;
        this.E = (wxm) amqw.a((Object) wxm);
        this.F = (wxj) amqw.a((Object) wxj);
        this.G = aftt;
    }

    static {
        ammv d = ammw.b.d();
        ammv d2 = ammw.b.d();
        d2.a(22, ammw.a);
        d.a(1, d2.a());
        a = d.a();
    }
}
