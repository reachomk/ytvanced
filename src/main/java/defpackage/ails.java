package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: ails */
public abstract class ails extends FrameLayout implements aimf, aimp {
    private final aims a;
    private final akpd b;
    public final acvx c;
    public final aime d;
    public final int e;
    public View f;
    public aimg g;
    public int h;
    private final Rect i = new Rect();
    private final int j;
    private RecyclerView k;
    private byte[] l;
    private boolean m;
    private float n;
    private int o;
    private int p;
    private int q;
    private ObjectAnimator r;

    public ails(Context context, aims aims, acvx acvx, akpe akpe, akkq akkq, aaas aaas, int i) {
        super(context);
        this.a = (aims) amqw.a((Object) aims);
        this.c = (acvx) amqw.a((Object) acvx);
        this.j = i;
        this.d = new aime(aims);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.related_end_screen_peek_margin);
        this.b = akpe.a(a(akkq, aaas));
        this.b.a(new ailv(this));
    }

    public abstract akpb a(akkq akkq, aaas aaas);

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    public abstract int b();

    public abstract int d();

    /* Access modifiers changed, original: protected */
    public void e() {
    }

    private final boolean l() {
        return (this.k == null || this.f == null) ? false : true;
    }

    public final void a(Rect rect) {
        if (!this.i.equals(rect)) {
            this.i.set(rect);
            m();
        }
    }

    private final void m() {
        if (l()) {
            this.k.setPadding(this.i.left + this.o, this.k.getPaddingTop(), this.i.right + this.p, this.i.bottom + this.q);
            this.k.c(0);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g.a(this, motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.g.a(this, motionEvent);
    }

    public final void a(boolean z) {
        this.d.c = z;
    }

    public final void b(float f) {
        a(true, f);
    }

    public final void c(float f) {
        a(true, f);
    }

    public final void d(float f) {
        a(false, f);
    }

    private final void a(boolean z, float f) {
        if (!l() || this.d.c() || this.a.a()) {
            this.m = false;
            return;
        }
        if (!this.m) {
            this.n = this.f.getTranslationY();
            this.m = true;
        }
        float min = Math.min(Math.max(this.n + f, (float) d(2)), (float) d(1));
        this.d.a(e(min), true);
        if (z) {
            a(min);
            return;
        }
        this.m = false;
        a(min);
        if (min > (((float) d(1)) + ((float) d(2))) / 2.0f) {
            a(1, true, 1);
        } else {
            a(2, true, 1);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(float f) {
        this.f.setTranslationY(f);
    }

    /* Access modifiers changed, original: protected|final */
    public final float e(float f) {
        float d = (float) d(2);
        return 1.0f - ((f - d) / (((float) d(1)) - d));
    }

    /* Access modifiers changed, original: protected|final */
    public final void g() {
        if (!l()) {
            LayoutInflater.from(getContext()).inflate(this.j, this);
            this.k = (RecyclerView) findViewById(R.id.related_endscreen_results);
            this.f = findViewById(R.id.related_endscreen_container);
            Context context = getContext();
            this.k.a(null);
            this.o = this.k.getPaddingLeft();
            this.p = this.k.getPaddingRight();
            this.q = this.k.getPaddingBottom();
            apn ailu = new ailu(this, context);
            ailu.b(0);
            this.k.a(ailu);
            this.k.a(this.b);
            RecyclerView recyclerView = this.k;
            recyclerView.a(new ailt(recyclerView));
            m();
            if (this.h > 0) {
                h();
            }
            a();
        }
    }

    public final void a(aknh aknh) {
        this.b.a(aknh);
    }

    public final void a(byte[] bArr) {
        this.l = bArr;
        if (this.l != null) {
            e();
        }
    }

    public final void h() {
        if (l()) {
            LayoutParams layoutParams = this.f.getLayoutParams();
            if (layoutParams instanceof MarginLayoutParams) {
                ((MarginLayoutParams) layoutParams).bottomMargin = this.h;
                this.f.setLayoutParams(layoutParams);
                a(this.d.a, false, 0);
            }
        }
    }

    public final void a(int i) {
        a(2, i);
    }

    public final void i() {
        b(0);
    }

    public final void b(int i) {
        a(this.d.e(), i);
    }

    public final void c(int i) {
        a(i, 0);
    }

    private final void a(int i, int i2) {
        if (i == 1) {
            b(this.d.e(), i2);
        } else {
            b(i, i2);
        }
    }

    private final void b(int i, int i2) {
        if (this.d.a != i) {
            a(i, true, i2);
        }
    }

    /* Access modifiers changed, original: protected */
    public void f() {
        if (this.d.a()) {
            byte[] bArr = this.l;
            if (bArr != null) {
                this.c.a(new acvs(bArr), null);
            }
        }
    }

    public final void a(int i, boolean z, int i2) {
        aime aime = this.d;
        int i3 = aime.a;
        aime.a = i;
        for (aimd a : aime.d) {
            a.a(i3, i, i2);
        }
        if (!l()) {
            if (i != 0) {
                g();
            }
        }
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.r.removeAllListeners();
            this.r.cancel();
            this.r = null;
        }
        if (z) {
            i = d(i);
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{(float) i});
            this.r = ObjectAnimator.ofPropertyValuesHolder(this.f, new PropertyValuesHolder[]{ofFloat}).setDuration(300);
            this.r.addListener(new ailw(this));
            this.r.addUpdateListener(new ailr(this));
            this.r.start();
            return;
        }
        j();
    }

    public final void j() {
        if (this.d.c()) {
            this.f.setVisibility(8);
            this.k.setContentDescription(null);
        }
        if (this.d.a()) {
            this.k.setContentDescription(getContext().getResources().getString(R.string.accessibility_related_screen_swipe_down));
        } else if (this.d.b()) {
            this.k.setContentDescription(getContext().getResources().getString(R.string.accessibility_related_screen_swipe_up));
        }
        f();
        float d = (float) d(this.d.a);
        a(d);
        this.d.a(e(d), false);
    }

    public final void k() {
        a(0, false, 0);
    }

    public int c() {
        return this.e;
    }

    private final int d(int i) {
        if (i != 0) {
            return i == 1 ? b() : 0;
        } else {
            return d();
        }
    }
}
