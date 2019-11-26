package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: algx */
public final class algx implements alev, alfd, alfl, algc, alig, almu, almv, xcp {
    private final bqa A;
    private final alfi B;
    private final alge C;
    private final SharedPreferences D;
    private final akpe E;
    private final akpi F;
    private Future G;
    private boolean H;
    private Long I;
    private aqhy J;
    private bcaa K;
    private aruh L;
    private View M;
    private boolean N;
    private boolean O;
    private boolean P;
    public final xoi a;
    public final Context b;
    public final aaas c;
    public final alha d;
    public final List e = new ArrayList();
    public apxu f;
    public boolean g;
    public boolean h;
    private final apxu i;
    private final aarh j;
    private final acvx k;
    private final ExecutorService l;
    private final xci m;
    private final akkq n;
    private final aovk o;
    private final akvp p;
    private final alfc q;
    private final aleu r;
    private final akpb s = new aknw();
    private final akpb t;
    private final akpd u;
    private final akpd v;
    private final alez w;
    private final Handler x;
    private final Runnable y;
    private final allh z;

    public algx(apxu apxu, aarh aarh, acvx acvx, xoi xoi, ExecutorService executorService, xci xci, akkq akkq, aovk aovk, Context context, aaas aaas, akvp akvp, alha alha, alfc alfc, aleu aleu, allh allh, bqa bqa, alfi alfi, alge alge, SharedPreferences sharedPreferences, akpe akpe, akpi akpi, int i, int i2) {
        anxp anxp = apxu;
        akpe akpe2 = akpe;
        Object alez = new alez();
        Object handler = new Handler(Looper.getMainLooper());
        this.i = (apxu) amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
        apxu.a(access$000);
        amqw.a(anxp.h.a(access$000.d));
        this.j = (aarh) amqw.a((Object) aarh);
        this.k = (acvx) amqw.a((Object) acvx);
        this.a = (xoi) amqw.a((Object) xoi);
        this.l = (ExecutorService) amqw.a((Object) executorService);
        this.m = (xci) amqw.a((Object) xci);
        this.n = (akkq) amqw.a((Object) akkq);
        this.o = (aovk) amqw.a((Object) aovk);
        this.b = (Context) amqw.a((Object) context);
        this.c = (aaas) amqw.a((Object) aaas);
        this.p = (akvp) amqw.a((Object) akvp);
        this.d = (alha) amqw.a((Object) alha);
        this.q = (alfc) amqw.a((Object) alfc);
        this.r = (aleu) amqw.a((Object) aleu);
        this.z = (allh) amqw.a((Object) allh);
        this.A = (bqa) amqw.a((Object) bqa);
        this.E = (akpe) amqw.a((Object) akpe);
        this.F = (akpi) amqw.a((Object) akpi);
        this.u = akpe2.a(this.s);
        this.t = new aknw();
        this.v = akpe2.a(this.t);
        this.v.a(new aknp(i, i2));
        this.w = (alez) amqw.a(alez);
        this.x = (Handler) amqw.a(handler);
        this.y = new algz(this);
        this.B = (alfi) amqw.a((Object) alfi);
        this.C = (alge) amqw.a((Object) alge);
        this.D = (SharedPreferences) amqw.a((Object) sharedPreferences);
        allh.a();
    }

    public final void a(String str) {
    }

    public final void e() {
        this.G = this.l.submit(new algw(this));
        this.z.a(this.C);
        this.m.a((Object) this);
        this.B.a(this);
        apxu apxu = this.i;
        anxr access$000 = anxl.checkIsLite(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint = (ShareEndpointOuterClass$ShareEntityEndpoint) b;
        if (!shareEndpointOuterClass$ShareEntityEndpoint.c.isEmpty()) {
            this.d.b(false);
            a(new aatz(shareEndpointOuterClass$ShareEntityEndpoint.c));
        } else if (shareEndpointOuterClass$ShareEntityEndpoint.b.isEmpty()) {
            throw new IllegalArgumentException("Invalid share entity endpoint provided.");
        } else {
            String str = shareEndpointOuterClass$ShareEntityEndpoint.b;
            this.m.d(new alhf());
            this.d.b(true);
            this.j.a(str, alpq.a(h(), this.o), new alhb(this), false);
        }
    }

    public final void b() {
        if (this.f != null) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
            hashMap.put("SendShareToConversationListener", this);
            hashMap.put("endpoint_resolver_override", this.c);
            if (!this.P) {
                if (this.w.a()) {
                    aley.b(this.b, this.w.b, this.c, this.k, new algy(this, hashMap), hashMap);
                } else {
                    this.c.a(this.f, hashMap);
                }
            }
        }
    }

