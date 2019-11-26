package defpackage;

import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import com.google.android.apps.youtube.app.MainLiveCreationActivity;
import com.google.android.libraries.youtube.edit.geo.EditLocation;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.CameraFlashEndpointOuterClass$CameraFlashEndpoint;
import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
import com.google.protos.youtube.api.innertube.ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint;
import com.google.protos.youtube.api.innertube.CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint;
import com.google.protos.youtube.api.innertube.CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint;
import com.google.protos.youtube.api.innertube.CreateCommentEndpointOuterClass$CreateCommentEndpoint;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import com.google.protos.youtube.api.innertube.EditConversationPostEndpointOuterClass$EditConversationPostEndpoint;
import com.google.protos.youtube.api.innertube.EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint;
import com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint;
import com.google.protos.youtube.api.innertube.GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint;
import com.google.protos.youtube.api.innertube.GetReportFormEndpointOuterClass$GetReportFormEndpoint;
import com.google.protos.youtube.api.innertube.GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint;
import com.google.protos.youtube.api.innertube.HideEnclosingActionOuterClass$HideEnclosingAction;
import com.google.protos.youtube.api.innertube.LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint;
import com.google.protos.youtube.api.innertube.ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint;
import com.google.protos.youtube.api.innertube.MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint;
import com.google.protos.youtube.api.innertube.ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint;
import com.google.protos.youtube.api.innertube.OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import com.google.protos.youtube.api.innertube.RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToContactsEndpoint;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint;
import com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint;
import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
import com.google.protos.youtube.api.innertube.ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint;
import com.google.protos.youtube.api.innertube.ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand;
import com.google.protos.youtube.api.innertube.StartStreamEndpointOuterClass$StartStreamEndpoint;
import com.google.protos.youtube.api.innertube.SwitchCameraEndpointOuterClass$SwitchCameraEndpoint;
import com.google.protos.youtube.api.innertube.TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint;
import com.google.protos.youtube.api.innertube.ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint;
import java.util.concurrent.Executor;

/* renamed from: dju */
final class dju implements dnu {
    public volatile bcaa A;
    public volatile fxw B;
    public volatile aauz C;
    public volatile Object D = new baqe();
    public volatile bcaa E;
    public volatile abhh F;
    public volatile aaxi G;
    public volatile Object H = new baqe();
    public volatile Object I = new baqe();
    public volatile fvs J;
    public volatile bcaa K;
    public volatile Object L = new baqe();
    public volatile Object M = new baqe();
    public volatile bcaa N;
    public volatile bcaa O;
    public volatile bcaa P;
    public volatile Object Q = new baqe();
    public volatile Object R = new baqe();
    public final /* synthetic */ diu S;
    private volatile alpa T;
    private volatile Object U = new baqe();
    private volatile bcaa V;
    private volatile Object W = new baqe();
    private volatile bcaa X;
    private volatile bcaa Y;
    private volatile Object Z = new baqe();
    public final ackw a;
    private volatile Object aA = new baqe();
    private volatile Object aB = new baqe();
    private volatile bcaa aC;
    private volatile bcaa aD;
    private volatile bcaa aE;
    private volatile bcaa aF;
    private volatile bcaa aG;
    private volatile Object aH = new baqe();
    private volatile Object aI = new baqe();
    private volatile Object aJ = new baqe();
    private volatile Object aK = new baqe();
    private volatile Object aL = new baqe();
    private volatile Object aM = new baqe();
    private volatile bcaa aN;
    private volatile Object aO = new baqe();
    private volatile bcaa aP;
    private volatile Object aQ = new baqe();
    private volatile Object aR = new baqe();
    private volatile Object aS = new baqe();
    private volatile bcaa aT;
    private volatile bcaa aU;
    private volatile bcaa aV;
    private volatile bcaa aW;
    private volatile bcaa aX;
    private volatile bcaa aY;
    private volatile bcaa aZ;
    private volatile Object aa = new baqe();
    private volatile bcaa ab;
    private volatile Object ac = new baqe();
    private volatile Object ad = new baqe();
    private volatile bcaa ae;
    private volatile bcaa af;
    private volatile bcaa ag;
    private volatile Object ah = new baqe();
    private volatile bcaa ai;
    private volatile Object aj = new baqe();
    private volatile bcaa ak;
    private volatile bcaa al;
    private volatile bcaa am;
    private volatile bcaa an;
    private volatile bcaa ao;
    private volatile bcaa ap;
    private volatile bcaa aq;
    private volatile bcaa ar;
    private volatile bcaa as;
    private volatile bcaa at;
    private volatile bcaa au;
    private volatile Object av = new baqe();
    private volatile bcaa aw;
    private volatile bcaa ax;
    private volatile Object ay = new baqe();
    private volatile Object az = new baqe();
    public volatile ageb b;
    private volatile bcaa bA;
    private volatile bcaa ba;
    private volatile bcaa bb;
    private volatile bcaa bc;
    private volatile Object bd = new baqe();
    private volatile Object be = new baqe();
    private volatile Object bf = new baqe();
    private volatile Object bg = new baqe();
    private volatile bcaa bh;
    private volatile bcaa bi;
    private volatile bcaa bj;
    private volatile bcaa bk;
    private volatile bcaa bl;
    private volatile Object bm = new baqe();
    private volatile Object bn = new baqe();
    private volatile bcaa bo;
    private volatile Object bp = new baqe();
    private volatile bcaa bq;
    private volatile bcaa br;
    private volatile bcaa bs;
    private volatile bcaa bt;
    private volatile Object bu = new baqe();
    private volatile bcaa bv;
    private volatile Object bw = new baqe();
    private volatile bcaa bx;
    private volatile bcaa by;
    private volatile Object bz = new baqe();
    public volatile aaez c;
    public volatile Object d = new baqe();
    public volatile acdt e;
    public volatile bcaa f;
    public volatile urh g;
    public volatile Object h = new baqe();
    public volatile acdv i;
    public volatile yae j;
    public volatile aawr k;
    public volatile acdo l;
    public volatile zyj m;
    public volatile aazw n;
    public volatile abqq o;
    public volatile abqp p;
    public volatile uzr q;
    public volatile alid r;
    public volatile alie s;
    public volatile yax t;
    public volatile abii u;
    public volatile abqu v;
    public volatile abav w;
    public volatile uzq x;
    public volatile Object y = new baqe();
    public volatile Object z = new baqe();

