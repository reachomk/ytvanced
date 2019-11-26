package com.google.android.youtube.api.jar.client;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService.Stub.Proxy;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedInteractionLoggingService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISelectableItemRegistryService;
import defpackage.acwc;
import defpackage.aiuf;
import defpackage.amkc;
import defpackage.amkz;
import defpackage.ammf;
import defpackage.ammh;
import defpackage.ammj;
import defpackage.ammk;
import defpackage.amqw;
import defpackage.mrp;
import defpackage.msh;
import defpackage.msj;
import defpackage.msl;
import defpackage.mte;
import defpackage.muo;
import defpackage.mvn;
import defpackage.mvo;
import defpackage.mvp;
import defpackage.mvs;
import defpackage.mwo;
import defpackage.mxd;
import defpackage.mxl;
import defpackage.mxn;
import defpackage.nau;
import defpackage.nbd;
import defpackage.nbi;
import defpackage.nei;
import defpackage.nen;
import defpackage.nfa;
import defpackage.nfc;
import defpackage.nfe;
import defpackage.nfl;
import defpackage.nfs;
import defpackage.nhm;
import defpackage.xtl;
import java.lang.reflect.Field;
import java.util.List;

public final class RemoteEmbeddedPlayer extends mvs implements msl, mvo {
    public boolean B;
    public boolean C;
    public boolean D;
    public long E;
    public long F;
    private IApiPlayerService G;
    private final nbi H;
    private final nen I;
    private final nfa J;
    private final mxd K;
    private final mwo L;
    private final nfe M;
    private final mxn N;
    private final nau O;
    private final nei P;
    private final nfl Q;
    private final nbd R;
    private final nfs S;
    private boolean T;
    private boolean U;
    private final int V;
    private ISelectableItemRegistryService W;
    private IEmbedInteractionLoggingService X;

    public RemoteEmbeddedPlayer(IBinder iBinder, IBinder iBinder2) {
        this(iBinder, iBinder2, false);
    }

