package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedInteractionLoggingService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISelectableItemRegistryService;

/* renamed from: ndt */
public final class ndt implements msl, mvo {
    public final muo A;
    public final mvg B;
    public final Context C;
    public final mtw D;
    public final mta E;
    public String F;
    public String G;
    public boolean H;
    private final msw I;
    private boolean J;
    private final aiuf K;
    private final nhv L;
    private final mtm M;
    private final vwa N;
    private final aidl O;
    private final aifz P;
    private final aigz Q;
    private final aiic R;
    private final muk S;
    private final mty T;
    public IApiPlayerService a = new DisconnectedApiPlayerService();
    public ISelectableItemRegistryService b;
    public IEmbedInteractionLoggingService c;
    public final nbi d;
    public final nen e;
    public final nfa f;
    public final mxd g;
    public final mwo h;
    public final nfe i;
    public final mxn j;
    public final nfs k;
    public final nau l;
    public final nei m;
    public final nfl n;
    public final nbd o;
    public final nee p;
    public final amky q;
    public final myo r;
    public final myv s;
    public boolean t;
    public boolean u;
    public final Handler v;
    public final FrameLayout w;
    public final mug x;
    public final mui y;
    public final nfy z;

    public ndt(Context context, msh msh, nee nee, mvi mvi, mve mve, bctz bctz, amky amky) {
        this.C = (Context) amqw.a((Object) context, (Object) "context cannot be null");
        amqw.a((Object) msh, (Object) "activityProxy cannot be null");
        this.p = (nee) amqw.a((Object) nee, (Object) "fullscreenHandler cannot be null");
        this.q = (amky) amqw.a((Object) amky, (Object) "embedConfigProvider cannot be null");
        this.K = new aiuf(context);
        this.w = new FrameLayout(context);
        this.w.addView(this.K);
        this.v = new Handler(context.getMainLooper());
        this.I = new msw(this.v);
        this.s = new myv(this.v);
        this.S = new muk();
        this.T = mty.a;
        this.E = new mta(this.K, msh, new neg(this));
        this.S.a.c().a(new mtc(this.E));
        this.D = new mtw(context, msh, new ned(this), this.K, new xot(msh.c(), msh.a(), this.K));
        this.L = new nhv();
        this.k = new nfs(mte.a, this.v, this.L);
        this.z = new nfy(context, bctz);
        this.y = new mui(context, new ndw(this), this.S.a);
        this.x = new mug(context, this.E, new nic(this.L));
        this.x.a = new nef(this);
        this.A = new muo(context);
        try {
            this.M = new mtm(context, this.x.d());
            mug mug = this.x;
            if (mug != null) {
                this.M.a(mug.c());
            }
            this.N = new vwa(context);
            this.O = new aidl(context);
            this.P = new aifz(context);
            this.Q = new aigz(context);
            this.R = new aiic(context);
            this.K.a(this.z, this.Q, this.P, this.y, this.R, this.x, this.A, this.M, this.N, this.O);
            this.K.setFocusable(true);
            mvn mvn = new mvn(context, this);
            this.e = new nen(mvn, context, this.v);
            this.f = null;
            this.K.b(mvn);
            this.d = new nbi(this.K, this.v);
            this.g = new mxd(mvn, this.v);
            this.h = new mwo(this.M, this.v);
            this.i = new nfe(this.N, this.v);
            mug mug2 = this.x;
            this.j = new mxn(mug2, mug2, mug2, mug2, mug2, this.v);
            this.l = new nau(this.O, this.v);
            this.m = new nei(this.P, this.v);
            this.n = new nfl(this.Q, this.v);
            this.o = new nbd(this.R, this.v);
            this.r = new myo(this.I);
            this.I.a(ngq.RELATED_VIDEOS_SCREEN, this.A);
            this.I.a(ngq.MUTED_AUTOPLAY_STATE, this.S);
            this.I.a(ngq.PLAYBACK_EVENT_DATA, mvi);
            this.I.a(ngq.ERROR_DATA, mve);
            this.I.a(ngq.HOT_CONFIG_DATA, this.T);
            this.B = new mvg(this.x, this.y, this.S.a);
        } catch (RuntimeException e) {
            ankx.a(e);
            throw e;
        }
    }

    public final boolean d() {
        return (this.a instanceof DisconnectedApiPlayerService) ^ 1;
    }

    public final void a(boolean z) {
        if (d()) {
            try {
                this.a.c(z);
                return;
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
                return;
            }
        }
        ammj.a("Service was disconnected", new Object[0]);
    }

    public final void e() {
        if (d()) {
            try {
                this.a.d();
                return;
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
                return;
            }
        }
        ammj.a("Service was disconnected", new Object[0]);
    }

    public final void f() {
        if (this.J) {
            try {
                this.u = false;
                this.a.p();
                return;
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
                return;
            }
        }
        this.u = true;
    }

    public final void a(String str) {
        if (!d()) {
            return;
        }
        if (!d()) {
            ammj.a("Service was disconnected", new Object[0]);
        } else if (this.t) {
            e();
            ammj.a(str, new Object[0]);
        }
    }

    public final void a() {
        this.J = true;
        if (this.u) {
            f();
        }
    }

    public final void b() {
        this.z.c();
        try {
            this.a.f();
        } catch (RemoteException e) {
            ammj.a("Service was disconnected: %s", e.getMessage());
        }
        mta mta = this.E;
        if (mta.i.hasMessages(0)) {
            mta.c.a("Surface was destroyed. Please make sure the fragment is fully visible on screen.");
        }
        this.J = false;
    }

    public final void c() {
        ammj.b("Cannot attach a YouTubePlayerView backed by a TextureView to a Window that is not hardware accelerated", new Object[0]);
    }

    static {
        xtl.a("YouTubeAndroidPlayerAPI");
    }
}
