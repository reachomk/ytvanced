package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: ifl */
public final class ifl implements ahli, aibb, aidm, ailf, aimf, Callback, AnimationListener, elj, eln, enc, ibb, ibg, iiz, iju, t, xcp, xqt, xqx {
    private static final boolean F = (VERSION.SDK_INT >= 21);
    public final Runnable A;
    public aimd B;
    public final aila C;
    public final zzl D;
    public final Rect E;
    private final iev G;
    private final ibq H;
    private final fpm I;
    private final acvx J;
    private final ProgressBar K;
    private final ImageView L;
    private final Handler M;
    private final Animation N;
    private final Animation O;
    private boolean P;
    private int Q = 1;
    private boolean R;
    private boolean S;
    private long T;
    private long U;
    private aicd V;
    private boolean W;
    private boolean X;
    private final boolean Y = true;
    private boolean Z;
    public final ias a;
    private boolean aa;
    private final boolean ab;
    private final lud ac;
    private final ibu ad;
    private final airt ae;
    private final xci af;
    private final ajam ag;
    private final zyw ah;
    private final boolean ai;
    private bcuo aj;
    public final ibd b;
    public final eme c;
    public final ief d;
    public final ibo e;
    public boolean f;
    public aibe g;
    public final ails h;
    public final hze i;
    public final iiv j;
    public final RelativeLayout k;
    public final aild l;
    public final TextView m;
    public emo n;
    public final ems o;
    public final TextView p;
    public final int q;
    public aitp r;
    public final ifz s;
    public final FrameLayout t;
    public ibf u;
    public ahyl v;
    public aich w = aich.a();
    public boolean x;
    public long y;
    public boolean z;

