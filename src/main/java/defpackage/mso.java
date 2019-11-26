package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.jar.MinimalTimeBar;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Map;

/* renamed from: mso */
public final class mso extends aiuc implements aibb, aifc, aigc, aihv, aiub, Callback, OnClickListener, AnimationListener, muz {
    private boolean A;
    private boolean B;
    public mvt a;
    public msk b;
    public final msp c;
    public boolean d;
    private aigf e;
    private aihy f;
    private aiff g;
    private muy h;
    private final mub i;
    private final MinimalTimeBar j;
    private final ProgressBar k;
    private final ImageButton l;
    private final ImageButton m;
    private final ImageButton n;
    private final ImageView o;
    private final TextView p;
    private final Handler q;
    private final Animation r;
    private final aiga s;
    private aicd t;
    private aich u = aich.a();
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public mso(Context context, mub mub) {
        super(context);
        this.i = (mub) amqw.a((Object) mub);
        this.c = new msp(context, new msn(this), new msq(this));
        this.j = new MinimalTimeBar(context);
        addView(this.c);
        addView(this.j);
        this.k = new ProgressBar(context);
        this.k.setIndeterminate(true);
        addView(this.k);
        this.l = new ImageButton(context);
        this.l.setBackgroundResource(R.drawable.api_btn_play);
        this.l.setOnClickListener(this);
        this.l.setContentDescription(context.getText(R.string.accessibility_play));
        addView(this.l);
        this.o = new ImageView(context);
        this.o.setBackgroundResource(R.drawable.api_btn_unavailable);
        addView(this.o);
        this.p = new TextView(context);
        this.p.setGravity(17);
        this.p.setBackgroundResource(R.drawable.api_player_bar);
        this.p.setTextColor(-1);
        this.p.setMinimumHeight(this.c.a);
        addView(this.p, -1, -2);
        this.m = new ImageButton(context);
        this.m.setBackgroundResource(R.drawable.api_btn_next);
        this.m.setOnClickListener(this);
        this.m.setContentDescription(context.getText(R.string.accessibility_next));
        addView(this.m);
        this.n = new ImageButton(context);
        this.n.setBackgroundResource(R.drawable.api_btn_prev);
        this.n.setOnClickListener(this);
        this.n.setContentDescription(context.getText(R.string.accessibility_previous));
        addView(this.n);
        this.q = new Handler(this);
        this.r = new AlphaAnimation(1.0f, 0.0f);
        this.r.setAnimationListener(this);
        this.r.setInterpolator(new LinearInterpolator());
        this.s = new aiga(context);
        a(aicd.a);
        f();
    }

    public final void a(ajis ajis) {
    }

    public final void a(CharSequence charSequence) {
    }

    public final void d_(boolean z) {
    }

    public final void f(boolean z) {
    }

