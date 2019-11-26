package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.application.Shell$HomeActivity;
import com.google.android.apps.youtube.app.application.Shell$LiveCreationActivity;
import com.google.android.apps.youtube.app.application.Shell$MediaSearchActivity;
import com.google.android.apps.youtube.app.application.Shell$ResultsActivity;
import com.google.android.apps.youtube.app.application.Shell$SettingsActivity;
import com.google.android.apps.youtube.app.application.Shell$UploadActivity;
import com.google.android.apps.youtube.app.application.Shell$UrlActivity;
import com.google.android.apps.youtube.app.livechat.settings.LiveChatFragment;
import com.google.android.apps.youtube.app.settings.AboutPrefsFragment;
import com.google.android.apps.youtube.app.settings.AutoplayPrefsFragment;
import com.google.android.apps.youtube.app.settings.BillingsAndPaymentsPrefsFragment;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.settings.NotificationPrefsFragment;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.apps.youtube.app.settings.PrivacyPrefsFragment;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.apps.youtube.app.settings.ThirdPartyPrefsFragment;
import com.google.android.apps.youtube.app.ui.StorageBarPreference;
import com.google.android.apps.youtube.app.wellness.WatchBreakFrequencyPickerPreference;
import java.util.concurrent.Executor;

/* renamed from: diw */
final class diw extends dir {
    private volatile Object A = new baqe();
    private volatile Object B = new baqe();
    private volatile bcaa C;
    private volatile Object D = new baqe();
    private volatile Object E = new baqe();
    private volatile bcaa F;
    private volatile bcaa G;
    private volatile bcaa H;
    private volatile bcaa I;
    private volatile bcaa J;
    private volatile bcaa K;
    private volatile bcaa L;
    private volatile bcaa M;
    private volatile bcaa N;
    private volatile bcaa O;
    private volatile bcaa P;
    private volatile bcaa Q;
    private volatile Object R = new baqe();
    private volatile bcaa S;
    private volatile bcaa T;
    private volatile Object U = new baqe();
    private volatile bcaa V;
    private volatile Object W = new baqe();
    public final uhg a;
    public volatile ageb b;
    public volatile eaj c;
    public volatile dxm d;
    public volatile akcu e;
    public volatile zyj f;
    public volatile eum g;
    public volatile fvn h;
    public volatile dzs i;
    public volatile abii j;
    public volatile aapx k;
    public volatile aawr l;
    public volatile bcaa m;
    public volatile uuj n;
    public volatile zyo o;
    public volatile Object p = new baqe();
    public volatile bcaa q;
    public volatile dyv r;
    public volatile Object s = new baqe();
    public volatile Object t = new baqe();
    public volatile bcaa u;
    public volatile Object v = new baqe();
    public final /* synthetic */ diu w;
    private volatile Object x = new baqe();
    private volatile Object y = new baqe();
    private volatile Object z = new baqe();

    /* synthetic */ diw(diu diu, uhg uhg) {
        this.w = diu;
        this.a = uhg;
    }

    private final eda m() {
        return new eda(this.w.oC());
    }

    private final bcaa o() {
        bcaa bcaa = this.O;
        if (bcaa != null) {
            return bcaa;
        }
        diz diz = new diz(this, 13);
        this.O = diz;
        return diz;
    }

