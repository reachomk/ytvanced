package defpackage;

import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: aamk */
public final class aamk extends afsv implements bqm {
    private static final xsy F = new xsy(100, 10000, 3);
    private final long A;
    private final boolean B;
    private final boolean C;
    private final wxm D;
    private final aftt E;
    private final boolean G;
    private final xsw H;
    private final xsc I;
    private byte[] J;
    private Map K;
    private String L;
    private String M;
    private Boolean N = Boolean.valueOf(false);
    private final aaml a;
    private final Class b;
    private final bqj k;
    private final afpd l;
    private final afqa m;
    private final Set n;
    private final Set o;
    private final aalx q;
    private final afmh r;
    private final String s;
    private final String t;
    private final bqi u;
    private final zzl v;
    private final boolean w;
    private final afpu x;
    private final bcaa y;
    private final boolean z;

    public final afpt bm_() {
        return this.a.m;
    }

    public final String k() {
        return this.a.k;
    }

    public final boolean l() {
        return this.a.l();
    }

    public final bqn a(bqn bqn) {
        if (this.C) {
            c((aals) a(aals.class));
            b(aals.f().a(Long.valueOf(0)).a(0).a(this.a.l).b(b()).a(this.a.m()).a());
        }
        return bqn instanceof bql ? new xvc(bqn) : bqn;
    }

    public final Map c() {
        this.a.getClass();
        if (this.K == null) {
            this.K = new HashMap();
            this.K.put("Content-Type", "application/x-protobuf");
            this.K.put("X-GOOG-API-FORMAT-VERSION", "2");
            this.l.a(this.K, a(Boolean.valueOf(false)), a());
            if (!l() && this.E.a()) {
                this.E.a(f());
            }
            for (afsa a : this.n) {
                a.a(this.K, this);
            }
        }
        Map map = this.K;
        xvj.a();
        return map;
    }