    public final void g() {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void a(aibe aibe) {
        this.a = new mvt(aibe, new mvr(this.i));
        aigf aigf = this.e;
        if (aigf != null) {
            this.a.a = aigf;
        }
        aihy aihy = this.f;
        if (aihy != null) {
            this.a.b = aihy;
        }
        aiff aiff = this.g;
        if (aiff != null) {
            this.a.c = aiff;
        }
        muy muy = this.h;
        if (muy != null) {
            this.a.d = muy;
        }
        msp msp = this.c;
        Object obj = this.a;
        msp.e = obj;
        msp.b.i = (aibe) amqw.a(obj);
    }

    public final void a(aigf aigf) {
        this.e = aigf;
        mvt mvt = this.a;
        if (mvt != null) {
            mvt.a = this.e;
        }
    }

    public final void a(aihy aihy) {
        this.f = aihy;
        mvt mvt = this.a;
        if (mvt != null) {
            mvt.b = this.f;
        }
    }

    public final void a(aiff aiff) {
        this.g = aiff;
        mvt mvt = this.a;
        if (mvt != null) {
            mvt.c = this.g;
        }
    }

    public final void a(muy muy) {
        this.h = muy;
        mvt mvt = this.a;
        if (mvt != null) {
            mvt.d = muy;
        }
    }

    public final void a(aich aich) {
        if (this.u.equals(aich)) {
            c();
            return;
        }
        this.u = aich;
        e();
    }

    public final void a(String str, boolean z) {
        aich e;
        if (z) {
            e = aich.e();
        } else {
            e = aich.f();
        }
        this.u = e;
        this.o.setImageResource(!z ? R.drawable.api_btn_unavailable : R.drawable.api_btn_replay);
        this.p.setText(str);
        j();
        e();
    }

    public final void g(boolean z) {
        this.c.b.a.setVisibility(!z ? 8 : 0);
    }

    public final void a(aajq[] aajqArr, int i, boolean z) {
        mss mss = this.c.b;
        mss.f = aajqArr;
        mss.g = i;
    }

    public final void b(boolean z) {
        this.v = z;
        j();
    }

    public final void b_(boolean z) {
        this.w = z;
        j();
    }

    public final void h_(boolean z) {
        this.c.a(z);
    }

    public final void c_(boolean z) {
        this.c.d.setVisibility(!z ? 0 : 8);
    }

    public final void au_() {
        this.c.a(0, 0, 0);
        this.j.a(0, 0, 0);
    }

    public final void c(boolean z) {
        this.c.c.setEnabled(z);
    }

    public final void a(long j, long j2, long j3, long j4) {
        this.c.a(j, j3, j4);
        this.j.a(j, j3, j4);
    }

    public final void a(aicd aicd) {
        this.t = aicd;
        msp msp = this.c;
        if (aicd == aicd.k) {
            msp.c.setVisibility(8);
            msp.f.setVisibility(0);
        } else {
            msp.c.a(aicd);
            msp.c.setVisibility(0);
            msp.f.setVisibility(8);
        }
        this.j.a(aicd);
    }

    public final void h(boolean z) {
        this.x = z;
        j();
    }

    public final void i(boolean z) {
        this.z = z;
        if (z) {
            f();
            j();
        } else if (this.u.a == aicj.PAUSED || this.u.a == aicj.ENDED) {
            e();
        } else {
            j();
        }
    }

    public final void e() {
        if (!this.z) {
            boolean z = this.A;
            d();
            this.A = false;
            j();
            setFocusable(false);
            if (z) {
                mvt mvt = this.a;
                if (mvt != null) {
                    mvt.g();
                }
            }
            c();
        }
    }

    public final void a(Map map) {
        this.c.c.a = map;
    }

    public final void c() {
        if ((this.u.a == aicj.PLAYING || this.u.b) && !this.A && !this.q.hasMessages(1)) {
            this.q.sendEmptyMessageDelayed(1, 2500);
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        j(false);
        return true;
    }

    private final void j(boolean z) {
        this.B = true;
        this.r.setDuration(!z ? 500 : 100);
        if (!this.x) {
            a(this.c);
        }
        a(this.l);
        a(this.m);
        a(this.n);
    }

    private final void a(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.r);
        }
    }

    public final void d() {
        this.B = false;
        this.q.removeMessages(1);
        this.r.setAnimationListener(null);
        if (!this.x) {
            this.c.clearAnimation();
        }
        this.m.clearAnimation();
        this.n.clearAnimation();
        this.l.clearAnimation();
        this.r.setAnimationListener(this);
    }

    public final void onAnimationEnd(Animation animation) {
        this.B = false;
        f();
    }

