package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: mum */
public final class mum extends View {
    public Map a;
    private final mup b;
    private final mun c;
    private final StateListDrawable d = new StateListDrawable();
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final Rect i;
    private final Rect j;
    private final Rect k;
    private final Rect l;
    private final Paint m;
    private final Paint n;
    private aicd o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private String v;
    private String w;

    public mum(Context context, mup mup) {
        super(context);
        this.b = (mup) amqw.a((Object) mup, (Object) "listener cannot be null");
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        this.e = (int) ((230.0f * f) + 0.5f);
        this.g = (int) ((5.0f * f) + 0.5f);
        this.h = (int) ((12.0f * f) + 0.5f);
        this.f = (int) ((f * 8.0f) + 0.5f);
        this.c = new mun(context);
        this.d.addState(View.PRESSED_ENABLED_STATE_SET, ra.a(context, (int) R.drawable.api_scrubber_selected));
        this.d.addState(View.ENABLED_STATE_SET, ra.a(context, (int) R.drawable.api_scrubber));
        this.d.setState(View.ENABLED_STATE_SET);
        this.i = new Rect();
        this.m = new Paint();
        this.m.setTextSize(TypedValue.applyDimension(2, 14.0f, displayMetrics));
        this.m.setColor(-1);
        this.m.setAntiAlias(true);
        this.m.getTextBounds("00:00", 0, 5, this.i);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.n = new Paint();
        this.n.setColor(Color.parseColor("#B2FFFF00"));
        a(aicd.a);
        a(0, 0, 0);
    }

    public final void a(aicd aicd) {
        int[] iArr;
        this.o = aicd;
        a();
        mun mun = this.c;
        if (aicd != aicd.i) {
            iArr = mvk.a;
        } else {
            iArr = mvk.b;
        }
        mun.setState(iArr);
        invalidate();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        a();
    }

    private final void a() {
        boolean z = false;
        if (this.o.t && isEnabled() && this.t > 0) {
            z = true;
        }
        this.p = z;
        if (this.q && !z) {
            b();
        }
        c();
    }

    public final void a(long j, long j2, long j3) {
        long j4 = this.t;
        this.s = j;
        this.u = j3;
        this.t = j2;
        if (j2 != j4 || this.w == null) {
            a();
            this.w = a(j2);
            if (j2 / 3600000 != j4 / 3600000) {
                a(getWidth(), getHeight());
            }
        }
        c();
        invalidate();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(mum.getDefaultSize(this.c.getIntrinsicWidth(), i), mum.getDefaultSize(Math.max(this.i.height(), Math.max(this.j.height(), this.k.height())), i2));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a(i, i2);
        c();
    }

