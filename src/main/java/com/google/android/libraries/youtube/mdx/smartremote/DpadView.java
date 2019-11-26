package com.google.android.libraries.youtube.mdx.smartremote;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.adwg;
import defpackage.adwh;
import defpackage.adwi;
import defpackage.adwj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DpadView extends View {
    private static final int f = Color.argb(255, 144, 144, 144);
    private static final int g = Color.argb(255, 26, 26, 26);
    private static final int h = Color.argb(255, 144, 144, 144);
    private float A;
    private float B;
    public adwj a;
    public adwg b;
    public final Map c = new HashMap(5);
    public final Handler d = new Handler(Looper.getMainLooper());
    public final adwi e = new adwi(this);
    private final adwh i = new adwh(this, this);
    private Drawable j;
    private Path k = new Path();
    private final Map l = new HashMap(5);
    private final ArrayList m = new ArrayList(4);
    private final Paint n = new Paint();
    private int o;
    private float p;
    private float q;
    private float r;
    private final RectF s = new RectF();
    private float t;
    private float u;
    private float v;
    private final RectF w = new RectF();
    private float x;
    private float y;
    private float z;

    public DpadView(Context context) {
        super(context);
        a(context);
    }

    public DpadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public DpadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private final void a(Context context) {
        if (b()) {
            this.j = context.getResources().getDrawable(R.drawable.mdx_dpad_ripple_drawable);
        } else {
            this.o = context.getResources().getColor(R.color.ripple_material_dark);
        }
        abe.a((View) this, this.i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.p = (float) (i >> 1);
        this.q = (float) (i2 >> 1);
        i = Math.min(i2, i);
        float f = (float) i;
        this.r = 0.15f * f;
        float f2 = 0.17f * f;
        RectF rectF = this.s;
        float f3 = this.p;
        float f4 = this.q;
        rectF.set(f3 - f2, f4 - f2, f3 + f2, f4 + f2);
        this.t = 0.11247f * f;
        this.u = 0.12747f * f;
        this.v = (float) (i >> 1);
        this.w.set(0.0f, 0.0f, f, f);
        this.x = 0.34597f * f;
        this.y = 0.36097f * f;
        this.z = 0.34f * f;
        this.A = 0.0375f * f;
        this.B = f * 0.07f;
        this.l.clear();
        this.c.clear();
        Path path = new Path();
        path.addCircle(this.p, this.q, this.r, Direction.CW);
        this.l.put(adwg.ENTER, path);
        Map map = this.c;
        adwg adwg = adwg.ENTER;
        float f5 = this.p;
        f3 = this.r;
        f4 = this.q;
        map.put(adwg, new Rect((int) (f5 - f3), (int) (f4 - f3), (int) (f5 + f3), (int) (f4 + f3)));
        path = new Path();
        f = this.p;
        f2 = f - this.u;
        f5 = this.q;
        f3 = this.t;
        f4 = f5 - f3;
        f -= this.y;
        float f6 = this.x;
        float f7 = f5 - f6;
        f6 += f5;
        f5 += f3;
        path.moveTo(f2, f4);
        f3 = b(f, f7);
        path.arcTo(this.w, f3, (b(f, f6) - f3) - 0.012451172f, false);
        f = b(f2, f5);
        path.arcTo(this.s, f, (b(f2, f4) - f) + 360.0f, false);
        this.l.put(adwg.LEFT, path);
        this.c.put(adwg.LEFT, new Rect(0, (int) f7, (int) f2, (int) f6));
        path = new Path();
        f = this.p;
        f2 = this.t;
        f5 = f - f2;
        f3 = this.q;
        f4 = this.u + f3;
        f6 = this.x;
        f7 = f - f6;
        f3 += this.y;
        f6 += f;
        path.moveTo(f5, f4);
        float b = b(f7, f3);
        path.arcTo(this.w, b, b(f6, f3) - b, false);
        f = b(f + f2, f4);
        path.arcTo(this.s, f, b(f5, f4) - f, false);
        this.l.put(adwg.DOWN, path);
        map = this.c;
        adwg = adwg.DOWN;
        f5 = this.p;
        map.put(adwg, new Rect((int) f7, (int) f4, (int) f6, (int) (f5 + f5)));
        path = new Path();
        f = this.p;
        f2 = this.u + f;
        f5 = this.q;
        f3 = this.t;
        f4 = f5 + f3;
        f += this.y;
        f6 = this.x;
        f7 = f5 + f6;
        f6 = f5 - f6;
        path.moveTo(f2, f4);
        b = b(f, f7);
        path.arcTo(this.w, b, b(f, f6) - b, false);
        f = b(f2, f5 - f3);
        path.arcTo(this.s, f, b(f2, f4) - f, false);
        this.l.put(adwg.RIGHT, path);
        map = this.c;
        adwg = adwg.RIGHT;
        f3 = this.p;
        map.put(adwg, new Rect((int) f2, (int) f6, (int) (f3 + f3), (int) f7));
        path = new Path();
        f = this.p;
        f2 = this.t;
        f5 = f + f2;
        f3 = this.q;
        f4 = f3 - this.u;
        f6 = this.x;
        f7 = f + f6;
        f3 -= this.y;
        f6 = f - f6;
        path.moveTo(f5, f4);
        b = b(f7, f3);
        path.arcTo(this.w, b, b(f6, f3) - b, false);
        f = b(f - f2, f4);
        path.arcTo(this.s, f, b(f5, f4) - f, false);
        this.l.put(adwg.UP, path);
        this.c.put(adwg.UP, new Rect((int) f6, 0, (int) f7, (int) f4));
        this.m.clear();
        path = new Path();
        path.moveTo(this.p - this.z, this.q - this.A);
        path.lineTo((this.p - this.z) - this.B, this.q);
        path.lineTo(this.p - this.z, this.q + this.A);
        this.m.add(path);
        path = new Path();
        path.moveTo(this.p - this.A, this.q + this.z);
        path.lineTo(this.p, (this.q + this.z) + this.B);
        path.lineTo(this.p + this.A, this.q + this.z);
        this.m.add(path);
        path = new Path();
        path.moveTo(this.p + this.z, this.q - this.A);
        path.lineTo((this.p + this.z) + this.B, this.q);
        path.lineTo(this.p + this.z, this.q + this.A);
        this.m.add(path);
        path = new Path();
        path.moveTo(this.p - this.A, this.q - this.z);
        path.lineTo(this.p, (this.q - this.z) - this.B);
        path.lineTo(this.p + this.A, this.q - this.z);
        this.m.add(path);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        adwg a = a(x, y);
        int action = motionEvent.getAction();
        if (action == 0) {
            if (a != null) {
                if (b()) {
                    Drawable drawable = this.j;
                    if (drawable != null) {
                        drawable.setBounds((Rect) this.c.get(a));
                        this.j.setHotspot(x, y);
                        this.j.setState(new int[]{16842910, 16842919});
                    }
                }
                this.k = (Path) this.l.get(a);
                invalidate();
            }
            this.b = a;
            if (this.b != adwg.ENTER) {
                performClick();
                this.d.postDelayed(this.e, 500);
            }
        } else if (action == 1) {
            a();
            if (this.b == adwg.ENTER) {
                performClick();
            } else {
                this.d.removeCallbacks(this.e);
            }
        } else if (action == 2) {
            if (a != this.b) {
                a();
                this.b = null;
                this.d.removeCallbacks(this.e);
            }
            invalidate();
        }
        return true;
    }

    public final boolean performClick() {
        super.performClick();
        adwj adwj = this.a;
        if (adwj != null) {
            adwg adwg = this.b;
            if (adwg != null) {
                adwj.a(adwg);
                return true;
            }
        }
        return false;
    }

    public final adwg a(float f, float f2) {
        float hypot = (float) Math.hypot((double) (this.p - f), (double) (this.q - f2));
        f = b(f, f2);
        if (hypot > this.v) {
            return null;
        }
        if (hypot < this.r) {
            return adwg.ENTER;
        }
        if (f >= 45.0f && f < 135.0f) {
            return adwg.DOWN;
        }
        if (f >= 135.0f || f < -135.0f) {
            return adwg.LEFT;
        }
        if (f < -135.0f || f >= -45.0f) {
            return adwg.RIGHT;
        }
        return adwg.UP;
    }

    private final float b(float f, float f2) {
        return (float) Math.toDegrees(Math.atan2((double) (f2 - this.q), (double) (f - this.p)));
    }

    private final void a() {
        if (b()) {
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.setState(new int[]{16842910});
            }
        }
        this.k = null;
        invalidate();
    }

    private static boolean b() {
        return VERSION.SDK_INT >= 21;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (adwg adwg : this.l.keySet()) {
            int i;
            Paint paint = this.n;
            if (adwg != adwg.ENTER) {
                i = g;
            } else {
                i = f;
            }
            paint.setColor(i);
            canvas.drawPath((Path) this.l.get(adwg), this.n);
        }
        this.n.setColor(h);
        int size = this.m.size();
        for (int i2 = 0; i2 < size; i2++) {
            canvas.drawPath((Path) this.m.get(i2), this.n);
        }
        if (this.k == null) {
            return;
        }
        if (!b() || this.j == null) {
            this.n.setColor(this.o);
            canvas.drawPath(this.k, this.n);
            return;
        }
        canvas.save();
        canvas.clipPath(this.k);
        this.j.draw(canvas);
        canvas.restore();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.i.a(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }
}
