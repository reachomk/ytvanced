package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.google.android.youtube.R;

/* renamed from: dlj */
final class dlj implements bcaa {
    private final int a;
    private final /* synthetic */ dle b;

    dlj(dle dle, int i) {
        this.b = dle;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        dle dle;
        Object obj;
        Object obj2;
        Context a;
        Object obj3;
        Object obj4;
        Object obj5;
        switch (i) {
            case 0:
                return amuw.a(this.b.V.js());
            case 1:
                dle = this.b;
                Context b = dle.b();
                akkq cd = dle.V.cd();
                aaas n = dle.n();
                akvo q = dle.q();
                gky x = dle.x();
                obj = dle.D;
                if (obj instanceof baqe) {
                    Object obj6;
                    synchronized (obj) {
                        obj6 = dle.D;
                        if (obj6 instanceof baqe) {
                            obj6 = new wfe(dle.V.oF());
                            dle.D = bapx.a(dle.D, obj6);
                        }
                    }
                    obj = obj6;
                }
                wfe wfe = (wfe) obj;
                obj = dle.E;
                if (obj instanceof baqe) {
                    Object obj7;
                    synchronized (obj) {
                        obj7 = dle.E;
                        if (obj7 instanceof baqe) {
                            obj7 = (wev) baqd.a(new fmx(dle.s(), dle.n(), dle.V.ox(), dle.V.oy()), "Cannot return null from a non-@Nullable @Provides method");
                            dle.E = bapx.a(dle.E, obj7);
                        }
                    }
                    obj = obj7;
                }
                wev wev = (wev) obj;
                fhs bx = dle.V.bx();
                wek t = dle.t();
                wlx h = dle.h();
                wlm wlm = new wlm(dle.h(), dle.V.i(), dle.V.bn());
                zyw c = dle.V.c();
                bcaa u = dle.u();
                bcaa bcaa = dle.F;
                if (bcaa == null) {
                    bcaa = new dlj(dle, 29);
                    dle.F = bcaa;
                }
                bcaa bcaa2 = bcaa;
                bcaa bcaa3 = dle.G;
                if (bcaa3 == null) {
                    bcaa3 = new dlj(dle, 30);
                    dle.G = bcaa3;
                }
                bcaa bcaa4 = bcaa3;
                bcaa v = dle.v();
                bcaa3 = dle.I;
                if (bcaa3 == null) {
                    bcaa3 = new dlj(dle, 32);
                    dle.I = bcaa3;
                }
                return new wih(b, cd, n, q, x, wfe, wev, bx, t, h, wlm, c, new wdz(u, bcaa2, bcaa4, v, bcaa3, dle.V.ky()), dle.V.hF(), dle.V.lD(), dle.V.kE());
            case 2:
                dle = this.b;
                obj = dle.b;
                if (obj == null) {
                    obj = new ageb(dle.V.jq(), dle.V.dr());
                    dle.b = obj;
                }
                return obj;
            case 3:
                dle = this.b;
                obj = dle.c;
                if (obj == null) {
                    obj = new gle(xfa.a(dle.a));
                    dle.c = obj;
                }
                return obj;
            case 4:
                dle = this.b;
                obj = dle.d;
                if (obj == null) {
                    obj = new aaxi(xfa.a(dle.a), dle.V.kq(), dle.V.oI(), dle.n());
                    dle.d = obj;
                }
                return obj;
            case 5:
                dle = this.b;
                obj = dle.e;
                if (obj == null) {
                    obj = new gln();
                    dle.e = obj;
                }
                return obj;
            case 6:
                dle = this.b;
                obj = dle.f;
                if (obj == null) {
                    glg glg = new glg(xex.a(dle.a), dle.V.iX(), dle.V.k(), dle.V.lB(), dle.g());
                    dle.f = glg;
                }
                return obj;
            case 7:
                dle = this.b;
                obj = dle.g;
                if (obj == null) {
                    glk glk = new glk(xex.a(dle.a), dle.V.k(), dle.V.D(), dle.V.fK(), dle.g());
                    dle.g = glk;
                }
                return obj;
            case 8:
                dle = this.b;
                obj = dle.h;
                if (obj == null) {
                    obj = new glq();
                    dle.h = obj;
                }
                return obj;
            case 9:
                dle = this.b;
                obj = dle.i;
                if (obj == null) {
                    obj = new eve(dle.V.eM(), dle.V.oI(), dle.n(), dle.V.eI());
                    dle.i = obj;
                }
                return obj;
            case 10:
                dle = this.b;
                obj = dle.j;
                if (obj == null) {
                    obj = new evi(dle.V.oI(), dle.n(), dle.V.eM(), dle.V.eI());
                    dle.j = obj;
                }
                return obj;
            case 11:
                dle = this.b;
                obj = dle.k;
                if (obj == null) {
                    obj = new aauz(dle.V.eG());
                    dle.k = obj;
                }
                return obj;
            case 12:
                dle = this.b;
                obj = dle.l;
                if (obj == null) {
                    obj = new wfj();
                    dle.l = obj;
                }
                return obj;
            case 13:
                dle = this.b;
                obj = dle.n;
                if (obj == null) {
                    obj = dle.m;
                    if (obj instanceof baqe) {
                        synchronized (obj) {
                            obj2 = dle.m;
                            if (obj2 instanceof baqe) {
                                obj2 = (Context) baqd.a(new ContextThemeWrapper(xex.a(dle.a), fmv.a(dle.V.ox()) == 2 ? R.style.f593Themed.YouTube.Dark.AppCompat : R.style.f315ReelThemeBase.Dialog.Alert), "Cannot return null from a non-@Nullable @Provides method");
                                dle.m = bapx.a(dle.m, obj2);
                            }
                        }
                        obj = obj2;
                    }
                    gld gld = new gld((Context) obj, dle.n(), dle.V.s(), dle.V.bx());
                    dle.n = gld;
                    obj = gld;
                }
                return obj;
            case 14:
                dle = this.b;
                obj = dle.o;
                if (obj == null) {
                    obj = new wft(dle.j(), dle.k());
                    dle.o = obj;
                }
                return obj;
            case 15:
                dle = this.b;
                obj = dle.p;
                if (obj == null) {
                    obj = new wfp(dle.V.eG(), dle.n());
                    dle.p = obj;
                }
                return obj;
            case 16:
                dle = this.b;
                obj = dle.q;
                if (obj == null) {
                    obj = new wfr(dle.V.eG());
                    dle.q = obj;
                }
                return obj;
            case 17:
                dle = this.b;
                obj = dle.t;
                if (obj == null) {
                    abhl kp = dle.V.kp();
                    bcaa bcaa5 = dle.s;
                    if (bcaa5 == null) {
                        bcaa5 = new dlj(dle, 18);
                        dle.s = bcaa5;
                    }
                    obj = new abhh(kp, bcaa5, dle.V.oB());
                    dle.t = obj;
                }
                return obj;
            case 18:
                dle = this.b;
                obj = dle.r;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dle.r;
                        if (obj2 instanceof baqe) {
                            obj2 = (abhn) baqd.a(new wew(dle.l(), dle.V.oI()), "Cannot return null from a non-@Nullable @Provides method");
                            dle.r = bapx.a(dle.r, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (abhn) obj;
            case 19:
                dle = this.b;
                obj = dle.u;
                if (obj == null) {
                    obj = new glp(dle.j(), dle.V.lC(), dle.g());
                    dle.u = obj;
                }
                return obj;
            case 20:
                dle = this.b;
                obj = dle.v;
                if (obj == null) {
                    obj = new glr(dle.y());
                    dle.v = obj;
                }
                return obj;
            case 21:
                dle = this.b;
                obj = dle.w;
                if (obj == null) {
                    obj = urk.a(dle.m(), new usl(dle.n(), dle.V.ka(), dle.V.oI(), dle.V.oC(), dle.V.m()));
                    dle.w = obj;
                }
                return obj;
            case 22:
                return this.b.z();
            case 23:
                dle = this.b;
                obj = dle.x;
                if (obj == null) {
                    obj = egt.a(dle.m());
                    dle.x = obj;
                }
                return obj;
            case 24:
                dle = this.b;
                obj = dle.A;
                if (obj == null) {
                    a = xfa.a(dle.a);
                    vod fX = dle.V.fX();
                    obj3 = dle.y;
                    if (obj3 instanceof baqe) {
                        synchronized (obj3) {
                            obj4 = dle.y;
                            if (obj4 instanceof baqe) {
                                obj4 = new dwc(dle.a(), dle.n());
                                dle.y = bapx.a(dle.y, obj4);
                            }
                        }
                        obj3 = obj4;
                    }
                    dwc dwc = (dwc) obj3;
                    obj4 = dle.z;
                    if (obj4 instanceof baqe) {
                        synchronized (obj4) {
                            obj5 = dle.z;
                            if (obj5 instanceof baqe) {
                                egv egv = new egv(dle.V.jt(), new egr(), new vur(dle.V.ow(), dle.V.fQ()), dle.V.bM(), dle.V.oA(), dle.V.oC(), dle.d(), dle.V.c());
                                dle.z = bapx.a(dle.z, egv);
                            }
                        }
                        obj4 = obj5;
                    }
                    obj = ehi.a(a, fX, dwc, (egv) obj4, dle.V.ju());
                    dle.A = obj;
                }
                return obj;
            case 25:
                dle = this.b;
                obj = dle.B;
                if (obj == null) {
                    obj = new dqp(xez.a(dle.a), dle.V.aQ(), dle.V.aL(), dle.V.aP());
                    dle.B = obj;
                }
                return obj;
            case 26:
                dle = this.b;
                obj = dle.C;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dle.C;
                        if (obj2 instanceof baqe) {
                            obj2 = new akpi();
                            dle.C = bapx.a(dle.C, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (akpi) obj;
            case 27:
                return this.b.n();
            case 28:
                return xfa.a(this.b.a);
            case 29:
                return this.b.h();
            case 30:
                return this.b.i();
            case 31:
                return this.b.l();
            case 32:
                dle = this.b;
                return new akrx(xfa.a(dle.a), dle.n(), dle.V.oI(), dle.w());
            case 33:
                dle = this.b;
                obj = dle.H;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dle.H;
                        if (obj2 instanceof baqe) {
                            obj2 = (akse) baqd.a(new akse(new ContextThemeWrapper(xex.a(dle.a), R.style.f309ReelTheme.Dialog.Alert), aksu.a(xfa.a(dle.a)), dle.n()), "Cannot return null from a non-@Nullable @Provides method");
                            dle.H = bapx.a(dle.H, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (akse) obj;
            case 34:
                dle = this.b;
                return new wjd(dle.b(), dle.V.oC(), dle.V.cd(), dle.x(), dle.t());
            case 35:
                dle = this.b;
                return new wje(dle.b(), dle.V.cd(), dle.x(), dle.p(), dle.j(), dle.k(), dle.V.oC(), dle.n());
            case 36:
                dle = this.b;
                return (wjn) baqd.a(new wjn(dle.b(), dle.V.bx(), dle.n()), "Cannot return null from a non-@Nullable @Provides method");
            case 37:
                dle = this.b;
                a = dle.b();
                aaas n2 = dle.n();
                obj3 = dle.J;
                if (obj3 instanceof baqe) {
                    synchronized (obj3) {
                        obj4 = dle.J;
                        if (obj4 instanceof baqe) {
                            obj4 = (akvr) baqd.a(new gkv(dle.q()), "Cannot return null from a non-@Nullable @Provides method");
                            dle.J = bapx.a(dle.J, obj4);
                        }
                    }
                    obj3 = obj4;
                }
                akvr akvr = (akvr) obj3;
                obj4 = dle.K;
                if (obj4 instanceof baqe) {
                    synchronized (obj4) {
                        obj5 = dle.K;
                        if (obj5 instanceof baqe) {
                            obj5 = (akvq) baqd.a(new gku(dle.q()), "Cannot return null from a non-@Nullable @Provides method");
                            dle.K = bapx.a(dle.K, obj5);
                        }
                    }
                    obj4 = obj5;
                }
                return (akwr) baqd.a(new akwr(a, n2, akvr, (akvq) obj4), "Cannot return null from a non-@Nullable @Provides method");
            case 38:
                dle = this.b;
                return new fig(xfa.a(dle.a), new akpn(), dle.V.oC());
            case 39:
                return new gqv(this.b.b());
            case 40:
                return this.b.x();
            case 41:
                return new wdn(this.b.V.oy());
            case 42:
                return null;
            case 43:
                return this.b.e();
            case 44:
                return this.b.c();
            case 45:
                return xez.a(this.b.a);
            case 46:
                dle = this.b;
                obj = dle.O;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dle.O;
                        if (obj2 instanceof baqe) {
                            obj2 = new fmx(dle.s(), dle.n(), dle.V.ox(), dle.V.oy());
                            dle.O = bapx.a(dle.O, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (fmx) obj;
            case 47:
                dle = this.b;
                obj = dle.R;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dle.R;
                        if (obj2 instanceof baqe) {
                            xci oC = dle.V.oC();
                            xsc oy = dle.V.oy();
                            obj3 = dle.Q;
                            if (obj3 instanceof baqe) {
                                synchronized (obj3) {
                                    obj4 = dle.Q;
                                    if (obj4 instanceof baqe) {
                                        obj4 = glb.a();
                                        dle.Q = bapx.a(dle.Q, obj4);
                                    }
                                }
                                obj3 = obj4;
                            }
                            evm evm = new evm(oC, oy, (eif) obj3, dle.d(), dle.V.c(), dle.a());
                            dle.R = bapx.a(dle.R, evm);
                        }
                    }
                    obj = obj2;
                }
                return (evm) obj;
            case 48:
                dle = this.b;
                obj = dle.T;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dle.T;
                        if (obj2 instanceof baqe) {
                            obj2 = (afsw) baqd.a(new gmb(xex.a(dle.a), dle.n(), dle.V.oI(), dle.w()), "Cannot return null from a non-@Nullable @Provides method");
                            dle.T = bapx.a(dle.T, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (afsw) obj;
            default:
                throw new AssertionError(i);
        }
    }
}