    public final void f() {
        d();
        if (!this.A) {
            this.A = true;
            this.c.b.setVisibility(4);
            j();
            setFocusable(true);
            requestFocus();
            mvt mvt = this.a;
            if (mvt != null) {
                mvt.h();
            }
        }
    }

    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        mvt mvt = this.a;
        boolean z = true;
        if ((motionEvent.getFlags() & 1) == 0) {
            z = false;
        }
        mvt.a(z);
        return super.onFilterTouchEventForSecurity(motionEvent);
    }

    public final void onClick(View view) {
        if (this.a != null) {
            if (view == this.m) {
                f();
                this.a.b();
            } else if (view == this.n) {
                f();
                this.a.a();
            } else if (view == this.l) {
                if (this.u.a == aicj.ENDED) {
                    this.a.j();
                } else if (this.u.a == aicj.PLAYING) {
                    this.a.d();
                } else if (this.u.a == aicj.PAUSED) {
                    this.a.aJ_();
                }
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!keyEvent.isSystem() || aitz.a(i)) {
            e();
            if (this.u.a == aicj.RECOVERABLE_ERROR) {
                this.a.i();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARNING: Missing block: B:33:0x0078, code skipped:
            if (r7 <= ((float) r4.getBottom())) goto L_0x007e;
     */
    /* JADX WARNING: Missing block: B:35:0x007c, code skipped:
            if (r6.B != false) goto L_0x007e;
     */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r0 = r7.getActionMasked();
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x002f;
    L_0x0008:
        if (r0 == r2) goto L_0x0013;
    L_0x000a:
        r7 = 3;
        if (r0 == r7) goto L_0x000f;
    L_0x000d:
        goto L_0x0084;
    L_0x000f:
        r6.y = r1;
        goto L_0x0084;
    L_0x0013:
        r7 = r6.u;
        r7 = r7.a;
        r0 = defpackage.aicj.RECOVERABLE_ERROR;
        if (r7 != r0) goto L_0x0021;
    L_0x001b:
        r7 = r6.a;
        r7.i();
        goto L_0x002c;
    L_0x0021:
        r7 = r6.A;
        if (r7 != 0) goto L_0x002c;
    L_0x0025:
        r7 = r6.y;
        if (r7 != 0) goto L_0x002c;
    L_0x0029:
        r6.j(r2);
    L_0x002c:
        r6.y = r1;
        goto L_0x0084;
    L_0x002f:
        r0 = r6.A;
        if (r0 != 0) goto L_0x007e;
    L_0x0033:
        r0 = r7.getX();
        r7 = r7.getY();
        r3 = r6.x;
        if (r3 != 0) goto L_0x0042;
    L_0x003f:
        r4 = r6.c;
        goto L_0x0044;
    L_0x0042:
        r4 = r6.j;
    L_0x0044:
        if (r3 != 0) goto L_0x0056;
    L_0x0046:
        r3 = r6.d;
        if (r3 != 0) goto L_0x0056;
    L_0x004a:
        r3 = r6.c;
        r3 = r3.getBottom();
        r5 = r6.c;
        r5 = r5.a;
        r3 = r3 - r5;
        goto L_0x005a;
    L_0x0056:
        r3 = r4.getTop();
    L_0x005a:
        r5 = r4.getLeft();
        r5 = (float) r5;
        r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r5 > 0) goto L_0x007a;
    L_0x0063:
        r5 = r4.getRight();
        r5 = (float) r5;
        r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r0 > 0) goto L_0x007a;
    L_0x006c:
        r0 = (float) r3;
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 > 0) goto L_0x007a;
    L_0x0071:
        r0 = r4.getBottom();
        r0 = (float) r0;
        r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r7 <= 0) goto L_0x007e;
    L_0x007a:
        r7 = r6.B;
        if (r7 == 0) goto L_0x007f;
    L_0x007e:
        r1 = 1;
    L_0x007f:
        r6.y = r1;
        r6.e();
    L_0x0084:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mso.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        View view;
        int defaultSize = mso.getDefaultSize(0, i);
        setMeasuredDimension(defaultSize, mso.getDefaultSize(0, i2));
        defaultSize = (defaultSize * 10) / 100;
        TextView textView = this.p;
        textView.setPadding(defaultSize, textView.getPaddingTop(), defaultSize, this.p.getPaddingBottom());
        measureChild(this.k, i, i2);
        measureChild(this.l, i, i2);
        measureChild(this.o, i, i2);
        measureChild(this.p, i, i2);
        measureChild(this.m, i, i2);
        measureChild(this.n, i, i2);
        if (this.x) {
            view = this.j;
        } else {
            view = this.c;
        }
        measureChild(view, i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i4 -= i2;
        int paddingLeft = getPaddingLeft();
        i2 = i4 - getPaddingBottom();
        i3 = (i3 - i) / 2;
        i4 /= 2;
        View view = !this.x ? this.c : this.j;
        view.layout(paddingLeft, i2 - view.getMeasuredHeight(), view.getMeasuredWidth() + paddingLeft, i2);
        mso.a(this.l, i3, i4);
        mso.a(this.o, i3, i4);
        mso.a(this.k, i3, i4);
        mso.a(this.n, this.l.getLeft() - (this.n.getMeasuredWidth() / 2), i4);
        mso.a(this.m, this.l.getRight() + (this.m.getMeasuredWidth() / 2), i4);
        TextView textView = this.p;
        textView.layout(paddingLeft, i2 - textView.getMeasuredHeight(), this.p.getMeasuredWidth() + paddingLeft, i2);
    }

    private static void a(View view, int i, int i2) {
        i -= view.getMeasuredWidth() / 2;
        i2 -= view.getMeasuredHeight() / 2;
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    public final void j() {
        View view;
        boolean z;
        if (this.u.a == aicj.PAUSED) {
            this.l.setBackgroundResource(R.drawable.api_btn_play);
            this.l.setContentDescription(getContext().getText(R.string.accessibility_play));
        } else if (this.u.a == aicj.PLAYING) {
            this.l.setBackgroundResource(R.drawable.api_btn_pause);
            this.l.setContentDescription(getContext().getText(R.string.accessibility_pause));
        } else {
            this.l.setBackgroundResource(R.drawable.api_btn_replay);
            this.l.setContentDescription(getContext().getText(R.string.accessibility_replay));
        }
        boolean z2 = false;
        Object obj = (!this.d || this.c.getTop() >= this.l.getBottom()) ? null : 1;
        if (this.A || this.u.g() || this.u.a == aicj.NEW) {
            boolean z3;
            for (int i = 0; i < getChildCount(); i++) {
                boolean z4;
                View childAt = getChildAt(i);
                if ((childAt == this.k && this.u.b) || (((childAt == this.o || childAt == this.p) && this.u.g()) || (childAt == this.j && this.x))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                mso.a(childAt, z4);
            }
            if (!this.x || this.z) {
                aich aich = this.u;
                if (!(aich.b || aich.g())) {
                    z3 = false;
                    mso.a((View) this, z3);
                }
            }
            z3 = true;
            mso.a((View) this, z3);
        } else {
            view = this.o;
            z = this.u.g() && obj == null;
            mso.a(view, z);
            view = this.p;
            z = this.u.g() && obj == null;
            mso.a(view, z);
            view = this.k;
            z = this.u.b && obj == null;
            mso.a(view, z);
            view = this.l;
            z = !this.u.g() && !this.u.b && this.t.u && obj == null;
            mso.a(view, z);
            mso.a(this.c, this.x ^ 1);
            view = this.j;
            z = this.t.p && this.x;
            mso.a(view, z);
            setVisibility(0);
        }
        obj = (this.A || this.u.b || !this.t.v || obj != null) ? null : 1;
        view = this.m;
        z = obj != null && this.v;
        mso.a(view, z);
        view = this.n;
        if (obj != null && this.w) {
            z2 = true;
        }
        mso.a(view, z2);
    }

    private static void a(View view, boolean z) {
        view.setVisibility(!z ? 8 : 0);
    }

    public final void d(boolean z) {
        this.c.b.b.setVisibility(!z ? 8 : 0);
    }

    public final void e(boolean z) {
        this.c.b.b.setSelected(z);
    }

    public final void i() {
        xpr.a(getContext(), getContext().getText(R.string.no_subtitles), 0);
    }

    public final void a(List list) {
        this.s.a(list, this.a);
    }

    public final void h() {
        this.s.a();
        a(aicd.a);
    }
}
