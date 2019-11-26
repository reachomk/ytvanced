package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Toast;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;

/* renamed from: ndi */
public final class ndi implements ngg {
    public final myq a;
    public final Handler b;
    public Context c;
    public final msh d;
    public mvb e;
    public ndp f;
    public IEmbedFragmentService g;
    public amlm h = new myr();
    public ngt i = ngt.a;
    public final bdfg j = bdfg.b(ngf.d);
    public myz k;
    public int l = -1;
    public int m;
    public nhm n;
    public Bundle o;
    private boolean p;

    public static bcuh a(bcuh bcuh, bcuh bcuh2, msh msh, ViewGroup viewGroup, IEmbedFragmentServiceFactoryService iEmbedFragmentServiceFactoryService) {
        bcvq ndh = new ndh(iEmbedFragmentServiceFactoryService);
        bcuh = bcuh.a(bcut.a());
        bcuh2 = bcuh2.a(bcut.a());
        ndk ndk = new ndk(msh, viewGroup);
        return bcuh.a(new bdad(new bcuh[]{bcuh, bcuh2}, new bcuk(ndk))).a(bdfe.a()).a(ndh).a();
    }

    protected ndi(Context context, msh msh, ViewGroup viewGroup, mvb mvb) {
        this.c = context;
        this.d = (msh) amqw.a((Object) msh, (Object) "activityProxy cannot be null");
        this.b = new Handler(context.getMainLooper());
        this.e = mvb;
        this.e.b(this);
        this.k = new myz();
        this.a = new myq(msh, context);
        this.f = new ndp(this);
        myq myq = this.a;
        bdfg bdfg = this.j;
        if (myq.c != null) {
            ammj.a("Attempting to inflate view multiple times.", new Object[0]);
            return;
        }
        myq.c = new FrameLayout(myq.b);
        myq.c.setLayoutParams(new LayoutParams(-1, -1));
        myq.c.setBackgroundColor(-16777216);
        myq.e = new mta(myq.c, myq.a, new mys());
        myq.f = new mvr(myq.e);
        ngb ngb = myq.h;
        ngb.b = new nge(myq.b, this, myq.f);
        ngb.a(ngb.c);
        ngb.a(ngb.d);
        ngb.a(ngb.e);
        ngb.l_(ngb.f);
        ngb.b(ngb.g);
        myq.c.addView(myq.h.aL_());
        viewGroup.addView(myq.c);
        myq.g = bdfg.c().a(bcut.a()).a(new myt(myq));
    }

    public final void a() {
        mvb mvb = this.e;
        if (mvb != null) {
            mvb.c(this);
            this.e = null;
        }
        try {
            IEmbedFragmentService iEmbedFragmentService = this.g;
            if (iEmbedFragmentService != null) {
                iEmbedFragmentService.b();
            }
        } catch (RemoteException unused) {
        }
        this.k = null;
        myq myq = this.a;
        myq.c = null;
        myq.b = null;
        myq.g.b();
        ngb ngb = myq.h;
        ngb.b();
        ngb.b = nfz.a;
        this.f = null;
        this.g = null;
        this.c = null;
        this.l = -1;
        System.gc();
    }

    public final void b() {
        if (this.m == 8 && !this.p) {
            Bundle bundle = this.o;
            if (bundle != null) {
                this.e.a(this, bundle);
                this.p = true;
                return;
            }
            nhm nhm = this.n;
            if (!(nhm == null || nhm.e == 0)) {
                this.e.a(this, nhm, this.i, false);
                this.p = true;
            }
        }
    }

    public final void a(nhm nhm) {
        c();
        this.n = nhm;
        this.o = null;
        this.p = false;
        b();
        try {
            IEmbedFragmentService iEmbedFragmentService = this.g;
            if (iEmbedFragmentService != null) {
                iEmbedFragmentService.a(nhm);
            }
        } catch (RemoteException unused) {
        }
    }

    public final void c() {
        this.e.d(this);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        if (this.n != null) {
            bundle.putBoolean("has_simple_start_descriptor", true);
            nhm.a(this.n, bundle);
        }
        Bundle e = this.e.e(this);
        if (e == null) {
            e = this.o;
        }
        if (e != null) {
            bundle.putBundle("saved_coordinator_state", e);
        }
        return bundle;
    }

    public final String a(String str) {
        try {
            str = this.h.a(str);
            return str;
        } catch (RemoteException unused) {
            ammj.b("Cannot get embed config, client disconnected.", new Object[0]);
            return amky.b.a(str);
        }
    }

    public final void a(Context context) {
        if (this.n != null) {
            mvq a = this.a.f.a();
            if (a.a()) {
                IEmbedFragmentService iEmbedFragmentService = this.g;
                if (iEmbedFragmentService != null) {
                    try {
                        iEmbedFragmentService.a(acwc.PLAYER_LARGE_PLAY_BUTTON.dU);
                    } catch (RemoteException unused) {
                    }
                }
                this.e.a(this, this.n, this.i, true);
            } else {
                String valueOf = String.valueOf(this.a.e.c());
                String str = "Ignoring play command - playback policies violated: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                ammj.a(valueOf, new Object[0]);
                int i = a.e;
                if (i != 0) {
                    Toast.makeText(context, i, 0).show();
                }
            }
        }
    }

    public final void b(Context context) {
        if (!TextUtils.isEmpty(this.n.b)) {
            IEmbedFragmentService iEmbedFragmentService = this.g;
            if (iEmbedFragmentService != null) {
                try {
                    iEmbedFragmentService.a(acwc.PLAYER_SHARE_BUTTON.dU);
                } catch (RemoteException unused) {
                }
            }
            ngf ngf = (ngf) this.j.i();
            xuz.a(context, ngf.a() != null ? ngf.a().toString() : "", xvt.b(this.n.b));
        }
    }

    static {
        xtl.a("YouTubeAndroidPlayerAPI");
    }
}
