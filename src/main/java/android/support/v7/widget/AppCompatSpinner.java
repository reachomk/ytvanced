package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.youtube.R;
import defpackage.abf;
import defpackage.agb;
import defpackage.akv;
import defpackage.all;
import defpackage.aln;
import defpackage.alu;
import defpackage.alw;
import defpackage.and;
import defpackage.aocf;

public class AppCompatSpinner extends Spinner implements abf {
    private static final int[] e = new int[]{16843505};
    public final Context a;
    public alw b;
    public int c;
    public final Rect d;
    private final akv f;
    private and g;
    private SpinnerAdapter h;
    private final boolean i;

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, R.attr.spinnerStyle, i);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
        r6 = this;
        r6.<init>(r7, r8, r9);
        r0 = new android.graphics.Rect;
        r0.<init>();
        r6.d = r0;
        r0 = defpackage.afy.ce;
        r1 = 0;
        r0 = defpackage.arz.a(r7, r8, r0, r9, r1);
        r2 = new akv;
        r2.<init>(r6);
        r6.f = r2;
        if (r11 == 0) goto L_0x0022;
    L_0x001a:
        r2 = new ahw;
        r2.<init>(r7, r11);
        r6.a = r2;
        goto L_0x0034;
    L_0x0022:
        r11 = defpackage.afy.ci;
        r11 = r0.f(r11, r1);
        if (r11 == 0) goto L_0x0032;
    L_0x002a:
        r2 = new ahw;
        r2.<init>(r7, r11);
        r6.a = r2;
        goto L_0x0034;
    L_0x0032:
        r6.a = r7;
    L_0x0034:
        r11 = -1;
        r2 = 0;
        if (r10 != r11) goto L_0x005c;
    L_0x0038:
        r11 = e;	 Catch:{ Exception -> 0x0056, all -> 0x004e }
        r11 = r7.obtainStyledAttributes(r8, r11, r9, r1);	 Catch:{ Exception -> 0x0056, all -> 0x004e }
        r3 = r11.hasValue(r1);	 Catch:{ Exception -> 0x0057, all -> 0x004c }
        if (r3 == 0) goto L_0x0048;
    L_0x0044:
        r10 = r11.getInt(r1, r1);	 Catch:{ Exception -> 0x0057, all -> 0x004c }
    L_0x0048:
        r11.recycle();
        goto L_0x005c;
    L_0x004c:
        r7 = move-exception;
        goto L_0x0050;
    L_0x004e:
        r7 = move-exception;
        r11 = r2;
    L_0x0050:
        if (r11 == 0) goto L_0x0055;
    L_0x0052:
        r11.recycle();
    L_0x0055:
        throw r7;
    L_0x0056:
        r11 = r2;
    L_0x0057:
        if (r11 == 0) goto L_0x005c;
    L_0x0059:
        r11.recycle();
    L_0x005c:
        r11 = 1;
        if (r10 == 0) goto L_0x0098;
    L_0x005f:
        if (r10 == r11) goto L_0x0062;
    L_0x0061:
        goto L_0x00aa;
    L_0x0062:
        r10 = new alq;
        r3 = r6.a;
        r10.<init>(r6, r3, r8, r9);
        r3 = r6.a;
        r4 = defpackage.afy.ce;
        r3 = defpackage.arz.a(r3, r8, r4, r9, r1);
        r4 = defpackage.afy.cf;
        r5 = -2;
        r4 = r3.e(r4, r5);
        r6.c = r4;
        r4 = defpackage.afy.cg;
        r4 = r3.a(r4);
        r10.a(r4);
        r4 = defpackage.afy.ch;
        r4 = r0.d(r4);
        r10.a = r4;
        r3.a();
        r6.b = r10;
        r3 = new alm;
        r3.<init>(r6, r6, r10);
        r6.g = r3;
        goto L_0x00aa;
    L_0x0098:
        r10 = new alo;
        r10.<init>(r6);
        r6.b = r10;
        r10 = r6.b;
        r3 = defpackage.afy.ch;
        r3 = r0.d(r3);
        r10.a(r3);
    L_0x00aa:
        r10 = r0.b;
        r10 = r10.getTextArray(r1);
        if (r10 == 0) goto L_0x00c3;
    L_0x00b2:
        r1 = new android.widget.ArrayAdapter;
        r3 = 17367048; // 0x1090008 float:2.5162948E-38 double:8.580462E-317;
        r1.<init>(r7, r3, r10);
        r7 = 2131035429; // 0x7f050525 float:1.7681404E38 double:1.0528713955E-314;
        r1.setDropDownViewResource(r7);
        r6.setAdapter(r1);
    L_0x00c3:
        r0.a();
        r6.i = r11;
        r7 = r6.h;
        if (r7 == 0) goto L_0x00d1;
    L_0x00cc:
        r6.setAdapter(r7);
        r6.h = r2;
    L_0x00d1:
        r7 = r6.f;
        r7.a(r8, r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public final Context getPopupContext() {
        return this.a;
    }

    public final void setPopupBackgroundDrawable(Drawable drawable) {
        alw alw = this.b;
        if (alw != null) {
            alw.a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(agb.b(this.a, i));
    }

    public final Drawable getPopupBackground() {
        alw alw = this.b;
        if (alw != null) {
            return alw.b();
        }
        return super.getPopupBackground();
    }

    public final void setDropDownVerticalOffset(int i) {
        alw alw = this.b;
        if (alw != null) {
            alw.a(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public final int getDropDownVerticalOffset() {
        alw alw = this.b;
        if (alw != null) {
            return alw.c();
        }
        return super.getDropDownVerticalOffset();
    }

    public final void setDropDownHorizontalOffset(int i) {
        alw alw = this.b;
        if (alw != null) {
            alw.c(i);
            this.b.b(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public final int getDropDownHorizontalOffset() {
        alw alw = this.b;
        if (alw != null) {
            return alw.f();
        }
        return super.getDropDownHorizontalOffset();
    }

    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public final int getDropDownWidth() {
        if (this.b != null) {
            return this.c;
        }
        return super.getDropDownWidth();
    }

    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.i) {
            super.setAdapter(spinnerAdapter);
            if (this.b != null) {
                Context context = this.a;
                if (context == null) {
                    context = getContext();
                }
                this.b.a(new aln(spinnerAdapter, context.getTheme()));
            }
            return;
        }
        this.h = spinnerAdapter;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        alw alw = this.b;
        if (alw != null && alw.e()) {
            this.b.d();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        and and = this.g;
        if (and == null || !and.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b != null && MeasureSpec.getMode(i) == aocf.UNSET_ENUM_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final boolean performClick() {
        alw alw = this.b;
        if (alw == null) {
            return super.performClick();
        }
        if (!alw.e()) {
            a();
        }
        return true;
    }

    public final void setPrompt(CharSequence charSequence) {
        alw alw = this.b;
        if (alw != null) {
            alw.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public final CharSequence getPrompt() {
        alw alw = this.b;
        return alw == null ? super.getPrompt() : alw.a();
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        akv akv = this.f;
        if (akv != null) {
            akv.a(i);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        akv akv = this.f;
        if (akv != null) {
            akv.a();
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        akv akv = this.f;
        if (akv != null) {
            akv.a(colorStateList);
        }
    }

    public final ColorStateList getSupportBackgroundTintList() {
        akv akv = this.f;
        return akv != null ? akv.b() : null;
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        akv akv = this.f;
        if (akv != null) {
            akv.a(mode);
        }
    }

    public final Mode getSupportBackgroundTintMode() {
        akv akv = this.f;
        return akv != null ? akv.c() : null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        akv akv = this.f;
        if (akv != null) {
            akv.d();
        }
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        max = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i2 = 0;
        while (max < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max);
            int i3 = itemViewType == i ? i : itemViewType;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(max, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
            max++;
            i = i3;
        }
        if (drawable != null) {
            drawable.getPadding(this.d);
            i2 += this.d.left + this.d.right;
        }
        return i2;
    }

    public final void a() {
        this.b.a(getTextDirection(), getTextAlignment());
    }

    public final Parcelable onSaveInstanceState() {
        alu alu = new alu(super.onSaveInstanceState());
        alw alw = this.b;
        boolean z = false;
        if (alw != null && alw.e()) {
            z = true;
        }
        alu.a = z;
        return alu;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        alu alu = (alu) parcelable;
        super.onRestoreInstanceState(alu.getSuperState());
        if (alu.a) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new all(this));
            }
        }
    }
}
