package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.design.floatingactionbutton.FloatingActionButton;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

/* renamed from: gc */
public class gc {
    public static final int[] A = new int[]{16843623, 16842910};
    public static final int[] B = new int[]{16842910};
    public static final int[] C = new int[0];
    public static final TimeInterpolator a = dq.c;
    public static final int[] x = new int[]{16842919, 16842910};
    public static final int[] y = new int[]{16843623, 16842908, 16842910};
    public static final int[] z = new int[]{16842908, 16842910};
    public final FloatingActionButton D;
    public final hq E;
    public OnPreDrawListener F;
    private final gy G;
    private final Rect H = new Rect();
    private final RectF I = new RectF();
    private final RectF J = new RectF();
    private final Matrix K = new Matrix();
    public ia b;
    public hu c;
    public Drawable d;
    public ft e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public int l;
    public du m;
    public du n;
    public Animator o;
    public du p;
    public du q;
    public float r;
    public float s = 1.0f;
    public int t;
    public int u = 0;
    public ArrayList v;
    public ArrayList w;

    public gc(FloatingActionButton floatingActionButton, hq hqVar) {
        this.D = floatingActionButton;
        this.E = hqVar;
        this.G = new gy();
        this.G.a(x, gc.a(new gl(this)));
        this.G.a(y, gc.a(new gi(this)));
        this.G.a(z, gc.a(new gi(this)));
        this.G.a(A, gc.a(new gi(this)));
        this.G.a(B, gc.a(new gn(this)));
        this.G.a(C, gc.a(new gj(this)));
        this.r = this.D.getRotation();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean f() {
        return true;
    }

    public boolean g() {
        return true;
    }

    public void a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i) {
        this.c = h();
        this.c.setTintList(colorStateList);
        if (mode != null) {
            this.c.setTintMode(mode);
        }
        this.c.d();
        this.c.a(this.D.getContext());
        hu h = h();
        h.setTintList(ho.a(colorStateList2));
        this.d = h;
        this.f = new LayerDrawable(new Drawable[]{(Drawable) aad.a(this.c), h});
    }

    /* Access modifiers changed, original: 0000 */
    public float a() {
        return this.i;
    }

    public final void b() {
        a(this.s);
    }

    public final void a(float f) {
        this.s = f;
        Matrix matrix = this.K;
        a(f, matrix);
        this.D.setImageMatrix(matrix);
    }

    private final void a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.D.getDrawable();
        if (drawable != null && this.t != 0) {
            RectF rectF = this.I;
            RectF rectF2 = this.J;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f2 = (float) this.t;
            rectF2.set(0.0f, 0.0f, f2, f2);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            f2 = ((float) this.t) / 2.0f;
            matrix.postScale(f, f, f2, f2);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return !this.h || this.D.e() >= this.l;
    }

    public void a(float f, float f2, float f3) {
        e();
        b(f);
    }

    public final void b(float f) {
        hu huVar = this.c;
        if (huVar != null) {
            huVar.b(f);
        }
    }

    public void a(int[] iArr) {
        ha haVar;
        gy gyVar = this.G;
        int size = gyVar.a.size();
        for (int i = 0; i < size; i++) {
            haVar = (ha) gyVar.a.get(i);
            if (StateSet.stateSetMatches(haVar.a, iArr)) {
                break;
            }
        }
        haVar = null;
        ha haVar2 = gyVar.b;
        if (haVar != haVar2) {
            if (haVar2 != null) {
                ValueAnimator valueAnimator = gyVar.c;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    gyVar.c = null;
                }
            }
            gyVar.b = haVar;
            if (haVar != null) {
                gyVar.c = haVar.b;
                gyVar.c.start();
            }
        }
    }

    public void d() {
        gy gyVar = this.G;
        ValueAnimator valueAnimator = gyVar.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            gyVar.c = null;
        }
    }

    public final AnimatorSet a(du duVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.D, View.ALPHA, new float[]{f});
        duVar.a("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ofFloat = ObjectAnimator.ofFloat(this.D, View.SCALE_X, new float[]{f2});
        String str = "scale";
        duVar.a(str).a(ofFloat);
        arrayList.add(ofFloat);
        ofFloat = ObjectAnimator.ofFloat(this.D, View.SCALE_Y, new float[]{f2});
        duVar.a(str).a(ofFloat);
        arrayList.add(ofFloat);
        a(f3, this.K);
        ofFloat = ObjectAnimator.ofObject(this.D, new ds(), new gh(this), new Matrix[]{new Matrix(this.K)});
        duVar.a("iconScale").a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        dt.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final void e() {
        Rect rect = this.H;
        a(rect);
        aad.a(this.f, (Object) "Didn't initialize content background");
        if (f()) {
            this.E.a(new InsetDrawable(this.f, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.E.a(this.f);
        }
        this.E.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Rect rect) {
        int e = this.h ? (this.l - this.D.e()) / 2 : 0;
        float a = a() + this.k;
        int max = Math.max(e, (int) Math.ceil((double) a));
        e = Math.max(e, (int) Math.ceil((double) (a * 1.5f)));
        rect.set(max, e, max, e);
    }

    /* Access modifiers changed, original: 0000 */
    public hu h() {
        ia iaVar = (ia) aad.a(this.b);
        if (this.g) {
            float e = ((float) this.D.e()) / 2.0f;
            iaVar.a(e, e, e, e);
        }
        return new hu(iaVar);
    }

    private static ValueAnimator a(gm gmVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(gmVar);
        valueAnimator.addUpdateListener(gmVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public final boolean i() {
        return abe.D(this.D) && !this.D.isInEditMode();
    }

    /* Access modifiers changed, original: 0000 */
    public void j() {
        if (VERSION.SDK_INT == 19) {
            if (this.r % 90.0f != 0.0f) {
                if (this.D.getLayerType() != 1) {
                    this.D.setLayerType(1, null);
                }
            } else if (this.D.getLayerType() != 0) {
                this.D.setLayerType(0, null);
            }
        }
        hu huVar = this.c;
        if (huVar != null) {
            huVar.a((int) this.r);
        }
    }
}
