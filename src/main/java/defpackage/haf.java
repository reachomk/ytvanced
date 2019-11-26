package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.concurrent.Executor;

/* renamed from: haf */
public final class haf extends ehx {
    public final bcaa f;
    private final bcaa g;
    private final ebw h;
    private final Context i;
    private final afve j;
    private final zyw k;
    private final zzl l;
    private final bcaa m;
    private final bcaa n;
    private final Executor o;
    private final bcaa p;

    public haf(Context context, bcaa bcaa, xsc xsc, ebw ebw, afve afve, zyw zyw, zzl zzl, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, Executor executor, bcaa bcaa5) {
        super(bcaa, xsc);
        this.i = context;
        this.g = (bcaa) amqw.a((Object) bcaa);
        this.h = (ebw) amqw.a((Object) ebw);
        this.j = afve;
        this.k = zyw;
        this.l = zzl;
        this.f = (bcaa) amqw.a((Object) bcaa2);
        this.m = bcaa3;
        this.n = bcaa4;
        this.o = executor;
        this.p = (bcaa) amqw.a((Object) bcaa5);
    }

    public final void e() {
        afve afve = this.j;
        Context context = this.i;
        zyw zyw = this.k;
        bcaa bcaa = this.m;
        bcaa bcaa2 = this.p;
        bcaa bcaa3 = this.n;
        aaps a = ((aapn) this.g.get()).a(new ebv(this.h.a));
        String str = "FEwhat_to_watch";
        haf.a(a, aaax.a(str), false, str, null, null, afve, context, zyw, bcaa, bcaa2, bcaa3, this.l);
        a(a);
    }

    public static void a(aaps aaps, afve afve, Context context, zyw zyw) {
        if (zyw != null) {
            apxn a = zyw.a();
            if (a != null) {
                aulu aulu = a.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                if (aulu.U && afve != null && context != null) {
                    avkk avkk = (avkk) avki.e.createBuilder();
                    boolean a2 = afve.a(context);
                    avkk.copyOnWrite();
                    avki avki = (avki) avkk.instance;
                    avki.a |= 2;
                    avki.b = a2;
                    a2 = afve.a();
                    avkk.copyOnWrite();
                    avki = (avki) avkk.instance;
                    avki.a |= 8;
                    avki.d = a2;
                    if (afve.b() > 0) {
                        long b = afve.b();
                        avkk.copyOnWrite();
                        avki = (avki) avkk.instance;
                        avki.a |= 4;
                        avki.c = b;
                    }
                    aaps.r = (avki) ((anxl) avkk.build());
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        this.h.a.d(new eep());
    }

    public static apxu a(aaps aaps, apxu apxu, boolean z, String str, byte[] bArr, zeb zeb, afve afve, Context context, zyw zyw, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, zzl zzl) {
        if (bArr == null) {
            aaps.g();
        } else {
            aaps.a(bArr);
        }
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                apge apge;
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                apgd apgd = (apgd) ((anxo) ((apge) obj).toBuilder());
                aaps.c(str);
                aaps.d(((apge) apgd.instance).c);
                aaps.d = aali.b(((apge) apgd.instance).d);
                if (z) {
                    aaps.a(aall.WRITE_ONLY);
                }
                if ((((apge) apgd.instance).a & 64) != 0) {
                    asbl asbl = (asbl) asbi.b.createBuilder();
                    asbl.a(apgd.a().a);
                    aaps.p = (asbi) ((anxl) asbl.build());
                    apgd.copyOnWrite();
                    apge = (apge) apgd.instance;
                    apge.g = null;
                    apge.a &= -65;
                }
                apge = (apge) apgd.instance;
                if (!((apge.a & 128) == 0 || zeb == null)) {
                    aqtc aqtc = apge.h;
                    if (aqtc == null) {
                        aqtc = aqtc.c;
                    }
                    Object a = zeb.a(Uri.parse(aqtc.b));
                    if (a instanceof aqjc) {
                        aqje aqje = ((aqjc) a).b;
                        if (aqje == null) {
                            aqje = aqje.a;
                        }
                        aaps.e = aqje;
                    }
                }
                apxx apxx = (apxx) ((anxo) apxu.toBuilder());
                apxx.a(BrowseEndpointOuterClass.browseEndpoint, (apge) ((anxl) apgd.build()));
                apxu = (apxu) ((anxl) apxx.build());
                haf.a(bcaa, aaps, zyw);
                ((aapv) amqw.a((aapv) ((bcaa) amqw.a((Object) bcaa2)).get())).a(aaps);
            }
        }
        haf.a(aaps, afve, context, zyw);
        haf.a(aaps, bcaa3, zzl);
        return apxu;
    }

    public static void a(bcaa bcaa, aaps aaps, zyw zyw) {
        if (zyw != null && bcaa != null) {
            apxn a = zyw.a();
            if (a != null) {
                awuo awuo = a.u;
                if (awuo == null) {
                    awuo = awuo.c;
                }
                awuq awuq = awuo.b;
                if (awuq == null) {
                    awuq = awuq.d;
                }
                if (awuq.b) {
                    String str = (String) bcaa.get();
                    if (!TextUtils.isEmpty(str)) {
                        aaps.j = str;
                    }
                }
            }
        }
    }

    public static void a(aaps aaps, bcaa bcaa, zzl zzl) {
        arvt b = zzl.b();
        if (b != null) {
            aume aume = b.e;
            if (aume == null) {
                aume = aume.af;
            }
            if (aume.ac) {
                aqwa aqwa = (aqwa) aqwb.d.createBuilder();
                xhv xhv = (xhv) bcaa.get();
                if (xhv != null) {
                    long l = xhv.l();
                    aqwa.copyOnWrite();
                    aqwb aqwb = (aqwb) aqwa.instance;
                    aqwb.a |= 2;
                    aqwb.c = l;
                    boolean j = xhv.j();
                    aqwa.copyOnWrite();
                    aqwb aqwb2 = (aqwb) aqwa.instance;
                    aqwb2.a |= 1;
                    aqwb2.b = j;
                }
                aqvu aqvu = (aqvu) aqvv.f.createBuilder();
                aqvu.copyOnWrite();
                aqvv aqvv = (aqvv) aqvu.instance;
                aqvv.e = (aqwb) ((anxl) aqwa.build());
                aqvv.a |= 8;
                Object obj = (aqvv) ((anxl) aqvu.build());
                amqw.a(obj);
                aaps.u = obj;
            }
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a() {
        this.h.a.d(new een());
    }

    static final /* synthetic */ void a(afsw afsw, Throwable th) {
        if (th instanceof bqn) {
            afsw.a((bqn) th);
        } else {
            afsw.a(new bqn(th));
        }
    }
}
