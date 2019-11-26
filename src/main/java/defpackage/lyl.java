package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.support.constraint.ConstraintLayout;
import android.support.design.appbar.AppBarLayout;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.app.application.Shell$HomeActivity;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;
import com.google.android.apps.youtube.app.common.ui.navigationbar.NavigationBarDividerLayout;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.apps.youtube.app.ui.PivotTabsBar;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lyl */
public class lyl extends mkn implements dvd, dvf, eya, ezt, fbq, fos, fqt, jlh, lcn, xcp, xfc {
    public static final AtomicBoolean l = new AtomicBoolean();
    public vod A;
    public alss B;
    public alse C;
    public akve D;
    public jle E;
    public exz F;
    public jli G;
    public jpa H;
    public ffg I;
    public jov J;
    public fab K;
    public aeag L;
    public aean M;
    public adfy N;
    public aaas O;
    public bcaa P;
    public bcaa Q;
    public ejp R;
    public bapu S;
    public bapu T;
    public boolean U;
    public boolean V;
    public AppTabsBar W;
    public ConstraintLayout X;
    public LinearLayout Y;
    public bapu Z;
    public bcaa aA;
    public jlv aB;
    public ScheduledExecutorService aC;
    public acya aD;
    public dux aE;
    public jfm aF;
    public bcaa aG;
    public ewr aH;
    public edz aI;
    public jjp aJ;
    public zyw aK;
    public zzl aL;
    public bapu aM;
    public mjv aN;
    public bapu aO;
    public lyx aP;
    public mjr aQ;
    public mjw aR;
    public mkj aS;
    public mjy aT;
    public mjs aU;
    public mkk aV;
    public mjx aW;
    public mjo aX;
    public kye aY;
    public mke aZ;
    public bcaa aa;
    public fbp ab;
    public bcaa ac;
    public bcaa ad;
    public alck ae;
    public bcaa af;
    public amav ag;
    public bcaa ah;
    public wda ai;
    public bcaa aj;
    public bcaa ak;
    public fni al;
    public lci am;
    public bcaa an;
    public lwc ao;
    public ebk ap;
    public bcaa aq;
    public adel ar;
    public jfr as;
    public aink at;
    public mle au;
    public bcaa av;
    public jid aw;
    public amqp ax;
    public jnu ay;
    public fnw az;
    private lca bA;
    private int bB;
    private boolean bC;
    public jjn ba;
    public xol bb;
    public jma bc;
    public ske bd;
    public lwy be;
    public adpu bf;
    public Set bg;
    public dsy bh;
    public boolean bi;
    private lyv bu;
    private final aeak bv = new lyk(this);
    private boolean bw;
    private ViewGroup bx;
    private ViewGroup by;
    private final amro bz = amrn.a(new lyn(this));
    public exu m;
    public xci n;
    public SharedPreferences o;
    public String p;
    public bcaa q;
    public xhv r;
    public xsc s;
    public zzf t;
    public Executor u;
    public for v;
    public emd w;
    public xcx x;
    public alek y;
    public vmn z;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        lyx lxb;
        apxn a;
        aulu aulu;
        ConstraintLayout constraintLayout;
        AppTabsBar appTabsBar;
        jpz jpz;
        Object obj;
        Bundle bundle2 = bundle;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h().d(9);
        if (bundle2 == null) {
            lxb = new lxb(null, null, null, null, null, null);
        } else {
            String str = "is_in_offline_mode";
            lyx lxb2 = new lxb(bundle2.containsKey(str) ? Boolean.valueOf(bundle2.getBoolean(str)) : null, bundle2.getBundle("info-cards"), bundle2.getBundle("pane_nav_controller"), bundle2.getBundle("back_handler"), bundle2.getBundle("swipe_to_camera_bundle"), bundle2.getBundle("auto_dark_theme_bundle"));
        }
        this.aP = lxb;
        this.bC = jrb.a(((wwz) getApplication()).i().ox());
        int a2 = fmv.a(((wwz) getApplication()).i().ox());
        this.bB = a2;
        if (a2 != 2) {
            setTheme(R.style.f528Theme.YouTube.Home);
        } else {
            setTheme(R.style.f521Theme.YouTube.Dark.Home);
        }
        super.onCreate(bundle);
        this.bh.a(getWindow());
        edz edz = this.aI;
        if (bundle2 == null) {
            edz.a.d(new efu(elapsedRealtime));
        } else {
            edz.a();
        }
        this.bA = new lca(getApplicationContext());
        x().a();
        this.U = true;
        exv exv = this.aS;
        exv.j = bundle2 != null ? bundle2.getInt("recreate_signed_in_state", 0) : 0;
        exv.g.a((uyo) exv);
        exv.h.a(exv);
        setContentView((int) R.layout.watch_while_activity_with_slim_status_bar);
        this.bx = (ViewGroup) findViewById(16908290);
        this.bb.a(this.bx, 7);
        ViewStub viewStub = (ViewStub) this.bx.findViewById(R.id.watch_ui_layout_stub);
        viewStub.setLayoutResource(this.ao.d());
        View inflate = viewStub.inflate();
        amqw.a((Object) this);
        View findViewById = findViewById(R.id.accessibility_layer_container);
        if (findViewById != null && (findViewById instanceof AccessibilityLayerLayout)) {
            findViewById = (AccessibilityLayerLayout) findViewById;
            if (inflate != null && xpr.a(findViewById, inflate)) {
                findViewById.b = inflate.getId();
                findViewById.d = inflate;
                findViewById.a(true);
            } else {
                findViewById.a(false);
            }
        }
        getWindow().setBackgroundDrawable(null);
        eib eib = this.aN;
        if (!eib.h) {
            eib.h = true;
            eib.e.b = (NavigationBarDividerLayout) eib.a.findViewById(R.id.navigation_bar_divider_frame);
            if (fjn.a) {
                eib.b.a((fjk) eib);
                eib.b.a((fjm) eib);
                eib.c.a(eib);
                ((lum) eib.d.get()).a(eib);
            }
            eib.f.a(((kye) eib.g.get()).f.a(new mju(eib)));
        }
        eib.a();
        jjn jjn = this.ba;
        ViewGroup viewGroup = this.bx;
        eif eif = this.aT.w;
        kye kye = this.aY;
        jjn.c = viewGroup;
        jjn.d = kye;
        jjn.e = eif;
        this.ae.b(findViewById(16908290));
        setDefaultKeyMode(0);
        mjo mjo = this.aX;
        mjo.b = mjo.a.getWindow().getAttributes().softInputMode;
        mjo.c = true;
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar_layout);
        AppTabsBar appTabsBar2 = this.W;
        ConstraintLayout constraintLayout2 = this.X;
        amqw.a((Object) appBarLayout);
        if (foh.J(this.aK) && this.bC) {
            int i;
            jqa jqa;
            LinearLayout linearLayout;
            jqp jqp;
            amqw.a(this.Y);
            LinearLayout linearLayout2 = this.Y;
            a = this.aK.a();
            if (a == null || (a.a & 16) == 0) {
                i = 0;
            } else {
                aulu = a.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                i = aulu.aJ;
            }
            jqa jqa2 = new jqa(i);
            a = this.aK.a();
            if (a != null) {
                aulu = a.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                if (aulu.aI) {
                    jqa = jqa2;
                    linearLayout = linearLayout2;
                    constraintLayout = constraintLayout2;
                    appTabsBar = appTabsBar2;
                    jqp = new jqp(this, this.ae, this.Y, this.s, this.o);
                    jpz = new jpz(this, linearLayout, appBarLayout, jqa, jqp);
                }
            }
            jqa = jqa2;
            linearLayout = linearLayout2;
            constraintLayout = constraintLayout2;
            appTabsBar = appTabsBar2;
            jqp = null;
            jpz = new jpz(this, linearLayout, appBarLayout, jqa, jqp);
        } else {
            constraintLayout = constraintLayout2;
            appTabsBar = appTabsBar2;
            jpz = null;
        }
        jov jov = r0;
        jov jov2 = new jov(this, appTabsBar, constraintLayout, jpz, appBarLayout, p(), this.H, this.af, this.aK);
        this.J = jov;
        jtr jtr = new jtr(this.ao, this.m, this.J);
        this.by = (ViewGroup) findViewById(R.id.pane_fragment_container);
        exw exw = this.aR;
        fjm fjm = this.H;
        exw.f = this.J;
        exw.g = fjm;
        exw.b.a(fjm);
        exw.b.a((fjj) exw);
        exw.b.a((fjm) exw);
        exw.b.a((fjk) exw);
        exw.b.a(exw.c);
        exw.b.a((fjf) exw);
        exw.b.a(new mjz(exw));
        exw.b.a(exw.a.getClassLoader());
        exw.d.a(exw);
        exw.h = exw.a.findViewById(R.id.navigation_bar_divider_frame);
        this.ab.a((BottomUiContainer) findViewById(R.id.bottom_ui_container));
        this.ab.e.a = this;
        exz exz = this.F;
        exz.b = (View) amqw.a(findViewById(R.id.bottom_bar_container));
        exz.b.addOnLayoutChangeListener(new eyc(exz));
        this.F.a(this);
        fpl.a((Activity) this, true);
        this.E.a(this);
        PivotTabsBar pivotTabsBar = (PivotTabsBar) findViewById(R.id.pivot_bar);
        pivotTabsBar.n = this.G;
        this.E.a(pivotTabsBar);
        kye kye2 = this.aY;
        kye2.i = (SwipeToContainerFrameLayout) kye2.a.findViewById(16908290).findViewById(R.id.slim_status_bar_player_container);
        kye2.g.a();
        kye2.a();
        if (kye2.i.h) {
            kye2.n = (gcl) kye2.b.a("creation_fragment");
            gcl gcl = kye2.n;
            if (gcl != null) {
                gcl.ak = kye2;
                kye2.o = kye2.h.a();
            }
        }
        xpe xpe = this.aT;
        ViewGroup viewGroup2 = this.bx;
        Object obj2 = this.by;
        jov jov3 = this.J;
        jle jle = this.E;
        exz exz2 = this.F;
        xpe.S = viewGroup2;
        xpe.N.a(xpe);
        xpe.T = (InlinePlayerLayout) xpe.a.findViewById(R.id.inline_player_container);
        xpw xpw = xpe.T.a;
        amqw.a(obj2);
        View b = xpw.b();
        xpw.a();
        xpw.a = obj2;
        if (b != null) {
            xpw.a(b);
        }
        xpe.h.a(jov3, jle, viewGroup2, xpe.i);
        exz2.a(xpe.h);
        xpe.h.n().a(new mkd(xpe));
        hva hva = xpe.t;
        obj2 = xpe.h.o();
        Object obj3 = xpe.T;
        View findViewById2 = xpe.a.findViewById(R.id.player_fragment_container);
        YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = xpe.u;
        hva.d = new elr[2];
        hva.a = 0;
        hva.b = findViewById2;
        hva.c = youTubePlayerOverlaysLayout;
        hva.d[0] = (elr) amqw.a(obj2);
        hva.d[1] = (elr) amqw.a(obj3);
        hva.d[hva.a].a(findViewById2, youTubePlayerOverlaysLayout);
        huf huf = xpe.v;
        obj2 = xpe.I;
        amqw.a(obj2);
        amqw.b(huf.a == null);
        huf.a = obj2;
        xpe.w.a(xpe);
        xpe.w.a(xpe.t);
        xpe.w.a(xpe.T);
        xpe.w.a(xpe.z);
        xpe.w.a(xpe.L);
        hsr hsr = xpe.j;
        if (hsr instanceof hiz) {
            xpe.w.a((hiz) hsr);
        }
        xpe.x.a(xpe.D);
        xpe.i();
        if (aipo.a(xpe.l, 16)) {
            xpe.P.a(xpe.E.a(xpe.M));
        } else {
            xpe.x.a(xpe.E);
        }
        if (foh.I(xpe.l)) {
            fhk fhk = xpe.d;
            View view = xpe.S;
            if (!fhk.c) {
                fhk.c = true;
                fhk.d = view;
            }
        } else {
            jtw jtw = xpe.e;
            obj2 = xpe.S;
            if (!jtw.a) {
                jtw.a = true;
                jtw.b = (View) amqw.a(obj2);
            }
        }
        xpe.W = (jvf) xpe.A.get();
        exw exw2 = xpe.B;
        exw2.c.a(exw2);
        exw2.b.a((exv) exw2);
        exw2.b.a(exw2);
        exw2.e = exw2.a.getResources().getConfiguration().orientation == 1;
        adqi adqi = (hfh) xpe.H.get();
        adqi.a.a(adqi);
        for (ekk ekk : xpe.K) {
            if (!ekk.t) {
                if (ekk.s.b) {
                    ekk.A_();
                }
                ekk.s.a(ekk);
                ekk.t = true;
            }
        }
        mjx mjx = this.aW;
        if (mjx.e instanceof hiz) {
            mjx.j = (ViewGroup) mjx.a.findViewById(R.id.bottom_bar_container);
            mjx.k = (ViewGroup) mjx.a.findViewById(R.id.slim_status_bar_player_container);
            hiz hiz = (hiz) mjx.e;
            Object obj4 = mjx.j;
            obj = mjx.k;
            if (!(hiz.c == null && hiz.d == null)) {
                hiz.e = null;
                hiz.f = null;
            }
            hiz.c = (ViewGroup) amqw.a(obj4);
            hiz.d = (ViewGroup) amqw.a(obj);
            hiz.e = hiz.b(false);
            hiz.f = hiz.b(true);
            hja hja = hiz.b;
            SlimStatusBar slimStatusBar = hiz.e;
            SlimStatusBar slimStatusBar2 = hiz.f;
            boolean c = hiz.a.c();
            hja.d = obj4;
            hja.g = slimStatusBar2;
            hja.f = slimStatusBar;
            hja.e = obj;
            hja.x = hja.b(true);
            hja.y = hja.b(false);
            if (c) {
                hja.j = 0;
            } else {
                hja.j = 2;
            }
            hja.m = hja.a(hja.d, hja.f, false, false);
            hja.l = hja.a(hja.d, hja.f, true, false);
            hja.n = hja.a(hja.d, hja.f);
            hja.o = hja.c(false);
            hja.q = hja.a(hja.e, hja.g, false, false);
            hja.p = hja.a(hja.e, hja.g, true, false);
            hja.r = hja.a(hja.e, hja.g);
            hja.s = hja.c(true);
            hja.t = hja.a(hja.d, hja.f, true, true);
            hja.u = hja.a(hja.e, hja.g, true, true);
            hja.v = hja.d(false);
            hja.w = hja.d(true);
        }
        obj = (FloatingActionButton) findViewById(R.id.fab);
        ffg ffg = this.I;
        View findViewById3 = findViewById(R.id.accessibility_layer_container);
        if (!ffg.k) {
            ffg.k = true;
            amqw.b(xpr.a(findViewById3, (View) obj));
            ffg.a = new ffc(ffg.d, obj, ffg);
            ffg.b = new ffm(obj, findViewById3, ffg);
            ffg.c = (FloatingActionButton) amqw.a(obj);
            ffg.c.setOnClickListener(ffg);
            ffg.g = true;
            ffg.j = new ffl();
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f});
            ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(ffg.c, new PropertyValuesHolder[]{ofFloat, ofFloat2}).setDuration(150);
            duration.addListener(new ffj(ffg));
            ffg.h = duration;
            ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.0f});
            PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.0f});
            duration = ObjectAnimator.ofPropertyValuesHolder(ffg.c, new PropertyValuesHolder[]{ofFloat, ofFloat3}).setDuration(150);
            duration.addListener(new ffi(ffg));
            ffg.i = duration;
            ffg.d();
        }
        jlv jlv = this.aB;
        jlv.a.addObserver(jlv.f);
        for forR = this.v;
        Object lym = new lym(this);
        amqw.a(lym);
        if (forR.b != null) {
            fou fou = new fou(lym, forR.c);
            forR.b.setNdefPushMessageCallback(fou, forR.a, new Activity[0]);
            forR.b.setOnNdefPushCompleteCallback(fou, forR.a, new Activity[0]);
        }
        wqt wqt = this.aV;
        wqt.a.a(wqt);
        this.ai.f = new lyr(this);
        this.aC.execute(new lyt(this));
        akkr akkr = this.aw;
        akkr.a.a(akkr);
        this.aC.execute(new lyq(this));
        a = this.aK.a();
        if (!(a == null || (a.a & 16) == 0)) {
            aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.S) {
                this.m.a(this.aH);
            }
        }
        this.m.a(this.ao);
        this.m.a();
        ((lcq) this.S.get()).a();
        mle mle = this.au;
        if (foh.C(mle.a)) {
            mle.f = mle.b.a.a(new mld(mle));
            if (mle.b.a()) {
                if (mle.c.i) {
                    mko mko = (mko) mle.e.get();
                    if (mko.e) {
                        mko.e = false;
                        mko.a.d();
                        mko.a.b();
                        mko.b.b(mko);
                        mko.g.b();
                    }
                    if (((mko) mle.e.get()).f) {
                        ((mkq) mle.d.get()).d = true;
                    }
                }
                ((mkq) mle.d.get()).b(false);
            }
        }
        mke mke = this.aZ;
        xci xci = mke.d;
        obj = mke.e;
        obj.getClass();
        xci.a(obj, ahkm.class, new mkh(obj));
        mke = this.aZ;
        aaas aaas = this.O;
        if (mke.f && mke.g && mke.h) {
            etz etz = mke.b;
            String str2 = "";
            euc etv = new etv(etz.a.getString("restore_context_video_id", str2), etz.a.getString("restore_context_playlist_id", str2), etz.a.getInt("restore_context_playlist_index", 0), etz.a.getLong("restore_context_video_start_time", 0), etz.a.getLong("restore_context_crash_timestamp", -1), etz.a.getBoolean("restore_context_last_time_shown", false));
            if (etv.c || TextUtils.isEmpty(etv.a) || etv.b <= 0 || mke.c.b() - etv.b >= TimeUnit.SECONDS.toMillis(mke.i)) {
                mke.b.a(false);
            } else {
                long toSeconds = TimeUnit.MILLISECONDS.toSeconds(mke.c.b() - etv.b);
                fdd fdd = (fdd) ((fdd) mke.a.b()).b(getString(R.string.restore_video_crashed_message));
                fdd.a(getString(R.string.restore_video_resume_watching), new mkg(mke, etv, aaas, toSeconds));
                mke.a.b((fde) fdd.d());
                mke.a(toSeconds, etv.a, false);
                mke.b.a(true);
            }
        } else {
            mke.b.a(false);
        }
        f().a(new alvm());
        uyo uyo = this.bf;
        uyo.a.a(uyo);
        this.aj.get();
    }

    private final wzd x() {
        return ((dti) getApplication()).d().h();
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        wzd x = x();
        x.a();
        lyv y = y();
        x.a();
        y.a(this);
        x.a();
    }

    private final lyv y() {
        if (this.bu == null) {
            this.bu = ((lyu) xse.a(getApplication())).c(new dvk(this));
        }
        return this.bu;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mjy mjy = this.aT;
        mjy.I.a(mjy.a);
        this.aQ.a(getIntent(), bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        this.aI.a.d(new efy());
        wzd x = x();
        x.a();
        super.onStart();
        x.a();
        Intent a = this.aE.a(null, true);
        if (a != null) {
            ((aizy) this.aj.get()).w();
            startActivity(a);
            int intExtra = a.getIntExtra("upgrade_enforcement_type", 0);
            if (intExtra == 3 || intExtra == 2) {
                finish();
                return;
            }
        }
        ffr.a();
        Object obj = this.L;
        Object obj2 = this.bv;
        aean aean = this.M;
        xak.a();
        amqw.a(obj2);
        aeal aeal = obj.e;
        if (!(aeal == null || !aeal.g || obj.c.c() == null)) {
            obj.d = obj.e;
            obj.e = null;
        }
        obj.j = obj2;
        obj.h = aean;
        obj.a.a(obj.f, false);
        obj.c.a((adqi) obj);
        obj.k = true;
        obj.b.a(obj);
        this.x.a();
        mjy mjy = this.aT;
        ((elf) mjy.I.get()).j().a(mjy.N);
        ((elf) mjy.I.get()).k().a(mjy.N);
        if (this.t.r()) {
            z();
            A();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        this.aI.a.d(new efv());
        super.onResume();
        dsy dsy = this.bh;
        Window window = getWindow();
        if (dsy.a || dsy.b) {
            window.setSustainedPerformanceMode(true);
        }
        if (!this.t.r()) {
            z();
        }
        this.A.a = null;
        this.aT.R = false;
        if (zta.b() && !zta.a()) {
            ((zta) this.aO.get()).c();
        }
        dsy = this.bh;
        Window window2 = getWindow();
        if ((dsy.a || dsy.b) && !dsy.b) {
            window2.setSustainedPerformanceMode(false);
        }
    }

    private final void z() {
        long j;
        jma jma = this.bc;
        if (!jma.e) {
            apxn a = jma.d.a();
            if (a != null) {
                aulu aulu = a.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                if (aulu.aG && VERSION.SDK_INT >= 21) {
                    jma.f = (PowerManager) jma.a.getSystemService("power");
                    jma.a.registerReceiver(jma, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
                    jma.e = true;
                }
            }
        }
        fde fde = jma.g;
        if (fde != null && jma.a()) {
            jma.b.a((albf) fde);
        }
        jma.g = null;
        if (this.bB != fmv.a(this.o) || (foh.J(this.aK) && this.bC != jrb.a(this.o))) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new lyp(this));
        }
        wzd x = x();
        x.a();
        mjy mjy = this.aT;
        if (xy.a()) {
            mjy.c(mjy.a.bi);
        }
        if (aipo.a(mjy.l, 1073741824)) {
            mjy.O.a(mjy.r.a(mjy.M));
        } else {
            mjy.x.a(mjy.r);
        }
        mjy.x.a(mjy.h);
        mjy.x.a(mjy.C);
        if (mjy.W != null) {
            if (foh.x(mjy.l)) {
                mjy.O.a(mjy.W.a(mjy.M));
            } else {
                mjy.x.a(mjy.W);
            }
        }
        mjy.x.a(mjy.z);
        ((dwo) mjy.J.get()).a();
        vmn vmn = this.z;
        vmn.b.a(this.u);
        r();
        lca lca = this.bA;
        if (lca.a() && !lca.c) {
            lca.c = true;
            lca.b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addDataScheme("package");
            lca.b.registerReceiver(lca.a, intentFilter);
        }
        mjx mjx = this.aW;
        if (foh.r(mjx.g)) {
            hkf hkf = mjx.h;
            if (hkf.b.b()) {
                hkf.d = anic.a(anjf.a(new hke(hkf), hkf.a), hkh.a, hkf.a);
                xan.a(hkf.d, hkf.a, hkg.a, new hkj(hkf));
            }
            mjx.b.a(mjx.h);
        }
        mjx.b.a(mjx.f.get());
        xpa xpa = mjx.d;
        if (xpa instanceof jfs) {
            ((jfs) xpa).a = (hsr) amqw.a(mjx.e);
            mjx.b.a(mjx.d);
        }
        mjx.e.a(true);
        hqa hqa = mjx.i;
        if (foh.M(hqa.b) && !hqa.b(hqa.a)) {
            hqa.c.a();
        }
        apxn a2 = hqa.b.a();
        if (a2 == null) {
            j = 0;
        } else {
            avnm avnm = a2.l;
            if (avnm == null) {
                avnm = avnm.q;
            }
            j = avnm.n;
        }
        hqa.a(j);
        this.n.a((Object) this, lyl.class);
        this.n.a(this.aV);
        this.n.a(this.aS);
        this.n.a(this.aa.get());
        this.n.a(this.ah.get());
        this.n.a(this.ac.get());
        this.n.a(this.ad.get());
        this.n.a(this.E);
        this.n.a(this.aF);
        this.n.a(this.ar);
        this.n.a(this.aq.get());
        this.n.a(this.be);
        amav amav = this.ag;
        amav.b.execute(new amba(amav));
        adqi adqi = this.ar;
        adqi.a.a(adqi);
        fni fni = this.al;
        fni.a.a(fni.c);
        this.al.b = this.am;
        this.u.execute(new lys(this));
        aizy aizy = (aizy) this.aj.get();
        if (aizy.k() != null) {
            jfr jfr = this.as;
            if (!aizy.y() && jfr.c.p.b()) {
                albi albi = jfr.b;
                albi.b(albi.b().b(jfr.a.getString(R.string.error_audio_cast_background)).c(false).d());
            }
        }
        if (this.C.a()) {
            this.B.c();
        }
        ((afxq) this.aA.get()).a(this.r.c(), this.s);
        if (((amqp) this.bz.get()).a()) {
            ((eiz) ((amqp) this.bz.get()).b()).a();
        }
        Object obj = this.ay;
        if (foh.w(obj.d)) {
            obj.e.a(obj.a(obj.c));
        } else {
            obj.a.a(obj);
        }
        this.az.a();
        x.a();
        if (isr.a(this.aK)) {
            String str = "searchbox_hint_rotation_state";
            this.o.edit().putInt(str, (this.o.getInt(str, 0) + 1) % 3).apply();
        }
        if (this.aQ.e) {
            onSearchRequested();
            this.aQ.a();
        }
        Object obj2 = this.at;
        if (aink.a(obj2.a)) {
            obj2.b.a();
            obj2.b.a(obj2.a(obj2.d));
        } else {
            obj2.c.a(obj2);
        }
        ((actf) this.T.get()).b();
        ske ske = this.bd;
        getApplicationContext();
        ske.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPostResume() {
        this.n.d(new eft());
        super.onPostResume();
        this.n.d(new efw());
    }

    public final void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        this.bi = z;
        this.aT.c(z);
    }

    public final boolean isInMultiWindowMode() {
        return this.bi;
    }

    public final boolean isInPictureInPictureMode() {
        return this.aT.a();
    }

    public final boolean u() {
        return super.isInPictureInPictureMode();
    }

    /* Access modifiers changed, original: protected|final */
    public final void aY_() {
        super.aY_();
        if (!this.t.r()) {
            A();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab  */
    private final void A() {
        /*
        r10 = this;
        r0 = 0;
        r10.U = r0;
        r1 = r10.aR;
        r1 = r1.h();
        r2 = 1;
        if (r1 != 0) goto L_0x0028;
    L_0x000c:
        r1 = r10.ap;
        r1 = r1.a;
        if (r1 != 0) goto L_0x0028;
    L_0x0012:
        r1 = r10.aR;
        r3 = defpackage.fiw.b();
        r4 = "network_connectivity_requirement";
        r3.putInt(r4, r2);
        r4 = new fiw;
        r5 = defpackage.fil.class;
        r4.<init>(r5, r3);
        r3 = 2;
        r1.a(r4, r3);
    L_0x0028:
        r1 = r10.x();
        r1.a();
        r3 = r10.aS;
        r4 = r3.e;
        r4 = r4.c();
        r4 = r4.a();
        r5 = r3.k;
        if (r5 == 0) goto L_0x0048;
    L_0x003f:
        r5 = r5.equals(r4);
        if (r5 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0048;
    L_0x0046:
        r5 = 1;
        goto L_0x0049;
    L_0x0048:
        r5 = 0;
    L_0x0049:
        r3.k = r4;
        r4 = 0;
        r5 = r3.a(r5, r4);
        if (r5 != 0) goto L_0x00c8;
    L_0x0052:
        r5 = r3.f;
        r6 = r5.a;
        r6 = r6.a();
        if (r6 != 0) goto L_0x00b8;
    L_0x005c:
        r6 = r5.a;
        r7 = r6 instanceof defpackage.usq;
        if (r7 == 0) goto L_0x00b8;
    L_0x0062:
        r6 = (defpackage.usq) r6;
        r7 = r6.i();
        if (r7 == r2) goto L_0x006b;
    L_0x006a:
        goto L_0x00b8;
    L_0x006b:
        r7 = r6.i();
        if (r7 != r2) goto L_0x00a8;
    L_0x0071:
        r7 = r6.a;
        r8 = "user_account";
        r7 = r7.getString(r8, r4);
        if (r7 == 0) goto L_0x00a8;
    L_0x007b:
        r6 = r6.a;
        r8 = "user_identity";
        r6 = r6.getString(r8, r4);
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r8.append(r7);
        if (r6 == 0) goto L_0x0095;
    L_0x008d:
        r9 = ":";
        r8.append(r9);
        r8.append(r6);
    L_0x0095:
        r8 = r8.toString();
        r9 = "No +Page Delegate";
        r9 = r9.equals(r6);
        if (r9 == 0) goto L_0x00a3;
    L_0x00a1:
        r6 = "";
    L_0x00a3:
        r6 = defpackage.ust.a(r8, r7, r6, r4);
        goto L_0x00a9;
    L_0x00a8:
        r6 = r4;
    L_0x00a9:
        if (r6 == 0) goto L_0x00b8;
    L_0x00ab:
        r4 = r6.b();
        r7 = new utx;
        r7.<init>(r5, r6);
        r5.a(r6, r4, r7);
        goto L_0x00c8;
    L_0x00b8:
        r3.j = r0;
        r5 = r3.a;
        r5 = r5.J;
        r5.b();
        r5 = r3.d;
        r6 = r3.a;
        r5.a(r6, r4, r4);
    L_0x00c8:
        r4 = r3.f;
        r4 = r4.a();
        if (r4 == 0) goto L_0x00ec;
    L_0x00d0:
        r4 = r3.f;
        r5 = r4.a();
        if (r5 == 0) goto L_0x00ec;
    L_0x00d8:
        r5 = r4.a;
        r5 = r5.c();
        r5 = (defpackage.ust) r5;
        r6 = r5.b();
        r7 = new uua;
        r7.<init>(r4);
        r4.a(r5, r6, r7);
    L_0x00ec:
        r4 = r3.e;
        r4 = r4.g();
        if (r4 == 0) goto L_0x010c;
    L_0x00f4:
        r4 = r3.i;
        r4 = r4.b();
        if (r4 == 0) goto L_0x010c;
    L_0x00fc:
        r4 = r4.e;
        if (r4 != 0) goto L_0x0102;
    L_0x0100:
        r4 = defpackage.aume.af;
    L_0x0102:
        r4 = r4.v;
        if (r4 != 0) goto L_0x0107;
    L_0x0106:
        goto L_0x010c;
    L_0x0107:
        r3 = r3.g;
        r3.a();
    L_0x010c:
        r3 = r10.q;
        r3 = r3.get();
        r3 = (java.lang.String) r3;
        r4 = r10.p;
        r4 = defpackage.amqq.a(r4, r3);
        r10.p = r3;
        r2 = r2 ^ r4;
        if (r2 == 0) goto L_0x0124;
    L_0x011f:
        r2 = r10.aR;
        r2.f();
    L_0x0124:
        r2 = r10.J;
        r2.b();
        r2 = r10.m;
        r2.b();
        r1.a();
        r1 = r10.L;
        defpackage.xak.a();
        r1.c();
        r1 = r10.N;
        r2 = r10.f();
        r1.a = r2;
        r1 = r10.aT;
        r2 = r1.H;
        r2 = r2.get();
        r2 = (defpackage.hfh) r2;
        r2.c = r0;
        r2.b();
        r2.c();
        r0 = r1.V;
        if (r0 == 0) goto L_0x015a;
    L_0x0157:
        r1.a(r0);
    L_0x015a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyl.A():void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPause() {
        super.onPause();
        this.aI.a();
        if (!this.t.r()) {
            B();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        mjy mjy = this.aT;
        mjy.m.a(((elf) mjy.I.get()).j());
    }

    private final void B() {
        this.U = true;
        jma jma = this.bc;
        if (jma.e) {
            jma.a.unregisterReceiver(jma);
            jma.e = false;
        }
        mjy mjy = this.aT;
        mjy.O.a();
        if (!aipo.a(mjy.l, 1073741824)) {
            mjy.x.b(mjy.r);
        }
        mjy.x.b(mjy.h);
        mjy.x.b(mjy.C);
        if (!foh.x(mjy.l)) {
            mjy.x.b(mjy.W);
        }
        mjy.x.b(mjy.z);
        mjy.W.e.removeMessages(1);
        ((hfh) mjy.H.get()).c = true;
        mjx mjx = this.aW;
        mjx.b.b(mjx.f.get());
        xpa xpa = mjx.d;
        if (xpa instanceof jfs) {
            ((jfs) xpa).a = null;
            mjx.b.b(xpa);
        }
        if (foh.r(mjx.g)) {
            mjx.b.b(mjx.h);
        }
        this.n.b(this);
        this.n.b(this.aV);
        this.n.b(this.aS);
        this.n.b(this.aa.get());
        this.n.b(this.ah.get());
        this.n.b(this.ac.get());
        this.n.b(this.ad.get());
        this.n.b(this.E);
        this.n.b(this.aF);
        this.n.b(this.ar);
        this.n.b(this.aq.get());
        this.n.b(this.be);
        lca lca = this.bA;
        if (lca.a()) {
            if (lca.c) {
                lca.c = false;
                lca.b.unregisterReceiver(lca.a);
            }
            lca.c();
        }
        adqi adqi = this.ar;
        adqi.a.b(adqi);
        fni fni = this.al;
        fni.a.b(fni.c);
        this.aU.j = false;
        amav amav = this.ag;
        amav.b.execute(new amax(amav));
        C();
        if (this.C.a()) {
            this.B.b();
        }
        if (((amqp) this.bz.get()).a()) {
            ((eiz) ((amqp) this.bz.get()).b()).b();
        }
        jnu jnu = this.ay;
        jnu.e.a();
        if (!foh.w(jnu.d)) {
            jnu.a.b(jnu);
        }
        this.m.c();
        ejp ejp = this.R;
        if (ejp.b.getBoolean("com.google.android.libraries.youtube.notification.pref.notification_unread_count_seen", false)) {
            abdx abdx = (abdx) ejp.a.get();
            abdx.k.a(new abdt(abdx.c, abdx.d.c()), new ejs(ejp));
        }
        mkj mkj = this.aS;
        mkj.k = mkj.e.c().a();
        aink aink = this.at;
        aink.b.a();
        if (!aink.a(aink.a)) {
            aink.c.b(aink);
        }
        aink.a();
        ((actf) this.T.get()).a();
        this.bd.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        super.onStop();
        this.aT.N.a(1);
        this.aI.a();
        if (this.t.r()) {
            B();
        }
        this.x.b();
        adqi adqi = this.L;
        xak.a();
        adqi.b.b(adqi);
        adqi.a.a(adqi.f);
        adqi.c.b(adqi);
        aeal aeal = adqi.d;
        if (aeal != null && aeal.f) {
            adqi.e = aeal;
        }
        adqi.d = null;
        adqi.j = null;
        adqi.h = null;
        adqi.k = false;
        adqi.n = false;
        this.N.a = null;
        ffr.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDestroy() {
        super.onDestroy();
        this.bw = true;
        mjy mjy = this.aT;
        mjy.D.b();
        mjy.x.b(mjy.D);
        mjy.P.a();
        if (!aipo.a(mjy.l, 16)) {
            mjy.x.b(mjy.E);
        }
        mjy.N.e();
        adqi adqi = (hfh) mjy.H.get();
        adqi.a.b(adqi);
        mjy.j.f();
        this.aV.close();
        exv exv = this.aS;
        exv.g.b(exv);
        exv.h.b(exv);
        jlv jlv = this.aB;
        jlv.a.deleteObserver(jlv.f);
        fnw fnw = this.az;
        fnw.b.clear();
        if (fnw.c) {
            xrn.b(fnw.a, fnw);
            fnw.c = false;
        }
        this.m.d();
        jid jid = this.aw;
        jid.a.b(jid);
        ((lcq) this.S.get()).b();
        ((actf) this.T.get()).a();
        this.aW.e.f();
        mle mle = this.au;
        if (foh.C(mle.a)) {
            mle.f.b();
            if (mle.b.a()) {
                ((mkq) mle.d.get()).a();
                if (mle.c.i) {
                    Object obj = (mko) mle.e.get();
                    if (!obj.e) {
                        obj.e = true;
                        obj.f = false;
                        obj.a.a();
                        obj.b.a(obj);
                        obj.g = obj.a.a.a(new mkr(obj));
                        if (obj.d.c() && obj.c.c()) {
                            obj.a.c();
                        }
                    }
                }
            }
        }
        mke mke = this.aZ;
        mke.d.b(mke.e);
        adpu adpu = this.bf;
        adpu.a.b(adpu);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        aeag aeag = this.L;
        if (i == 1000) {
            if (i2 == -1) {
                int intExtra = intent.getIntExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyExitType", 2);
                if (intExtra == 0) {
                    aeag.l = 2;
                } else if (intExtra == 1) {
                    aeag.l = 3;
                } else if (intExtra == 2) {
                    aeag.l = 4;
                    aeag.m = intent.getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyError");
                    if (TextUtils.isEmpty(aeag.m)) {
                        aeag.m = aeag.g.getString(R.string.mdx_tv_signin_error_snackbar_message);
                    }
                }
            } else if (i2 == 0) {
                aeag.l = 1;
            } else {
                aeag.l = -1;
            }
            aeag.d = null;
            aeag.c();
        }
        zta.a(i);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        mjy mjy = this.aT;
        boolean z2 = mjy.Q != z;
        mjy.R = z2;
        mjy.Q = z;
        if (z2) {
            if (z) {
                mjy.l().h();
                mjy.p.a();
            } else {
                mjy.l().i();
            }
        }
        fkj fkj = mjy.m;
        fkp f;
        if (z) {
            f = fkj.f();
            f.k = false;
            if (!f.i) {
                f.i = true;
                f.a.registerReceiver(f.d, f.c);
                f.e.a(f.b.d.a(new fko(f)));
            }
            fkj.a.a(2);
            return;
        }
        if (fkj.b && !fkj.f().k) {
            fkj.a.w();
        }
        f = fkj.f();
        f.k = false;
        if (f.i) {
            f.i = false;
            f.a.unregisterReceiver(f.d);
            f.e.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        mjy mjy = this.aT;
        if (mjy.Q && !(xy.b() && mjy.Q && super.isInPictureInPictureMode())) {
            mjy.Q = false;
            mjy.R = true;
            mjy.l().i();
            mjy.R = false;
        }
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("has_handled_intent", this.aQ.g);
        bundle.putBoolean("is_in_offline_mode", this.aW.c.a);
        if (isChangingConfigurations()) {
            bundle.putInt("recreate_signed_in_state", this.aS.j);
        }
        Bundle bundle2 = new Bundle();
        zwj zwj = (zwj) this.ah.get();
        bundle2.putParcelable("info-card-collection", zwj.c);
        bundle2.putParcelable("shopping-info-card-collection", zwj.d);
        bundle2.putString("last-pinged-video-id", zwj.f);
        bundle2.putBoolean("info-cards-are-shown", zwj.g);
        bundle2.putInt("active-card-index", zwj.e);
        bundle.putBundle("info-cards", bundle2);
        mjw mjw = this.aR;
        Bundle bundle3 = new Bundle();
        mjw.b.a(bundle3);
        bundle.putBundle("pane_nav_controller", bundle3);
        mjs mjs = this.aU;
        bundle3 = new Bundle();
        mjs.h.a(bundle3);
        bundle.putBundle("back_handler", bundle3);
        kye kye = this.aY;
        bundle3 = new Bundle();
        apxu apxu = kye.k;
        if (apxu != null) {
            bundle3.putByteArray("on_swipe_left_endpoint", apxu.toByteArray());
        }
        bundle.putBundle("swipe_to_camera_bundle", bundle3);
        if (!fmv.b(this.bc.c)) {
            bundle2 = new Bundle();
            bundle2.putBoolean("auto_dark_theme_user_toggle", true);
            bundle.putBundle("auto_dark_theme_bundle", bundle2);
        }
        alvn.a(getClass().getSimpleName(), bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onNewIntent(Intent intent) {
        anjv a;
        super.onNewIntent(intent);
        mjr mjr = this.aQ;
        mjr.a.w();
        if (intent.hasExtra("background_failed_dismissible_dialog") || intent.hasExtra("background_failed_upsell_dialog")) {
            ((dwp) mjr.c.get()).d = true;
            a = anjf.a(Boolean.TRUE);
        } else {
            mjr.g = false;
            if ("com.google.android.youtube.action.open.search".equals(intent.getAction())) {
                if (mjr.a(intent)) {
                    mjr.e = true;
                } else {
                    mjr.a.onSearchRequested();
                }
                a = anjf.a(Boolean.TRUE);
            } else {
                a = mjr.a(intent, false);
            }
        }
        mjr.a(a);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mjy mjy = this.aT;
        boolean z = false;
        mjy.R = false;
        mjy.q.a(mjy.a);
        this.D.a(jtm.a(this, this.aL));
        this.J.b();
        jpa jpa = this.H;
        if (configuration.screenWidthDp < 320) {
            z = true;
        }
        if (jpa.r != z) {
            ezz ezz = jpa.k;
            if (ezz != null) {
                View b = ezz.b();
                if (b != null) {
                    ImageView imageView = (ImageView) b.findViewById(R.id.youtube_logo);
                    if (imageView != null) {
                        jpa.r = z;
                        jpa.a(imageView);
                    }
                }
            }
        }
        C();
        this.m.a(configuration);
        alek alek = this.y;
        alfs alfs = alek.b;
        if (alfs != null) {
            alfs.c(6);
            alek.b = alfs.a(alfs.a, alfs.b, alfs.d, alfs.g, alfs.c, alfs.h, alfs.e);
        }
        this.E.a(configuration);
    }

    private final void C() {
        for (eqf a : eqf.a.keySet()) {
            a.a();
        }
        ((jof) this.P.get()).b();
        ((jof) this.Q.get()).b();
        this.aJ.a();
    }

    public final boolean onSearchRequested() {
        this.K.e();
        return true;
    }

    public final void a(int i) {
        a(1, i);
    }

    public final void c(int i) {
        a(3, i);
    }

    private final void a(int i, int i2) {
        this.ao.c_(i, -i2);
        this.I.a(i, i2);
    }

    public final void a(boolean z, int i) {
        this.ao.a(z, i);
        jle jle = this.E;
        if (jle != null) {
            jle.a(z);
        }
    }

    public final void a_(int i) {
        if (!this.bw) {
            fbp fbp = this.ab;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) fbp.e.getLayoutParams();
            marginLayoutParams.bottomMargin = i;
            fbp.e.setLayoutParams(marginLayoutParams);
            this.I.a(0, i);
            this.ao.c_(0, -i);
            ViewGroup viewGroup = this.by;
            if (!(viewGroup == null || viewGroup.getPaddingBottom() == i)) {
                viewGroup = this.by;
                viewGroup.setPadding(viewGroup.getPaddingLeft(), this.by.getPaddingTop(), this.by.getPaddingRight(), i);
            }
            hfh hfh = (hfh) this.Z.get();
            if (hfh.b == null) {
                hfh.b = new eyb();
            }
            hfh.b.a(0, i);
            if (hfh.a() != null) {
                ((hfc) hfh.a()).d(hfh.b.b);
            }
        }
    }

    public final void d() {
        this.aR.b.j();
    }

    /* Access modifiers changed, original: protected|final */
    public final void m() {
        mjr mjr = this.aQ;
        if (mjr.e) {
            mjr.a();
            onSearchRequested();
        }
    }

    public final void r() {
        fiw h = this.aR.h();
        if (this.aR.b.g() && D() && (h == null || fil.a(h) || gub.d(h) || h.e())) {
            this.J.a(0);
        } else {
            this.J.a(1);
        }
    }

    public final boolean o() {
        if (this.aQ.h) {
            onBackPressed();
            return true;
        }
        if (this.J.l == 1) {
            this.aU.j = false;
            if (this.aR.b.d()) {
                r();
                return true;
            } else if (D()) {
                if (!this.E.c()) {
                    mjw mjw = this.aR;
                    int i = mjw.i;
                    this.aR.a(mjw.i(), i | 2);
                }
                return true;
            } else {
                Intent flags = new Intent(this, Shell$HomeActivity.class).setFlags(335544320);
                flags.setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
                startActivity(flags);
            }
        }
        return true;
    }

    private final boolean D() {
        return isTaskRoot() || this.aQ.f;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        for (xpd a : this.bg) {
            a.a(z);
        }
    }

    /* JADX WARNING: Missing block: B:5:0x0014, code skipped:
            if (r1.ai.a(r5, r6) != false) goto L_0x0062;
     */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
        r4 = this;
        r0 = r4.aU;
        r1 = r0.a();
        r2 = r1.l;
        if (r2 == 0) goto L_0x0016;
    L_0x000a:
        r1 = r1.n;
        if (r1 == 0) goto L_0x0016;
    L_0x000e:
        r1 = r1.ai;
        r1 = r1.a(r5, r6);
        if (r1 != 0) goto L_0x0062;
    L_0x0016:
        r1 = r0.b();
        r1 = r1.e();
        if (r1 == 0) goto L_0x0026;
    L_0x0020:
        r1 = r0.a(r5);
        if (r1 != 0) goto L_0x0062;
    L_0x0026:
        r1 = r0.d;
        r1 = r1.get();
        r1 = (java.util.Set) r1;
        r1 = r1.iterator();
        r2 = 0;
    L_0x0033:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0045;
    L_0x0039:
        r3 = r1.next();
        r3 = (defpackage.elj) r3;
        r3 = r3.onKeyDown(r5, r6);
        r2 = r2 | r3;
        goto L_0x0033;
    L_0x0045:
        if (r2 != 0) goto L_0x0062;
    L_0x0047:
        r0 = r0.c();
        r0 = r0.e();
        if (r0 == 0) goto L_0x005d;
    L_0x0051:
        r1 = r0 instanceof android.view.KeyEvent.Callback;
        if (r1 == 0) goto L_0x005d;
    L_0x0055:
        r0 = (android.view.KeyEvent.Callback) r0;
        r0 = r0.onKeyDown(r5, r6);
        if (r0 != 0) goto L_0x0062;
    L_0x005d:
        r5 = super.onKeyDown(r5, r6);
        return r5;
    L_0x0062:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyl.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Missing block: B:5:0x0014, code skipped:
            if (r1.ai.a(r5) != false) goto L_0x0062;
     */
    public final boolean onKeyUp(int r5, android.view.KeyEvent r6) {
        /*
        r4 = this;
        r0 = r4.aU;
        r1 = r0.a();
        r2 = r1.l;
        if (r2 == 0) goto L_0x0016;
    L_0x000a:
        r1 = r1.n;
        if (r1 == 0) goto L_0x0016;
    L_0x000e:
        r1 = r1.ai;
        r1 = r1.a(r5);
        if (r1 != 0) goto L_0x0062;
    L_0x0016:
        r1 = r0.b();
        r1 = r1.e();
        if (r1 == 0) goto L_0x0026;
    L_0x0020:
        r1 = r0.a(r5);
        if (r1 != 0) goto L_0x0062;
    L_0x0026:
        r1 = r0.d;
        r1 = r1.get();
        r1 = (java.util.Set) r1;
        r1 = r1.iterator();
        r2 = 0;
    L_0x0033:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0045;
    L_0x0039:
        r3 = r1.next();
        r3 = (defpackage.elj) r3;
        r3 = r3.onKeyUp(r5, r6);
        r2 = r2 | r3;
        goto L_0x0033;
    L_0x0045:
        if (r2 != 0) goto L_0x0062;
    L_0x0047:
        r0 = r0.c();
        r0 = r0.e();
        if (r0 == 0) goto L_0x005d;
    L_0x0051:
        r1 = r0 instanceof android.view.KeyEvent.Callback;
        if (r1 == 0) goto L_0x005d;
    L_0x0055:
        r0 = (android.view.KeyEvent.Callback) r0;
        r0 = r0.onKeyUp(r5, r6);
        if (r0 != 0) goto L_0x0062;
    L_0x005d:
        r5 = super.onKeyUp(r5, r6);
        return r5;
    L_0x0062:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyl.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        kye a = this.aU.a();
        if (a.l) {
            gcl gcl = a.n;
            if (gcl != null && gcl.ai.b(i)) {
                return true;
            }
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    public final void onBackPressed() {
        mjs mjs = this.aU;
        if (!((kyp) mjs.b.get()).a()) {
            gcl gcl = mjs.a().n;
            if (gcl == null || !gcl.Z()) {
                if (mjs.f.c()) {
                    kmc kmc = mjs.f;
                    if (kmc.d) {
                        kmc.b();
                        return;
                    }
                }
                View findViewById = mjs.a.findViewById(R.id.mdx_drawer_layout);
                if (findViewById != null && (findViewById instanceof MdxWatchDrawerLayout)) {
                    MdxWatchDrawerLayout mdxWatchDrawerLayout = (MdxWatchDrawerLayout) findViewById;
                    if (mdxWatchDrawerLayout.c() == 1.0f) {
                        mdxWatchDrawerLayout.b();
                    }
                }
                mjs.g.a();
                if (!mjs.e.h(mjs.j)) {
                    fja e = mjs.c().e();
                    if (e == null || !e.ab()) {
                        if (mjs.j) {
                            mjs.a.finish();
                            return;
                        }
                        int i = mjs.c().i;
                        mjs.c().a(4);
                        boolean a = mjs.h.a();
                        mjs.c().i = i;
                        if (!(a || mjs.i.a(((elf) mjs.c.get()).j()))) {
                            mjs.a.finish();
                        }
                    }
                }
            }
        }
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        if (ezq.a != actionMode.getTag() && VERSION.SDK_INT < 23) {
            this.J.d();
        }
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (ezq.a != actionMode.getTag() && VERSION.SDK_INT < 23) {
            this.J.c();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bcaa a(adiw adiw) {
        bcaa bcaa;
        if (adiw == adiw.WATCH) {
            bcaa = this.av;
        } else if (adiw == adiw.BROWSE) {
            return this.bt;
        } else {
            bcaa = null;
        }
        return bcaa;
    }

    /* Access modifiers changed, original: protected|final */
    public final Dialog d(int i) {
        if (i != 1032) {
            return null;
        }
        mkj mkj = this.aS;
        if (mkj.l == null) {
            mkj.l = new ProgressDialog(mkj.a);
            mkj.l.setMessage(mkj.a.getString(R.string.sign_in_progress));
            mkj.l.setCancelable(false);
            mkj.l.setCanceledOnTouchOutside(false);
        }
        return mkj.l;
    }

    /* Access modifiers changed, original: protected|final */
    public final hco a(adow adow, adiw adiw, bcaa bcaa, adop adop) {
        hco hco = new hco(adow, adiw, this, this.aT, bcaa, adop, this.bq);
        this.bp.a(hco);
        return hco;
    }

    public final acvx t() {
        if (this.aT.j()) {
            return this.aT.F;
        }
        if (this.aR.e() != null) {
            return this.aR.d().t();
        }
        return acvx.g;
    }

    /* Access modifiers changed, original: protected|final */
    public final fny v() {
        String k = ((aizy) this.aj.get()).k();
        JSONObject jSONObject = null;
        if (k == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject().put("@videoId", k);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 43);
            stringBuilder.append("Failed to form the JSON for the assistant: ");
            stringBuilder.append(valueOf);
            xtl.c(stringBuilder.toString());
        }
        return new fny(jSONObject.toString(), xvt.b(k));
    }

    public final void w() {
        if (this.aD.a(ahix.class)) {
            this.n.d(new eeo());
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        alek alek = this.y;
        avwe a = avwe.a(i);
        if (alek.a.containsKey(a)) {
            alep a2 = alek.a(a);
            alla alla = a2.c;
            if (alla != null) {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    alla.b();
                    if (!a2.a.shouldShowRequestPermissionRationale(a2.b)) {
                        a2.c.e();
                    }
                } else {
                    alla.b(true);
                }
                a2.c = null;
            }
        }
    }

    public final void a(eiy eiy) {
        this.aT.a(eiy);
    }

    public final boolean b() {
        return (!this.J.k() || this.aT.f() || this.aT.j()) ? false : true;
    }

    public final /* bridge */ /* synthetic */ ezq c() {
        return this.J;
    }

    public final /* synthetic */ Object n() {
        return y();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ees.class, gzy.class, xgg.class, afqh.class, ahjl.class};
        } else if (i != 0) {
            if (i == 1) {
                gzy gzy = (gzy) obj;
                ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction = gzy.a;
                if ((showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.a & 1) != 0) {
                    axlc axlc = showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.b;
                    if (axlc == null) {
                        axlc = axlc.c;
                    }
                    if ((axlc.a & 1) != 0) {
                        aqhy aqhy;
                        showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction = gzy.a;
                        if ((showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.a & 1) != 0) {
                            axlc = showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.b;
                            if (axlc == null) {
                                axlc = axlc.c;
                            }
                            aqhy = axlc.b;
                            if (aqhy == null) {
                                aqhy = aqhy.q;
                            }
                        } else {
                            aqhy = null;
                        }
                        akcq.a(this, aqhy, this.O, t(), null);
                    }
                }
            } else if (i == 2) {
                this.J.b();
            } else if (i == 3) {
                this.ab.a(true);
            } else if (i != 4) {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (((ahjl) obj).a) {
                wd.a(this, ((wq) this.ak.get()).b);
                return null;
            }
        } else if (this.V) {
            getWindow().getDecorView().requestLayout();
            this.V = false;
            return null;
        }
        return clsArr;
    }
}