    private final String a(Boolean bool) {
        this.a.getClass();
        if (this.L == null || bool.booleanValue()) {
            Builder appendQueryParameter = this.r.f().buildUpon().appendEncodedPath(this.r.h()).appendEncodedPath(this.a.l).appendQueryParameter("key", this.s);
            if (!TextUtils.isEmpty(this.t)) {
                appendQueryParameter.appendQueryParameter("asig", this.t);
            }
            for (Entry entry : this.a.f().entrySet()) {
                appendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            if (bool.booleanValue()) {
                appendQueryParameter.appendQueryParameter("retry", "1");
            }
            this.L = appendQueryParameter.build().toString();
        }
        return this.L;
    }

    public final String f() {
        return a(this.N);
    }

    public final byte[] a() {
        aaml aaml = this.a;
        aaml.getClass();
        if (this.J == null) {
            aaml.h();
            this.J = p().toByteArray();
        }
        return this.J;
    }

    public final bqh a(bqd bqd) {
        String str = "Programmer error using reflection.";
        this.a.getClass();
        xak.b();
        try {
            aoca aoca = (aoca) this.b.newInstance();
            long b = this.I.b();
            xhs xhs = this.a.n;
            if (xhs != null) {
                xhs.c();
            }
            aoca = a(bqd.b, aoca);
            asic a = akcm.a(aoca);
            long b2 = this.I.b();
            if (xhs != null) {
                xhs.d();
            }
            byte[] bArr = bqd.b;
            bpz bpz = null;
            if (this.w) {
                ((aalr) this.y.get()).a(this.a.i(), a);
                asif asif = (asif) ((anxo) a.toBuilder());
                asif.copyOnWrite();
                a = (asic) asif.instance;
                a.j = null;
                a.a &= -65537;
                a = (asic) ((anxl) asif.build());
                akcm.a(aoca, a);
                bArr = aocf.toByteArray(aoca);
            }
            String a2 = this.x.c().a();
            String a3 = this.a.m.a();
            avao avao = this.v.b().f;
            if (avao == null) {
                avao = avao.f;
            }
            if (avao.b && this.a.j()) {
                if (a3 == null) {
                    if (a2 == null) {
                    }
                }
                if (!a2.equals(a3)) {
                    if (!this.a.l()) {
                        return bqh.a(new bpx("Authentication changed while request was being made"));
                    }
                }
            }
            if (a != null) {
                for (aams aams : this.o) {
                    if (!(aams instanceof aamy) || !l()) {
                        aams.a(a);
                    }
                }
            }
            if (!afsv.c(bqd)) {
                this.q.a(aoca, a);
                bqd = afsv.d(bqd);
            }
            if (this.a.d()) {
                bpz = abmj.a(bArr, bqd.c, a);
            }
            this.a.g = afkt.a(bpz);
            bqh a4 = bqh.a(aoca, bpz);
            if (this.C) {
                c((aals) a(aals.class));
                aalv a5 = aals.f().a(Long.valueOf(b2 - b));
                byte[] bArr2 = bqd.b;
                b(a5.a(bArr2 != null ? bArr2.length : 0).a(this.a.l).b(b()).a(this.a.m()).a());
            }
            xvj.a();
            return a4;
        } catch (aocg e) {
            xtl.a("Failed while attempting to deserialize network response", e);
            return bqh.a(new bqf(e));
        } catch (InstantiationException e2) {
            throw new RuntimeException(str, e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(str, e3);
        }
    }

    public final String g() {
        if (this.M == null) {
            String a = this.a.a();
            if ("NO_CACHE_KEY_VALUE".equals(a)) {
                this.M = f();
            } else {
                this.M = a;
            }
        }
        return this.M;
    }

    public final void a(aoca aoca) {
        this.a.getClass();
        n();
        this.k.a(aoca);
        xvj.a();
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
        String str = !this.a.e() ? "CACHE READ DISABLED" : !this.a.d() ? "CACHE DISABLED" : !o() ? "CACHE MISS" : "CACHE HIT";
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
        anzd c = this.a.c();
        Object obj = (asib) ((anxo) this.a.i().toBuilder());
        if (this.w) {
            obj = ((aalr) this.y.get()).a(obj);
        }
        return ((anzd) this.D.a(c, obj)).build();
    }

    public final bqi d() {
        return this.u;
    }

    public final void n() {
        this.J = null;
    }

    private final aoca a(byte[] bArr, aoca aoca) {
        this.a.getClass();
        aoca aoca2 = (aoca) aocf.mergeFrom(aoca, bArr);
        xvj.a();
        return aoca2;
    }

    public final synchronized List b(bqd bqd) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String name = this.b.getName();
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
        boolean z = this.a.g;
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
                arrayList.addAll(xvd.b(aamq.a(a(bqd.b, (aoca) this.b.newInstance())).toString()));
            } catch (aocg e) {
                arrayList.add("Could not parse response. See earlier logcat.");
                xtl.a("Could not parse response", e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Programmer error using reflection.", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Programmer error using reflection.", e3);
            }
        }
        name = new String(bqd.b);
        String str3 = "Error response: ";
        arrayList.add(name.length() == 0 ? new String(str3) : str3.concat(name));
        return arrayList;
    }

    public final int aZ_() {
        if (this.z) {
            long j = this.A;
            if (j > 0) {
                return (int) j;
            }
        }
        return (int) this.H.b();
    }

    public final int b() {
        return (int) this.H.b;
    }

    public final void a_(bqn bqn) {
        arvt b = this.v.b();
        if (b != null) {
            avao avao = b.f;
            if (avao == null) {
                avao = avao.f;
            }
            if (avao.c) {
                this.N = Boolean.valueOf(true);
            }
        }
        boolean z = bqn instanceof bpx;
        if (!z && (!xic.a(bqn) || (this.G && !j()))) {
            throw bqn;
        } else if (!this.H.a()) {
            throw bqn;
        } else if (!z) {
        } else {
            if (b() <= 1) {
                afpt bm_ = bm_();
                if (bm_ != afpt.g) {
                    afqa afqa = this.m;
                    if (afqa != null) {
                        this.K = null;
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
        return this.a.g;
    }

    public final boolean j() {
        return this.a.h;
    }

    /* synthetic */ aamk(aaml aaml, Class cls, afsw afsw, afpd afpd, afqa afqa, Set set, Set set2, afmh afmh, String str, String str2, bqi bqi, boolean z, boolean z2, long j, boolean z3, xsv xsv, xsc xsc, afpu afpu, zzl zzl, aalx aalx, boolean z4, bcaa bcaa, wxm wxm, aftt aftt) {
        bqi bqi2 = bqi;
        afsw afsw2 = afsw;
        afmh afmh2 = afmh;
        super("", new aflz(afsw, afmh), aaml.e() ^ 1);
        this.a = (aaml) amqw.a((Object) aaml);
        this.b = (Class) amqw.a((Object) cls);
        this.k = (bqj) amqw.a((Object) afsw);
        this.l = (afpd) amqw.a((Object) afpd);
        this.m = afqa;
        this.n = (Set) amqw.a((Object) set);
        this.o = (Set) amqw.a((Object) set2);
        this.r = (afmh) amqw.a((Object) afmh);
        this.s = str;
        this.t = str2;
        this.u = bqi2;
        this.v = zzl;
        if (bqi2 == bqi.IMMEDIATE) {
            i();
        }
        this.B = false;
        this.G = z;
        this.z = z2;
        this.A = j;
        this.H = xsv.a(F);
        this.C = z3;
        this.I = (xsc) amqw.a((Object) xsc);
        this.x = (afpu) amqw.a((Object) afpu);
        this.f = this;
        this.q = aalx;
        this.w = z4;
        this.y = bcaa;
        this.D = (wxm) amqw.a((Object) wxm);
        this.E = aftt;
    }
}
