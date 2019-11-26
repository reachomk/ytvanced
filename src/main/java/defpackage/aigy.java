package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: aigy */
public abstract class aigy extends View {
    private final int a;
    private int b;
    private int[] c;
    private Point d;
    public aihq l;
    public long m;
    public final aihd n;

    public aigy(aihq aihq, Context context, AttributeSet attributeSet) {
        this(aihq, context, attributeSet, new aihd());
    }

    public abstract void a();

    public abstract void a(float f);

    public abstract boolean a(float f, float f2);

    public abstract void c();

    public abstract long d();

    aigy(aihq aihq, Context context, AttributeSet attributeSet, aihd aihd) {
        super(context, attributeSet);
        this.n = aihd;
        this.l = aihq;
        aihd.b = new aihb(this);
        setAccessibilityDelegate(new aihf(this));
        this.a = (int) (context.getResources().getDisplayMetrics().density * -50.0f);
    }

    public final void a(aiha aiha) {
        this.n.a.add(aiha);
    }

    public final void setEnabled(boolean z) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            a();
        }
    }

    public final void a(aihq aihq) {
        this.l = (aihq) amqw.a((Object) aihq);
        c();
    }

    public final void a(long j) {
        this.m = j;
        c();
    }

    public final long f() {
        return this.l.a() - this.l.e();
    }

    public final long g() {
        return this.l.c() - this.l.e();
    }

    public final long h() {
        return this.l.d() - this.l.e();
    }

    public final long i() {
        return this.m - this.l.e();
    }

    public final long j() {
        return c(this.l.d());
    }

    public final long k() {
        return c(this.m);
    }

    private final long c(long j) {
        if (this.l.l()) {
            return -(this.l.c() - j);
        }
        return j;
    }

    public final boolean l() {
        return this.n.c;
    }

    public final void m() {
        aihd aihd = this.n;
        long d = d();
        if (aihd.c) {
            aihd.a(false, 4, d);
        }
    }

    public final void b(int i) {
        a((float) i);
        long d = d();
        this.m = d;
        this.n.a(1, d);
        c();
    }

    public final void c(int i) {
        a((float) i);
        long d = d();
        this.m = d;
        this.n.a(2, d);
        c();
    }

    public final void n() {
        this.n.a(3, this.m);
        c();
    }

    public final void o() {
        this.n.a(4, this.m);
        c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            Point a = a(motionEvent);
            int i = a.x;
            int i2 = a.y;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3 && this.n.c) {
                            o();
                            return true;
                        }
                    } else if (this.n.c) {
                        if (i2 < this.a) {
                            action = this.b;
                            i = ((i - action) / 3) + action;
                        } else {
                            this.b = i;
                        }
                        c(i);
                        return true;
                    }
                } else if (this.n.c) {
                    n();
                    return true;
                }
            } else if (a((float) i, (float) i2)) {
                b(i);
                return true;
            }
        }
        return false;
    }

    public final Point a(MotionEvent motionEvent) {
        amqw.a((Object) motionEvent);
        if (this.c == null) {
            this.c = new int[2];
        }
        if (this.d == null) {
            this.d = new Point();
        }
        getLocationOnScreen(this.c);
        this.d.set(((int) motionEvent.getRawX()) - this.c[0], ((int) motionEvent.getRawY()) - this.c[1]);
        return this.d;
    }

    public static String b(long j) {
        int i = j < 3600000 ? j < 60000 ? 3 : 4 : 5;
        return xvd.a(j / 1000, i);
    }

    public final String p() {
        return getContext().getResources().getString(R.string.accessibility_player_progress_time, new Object[]{aigy.b(h()), aigy.b(g())});
    }

    public static void a(aihq aihq, long j) {
        boolean z = false;
        if (aihq.l() && j == aihq.c()) {
            z = true;
        }
        aihq.b(z);
    }
}
