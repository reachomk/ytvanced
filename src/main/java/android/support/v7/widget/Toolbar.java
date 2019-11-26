package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.adv;
import defpackage.afy;
import defpackage.aia;
import defpackage.aiv;
import defpackage.aiw;
import defpackage.aja;
import defpackage.ajm;
import defpackage.akf;
import defpackage.akj;
import defpackage.akp;
import defpackage.amh;
import defpackage.aocf;
import defpackage.aqs;
import defpackage.arz;
import defpackage.asa;
import defpackage.asb;
import defpackage.asc;
import defpackage.ase;
import defpackage.asf;
import defpackage.ash;
import defpackage.asj;
import defpackage.asy;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private int C;
    private aqs D;
    private int E;
    private int F;
    private ColorStateList G;
    private ColorStateList H;
    private boolean I;
    private boolean J;
    private final ArrayList K;
    private final int[] L;
    private final akp M;
    private asj N;
    private final Runnable O;
    public ActionMenuView a;
    public Drawable b;
    public CharSequence c;
    public ImageButton d;
    public View e;
    public Context f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public CharSequence n;
    public CharSequence o;
    public final ArrayList p;
    public ase q;
    public akf r;
    public asc s;
    public ajm t;
    public aiv u;
    public boolean v;
    private TextView w;
    private TextView x;
    private ImageButton y;
    private ImageView z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = 8388627;
        this.K = new ArrayList();
        this.p = new ArrayList();
        this.L = new int[2];
        this.M = new asb(this);
        this.O = new asa(this);
        arz a = arz.a(getContext(), attributeSet, afy.cL, i, 0);
        this.A = a.f(afy.dn, 0);
        this.B = a.f(afy.de, 0);
        this.F = a.b(afy.cM, this.F);
        this.h = a.b(afy.cN, 48);
        int c = a.c(afy.dh, 0);
        if (a.h(afy.dm)) {
            c = a.c(afy.dm, c);
        }
        this.l = c;
        this.k = c;
        this.j = c;
        this.i = c;
        c = a.c(afy.dk, -1);
        if (c >= 0) {
            this.i = c;
        }
        c = a.c(afy.dj, -1);
        if (c >= 0) {
            this.j = c;
        }
        c = a.c(afy.dl, -1);
        if (c >= 0) {
            this.k = c;
        }
        c = a.c(afy.di, -1);
        if (c >= 0) {
            this.l = c;
        }
        this.C = a.d(afy.cY, -1);
        c = a.c(afy.cU, aocf.UNSET_ENUM_VALUE);
        int c2 = a.c(afy.cQ, aocf.UNSET_ENUM_VALUE);
        int d = a.d(afy.cS, 0);
        int d2 = a.d(afy.cT, 0);
        r();
        aqs aqs = this.D;
        aqs.h = false;
        if (d != aocf.UNSET_ENUM_VALUE) {
            aqs.e = d;
            aqs.a = d;
        }
        if (d2 != aocf.UNSET_ENUM_VALUE) {
            aqs.f = d2;
            aqs.b = d2;
        }
        if (!(c == aocf.UNSET_ENUM_VALUE && c2 == aocf.UNSET_ENUM_VALUE)) {
            aqs.a(c, c2);
        }
        this.m = a.c(afy.cV, aocf.UNSET_ENUM_VALUE);
        this.E = a.c(afy.cR, aocf.UNSET_ENUM_VALUE);
        this.b = a.a(afy.cP);
        this.c = a.c(afy.cO);
        CharSequence c3 = a.c(afy.dg);
        if (!TextUtils.isEmpty(c3)) {
            a(c3);
        }
        c3 = a.c(afy.dd);
        if (!TextUtils.isEmpty(c3)) {
            b(c3);
        }
        this.f = getContext();
        a(a.f(afy.dc, 0));
        Drawable a2 = a.a(afy.db);
        if (a2 != null) {
            b(a2);
        }
        c3 = a.c(afy.da);
        if (!TextUtils.isEmpty(c3)) {
            c(c3);
        }
        a2 = a.a(afy.cW);
        if (a2 != null) {
            a(a2);
        }
        c3 = a.c(afy.cX);
        if (!TextUtils.isEmpty(c3)) {
            if (!TextUtils.isEmpty(c3)) {
                k();
            }
            ImageView imageView = this.z;
            if (imageView != null) {
                imageView.setContentDescription(c3);
            }
        }
        if (a.h(afy.f2do)) {
            b(a.f(afy.f2do));
        }
        if (a.h(afy.df)) {
            a(a.f(afy.df));
        }
        if (a.h(afy.cZ)) {
            d(a.f(afy.cZ, 0));
        }
        a.a();
    }

    public final void a(int i) {
        if (this.g != i) {
            this.g = i;
            if (i == 0) {
                this.f = getContext();
            } else {
                this.f = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        r();
        aqs aqs = this.D;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != aqs.g) {
            aqs.g = z;
            int i2;
            if (!aqs.h) {
                aqs.a = aqs.e;
                aqs.b = aqs.f;
            } else if (z) {
                i2 = aqs.d;
                if (i2 == aocf.UNSET_ENUM_VALUE) {
                    i2 = aqs.e;
                }
                aqs.a = i2;
                i2 = aqs.c;
                if (i2 == aocf.UNSET_ENUM_VALUE) {
                    i2 = aqs.f;
                }
                aqs.b = i2;
            } else {
                i2 = aqs.c;
                if (i2 == aocf.UNSET_ENUM_VALUE) {
                    i2 = aqs.e;
                }
                aqs.a = i2;
                i2 = aqs.d;
                if (i2 == aocf.UNSET_ENUM_VALUE) {
                    i2 = aqs.f;
                }
                aqs.b = i2;
            }
        }
    }

    public final boolean a() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            akf akf = actionMenuView.c;
            if (akf != null && akf.i()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            akf akf = actionMenuView.c;
            if (akf != null && akf.e()) {
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            k();
            if (!d(this.z)) {
                a(this.z, true);
            }
        } else {
            View view = this.z;
            if (view != null && d(view)) {
                removeView(this.z);
                this.p.remove(this.z);
            }
        }
        ImageView imageView = this.z;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    private final void k() {
        if (this.z == null) {
            this.z = new AppCompatImageView(getContext());
        }
    }

    public final void c() {
        asc asc = this.s;
        aja aja = asc != null ? asc.a : null;
        if (aja != null) {
            aja.collapseActionView();
        }
    }

    public void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            View view = this.w;
            if (view != null && d(view)) {
                removeView(this.w);
                this.p.remove(this.w);
            }
        } else {
            if (this.w == null) {
                Context context = getContext();
                this.w = new AppCompatTextView(context);
                this.w.setSingleLine();
                this.w.setEllipsize(TruncateAt.END);
                int i = this.A;
                if (i != 0) {
                    this.w.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.w.setTextColor(colorStateList);
                }
            }
            if (!d(this.w)) {
                a(this.w, true);
            }
        }
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.n = charSequence;
    }

    public void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            View view = this.x;
            if (view != null && d(view)) {
                removeView(this.x);
                this.p.remove(this.x);
            }
        } else {
            if (this.x == null) {
                Context context = getContext();
                this.x = new AppCompatTextView(context);
                this.x.setSingleLine();
                this.x.setEllipsize(TruncateAt.END);
                int i = this.B;
                if (i != 0) {
                    this.x.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.x.setTextColor(colorStateList);
                }
            }
            if (!d(this.x)) {
                a(this.x, true);
            }
        }
        TextView textView = this.x;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.o = charSequence;
    }

    public final void a(Context context, int i) {
        this.A = i;
        TextView textView = this.w;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public final void b(Context context, int i) {
        this.B = i;
        TextView textView = this.x;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public final void b(int i) {
        b(ColorStateList.valueOf(i));
    }

    private final void b(ColorStateList colorStateList) {
        this.G = colorStateList;
        TextView textView = this.w;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void a(ColorStateList colorStateList) {
        this.H = colorStateList;
        TextView textView = this.x;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final CharSequence d() {
        ImageButton imageButton = this.y;
        return imageButton != null ? imageButton.getContentDescription() : null;
    }

    public final void c(int i) {
        c(i != 0 ? getContext().getText(i) : null);
    }

    public final void c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            q();
        }
        ImageButton imageButton = this.y;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public final void b(Drawable drawable) {
        if (drawable != null) {
            q();
            if (!d(this.y)) {
                a(this.y, true);
            }
        } else {
            View view = this.y;
            if (view != null && d(view)) {
                removeView(this.y);
                this.p.remove(this.y);
            }
        }
        ImageButton imageButton = this.y;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable);
        }
    }

    public final Drawable e() {
        ImageButton imageButton = this.y;
        return imageButton != null ? imageButton.getDrawable() : null;
    }

    public final void a(OnClickListener onClickListener) {
        q();
        this.y.setOnClickListener(onClickListener);
    }

    public final Menu f() {
        l();
        return this.a.b();
    }

    public final void c(Drawable drawable) {
        l();
        ActionMenuView actionMenuView = this.a;
        actionMenuView.b();
        akf akf = actionMenuView.c;
        akj akj = akf.i;
        if (akj != null) {
            akj.setImageDrawable(drawable);
            return;
        }
        akf.k = true;
        akf.j = drawable;
    }

    public final Drawable g() {
        Drawable drawable;
        l();
        ActionMenuView actionMenuView = this.a;
        actionMenuView.b();
        akf akf = actionMenuView.c;
        akj akj = akf.i;
        if (akj != null) {
            drawable = akj.getDrawable();
        } else if (akf.k) {
            return akf.j;
        } else {
            drawable = null;
        }
        return drawable;
    }

    private final void l() {
        h();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            aiw aiw = (aiw) actionMenuView.b();
            if (this.s == null) {
                this.s = new asc(this);
            }
            this.a.c.d();
            aiw.a(this.s, this.f);
        }
    }

    public final void h() {
        if (this.a == null) {
            this.a = new ActionMenuView(getContext());
            this.a.a(this.g);
            ActionMenuView actionMenuView = this.a;
            actionMenuView.e = this.M;
            actionMenuView.a(this.t, this.u);
            asf i = i();
            i.a = (this.h & 112) | 8388613;
            this.a.setLayoutParams(i);
            a(this.a, false);
        }
    }

    public final void d(int i) {
        new aia(getContext()).inflate(i, f());
    }

    public final void a(int i, int i2) {
        r();
        this.D.a(i, i2);
    }

    private final int m() {
        aqs aqs = this.D;
        if (aqs == null) {
            return 0;
        }
        return !aqs.g ? aqs.a : aqs.b;
    }

    private final int n() {
        aqs aqs = this.D;
        if (aqs == null) {
            return 0;
        }
        return !aqs.g ? aqs.b : aqs.a;
    }

    private final int o() {
        if (e() != null) {
            return Math.max(m(), Math.max(this.m, 0));
        }
        return m();
    }

    private final int p() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            aiw aiw = actionMenuView.a;
            if (aiw != null && aiw.hasVisibleItems()) {
                return Math.max(n(), Math.max(this.E, 0));
            }
        }
        return n();
    }

    private final void q() {
        if (this.y == null) {
            this.y = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            asf i = i();
            i.a = (this.h & 112) | 8388611;
            this.y.setLayoutParams(i);
        }
    }

    private final void a(View view, boolean z) {
        asf i;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            i = i();
        } else if (checkLayoutParams(layoutParams)) {
            i = (asf) layoutParams;
        } else {
            i = a(layoutParams);
        }
        i.b = 1;
        if (!z || this.e == null) {
            addView(view, i);
            return;
        }
        view.setLayoutParams(i);
        this.p.add(view);
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        ash ash = new ash(super.onSaveInstanceState());
        asc asc = this.s;
        if (asc != null) {
            aja aja = asc.a;
            if (aja != null) {
                ash.a = aja.a;
            }
        }
        ash.b = a();
        return ash;
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ash) {
            ash ash = (ash) parcelable;
            super.onRestoreInstanceState(ash.g);
            ActionMenuView actionMenuView = this.a;
            Menu menu = actionMenuView != null ? actionMenuView.a : null;
            int i = ash.a;
            if (!(i == 0 || this.s == null || menu == null)) {
                MenuItem findItem = menu.findItem(i);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
            if (ash.b) {
                removeCallbacks(this.O);
                post(this.O);
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = false;
        }
        if (!this.I) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.J = false;
        }
        if (!this.J) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.J = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.J = false;
        }
        return true;
    }

    private final void a(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        i = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        i2 = getChildMeasureSpec(i3, ((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        i3 = MeasureSpec.getMode(i2);
        if (i3 != 1073741824 && i4 >= 0) {
            if (i3 != 0) {
                i4 = Math.min(MeasureSpec.getSize(i2), i4);
            }
            i2 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(i, i2);
    }

    private final int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int max;
        int combineMeasuredStates;
        int measuredHeight;
        int combineMeasuredStates2;
        int[] iArr = this.L;
        boolean a = asy.a(this);
        int i3 = a ^ 1;
        if (a(this.y)) {
            a(this.y, i, 0, i2, this.C);
            measuredWidth = this.y.getMeasuredWidth() + b(this.y);
            max = Math.max(0, this.y.getMeasuredHeight() + c(this.y));
            combineMeasuredStates = View.combineMeasuredStates(0, this.y.getMeasuredState());
        } else {
            measuredWidth = 0;
            combineMeasuredStates = 0;
            max = 0;
        }
        if (a(this.d)) {
            a(this.d, i, 0, i2, this.C);
            measuredWidth = this.d.getMeasuredWidth() + b(this.d);
            max = Math.max(max, this.d.getMeasuredHeight() + c(this.d));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.d.getMeasuredState());
        }
        int o = o();
        int max2 = Math.max(o, measuredWidth);
        iArr[a] = Math.max(0, o - measuredWidth);
        if (a(this.a)) {
            a(this.a, i, max2, i2, this.C);
            measuredWidth = this.a.getMeasuredWidth() + b(this.a);
            max = Math.max(max, this.a.getMeasuredHeight() + c(this.a));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.a.getMeasuredState());
        } else {
            measuredWidth = 0;
        }
        o = p();
        max2 += Math.max(o, measuredWidth);
        iArr[i3] = Math.max(0, o - measuredWidth);
        if (a(this.e)) {
            max2 += a(this.e, i, max2, i2, 0, iArr);
            max = Math.max(max, this.e.getMeasuredHeight() + c(this.e));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.e.getMeasuredState());
        }
        if (a(this.z)) {
            max2 += a(this.z, i, max2, i2, 0, iArr);
            max = Math.max(max, this.z.getMeasuredHeight() + c(this.z));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.z.getMeasuredState());
        }
        i3 = getChildCount();
        int i4 = max;
        max = combineMeasuredStates;
        for (combineMeasuredStates = 0; combineMeasuredStates < i3; combineMeasuredStates++) {
            View childAt = getChildAt(combineMeasuredStates);
            if (((asf) childAt.getLayoutParams()).b == 0 && a(childAt)) {
                max2 += a(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + c(childAt));
                max = View.combineMeasuredStates(max, childAt.getMeasuredState());
            }
        }
        i3 = this.k + this.l;
        combineMeasuredStates = this.i + this.j;
        if (a(this.w)) {
            a(this.w, i, max2 + combineMeasuredStates, i2, i3, iArr);
            measuredWidth = this.w.getMeasuredWidth() + b(this.w);
            measuredHeight = this.w.getMeasuredHeight() + c(this.w);
            combineMeasuredStates2 = View.combineMeasuredStates(max, this.w.getMeasuredState());
            max = measuredWidth;
        } else {
            combineMeasuredStates2 = max;
            max = 0;
            measuredHeight = 0;
        }
        if (a(this.x)) {
            int i5 = measuredHeight + i3;
            i3 = combineMeasuredStates2;
            max = Math.max(max, a(this.x, i, max2 + combineMeasuredStates, i2, i5, iArr));
            measuredHeight += this.x.getMeasuredHeight() + c(this.x);
            combineMeasuredStates2 = View.combineMeasuredStates(i3, this.x.getMeasuredState());
        } else {
            i3 = combineMeasuredStates2;
        }
        measuredWidth = Math.max(i4, measuredHeight);
        o = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        o = View.resolveSizeAndState(Math.max((max2 + max) + (o + paddingRight), getSuggestedMinimumWidth()), i, -16777216 & combineMeasuredStates2);
        measuredWidth = View.resolveSizeAndState(Math.max(measuredWidth + (paddingTop + paddingBottom), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16);
        if (this.v) {
            paddingRight = getChildCount();
            for (paddingTop = 0; paddingTop < paddingRight; paddingTop++) {
                View childAt2 = getChildAt(paddingTop);
                if (a(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
            }
            measuredWidth = 0;
        }
        setMeasuredDimension(o, measuredWidth);
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02b0 A:{LOOP_END, LOOP:0: B:105:0x02ae->B:106:0x02b0} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d2 A:{LOOP_END, LOOP:1: B:108:0x02d0->B:109:0x02d2} */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f8 A:{LOOP_END, LOOP:2: B:111:0x02f6->B:112:0x02f8} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0348 A:{LOOP_END, LOOP:3: B:119:0x0346->B:120:0x0348} */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        r18 = this;
        r0 = r18;
        r1 = defpackage.abe.g(r18);
        r2 = r18.getWidth();
        r3 = r18.getHeight();
        r4 = r18.getPaddingLeft();
        r5 = r18.getPaddingRight();
        r6 = r18.getPaddingTop();
        r7 = r18.getPaddingBottom();
        r8 = r2 - r5;
        r9 = r0.L;
        r10 = 1;
        r11 = 0;
        r9[r10] = r11;
        r9[r11] = r11;
        r12 = defpackage.abe.o(r18);
        if (r12 < 0) goto L_0x0035;
    L_0x002e:
        r13 = r23 - r21;
        r12 = java.lang.Math.min(r12, r13);
        goto L_0x0036;
    L_0x0035:
        r12 = 0;
    L_0x0036:
        r13 = r0.y;
        r13 = r0.a(r13);
        if (r13 != 0) goto L_0x0041;
    L_0x003e:
        r13 = r4;
    L_0x003f:
        r14 = r8;
        goto L_0x0052;
    L_0x0041:
        if (r1 == r10) goto L_0x004a;
    L_0x0043:
        r13 = r0.y;
        r13 = r0.a(r13, r4, r9, r12);
        goto L_0x003f;
    L_0x004a:
        r13 = r0.y;
        r13 = r0.b(r13, r8, r9, r12);
        r14 = r13;
        r13 = r4;
    L_0x0052:
        r15 = r0.d;
        r15 = r0.a(r15);
        if (r15 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x006a;
    L_0x005b:
        if (r1 == r10) goto L_0x0064;
    L_0x005d:
        r15 = r0.d;
        r13 = r0.a(r15, r13, r9, r12);
        goto L_0x006a;
    L_0x0064:
        r15 = r0.d;
        r14 = r0.b(r15, r14, r9, r12);
    L_0x006a:
        r15 = r0.a;
        r15 = r0.a(r15);
        if (r15 != 0) goto L_0x0073;
    L_0x0072:
        goto L_0x0082;
    L_0x0073:
        if (r1 != r10) goto L_0x007c;
    L_0x0075:
        r15 = r0.a;
        r13 = r0.a(r15, r13, r9, r12);
        goto L_0x0082;
    L_0x007c:
        r15 = r0.a;
        r14 = r0.b(r15, r14, r9, r12);
    L_0x0082:
        r15 = defpackage.abe.g(r18);
        if (r15 != r10) goto L_0x008d;
    L_0x0088:
        r15 = r18.p();
        goto L_0x0091;
    L_0x008d:
        r15 = r18.o();
    L_0x0091:
        r11 = defpackage.abe.g(r18);
        if (r11 != r10) goto L_0x009c;
    L_0x0097:
        r11 = r18.o();
        goto L_0x00a0;
    L_0x009c:
        r11 = r18.p();
    L_0x00a0:
        r10 = r15 - r13;
        r22 = r5;
        r5 = 0;
        r10 = java.lang.Math.max(r5, r10);
        r9[r5] = r10;
        r10 = r8 - r14;
        r10 = r11 - r10;
        r10 = java.lang.Math.max(r5, r10);
        r5 = 1;
        r9[r5] = r10;
        r10 = java.lang.Math.max(r13, r15);
        r8 = r8 - r11;
        r8 = java.lang.Math.min(r14, r8);
        r11 = r0.e;
        r11 = r0.a(r11);
        if (r11 != 0) goto L_0x00c8;
    L_0x00c7:
        goto L_0x00d7;
    L_0x00c8:
        if (r1 == r5) goto L_0x00d1;
    L_0x00ca:
        r11 = r0.e;
        r10 = r0.a(r11, r10, r9, r12);
        goto L_0x00d7;
    L_0x00d1:
        r11 = r0.e;
        r8 = r0.b(r11, r8, r9, r12);
    L_0x00d7:
        r11 = r0.z;
        r11 = r0.a(r11);
        if (r11 != 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x00ef;
    L_0x00e0:
        if (r1 == r5) goto L_0x00e9;
    L_0x00e2:
        r5 = r0.z;
        r10 = r0.a(r5, r10, r9, r12);
        goto L_0x00ef;
    L_0x00e9:
        r5 = r0.z;
        r8 = r0.b(r5, r8, r9, r12);
    L_0x00ef:
        r5 = r0.w;
        r5 = r0.a(r5);
        r11 = r0.x;
        r11 = r0.a(r11);
        if (r5 == 0) goto L_0x0112;
    L_0x00fd:
        r13 = r0.w;
        r13 = r13.getLayoutParams();
        r13 = (defpackage.asf) r13;
        r14 = r13.topMargin;
        r15 = r0.w;
        r15 = r15.getMeasuredHeight();
        r14 = r14 + r15;
        r13 = r13.bottomMargin;
        r13 = r13 + r14;
        goto L_0x0113;
    L_0x0112:
        r13 = 0;
    L_0x0113:
        if (r11 == 0) goto L_0x012d;
    L_0x0115:
        r14 = r0.x;
        r14 = r14.getLayoutParams();
        r14 = (defpackage.asf) r14;
        r15 = r14.topMargin;
        r16 = r2;
        r2 = r0.x;
        r2 = r2.getMeasuredHeight();
        r15 = r15 + r2;
        r2 = r14.bottomMargin;
        r15 = r15 + r2;
        r13 = r13 + r15;
        goto L_0x012f;
    L_0x012d:
        r16 = r2;
    L_0x012f:
        if (r5 != 0) goto L_0x0139;
    L_0x0131:
        if (r11 != 0) goto L_0x0139;
    L_0x0133:
        r17 = r4;
        r21 = r12;
        goto L_0x02a1;
    L_0x0139:
        if (r5 != 0) goto L_0x013e;
    L_0x013b:
        r2 = r0.x;
        goto L_0x0140;
    L_0x013e:
        r2 = r0.w;
    L_0x0140:
        if (r11 != 0) goto L_0x0145;
    L_0x0142:
        r14 = r0.w;
        goto L_0x0147;
    L_0x0145:
        r14 = r0.x;
    L_0x0147:
        r2 = r2.getLayoutParams();
        r2 = (defpackage.asf) r2;
        r14 = r14.getLayoutParams();
        r14 = (defpackage.asf) r14;
        if (r5 == 0) goto L_0x0161;
    L_0x0155:
        r15 = r0.w;
        r15 = r15.getMeasuredWidth();
        if (r15 <= 0) goto L_0x0161;
    L_0x015d:
        r17 = r4;
        r15 = 1;
        goto L_0x016f;
    L_0x0161:
        if (r11 == 0) goto L_0x016c;
    L_0x0163:
        r15 = r0.x;
        r15 = r15.getMeasuredWidth();
        if (r15 <= 0) goto L_0x016c;
    L_0x016b:
        goto L_0x015d;
    L_0x016c:
        r17 = r4;
        r15 = 0;
    L_0x016f:
        r4 = r0.F;
        r4 = r4 & 112;
        r21 = r12;
        r12 = 48;
        if (r4 == r12) goto L_0x01b8;
    L_0x0179:
        r12 = 80;
        if (r4 == r12) goto L_0x01ac;
    L_0x017d:
        r4 = r3 - r6;
        r4 = r4 - r7;
        r4 = r4 - r13;
        r4 = r4 / 2;
        r12 = r2.topMargin;
        r23 = r10;
        r10 = r0.k;
        r12 = r12 + r10;
        if (r4 >= r12) goto L_0x0193;
    L_0x018c:
        r2 = r2.topMargin;
        r3 = r0.k;
        r4 = r2 + r3;
        goto L_0x01aa;
    L_0x0193:
        r3 = r3 - r7;
        r3 = r3 - r13;
        r3 = r3 - r4;
        r3 = r3 - r6;
        r2 = r2.bottomMargin;
        r7 = r0.l;
        r2 = r2 + r7;
        if (r3 >= r2) goto L_0x01aa;
    L_0x019e:
        r2 = r14.bottomMargin;
        r7 = r0.l;
        r2 = r2 + r7;
        r2 = r2 - r3;
        r4 = r4 - r2;
        r2 = 0;
        r4 = java.lang.Math.max(r2, r4);
    L_0x01aa:
        r6 = r6 + r4;
        goto L_0x01c5;
    L_0x01ac:
        r23 = r10;
        r3 = r3 - r7;
        r2 = r14.bottomMargin;
        r3 = r3 - r2;
        r2 = r0.l;
        r3 = r3 - r2;
        r6 = r3 - r13;
        goto L_0x01c5;
    L_0x01b8:
        r23 = r10;
        r3 = r18.getPaddingTop();
        r2 = r2.topMargin;
        r3 = r3 + r2;
        r2 = r0.k;
        r6 = r3 + r2;
    L_0x01c5:
        r2 = 1;
        if (r1 != r2) goto L_0x0237;
    L_0x01c8:
        if (r15 == 0) goto L_0x01cd;
    L_0x01ca:
        r1 = r0.i;
        goto L_0x01ce;
    L_0x01cd:
        r1 = 0;
    L_0x01ce:
        r3 = r9[r2];
        r1 = r1 - r3;
        r3 = 0;
        r4 = java.lang.Math.max(r3, r1);
        r8 = r8 - r4;
        r1 = -r1;
        r1 = java.lang.Math.max(r3, r1);
        r9[r2] = r1;
        if (r5 == 0) goto L_0x0204;
    L_0x01e0:
        r1 = r0.w;
        r1 = r1.getLayoutParams();
        r1 = (defpackage.asf) r1;
        r2 = r0.w;
        r2 = r2.getMeasuredWidth();
        r2 = r8 - r2;
        r3 = r0.w;
        r3 = r3.getMeasuredHeight();
        r3 = r3 + r6;
        r4 = r0.w;
        r4.layout(r2, r6, r8, r3);
        r4 = r0.j;
        r2 = r2 - r4;
        r1 = r1.bottomMargin;
        r6 = r3 + r1;
        goto L_0x0205;
    L_0x0204:
        r2 = r8;
    L_0x0205:
        if (r11 == 0) goto L_0x022d;
    L_0x0207:
        r1 = r0.x;
        r1 = r1.getLayoutParams();
        r1 = (defpackage.asf) r1;
        r3 = r1.topMargin;
        r6 = r6 + r3;
        r3 = r0.x;
        r3 = r3.getMeasuredWidth();
        r4 = r0.x;
        r4 = r4.getMeasuredHeight();
        r5 = r0.x;
        r3 = r8 - r3;
        r4 = r4 + r6;
        r5.layout(r3, r6, r8, r4);
        r3 = r0.j;
        r3 = r8 - r3;
        r1 = r1.bottomMargin;
        goto L_0x022e;
    L_0x022d:
        r3 = r8;
    L_0x022e:
        if (r15 == 0) goto L_0x0234;
    L_0x0230:
        r8 = java.lang.Math.min(r2, r3);
    L_0x0234:
        r10 = r23;
        goto L_0x02a1;
    L_0x0237:
        if (r15 == 0) goto L_0x023c;
    L_0x0239:
        r1 = r0.i;
        goto L_0x023d;
    L_0x023c:
        r1 = 0;
    L_0x023d:
        r2 = 0;
        r3 = r9[r2];
        r1 = r1 - r3;
        r3 = java.lang.Math.max(r2, r1);
        r10 = r23 + r3;
        r1 = -r1;
        r1 = java.lang.Math.max(r2, r1);
        r9[r2] = r1;
        if (r5 == 0) goto L_0x0273;
    L_0x0250:
        r1 = r0.w;
        r1 = r1.getLayoutParams();
        r1 = (defpackage.asf) r1;
        r2 = r0.w;
        r2 = r2.getMeasuredWidth();
        r2 = r2 + r10;
        r3 = r0.w;
        r3 = r3.getMeasuredHeight();
        r3 = r3 + r6;
        r4 = r0.w;
        r4.layout(r10, r6, r2, r3);
        r4 = r0.j;
        r2 = r2 + r4;
        r1 = r1.bottomMargin;
        r6 = r3 + r1;
        goto L_0x0274;
    L_0x0273:
        r2 = r10;
    L_0x0274:
        if (r11 == 0) goto L_0x029a;
    L_0x0276:
        r1 = r0.x;
        r1 = r1.getLayoutParams();
        r1 = (defpackage.asf) r1;
        r3 = r1.topMargin;
        r6 = r6 + r3;
        r3 = r0.x;
        r3 = r3.getMeasuredWidth();
        r3 = r3 + r10;
        r4 = r0.x;
        r4 = r4.getMeasuredHeight();
        r5 = r0.x;
        r4 = r4 + r6;
        r5.layout(r10, r6, r3, r4);
        r4 = r0.j;
        r3 = r3 + r4;
        r1 = r1.bottomMargin;
        goto L_0x029b;
    L_0x029a:
        r3 = r10;
    L_0x029b:
        if (r15 == 0) goto L_0x02a1;
    L_0x029d:
        r10 = java.lang.Math.max(r2, r3);
    L_0x02a1:
        r1 = r0.K;
        r2 = 3;
        r0.a(r1, r2);
        r1 = r0.K;
        r1 = r1.size();
        r2 = 0;
    L_0x02ae:
        if (r2 >= r1) goto L_0x02c1;
    L_0x02b0:
        r3 = r0.K;
        r3 = r3.get(r2);
        r3 = (android.view.View) r3;
        r11 = r21;
        r10 = r0.a(r3, r10, r9, r11);
        r2 = r2 + 1;
        goto L_0x02ae;
    L_0x02c1:
        r11 = r21;
        r1 = r0.K;
        r2 = 5;
        r0.a(r1, r2);
        r1 = r0.K;
        r1 = r1.size();
        r2 = 0;
    L_0x02d0:
        if (r2 >= r1) goto L_0x02e1;
    L_0x02d2:
        r3 = r0.K;
        r3 = r3.get(r2);
        r3 = (android.view.View) r3;
        r8 = r0.b(r3, r8, r9, r11);
        r2 = r2 + 1;
        goto L_0x02d0;
    L_0x02e1:
        r1 = r0.K;
        r2 = 1;
        r0.a(r1, r2);
        r1 = r0.K;
        r3 = 0;
        r4 = r9[r3];
        r2 = r9[r2];
        r3 = r1.size();
        r6 = r2;
        r5 = r4;
        r2 = 0;
        r4 = 0;
    L_0x02f6:
        if (r2 >= r3) goto L_0x0329;
    L_0x02f8:
        r7 = r1.get(r2);
        r7 = (android.view.View) r7;
        r12 = r7.getLayoutParams();
        r12 = (defpackage.asf) r12;
        r13 = r12.leftMargin;
        r13 = r13 - r5;
        r5 = r12.rightMargin;
        r5 = r5 - r6;
        r6 = 0;
        r12 = java.lang.Math.max(r6, r13);
        r14 = java.lang.Math.max(r6, r5);
        r13 = -r13;
        r13 = java.lang.Math.max(r6, r13);
        r5 = -r5;
        r5 = java.lang.Math.max(r6, r5);
        r7 = r7.getMeasuredWidth();
        r12 = r12 + r7;
        r12 = r12 + r14;
        r4 = r4 + r12;
        r2 = r2 + 1;
        r6 = r5;
        r5 = r13;
        goto L_0x02f6;
    L_0x0329:
        r6 = 0;
        r2 = r16 - r17;
        r2 = r2 - r22;
        r2 = r2 / 2;
        r1 = r17 + r2;
        r2 = r4 / 2;
        r1 = r1 - r2;
        r4 = r4 + r1;
        if (r1 >= r10) goto L_0x0339;
    L_0x0338:
        goto L_0x0340;
    L_0x0339:
        if (r4 <= r8) goto L_0x033f;
    L_0x033b:
        r4 = r4 - r8;
        r10 = r1 - r4;
        goto L_0x0340;
    L_0x033f:
        r10 = r1;
    L_0x0340:
        r1 = r0.K;
        r1 = r1.size();
    L_0x0346:
        if (r6 >= r1) goto L_0x0357;
    L_0x0348:
        r2 = r0.K;
        r2 = r2.get(r6);
        r2 = (android.view.View) r2;
        r10 = r0.a(r2, r10, r9, r11);
        r6 = r6 + 1;
        goto L_0x0346;
    L_0x0357:
        r1 = r0.K;
        r1.clear();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    private final int a(View view, int i, int[] iArr, int i2) {
        asf asf = (asf) view.getLayoutParams();
        int i3 = asf.leftMargin - iArr[0];
        i += Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = a(view, i2);
        i2 = view.getMeasuredWidth();
        view.layout(i, a, i + i2, view.getMeasuredHeight() + a);
        return i + (i2 + asf.rightMargin);
    }

    private final int b(View view, int i, int[] iArr, int i2) {
        asf asf = (asf) view.getLayoutParams();
        int i3 = asf.rightMargin - iArr[1];
        i -= Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = a(view, i2);
        i2 = view.getMeasuredWidth();
        view.layout(i - i2, a, i, view.getMeasuredHeight() + a);
        return i - (i2 + asf.leftMargin);
    }

    private final int a(View view, int i) {
        asf asf = (asf) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        i = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i2 = asf.a & 112;
        if (!(i2 == 16 || i2 == 48 || i2 == 80)) {
            i2 = this.F & 112;
        }
        if (i2 == 48) {
            return getPaddingTop() - i;
        }
        if (i2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - asf.bottomMargin) - i;
        }
        i = getPaddingTop();
        i2 = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - i) - i2) - measuredHeight) / 2;
        if (i3 >= asf.topMargin) {
            height = (((height - i2) - measuredHeight) - i3) - i;
            if (height < asf.bottomMargin) {
                i3 = Math.max(0, i3 - (asf.bottomMargin - height));
            }
        } else {
            i3 = asf.topMargin;
        }
        return i + i3;
    }

    private final void a(List list, int i) {
        int g = abe.g(this);
        int childCount = getChildCount();
        i = Gravity.getAbsoluteGravity(i, abe.g(this));
        list.clear();
        if (g == 1) {
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    View childAt = getChildAt(childCount);
                    asf asf = (asf) childAt.getLayoutParams();
                    if (asf.b == 0) {
                        if (a(childAt) && e(asf.a) == i) {
                            list.add(childAt);
                        }
                    }
                } else {
                    return;
                }
            }
        }
        for (g = 0; g < childCount; g++) {
            View childAt2 = getChildAt(g);
            asf asf2 = (asf) childAt2.getLayoutParams();
            if (asf2.b == 0 && a(childAt2) && e(asf2.a) == i) {
                list.add(childAt2);
            }
        }
    }

    private final int e(int i) {
        int g = abe.g(this);
        i = Gravity.getAbsoluteGravity(i, g) & 7;
        if (i == 1 || i == 3 || i == 5) {
            return i;
        }
        return g == 1 ? 5 : 3;
    }

    private final boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static int c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static asf a(LayoutParams layoutParams) {
        if (layoutParams instanceof asf) {
            return new asf((asf) layoutParams);
        }
        if (layoutParams instanceof adv) {
            return new asf((adv) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new asf((MarginLayoutParams) layoutParams);
        }
        return new asf(layoutParams);
    }

    public static asf i() {
        return new asf();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof asf);
    }

    public final amh j() {
        if (this.N == null) {
            this.N = new asj(this, true);
        }
        return this.N;
    }

    private final boolean d(View view) {
        return view.getParent() == this || this.p.contains(view);
    }

    private final void r() {
        if (this.D == null) {
            this.D = new aqs();
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return i();
    }
}
