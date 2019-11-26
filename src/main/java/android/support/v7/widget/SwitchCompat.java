package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.adl;
import defpackage.afy;
import defpackage.agt;
import defpackage.aly;
import defpackage.amu;
import defpackage.aru;
import defpackage.arz;
import defpackage.asy;
import defpackage.st;

public class SwitchCompat extends CompoundButton {
    private static final int[] O = new int[]{16842912};
    private static final Property d = new aru(Float.class, "thumbPos");
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private final TextPaint G;
    private ColorStateList H;
    private Layout I;
    private Layout J;
    private TransformationMethod K;
    private ObjectAnimator L;
    private final aly M;
    private final Rect N;
    public CharSequence a;
    public CharSequence b;
    public float c;
    private Drawable e;
    private ColorStateList f;
    private Mode g;
    private boolean h;
    private boolean i;
    private Drawable j;
    private ColorStateList k;
    private Mode l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private float v;
    private float w;
    private VelocityTracker x;
    private int y;
    private int z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        super(context, attributeSet, i);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = false;
        this.x = VelocityTracker.obtain();
        this.N = new Rect();
        boolean z = true;
        this.G = new TextPaint(1);
        this.G.density = getResources().getDisplayMetrics().density;
        arz a = arz.a(context, attributeSet, afy.cj, i, 0);
        this.e = a.a(afy.cm);
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.j = a.a(afy.cv);
        drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.a = a.c(afy.cl);
        this.b = a.c(afy.ck);
        this.s = a.a(afy.cn, true);
        this.o = a.d(afy.cs, 0);
        this.p = a.d(afy.cp, 0);
        this.q = a.d(afy.cq, 0);
        this.r = a.a(afy.co, false);
        ColorStateList f = a.f(afy.ct);
        if (f != null) {
            this.f = f;
            this.h = true;
        }
        Mode a2 = amu.a(a.a(afy.cu, -1), null);
        if (this.g != a2) {
            this.g = a2;
            this.i = true;
        }
        boolean z2 = this.h;
        if (z2 || this.i) {
            drawable = this.e;
            if (drawable != null && (z2 || this.i)) {
                this.e = st.d(drawable).mutate();
                if (this.h) {
                    st.a(this.e, this.f);
                }
                if (this.i) {
                    st.a(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(getDrawableState());
                }
            }
        }
        f = a.f(afy.cw);
        if (f != null) {
            this.k = f;
            this.m = true;
        }
        a2 = amu.a(a.a(afy.cx, -1), null);
        if (this.l != a2) {
            this.l = a2;
            this.n = true;
        }
        z2 = this.m;
        if (z2 || this.n) {
            drawable = this.j;
            if (drawable != null && (z2 || this.n)) {
                this.j = st.d(drawable).mutate();
                if (this.m) {
                    st.a(this.j, this.k);
                }
                if (this.n) {
                    st.a(this.j, this.l);
                }
                if (this.j.isStateful()) {
                    this.j.setState(getDrawableState());
                }
            }
        }
        int f2 = a.f(afy.cr, 0);
        if (f2 != 0) {
            arz a3 = arz.a(context, f2, afy.cy);
            ColorStateList f3 = a3.f(afy.cA);
            if (f3 != null) {
                this.H = f3;
            } else {
                this.H = getTextColors();
            }
            int d = a3.d(afy.cE, 0);
            if (d != 0) {
                float f4 = (float) d;
                if (f4 != this.G.getTextSize()) {
                    this.G.setTextSize(f4);
                    requestLayout();
                }
            }
            d = a3.a(1, -1);
            int a4 = a3.a(afy.cF, -1);
            Typeface typeface = d != 1 ? d != 2 ? d != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            float f5 = 0.0f;
            if (a4 > 0) {
                if (typeface == null) {
                    typeface = Typeface.defaultFromStyle(a4);
                } else {
                    typeface = Typeface.create(typeface, a4);
                }
                a(typeface);
                int style = (-1 ^ (typeface != null ? typeface.getStyle() : 0)) & a4;
                TextPaint textPaint = this.G;
                if ((style & 1) == 0) {
                    z = false;
                }
                textPaint.setFakeBoldText(z);
                TextPaint textPaint2 = this.G;
                if ((style & 2) != 0) {
                    f5 = -0.25f;
                }
                textPaint2.setTextSkewX(f5);
            } else {
                this.G.setFakeBoldText(false);
                this.G.setTextSkewX(0.0f);
                a(typeface);
            }
            if (a3.a(afy.cJ, false)) {
                this.K = new agt(getContext());
            } else {
                this.K = null;
            }
            a3.a();
        }
        this.M = new aly(this);
        this.M.a(attributeSet, i);
        a.a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private final void a(Typeface typeface) {
        if ((this.G.getTypeface() != null && !this.G.getTypeface().equals(typeface)) || (this.G.getTypeface() == null && typeface != null)) {
            this.G.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int max;
        int i3;
        if (this.s) {
            if (this.I == null) {
                this.I = a(this.a);
            }
            if (this.J == null) {
                this.J = a(this.b);
            }
        }
        Rect rect = this.N;
        Drawable drawable = this.e;
        int i4 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.e.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.e.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.s) {
            max = Math.max(this.I.getWidth(), this.J.getWidth());
            i3 = this.o;
            max += i3 + i3;
        } else {
            max = 0;
        }
        this.B = Math.max(max, intrinsicWidth);
        drawable = this.j;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = this.j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        intrinsicWidth = rect.left;
        int i5 = rect.right;
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            Rect a = amu.a(drawable2);
            intrinsicWidth = Math.max(intrinsicWidth, a.left);
            i5 = Math.max(i5, a.right);
        }
        max = this.p;
        i3 = this.B;
        i5 = Math.max(max, ((i3 + i3) + intrinsicWidth) + i5);
        intrinsicWidth = Math.max(i4, intrinsicHeight);
        this.z = i5;
        this.A = intrinsicWidth;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < intrinsicWidth) {
            setMeasuredDimension(getMeasuredWidthAndState(), intrinsicWidth);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Object obj;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            obj = this.a;
        } else {
            obj = this.b;
        }
        if (obj != null) {
            accessibilityEvent.getText().add(obj);
        }
    }

    private final Layout a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.G;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX WARNING: Missing block: B:5:0x0013, code skipped:
            if (r0 != 3) goto L_0x0154;
     */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r0 = r9.x;
        r0.addMovement(r10);
        r0 = r10.getActionMasked();
        r1 = 1;
        if (r0 == 0) goto L_0x0101;
    L_0x000c:
        r2 = 3;
        r3 = 2;
        r4 = 0;
        if (r0 == r1) goto L_0x0091;
    L_0x0011:
        if (r0 == r3) goto L_0x0017;
    L_0x0013:
        if (r0 == r2) goto L_0x0091;
    L_0x0015:
        goto L_0x0154;
    L_0x0017:
        r0 = r9.t;
        if (r0 == r1) goto L_0x005d;
    L_0x001b:
        if (r0 == r3) goto L_0x001f;
    L_0x001d:
        goto L_0x0154;
    L_0x001f:
        r10 = r10.getX();
        r0 = r9.c();
        r2 = r9.v;
        r2 = r10 - r2;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r0 == 0) goto L_0x0033;
    L_0x002f:
        r0 = (float) r0;
        r0 = r2 / r0;
        goto L_0x003c;
    L_0x0033:
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x003a;
    L_0x0037:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x003c;
    L_0x003a:
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x003c:
        r2 = defpackage.asy.a(r9);
        if (r2 == 0) goto L_0x0043;
    L_0x0042:
        r0 = -r0;
    L_0x0043:
        r2 = r9.c;
        r0 = r0 + r2;
        r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r5 < 0) goto L_0x0052;
    L_0x004a:
        r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r4 > 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0053;
    L_0x004f:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0053;
    L_0x0052:
        r0 = 0;
    L_0x0053:
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x005c;
    L_0x0057:
        r9.v = r10;
        r9.a(r0);
    L_0x005c:
        return r1;
    L_0x005d:
        r0 = r10.getX();
        r2 = r10.getY();
        r4 = r9.v;
        r4 = r0 - r4;
        r4 = java.lang.Math.abs(r4);
        r5 = r9.u;
        r5 = (float) r5;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 > 0) goto L_0x0083;
    L_0x0074:
        r4 = r9.w;
        r4 = r2 - r4;
        r4 = java.lang.Math.abs(r4);
        r5 = r9.u;
        r5 = (float) r5;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 <= 0) goto L_0x0154;
    L_0x0083:
        r9.t = r3;
        r10 = r9.getParent();
        r10.requestDisallowInterceptTouchEvent(r1);
        r9.v = r0;
        r9.w = r2;
        return r1;
    L_0x0091:
        r0 = r9.t;
        r5 = 0;
        if (r0 == r3) goto L_0x009f;
    L_0x0096:
        r9.t = r5;
        r0 = r9.x;
        r0.clear();
        goto L_0x0154;
    L_0x009f:
        r9.t = r5;
        r0 = r10.getAction();
        if (r0 != r1) goto L_0x00b0;
    L_0x00a7:
        r0 = r9.isEnabled();
        if (r0 != 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00b0;
    L_0x00ae:
        r0 = 1;
        goto L_0x00b1;
    L_0x00b0:
        r0 = 0;
    L_0x00b1:
        r3 = r9.isChecked();
        if (r0 == 0) goto L_0x00e7;
    L_0x00b7:
        r0 = r9.x;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.computeCurrentVelocity(r6);
        r0 = r9.x;
        r0 = r0.getXVelocity();
        r6 = java.lang.Math.abs(r0);
        r7 = r9.y;
        r7 = (float) r7;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 <= 0) goto L_0x00e2;
    L_0x00cf:
        r6 = defpackage.asy.a(r9);
        if (r6 == 0) goto L_0x00da;
    L_0x00d5:
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 < 0) goto L_0x00e0;
    L_0x00d9:
        goto L_0x00de;
    L_0x00da:
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 > 0) goto L_0x00e0;
    L_0x00de:
        r0 = 0;
        goto L_0x00e8;
    L_0x00e0:
        r0 = 1;
        goto L_0x00e8;
    L_0x00e2:
        r0 = r9.a();
        goto L_0x00e8;
    L_0x00e7:
        r0 = r3;
    L_0x00e8:
        if (r0 == r3) goto L_0x00ed;
    L_0x00ea:
        r9.playSoundEffect(r5);
    L_0x00ed:
        r9.setChecked(r0);
        r0 = android.view.MotionEvent.obtain(r10);
        r0.setAction(r2);
        super.onTouchEvent(r0);
        r0.recycle();
        super.onTouchEvent(r10);
        return r1;
    L_0x0101:
        r0 = r10.getX();
        r2 = r10.getY();
        r3 = r9.isEnabled();
        if (r3 == 0) goto L_0x0154;
    L_0x010f:
        r3 = r9.e;
        if (r3 == 0) goto L_0x0154;
    L_0x0113:
        r3 = r9.b();
        r4 = r9.e;
        r5 = r9.N;
        r4.getPadding(r5);
        r4 = r9.D;
        r5 = r9.u;
        r4 = r4 - r5;
        r6 = r9.C;
        r6 = r6 + r3;
        r6 = r6 - r5;
        r3 = r9.B;
        r5 = r9.N;
        r5 = r5.left;
        r7 = r9.N;
        r7 = r7.right;
        r8 = r9.u;
        r3 = r3 + r6;
        r3 = r3 + r5;
        r3 = r3 + r7;
        r3 = r3 + r8;
        r5 = r9.F;
        r5 = r5 + r8;
        r6 = (float) r6;
        r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x0154;
    L_0x013f:
        r3 = (float) r3;
        r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r3 >= 0) goto L_0x0154;
    L_0x0144:
        r3 = (float) r4;
        r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x0154;
    L_0x0149:
        r3 = (float) r5;
        r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r3 >= 0) goto L_0x0154;
    L_0x014e:
        r9.t = r1;
        r9.v = r0;
        r9.w = r2;
    L_0x0154:
        r10 = super.onTouchEvent(r10);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private final boolean a() {
        return this.c > 0.5f;
    }

    public final void a(float f) {
        this.c = f;
        invalidate();
    }

    public final void toggle() {
        setChecked(isChecked() ^ 1);
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
        z = isChecked();
        float f = 0.0f;
        if (getWindowToken() == null || !abe.D(this)) {
            ObjectAnimator objectAnimator = this.L;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (z) {
                f = 1.0f;
            }
            a(f);
            return;
        }
        if (z) {
            f = 1.0f;
        }
        this.L = ObjectAnimator.ofFloat(this, d, new float[]{f});
        this.L.setDuration(250);
        this.L.setAutoCancel(true);
        this.L.start();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        super.onLayout(z, i, i2, i3, i4);
        i = 0;
        if (this.e != null) {
            Rect rect = this.N;
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = amu.a(this.e);
            i3 = Math.max(0, a.left - rect.left);
            i = Math.max(0, a.right - rect.right);
        } else {
            i3 = 0;
        }
        if (asy.a(this)) {
            paddingLeft = getPaddingLeft() + i3;
            i2 = ((this.z + paddingLeft) - i3) - i;
        } else {
            i2 = (getWidth() - getPaddingRight()) - i;
            paddingLeft = ((i2 - this.z) + i3) + i;
        }
        i = getGravity() & 112;
        if (i == 16) {
            i = getPaddingTop();
            i3 = getHeight();
            i4 = getPaddingBottom();
            int i5 = this.A;
            i = (((i + i3) - i4) / 2) - (i5 / 2);
            i3 = i + i5;
        } else if (i != 80) {
            i = getPaddingTop();
            i3 = this.A + i;
        } else {
            i3 = getHeight() - getPaddingBottom();
            i = i3 - this.A;
        }
        this.C = paddingLeft;
        this.D = i;
        this.F = i3;
        this.E = i2;
    }

    public final void draw(Canvas canvas) {
        Rect a;
        Rect rect = this.N;
        int i = this.C;
        int i2 = this.D;
        int i3 = this.E;
        int i4 = this.F;
        int b = b() + i;
        Drawable drawable = this.e;
        if (drawable != null) {
            a = amu.a(drawable);
        } else {
            a = amu.a;
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            int i5;
            int i6;
            drawable2.getPadding(rect);
            b += rect.left;
            if (a == null) {
                i5 = i2;
            } else {
                if (a.left > rect.left) {
                    i += a.left - rect.left;
                }
                i5 = a.top > rect.top ? (a.top - rect.top) + i2 : i2;
                if (a.right > rect.right) {
                    i3 -= a.right - rect.right;
                }
                if (a.bottom > rect.bottom) {
                    i6 = i4 - (a.bottom - rect.bottom);
                    this.j.setBounds(i, i5, i3, i6);
                }
            }
            i6 = i4;
            this.j.setBounds(i, i5, i3, i6);
        }
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            i = b - rect.left;
            b = (b + this.B) + rect.right;
            this.e.setBounds(i, i2, b, i4);
            Drawable background = getBackground();
            if (background != null) {
                st.a(background, i, i2, b, i4);
            }
        }
        super.draw(canvas);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        int save;
        super.onDraw(canvas);
        Rect rect = this.N;
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.D + rect.top;
        int i2 = this.F - rect.bottom;
        Drawable drawable2 = this.e;
        if (drawable != null) {
            if (this.r && drawable2 != null) {
                Rect a = amu.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = !a() ? this.J : this.I;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.H;
            if (colorStateList != null) {
                this.G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                save = bounds.left + bounds.right;
            } else {
                save = getWidth();
            }
            canvas.translate((float) ((save / 2) - (layout.getWidth() / 2)), (float) (((i + i2) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final int getCompoundPaddingLeft() {
        if (!asy.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.z;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.q;
        }
        return compoundPaddingLeft;
    }

    public final int getCompoundPaddingRight() {
        if (asy.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.z;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.q;
        }
        return compoundPaddingRight;
    }

    private final int b() {
        float f;
        if (asy.a(this)) {
            f = 1.0f - this.c;
        } else {
            f = this.c;
        }
        return (int) ((f * ((float) c())) + 0.5f);
    }

    private final int c() {
        Drawable drawable = this.j;
        if (drawable == null) {
            return 0;
        }
        Rect a;
        Rect rect = this.N;
        drawable.getPadding(rect);
        drawable = this.e;
        if (drawable != null) {
            a = amu.a(drawable);
        } else {
            a = amu.a;
        }
        return ((((this.z - this.B) - rect.left) - rect.right) - a.left) - a.right;
    }

    /* Access modifiers changed, original: protected|final */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, O);
        }
        return onCreateDrawableState;
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.e;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = drawable.setState(drawableState);
        }
        drawable = this.j;
        if (drawable != null && drawable.isStateful()) {
            i |= drawable.setState(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    public final void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            st.a(drawable, f, f2);
        }
        drawable = this.j;
        if (drawable != null) {
            st.a(drawable, f, f2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.j;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        drawable = this.j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.L.end();
            this.L = null;
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (isChecked()) {
            charSequence = this.a;
        } else {
            charSequence = this.b;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(text);
            stringBuilder.append(' ');
            stringBuilder.append(charSequence);
            accessibilityNodeInfo.setText(stringBuilder);
        }
    }

    public final void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(adl.a((TextView) this, callback));
    }
}