    private final alfi y() {
        Object obj = this.U;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.U;
                if (obj2 instanceof baqe) {
                    obj2 = new alfi();
                    this.U = bapx.a(this.U, obj2);
                }
            }
            obj = obj2;
        }
        return (alfi) obj;
    }

    public final Activity a() {
        Object obj = this.W;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.W;
                if (obj2 instanceof baqe) {
                    obj2 = (Activity) baqd.a(this.a.a, "Cannot return null from a non-@Nullable @Provides method");
                    this.W = bapx.a(this.W, obj2);
                }
            }
            obj = obj2;
        }
        return (Activity) obj;
    }

    private final bcaa z() {
        bcaa bcaa = this.Y;
        if (bcaa != null) {
            return bcaa;
        }
        djz djz = new djz(this, 2);
        this.Y = djz;
        return djz;
    }

    public final urs c() {
        Object obj = this.aa;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aa;
                if (obj2 instanceof baqe) {
                    obj2 = this.Z;
                    if (obj2 instanceof baqe) {
                        Object obj3;
                        synchronized (obj2) {
                            obj3 = this.Z;
                            if (obj3 instanceof baqe) {
                                obj3 = new urv(aclc.a(this.a), this.S.oC());
                                this.Z = bapx.a(this.Z, obj3);
                            }
                        }
                        obj2 = obj3;
                    }
                    obj2 = (urv) obj2;
                    obj2.a(acle.a(this.a));
                    obj2 = (urs) baqd.a(obj2, "Cannot return null from a non-@Nullable @Provides method");
                    this.aa = bapx.a(this.aa, obj2);
                }
            }
            obj = obj2;
        }
        return (urs) obj;
    }

    public final acxj d() {
        return new acxj(this.S.oG(), this.S.oC(), this.S.p(), this.S.q(), this.S.jW(), this.S.r());
    }

    public final acfe e() {
        Object obj;
        Throwable th;
        Object obj2 = this.ac;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                try {
                    obj = this.ac;
                    if (obj instanceof baqe) {
                        acxj acxj;
                        LiveCreationActivity a = acle.a(this.a);
                        acxj d = d();
                        diu diu = this.S;
                        bcaa bcaa = diu.bZ;
                        if (bcaa == null) {
                            bcaa = new dlk(diu, 378);
                            diu.bZ = bcaa;
                        }
                        diu = this.S;
                        bcaa bcaa2 = diu.ca;
                        if (bcaa2 == null) {
                            bcaa2 = new dlk(diu, 379);
                            diu.ca = bcaa2;
                        }
                        diu = this.S;
                        bcaa bcaa3 = diu.cb;
                        if (bcaa3 == null) {
                            bcaa3 = new dlk(diu, 380);
                            diu.cb = bcaa3;
                        }
                        diu = this.S;
                        bcaa bcaa4 = diu.cc;
                        if (bcaa4 == null) {
                            bcaa4 = new dlk(diu, 381);
                            diu.cc = bcaa4;
                        }
                        diu = this.S;
                        bcaa bcaa5 = diu.cd;
                        if (bcaa5 == null) {
                            bcaa5 = new dlk(diu, 382);
                            diu.cd = bcaa5;
                        }
                        diu = this.S;
                        bcaa bcaa6 = diu.ce;
                        if (bcaa6 == null) {
                            bcaa6 = new dlk(diu, 383);
                            diu.ce = bcaa6;
                        }
                        diu = this.S;
                        bcaa bcaa7 = diu.cf;
                        if (bcaa7 == null) {
                            bcaa7 = new dlk(diu, 384);
                            diu.cf = bcaa7;
                        }
                        diu = this.S;
                        bcaa bcaa8 = diu.cg;
                        if (bcaa8 == null) {
                            bcaa8 = new dlk(diu, 385);
                            diu.cg = bcaa8;
                        }
                        diu = this.S;
                        bcaa bcaa9 = diu.ch;
                        if (bcaa9 == null) {
                            bcaa9 = new dlk(diu, 386);
                            diu.ch = bcaa9;
                        }
                        diu = this.S;
                        bcaa bcaa10 = diu.ci;
                        if (bcaa10 == null) {
                            acxj = d;
                            bcaa10 = new dlk(diu, 387);
                            diu.ci = bcaa10;
                        } else {
                            acxj = d;
                        }
                        bcaa ca = this.S.ca();
                        bcaa ap = this.S.ap();
                        bcaa J = this.S.J();
                        acgs acgs = acgs;
                        acgs acgs2 = acgs;
                        acgs = new acgs(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8, bcaa9, bcaa10, ca, ap, J);
                        Context context = (Context) acgs.a(a, 1);
                        acvx acvx = (acvx) acgs.a(acxj, 2);
                        acgs.a((abcp) acgs2.a.get(), 3);
                        obj = (acfe) baqd.a((Object) new acfo(context, acvx, (abce) acgs.a((abce) acgs2.b.get(), 4), (abci) acgs.a((abci) acgs2.c.get(), 5), (abag) acgs.a((abag) acgs2.d.get(), 6), (abac) acgs.a((abac) acgs2.e.get(), 7), (abal) acgs.a((abal) acgs2.f.get(), 8), (abdj) acgs.a((abdj) acgs2.g.get(), 9), (abcr) acgs.a((abcr) acgs2.h.get(), 10), (abcv) acgs.a((abcv) acgs2.i.get(), 11), (abju) acgs.a((abju) acgs2.j.get(), 12), (Handler) acgs.a((Handler) acgs2.k.get(), 13), (Executor) acgs.a((Executor) acgs2.l.get(), 14), (xsc) acgs.a((xsc) acgs2.m.get(), 15)), "Cannot return null from a non-@Nullable @Provides method");
                        this.ac = bapx.a(this.ac, obj);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        obj = obj2;
        return (acfe) obj;
    }

    public final zqe f() {
        Object obj = this.ad;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.ad;
                if (obj2 instanceof baqe) {
                    obj2 = zqh.a();
                    obj2.a = acla.a(this.a);
                    obj2.b = tlg.a();
                    obj2.c = this.S.n();
                    this.ad = bapx.a(this.ad, obj2);
                }
            }
            obj = obj2;
        }
        return (zqe) obj;
    }

    public final znv g() {
        return new znv(acla.a(this.a), (xhf) baqd.a(this.S.aj().a(new bqs(), xhl.a(this.S.ak(), null)), "Cannot return null from a non-@Nullable @Provides method"), this.S.ox());
    }

    private final bcaa A() {
        bcaa bcaa = this.ae;
        if (bcaa != null) {
            return bcaa;
        }
        djz djz = new djz(this, 5);
        this.ae = djz;
        return djz;
    }

    public final akso h() {
        return new akso(acla.a(this.a), m(), this.S.s());
    }

    public final aboq i() {
        Object obj = this.ah;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.ah;
                if (obj2 instanceof baqe) {
                    obj2 = new aboq(m());
                    this.ah = bapx.a(this.ah, obj2);
                }
            }
            obj = obj2;
        }
        return (aboq) obj;
    }

    public final abpm j() {
        Object obj = this.aj;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aj;
                if (obj2 instanceof baqe) {
                    Context a = acla.a(this.a);
                    aaas m = m();
                    akso h = h();
                    aboq i = i();
                    bcaa bcaa = this.ai;
                    if (bcaa == null) {
                        bcaa = new djz(this, 9);
                        this.ai = bcaa;
                    }
                    abpm abpm = new abpm(a, m, h, i, bcaa);
                    this.aj = bapx.a(this.aj, abpm);
                }
            }
            obj = obj2;
        }
        return (abpm) obj;
    }

    private final bcaa B() {
        bcaa bcaa = this.at;
        if (bcaa != null) {
            return bcaa;
        }
        djz djz = new djz(this, 18);
        this.at = djz;
        return djz;
    }

    public final abax k() {
        Object obj = this.av;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.av;
                if (obj2 instanceof baqe) {
                    obj2 = (abax) baqd.a(this.a.a, "Cannot return null from a non-@Nullable @Provides method");
                    this.av = bapx.a(this.av, obj2);
                }
            }
            obj = obj2;
        }
        return (abax) obj;
    }

    private final xnu C() {
        Object obj = this.az;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.az;
                if (obj2 instanceof baqe) {
                    obj2 = new xnu(a());
                    this.az = bapx.a(this.az, obj2);
                }
            }
            obj = obj2;
        }
        return (xnu) obj;
    }

    public final fbp l() {
        Object obj = this.aB;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aB;
                if (obj2 instanceof baqe) {
                    Object obj3;
                    zyw c = this.S.c();
                    fpb fpb = new fpb(this.S.by(), this.S.J());
                    Object obj4 = this.ay;
                    if (obj4 instanceof baqe) {
                        synchronized (obj4) {
                            obj3 = this.ay;
                            if (obj3 instanceof baqe) {
                                obj3 = enr.a();
                                this.ay = bapx.a(this.ay, obj3);
                            }
                        }
                        obj4 = obj3;
                    }
                    eif eif = (eif) obj4;
                    xnu C = C();
                    obj4 = this.aA;
                    if (obj4 instanceof baqe) {
                        synchronized (obj4) {
                            obj3 = this.aA;
                            if (obj3 instanceof baqe) {
                                obj3 = xpc.a(C());
                                this.aA = bapx.a(this.aA, obj3);
                            }
                        }
                        obj4 = obj3;
                    }
                    fbp fbp = new fbp(c, fpb, eif, C, (bctz) obj4);
                    this.aB = bapx.a(this.aB, fbp);
                }
            }
            obj = obj2;
        }
        return (fbp) obj;
    }

    private final acli D() {
        Object obj = this.aH;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aH;
                if (obj2 instanceof baqe) {
                    nn a = aclc.a(this.a);
                    fud ff = this.S.ff();
                    drs aQ = this.S.aQ();
                    amuu a2 = amur.a(38);
                    Class cls = OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class;
                    Object obj3 = this.V;
                    if (obj3 == null) {
                        obj3 = new djz(this, 0);
                        this.V = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = aoxd.class;
                    obj3 = this.X;
                    if (obj3 == null) {
                        obj3 = new djz(this, 1);
                        this.X = obj3;
                    }
                    a2 = a2.b(cls, obj3).b(AddToToastActionOuterClass$AddToToastAction.class, this.S.jZ()).b(CameraFlashEndpointOuterClass$CameraFlashEndpoint.class, z());
                    cls = ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.class;
                    obj3 = this.ab;
                    if (obj3 == null) {
                        obj3 = new djz(this, 3);
                        this.ab = obj3;
                    }
                    a2 = a2.b(cls, obj3).b(ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint.class, z()).b(CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint.class, A()).b(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.class, A());
                    cls = EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.class;
                    obj3 = this.af;
                    if (obj3 == null) {
                        obj3 = new djz(this, 6);
                        this.af = obj3;
                    }
                    a2 = a2.b(cls, obj3).b(EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.class, A());
                    cls = arjq.class;
                    obj3 = this.ag;
                    if (obj3 == null) {
                        obj3 = new djz(this, 7);
                        this.ag = obj3;
                    }
                    a2 = a2.b(cls, obj3).b(GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.class, A());
                    cls = LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class;
                    obj3 = this.ak;
                    if (obj3 == null) {
                        obj3 = new djz(this, 8);
                        this.ak = obj3;
                    }
                    a2 = a2.b(cls, obj3).b(GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class, A());
                    cls = HideEnclosingActionOuterClass$HideEnclosingAction.class;
                    obj3 = this.al;
                    if (obj3 == null) {
                        obj3 = new djz(this, 10);
                        this.al = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class;
                    obj3 = this.am;
                    if (obj3 == null) {
                        obj3 = new djz(this, 11);
                        this.am = obj3;
                    }
                    a2 = a2.b(cls, obj3).b(LiveChatEndpointOuterClass$LiveChatEndpoint.class, z()).b(MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class, z()).b(MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.class, A());
                    cls = ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class;
                    obj3 = this.an;
                    if (obj3 == null) {
                        obj3 = new djz(this, 12);
                        this.an = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.class;
                    obj3 = this.ao;
                    if (obj3 == null) {
                        obj3 = new djz(this, 13);
                        this.ao = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class;
                    obj3 = this.ap;
                    if (obj3 == null) {
                        obj3 = new djz(this, 14);
                        this.ap = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = SendShareEndpoint$SendShareExternallyEndpoint.class;
                    obj3 = this.aq;
                    if (obj3 == null) {
                        obj3 = new djz(this, 15);
                        this.aq = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = SendShareEndpoint$SendShareToContactsEndpoint.class;
                    obj3 = this.ar;
                    if (obj3 == null) {
                        obj3 = new djz(this, 16);
                        this.ar = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = SendShareEndpoint$SendShareToConversationEndpoint.class;
                    obj3 = this.as;
                    if (obj3 == null) {
                        obj3 = new djz(this, 17);
                        this.as = obj3;
                    }
                    a2 = a2.b(cls, obj3).b(SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class, B()).b(SetSettingEndpointOuterClass$SetSettingEndpoint.class, B());
                    cls = ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class;
                    obj3 = this.au;
                    if (obj3 == null) {
                        obj3 = new djz(this, 19);
                        this.au = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand.class;
                    obj3 = this.aw;
                    if (obj3 == null) {
                        obj3 = new djz(this, 20);
                        this.aw = obj3;
                    }
                    a2 = a2.b(cls, obj3).b(StartStreamEndpointOuterClass$StartStreamEndpoint.class, A()).b(SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.class, z()).b(TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.class, A());
                    cls = ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint.class;
                    obj3 = this.ax;
                    if (obj3 == null) {
                        obj3 = new djz(this, 21);
                        this.ax = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.class;
                    obj3 = this.aC;
                    if (obj3 == null) {
                        obj3 = new djz(this, 22);
                        this.aC = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = CreateCommentEndpointOuterClass$CreateCommentEndpoint.class;
                    obj3 = this.aD;
                    if (obj3 == null) {
                        obj3 = new djz(this, 24);
                        this.aD = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = GetReportFormEndpointOuterClass$GetReportFormEndpoint.class;
                    obj3 = this.aE;
                    if (obj3 == null) {
                        obj3 = new djz(this, 25);
                        this.aE = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = FlagEndpointOuterClass$FlagEndpoint.class;
                    obj3 = this.aF;
                    if (obj3 == null) {
                        obj3 = new djz(this, 27);
                        this.aF = obj3;
                    }
                    a2 = a2.b(cls, obj3);
                    cls = OpenDialogCommandOuterClass$OpenDialogCommand.class;
                    obj3 = this.aG;
                    if (obj3 == null) {
                        obj3 = new djz(this, 28);
                        this.aG = obj3;
                    }
                    acli acli = new acli(a, ff, aQ, new aaak(a2.b(cls, obj3).b()));
                    this.aH = bapx.a(this.aH, acli);
                    obj2 = acli;
                }
            }
            obj = obj2;
        }
        return (acli) obj;
    }

    public final aaas m() {
        return (aaas) baqd.a(D(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final acvx n() {
        Object obj = this.aI;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aI;
                if (obj2 instanceof baqe) {
                    obj2 = (acvx) baqd.a(d(), "Cannot return null from a non-@Nullable @Provides method");
                    this.aI = bapx.a(this.aI, obj2);
                }
            }
            obj = obj2;
        }
        return (acvx) obj;
    }

    private final abzv E() {
        Object obj = this.aK;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aK;
                if (obj2 instanceof baqe) {
                    obj2 = (abzv) baqd.a(new abzv(acle.a(this.a), this.S.oy()), "Cannot return null from a non-@Nullable @Provides method");
                    this.aK = bapx.a(this.aK, obj2);
                }
            }
            obj = obj2;
        }
        return (abzv) obj;
    }

    public final akpi o() {
        Object obj = this.aM;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aM;
                if (obj2 instanceof baqe) {
                    obj2 = new akpi();
                    this.aM = bapx.a(this.aM, obj2);
                }
            }
            obj = obj2;
        }
        return (akpi) obj;
    }

    private final bcaa F() {
        bcaa bcaa = this.aN;
        if (bcaa != null) {
            return bcaa;
        }
        djz djz = new djz(this, 29);
        this.aN = djz;
        return djz;
    }

    private final akoe G() {
        return new akoe(F());
    }

    private final acfc H() {
        return new acfc(this.S.ow(), this.S.n());
    }

    private final aclo I() {
        H();
        return new aclo();
    }

    public final bcaa p() {
        bcaa bcaa = this.aP;
        if (bcaa != null) {
            return bcaa;
        }
        djz djz = new djz(this, 30);
        this.aP = djz;
        return djz;
    }

    private final akzb J() {
        return new akzb(p(), this.S.jw(), F());
    }

    private final alck K() {
        Object obj = this.aQ;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aQ;
                if (obj2 instanceof baqe) {
                    obj2 = new alck(new albw(aclb.a(this.a), J()), m());
                    this.aQ = bapx.a(this.aQ, obj2);
                }
            }
            obj = obj2;
        }
        return (alck) obj;
    }

    public final abpo q() {
        Object obj = this.aS;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aS;
                if (obj2 instanceof baqe) {
                    obj2 = (abpo) baqd.a(new abqd(this.S.R(), this.S.ku(), this.S.kw(), this.S.kx(), this.S.at(), this.S.bR(), this.S.ky(), this.S.jy(), this.S.ca(), this.S.kA(), this.S.kC()).a(i()), "Cannot return null from a non-@Nullable @Provides method");
                    this.aS = bapx.a(this.aS, obj2);
                }
            }
            obj = obj2;
        }
        return (abpo) obj;
    }

    public final akpe r() {
        return new akpe(F());
    }

    public final abqy s() {
        return new abqy(this.S.n());
    }

    public final xwb t() {
        this.S.ox();
        return (xwb) baqd.a(xwb.a(R.style.f597Themed.YouTube.LiveChat.Dark), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final Context u() {
        Context a = acla.a(this.a);
        this.S.ox();
        return (Context) baqd.a(new ContextThemeWrapper(a, R.style.f597Themed.YouTube.LiveChat.Dark), "Cannot return null from a non-@Nullable @Provides method");
    }

    private final akvz L() {
        Object obj = this.bd;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.bd;
                if (obj2 instanceof baqe) {
                    bcaa bcaa = this.aT;
                    if (bcaa == null) {
                        bcaa = new djz(this, 31);
                        this.aT = bcaa;
                    }
                    bcaa bcaa2 = bcaa;
                    bcaa = this.aU;
                    if (bcaa == null) {
                        bcaa = new djz(this, 32);
                        this.aU = bcaa;
                    }
                    bcaa bcaa3 = bcaa;
                    bcaa = this.aV;
                    if (bcaa == null) {
                        bcaa = new djz(this, 33);
                        this.aV = bcaa;
                    }
                    bcaa bcaa4 = bcaa;
                    bcaa = this.aW;
                    if (bcaa == null) {
                        bcaa = new djz(this, 34);
                        this.aW = bcaa;
                    }
                    bcaa bcaa5 = bcaa;
                    bcaa = this.aX;
                    if (bcaa == null) {
                        bcaa = new djz(this, 35);
                        this.aX = bcaa;
                    }
                    bcaa bcaa6 = bcaa;
                    bcaa = this.aY;
                    if (bcaa == null) {
                        bcaa = new djz(this, 36);
                        this.aY = bcaa;
                    }
                    bcaa bcaa7 = bcaa;
                    bcaa = this.aZ;
                    if (bcaa == null) {
                        bcaa = new djz(this, 37);
                        this.aZ = bcaa;
                    }
                    bcaa bcaa8 = bcaa;
                    bcaa = this.ba;
                    if (bcaa == null) {
                        bcaa = new djz(this, 38);
                        this.ba = bcaa;
                    }
                    bcaa bcaa9 = bcaa;
                    bcaa = this.bb;
                    if (bcaa == null) {
                        bcaa = new djz(this, 39);
                        this.bb = bcaa;
                    }
                    bcaa bcaa10 = bcaa;
                    bcaa = this.bc;
                    if (bcaa == null) {
                        bcaa = new djz(this, 41);
                        this.bc = bcaa;
                    }
                    acre acre = new acre(bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8, bcaa9, bcaa10, bcaa);
                    this.bd = bapx.a(this.bd, acre);
                }
            }
            obj = obj2;
        }
        return (akvz) baqd.a((acre) obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    private final acnc M() {
        return (acnc) baqd.a((acnc) acle.a(this.a).f().a("LIVE_STREAM_FRAGMENT"), "Cannot return null from a non-@Nullable @Provides method");
    }

    private final acov N() {
        Object obj = this.be;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.be;
                if (obj2 instanceof baqe) {
                    obj2 = (acov) baqd.a(acle.a(this.a), "Cannot return null from a non-@Nullable @Provides method");
                    this.be = bapx.a(this.be, obj2);
                }
            }
            obj = obj2;
        }
        return (acov) obj;
    }

    private final Object O() {
        Object obj = this.bf;
        if (!(obj instanceof baqe)) {
            return obj;
        }
        Object obj2;
        synchronized (obj) {
            obj2 = this.bf;
            if (obj2 instanceof baqe) {
                obj2 = aclg.a();
                this.bf = bapx.a(this.bf, obj2);
            }
        }
        return obj2;
    }

    private final abza P() {
        return (abza) baqd.a((ackv) O(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final bcaa v() {
        bcaa bcaa = this.bh;
        if (bcaa != null) {
            return bcaa;
        }
        djz djz = new djz(this, 42);
        this.bh = djz;
        return djz;
    }

    private final bcaa Q() {
        bcaa bcaa = this.bi;
        if (bcaa != null) {
            return bcaa;
        }
        djz djz = new djz(this, 43);
        this.bi = djz;
        return djz;
    }

    public final bcaa w() {
        bcaa bcaa = this.bk;
        if (bcaa != null) {
            return bcaa;
        }
        djz djz = new djz(this, 45);
        this.bk = djz;
        return djz;
    }

    private final Object R() {
        return new aclk(acle.a(this.a));
    }

    private final urf S() {
        Object obj = this.bw;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.bw;
                if (obj2 instanceof baqe) {
                    obj2 = new urf(c(), this.S.k(), this.S.aN());
                    this.bw = bapx.a(this.bw, obj2);
                }
            }
            obj = obj2;
        }
        return (urf) obj;
    }

    private final DisplayManager T() {
        return (DisplayManager) baqd.a((DisplayManager) acla.a(this.a).getSystemService("display"), "Cannot return null from a non-@Nullable @Provides method");
    }

    private final bcaa U() {
        bcaa bcaa = this.bx;
        if (bcaa != null) {
            return bcaa;
        }
        djz djz = new djz(this, 53);
        this.bx = djz;
        return djz;
    }

    public final akvz x() {
        Object obj = this.bz;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.bz;
                if (obj2 instanceof baqe) {
                    bcaa bcaa = this.by;
                    if (bcaa == null) {
                        bcaa = new djz(this, 56);
                        this.by = bcaa;
                    }
                    obj2 = (akvz) baqd.a(new dny(bcaa), "Cannot return null from a non-@Nullable @Provides method");
                    this.bz = bapx.a(this.bz, obj2);
                }
            }
            obj = obj2;
        }
        return (akvz) obj;
    }

    public final void a(aliw aliw) {
        alpa alpa = this.T;
        if (alpa == null) {
            alpa = new alpa();
            this.T = alpa;
        }
        aliw.Z = alpa;
        aliw.aa = y();
        aliw.ab = this.S.cd();
        aliw.ac = this.S.eJ();
        aliw.ad = m();
    }

    public final void a(uqx uqx) {
        uqx.Z = c();
    }

    public final void a(urj urj) {
        urj.ab = c();
        urj.ac = m();
        urj.ad = this.S.oI();
        urj.ae = this.S.bi();
        urj.af = this.S.ka();
        urj.ag = new usk(acla.a(this.a), m(), c());
        urj.ah = this.S.cB();
    }

    public final void a(aclq aclq) {
        Object obj;
        this.S.bf();
        aclq.a = n();
        aclq.b = this.S.oF();
        aclq.c = m();
        aclq.Z = this.S.oA();
        aclq.aa = this.S.kr();
        aclq.ab = e();
        Object obj2 = this.aJ;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.aJ;
                if (obj instanceof baqe) {
                    obj = (acmf) baqd.a(acle.a(this.a), "Cannot return null from a non-@Nullable @Provides method");
                    this.aJ = bapx.a(this.aJ, obj);
                }
            }
            obj2 = obj;
        }
        aclq.ac = (acmf) obj2;
        aclq.ad = E();
        aclq.ae = this.S.cd();
        obj2 = this.aO;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.aO;
                if (obj instanceof baqe) {
                    LiveCreationActivity a = acle.a(this.a);
                    aaas m = m();
                    Object obj3 = this.aL;
                    if (obj3 instanceof baqe) {
                        Object obj4;
                        synchronized (obj3) {
                            obj4 = this.aL;
                            if (obj4 instanceof baqe) {
                                obj4 = new acro(aclc.a(this.a), m(), this.S.kr());
                                this.aL = bapx.a(this.aL, obj4);
                            }
                        }
                        obj3 = obj4;
                    }
                    acro acro = (acro) obj3;
                    Object akxn = new akxn(a, m, acro, G());
                    acrj a2 = acro.a();
                    a2.b = new acrm(akxn);
                    a2.a = new acrl(akxn);
                    obj = (akxn) baqd.a(akxn, "Cannot return null from a non-@Nullable @Provides method");
                    this.aO = bapx.a(this.aO, obj);
                }
            }
            obj2 = obj;
        }
        aclq.af = (akxn) obj2;
        aclq.ag = H();
        aclq.ah = this.S.ks();
        this.S.kt();
        I();
        aclq.ai = K();
    }

    public final void a(acmo acmo) {
        Object obj = this.aR;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.aR;
                if (obj2 instanceof baqe) {
                    obj2 = (acmp) baqd.a(this.a.a, "Cannot return null from a non-@Nullable @Provides method");
                    this.aR = bapx.a(this.aR, obj2);
                }
            }
            obj = obj2;
        }
        acmo.a = (acmp) obj;
        acmo.b = n();
    }

    public final void a(acmw acmw) {
        acmw.a = q();
        acmw.b = j();
        acmw.c = this.S.s();
        acmw.Z = r();
        acmw.aa = this.S.kD();
        acmw.ab = H();
        acmw.ac = L();
    }

    public final void a(absf absf) {
        absf.Z = this.S.kk();
    }

    public final void a(acnc acnc) {
        acnc.c = m();
        acnc.Z = n();
        acnc.aa = (acek) baqd.a(new acek(this.S.oF(), M()), "Cannot return null from a non-@Nullable @Provides method");
        acnc.ab = (achf) baqd.a(achf.a(acle.a(this.a), this.S.ox()), "Cannot return null from a non-@Nullable @Provides method");
        acnc.ac = e();
        acnc.ad = new acan(acla.a(this.a));
        acnc M = M();
        acnc.ae = (acck) baqd.a(new acck(M.p(), M.aF, this.S.ks()), "Cannot return null from a non-@Nullable @Provides method");
        acnc.af = (acby) baqd.a(new acby(acla.a(this.a)), "Cannot return null from a non-@Nullable @Provides method");
        acnc.ag = N();
        acnc.ah = P();
        acnc.ai = this.S.oF();
        Object obj = this.bg;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.bg;
                if (obj2 instanceof baqe) {
                    acte acte = new acte();
                    acfc H = H();
                    Context a = acla.a(this.a);
                    Object oy = this.S.oy();
                    abza P = P();
                    acov N = N();
                    amqw.a(oy);
                    acaw.a();
                    boolean i = H.i();
                    N.getClass();
                    obj2 = (acaq) baqd.a((Object) new acay(i, a, oy, P, new acow(N)), "Cannot return null from a non-@Nullable @Provides method");
                    this.bg = bapx.a(this.bg, obj2);
                }
            }
            obj = obj2;
        }
        acnc.aj = (acaq) obj;
        acnc.ak = this.S.iQ();
        acnc.al = H();
        acnc.am = this.S.oy();
        acnc.an = this.S.kr();
        acnc.ao = this.S.ox();
        acnc.ap = this.S.bb();
    }

    public final void a(aljp aljp) {
        bcaa p = p();
        bcaa v = v();
        bcaa jx = this.S.jx();
        bcaa at = this.S.at();
        bcaa kG = this.S.kG();
        bcaa Q = Q();
        bcaa bcaa = this.bj;
        if (bcaa == null) {
            bcaa = new djz(this, 44);
            this.bj = bcaa;
        }
        aljp.ae = new alfj(p, v, jx, at, kG, Q, bcaa, w(), this.S.jy());
        aljp.af = this.S.kF();
        aljp.ag = this.S.s();
        aljp.ah = this.S.cd();
        aljp.ai = this.S.kH();
        aljp.aj = acld.a();
    }

    public final void a(ybk ybk) {
        ybk.Z = this.S.cd();
        ybk.aa = this.S.kI();
        bcaa v = v();
        bcaa p = p();
        bcaa fe = this.S.fe();
        bcaa kJ = this.S.kJ();
        bcaa ky = this.S.ky();
        bcaa eY = this.S.eY();
        bcaa kK = this.S.kK();
        bcaa bcaa = this.bl;
        if (bcaa == null) {
            bcaa = new djz(this, 46);
            this.bl = bcaa;
        }
        ybk.ab = new xxa(v, p, fe, kJ, ky, eY, kK, bcaa, this.S.kL());
    }

    public final void a(aljg aljg) {
        aljg.Z = this.S.eJ();
        aljg.aa = y();
        aljg.ab = this.S.oC();
        aljg.ac = p();
    }

    public final void a(alav alav) {
        alav.aB = n();
    }

    public final void a(acoy acoy) {
        acoy.a = this.S.bi();
        acoy.b = n();
        Object obj = this.bm;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.bm;
                if (obj2 instanceof baqe) {
                    obj2 = (acpa) baqd.a(acle.a(this.a), "Cannot return null from a non-@Nullable @Provides method");
                    this.bm = bapx.a(this.bm, obj2);
                }
            }
            obj = obj2;
        }
        acoy.c = (acpa) obj;
        acoy.Z = m();
    }

    public final void a(EditLocation editLocation) {
        editLocation.a = this.S.s();
        editLocation.b = J();
    }

    public final void a(acpe acpe) {
        acpe.aB = n();
        acpe.ao = this.S.oF();
        acpe.ap = m();
        acpe.aq = this.S.cd();
        acpe.ar = this.S.aM();
        acpe.as = this.S.kr();
        acpe.at = e();
        acdy acdy = new acdy(acla.a(this.a));
        Object obj = this.bn;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.bn;
                if (obj2 instanceof baqe) {
                    obj2 = acle.a(this.a);
                    this.bn = bapx.a(this.bn, obj2);
                }
            }
            obj = obj2;
        }
        acpe.au = (acpv) obj;
        acpe.av = f();
        this.S.k();
        this.S.jz();
        acpe.aw = this.S.oy();
        bcaa jy = this.S.jy();
        bcaa bcaa = this.bo;
        if (bcaa == null) {
            bcaa = new djz(this, 47);
            this.bo = bcaa;
        }
        acpe.ax = new zqs(jy, bcaa, this.S.jA());
        acpe.ay = H();
        acpe.az = K();
        this.S.kt();
        I();
        diu diu = this.S;
        bcaa = diu.ck;
        if (bcaa == null) {
            bcaa = new dlk(diu, 398);
            diu.ck = bcaa;
        }
        acpe.aA = new acjy(bcaa, this.S.ap());
        acpe.aB = n();
    }

    public final void a(acpy acpy) {
        this.S.s();
        acpy.a = e();
        Object obj = this.bp;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.bp;
                if (obj2 instanceof baqe) {
                    obj2 = (acqb) baqd.a(acle.a(this.a), "Cannot return null from a non-@Nullable @Provides method");
                    this.bp = bapx.a(this.bp, obj2);
                }
            }
            obj = obj2;
        }
        acpy.b = (acqb) obj;
        acpy.c = this.S.cd();
        acpy.Z = this.S.kr();
        acpy.aa = m();
        acpy.ab = r();
        acpy.ac = E();
        acpy.ad = this.S.oA();
    }

    public final void a(acqd acqd) {
        acqd.af = this.S.oC();
        acqd.ag = this.S.H();
        acqd.ah = this.S.df();
        acqd.aa = n();
        acqd.Z = m();
        acqd.ab = this.S.eJ();
    }

    public final void a(abst abst) {
        Object obj = this.bu;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.bu;
                if (obj2 instanceof baqe) {
                    bcaa bcaa = this.bq;
                    if (bcaa == null) {
                        bcaa = new djz(this, 48);
                        this.bq = bcaa;
                    }
                    bcaa bcaa2 = this.br;
                    if (bcaa2 == null) {
                        bcaa2 = new djz(this, 49);
                        this.br = bcaa2;
                    }
                    bcaa bcaa3 = this.bs;
                    if (bcaa3 == null) {
                        bcaa3 = new djz(this, 50);
                        this.bs = bcaa3;
                    }
                    bcaa bcaa4 = this.bt;
                    if (bcaa4 == null) {
                        bcaa4 = new djz(this, 51);
                        this.bt = bcaa4;
                    }
                    obj2 = abve.a(bcaa, bcaa2, bcaa3, bcaa4);
                    this.bu = bapx.a(this.bu, obj2);
                }
            }
            obj = obj2;
        }
        abst.Z = (akvz) baqd.a((abvf) obj, "Cannot return null from a non-@Nullable @Provides method");
        abst.aa = L();
        abst.ab = this.S.kD();
    }

    public final void a(alkc alkc) {
        alkc.al = this.S.kH();
        alkc.am = this.S.kF();
        bcaa bcaa = this.bv;
        if (bcaa == null) {
            bcaa = new djz(this, 52);
            this.bv = bcaa;
        }
        alkc.an = bapx.b(bcaa);
        alkc.ao = bapx.b(Q());
        alkc.ap = this.S.oF();
        alkc.aq = y();
        alkc.ar = this.S.s();
        alkc.as = this.S.oI();
        alkc.at = this.S.oC();
        alkc.au = this.S.oz();
        alkc.av = this.S.cd();
        alkc.aw = this.S.eJ();
        alkc.ax = this.S.aH();
        alkc.ay = this.S.H();
        alkc.az = this.S.ox();
        alkc.aA = r();
        alkc.aB = o();
        alkc.aC = m();
        alkc.aD = this.S.oy();
        alkc.aE = this.S.c();
        alkc.aF = (xwb) baqd.a(xwb.a(R.style.f544Theme.YouTube.SharePanel.Dark), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void a(acet acet) {
        acet.Z = this.S.bx();
        acet.aa = aclb.a(this.a);
        acet.ab = m();
        acet.ac = o();
    }

    public final void a(LiveCreationActivity liveCreationActivity) {
        liveCreationActivity.j = this.S.oF();
        liveCreationActivity.k = this.S.oA();
        liveCreationActivity.l = this.S.oC();
        aclf.a(liveCreationActivity, R());
        liveCreationActivity.n = D();
        liveCreationActivity.o = this.S.k();
        liveCreationActivity.p = this.S.aQ();
        liveCreationActivity.q = n();
        liveCreationActivity.r = S();
        liveCreationActivity.s = c();
        liveCreationActivity.t = this.S.aM();
        aclf.b(liveCreationActivity, O());
        liveCreationActivity.v = e();
        liveCreationActivity.w = this.S.oy();
        liveCreationActivity.x = ackz.a();
        liveCreationActivity.y = T();
        liveCreationActivity.z = H();
        liveCreationActivity.A = this.S.iV();
        liveCreationActivity.B = this.S.oz();
        liveCreationActivity.C = this.S.m();
        liveCreationActivity.D = bapx.b(U());
        liveCreationActivity.E = f();
        liveCreationActivity.F = g();
        liveCreationActivity.G = this.S.kt();
        liveCreationActivity.H = this.S.ja();
        liveCreationActivity.I = I();
    }

    public final void a(wjv wjv) {
        wjv.Z = this.S.cd();
        wjv.aa = m();
        wjv.ab = this.S.jY();
        wjv.ac = x();
        wjv.ad = this.S.k();
        wjv.ae = this.S.ja();
        wjv.af = this.S.s();
        wjv.ag = r();
        wjv.ah = wjq.a(acla.a(this.a), this.S.bx());
        wjv.ai = this.S.bi();
        aklf aklf = new aklf();
        wlc wlc = new wlc();
        bcaa v = v();
        bcaa bcaa = this.bA;
        if (bcaa == null) {
            bcaa = new djz(this, 57);
            this.bA = bcaa;
        }
        wjv.aj = new gri(v, bcaa);
        wjv.ak = this.S.oB();
    }

    public final void a(dru dru) {
        dru.Z = this.S.oI();
        dru.aa = this.S.aN();
        dru.ab = new usv(this.S.aN(), this.S.hs(), this.S.oA(), this.S.oB());
        dru.ac = this.S.aO();
        dru.ad = p();
        dru.ae = this.S.oC();
        dru.af = this.S.k();
        dru.ag = this.S.s();
        dru.ah = this.S.cd();
        dru.ai = this.S.hs();
        dru.aj = G();
        dru.ak = new dne();
        dru.al = this.S.c();
        dru.am = this.S.jv();
    }

    public final void a(MainLiveCreationActivity mainLiveCreationActivity) {
        mainLiveCreationActivity.j = this.S.oF();
        mainLiveCreationActivity.k = this.S.oA();
        mainLiveCreationActivity.l = this.S.oC();
        aclf.a(mainLiveCreationActivity, R());
        mainLiveCreationActivity.n = D();
        mainLiveCreationActivity.o = this.S.k();
        mainLiveCreationActivity.p = this.S.aQ();
        mainLiveCreationActivity.q = n();
        mainLiveCreationActivity.r = S();
        mainLiveCreationActivity.s = c();
        mainLiveCreationActivity.t = this.S.aM();
        aclf.b(mainLiveCreationActivity, O());
        mainLiveCreationActivity.v = e();
        mainLiveCreationActivity.w = this.S.oy();
        mainLiveCreationActivity.x = ackz.a();
        mainLiveCreationActivity.y = T();
        mainLiveCreationActivity.z = H();
        mainLiveCreationActivity.A = this.S.iV();
        mainLiveCreationActivity.B = this.S.oz();
        mainLiveCreationActivity.C = this.S.m();
        mainLiveCreationActivity.D = bapx.b(U());
        mainLiveCreationActivity.E = f();
        mainLiveCreationActivity.F = g();
        mainLiveCreationActivity.G = this.S.kt();
        mainLiveCreationActivity.H = this.S.ja();
        mainLiveCreationActivity.I = I();
        mainLiveCreationActivity.g = l();
        mainLiveCreationActivity.h = K();
    }

    public final acqq a(acqs acqs) {
        baqd.a(acqs);
        return new djw(this, acqs);
    }

    public final vat a(vav vav) {
        baqd.a(vav);
        return new djy(this, vav);
    }

    public final alat b() {
        return new djx(this);
    }

    /* synthetic */ dju(diu diu, ackw ackw) {
        this.S = diu;
        this.a = ackw;
        aksv aksv = new aksv();
        acmi acmi = new acmi();
        acot acot = new acot();
        acoz acoz = new acoz();
        acqe acqe = new acqe();
        zje zje = new zje();
    }
}
