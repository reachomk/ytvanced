package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.jar.EmbedOverflowOverlay;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: mte */
public final class mte extends aiua implements aiav, aibb, aifc, aigc, aihv, Callback, OnClickListener, AnimationListener {
    public static final Integer[] a = new Integer[]{Integer.valueOf(R.id.player_share_button), Integer.valueOf(R.id.related_videos_screen_button)};
    private static final boolean p = (VERSION.SDK_INT >= 21);
    private final aief A;
    private final TouchImageView B;
    private final TouchImageView C;
    private final TouchImageView D;
    private final TouchImageView E;
    private final ProgressBar F;
    private final TextView G;
    private aiei H;
    private final Handler I = new Handler(this);
    private final mth J;
    private final mti K;
    private final nic L;
    private Animation M;
    private Animation N;
    private int O;
    private int P;
    private Animation Q;
    private Animation R;
    private Animation S;
    private aics T;
    private aich U;
    private boolean V;
    private boolean W;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private aicd ad;
    private final LinearLayout ae;
    public aibe b;
    public aiay c;
    public aigf d;
    public aihy e;
    public aiff f;
    public TimeBar g;
    public final aihk h;
    public final ViewGroup i;
    public final TextView j;
    public final RelativeLayout k;
    public aitp l;
    public Animation m;
    public mtj n;
    public boolean o;
    private final TouchImageView q;
    private final TouchImageView r;
    private final TextView s;
    private final Drawable t;
    private final Drawable u;
    private final View v;
    private final View w;
    private final LinearLayout x;
    private final TouchImageView y;
    private final TouchImageView z;

    public mte(Context context, nic nic) {
        super(context);
        this.L = nic;
        this.M = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.M.setAnimationListener(this);
        this.N = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.R = AnimationUtils.loadAnimation(context, R.anim.bottom_translate_out);
        this.S = AnimationUtils.loadAnimation(context, R.anim.top_translate_out);
        this.O = getResources().getInteger(R.integer.fade_duration_fast);
        this.P = getResources().getInteger(R.integer.fade_duration_slow);
        this.N.setDuration((long) this.O);
        this.m = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.Q = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        long integer = (long) context.getResources().getInteger(R.integer.fade_overlay_fade_duration);
        this.m.setDuration(integer);
        this.Q.setDuration(integer);
        this.Q.setAnimationListener(this);
        this.ad = aicd.a;
        this.U = aich.a();
        int i = 0;
        setClipToPadding(false);
        this.J = new mth(this);
        this.K = new mti(this);
        LayoutInflater.from(context).inflate(R.layout.embed_controls_overlay, this);
        this.k = (RelativeLayout) findViewById(R.id.controls_layout);
        this.g = (TimeBar) findViewById(R.id.time_bar);
        this.g.a(this.J);
        this.h = new aihk();
        this.i = (ViewGroup) findViewById(R.id.bottom_end_container);
        this.q = (TouchImageView) this.i.findViewById(R.id.fullscreen_button);
        this.q.setOnClickListener(this);
        this.r = (TouchImageView) this.i.findViewById(R.id.hide_controls_button);
        this.r.setOnClickListener(this);
        this.s = (TextView) findViewById(R.id.live_label);
        this.s.setTypeface(ajrc.ROBOTO_LIGHT.a(context));
        this.s.setOnClickListener(this);
        this.t = ra.a(context, (int) R.drawable.player_live_dot);
        this.u = ra.a(context, (int) R.drawable.player_notlive_dot);
        h(true);
        this.v = findViewById(R.id.bottom_bar_background);
        this.w = findViewById(R.id.top_bar_background);
        this.x = (LinearLayout) findViewById(R.id.time_bar_container);
        this.F = (ProgressBar) findViewById(R.id.player_loading_view);
        this.F.getIndeterminateDrawable().setColorFilter(context.getResources().getColor(R.color.player_loading_view_color), Mode.SRC_IN);
        this.G = (TextView) findViewById(R.id.player_error_view);
        if (p) {
            abe.c(this.G, 1);
        }
        this.B = (TouchImageView) findViewById(R.id.player_control_play_pause_replay_button);
        this.B.setOnClickListener(this);
        this.T = new aics(this.B, context);
        this.D = (TouchImageView) findViewById(R.id.player_control_previous_button);
        this.D.setOnClickListener(this);
        this.C = (TouchImageView) findViewById(R.id.player_control_next_button);
        this.C.setOnClickListener(this);
        this.z = (TouchImageView) findViewById(R.id.player_addto_button);
        this.z.setOnClickListener(this);
        this.E = (TouchImageView) findViewById(R.id.player_collapse_button);
        this.E.setOnClickListener(this);
        this.j = (TextView) findViewById(R.id.player_video_title_view);
        this.y = (TouchImageView) findViewById(R.id.player_overflow_button);
        this.y.setOnClickListener(this);
        this.H = new aiej();
        this.H.a(this.K);
        this.H.a(this.K);
        this.H.a((aigf) this.K);
        this.H.a(this.K);
        this.H.a(this.ad);
        this.A = new aief(context);
        this.H.a(this.A);
        this.ae = (LinearLayout) findViewById(R.id.player_additional_view_container);
        this.o = true;
        f();
        k();
        Integer[] numArr = a;
        int length = numArr.length;
        while (i < length) {
            View findViewById = findViewById(numArr[i].intValue());
            if (findViewById != null) {
                nic nic2 = this.L;
                nhz nie = new nie(nic2, findViewById);
                nic2.b.put(findViewById, nie);
                nic2.a.a(findViewById.getId(), nie);
                findViewById.setOnClickListener(nic2.c);
            }
            i++;
        }
    }

