package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint;
import com.google.protos.youtube.api.innertube.SubtitlesEndpointOuterClass$SubtitlesEndpoint;

/* renamed from: dmg */
final class dmg implements hff {
    private volatile Object A = new baqe();
    private volatile Object B = new baqe();
    private volatile Object C = new baqe();
    private volatile Object D = new baqe();
    public volatile Object a = new baqe();
    public volatile Object b = new baqe();
    public volatile bcaa c;
    public volatile Object d = new baqe();
    public volatile bcaa e;
    public volatile Object f = new baqe();
    public volatile Object g = new baqe();
    public volatile Object h = new baqe();
    public volatile Object i = new baqe();
    public final /* synthetic */ dlu j;
    private volatile Object k = new baqe();
    private volatile bcaa l;
    private volatile bcaa m;
    private volatile Object n = new baqe();
    private volatile bcaa o;
    private volatile Object p = new baqe();
    private volatile bcaa q;
    private volatile bcaa r;
    private volatile bcaa s;
    private volatile Object t = new baqe();
    private volatile bcaa u;
    private volatile Object v = new baqe();
    private volatile Object w = new baqe();
    private volatile bcaa x;
    private volatile Object y = new baqe();
    private volatile Object z = new baqe();

    private final Object h() {
        return new hdv(xfa.a(this.j.a));
    }

    private final aicn i() {
        return new aicn(this.j.dL.bR(), this.j.dL.at(), this.j.dL.dJ());
    }

    public final Object a() {
        Object obj = this.k;
        if (!(obj instanceof baqe)) {
            return obj;
        }
        Object obj2;
        synchronized (obj) {
            obj2 = this.k;
            if (obj2 instanceof baqe) {
                obj2 = h();
                bcaa nK = this.j.dL.nK();
                xci oC = this.j.dL.oC();
                aicn i = i();
                Object hea = new hea((hdv) obj2, nK, this.j.dL.el(), oC);
                hea.a(i.a((aibb) hea, new aigb()));
                obj2 = (hea) baqd.a(hea, "Cannot return null from a non-@Nullable @Provides method");
                this.k = bapx.a(this.k, obj2);
            }
        }
        return obj2;
    }

    public final bcaa b() {
        bcaa bcaa = this.l;
        if (bcaa != null) {
            return bcaa;
        }
        dmj dmj = new dmj(this, 2);
        this.l = dmj;
        return dmj;
    }

    public final bcaa c() {
        bcaa bcaa = this.m;
        if (bcaa != null) {
            return bcaa;
        }
        dmj dmj = new dmj(this, 3);
        this.m = dmj;
        return dmj;
    }