    public final iyy a() {
        Object obj = this.x;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.x;
                if (obj2 instanceof baqe) {
                    obj2 = new iyy();
                    this.x = bapx.a(this.x, obj2);
                }
            }
            obj = obj2;
        }
        return (iyy) obj;
    }

    public final aldg g() {
        Object obj = this.E;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.E;
                if (obj2 instanceof baqe) {
                    obj2 = new aldg();
                    this.E = bapx.a(this.E, obj2);
                }
            }
            obj = obj2;
        }
        return (aldg) obj;
    }

    public final bcaa h() {
        bcaa bcaa = this.F;
        if (bcaa != null) {
            return bcaa;
        }
        diz diz = new diz(this, 3);
        this.F = diz;
        return diz;
    }

    public final bcaa i() {
        bcaa bcaa = this.G;
        if (bcaa != null) {
            return bcaa;
        }
        diz diz = new diz(this, 4);
        this.G = diz;
        return diz;
    }

    public final bcaa j() {
        bcaa bcaa = this.J;
        if (bcaa != null) {
            return bcaa;
        }
        diz diz = new diz(this, 9);
        this.J = diz;
        return diz;
    }

    public final bcaa k() {
        bcaa bcaa = this.L;
        if (bcaa != null) {
            return bcaa;
        }
        diz diz = new diz(this, 11);
        this.L = diz;
        return diz;
    }

    public final bcaa l() {
        bcaa bcaa = this.M;
        if (bcaa != null) {
            return bcaa;
        }
        diz diz = new diz(this, 12);
        this.M = diz;
        return diz;
    }

    public final zta b() {
        Object obj;
        Object obj2 = this.y;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.y;
                if (obj instanceof baqe) {
                    Activity a = uhj.a(this.a);
                    afpu k = this.w.k();
                    acuf m = this.w.m();
                    Executor M = this.w.M();
                    SharedPreferences ox = this.w.ox();
                    tbg mF = this.w.mF();
                    this.w.bp();
                    obj = ztj.a(a, k, m, M, ox, mF, tmj.a(), tfa.a(), tmi.a(), tml.a(), ted.a(), this.w.mG(), tmz.a(), tmy.a(), tnb.a(), this.w.af());
                    this.y = bapx.a(this.y, obj);
                }
            }
        } else {
            obj = obj2;
        }
        return (zta) obj;
    }

    public final zsr c() {
        return new zsr(uhj.a(this.a), this.w.cd(), f(), this.w.s(), this.w.bx());
    }

    public final jbb d() {
        Object obj = this.z;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.z;
                if (obj2 instanceof baqe) {
                    obj2 = new jbb(this.w.aH(), this.w.ox(), this.w.k());
                    this.z = bapx.a(this.z, obj2);
                }
            }
            obj = obj2;
        }
        return (jbb) obj;
    }

    private final acvx n() {
        Object obj = this.A;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.A;
                if (obj2 instanceof baqe) {
                    obj2 = (acvx) baqd.a(this.w.s(), "Cannot return null from a non-@Nullable @Provides method");
                    this.A = bapx.a(this.A, obj2);
                }
            }
            obj = obj2;
        }
        return (acvx) obj;
    }

    public final acwa e() {
        Object obj = this.B;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.B;
                if (obj2 instanceof baqe) {
                    obj2 = (acwa) baqd.a(new gzc(n()), "Cannot return null from a non-@Nullable @Provides method");
                    this.B = bapx.a(this.B, obj2);
                }
            }
            obj = obj2;
        }
        return (acwa) obj;
    }

    public final aaas f() {
        Object obj = this.D;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.D;
                if (obj2 instanceof baqe) {
                    Activity a = uhj.a(this.a);
                    Class cls = SettingsActivity.class;
                    Object obj3 = this.C;
                    if (obj3 == null) {
                        obj3 = new diz(this, 0);
                        this.C = obj3;
                    }
                    obj2 = (aaas) baqd.a((aaas) amqp.c((bcaa) amur.a(cls, obj3).get(a.getClass())).a(gzf.a).c(), "Cannot return null from a non-@Nullable @Provides method");
                    this.D = bapx.a(this.D, obj2);
                }
            }
            obj = obj2;
        }
        return (aaas) obj;
    }

    private final alcs p() {
        Object obj;
        Object obj2 = this.R;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.R;
                if (obj instanceof baqe) {
                    bapu bapu;
                    Activity a = uhj.a(this.a);
                    aaas f = f();
                    acvj s = this.w.s();
                    jbb d = d();
                    aldg g = g();
                    akkq cd = this.w.cd();
                    bcaa h = h();
                    bcaa i = i();
                    bcaa bcaa = this.H;
                    if (bcaa == null) {
                        bcaa = new diz(this, 5);
                        this.H = bcaa;
                    }
                    bcaa bcaa2 = bcaa;
                    bcaa = this.I;
                    if (bcaa == null) {
                        bcaa = new diz(this, 7);
                        this.I = bcaa;
                    }
                    bcaa bcaa3 = bcaa;
                    bcaa = this.K;
                    if (bcaa == null) {
                        bcaa = new diz(this, 8);
                        this.K = bcaa;
                    }
                    aldn aldn = new aldn(h, i, bcaa2, bcaa3, bcaa);
                    bapu b = bapx.b(this.w.hY());
                    bcaa = h();
                    bcaa bcaa4 = this.N;
                    if (bcaa4 == null) {
                        bcaa4 = new diz(this, 10);
                        this.N = bcaa4;
                    }
                    jac jac = new jac(bcaa, bcaa4, o());
                    bcaa = h();
                    bcaa4 = this.P;
                    if (bcaa4 == null) {
                        bcaa4 = new diz(this, 14);
                        this.P = bcaa4;
                    }
                    jbn jbn = new jbn(bcaa, bcaa4, o());
                    bcaa = h();
                    bcaa4 = i();
                    jbn jbn2 = jbn;
                    bcaa2 = this.w.jx();
                    jac jac2 = jac;
                    i = this.Q;
                    if (i == null) {
                        bapu = b;
                        i = new diz(this, 15);
                        this.Q = i;
                    } else {
                        bapu = b;
                    }
                    ztq ztq = new ztq(bcaa, bcaa4, bcaa2, i);
                    uvp mP = this.w.mP();
                    diu diu = this.w;
                    Object obj3 = diu.ee;
                    if (obj3 instanceof baqe) {
                        Object obj4;
                        synchronized (obj3) {
                            obj4 = diu.ee;
                            if (obj4 instanceof baqe) {
                                obj4 = new uwm();
                                diu.ee = bapx.a(diu.ee, obj4);
                            }
                        }
                        obj3 = obj4;
                    }
                    jba jba = new jba(a, f, s, d, g, cd, aldn, bapu, jac2, jbn2, ztq, mP, (uwm) obj3);
                    this.R = bapx.a(this.R, jba);
                }
            }
        } else {
            obj = obj2;
        }
        return (alcs) obj;
    }

    private final jbk q() {
        Object obj = this.U;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.U;
                if (obj2 instanceof baqe) {
                    obj2 = new jbk((SettingsActivity) baqd.a((SettingsActivity) uhj.a(this.a), "Cannot return null from a non-@Nullable @Provides method"), this.w.hA());
                    this.U = bapx.a(this.U, obj2);
                }
            }
            obj = obj2;
        }
        return (jbk) obj;
    }

    public final void a(Shell$HomeActivity shell$HomeActivity) {
        shell$HomeActivity.a = this.w.nc();
        shell$HomeActivity.b = this.w.oL();
        shell$HomeActivity.c = this.w.oF();
        shell$HomeActivity.d = this.w.hj();
        shell$HomeActivity.e = this.w.hh();
        shell$HomeActivity.f = m();
        shell$HomeActivity.g = this.w.ne();
        shell$HomeActivity.h = this.w.H();
        shell$HomeActivity.i = this.w.is();
        shell$HomeActivity.j = this.w.i();
        shell$HomeActivity.k = this.w.kS();
    }

    public final void a(Shell$LiveCreationActivity shell$LiveCreationActivity) {
        shell$LiveCreationActivity.a = this.w.nc();
        shell$LiveCreationActivity.b = this.w.oL();
        shell$LiveCreationActivity.c = this.w.oF();
        shell$LiveCreationActivity.d = this.w.hj();
        shell$LiveCreationActivity.e = this.w.hh();
        shell$LiveCreationActivity.f = m();
        shell$LiveCreationActivity.g = this.w.ne();
        this.w.ow();
        shell$LiveCreationActivity.h = new dnx();
    }

    public final void a(Shell$MediaSearchActivity shell$MediaSearchActivity) {
        shell$MediaSearchActivity.a = this.w.nc();
        shell$MediaSearchActivity.b = this.w.oL();
        shell$MediaSearchActivity.c = this.w.oF();
        shell$MediaSearchActivity.d = this.w.hj();
        shell$MediaSearchActivity.e = this.w.hh();
        shell$MediaSearchActivity.f = m();
        shell$MediaSearchActivity.g = this.w.ne();
        shell$MediaSearchActivity.h = this.w.kS();
    }

    public final void a(Shell$ResultsActivity shell$ResultsActivity) {
        shell$ResultsActivity.a = this.w.nc();
        shell$ResultsActivity.b = this.w.oL();
        shell$ResultsActivity.c = this.w.oF();
        shell$ResultsActivity.d = this.w.hj();
        shell$ResultsActivity.e = this.w.hh();
        shell$ResultsActivity.f = m();
        shell$ResultsActivity.g = this.w.ne();
        shell$ResultsActivity.h = this.w.kS();
    }

    public final void a(Shell$SettingsActivity shell$SettingsActivity) {
        shell$SettingsActivity.a = this.w.nc();
        shell$SettingsActivity.b = this.w.oL();
        shell$SettingsActivity.c = this.w.oF();
        shell$SettingsActivity.d = this.w.hj();
        shell$SettingsActivity.e = this.w.hh();
        shell$SettingsActivity.f = m();
        shell$SettingsActivity.g = this.w.ne();
        this.w.ow();
        shell$SettingsActivity.h = new jbu();
    }

    public final void a(Shell$UploadActivity shell$UploadActivity) {
        shell$UploadActivity.a = this.w.nc();
        shell$UploadActivity.b = this.w.oL();
        shell$UploadActivity.c = this.w.oF();
        shell$UploadActivity.d = this.w.hj();
        shell$UploadActivity.e = this.w.hh();
        shell$UploadActivity.f = m();
        shell$UploadActivity.g = this.w.ne();
    }

    public final void a(Shell$UrlActivity shell$UrlActivity) {
        shell$UrlActivity.a = this.w.nc();
        shell$UrlActivity.b = this.w.oL();
        shell$UrlActivity.c = this.w.oF();
        shell$UrlActivity.d = this.w.hj();
        shell$UrlActivity.e = this.w.hh();
        shell$UrlActivity.f = m();
        shell$UrlActivity.g = this.w.ne();
        shell$UrlActivity.h = this.w.bT();
        shell$UrlActivity.i = this.w.nV();
        shell$UrlActivity.j = this.w.oC();
        shell$UrlActivity.k = this.w.kS();
    }

    public final void a(StorageBarPreference storageBarPreference) {
        storageBarPreference.a = this.w.k();
        storageBarPreference.b = this.w.dr();
        storageBarPreference.c = this.w.cO();
        storageBarPreference.d = this.w.cS();
    }

    public final void a(WatchBreakFrequencyPickerPreference watchBreakFrequencyPickerPreference) {
        watchBreakFrequencyPickerPreference.c = this.w.ea();
    }

    public final void a(LiveChatFragment liveChatFragment) {
        liveChatFragment.a = p();
    }

    public final void a(uut uut) {
        bcaa h = h();
        bcaa bcaa = this.S;
        if (bcaa == null) {
            bcaa = new diz(this, 16);
            this.S = bcaa;
        }
        bcaa bcaa2 = bcaa;
        bcaa K = this.w.K();
        bcaa h2 = h();
        bcaa = this.T;
        if (bcaa == null) {
            bcaa = new diz(this, 17);
            this.T = bcaa;
        }
        uut.c = new uvm(h, bcaa2, K, h2, bcaa, i(), this.w.ca());
        uut.d = new uur(h(), this.w.nD(), i());
        uut.e = new uvd(h());
        uut.f = this.w.mP();
        uut.g = e();
    }

    public final void inject(GeneralPrefsFragment generalPrefsFragment) {
        generalPrefsFragment.a = this.w.i();
        generalPrefsFragment.b = this.w.ox();
        generalPrefsFragment.c = f();
        generalPrefsFragment.d = this.w.c();
        generalPrefsFragment.e = this.w.n();
        generalPrefsFragment.f = this.w.aH();
        generalPrefsFragment.g = q();
        generalPrefsFragment.h = this.w.mc();
        generalPrefsFragment.i = e();
        diu diu = this.w;
        Object obj = diu.ef;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = diu.ef;
                if (obj2 instanceof baqe) {
                    obj2 = htl.a();
                    diu.ef = bapx.a(diu.ef, obj2);
                }
            }
            obj = obj2;
        }
        generalPrefsFragment.j = (amqp) obj;
    }

    public final void inject(DogfoodPrefsFragment dogfoodPrefsFragment) {
        dogfoodPrefsFragment.a = this.w.oA();
        dogfoodPrefsFragment.b = this.w.hR();
        dogfoodPrefsFragment.c = this.w.oF();
        dogfoodPrefsFragment.d = this.w.mY();
        dogfoodPrefsFragment.e = this.w.ox();
        dogfoodPrefsFragment.f = f();
        dogfoodPrefsFragment.g = this.w.el();
        dogfoodPrefsFragment.h = ehj.a();
        dogfoodPrefsFragment.i = this.w.aO();
    }

    public final void inject(DeveloperPrefsFragment developerPrefsFragment) {
        developerPrefsFragment.a = this.w.ox();
        developerPrefsFragment.b = bapx.b(this.w.z());
        developerPrefsFragment.c = this.w.oA();
        developerPrefsFragment.d = this.w.aZ();
        developerPrefsFragment.e = this.w.mC();
        developerPrefsFragment.f = this.w.hD();
        developerPrefsFragment.g = this.w.oF();
        developerPrefsFragment.h = this.w.ia();
        developerPrefsFragment.i = this.w.k();
        developerPrefsFragment.j = this.w.dr();
        developerPrefsFragment.k = this.w.kY();
        developerPrefsFragment.l = egi.a();
        developerPrefsFragment.m = this.w.fn();
        developerPrefsFragment.n = euj.a();
        developerPrefsFragment.o = this.w.bg();
    }

    public final void inject(OfflinePrefsFragment offlinePrefsFragment) {
        offlinePrefsFragment.a = this.w.dz();
        offlinePrefsFragment.b = bapx.b(this.w.of());
        offlinePrefsFragment.c = this.w.eF();
        offlinePrefsFragment.d = this.w.jv();
        offlinePrefsFragment.e = this.w.cO();
        offlinePrefsFragment.f = q();
        offlinePrefsFragment.g = this.w.oF();
        offlinePrefsFragment.h = new ablj(this.w.ad(), this.w.aV(), this.w.aG(), this.w.k(), this.w.aI());
        offlinePrefsFragment.i = this.w.c();
        offlinePrefsFragment.j = this.w.ox();
        offlinePrefsFragment.k = this.w.hV();
    }

    public final void inject(AboutPrefsFragment aboutPrefsFragment) {
        aboutPrefsFragment.a = this.w.mQ();
        aboutPrefsFragment.b = p();
        aboutPrefsFragment.c = a();
        aboutPrefsFragment.d = this.w.jv();
    }

    public final void inject(NotificationPrefsFragment notificationPrefsFragment) {
        notificationPrefsFragment.a = e();
        notificationPrefsFragment.b = p();
        notificationPrefsFragment.c = this.w.oC();
    }

    public final void inject(PrivacyPrefsFragment privacyPrefsFragment) {
        privacyPrefsFragment.a = p();
    }

    public final void inject(BillingsAndPaymentsPrefsFragment billingsAndPaymentsPrefsFragment) {
        billingsAndPaymentsPrefsFragment.a = p();
    }

    public final void inject(AutoplayPrefsFragment autoplayPrefsFragment) {
        autoplayPrefsFragment.a = this.w.ox();
        autoplayPrefsFragment.b = this.w.dZ();
        autoplayPrefsFragment.c = e();
        autoplayPrefsFragment.d = p();
        autoplayPrefsFragment.e = this.w.n();
    }

    public final void inject(ThirdPartyPrefsFragment thirdPartyPrefsFragment) {
        thirdPartyPrefsFragment.a = p();
    }

    public final void a(SettingsActivity settingsActivity) {
        settingsActivity.a = this.w.oC();
        settingsActivity.b = this.w.i();
        Object obj = this.W;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.W;
                if (obj2 instanceof baqe) {
                    bcaa bcaa = this.V;
                    if (bcaa == null) {
                        bcaa = new diz(this, 18);
                        this.V = bcaa;
                    }
                    obj2 = new exu(bcaa);
                    this.W = bapx.a(this.W, obj2);
                }
            }
            obj = obj2;
        }
        settingsActivity.c = (exu) obj;
        settingsActivity.d = this.w.eP();
        settingsActivity.e = this.w.hD();
        settingsActivity.f = this.w.of();
        settingsActivity.g = q();
        settingsActivity.h = this.w.pg();
        settingsActivity.i = this.w.n();
        this.w.c();
        settingsActivity.j = this.w.oA();
        settingsActivity.k = this.w.oB();
        settingsActivity.l = this.w.hR();
        settingsActivity.m = this.w.oF();
        settingsActivity.n = p();
        settingsActivity.o = this.w.mY();
        settingsActivity.p = this.w.ox();
        settingsActivity.q = this.w.k();
        settingsActivity.r = this.w.kS();
        settingsActivity.s = b();
        settingsActivity.t = g();
        settingsActivity.v = n();
    }
}