    public RemoteEmbeddedPlayer(IBinder iBinder, IBinder iBinder2, boolean z) {
        ammf ammf;
        IApiPlayerFactoryService iApiPlayerFactoryService = null;
        if (iBinder == null) {
            ammf = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof ammf) {
                ammf = (ammf) queryLocalInterface;
            } else {
                ammf = new ammh(iBinder);
            }
        }
        Context context = (Activity) ammk.a(ammf);
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
            if (queryLocalInterface2 instanceof IApiPlayerFactoryService) {
                iApiPlayerFactoryService = (IApiPlayerFactoryService) queryLocalInterface2;
            } else {
                iApiPlayerFactoryService = new Proxy(iBinder2);
            }
        }
        Field[] declaredFields = context.getClass().getSuperclass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            if (field.getType() != Activity.class) {
                i++;
            } else {
                field.setAccessible(true);
                try {
                    this(context, (Activity) field.get(context), iApiPlayerFactoryService, z);
                    return;
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Could not get the activity from the ActivityWrapper", e);
                }
            }
        }
        throw new IllegalStateException("Failed to extract the wrapped activity");
    }

    public RemoteEmbeddedPlayer(IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        ammf ammf;
        IInterface queryLocalInterface;
        ammf ammh;
        String str = "com.google.android.youtube.player.internal.dynamic.IObjectWrapper";
        IApiPlayerFactoryService iApiPlayerFactoryService = null;
        if (iBinder == null) {
            ammf = null;
        } else {
            IInterface queryLocalInterface2 = iBinder.queryLocalInterface(str);
            if (queryLocalInterface2 instanceof ammf) {
                ammf = (ammf) queryLocalInterface2;
            } else {
                ammf = new ammh(iBinder);
            }
        }
        Context context = (Context) ammk.a(ammf);
        if (iBinder2 != null) {
            queryLocalInterface = iBinder2.queryLocalInterface(str);
            ammh = queryLocalInterface instanceof ammf ? (ammf) queryLocalInterface : new ammh(iBinder2);
        } else {
            ammh = null;
        }
        Activity activity = (Activity) ammk.a(ammh);
        if (iBinder3 != null) {
            queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
            if (queryLocalInterface instanceof IApiPlayerFactoryService) {
                iApiPlayerFactoryService = (IApiPlayerFactoryService) queryLocalInterface;
            } else {
                iApiPlayerFactoryService = new Proxy(iBinder3);
            }
        }
        this(context, activity, iApiPlayerFactoryService, z);
    }

    private RemoteEmbeddedPlayer(Context context, Activity activity, IApiPlayerFactoryService iApiPlayerFactoryService, boolean z) {
        msj mvp;
        Context context2 = activity;
        mxl mxl = new mxl(context2, context.getResources(), context.getClassLoader(), context.getTheme());
        msh msh = new msh(context2);
        super(mxl, msh, new aiuf(mxl));
        this.G = new DisconnectedApiPlayerService();
        amqw.a((Object) iApiPlayerFactoryService, (Object) "apiPlayerFactoryService cannot be null");
        if (z) {
            mvp = new mvp(mxl, this);
            this.I = null;
            this.J = new nfa(mvp, mxl, this.a);
        } else {
            mvp = new mvn(mxl, this);
            this.I = new nen(mvp, mxl, this.a);
            this.J = null;
        }
        this.d.b(mvp.b());
        this.H = new nbi(this.d, this.a);
        this.K = new mxd(mvp, this.a);
        this.L = new mwo(this.n, this.a);
        this.M = new nfe(this.o, this.a);
        this.N = new mxn(this.e, this.f, this.g, this.h, this.i, this.a);
        this.O = new nau(this.p, this.a);
        this.P = new nei(this.q, this.a);
        this.Q = new nfl(this.r, this.a);
        this.R = new nbd(this.m, this.a);
        this.S = new nfs(mte.a, this.a, this.k);
        amkc amkc = r1;
        amkc amkc2 = new amkc(this);
        this.G = iApiPlayerFactoryService.a(amkc, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.S, this.O, this.P, this.Q, this.R, this.b, this.c, z);
        this.X = this.G.s();
        int a = this.X.a(msh.e());
        this.V = a;
        this.X.c(a);
        this.W = this.G.r();
        muo muo = this.l;
        if (muo != null) {
            muo.a(this.c, this.W);
        }
    }

    public final boolean K() {
        try {
            return this.G.h();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void c(String str, int i) {
        try {
            this.X.a(this.V, nhm.a(str, 0, i), true);
            this.T = false;
            this.E = (long) i;
            this.G.a(str, i, this.V);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void d(String str, int i) {
        try {
            this.X.a(this.V, nhm.a(str, 1, i), true);
            this.T = false;
            this.E = (long) i;
            this.G.a(str, false, i, false, this.V);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void c(String str, int i, int i2) {
        try {
            this.X.a(this.V, nhm.a(str, 0, i, i2), true);
            this.T = false;
            this.E = (long) i2;
            this.G.a(str, i, i2, this.V);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void d(String str, int i, int i2) {
        try {
            this.X.a(this.V, nhm.a(str, 1, i, i2), true);
            this.T = false;
            this.E = (long) i2;
            this.G.a(str, i, i2, false, this.V);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void c(List list, int i, int i2) {
        try {
            this.X.a(this.V, nhm.a(list, 0, i, i2), true);
            this.T = false;
            this.E = (long) i2;
            this.G.a(list, i, i2, this.V);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void d(List list, int i, int i2) {
        try {
            this.X.a(this.V, nhm.a(list, 1, i, i2), true);
            this.T = false;
            this.E = (long) i2;
            this.G.a(list, i, i2, false, this.V);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void M() {
        try {
            this.G.q();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void N() {
        if (this.U) {
            try {
                this.T = false;
                this.G.p();
                return;
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
        this.T = true;
    }

    public final void y() {
        try {
            this.T = false;
            this.G.c();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void z() {
        try {
            this.T = false;
            this.G.d();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void A() {
        try {
            this.T = false;
            this.G.e();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void j(boolean z) {
        try {
            this.G.b(z);
            nen nen = this.I;
            if (nen != null) {
                nen.d();
            }
            nfa nfa = this.J;
            if (nfa != null) {
                nfa.a.f();
                nfc nfc = nfa.c;
                if (nfc != null) {
                    nfc.a = null;
                    nfc.b = null;
                    nfa.c = null;
                }
            }
            IEmbedInteractionLoggingService iEmbedInteractionLoggingService = this.X;
            if (iEmbedInteractionLoggingService != null) {
                iEmbedInteractionLoggingService.b(this.V);
            }
            this.H.a();
            this.L.a();
            this.S.a();
            this.c.a();
            this.N.a();
            this.O.d();
            this.M.d();
        } catch (RemoteException unused) {
        }
        this.X = null;
        this.W = null;
        this.G = new DisconnectedApiPlayerService();
    }

    public final boolean B() {
        return this.B;
    }

    public final boolean C() {
        return this.C;
    }

    public final boolean D() {
        return this.D;
    }

    public final void E() {
        try {
            this.G.i();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void F() {
        try {
            this.G.j();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int G() {
        long j = this.E;
        if (j < -2147483648L || j > 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("32 bit time overflow: ");
            stringBuilder.append(j);
            xtl.d(stringBuilder.toString());
        }
        return (int) this.E;
    }

    public final int H() {
        long j = this.F;
        if (j < -2147483648L || j > 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("32 bit time overflow: ");
            stringBuilder.append(j);
            xtl.d(stringBuilder.toString());
        }
        return (int) this.F;
    }

    public final void e(int i) {
        try {
            this.T = false;
            this.E = (long) i;
            this.G.a(i);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void f(int i) {
        try {
            this.T = false;
            this.E += (long) i;
            this.G.b(i);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void f(boolean z) {
        try {
            this.G.c(z);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void g(boolean z) {
        try {
            this.G.d(z);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void h(boolean z) {
        try {
            this.G.e(z);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void J() {
        try {
            this.G.k();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean c(int i, KeyEvent keyEvent) {
        try {
            this.G.a(i, keyEvent);
            return false;
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean d(int i, KeyEvent keyEvent) {
        try {
            this.G.b(i, keyEvent);
            return false;
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void I() {
        try {
            this.G.l();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void i(boolean z) {
        try {
            this.G.f(z);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final byte[] x() {
        try {
            return this.G.n();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(byte[] bArr) {
        try {
            return this.G.a(bArr);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void a(acwc acwc) {
        try {
            this.X.e(acwc.dU);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void L() {
        if (!TextUtils.isEmpty(this.z) && mrp.a(this.s)) {
            try {
                this.X.d(acwc.PLAYER_YOU_TUBE_BUTTON.dU);
                Context context = this.s;
                context.startActivity(mrp.a(context, this.z));
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final void a() {
        this.U = true;
        if (this.T) {
            N();
        }
    }

    public final void b() {
        this.U = false;
    }

    public final void c() {
        ammj.b("Cannot attach a YouTubePlayerView backed by a TextureView to a Window that is not hardware accelerated", new Object[0]);
        a(amkz.UNKNOWN);
    }

    static {
        xtl.a("YouTubeAndroidPlayerAPI");
    }
}
