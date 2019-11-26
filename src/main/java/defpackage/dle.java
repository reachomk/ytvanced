package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;
import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
import com.google.protos.youtube.api.innertube.CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import com.google.protos.youtube.api.innertube.CreateCommentEndpointOuterClass$CreateCommentEndpoint;
import com.google.protos.youtube.api.innertube.DeleteReelItem$DeleteReelItemEndpoint;
import com.google.protos.youtube.api.innertube.DownloadReelItem$DownloadReelItemEndpoint;
import com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint;
import com.google.protos.youtube.api.innertube.FlagVideoEndpointOuterClass$FlagVideoEndpoint;
import com.google.protos.youtube.api.innertube.GetReportFormEndpointOuterClass$GetReportFormEndpoint;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import com.google.protos.youtube.api.innertube.NerdStatsEndpointOuterClass$NerdStatsEndpoint;
import com.google.protos.youtube.api.innertube.OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint;
import com.google.protos.youtube.api.innertube.PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
import com.google.protos.youtube.api.innertube.ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand;
import com.google.protos.youtube.api.innertube.ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import com.google.protos.youtube.api.innertube.UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint;
import com.google.protos.youtube.api.innertube.UpdateCommentEndpointOuterClass$UpdateCommentEndpoint;

/* renamed from: dle */
final class dle implements gla {
    public volatile ehd A;
    public volatile dqp B;
    public volatile Object C = new baqe();
    public volatile Object D = new baqe();
    public volatile Object E = new baqe();
    public volatile bcaa F;
    public volatile bcaa G;
    public volatile Object H = new baqe();
    public volatile bcaa I;
    public volatile Object J = new baqe();
    public volatile Object K = new baqe();
    public volatile bcaa L;
    public volatile bcaa M;
    public volatile bcaa N;
    public volatile Object O = new baqe();
    public volatile bcaa P;
    public volatile Object Q = new baqe();
    public volatile Object R = new baqe();
    public volatile bcaa S;
    public volatile Object T = new baqe();
    public volatile bcaa U;
    public final /* synthetic */ diu V;
    private volatile Object W = new baqe();
    private volatile bcaa X;
    private volatile Object Y = new baqe();
    private volatile Object Z = new baqe();
    public final xey a;
    private volatile bcaa aA;
    private volatile bcaa aB;
    private volatile bcaa aC;
    private volatile bcaa aD;
    private volatile bcaa aE;
    private volatile Object aF = new baqe();
    private volatile bcaa aG;
    private volatile Object aH = new baqe();
    private volatile bcaa aI;
    private volatile Object aJ = new baqe();
    private volatile Object aK = new baqe();
    private volatile bcaa aL;
    private volatile bcaa aM;
    private volatile bcaa aN;
    private volatile bcaa aO;
    private volatile bcaa aP;
    private volatile bcaa aQ;
    private volatile bcaa aR;
    private volatile bcaa aS;
    private volatile bcaa aT;
    private volatile bcaa aU;
    private volatile Object aV = new baqe();
    private volatile bcaa aW;
    private volatile bcaa aX;
    private volatile bcaa aY;
    private volatile Object aZ = new baqe();
    private volatile bcaa aa;
    private volatile bcaa ab;
    private volatile bcaa ac;
    private volatile bcaa ad;
    private volatile Object ae = new baqe();
    private volatile Object af = new baqe();
    private volatile bcaa ag;
    private volatile bcaa ah;
    private volatile bcaa ai;
    private volatile bcaa aj;
    private volatile bcaa ak;
    private volatile bcaa al;
    private volatile bcaa am;
    private volatile bcaa an;
    private volatile Object ao = new baqe();
    private volatile Object ap = new baqe();
    private volatile Object aq = new baqe();
    private volatile Object ar = new baqe();
    private volatile Object as = new baqe();
    private volatile bcaa at;
    private volatile bcaa au;
    private volatile bcaa av;
    private volatile Object aw = new baqe();
    private volatile bcaa ax;
    private volatile bcaa ay;
    private volatile bcaa az;
    public volatile ageb b;
    private volatile Object ba = new baqe();
    private volatile Object bb = new baqe();
    private volatile Object bc = new baqe();
    public volatile gle c;
    public volatile aaxi d;
    public volatile gln e;
    public volatile glg f;
    public volatile glk g;
    public volatile glq h;
    public volatile eve i;
    public volatile evi j;
    public volatile aauz k;
    public volatile wfj l;
    public volatile Object m = new baqe();
    public volatile gld n;
    public volatile wft o;
    public volatile wfp p;
    public volatile wfr q;
    public volatile Object r = new baqe();
    public volatile bcaa s;
    public volatile abhh t;
    public volatile glp u;
    public volatile glr v;
    public volatile urh w;
    public volatile egu x;
    public volatile Object y = new baqe();
    public volatile Object z = new baqe();

