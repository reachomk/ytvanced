package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.jar.MinimalTimeBar;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Map;

/* renamed from: muf */
public final class muf extends aiua implements aibb, aifc, aigc, aihv, aiub, Callback, OnClickListener, AnimationListener, muz {
    private static final boolean a = (VERSION.SDK_INT >= 21);
    private mvt b;
    private aigf c;
    private aihy d;
    private aiff e;
    private muy f;
    private final mub g;
    private final MinimalTimeBar h;
    private final ProgressBar i;
    private final aics j;
    private final TouchImageView k;
    private final TouchImageView l;
    private final TouchImageView m;
    private final TextView n;
    private final Animation o;
    private final Animation p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private final Handler u = new Handler(this);
    private aicd v;
    private aich w;

    public muf(Context context, mub mub) {
        super(context);
        this.g = (mub) amqw.a((Object) mub);
        LayoutInflater.from(context).inflate(R.layout.minimal_controls_overlay, this);
        this.h = (MinimalTimeBar) findViewById(R.id.player_minimal_time_bar);
        this.i = (ProgressBar) findViewById(R.id.player_loading_view);
        this.k = (TouchImageView) findViewById(R.id.player_control_play_pause_replay_button);
        this.k.setOnClickListener(this);
        this.j = new aics(this.k, context);
        this.m = (TouchImageView) findViewById(R.id.player_control_previous_button);
        this.m.setOnClickListener(this);
        this.l = (TouchImageView) findViewById(R.id.player_control_next_button);
        this.l.setOnClickListener(this);
        this.n = (TextView) findViewById(R.id.player_error_view);
        if (a) {
            abe.c(this.n, 1);
        }
        this.w = aich.a();
        this.o = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.o.setAnimationListener(this);
        this.p = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.p.setDuration(100);
        a(aicd.a);
        xpr.a((View) this, true);
        e();
    }

    public final View a() {
        return this;
    }

    public final void a(ajis ajis) {
    }

    public final void a(CharSequence charSequence) {
    }

    public final void a(List list) {
    }

    public final void a(Map map) {
    }

    public final void a(aajq[] aajqArr, int i, boolean z) {
    }

    public final void c(boolean z) {
    }

    public final void c_(boolean z) {
    }

    public final void d(boolean z) {
    }

    public final void d_(boolean z) {
    }

    public final void e(boolean z) {
    }

    public final void f(boolean z) {
    }

    public final void g() {
    }

    public final void g(boolean z) {
    }

    public final void h_(boolean z) {
    }

