package com.android.ex.photo.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import com.google.android.youtube.R;
import defpackage.aan;
import defpackage.aocf;
import defpackage.bpt;
import defpackage.bpu;
import defpackage.bpv;
import defpackage.bpw;
import defpackage.bpy;

public class PhotoView extends View implements OnDoubleTapListener, OnGestureListener, OnScaleGestureListener {
    private static int m;
    private static boolean n;
    private static Paint o;
    private static Paint p;
    private bpv A;
    private RectF B;
    private RectF C;
    private float[] D;
    private boolean E;
    private float F;
    private float G;
    private boolean H;
    public Drawable a;
    public Matrix b = new Matrix();
    public boolean c;
    public boolean d;
    public float e;
    public OnClickListener f;
    public boolean g;
    public bpw h;
    public float i;
    public float j;
    public float k;
    public RectF l;
    private Matrix q;
    private Matrix r = new Matrix();
    private int s = -1;
    private boolean t;
    private aan u;
    private ScaleGestureDetector v;
    private boolean w;
    private boolean x;
    private boolean y;
    private bpy z;

    public PhotoView(Context context) {
        super(context);
        Rect rect = new Rect();
        this.w = true;
        this.B = new RectF();
        this.C = new RectF();
        this.l = new RectF();
        this.D = new float[9];
        c();
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Rect rect = new Rect();
        this.w = true;
        this.B = new RectF();
        this.C = new RectF();
        this.l = new RectF();
        this.D = new float[9];
        c();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.w = true;
        this.B = new RectF();
        this.C = new RectF();
        this.l = new RectF();
        this.D = new float[9];
        c();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.v;
        if (!(scaleGestureDetector == null || this.u == null)) {
            scaleGestureDetector.onTouchEvent(motionEvent);
            this.u.a(motionEvent);
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && !this.z.g) {
                b();
            }
        }
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.E = true;
        return !this.H ? a(motionEvent) : false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.H && this.E) {
                    action = (int) (motionEvent.getX() - this.F);
                    int y = (int) (motionEvent.getY() - this.G);
                    if ((action * action) + (y * y) > m) {
                        this.E = false;
                        return false;
                    }
                }
            } else if (this.H) {
                return a(motionEvent);
            }
        } else if (this.H) {
            this.F = motionEvent.getX();
            this.G = motionEvent.getY();
        }
        return false;
    }

    private final boolean a(MotionEvent motionEvent) {
        boolean z;
        if (this.w && this.g && this.E) {
            if (this.x) {
                z = false;
            } else {
                float width;
                float height;
                float a = a();
                float f = this.i;
                float f2;
                if (a > f) {
                    float f3 = f / a;
                    f2 = 1.0f - f3;
                    width = (((float) (getWidth() / 2)) - (this.l.centerX() * f3)) / f2;
                    height = (((float) (getHeight() / 2)) - (f3 * this.l.centerY())) / f2;
                } else {
                    f = Math.min(this.j, Math.max(f, a + a));
                    f2 = f / a;
                    width = (((float) getWidth()) - this.l.width()) / f2;
                    height = (((float) getHeight()) - this.l.height()) / f2;
                    if (this.l.width() <= width + width) {
                        f2 = this.l.centerX();
                    } else {
                        f2 = Math.min(Math.max(this.l.left + width, motionEvent.getX()), this.l.right - width);
                    }
                    width = f2;
                    if (this.l.height() <= height + height) {
                        height = this.l.centerY();
                    } else {
                        height = Math.min(Math.max(this.l.top + height, motionEvent.getY()), this.l.bottom - height);
                    }
                }
                this.h.a(a, f, width, height);
                z = true;
            }
            this.x = false;
        } else {
            z = false;
        }
        this.E = false;
        return z;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        OnClickListener onClickListener = this.f;
        if (!(onClickListener == null || this.y)) {
            onClickListener.onClick(this);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = this.l;
        if (rectF != null) {
            rectF.contains(x, y);
        }
        this.y = false;
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.g && !this.h.a) {
            a(-f, -f2);
        }
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (this.g) {
            this.z.a();
            this.A.a();
        }
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.g && !this.h.a) {
            bpy bpy = this.z;
            if (!bpy.g) {
                bpy.f = -1;
                bpy.b = f;
                bpy.c = f2;
                double atan2 = (double) ((float) Math.atan2((double) f2, (double) f));
                bpy.d = (float) (Math.cos(atan2) * 20000.0d);
                bpy.e = (float) (Math.sin(atan2) * 20000.0d);
                bpy.h = false;
                bpy.g = true;
                bpy.a.post(bpy);
            }
        }
        return true;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.g && !this.h.a) {
            this.y = false;
            a(a() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.g) {
            bpw bpw = this.h;
            if (!bpw.a) {
                bpw.a();
                this.y = true;
            }
        }
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (this.g && this.y) {
            this.x = true;
            this.b.set(this.r);
            invalidate();
        }
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a != null) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            Matrix matrix = this.q;
            if (matrix != null) {
                canvas.concat(matrix);
            }
            this.a.draw(canvas);
            canvas.restoreToCount(saveCount);
            this.l.set(this.a.getBounds());
            Matrix matrix2 = this.q;
            if (matrix2 != null) {
                matrix2.mapRect(this.l);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.t = true;
        getWidth();
        getHeight();
        a(z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int i3 = this.s;
        if (i3 != -1) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(i3, aocf.UNSET_ENUM_VALUE));
            setMeasuredDimension(getMeasuredWidth(), this.s);
            return;
        }
        super.onMeasure(i, i2);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (this.a == drawable) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void a(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null && this.t) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.a.getIntrinsicHeight();
            int width = getWidth();
            int height = getHeight();
            Object obj = 1;
            if ((intrinsicWidth >= 0 && width != intrinsicWidth) || (intrinsicHeight >= 0 && height != intrinsicHeight)) {
                obj = null;
            }
            this.a.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (z || (this.i == 0.0f && this.a != null && this.t)) {
                float f;
                int intrinsicWidth2 = this.a.getIntrinsicWidth();
                intrinsicHeight = this.a.getIntrinsicHeight();
                width = getWidth();
                height = getHeight();
                if ((intrinsicWidth2 < 0 || width == intrinsicWidth2) && (intrinsicHeight < 0 || height == intrinsicHeight)) {
                    this.b.reset();
                } else {
                    float f2 = (float) intrinsicWidth2;
                    float f3 = (float) intrinsicHeight;
                    this.B.set(0.0f, 0.0f, f2, f3);
                    this.C.set(0.0f, 0.0f, (float) width, (float) height);
                    float f4 = (float) (width / 2);
                    float f5 = this.e;
                    f2 = (f2 * f5) / 2.0f;
                    f = (float) (height / 2);
                    f3 = (f3 * f5) / 2.0f;
                    RectF rectF = new RectF(f4 - f2, f - f3, f4 + f2, f + f3);
                    if (this.C.contains(rectF)) {
                        this.b.setRectToRect(this.B, rectF, ScaleToFit.CENTER);
                    } else {
                        this.b.setRectToRect(this.B, this.C, ScaleToFit.CENTER);
                    }
                }
                this.r.set(this.b);
                intrinsicWidth2 = this.a.getIntrinsicWidth();
                intrinsicWidth = this.a.getIntrinsicHeight();
                intrinsicHeight = getWidth();
                width = getHeight();
                f = 1.0f;
                if (intrinsicWidth2 < intrinsicHeight && intrinsicWidth < width) {
                    this.i = 1.0f;
                } else {
                    f = a();
                    this.i = f;
                }
                this.j = Math.max(f * 4.0f, 4.0f);
            }
            if (obj == null && !this.b.isIdentity()) {
                this.q = this.b;
                return;
            }
            this.q = null;
        }
    }

    public final float a() {
        this.b.getValues(this.D);
        return this.D[0];
    }

    public final void a(float f, float f2, float f3) {
        this.b.postRotate(-this.k, (float) (getWidth() / 2), (float) (getHeight() / 2));
        f = Math.min(Math.max(f, this.i), this.j * 1.5f);
        float a = a();
        float f4 = this.j;
        if (f > f4 && a <= f4) {
            postDelayed(new bpu(this), 600);
        }
        f /= a;
        this.b.postScale(f, f, f2, f3);
        this.b.postRotate(this.k, (float) (getWidth() / 2), (float) (getHeight() / 2));
        invalidate();
    }

    public final int a(float f, float f2) {
        this.l.set(this.B);
        this.b.mapRect(this.l);
        float width = (float) getWidth();
        float f3 = this.l.left;
        float f4 = this.l.right;
        if (f4 - f3 < width) {
            width = ((width - (f4 + f3)) / 2.0f) + 0.0f;
        } else {
            width = Math.max(width - f4, Math.min(-f3, f));
        }
        f3 = (float) getHeight();
        f4 = this.l.top;
        float f5 = this.l.bottom;
        if (f5 - f4 < f3) {
            f3 = ((f3 - (f5 + f4)) / 2.0f) + 0.0f;
        } else {
            f3 = Math.max(f3 - f5, Math.min(-f4, f2));
        }
        this.b.postTranslate(width, f3);
        invalidate();
        if (width == f && f3 == f2) {
            return 3;
        }
        if (width != f) {
            return f3 == f2 ? 2 : 0;
        } else {
            return 1;
        }
    }

    public final void b() {
        this.l.set(this.B);
        this.b.mapRect(this.l);
        float width = (float) getWidth();
        float f = this.l.left;
        float f2 = this.l.right;
        float f3 = 0.0f;
        width = f2 - f < width ? ((width - (f2 + f)) / 2.0f) + 0.0f : f > 0.0f ? -f : f2 < width ? width - f2 : 0.0f;
        f = (float) getHeight();
        f2 = this.l.top;
        float f4 = this.l.bottom;
        if (f4 - f2 < f) {
            f3 = 0.0f + ((f - (f4 + f2)) / 2.0f);
        } else if (f2 > 0.0f) {
            f3 = -f2;
        } else if (f4 < f) {
            f3 = f - f4;
        }
        if (Math.abs(width) > 20.0f || Math.abs(f3) > 20.0f) {
            bpv bpv = this.A;
            if (!bpv.e) {
                bpv.d = -1;
                bpv.b = width;
                bpv.c = f3;
                bpv.f = false;
                bpv.e = true;
                bpv.a.postDelayed(bpv, 250);
            }
            return;
        }
        this.b.postTranslate(width, f3);
        invalidate();
    }

    private final void c() {
        Context context = getContext();
        if (!n) {
            n = true;
            Resources resources = context.getApplicationContext().getResources();
            resources.getDimensionPixelSize(R.dimen.photo_crop_width);
            Paint paint = new Paint();
            o = paint;
            paint.setAntiAlias(true);
            o.setColor(resources.getColor(R.color.photo_crop_dim_color));
            o.setStyle(Style.FILL);
            paint = new Paint();
            p = paint;
            paint.setAntiAlias(true);
            p.setColor(resources.getColor(R.color.photo_crop_highlight_color));
            p.setStyle(Style.STROKE);
            p.setStrokeWidth(resources.getDimension(R.dimen.photo_crop_stroke_width));
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            m = scaledTouchSlop * scaledTouchSlop;
        }
        this.u = new aan(context, this, (byte) 0);
        this.v = new ScaleGestureDetector(context, this);
        this.H = this.v.isQuickScaleEnabled();
        this.h = new bpw(this);
        this.z = new bpy(this);
        this.A = new bpv(this);
        bpt bpt = new bpt(this);
    }
}