    public final exu a() {
        Object obj = this.Y;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.Y;
                if (obj2 instanceof baqe) {
                    bcaa bcaa = this.X;
                    if (bcaa == null) {
                        bcaa = new dlj(this, 0);
                        this.X = bcaa;
                    }
                    obj2 = new exu(bcaa);
                    this.Y = bapx.a(this.Y, obj2);
                }
            }
            obj = obj2;
        }
        return (exu) obj;
    }

    public final Context b() {
        Object obj = this.Z;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.Z;
                if (obj2 instanceof baqe) {
                    obj2 = (Context) baqd.a(new ContextThemeWrapper(xex.a(this.a), fmv.a(this.V.ox()) == 2 ? R.style.f593Themed.YouTube.Dark.AppCompat : R.style.f596Themed.YouTube.Light.AppCompat.Light), "Cannot return null from a non-@Nullable @Provides method");
                    this.Z = bapx.a(this.Z, obj2);
                }
            }
            obj = obj2;
        }
        return (Context) obj;
    }

    public final ReelWatchActivity c() {
        return (ReelWatchActivity) baqd.a((ReelWatchActivity) xex.a(this.a), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final ajam d() {
        Object obj = this.ae;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.ae;
                if (obj2 instanceof baqe) {
                    obj2 = (ajam) baqd.a(this.V.oU().a, "Cannot return null from a non-@Nullable @Provides method");
                    this.ae = bapx.a(this.ae, obj2);
                }
            }
            obj = obj2;
        }
        return (ajam) obj;
    }

    public final aizy e() {
        return ajbf.a(d());
    }

    public final ekn f() {
        return enp.a(d());
    }

    public final goq g() {
        Object obj = this.af;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.af;
                if (obj2 instanceof baqe) {
                    obj2 = new goq(e(), f());
                    this.af = bapx.a(this.af, obj2);
                }
            }
            obj = obj2;
        }
        return (goq) obj;
    }

    public final wlx h() {
        Object obj = this.ao;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.ao;
                if (obj2 instanceof baqe) {
                    obj2 = new wlx(this.V.eI());
                    this.ao = bapx.a(this.ao, obj2);
                }
            }
            obj = obj2;
        }
        return (wlx) obj;
    }

    private final albi C() {
        Object obj = this.ap;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.ap;
                if (obj2 instanceof baqe) {
                    obj2 = (albi) baqd.a(new gma(b()), "Cannot return null from a non-@Nullable @Provides method");
                    this.ap = bapx.a(this.ap, obj2);
                }
            }
            obj = obj2;
        }
        return (albi) obj;
    }

    public final wcv i() {
        Object obj = this.aq;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aq;
                if (obj2 instanceof baqe) {
                    obj2 = new wcv(xfa.a(this.a), C(), n());
                    this.aq = bapx.a(this.aq, obj2);
                }
            }
            obj = obj2;
        }
        return (wcv) obj;
    }

    public final wda j() {
        Object obj = this.ar;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.ar;
                if (obj2 instanceof baqe) {
                    wda wda = new wda(xex.a(this.a), b(), this.V.bi(), n(), this.V.bx(), this.V.oI(), h(), this.V.i(), this.V.bn(), i());
                    this.ar = bapx.a(this.ar, wda);
                }
            }
            obj = obj2;
        }
        return (wda) obj;
    }

    public final wcq k() {
        Object obj = this.as;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.as;
                if (obj2 instanceof baqe) {
                    obj2 = new wcq(xez.a(this.a), n(), C(), this.V.ko());
                    this.as = bapx.a(this.as, obj2);
                }
            }
            obj = obj2;
        }
        return (wcq) obj;
    }

    public final akso l() {
        Object obj = this.aw;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aw;
                if (obj2 instanceof baqe) {
                    Context b = b();
                    obj2 = (akso) baqd.a(new akso(new ContextThemeWrapper(b, R.style.f309ReelTheme.Dialog.Alert), n(), this.V.s()), "Cannot return null from a non-@Nullable @Provides method");
                    this.aw = bapx.a(this.aw, obj2);
                }
            }
            obj = obj2;
        }
        return (akso) obj;
    }

    public final bcaa m() {
        bcaa bcaa = this.aA;
        if (bcaa != null) {
            return bcaa;
        }
        dlj dlj = new dlj(this, 22);
        this.aA = dlj;
        return dlj;
    }

    public final aaas n() {
        Object obj = this.aF;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aF;
                if (obj2 instanceof baqe) {
                    amuu a = amur.a(23);
                    Class cls = OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class;
                    Object obj3 = this.aa;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 2);
                        this.aa = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class;
                    obj3 = this.ab;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 3);
                        this.ab = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = FlagEndpointOuterClass$FlagEndpoint.class;
                    obj3 = this.ac;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 4);
                        this.ac = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = FlagVideoEndpointOuterClass$FlagVideoEndpoint.class;
                    obj3 = this.ad;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 5);
                        this.ad = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = DeleteReelItem$DeleteReelItemEndpoint.class;
                    obj3 = this.ag;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 6);
                        this.ag = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = DownloadReelItem$DownloadReelItemEndpoint.class;
                    obj3 = this.ah;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 7);
                        this.ah = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = NerdStatsEndpointOuterClass$NerdStatsEndpoint.class;
                    obj3 = this.ai;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 8);
                        this.ai = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = SubscribeEndpointOuterClass$SubscribeEndpoint.class;
                    obj3 = this.aj;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 9);
                        this.aj = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class;
                    obj3 = this.ak;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 10);
                        this.ak = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = CreateCommentEndpointOuterClass$CreateCommentEndpoint.class;
                    obj3 = this.al;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 11);
                        this.al = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.class;
                    obj3 = this.am;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 12);
                        this.am = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.class;
                    obj3 = this.an;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 13);
                        this.an = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class;
                    obj3 = this.at;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 14);
                        this.at = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class;
                    obj3 = this.au;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 15);
                        this.au = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class;
                    obj3 = this.av;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 16);
                        this.av = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = GetReportFormEndpointOuterClass$GetReportFormEndpoint.class;
                    obj3 = this.ax;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 17);
                        this.ax = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class;
                    obj3 = this.ay;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 19);
                        this.ay = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class;
                    obj3 = this.az;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 20);
                        this.az = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.class;
                    obj3 = this.aB;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 21);
                        this.aB = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.class;
                    obj3 = this.aC;
                    if (obj3 == null) {
                        obj3 = new dlj(this, 23);
                        this.aC = obj3;
                    }
                    amuu b = a.b(cls, obj3).b(AddToToastActionOuterClass$AddToToastAction.class, this.V.jZ());
                    Class cls2 = ayvl.class;
                    Object obj4 = this.aD;
                    if (obj4 == null) {
                        obj4 = new dlj(this, 24);
                        this.aD = obj4;
                    }
                    b = b.b(cls2, obj4);
                    cls2 = axng.class;
                    obj4 = this.aE;
                    if (obj4 == null) {
                        obj4 = new dlj(this, 25);
                        this.aE = obj4;
                    }
                    obj2 = new egw(new aaak(b.b(cls2, obj4).b()), this.V.ff());
                    this.aF = bapx.a(this.aF, obj2);
                }
            }
            obj = obj2;
        }
        return (aaas) obj;
    }

    public final bcaa o() {
        bcaa bcaa = this.aG;
        if (bcaa != null) {
            return bcaa;
        }
        dlj dlj = new dlj(this, 26);
        this.aG = dlj;
        return dlj;
    }

    public final akoe p() {
        return new akoe(o());
    }

    public final akvo q() {
        Object obj = this.aH;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aH;
                if (obj2 instanceof baqe) {
                    obj2 = (akvo) baqd.a(new akvt(b(), n(), x(), p()), "Cannot return null from a non-@Nullable @Provides method");
                    this.aH = bapx.a(this.aH, obj2);
                }
            }
            obj = obj2;
        }
        return (akvo) obj;
    }

    public final bcaa r() {
        bcaa bcaa = this.aI;
        if (bcaa != null) {
            return bcaa;
        }
        dlj dlj = new dlj(this, 27);
        this.aI = dlj;
        return dlj;
    }

    public final alck s() {
        Object obj = this.aJ;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aJ;
                if (obj2 instanceof baqe) {
                    obj2 = new alck(new albw(c(), new akzb(r(), this.V.jw(), o())), n());
                    this.aJ = bapx.a(this.aJ, obj2);
                }
            }
            obj = obj2;
        }
        return (alck) obj;
    }

    public final wek t() {
        Object obj = this.aK;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aK;
                if (obj2 instanceof baqe) {
                    obj2 = new wek();
                    this.aK = bapx.a(this.aK, obj2);
                }
            }
            obj = obj2;
        }
        return (wek) obj;
    }

    public final bcaa u() {
        bcaa bcaa = this.aL;
        if (bcaa != null) {
            return bcaa;
        }
        dlj dlj = new dlj(this, 28);
        this.aL = dlj;
        return dlj;
    }

    public final bcaa v() {
        bcaa bcaa = this.aM;
        if (bcaa != null) {
            return bcaa;
        }
        dlj dlj = new dlj(this, 31);
        this.aM = dlj;
        return dlj;
    }

    public final bcaa w() {
        bcaa bcaa = this.aN;
        if (bcaa != null) {
            return bcaa;
        }
        dlj dlj = new dlj(this, 33);
        this.aN = dlj;
        return dlj;
    }

    public final gky x() {
        Object obj = this.aV;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aV;
                if (obj2 instanceof baqe) {
                    bcaa bcaa = this.aO;
                    if (bcaa == null) {
                        bcaa = new dlj(this, 1);
                        this.aO = bcaa;
                    }
                    bcaa bcaa2 = bcaa;
                    bcaa = this.aP;
                    if (bcaa == null) {
                        bcaa = new dlj(this, 34);
                        this.aP = bcaa;
                    }
                    bcaa bcaa3 = bcaa;
                    bcaa = this.aQ;
                    if (bcaa == null) {
                        bcaa = new dlj(this, 35);
                        this.aQ = bcaa;
                    }
                    bcaa bcaa4 = bcaa;
                    bcaa = this.aR;
                    if (bcaa == null) {
                        bcaa = new dlj(this, 36);
                        this.aR = bcaa;
                    }
                    bcaa bcaa5 = bcaa;
                    bcaa = this.aS;
                    if (bcaa == null) {
                        bcaa = new dlj(this, 37);
                        this.aS = bcaa;
                    }
                    bcaa bcaa6 = bcaa;
                    bcaa = this.aT;
                    if (bcaa == null) {
                        bcaa = new dlj(this, 38);
                        this.aT = bcaa;
                    }
                    bcaa bcaa7 = bcaa;
                    bcaa = this.aU;
                    if (bcaa == null) {
                        bcaa = new dlj(this, 39);
                        this.aU = bcaa;
                    }
                    gky gky = new gky(bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa);
                    this.aV = bapx.a(this.aV, gky);
                }
            }
            obj = obj2;
        }
        return (gky) obj;
    }

    public final glv y() {
        Object obj;
        Object obj2 = this.aZ;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.aZ;
                if (obj instanceof baqe) {
                    Context b = b();
                    nn a = xez.a(this.a);
                    xci oC = this.V.oC();
                    ReelWatchActivity c = c();
                    xoi oI = this.V.oI();
                    aapn aZ = this.V.aZ();
                    gky x = x();
                    bcaa bcaa = this.aW;
                    if (bcaa == null) {
                        bcaa = new dlj(this, 40);
                        this.aW = bcaa;
                    }
                    bcaa bcaa2 = bcaa;
                    bcaa at = this.V.at();
                    bcaa ky = this.V.ky();
                    bcaa = this.aX;
                    if (bcaa == null) {
                        bcaa = new dlj(this, 41);
                        this.aX = bcaa;
                    }
                    bcaa bcaa3 = bcaa;
                    bcaa = this.aY;
                    if (bcaa == null) {
                        bcaa = new dlj(this, 42);
                        this.aY = bcaa;
                    }
                    glv glv = new glv(b, a, oC, c, oI, aZ, x, new weo(bcaa2, at, ky, bcaa3, bcaa), new akpe(o()), this.V.ox());
                    this.aZ = bapx.a(this.aZ, glv);
                }
            }
        } else {
            obj = obj2;
        }
        return (glv) obj;
    }

    public final urs z() {
        Object obj = this.ba;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.ba;
                if (obj2 instanceof baqe) {
                    obj2 = this.W;
                    if (obj2 instanceof baqe) {
                        Object obj3;
                        synchronized (obj2) {
                            obj3 = this.W;
                            if (obj3 instanceof baqe) {
                                obj3 = new urv(xez.a(this.a), this.V.oC());
                                this.W = bapx.a(this.W, obj3);
                            }
                        }
                        obj2 = obj3;
                    }
                    obj2 = (urv) obj2;
                    exu a = a();
                    obj2.a(y());
                    a.a(new gkw(obj2));
                    a.a(new gkx(obj2));
                    if (a.a) {
                        obj2.f();
                    }
                    obj2 = (urs) baqd.a(obj2, "Cannot return null from a non-@Nullable @Provides method");
                    this.ba = bapx.a(this.ba, obj2);
                }
            }
            obj = obj2;
        }
        return (urs) obj;
    }

    public final gml A() {
        Object obj = this.bb;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.bb;
                if (obj2 instanceof baqe) {
                    obj2 = new gml(this.V.dx(), this.V.oy());
                    this.bb = bapx.a(this.bb, obj2);
                }
            }
            obj = obj2;
        }
        return (gml) obj;
    }

    public final gmo B() {
        Object obj = this.bc;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.bc;
                if (obj2 instanceof baqe) {
                    gmo gmo = new gmo(e(), this.V.m(), this.V.fu(), this.V.oC(), d(), this.V.c());
                    this.bc = bapx.a(this.bc, gmo);
                }
            }
            obj = obj2;
        }
        return (gmo) obj;
    }

    public final void a(urj urj) {
        urj.ab = z();
        urj.ac = n();
        urj.ad = this.V.oI();
        urj.ae = this.V.bi();
        urj.af = this.V.ka();
        urj.ag = new usk(xfa.a(this.a), n(), z());
        urj.ah = this.V.cB();
    }

    public final void a(uqq uqq) {
        uqq.Z = this.V.aP();
        uqq.aa = this.V.oC();
    }

    public final void a(dru dru) {
        dru.Z = this.V.oI();
        dru.aa = this.V.aN();
        dru.ab = new usv(this.V.aN(), this.V.hs(), this.V.oA(), this.V.oB());
        dru.ac = this.V.aO();
        dru.ad = r();
        dru.ae = this.V.oC();
        dru.af = this.V.k();
        dru.ag = this.V.s();
        dru.ah = this.V.cd();
        dru.ai = this.V.hs();
        dru.aj = p();
        dru.ak = new dne();
        dru.al = this.V.c();
        dru.am = this.V.jv();
    }

    public final void a(glu glu) {
        glu.aa = g();
    }

    public final void a(ReelWatchActivity reelWatchActivity) {
        reelWatchActivity.g = A();
        reelWatchActivity.h = this.V.lE();
        reelWatchActivity.i = a();
    }

    public final gnn a(gns gns) {
        baqd.a(gns);
        return new dlh(this, gns);
    }

    /* synthetic */ dle(diu diu, xey xey) {
        this.V = diu;
        this.a = xey;
        aksv aksv = new aksv();
    }
}