    public final void bG_() {
        i();
    }

    public final void a() {
        i();
    }

    public final void c() {
        j();
    }

    public final void b(apxu apxu) {
        j();
    }

    public final void d() {
        k();
    }

    public final boolean a(aseo aseo) {
        k();
        return false;
    }

    public final void f() {
        this.H = true;
        this.B.b(this);
        this.z.b(this.C);
        for (algm c : this.e) {
            c.c();
        }
        this.m.b(this);
        this.m.d(new alhe());
        apxu apxu = this.i;
        anxr access$000 = anxl.checkIsLite(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            bqa bqa = this.A;
            apxu apxu2 = this.i;
            anxr access$0002 = anxl.checkIsLite(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
            apxu2.a(access$0002);
            Object b = apxu2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            bqa.c(aatw.a(((ShareEndpointOuterClass$ShareEntityEndpoint) b).b, alpq.a(h(), this.o)));
        }
    }

    public final void a(apxu apxu, CharSequence charSequence, arwf arwf, int i, Long l) {
        this.w.a = i > 1;
        this.f = apxu;
        alha alha = this.d;
        boolean z = (this.f == null || this.N) ? false : true;
        alha.a(z);
        if (TextUtils.isEmpty(charSequence) || this.N) {
            this.d.b();
        } else {
            this.d.a(charSequence);
        }
        this.I = l;
        if (!this.N) {
            return;
        }
        if (i > 0) {
            this.C.a(alll.a(charSequence, arwf));
            this.C.b();
            this.d.d(true);
            return;
        }
        this.C.a(null);
        this.C.c();
        if (!this.O) {
            this.d.d(false);
        }
    }

    public final void a(boolean z) {
        this.d.c(z);
    }

    public final void b(boolean z) {
        if (z) {
            this.d.c();
        }
    }

    public final void a(aqhy aqhy, bcaa bcaa) {
        this.J = aqhy;
        this.K = bcaa;
        g();
    }

    public final void a(aruh aruh, View view) {
        this.L = aruh;
        this.M = view;
        g();
    }

    public final void aa() {
        this.d.d();
    }

    public final void g() {
        if (this.g && !this.h) {
            if (this.J != null) {
                bcaa bcaa = this.K;
                this.q.a(this.J, bcaa != null ? (Rect) bcaa.get() : null);
                this.h = true;
                return;
            }
            aruh aruh = this.L;
            if (aruh != null) {
                View view = this.M;
                if (view != null) {
                    this.r.a(aruh, view, this.z);
                }
            }
        }
    }

    public final void a(aauf aauf) {
        if (!this.H) {
            aatz aatz = (aatz) aauf;
            if (aatz.b == null) {
                akam akam = aatz.a.a;
                if (akam != null) {
                    akbh akbh = akam.a;
                    if (akbh != null) {
                        aatz.b = new aaul(akbh);
                    }
                }
            }
            aaul aaul = aatz.b;
            if (aaul == null) {
                xtl.c("Unified share panel not returned.");
                this.a.a((int) R.string.common_error_generic);
                this.d.d();
                return;
            }
            Object obj;
            int i;
            this.w.b = aaul.b();
            aylc aylc = aaul.a.e;
            boolean z = false;
            boolean z2 = aylc != null && aylc.a == 133836655;
            this.N = z2;
            atst atst = null;
            this.k.a(acwl.at, this.i, null);
            this.k.a(aauf.a());
            this.k.a(aauf.a(), null);
            aylu a = aaul.a();
            if (a != null) {
                algn algn = new algn(a, this.b, this.n, this.c);
                this.e.add(algn);
                algn.a(this.s);
                this.u.a(algn.a);
            }
            aknh akoh = new akoh();
            if (aaul.b == null) {
                aaul.b = new ArrayList();
                ayma ayma = aaul.a.f;
                if (!(ayma == null || (ayma.a & 1) == 0)) {
                    List list = aaul.b;
                    obj = ayma.b;
                    if (obj == null) {
                        obj = ayly.j;
                    }
                    list.add(obj);
                }
                akaj[] akajArr = aaul.a.a;
                if (akajArr != null) {
                    for (akaj akaj : akajArr) {
                        ajte ajte = akaj.c;
                        if (ajte != null) {
                            aaul.b.add(new aata(ajte, aaul.b()));
                        } else {
                            aylm aylm = akaj.d;
                            if (aylm != null) {
                                aaul.b.add(aylm);
                            } else {
                                aymk aymk = akaj.b;
                                if (aymk != null) {
                                    aaul.b.add(aymk);
                                } else {
                                    ayko ayko = akaj.e;
                                    if (ayko != null) {
                                        aaul.b.add(ayko);
                                    } else {
                                        aymi aymi = akaj.f;
                                        if (aymi != null) {
                                            aaul.c = true;
                                            aaul.b.add(aymi);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                aylc = aaul.a.e;
                if (aylc != null && aylc.a == 133836655) {
                    aaul.b.add((ayla) aylc.b);
                }
            }
            List list2 = aaul.b;
            aylu a2 = aaul.a();
            if (a2 != null) {
                ayme ayme = a2.c;
                if (ayme == null) {
                    ayme = ayme.c;
                }
                if (ayme.a == 133737618) {
                    ayme = a2.c;
                    if (ayme == null) {
                        ayme = ayme.c;
                    }
                    list2.add(0, ayme.a == 133737618 ? (aymg) ayme.b : aymg.d);
                }
                ayls ayls = a2.b;
                if (ayls == null) {
                    ayls = ayls.c;
                }
                if ((ayls.a & 1) != 0) {
                    ayls ayls2 = a2.b;
                    if (ayls2 == null) {
                        ayls2 = ayls.c;
                    }
                    Object obj2 = ayls2.b;
                    if (obj2 == null) {
                        obj2 = ayks.f;
                    }
                    list2.add(0, obj2);
                }
            }
            for (Object next : list2) {
                if (next instanceof aata) {
                    aphg aphg;
                    Object obj3;
                    String a3;
                    aata aata = (aata) next;
                    allh allh = this.z;
                    allh.a();
                    allh.m = "";
                    allh.g = aata.a.d;
                    allh.h = aata.c();
                    allh.i = aata.d();
                    aphj aphj = aata.a.a;
                    if (aphj == null || (aphj.a & 1) == 0) {
                        aphg = atst;
                    } else {
                        aphg = aphj.b;
                        if (aphg == null) {
                            aphg = aphg.s;
                        }
                    }
                    allh.a(aphg);
                    allh.b.clear();
                    allh.e.clear();
                    for (Object next2 : aata.a()) {
                        allh.b.add(next2);
                        if (next2 instanceof aqjo) {
                            aqjo aqjo = (aqjo) next2;
                            if ((aqjo.a & 4) != 0) {
                                aqkp aqkp = aqjo.e;
                                if (aqkp == null) {
                                    aqkp = aqkp.c;
                                }
                                obj3 = aqkp.b;
                                if (obj3 == null) {
                                    obj3 = aqkn.f;
                                }
                            } else {
                                obj3 = atst;
                            }
                            for (Object next3 : aatc.a(aqjo)) {
                                a3 = alpt.a(next3);
                                allh.c.put(a3, new allg(next3));
                                allh.e.put(a3, obj3);
                                atst = null;
                            }
                        } else {
                            if (next2 instanceof aqjy) {
                                for (aqjw aqjw : ((aqjy) next2).c) {
                                    int i2 = aqjw.a;
                                    if ((i2 & 1) != 0) {
                                        obj3 = aqjw.b;
                                        if (obj3 == null) {
                                            obj3 = aqju.g;
                                        }
                                        allh.c.put(alpt.a(obj3), new allg(obj3));
                                    } else if ((i2 & 2) != 0) {
                                        aqka aqka = aqjw.c;
                                        if (aqka == null) {
                                            aqka = aqka.h;
                                        }
                                        Set set;
                                        aqka aqka2;
                                        if (aqka.d.isEmpty()) {
                                            set = allh.a;
                                            aqka2 = aqjw.c;
                                            if (aqka2 == null) {
                                                aqka2 = aqka.h;
                                            }
                                            set.add(aqka2.c);
                                        } else {
                                            set = allh.a;
                                            aqka2 = aqjw.c;
                                            if (aqka2 == null) {
                                                aqka2 = aqka.h;
                                            }
                                            set.add(aqka2.d);
                                            allh.k = true;
                                        }
                                    }
                                }
                            }
                            atst = null;
                        }
                    }
                    allh.f.clear();
                    allh.n = z;
                    aatd b = aata.b();
                    if (b != null) {
                        for (Object obj32 : b.b()) {
                            if (obj32 instanceof aaub) {
                                Object obj4;
                                aaub aaub = (aaub) obj32;
                                ayle ayle = aaub.a;
                                aqkp aqkp2 = ayle.e;
                                if (aqkp2 == null) {
                                    aqkp2 = aqkp.c;
                                }
                                if ((aqkp2.a & 1) == 0) {
                                    obj4 = null;
                                } else {
                                    aqkp aqkp3 = ayle.e;
                                    if (aqkp3 == null) {
                                        aqkp3 = aqkp.c;
                                    }
                                    obj4 = aqkp3.b;
                                    if (obj4 == null) {
                                        obj4 = aqkn.f;
                                    }
                                }
                                for (aylg aylg : aaub.a()) {
                                    a3 = alps.a(aylg);
                                    allh.c.put(a3, new allg(alps.c(aylg)));
                                    allh.e.put(a3, obj4);
                                }
                            }
                        }
                        apxu[] apxuArr = b.a.e;
                        if (apxuArr != null) {
                            allh.f.addAll(Arrays.asList(apxuArr));
                        }
                    }
                    obj = new alfb(aata, this.b, this.n, this.c, this.p, this.q, this.z, this.k, this.E);
                } else if (next instanceof aymk) {
                    algt algt = new algt((aymk) next, this.b, this.c, this.o, h(), this.d, this.m, this.n, this.z, this.k, this.N);
                } else {
                    algf algf;
                    if (next instanceof aylm) {
                        algf = new algf(this.b, (aylm) next);
                    } else if (next instanceof aymg) {
                        algf = new algo((aymg) next, this.b, this.c);
                    } else if (next instanceof ayly) {
                        algd algd = new algd((ayly) next, this.b, this.n, this.c, this.p, this.D);
                    } else if (next instanceof ayks) {
                        obj = new alet((ayks) next, this.b, this.c, this.F, this.k, this.d, this);
                    } else if (next instanceof aymi) {
                        algr algr = new algr((aymi) next, this.b, this.d, this.p, this.c);
                    } else {
                        obj = null;
                    }
                    obj = algf;
                }
                if (obj != null) {
                    this.e.add(obj);
                    obj.a(this.t);
                    akoh.a(obj.a());
                } else if (next instanceof ayla) {
                    aphg aphg2;
                    ayla ayla = (ayla) next;
                    allh allh2 = this.z;
                    aphj aphj2 = ayla.e;
                    if (aphj2 == null) {
                        aphj2 = aphj.d;
                    }
                    if ((aphj2.a & 1) != 0) {
                        aphj2 = ayla.e;
                        if (aphj2 == null) {
                            aphj2 = aphj.d;
                        }
                        aphg2 = aphj2.b;
                        if (aphg2 == null) {
                            aphg2 = aphg.s;
                        }
                    } else {
                        aphg2 = null;
                    }
                    allh2.a(aphg2);
                    this.C.c = ayla;
                }
                z = false;
                atst = null;
            }
            this.O = aaul.c;
            this.v.a(akoh);
            xci xci = this.m;
            this.v.a();
            xci.d(new alhg());
            list2 = new ArrayList();
            list2.add(this);
            list2.addAll(this.e);
            for (algm a4 : this.e) {
                a4.a(list2);
            }
            alge alge = this.C;
            int size = list2.size();
            for (i = 0; i < size; i++) {
                alge.a(list2.get(i));
            }
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
            for (apxu a5 : aaul.a.d) {
                this.c.a(a5, hashMap);
            }
            this.d.a(this.u, this.v);
        }
    }

    private final List h() {
        try {
            return (List) this.G.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            xtl.a("Error retrieving share-capable activities.", e);
            return new ArrayList();
        }
    }

    private final void i() {
        this.P = true;
        this.m.d(new alhj());
        this.d.a(false);
        this.d.b(true);
        Long l = this.I;
        if (l != null) {
            this.x.postDelayed(this.y, l.longValue());
        }
    }

    private final void j() {
        this.P = false;
        this.x.removeCallbacks(this.y);
        this.d.a(this.N ^ 1);
        this.d.b(false);
    }

    private final void k() {
        this.P = false;
        this.z.c(null);
        this.x.removeCallbacks(this.y);
        this.d.a(this.N ^ 1);
        this.d.b(false);
        this.d.d();
        this.m.d(new alhc());
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{zye.class, alhc.class};
        } else if (i == 0) {
            this.d.a((zye) obj);
            return null;
        } else if (i == 1) {
            this.d.d();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