    public final aigw d() {
        Object obj = this.n;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.n;
                if (obj2 instanceof baqe) {
                    obj2 = (aigw) baqd.a(new hfl(this.j.dL.cd()), "Cannot return null from a non-@Nullable @Provides method");
                    this.n = bapx.a(this.n, obj2);
                }
            }
            obj = obj2;
        }
        return (aigw) obj;
    }

    public final vvz e() {
        return new vvz(this.j.dL.jx());
    }

    public final Object f() {
        Object obj = this.p;
        if (!(obj instanceof baqe)) {
            return obj;
        }
        Object obj2;
        synchronized (obj) {
            obj2 = this.p;
            if (obj2 instanceof baqe) {
                aizy d = this.j.d();
                Object h = h();
                bcaa nK = this.j.dL.nK();
                this.j.dL.oC();
                aicn i = i();
                adtp el = this.j.dL.el();
                heb heb = new heb((hdv) h, nK, el, this.j.dL.s(), this.j.dL.bY().n);
                heb.a(i.a((aibb) heb, (aigc) heb));
                heb.n = new hek(el, d, heb);
                obj2 = (heb) baqd.a((Object) heb, "Cannot return null from a non-@Nullable @Provides method");
                this.p = bapx.a(this.p, obj2);
            }
        }
        return obj2;
    }

    private final aaat j() {
        Object obj = this.w;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.w;
                if (obj2 instanceof baqe) {
                    Object obj3;
                    obj2 = this.v;
                    if (obj2 instanceof baqe) {
                        synchronized (obj2) {
                            obj3 = this.v;
                            if (obj3 instanceof baqe) {
                                aizy d = this.j.d();
                                bcaa bcaa = this.u;
                                if (bcaa == null) {
                                    bcaa = new dmj(this, 8);
                                    this.u = bcaa;
                                }
                                hej hej = new hej(d, bcaa, this.j.dL.oI());
                                this.v = bapx.a(this.v, hej);
                                obj3 = hej;
                            }
                        }
                        obj2 = obj3;
                    }
                    aaap aaap = (hej) obj2;
                    obj3 = new aaat();
                    obj3.a(aaap, SubtitlesEndpointOuterClass$SubtitlesEndpoint.class);
                    obj2 = (aaat) baqd.a(obj3, "Cannot return null from a non-@Nullable @Provides method");
                    this.w = bapx.a(this.w, obj2);
                }
            }
            obj = obj2;
        }
        return (aaat) obj;
    }

    private final hfd k() {
        Object obj = this.y;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.y;
                if (obj2 instanceof baqe) {
                    aaas gF = this.j.gF();
                    aaat j = j();
                    adtp el = this.j.dL.el();
                    bcaa bcaa = this.x;
                    if (bcaa == null) {
                        bcaa = new dmj(this, 9);
                        this.x = bcaa;
                    }
                    hfd hfd = new hfd(gF, j, el, bapx.b(bcaa));
                    this.y = bapx.a(this.y, hfd);
                    obj2 = hfd;
                }
            }
            obj = obj2;
        }
        return (hfd) obj;
    }

    public final hel g() {
        Object obj;
        Object obj2 = this.D;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.D;
                if (obj instanceof baqe) {
                    hfv hfv;
                    adtp adtp;
                    bcaa bcaa;
                    xci xci;
                    Context context;
                    Object obj3;
                    Context a = xfa.a(this.j.a);
                    xci oC = this.j.dL.oC();
                    adtp el = this.j.dL.el();
                    bcaa bcaa2 = this.o;
                    if (bcaa2 == null) {
                        bcaa2 = new dmj(this, 0);
                        this.o = bcaa2;
                    }
                    bcaa bcaa3 = bcaa2;
                    hfv hfv2 = this.C;
                    if (hfv2 instanceof baqe) {
                        synchronized (hfv2) {
                            hfv = this.C;
                            if (hfv instanceof baqe) {
                                auvn auvn;
                                heh heh;
                                hfs hfs;
                                lsl lsl;
                                Context a2 = xfa.a(this.j.a);
                                xci oC2 = this.j.dL.oC();
                                bcaa nK = this.j.dL.nK();
                                hfm a3 = hfp.a();
                                bcaa2 = this.q;
                                if (bcaa2 == null) {
                                    bcaa2 = new dmj(this, 5);
                                    this.q = bcaa2;
                                }
                                bcaa bcaa4 = bcaa2;
                                bcaa2 = this.r;
                                if (bcaa2 == null) {
                                    bcaa2 = new dmj(this, 6);
                                    this.r = bcaa2;
                                }
                                bcaa bcaa5 = bcaa2;
                                bcaa2 = this.s;
                                if (bcaa2 == null) {
                                    bcaa2 = new dmj(this, 7);
                                    this.s = bcaa2;
                                }
                                bcaa bcaa6 = bcaa2;
                                auvn auvn2 = this.t;
                                if (auvn2 instanceof baqe) {
                                    synchronized (auvn2) {
                                        auvn = this.t;
                                        if (auvn instanceof baqe) {
                                            Resources resources = xfa.a(this.j.a).getResources();
                                            auvq auvq = (auvq) auvn.l.createBuilder();
                                            adtp = el;
                                            bcaa = bcaa3;
                                            int i = 0;
                                            while (i < 2) {
                                                xci = oC;
                                                auvq.a(auvj.j);
                                                i++;
                                                oC = xci;
                                            }
                                            apxx apxx = (apxx) apxu.d.createBuilder();
                                            xci = oC;
                                            apxx.a(MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.mdxViewVideoInfoEndpoint, MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.a);
                                            hfj.a(resources, auvq, 0, R.string.mdx_video_info, (apxu) ((anxl) apxx.build()));
                                            apxx apxx2 = (apxx) apxu.d.createBuilder();
                                            apxx2.a(SubtitlesEndpointOuterClass$SubtitlesEndpoint.subtitlesEndpoint, SubtitlesEndpointOuterClass$SubtitlesEndpoint.a);
                                            hfj.a(resources, auvq, 1, R.string.closed_captions_menu_item, (apxu) ((anxl) apxx2.build()));
                                            auvn = (auvn) baqd.a((auvn) ((anxl) auvq.build()), "Cannot return null from a non-@Nullable @Provides method");
                                            this.t = bapx.a(this.t, auvn);
                                        } else {
                                            xci = oC;
                                            adtp = el;
                                            bcaa = bcaa3;
                                        }
                                    }
                                } else {
                                    xci = oC;
                                    adtp = el;
                                    bcaa = bcaa3;
                                    auvn = auvn2;
                                }
                                auvn auvn3 = auvn;
                                hfs hfs2 = new hfs(this.j.dL.cI(), this.j.dL.nK());
                                boolean dH = this.j.dL.dH();
                                heh heh2 = new heh(this.j.dL.cI());
                                adgp gI = this.j.gI();
                                akvo cj = this.j.cj();
                                mjy cf = this.j.cf();
                                lsl lsl2 = this.z;
                                if (lsl2 instanceof baqe) {
                                    synchronized (lsl2) {
                                        lsl lsl3 = this.z;
                                        if (lsl3 instanceof baqe) {
                                            Context a4 = xfa.a(this.j.a);
                                            mjy cf2 = this.j.cf();
                                            xci oC3 = this.j.dL.oC();
                                            akkq cd = this.j.dL.cd();
                                            hfd k = k();
                                            context = a;
                                            abka ef = this.j.dL.ef();
                                            xoi oI = this.j.dL.oI();
                                            akpe w = this.j.w();
                                            akph ch = this.j.ch();
                                            heh = heh2;
                                            hfs = hfs2;
                                            ch.a(hdp.class, new hdw(a4, cd));
                                            lsl = (lsl) baqd.a((Object) new lsl(oC3, k, ef, oI, w, ch, cf2.F), "Cannot return null from a non-@Nullable @Provides method");
                                            this.z = bapx.a(this.z, lsl);
                                        } else {
                                            hfs = hfs2;
                                            heh = heh2;
                                            context = a;
                                            lsl = lsl3;
                                        }
                                    }
                                } else {
                                    hfs = hfs2;
                                    heh = heh2;
                                    context = a;
                                    lsl = lsl2;
                                }
                                lsl lsl4 = lsl;
                                Object obj4 = this.B;
                                if (obj4 instanceof baqe) {
                                    synchronized (obj4) {
                                        obj = this.B;
                                        if (obj instanceof baqe) {
                                            Context a5 = xfa.a(this.j.a);
                                            xci oC4 = this.j.dL.oC();
                                            hfd k2 = k();
                                            obj3 = this.A;
                                            if (obj3 instanceof baqe) {
                                                synchronized (obj3) {
                                                    obj = this.A;
                                                    if (obj instanceof baqe) {
                                                        obj = (akwv) baqd.a(new akwv(xfa.a(this.j.a), k()), "Cannot return null from a non-@Nullable @Provides method");
                                                        this.A = bapx.a(this.A, obj);
                                                    }
                                                }
                                            } else {
                                                obj = obj3;
                                            }
                                            akwv akwv = (akwv) obj;
                                            jof jof = new jof(a5, oC4, k2, akwv, this.j.U());
                                            akwv.a((akvo) jof);
                                            obj = (akvo) baqd.a((Object) jof, "Cannot return null from a non-@Nullable @Provides method");
                                            this.B = bapx.a(this.B, obj);
                                        }
                                    }
                                } else {
                                    obj = obj4;
                                }
                                akvo akvo = (akvo) obj;
                                zyw c = this.j.dL.c();
                                ajam c2 = this.j.c();
                                diu diu = this.j.dL;
                                bcaa bcaa7 = diu.dS;
                                if (bcaa7 == null) {
                                    bcaa7 = new dlk(diu, 506);
                                    diu.dS = bcaa7;
                                }
                                hfv hfv3 = new hfv(a2, oC2, nK, a3, bcaa4, bcaa5, bcaa6, auvn3, hfs, dH, heh, gI, cj, cf, lsl4, akvo, c, c2, bcaa7);
                                this.C = bapx.a(this.C, hfv3);
                            } else {
                                context = a;
                                xci = oC;
                                adtp = el;
                                bcaa = bcaa3;
                            }
                        }
                    } else {
                        context = a;
                        xci = oC;
                        adtp = el;
                        bcaa = bcaa3;
                        hfv = hfv2;
                    }
                    aaat j = j();
                    mjy cf3 = this.j.cf();
                    WatchWhileActivity g = this.j.g();
                    dlu dlu = this.j;
                    obj3 = dlu.f810do;
                    if (obj3 instanceof baqe) {
                        Object obj5;
                        synchronized (obj3) {
                            obj5 = dlu.f810do;
                            if (obj5 instanceof baqe) {
                                obj5 = dlu.hk();
                                dlu.f810do = bapx.a(dlu.f810do, obj5);
                            }
                        }
                        obj3 = obj5;
                    }
                    hel hel = r3;
                    hel hel2 = new hel(context, xci, adtp, bcaa, hfv, j, cf3, g, (ezy) obj3, this.j.dL(), this.j.dL(), this.j.gX(), this.j.j(), this.j.dL.np());
                    hel2 = hel;
                    this.D = bapx.a(this.D, hel2);
                    obj = hel2;
                }
            }
        } else {
            obj = obj2;
        }
        return (hel) obj;
    }

    public final void a(hfc hfc) {
        hfc.a = g();
    }

    /* synthetic */ dmg(dlu dlu) {
        this.j = dlu;
    }
}