    public ifl(Context context, xqs xqs, ails ails, zzf zzf, acvx acvx, lud lud, aila aila, iev iev, ibq ibq, ibo ibo, ijp ijp, airt airt, ijs ijs, ibd ibd, emd emd, iiv iiv, xci xci, ajam ajam, zyw zyw, zzl zzl, fpk fpk) {
        Context context2 = context;
        ails ails2 = ails;
        aila aila2 = aila;
        iev iev2 = iev;
        ijs ijs2 = ijs;
        this.D = zzl;
        this.h = ails2;
        this.J = acvx;
        this.ac = lud;
        this.M = new Handler(this);
        this.ae = airt;
        this.E = new Rect();
        boolean z = zzf.s() != null && zzf.s().c;
        this.ab = z;
        this.t = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.youtube_controls_overlay, null);
        ifo ifo = new ifo();
        ffs ffs = new ffs();
        this.t.addOnAttachStateChangeListener(new ifx(this));
        this.t.addOnLayoutChangeListener(new ift(this));
        if (foh.t(this.D)) {
            this.t.addOnLayoutChangeListener(new ifw(this));
        }
        Resources resources = context.getResources();
        int integer = resources.getInteger(R.integer.fade_duration_fast);
        this.q = integer;
        this.N = AnimationUtils.loadAnimation(context2, R.anim.fade_out);
        this.N.setAnimationListener(this);
        this.O = AnimationUtils.loadAnimation(context2, R.anim.fade_in);
        long j = (long) integer;
        this.N.setDuration(j);
        this.O.setDuration(j);
        this.V = aicd.a;
        this.t.setClipToPadding(false);
        this.s = new ifz(this);
        this.d = new ief((ImageView) this.t.findViewById(R.id.player_control_play_pause_replay_button));
        this.G = iev2;
        ias ias = r2;
        ias ias2 = new ias(this.t, ibq, this.d, ails, zyw);
        this.a = ias;
        this.e = ibo;
        this.ad = new ibu(this.t.findViewById(R.id.hide_controls_button), new ifn(this), ails2);
        this.b = ibd;
        this.b.a(this.V);
        this.H = ibq;
        this.k = (RelativeLayout) this.t.findViewById(R.id.controls_layout);
        this.K = (ProgressBar) this.t.findViewById(R.id.player_loading_view_thin);
        tst tst = new tst(resources.getDimensionPixelSize(R.dimen.buffering_progress_max_thickness), resources.getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{resources.getColor(R.color.buffering_progress_color)});
        tst.setAlpha(resources.getInteger(R.integer.buffering_progress_transparency));
        this.K.setIndeterminateDrawable(tst);
        ProgressBar progressBar = this.K;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.buffering_progress_min_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.buffering_progress_max_size);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.buffering_progress_min_thickness);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.buffering_progress_max_thickness);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.buffering_progress_margin);
        amqw.a((Object) progressBar);
        ((View) amqw.a((View) progressBar.getParent())).addOnLayoutChangeListener(new eyd(progressBar, (tst) amqw.a((tst) progressBar.getIndeterminateDrawable()), dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5 + dimensionPixelSize5));
        View view = (TextView) this.t.findViewById(R.id.time_bar_current_time);
        View view2 = (TextView) this.t.findViewById(R.id.time_bar_total_time);
        abe.b(view, 2);
        abe.b(view2, 2);
        this.p = (TextView) this.t.findViewById(R.id.time_bar_live_label);
        this.p.setOnClickListener(new ifv(this));
        this.C = aila2;
        this.l = new aild(this.t, this, aila2.a);
        aila2.a(this.l);
        this.j = iiv;
        if (!foh.d(zyw)) {
            this.t.addView(iiv.a());
        }
        this.t.addView(this.h);
        this.o = new ibl(new xnz(view, (long) this.q, 4), new xnz(view2, (long) this.q, 4), new xnz(this.p, (long) this.q, 8));
        this.m = (TextView) this.t.findViewById(R.id.player_error_view);
        this.L = (ImageView) this.t.findViewById(R.id.mini_player_error_view);
        if (F) {
            abe.c(this.m, 1);
        }
        this.A = new ifq(this);
        this.c = new eme(emd);
        this.I = new fpm(fpk);
        ijp.a(new ijt(context2, (ViewStub) this.t.findViewById(R.id.video_zoom_overlay_stub)), ijs2);
        ijs2.a(this);
        this.i = new hze(ViewConfiguration.get(context));
        hze hze = this.i;
        ails2.g = hze;
        hze.a(ails2);
        this.i.a(this);
        this.t.setTag(R.id.player_overlay_tap_listener, this);
        ifl.a(xqs, ijs2, this.i);
        xqs xqs2 = new xqs();
        xqr xqr = new xqr(ViewConfiguration.get(context));
        xqr.d = this;
        xqr.b = this;
        ifl.a(xqs2, xqr, ijs2, this.i);
        view2 = (ImageView) this.t.findViewById(R.id.scrim_overlay);
        xqs2.a(view2);
        this.b.a(new ieu(view2));
        this.b.a(this.d);
        FrameLayout frameLayout = this.t;
        dimensionPixelSize5 = this.q;
        iev2.k = new ifc(frameLayout);
        ifb ifb = iev2.d;
        Object obj = iev2.k.i;
        Object obj2 = iev2.a;
        ifb.a = (ImageView) amqw.a(obj);
        ifb.b = (ifd) amqw.a(obj2);
        ifb.a(ifb.c);
        ifb.a(ifb.d);
        iaw iaw = iev2.e;
        iev2.l = new iau((eif) iaw.a((eif) iaw.a.get(), 1), (bcud) iaw.a((bcud) iaw.b.get(), 2), (acvx) iaw.a((acvx) iaw.c.get(), 3), (xxd) iaw.a((xxd) iaw.d.get(), 4), (ImageView) iaw.a(iev2.k.e, 5));
        iau iau = iev2.l;
        ejd c = iau.a.c();
        if (c.g()) {
            iau.b();
        } else {
            iau.a();
        }
        iau.a(c.a());
        iau.a.a(iau);
        iau.e.setOnClickListener(new iax(iau));
        iev2.k.f.setOnClickListener(new ifa(iev2));
        iev2.k.d.setOnClickListener(new iez(iev2));
        iev2.k.g.setOnClickListener(iev2.g);
        iev2.k.g.setOnLongClickListener(iev2.g);
        iev2.k.h.setOnClickListener(iev2.h);
        ifd ifd = iev2.a;
        ifc ifc = iev2.k;
        ifd.c = ifc;
        Context context3 = ifc.a.getContext();
        if (!ifd.l) {
            ifd.d = AnimationUtils.loadAnimation(context3, R.anim.fade_out);
            ifd.d.setAnimationListener(new ifi(ifd));
            ifd.e = AnimationUtils.loadAnimation(context3, R.anim.fade_in);
            long j2 = (long) dimensionPixelSize5;
            ifd.d.setDuration(j2);
            ifd.e.setDuration(j2);
            ifd.l = true;
        }
        iev2.i.a((ViewStub) frameLayout.findViewById(R.id.autonav_preview_stub), dimensionPixelSize5);
        hvk hvk = iev2.i;
        ifd ifd2 = iev2.a;
        ifd2.getClass();
        hvk.a(new iey(ifd2));
        iev2.j.a((ViewStub) frameLayout.findViewById(R.id.autonav_toggle), dimensionPixelSize5);
        hwf hwf = iev2.j;
        ifd ifd3 = iev2.a;
        ifd3.getClass();
        hwf.a = new iex(ifd3);
        frameLayout.addOnLayoutChangeListener(iev2);
        this.af = xci;
        this.ag = ajam;
        this.ah = zyw;
        this.ai = foh.b(zyw);
    }

    public final void a(float f) {
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void c_(boolean z) {
    }

    public final void d() {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void B_() {
        if (foh.x(this.ah)) {
            this.aj = this.ag.t().f().a(emg.a(this.ah, 17592186044416L, 1)).a(new ifr(this), ifu.a);
        } else {
            this.af.a((Object) this);
        }
    }

    public final void C_() {
        if (foh.x(this.ah)) {
            this.aj.b();
            this.aj = null;
            return;
        }
        this.af.b(this);
    }

    private static void a(xqs xqs, xqv... xqvArr) {
        for (Object add : xqvArr) {
            xqs.a.add(add);
        }
    }

    public final void j() {
        t();
        r();
        ahyl ahyl = this.v;
        if (ahyl != null) {
            ahyl.b(true);
        }
        this.t.getParent().requestDisallowInterceptTouchEvent(true);
    }

    public final void e(boolean z) {
        ahyl ahyl = this.v;
        if (ahyl != null) {
            ahyl.b(false);
        }
    }

    public final void b(float f) {
        e(f);
    }

    public final void c(float f) {
        e(f);
    }

    public final void d(float f) {
        e(f);
    }

    private final void e(float f) {
        if (f < 0.0f && this.h.d.d() && this.x && !this.V.o) {
            n();
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        if (this.C.c || ailb.a((int) motionEvent.getX(), this.t.getWidth()) == 0) {
            return false;
        }
        return true;
    }

    public final void b(MotionEvent motionEvent) {
        if (d(motionEvent)) {
            this.C.a(motionEvent, this.t);
        }
    }

    public final void k() {
        this.b.b(true);
        if (s()) {
            t();
            i(false);
        }
        ahyl ahyl = this.v;
        if (ahyl != null) {
            ahyl.a(true);
        }
    }

    public final void l() {
        this.b.b(false);
        ahyl ahyl = this.v;
        if (ahyl != null) {
            ahyl.a(false);
        }
    }

    public final void a(MotionEvent motionEvent) {
        if (!this.W) {
            if (this.w.a == aicj.RECOVERABLE_ERROR) {
                aibe aibe = this.g;
                if (aibe != null) {
                    aibe.i();
                    return;
                }
            }
            if (this.C.c && d(motionEvent)) {
                this.C.a(motionEvent, this.t);
                return;
            }
            m();
            lui lui = this.ac.a;
            if (lui != null) {
                lui.i();
            }
        }
    }

    private final boolean d(MotionEvent motionEvent) {
        if (this.z || aicd.c(this.V) || this.w.g() || this.w.a == aicj.ENDED) {
            return false;
        }
        if (ailb.a((int) motionEvent.getX(), this.t.getWidth()) != 2 || this.U > this.T) {
            return this.j.b() ^ 1;
        }
        return false;
    }

    public final void m() {
        if (!this.j.b()) {
            if (!this.x) {
                if (this.h.d.a() && !this.h.d.f()) {
                    this.h.i();
                }
                if (s()) {
                    t();
                    r();
                }
            } else if (!this.V.o) {
                n();
            }
        }
    }

    public final void a(int i, float f) {
        this.t.setTranslationX((float) i);
        this.t.setAlpha(f);
    }

    public final LayoutParams b() {
        return new aiuh(-1, -1, false);
    }

    public final boolean a(ejd ejd) {
        return emq.a(ejd);
    }

    public final void b(ejd ejd) {
        boolean z = this.W;
        boolean z2 = this.f;
        boolean z3 = true;
        if (!(ejd.f() || ejd.n())) {
            z3 = false;
        }
        this.W = z3;
        this.f = ejd.a();
        ias ias = this.a;
        z3 = ejd.f();
        if (ias.h != z3) {
            ias.h = z3;
            ias.c(false);
        }
        for (ibc a : this.b.a) {
            a.a(ejd);
        }
        boolean z4 = this.W;
        if (z == z4) {
            if (z2 != this.f) {
                q();
            }
        } else if (z4) {
            f();
        } else if (this.w.a != aicj.PLAYING || ((this.X && this.w.b) || !s())) {
            n();
        } else {
            q();
        }
        emo emo = this.n;
        boolean a2 = ejd.a();
        if (emo.f != a2) {
            emo.f = a2;
            emo.h();
            emo.d(false);
        }
    }

    public final void a(aibe aibe) {
        this.g = aibe;
        this.d.a = aibe;
        this.e.e = aibe;
    }

    public final void a(aich aich) {
        if (!amqq.a(this.w, aich)) {
            boolean j = this.ae.j();
            this.w = aich;
            this.a.i.a(aich);
            this.b.a(aich);
            q();
            if (aich.a == aicj.NEW) {
                this.n.a();
                if (j) {
                    h();
                    this.n.b();
                }
            }
            if (aich.a == aicj.ENDED) {
                emo emo = this.n;
                if (emo.a.f() != 0) {
                    aihq aihq = emo.c;
                    aihq.j = 0;
                    emo.a.a(aihq);
                }
            }
            if (aich.a != aicj.ENDED && (aich.a != aicj.PAUSED || j)) {
                u();
            } else if (this.ab) {
                this.M.sendEmptyMessageDelayed(3, 1000);
            } else {
                e();
            }
            aicj aicj = aich.a;
            aicj = aicj.PLAYING;
        }
        o();
    }

    private final void u() {
        if (this.ab) {
            this.M.removeMessages(3);
        }
    }

    public final void a(String str, boolean z) {
        aich e;
        Object string;
        String valueOf;
        Object str2;
        CharSequence str3;
        if (z) {
            e = aich.e();
        } else {
            e = aich.f();
        }
        this.w = e;
        this.b.a(this.w);
        if (xss.l(this.t.getContext())) {
            string = this.t.getContext().getString(R.string.tap_to_retry);
        } else {
            string = this.t.getContext().getString(R.string.click_to_retry);
        }
        TextView textView = this.m;
        str = String.valueOf(str);
        if (z) {
            valueOf = String.valueOf(string);
            String str4 = "\n\n";
            str2 = valueOf.length() == 0 ? new String(str4) : str4.concat(valueOf);
        } else {
            str2 = "";
        }
        valueOf = String.valueOf(str2);
        if (valueOf.length() == 0) {
            str3 = new String(str);
        } else {
            str3 = str.concat(valueOf);
        }
        textView.setText(str3);
        this.y = 0;
        this.T = 0;
        this.U = 0;
        e();
        if (!F) {
            xrn.a(this.m);
        }
    }

    public final void a(View view) {
        iev iev = this.G;
        if (iev.k != null) {
            MarginLayoutParams layoutParams;
            Resources resources = view.getResources();
            LayoutParams layoutParams2 = view.getLayoutParams();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.controls_overlay_action_button_size);
            if (layoutParams2 == null) {
                layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            layoutParams.setMarginStart(resources.getDimensionPixelSize(R.dimen.controls_overlay_action_button_margin_start));
            view.setLayoutParams(layoutParams);
            iev.k.a.addView(view);
        }
    }

    public final void au_() {
        this.y = 0;
        this.T = 0;
        this.U = 0;
        this.n.b();
    }

    public final void c(boolean z) {
        emo emo = this.n;
        aihe aihe = emo.c;
        if (aihe.s != z) {
            aihe.s = z;
            if (!z) {
                emo.a();
            }
            emo.a.a(emo.c);
        }
    }

    public final void a(long j, long j2, long j3, long j4) {
        this.n.a(j, j2, j3, j4);
        this.y = j3;
        this.T = j2;
        this.U = j;
    }

    public final void g() {
        this.P = false;
        this.n.a(false);
    }

    public final void i() {
        xpr.a(this.t.getContext(), (int) R.string.no_subtitles, 0);
    }

    public final void h() {
        this.y = 0;
        this.T = 0;
        this.U = 0;
        a(aicd.a);
        g();
        this.X = false;
        this.d.l(false);
    }

    public final void h_(boolean z) {
        ibo ibo = this.e;
        ibo.a = z;
        ibo.a();
        int i = !z ? R.string.accessibility_enter_fullscreen : R.string.accessibility_exit_fullscreen;
        ibo.d.setSelected(z);
        TouchImageView touchImageView = ibo.d;
        touchImageView.setContentDescription(touchImageView.getContext().getString(i));
        if (this.w.a == aicj.PLAYING && !this.x && s()) {
            t();
            r();
        }
    }

    public final void a(aicd aicd) {
        this.V = aicd;
        this.n.a(aicd);
        this.b.a(aicd);
        q();
        o();
    }

    public final void f() {
        u();
        t();
        this.x = true;
        q();
        aibe aibe = this.g;
        if (aibe != null) {
            aibe.h();
        }
    }

    public final void e() {
        g(false);
    }

    private final void g(boolean z) {
        u();
        if (this.W || this.w.g()) {
            h(z);
            return;
        }
        t();
        this.x = false;
        h(z);
        if (this.w.a == aicj.PLAYING || this.w.a == aicj.PAUSED) {
            this.n.f();
        }
        aibe aibe = this.g;
        if (aibe != null) {
            aibe.g();
        }
        o();
    }

    public final void n() {
        if (this.w.g()) {
            h(true);
            return;
        }
        g(true);
        if (this.Y) {
            boolean y = y();
            if (!(this.s.a || this.V.w || !y)) {
                this.n.b(true);
            }
            ails ails = this.h;
            if (ails.getVisibility() == 0) {
                ails.startAnimation(this.O);
            }
        }
    }

    public final void d_(boolean z) {
        ibu ibu = this.ad;
        ibu.b = z;
        ibu.a();
        this.R = z;
        v();
    }

    public final void a(CharSequence charSequence) {
        this.p.setText(charSequence);
    }

    public final void b(boolean z) {
        if (this.S != z) {
            ibu ibu = this.ad;
            ibu.c = z;
            ibu.a();
            this.S = z;
            v();
        }
    }

    private final void v() {
        boolean z = true;
        if (!(this.R || this.S)) {
            z = false;
        }
        emo emo = this.n;
        if (emo.g != z) {
            emo.g = z;
            emo.f();
        }
        if (!z) {
            q();
            o();
        } else if (this.x) {
            n();
        } else {
            t();
        }
    }

    public final void o() {
        if (!this.x) {
            if ((this.w.a == aicj.PLAYING || this.w.b) && s() && !this.M.hasMessages(1) && !this.j.b()) {
                this.M.sendEmptyMessageDelayed(1, 1500);
            }
        }
    }

    private final void w() {
        if (this.x) {
            this.n.a(0);
        } else {
            this.n.a(1);
        }
    }

    public final void a(boolean z) {
        if (this.z != z) {
            this.z = z;
            if (this.ai) {
                emo emo = this.n;
                emo.h = z;
                emo.d(false);
            }
            ias ias = this.a;
            int i = 1;
            if (ias.g != z) {
                ias.g = z;
                ias.c(true);
            }
            for (ibc h : this.b.a) {
                h.h(z);
            }
            if (this.z) {
                t();
                i = 3;
            }
            if (this.Q != i) {
                this.Q = i;
                q();
            }
        }
    }

    public final void f(boolean z) {
        if (this.Z != z) {
            ibu ibu = this.ad;
            ibu.a = z;
            ibu.a();
            this.Z = z;
            ibq ibq = this.H;
            ibq.c = z;
            ibq.a();
            ief ief = this.d;
            ief.b = this.Z;
            ief.a();
            q();
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            r();
            return true;
        } else if (message.what == 2) {
            q();
            return true;
        } else if (message.what != 3) {
            return false;
        } else {
            e();
            return true;
        }
    }

    public final void onAnimationEnd(Animation animation) {
        if (animation == this.N && !this.aa) {
            f();
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object obj = null;
        if (i != 0 && (!keyEvent.isSystem() || aitz.a(i))) {
            obj = 1;
        }
        if (obj != null) {
            e();
        }
        if (this.g == null || this.w.a != aicj.RECOVERABLE_ERROR || obj == null || i == 20 || i == 21 || i == 22 || i == 19) {
            return this.t.onKeyDown(i, keyEvent);
        }
        this.g.i();
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.t.onKeyUp(i, keyEvent);
    }

    public final int p() {
        return this.t.getResources().getDimensionPixelSize(R.dimen.controls_overlay_bottom_ui_size);
    }

    public final void q() {
        h(false);
    }

    private final void h(boolean z) {
        this.M.removeMessages(2);
        View view = this.m;
        boolean z2 = false;
        boolean z3 = this.w.g() && !this.W;
        xpr.a(view, z3);
        view = this.L;
        z3 = this.w.g() && this.W;
        xpr.a(view, z3);
        x();
        if ((this.V.o && s()) || this.x || this.w.g()) {
            if (!this.s.a) {
                if (this.V.w && this.w.h()) {
                    this.n.b(false);
                } else {
                    this.n.c(false);
                }
                this.a.a(z);
            }
            this.b.a(z);
            xpr.a(this.h, false);
            if (!this.s.a) {
                View view2 = this.k;
                if (this.H.c() || ((this.V.w && this.w.h()) || !this.w.i())) {
                    z2 = true;
                }
                xpr.a(view2, z2);
            }
            w();
            this.x = true;
            return;
        }
        boolean y = y();
        if (this.V != aicd.j && y) {
            this.n.b(false);
        } else {
            this.n.c(false);
        }
        ias ias = this.a;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) ias.a.getLayoutParams();
        if (!this.f) {
            marginLayoutParams.bottomMargin = ias.a.getResources().getDimensionPixelSize(R.dimen.timestamp_fullscreen_bottom_padding);
        } else if (y) {
            marginLayoutParams.bottomMargin = (ias.d.d.d() ? ias.d.c() : 0) + (ias.d.d.a() ? ias.e : 0);
        } else {
            marginLayoutParams.bottomMargin = 0;
        }
        ias.a.setLayoutParams(marginLayoutParams);
        ias ias2 = this.a;
        ias2.f = true;
        ias2.c(false);
        for (ibc g_ : this.b.a) {
            g_.g_(z);
        }
        this.o.e(this.Q != 3);
        xpr.a(this.k, true);
        xpr.a(this.h, true);
        w();
        this.x = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARNING: Missing block: B:9:0x0018, code skipped:
            if (r0.f != false) goto L_0x001a;
     */
    private final void x() {
        /*
        r4 = this;
        r0 = r4.w;
        r1 = r0.b;
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x000e;
    L_0x0008:
        r0 = r0.a;
        r1 = defpackage.aicj.NEW;
        if (r0 != r1) goto L_0x001a;
    L_0x000e:
        r0 = r4.Z;
        if (r0 != 0) goto L_0x001a;
    L_0x0012:
        r0 = r4.u;
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r0.f;
        if (r0 == 0) goto L_0x001b;
    L_0x001a:
        r2 = 0;
    L_0x001b:
        r0 = r4.K;
        if (r2 != 0) goto L_0x0020;
    L_0x001f:
        r3 = 4;
    L_0x0020:
        r0.setVisibility(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifl.x():void");
    }

    public final void av_() {
        x();
    }

    private final boolean y() {
        boolean z = false;
        if ((!this.h.d.a() || this.h.d.f()) && !this.Z) {
            if (!this.z) {
                z = true;
            } else if (this.ai) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public final void r() {
        i(true);
    }

    private final void i(boolean z) {
        if (!(this.s.a || this.V.w)) {
            this.n.c(z);
        }
        this.a.a(z);
        this.b.a(z);
        if (this.h.d.a() && !this.h.d.f()) {
            this.h.i();
        }
        ails ails = this.h;
        if (ails.getVisibility() == 0) {
            this.aa = false;
            ails.startAnimation(this.N);
        } else if (this.V.o && !this.x && s()) {
            f();
        }
    }

    public final boolean s() {
        return (this.R || this.Q != 1 || this.S) ? false : true;
    }

    public final void t() {
        this.M.removeMessages(1);
        this.aa = true;
        this.h.clearAnimation();
    }

    public final void a(Map map) {
        emo emo = this.n;
        aihq aihq = emo.c;
        aihq.u = map;
        emo.a.a(aihq);
    }

    public final void a(ahkf ahkf) {
        if (ahkf.e == 5) {
            this.J.b(acwc.DOUBLE_TAP_TO_SEEK_FAST_FORWARD, null);
            this.J.b(acwc.DOUBLE_TAP_TO_SEEK_REWIND, null);
            this.J.b(acwc.FULLSCREEN_OPEN_WITH_BUTTON, null);
            this.J.b(acwc.FULLSCREEN_OPEN_BY_ROTATE, null);
            this.G.c.a(new acvs(acwc.FULLSCREEN_ENGAGEMENT_EXPLICIT_ENTRYPOINT));
        }
        aakj aakj = ahkf.b;
        if (aakj != null) {
            awdg awdg = aakj.n().c;
            boolean z = false;
            if ((awdg.a & 131072) != 0) {
                awdi awdi = awdg.l;
                if (awdi == null) {
                    awdi = awdi.c;
                }
                if (awdi.b) {
                    z = true;
                }
            }
            if (this.X != z) {
                this.X = z;
                this.d.l(z);
                q();
            }
        }
    }

    public final void a(int i, boolean z) {
        ibd ibd = this.b;
        z = this.j.b();
        for (ibc k : ibd.a) {
            k.k(z);
        }
        if (this.j.b()) {
            this.I.a();
            if (this.j.a().getParent() == null) {
                this.t.addView(this.j.a());
                this.h.bringToFront();
            }
            return;
        }
        this.I.b();
    }

    public final /* bridge */ /* synthetic */ View a() {
        return this.t;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class};
        } else if (i == 0) {
            a((ahkf) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