    public final void i() {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void a(aibe aibe) {
        this.b = new mvt(aibe, new mvr(this.g));
        aigf aigf = this.c;
        if (aigf != null) {
            this.b.a = aigf;
        }
        aihy aihy = this.d;
        if (aihy != null) {
            this.b.b = aihy;
        }
        aiff aiff = this.e;
        if (aiff != null) {
            this.b.c = aiff;
        }
        muy muy = this.f;
        if (muy != null) {
            this.b.d = muy;
        }
    }

    public final void a(aigf aigf) {
        this.c = aigf;
        mvt mvt = this.b;
        if (mvt != null) {
            mvt.a = aigf;
        }
    }

    public final void a(aihy aihy) {
        this.d = aihy;
        mvt mvt = this.b;
        if (mvt != null) {
            mvt.b = aihy;
        }
    }

    public final void a(muy muy) {
        this.f = muy;
        mvt mvt = this.b;
        if (mvt != null) {
            mvt.d = muy;
        }
    }

    public final void a(aich aich) {
        if (!this.w.equals(aich)) {
            this.w = aich;
            e();
        } else if ((this.w.a == aicj.PLAYING || this.w.b) && !this.u.hasMessages(1)) {
            this.u.sendEmptyMessageDelayed(1, 2500);
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
        if (xss.l(getContext())) {
            string = getContext().getString(R.string.tap_to_retry);
        } else {
            string = getContext().getString(R.string.click_to_retry);
        }
        TextView textView = this.n;
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
    }

    public final void b(boolean z) {
        this.q = z;
        d();
    }

    public final void b_(boolean z) {
        this.r = z;
        d();
    }

    public final void a(aiff aiff) {
        this.e = aiff;
        mvt mvt = this.b;
        if (mvt != null) {
            mvt.c = aiff;
        }
    }

    public final void au_() {
        this.h.a(0, 0, 0);
    }

    public final void a(long j, long j2, long j3, long j4) {
        this.h.a(j, j3, j4);
    }

    public final void a(aicd aicd) {
        this.v = aicd;
        this.h.a(aicd);
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            i(false);
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            d();
            return true;
        }
    }

    private final void i(boolean z) {
        this.o.setDuration(!z ? 500 : 100);
        a(this.k);
        a(this.l);
        a(this.m);
    }

    private final void a(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.o);
        } else if (this.v.o) {
            f();
        }
    }

    private final void b(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.p);
        }
    }

    private final void c() {
        this.u.removeMessages(1);
        this.l.clearAnimation();
        this.m.clearAnimation();
        this.k.clearAnimation();
    }

    public final void onAnimationEnd(Animation animation) {
        if (animation == this.o) {
            f();
        }
    }

    public final void f() {
        c();
        this.t = true;
        d();
        mvt mvt = this.b;
        if (mvt != null) {
            mvt.h();
        }
    }

    public final void e() {
        c();
        this.t = false;
        d();
        mvt mvt = this.b;
        if (mvt != null) {
            mvt.g();
        }
        if ((this.w.a == aicj.PLAYING || this.w.b) && !this.t && !this.u.hasMessages(1)) {
            this.u.sendEmptyMessageDelayed(1, 2500);
        }
    }

    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        mvt mvt = this.b;
        boolean z = true;
        if ((motionEvent.getFlags() & 1) == 0) {
            z = false;
        }
        mvt.a(z);
        return super.onFilterTouchEventForSecurity(motionEvent);
    }

    public final void onClick(View view) {
        if (this.b != null) {
            if (view == this.l) {
                f();
                this.b.b();
            } else if (view == this.m) {
                f();
                this.b.a();
            } else if (view == this.k) {
                if (this.w.a == aicj.ENDED) {
                    this.b.j();
                } else if (this.w.a == aicj.PLAYING) {
                    this.b.d();
                } else if (this.w.a == aicj.PAUSED) {
                    this.b.aJ_();
                }
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!super.onTouchEvent(motionEvent) && motionEvent.getActionMasked() == 1) {
            if (this.w.a == aicj.RECOVERABLE_ERROR) {
                mvt mvt = this.b;
                if (mvt != null) {
                    mvt.i();
                    return true;
                }
            }
            if (!this.t) {
                c();
                i(true);
            } else if (!this.v.o) {
                e();
                b(this.k);
                b(this.l);
                b(this.m);
            }
        }
        return true;
    }

    public final void h() {
        this.w = aich.a();
        this.q = false;
        this.r = false;
        a(aicd.a);
        au_();
        d();
    }

    private final void d() {
        boolean z;
        this.u.removeMessages(2);
        this.j.a(this.w);
        xpr.a(this.n, this.w.g());
        View view = this.i;
        boolean z2 = false;
        if (!aicd.b(this.v)) {
            aich aich = this.w;
            if (aich.b || aich.a == aicj.NEW) {
                z = true;
                xpr.a(view, z);
                xpr.a(this.h, this.s ^ 1);
                if (!this.s || this.t || this.w.g()) {
                    xpr.a(this.k, false);
                    xpr.a(this.l, false);
                    xpr.a(this.m, false);
                }
                TouchImageView touchImageView = this.k;
                int i = 4;
                if (this.w.i() && this.v.u) {
                    i = 0;
                }
                touchImageView.setVisibility(i);
                if (this.v.v && ((this.q || this.r) && this.w.a != aicj.NEW)) {
                    z2 = true;
                }
                xpr.a(this.l, z2);
                xpr.a(this.m, z2);
                this.l.setEnabled(this.q);
                this.m.setEnabled(this.r);
                return;
            }
        }
        z = false;
        xpr.a(view, z);
        xpr.a(this.h, this.s ^ 1);
        if (this.s) {
        }
        xpr.a(this.k, false);
        xpr.a(this.l, false);
        xpr.a(this.m, false);
    }

    public final void h(boolean z) {
        this.s = z;
        if (z) {
            f();
        } else if (this.w.a == aicj.PAUSED || this.w.a == aicj.ENDED) {
            e();
        } else {
            d();
        }
    }
}