    public final View a() {
        return this;
    }

    public final void a(aiay aiay) {
        throw null;
    }

    public final void g() {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void h(boolean z) {
        Drawable drawable;
        if (z) {
            drawable = this.t;
        } else {
            drawable = this.u;
        }
        adl.a(this.s, drawable, null, null);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void a(aibe aibe) {
        this.b = aibe;
    }

    public final void a(aigf aigf) {
        this.d = aigf;
    }

    public final void a(aihy aihy) {
        this.e = aihy;
    }

    public final void a(aiff aiff) {
        this.f = aiff;
    }

    public final void a(aich aich) {
        if (!this.U.equals(aich)) {
            this.U = aich;
            l();
            if (aich.a == aicj.ENDED) {
                e();
                if (this.g.f() != 0) {
                    aihq aihq = this.h;
                    aihq.j = 0;
                    this.g.a(aihq);
                }
            } else if (aich.a == aicj.PAUSED && !this.o) {
                if (this.I.hasMessages(5)) {
                    this.I.removeMessages(5);
                }
                this.I.sendEmptyMessageDelayed(5, 500);
            }
        }
        d();
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
        this.U = e;
        if (xss.l(getContext())) {
            string = getContext().getString(R.string.tap_to_retry);
        } else {
            string = getContext().getString(R.string.click_to_retry);
        }
        TextView textView = this.G;
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
        e();
        if (!p) {
            xrn.a(this.G);
        }
    }

    public final void d(boolean z) {
        this.H.d(z);
    }

    public final void g(boolean z) {
        this.H.g(z);
    }

    public final void f(boolean z) {
        this.H.f(z);
    }

    public final void a(aahn[] aahnArr, int i) {
        this.H.a(aahnArr, i);
    }

    public final void c_(boolean z) {
        this.W = z;
        l();
    }

    public final void b(boolean z) {
        this.aa = z;
        l();
    }

    public final void b_(boolean z) {
        this.ab = z;
        l();
    }

    public final void au_() {
        this.h.g();
        this.g.a(this.h);
    }

    public final void c(boolean z) {
        this.g.setEnabled(z);
    }

    public final void a(long j, long j2, long j3, long j4) {
        this.h.a(j, j2, j3, j4);
        this.g.a(this.h);
    }

    public final void e(boolean z) {
        this.H.e(z);
    }

    public final void a(ajis ajis) {
        this.H.a(ajis);
    }

    public final void i() {
        xpr.a(getContext(), (int) R.string.no_subtitles, 0);
    }

    public final void a(List list) {
        Context context;
        WeakReference weakReference = mvb.a;
        if (weakReference == null || weakReference.get() == null) {
            ammj.a("Current context was null, falling back to default context", new Object[0]);
            context = getContext();
        } else {
            context = (Context) weakReference.get();
        }
        new aiga(context).a(list, this.d);
    }

    public final void h() {
        this.H.d();
        this.j.setText("");
        a(aicd.a);
        f();
        this.o = true;
    }

    public final void a(aajq[] aajqArr, int i, boolean z) {
        this.H.a(aajqArr, i, z);
    }

    public final void h_(boolean z) {
        this.q.setSelected(z);
        this.q.setContentDescription(getContext().getText(!z ? R.string.accessibility_enter_fullscreen : R.string.accessibility_exit_fullscreen));
        if (this.U.a == aicj.PLAYING) {
            j();
            i(true);
        }
    }

    public final void a(aicd aicd) {
        aihk aihk;
        this.ad = aicd;
        if (this.n == null || amqq.a(aicd.n, aicd.i.n)) {
            aihk = this.h;
            int i = aicd.q;
            aihk.o = i;
            aihk.n = -855638017;
            aihk.m = 872415231;
            aihk.p = i;
            aihk.q = aicd.r;
        } else {
            aihk = this.h;
            aihk.o = -1;
            aihk.n = -1996488705;
            aihk.m = -2013265920;
            aihk.p = -1;
        }
        aihk = this.h;
        aihk.r = aicd.x;
        aihk.s = aicd.t;
        aihk.t = aicd.y;
        aihk.a(aicd.z);
        this.g.a(this.h);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.x.getLayoutParams();
        if (amqq.a(aicd.n, aicd.i.n)) {
            layoutParams.addRule(11);
            layoutParams.height = -2;
        } else {
            layoutParams.addRule(11, 0);
            layoutParams.addRule(0, this.i.getId());
            if (this.i.getHeight() > 0) {
                layoutParams.height = Math.max(layoutParams.height, this.i.getHeight());
            } else {
                layoutParams.height = -2;
            }
        }
        this.x.setLayoutParams(layoutParams);
        l();
        this.H.a(aicd);
        d();
    }

    public final void f() {
        j();
        this.I.removeMessages(5);
        this.V = true;
        l();
        aibe aibe = this.b;
        if (aibe != null) {
            aibe.h();
        }
    }

    public final void e() {
        j();
        this.I.removeMessages(5);
        this.V = false;
        boolean l = l();
        aibe aibe = this.b;
        if (aibe != null && l) {
            aibe.g();
        }
        d();
    }

    public final void c() {
        e();
        this.L.a(new mtd(this));
        if (!this.ad.w) {
            b(this.g);
        }
        b(this.ae);
        b(this.y);
        b(this.w);
        b(this.v);
        b(this.i);
        b(this.s);
        b(this.z);
        b(this.E);
        b(this.j);
        b(this.B);
        b(this.C);
        b(this.D);
    }

    public final void d_(boolean z) {
        if (this.ac != z) {
            this.ac = z;
            xpr.a(this.r, z);
            if (this.ac) {
                c();
                return;
            }
            l();
        }
    }

    public final void a(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    public final void d() {
        if ((this.U.a == aicj.PLAYING || this.U.b) && m() && !this.I.hasMessages(1)) {
            this.I.sendEmptyMessageDelayed(1, 2500);
        }
    }

    private final void k() {
        this.I.removeMessages(3);
        this.I.sendEmptyMessage(4);
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            i(false);
            return true;
        } else if (message.what == 2) {
            l();
            return true;
        } else if (message.what == 3) {
            xpr.a(this.F, true);
            return true;
        } else if (message.what == 4) {
            xpr.a(this.F, false);
            return true;
        } else if (message.what != 5) {
            return false;
        } else {
            e();
            return true;
        }
    }

    public final void onAnimationEnd(Animation animation) {
        if (animation == this.M) {
            f();
        } else if (animation == this.Q) {
            this.k.setVisibility(4);
            this.V = true;
        }
    }

    public final void onClick(View view) {
        aibe aibe = this.b;
        if (aibe == null) {
            return;
        }
        if (view != this.C) {
            if (view != this.D) {
                if (view == this.B) {
                    if (this.U.a == aicj.ENDED) {
                        this.b.j();
                    } else if (this.U.a == aicj.PLAYING) {
                        this.b.d();
                    } else if (this.U.a == aicj.PAUSED) {
                        this.b.aJ_();
                    }
                } else if (view != this.y) {
                    View view2 = this.q;
                    if (view == view2) {
                        aibe.b(view2.isSelected() ^ 1);
                    } else if (view == this.r) {
                        if (!this.V) {
                            j();
                            i(true);
                        }
                    } else if (view == this.s) {
                        long j = this.h.i;
                        aibe.b(j);
                        aigy.a(this.h, j);
                        this.g.a(j);
                        h(true);
                    }
                } else {
                    if (this.H instanceof aiej) {
                        LayoutInflater.from(getContext()).inflate(R.layout.embed_overflow_overlay, this);
                        EmbedOverflowOverlay embedOverflowOverlay = (EmbedOverflowOverlay) findViewById(R.id.overflow_layout);
                        aiej aiej = (aiej) this.H;
                        embedOverflowOverlay.c = aiej.a;
                        embedOverflowOverlay.d = aiej.b;
                        embedOverflowOverlay.e = aiej.c;
                        embedOverflowOverlay.f = aiej.d;
                        embedOverflowOverlay.a(aiej.e);
                        Object[] objArr = aiej.f;
                        embedOverflowOverlay.b = (aiek[]) xsb.a(embedOverflowOverlay.b, objArr);
                        for (aiek aiek : objArr) {
                            embedOverflowOverlay.a.addView(aiek.a());
                            aiek.a().setOnClickListener(embedOverflowOverlay);
                        }
                        embedOverflowOverlay.d(aiej.g);
                        embedOverflowOverlay.e(aiej.h);
                        embedOverflowOverlay.g(aiej.i);
                        embedOverflowOverlay.a(aiej.j, aiej.k, aiej.l);
                        embedOverflowOverlay.f(aiej.m);
                        embedOverflowOverlay.a(aiej.n, aiej.o);
                        this.H = embedOverflowOverlay;
                    }
                    this.H.a();
                    this.k.startAnimation(this.Q);
                }
            } else if (this.ab && this.ad.v) {
                if (m()) {
                    j();
                    i(true);
                }
                this.f.a();
            }
        } else if (this.aa && this.ad.v) {
            if (m()) {
                j();
                i(true);
            }
            this.f.b();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!super.onTouchEvent(motionEvent) && motionEvent.getActionMasked() == 1) {
            if (this.U.a == aicj.RECOVERABLE_ERROR) {
                aibe aibe = this.b;
                if (aibe != null) {
                    aibe.i();
                    return true;
                }
            }
            if (this.V) {
                if (!this.ad.o) {
                    c();
                }
            } else if (m()) {
                j();
                i(true);
            }
        }
        return true;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object obj = (!keyEvent.isSystem() || aitz.a(i)) ? 1 : null;
        if (obj != null) {
            e();
        }
        if (this.U.a != aicj.RECOVERABLE_ERROR || obj == null || i == 20 || i == 21 || i == 22 || i == 19) {
            return super.onKeyDown(i, keyEvent);
        }
        this.b.i();
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i = (int) (((float) i) * 0.16666667f);
        this.G.setPadding(i, 10, i, 10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
    private final boolean l() {
        /*
        r5 = this;
        r0 = r5.I;
        r1 = 2;
        r0.removeMessages(r1);
        r0 = r5.T;
        r1 = r5.U;
        r0.a(r1);
        r0 = r5.G;
        r1 = r5.U;
        r1 = r1.g();
        defpackage.xpr.a(r0, r1);
        r0 = r5.ad;
        r0 = defpackage.aicd.b(r0);
        if (r0 != 0) goto L_0x003e;
    L_0x0020:
        r0 = r5.U;
        r1 = r0.b;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r0 = r0.a;
        r1 = defpackage.aicj.NEW;
        if (r0 == r1) goto L_0x002d;
    L_0x002c:
        goto L_0x003e;
    L_0x002d:
        r0 = r5.I;
        r1 = 3;
        r0 = r0.hasMessages(r1);
        if (r0 != 0) goto L_0x0041;
    L_0x0036:
        r0 = r5.I;
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r0.sendEmptyMessageDelayed(r1, r2);
        goto L_0x0041;
    L_0x003e:
        r5.k();
    L_0x0041:
        r0 = r5.ad;
        r0 = r0.o;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x004f;
    L_0x0049:
        r0 = r5.m();
        if (r0 != 0) goto L_0x0163;
    L_0x004f:
        r0 = r5.V;
        if (r0 != 0) goto L_0x0163;
    L_0x0053:
        r0 = r5.U;
        r0 = r0.g();
        if (r0 == 0) goto L_0x005d;
    L_0x005b:
        goto L_0x0163;
    L_0x005d:
        r0 = r5.L;
        r0.a(r2);
        r0 = r5.E;
        defpackage.xpr.a(r0, r2);
        r0 = r5.j;
        r3 = r5.ad;
        r3 = r3.n;
        r4 = defpackage.aicd.i;
        r4 = r4.n;
        r3 = defpackage.amqq.a(r3, r4);
        r3 = r3 ^ r1;
        defpackage.xpr.a(r0, r3);
        r0 = r5.y;
        r3 = r5.ad;
        r3 = r3.n;
        r4 = defpackage.aicd.i;
        r4 = r4.n;
        r3 = defpackage.amqq.a(r3, r4);
        if (r3 != 0) goto L_0x0094;
    L_0x0089:
        r3 = r5.U;
        r3 = r3.h();
        if (r3 != 0) goto L_0x0092;
    L_0x0091:
        goto L_0x0094;
    L_0x0092:
        r3 = 1;
        goto L_0x0095;
    L_0x0094:
        r3 = 0;
    L_0x0095:
        defpackage.xpr.a(r0, r3);
        r0 = r5.z;
        r3 = r5.ad;
        r3 = r3.n;
        r4 = defpackage.aicd.i;
        r4 = r4.n;
        r3 = defpackage.amqq.a(r3, r4);
        if (r3 != 0) goto L_0x00ad;
    L_0x00a8:
        r3 = r5.U;
        r3.h();
    L_0x00ad:
        defpackage.xpr.a(r0, r2);
        r0 = r5.ae;
        r3 = r5.U;
        r3 = r3.g();
        r3 = r3 ^ r1;
        defpackage.xpr.a(r0, r3);
        r0 = r5.w;
        defpackage.xpr.a(r0, r1);
        r0 = r5.g;
        r3 = r5.ad;
        r3 = r3.p;
        defpackage.xpr.a(r0, r3);
        r0 = r5.q;
        r3 = r5.ad;
        r3 = defpackage.aicd.b(r3);
        if (r3 != 0) goto L_0x00db;
    L_0x00d4:
        r3 = r5.W;
        if (r3 == 0) goto L_0x00d9;
    L_0x00d8:
        goto L_0x00db;
    L_0x00d9:
        r3 = 1;
        goto L_0x00dc;
    L_0x00db:
        r3 = 0;
    L_0x00dc:
        defpackage.xpr.a(r0, r3);
        r0 = r5.i;
        defpackage.xpr.a(r0, r1);
        r0 = r5.r;
        r3 = r5.ac;
        defpackage.xpr.a(r0, r3);
        r0 = r5.s;
        r3 = r5.ad;
        r3 = defpackage.aicd.a(r3);
        defpackage.xpr.a(r0, r3);
        r0 = r5.v;
        r3 = r5.U;
        r3 = r3.h();
        if (r3 == 0) goto L_0x0109;
    L_0x0100:
        r3 = r5.ad;
        r3 = r3.w;
        if (r3 == 0) goto L_0x0107;
    L_0x0106:
        goto L_0x0109;
    L_0x0107:
        r3 = 1;
        goto L_0x010a;
    L_0x0109:
        r3 = 0;
    L_0x010a:
        defpackage.xpr.a(r0, r3);
        r0 = r5.B;
        r3 = r5.U;
        r3 = r3.i();
        r4 = 4;
        if (r3 == 0) goto L_0x0120;
    L_0x0118:
        r3 = r5.ad;
        r3 = r3.u;
        if (r3 != 0) goto L_0x011f;
    L_0x011e:
        goto L_0x0120;
    L_0x011f:
        r4 = 0;
    L_0x0120:
        r0.setVisibility(r4);
        r0 = r5.ad;
        r0 = r0.v;
        if (r0 == 0) goto L_0x013d;
    L_0x0129:
        r0 = r5.aa;
        if (r0 == 0) goto L_0x012e;
    L_0x012d:
        goto L_0x0133;
    L_0x012e:
        r0 = r5.ab;
        if (r0 != 0) goto L_0x0133;
    L_0x0132:
        goto L_0x013d;
    L_0x0133:
        r0 = r5.U;
        r0 = r0.a;
        r3 = defpackage.aicj.NEW;
        if (r0 != r3) goto L_0x013c;
    L_0x013b:
        goto L_0x013d;
    L_0x013c:
        r2 = 1;
    L_0x013d:
        r0 = r5.C;
        defpackage.xpr.a(r0, r2);
        r0 = r5.D;
        defpackage.xpr.a(r0, r2);
        r0 = r5.C;
        r2 = r5.aa;
        r0.setEnabled(r2);
        r0 = r5.D;
        r2 = r5.ab;
        r0.setEnabled(r2);
        r0 = r5.k;
        defpackage.xpr.a(r0, r1);
        r0 = r5.H;
        r0.c();
        defpackage.xpr.a(r5, r1);
        return r1;
    L_0x0163:
        r0 = r5.L;
        r0.a(r1);
        r0 = r5.y;
        defpackage.xpr.a(r0, r2);
        r0 = r5.z;
        defpackage.xpr.a(r0, r2);
        r0 = r5.E;
        defpackage.xpr.a(r0, r2);
        r0 = r5.j;
        defpackage.xpr.a(r0, r2);
        r0 = r5.ae;
        defpackage.xpr.a(r0, r2);
        r0 = r5.w;
        defpackage.xpr.a(r0, r2);
        r0 = r5.g;
        r3 = r5.ad;
        r3 = r3.w;
        if (r3 == 0) goto L_0x0199;
    L_0x018e:
        r3 = r5.U;
        r3 = r3.h();
        if (r3 != 0) goto L_0x0197;
    L_0x0196:
        goto L_0x0199;
    L_0x0197:
        r3 = 1;
        goto L_0x019a;
    L_0x0199:
        r3 = 0;
    L_0x019a:
        defpackage.xpr.a(r0, r3);
        r0 = r5.s;
        defpackage.xpr.a(r0, r2);
        r0 = r5.v;
        defpackage.xpr.a(r0, r2);
        r0 = r5.i;
        defpackage.xpr.a(r0, r2);
        r0 = r5.H;
        r0.c();
        r0 = r5.B;
        defpackage.xpr.a(r0, r2);
        r0 = r5.C;
        defpackage.xpr.a(r0, r2);
        r0 = r5.D;
        defpackage.xpr.a(r0, r2);
        r0 = r5.ad;
        r0 = r0.w;
        if (r0 == 0) goto L_0x01ce;
    L_0x01c6:
        r0 = r5.U;
        r0 = r0.h();
        if (r0 != 0) goto L_0x01d8;
    L_0x01ce:
        r0 = r5.U;
        r0 = r0.i();
        if (r0 != 0) goto L_0x01d7;
    L_0x01d6:
        goto L_0x01d8;
    L_0x01d7:
        r1 = 0;
    L_0x01d8:
        defpackage.xpr.a(r5, r1);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mte.l():boolean");
    }

    private final void i(boolean z) {
        this.M.setDuration((long) (!z ? this.P : this.O));
        this.S.setDuration((long) (!z ? this.P : this.O));
        this.R.setDuration((long) (!z ? this.P : this.O));
        this.L.a(new mtg(this));
        if (!this.ad.w) {
            a(this.g);
        }
        a(this.ae);
        a(this.y);
        a(this.w);
        a(this.v);
        a(this.i);
        a(this.s);
        a(this.z);
        a(this.E);
        a(this.j);
        a(this.B);
        a(this.C);
        a(this.D);
        this.H.a(this.M);
    }

    private final boolean m() {
        return (this.V || this.ac) ? false : true;
    }

    public final void a(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.M);
        } else if (this.ad.o && m()) {
            f();
        }
    }

    public final void b(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.N);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void j() {
        this.I.removeMessages(1);
        this.L.a(mtf.a);
        this.g.clearAnimation();
        this.i.clearAnimation();
        this.s.clearAnimation();
        this.w.clearAnimation();
        this.v.clearAnimation();
        this.ae.clearAnimation();
        this.z.clearAnimation();
        this.E.clearAnimation();
        this.j.clearAnimation();
        this.C.clearAnimation();
        this.D.clearAnimation();
        this.B.clearAnimation();
        this.y.clearAnimation();
    }

    public final void a(Map map) {
        aihq aihq = this.h;
        aihq.u = map;
        this.g.a(aihq);
    }
}