    private final void a(int i, int i2) {
        long j = this.t;
        String str = j >= 36000000 ? "10:00:00" : j < 3600000 ? "00:00" : "0:00:00";
        this.m.getTextBounds(str, 0, str.length(), this.i);
        int intrinsicHeight = this.c.getIntrinsicHeight();
        mun mun;
        int width;
        int i3;
        if (i >= this.e) {
            mun = this.c;
            width = this.i.width();
            i3 = this.f;
            int i4 = (i2 / 2) - (intrinsicHeight / 2);
            mun.setBounds(width + i3, i4, (i - i3) - this.i.width(), i4 + intrinsicHeight);
            this.i.offset(0, this.c.getBounds().centerY() - this.i.centerY());
        } else {
            mun = this.c;
            width = this.f;
            i3 = (i2 / 2) - (intrinsicHeight / 2);
            mun.setBounds(width, i3, i - width, i3 + intrinsicHeight);
        }
        this.c.copyBounds(this.k);
        this.k.inset(0, (-(i2 - intrinsicHeight)) / 2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        b();
                        return true;
                    }
                } else if (this.q) {
                    this.r = a((int) motionEvent.getX());
                    c();
                    return true;
                }
            } else if (this.q) {
                b();
                this.b.a((int) this.r);
                return true;
            }
        } else if (!this.q && this.p) {
            actionMasked = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.j.contains(actionMasked, y) || this.k.contains(actionMasked, y)) {
                this.q = true;
                getParent().requestDisallowInterceptTouchEvent(true);
                this.d.setState(View.PRESSED_ENABLED_STATE_SET);
                this.r = a((int) motionEvent.getX());
                c();
                this.b.a();
                return true;
            }
        }
        return false;
    }

    private final void b() {
        this.q = false;
        this.d.setState(ENABLED_STATE_SET);
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(false);
    }

    private final long a(int i) {
        Rect bounds = this.c.getBounds();
        int i2 = bounds.left + this.h;
        int i3 = bounds.right - this.h;
        return (this.t * ((long) (Math.min(i3, Math.max(i2, i)) - i2))) / ((long) (i3 - i2));
    }

    private final void c() {
        Rect bounds = this.c.getBounds();
        int i = this.h;
        int width = (bounds.width() - this.h) - i;
        long j = !this.q ? this.s : this.r;
        long j2 = this.t;
        int i2 = 0;
        int i3 = j2 > 0 ? (int) (((long) i) + ((((long) width) * j) / j2)) : 0;
        StateListDrawable stateListDrawable = this.d;
        int i4 = bounds.left;
        int centerY = bounds.centerY();
        int intrinsicWidth = stateListDrawable.getIntrinsicWidth();
        int intrinsicHeight = stateListDrawable.getIntrinsicHeight();
        i4 = (i4 + i3) - (intrinsicWidth / 2);
        centerY -= intrinsicHeight / 2;
        stateListDrawable.setBounds(i4, centerY, intrinsicWidth + i4, intrinsicHeight + centerY);
        this.d.copyBounds(this.j);
        i4 = -this.g;
        this.j.inset(i4, i4);
        int width2 = bounds.width() > 0 ? (i3 * 100) / bounds.width() : 0;
        i3 = width > 0 ? ((i3 - i) * 100) / width : 0;
        if (!this.p) {
            width2 = i3;
        }
        j2 = this.t;
        i3 = j2 > 0 ? (int) (((long) i) + ((this.u * ((long) width)) / j2)) : 0;
        if (width > 0) {
            i2 = ((i3 - i) * 100) / width;
        }
        this.c.setLevel((i2 * 1000) + width2);
        this.v = a(j);
        invalidate();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.c.draw(canvas);
        if (this.p) {
            this.d.draw(canvas);
        }
        if (getWidth() >= this.e) {
            this.m.setTextAlign(Align.RIGHT);
            canvas.drawText(this.v, (float) this.i.right, (float) this.i.bottom, this.m);
            this.m.setTextAlign(Align.RIGHT);
            canvas.drawText(this.w, (float) getWidth(), (float) this.i.bottom, this.m);
        }
        Map map = this.a;
        if (map != null && this.t > 0) {
            aihs[] aihsArr = (aihs[]) map.get(aihu.AD_MARKER);
            if (aihsArr != null) {
                Rect bounds = this.c.getBounds();
                this.l.top = bounds.top;
                this.l.bottom = bounds.bottom;
                for (aihs aihs : aihsArr) {
                    long j = aihs.a;
                    if (j == 9223372036854775806L) {
                        this.l.right = bounds.right;
                        Rect rect = this.l;
                        rect.left = rect.right - 4;
                    } else {
                        j = Math.min(this.t, Math.max(0, j));
                        int i = bounds.left + this.h;
                        int i2 = bounds.right;
                        int i3 = this.h;
                        long j2 = this.t;
                        Rect rect2 = this.l;
                        double d = (double) ((i2 - i3) - i);
                        double d2 = (double) j;
                        double d3 = (double) j2;
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        d2 /= d3;
                        Double.isNaN(d);
                        rect2.left = i + ((int) ((d * d2) - 2.0d));
                        rect2.right = rect2.left + 4;
                    }
                    canvas.drawRect(this.l, this.n);
                }
            }
        }
    }

    private final String a(long j) {
        String format = String.format("%02d:%02d", new Object[]{Integer.valueOf((r10 / 60) % 60), Integer.valueOf((((int) j) / 1000) % 60)});
        int i /= 3600;
        if (this.t < 3600000) {
            return format;
        }
        return String.format("%d:%s", new Object[]{Integer.valueOf(i), format});
    }
}
