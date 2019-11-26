package androidx.mediarouter.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.android.youtube.R;
import defpackage.aocf;
import defpackage.aza;
import defpackage.azb;
import defpackage.azc;
import defpackage.azd;
import defpackage.bae;
import defpackage.bai;
import defpackage.baz;
import defpackage.bbb;
import defpackage.bbs;
import defpackage.nf;
import defpackage.nn;
import defpackage.nt;
import defpackage.or;
import defpackage.st;

public class MediaRouteButton extends View {
    public static final SparseArray a = new SparseArray(2);
    private static azb c;
    private static final int[] p = new int[]{16842912};
    private static final int[] q = new int[]{16842911};
    public azc b;
    private final bbb d;
    private final azd e;
    private baz f;
    private bae g;
    private boolean h;
    private int i;
    private Drawable j;
    private int k;
    private int l;
    private ColorStateList m;
    private int n;
    private int o;

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        Context contextThemeWrapper = new ContextThemeWrapper(context, bai.d(context));
        int a = bai.a(contextThemeWrapper, R.attr.mediaRouteTheme);
        if (a != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, a);
        }
        super(contextThemeWrapper, attributeSet, i);
        this.f = baz.c;
        this.g = bae.a;
        this.i = 0;
        contextThemeWrapper = getContext();
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(attributeSet, aza.a, i, 0);
        if (isInEditMode()) {
            this.d = null;
            this.e = null;
            this.j = getResources().getDrawable(obtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        ConstantState constantState;
        this.d = bbb.a(contextThemeWrapper);
        this.e = new azd(this);
        if (c == null) {
            c = new azb(contextThemeWrapper.getApplicationContext());
        }
        this.m = obtainStyledAttributes.getColorStateList(aza.f);
        this.n = obtainStyledAttributes.getDimensionPixelSize(aza.c, 0);
        this.o = obtainStyledAttributes.getDimensionPixelSize(aza.b, 0);
        i = obtainStyledAttributes.getResourceId(aza.e, 0);
        this.k = obtainStyledAttributes.getResourceId(aza.d, 0);
        obtainStyledAttributes.recycle();
        int i2 = this.k;
        if (i2 != 0) {
            constantState = (ConstantState) a.get(i2);
            if (constantState != null) {
                a(constantState.newDrawable());
            }
        }
        if (this.j == null) {
            if (i == 0) {
                c();
            } else {
                constantState = (ConstantState) a.get(i);
                if (constantState != null) {
                    b(constantState.newDrawable());
                } else {
                    this.b = new azc(this, i, getContext());
                    this.b.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            }
        }
        d();
        setClickable(true);
    }

    public final void a(baz baz) {
        if (baz == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f.equals(baz)) {
            if (this.h) {
                if (!this.f.c()) {
                    this.d.a(this.e);
                }
                if (!baz.c()) {
                    this.d.a(baz, this.e);
                }
            }
            this.f = baz;
            b();
        }
    }

    public final void a(bae bae) {
        if (bae != null) {
            this.g = bae;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        c();
        if (this.h) {
            nt ntVar;
            Activity activity;
            Context context = getContext();
            while (true) {
                ntVar = null;
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity instanceof nn) {
                ntVar = ((nn) activity).f();
            }
            if (ntVar != null) {
                bbs c = bbb.c();
                String str = "This must be called before creating dialog";
                String str2 = "MediaRouteButton";
                String str3;
                nf a;
                or a2;
                if (c.c() || !c.a(this.f)) {
                    str3 = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
                    if (ntVar.a(str3) != null) {
                        Log.w(str2, "showDialog(): Route chooser dialog already showing!");
                    } else {
                        a = this.g.a();
                        a.a(this.f);
                        if (a.c == null) {
                            a.Z = false;
                            a2 = ntVar.a();
                            a2.a(a, str3);
                            a2.b();
                            return true;
                        }
                        throw new IllegalStateException(str);
                    }
                }
                str3 = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
                if (ntVar.a(str3) != null) {
                    Log.w(str2, "showDialog(): Route controller dialog already showing!");
                } else {
                    a = this.g.b();
                    baz baz = this.f;
                    if (baz != null) {
                        Bundle bundle;
                        String str4 = "selector";
                        if (a.aa == null) {
                            bundle = a.j;
                            if (bundle != null) {
                                a.aa = baz.a(bundle.getBundle(str4));
                            }
                            if (a.aa == null) {
                                a.aa = baz.c;
                            }
                        }
                        if (!a.aa.equals(baz)) {
                            a.aa = baz;
                            bundle = a.j;
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putBundle(str4, baz.a);
                            a.f(bundle);
                            if (a.c != null) {
                                boolean z = a.Z;
                            }
                        }
                        if (a.c == null) {
                            a.Z = false;
                            a2 = ntVar.a();
                            a2.a(a, str3);
                            a2.b();
                            return true;
                        }
                        throw new IllegalStateException(str);
                    }
                    throw new IllegalArgumentException("selector must not be null");
                }
            }
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        if (!performClick) {
            return false;
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        int i2 = this.l;
        if (i2 == 1) {
            mergeDrawableStates(onCreateDrawableState, q);
        } else if (i2 == 2) {
            mergeDrawableStates(onCreateDrawableState, p);
        }
        return onCreateDrawableState;
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.j != null) {
            this.j.setState(getDrawableState());
            invalidate();
        }
    }

    public final void a(Drawable drawable) {
        this.k = 0;
        b(drawable);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.j;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void setVisibility(int i) {
        this.i = i;
        bp_();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.h = true;
            if (!this.f.c()) {
                this.d.a(this.f, this.e);
            }
            b();
            azb azb = c;
            if (azb.c.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                azb.a.registerReceiver(azb, intentFilter);
            }
            azb.c.add(this);
        }
    }

    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.h = false;
            if (!this.f.c()) {
                this.d.a(this.e);
            }
            azb azb = c;
            azb.c.remove(this);
            if (azb.c.size() == 0) {
                azb.a.unregisterReceiver(azb);
            }
        }
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        i = MeasureSpec.getMode(i);
        i2 = MeasureSpec.getMode(i2);
        int i3 = this.n;
        Drawable drawable = this.j;
        int i4 = 0;
        i3 = Math.max(i3, drawable != null ? (drawable.getIntrinsicWidth() + getPaddingLeft()) + getPaddingRight() : 0);
        int i5 = this.o;
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            i4 = (drawable2.getIntrinsicHeight() + getPaddingTop()) + getPaddingBottom();
        }
        i5 = Math.max(i5, i4);
        if (i == aocf.UNSET_ENUM_VALUE) {
            size = Math.min(size, i3);
        } else if (i != 1073741824) {
            size = i3;
        }
        if (i2 == aocf.UNSET_ENUM_VALUE) {
            size2 = Math.min(size2, i5);
        } else if (i2 != 1073741824) {
            size2 = i5;
        }
        setMeasuredDimension(size, size2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.j != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int intrinsicWidth = this.j.getIntrinsicWidth();
            int intrinsicHeight = this.j.getIntrinsicHeight();
            paddingLeft += (((width - paddingRight) - paddingLeft) - intrinsicWidth) / 2;
            paddingTop += (((height - paddingBottom) - paddingTop) - intrinsicHeight) / 2;
            this.j.setBounds(paddingLeft, paddingTop, intrinsicWidth + paddingLeft, intrinsicHeight + paddingTop);
            this.j.draw(canvas);
        }
    }

    private final void c() {
        if (this.k > 0) {
            azc azc = this.b;
            if (azc != null) {
                azc.cancel(false);
            }
            this.b = new azc(this, this.k, getContext());
            this.k = 0;
            this.b.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b(Drawable drawable) {
        azc azc = this.b;
        if (azc != null) {
            azc.cancel(false);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.j);
        }
        if (drawable != null) {
            if (this.m != null) {
                drawable = st.d(drawable.mutate());
                st.a(drawable, this.m);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.j = drawable;
        refreshDrawableState();
        if (this.h) {
            drawable = this.j;
            if (drawable != null && (drawable.getCurrent() instanceof AnimationDrawable)) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.j.getCurrent();
                int i = this.l;
                if (i == 1) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2) {
                    if (animationDrawable.isRunning()) {
                        animationDrawable.stop();
                    }
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
        }
    }

    public final void bp_() {
        int i = (this.i != 0 || c.b) ? this.i : 4;
        super.setVisibility(i);
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public final void b() {
        bbs c = bbb.c();
        Object obj = null;
        int i = (c.c() || !c.a(this.f)) ? 0 : c.h;
        if (this.l != i) {
            this.l = i;
            obj = 1;
        }
        if (obj != null) {
            d();
            refreshDrawableState();
        }
        if (i == 1) {
            c();
        }
        if (this.h) {
            setEnabled(bbb.a(this.f, 1));
        }
        Drawable drawable = this.j;
        if (drawable != null && (drawable.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.j.getCurrent();
            if (this.h) {
                if ((obj != null || i == 1) && !animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            } else if (i == 2) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    private final void d() {
        int i = this.l;
        i = i != 1 ? i != 2 ? R.string.mr_cast_button_disconnected : R.string.mr_cast_button_connected : R.string.mr_cast_button_connecting;
        setContentDescription(getContext().getString(i));
    }
}
