package com.facebook.litho;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.youtube.R;
import defpackage.aaf;
import defpackage.abe;
import defpackage.abo;
import defpackage.clj;
import defpackage.cmb;
import defpackage.cmd;
import defpackage.cmf;
import defpackage.cmg;
import defpackage.cmh;
import defpackage.cmi;
import defpackage.cmj;
import defpackage.cmu;
import defpackage.cmv;
import defpackage.coj;
import defpackage.cok;
import defpackage.cpa;
import defpackage.cqb;
import defpackage.cqi;
import defpackage.cqq;
import defpackage.crp;
import defpackage.crq;
import defpackage.crs;
import defpackage.css;
import defpackage.cuj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComponentHost extends ViewGroup {
    private cmb A;
    private boolean B;
    private crq C;
    public aaf a;
    public aaf b;
    public aaf c;
    public aaf d;
    public aaf e;
    public aaf f;
    public ArrayList g;
    public Object h;
    public SparseArray i;
    public final cmh j;
    public cqq k;
    public boolean l;
    public cmd m;
    public cmv n;
    public cmf o;
    public cmu p;
    public coj q;
    public boolean r;
    public boolean s;
    private CharSequence t;
    private boolean u;
    private boolean v;
    private boolean w;
    private final cmj x;
    private int[] y;
    private boolean z;

    public ComponentHost(Context context) {
        this(new cmg(context));
    }

    public void a(int i, int i2, int i3, int i4) {
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public ComponentHost(cmg cmg) {
        super(cmg.b, null);
        this.x = new cmj(this);
        this.j = new cmh();
        this.y = new int[0];
        this.B = false;
        this.r = false;
        this.s = false;
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        b(clj.a(cmg.b));
        this.a = new aaf();
        this.c = new aaf();
        this.e = new aaf();
        this.g = new ArrayList();
    }

    public final void a(int i, cqb cqb, Rect rect) {
        Object obj = cqb.d;
        boolean z = true;
        if (obj instanceof Drawable) {
            c();
            this.e.b(i, cqb);
            Drawable drawable = (Drawable) cqb.d;
            int i2 = cqb.j;
            cqi cqi = cqb.a;
            if (getVisibility() != 0) {
                z = false;
            }
            drawable.setVisible(z, false);
            drawable.setCallback(this);
            cmi.a((View) this, drawable, i2, cqi);
            invalidate(rect);
        } else if (obj instanceof View) {
            b();
            this.c.b(i, cqb);
            View view = (View) obj;
            view.setDuplicateParentStateEnabled(cqb.a(cqb.j));
            this.l = true;
            if ((view instanceof ComponentHost) && view.getParent() == this) {
                abe.m(view);
                view.setVisibility(0);
            } else {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.z) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
            }
            b(i, cqb);
        }
        a();
        this.a.b(i, cqb);
        cmi.a(cqb);
    }

    public final void a() {
        if (this.a == null) {
            this.a = new aaf();
        }
    }

    public final void b() {
        if (this.c == null) {
            this.c = new aaf();
        }
    }

    public final void c() {
        if (this.e == null) {
            this.e = new aaf();
        }
    }

    public final void d() {
        if (this.g == null) {
            this.g = new ArrayList();
        }
    }

    public final void a(int i, cqb cqb) {
        Object obj = cqb.d;
        if (obj instanceof Drawable) {
            c();
            a(cqb);
            cmi.b(i, this.e, this.f);
        } else if (obj instanceof View) {
            a((View) obj);
            b();
            cmi.b(i, this.c, this.d);
            this.l = true;
            c(i, cqb);
        }
        a();
        cmi.b(i, this.a, this.b);
        k();
        cmi.a(cqb);
    }

    public final boolean e() {
        ArrayList arrayList = this.g;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* Access modifiers changed, original: final */
    public final void b(int i, cqb cqb) {
        css css = cqb.b;
        if (css != null) {
            Rect b = css.b();
            if (b != null && !equals(cqb.d)) {
                if (this.C == null) {
                    this.C = new crq(this);
                    setTouchDelegate(this.C);
                }
                View view = (View) cqb.d;
                aaf aaf = this.C.b;
                crp crp = (crp) crp.a.a();
                if (crp == null) {
                    crp = new crp();
                }
                crp.b = view;
                crp.d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                crp.e.set(b);
                crp.f.set(b);
                int i2 = -crp.d;
                crp.f.inset(i2, i2);
                aaf.b(i, crp);
            }
        }
    }

    public final void c(int i, cqb cqb) {
        css css = cqb.b;
        if (!(css == null || this.C == null || css.b() == null || equals(cqb.d))) {
            crq crq = this.C;
            aaf aaf = crq.c;
            if (aaf != null) {
                int f = aaf.f(i);
                if (f >= 0) {
                    crp crp = (crp) crq.c.e(f);
                    crq.c.c(f);
                    crp.a();
                    return;
                }
            }
            i = crq.b.f(i);
            crp crp2 = (crp) crq.b.e(i);
            crq.b.c(i);
            crp2.a();
        }
    }

    public final int f() {
        aaf aaf = this.a;
        return aaf != null ? aaf.c() : 0;
    }

    public final cqb a(int i) {
        return (cqb) this.a.e(i);
    }

    public final cqb g() {
        for (int i = 0; i < f(); i++) {
            cqb a = a(i);
            if (a.b()) {
                return a;
            }
        }
        return null;
    }

    public TextContent getTextContent() {
        List singletonList;
        a();
        aaf aaf = this.a;
        int c = aaf.c();
        int i = 0;
        if (c == 1) {
            singletonList = Collections.singletonList(((cqb) aaf.e(0)).d);
        } else {
            ArrayList arrayList = new ArrayList(c);
            while (i < c) {
                arrayList.add(((cqb) aaf.e(i)).d);
                i++;
            }
            singletonList = arrayList;
        }
        return cmi.a(singletonList);
    }

    public final CharSequence getContentDescription() {
        return this.t;
    }

    public final void setContentDescription(CharSequence charSequence) {
        this.t = charSequence;
        if (!TextUtils.isEmpty(charSequence) && abe.f(this) == 0) {
            abe.b((View) this, 1);
        }
        h();
    }

    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (i == R.id.component_node_info && obj != null) {
            b(clj.a(getContext()));
            cmb cmb = this.A;
            if (cmb != null) {
                cmb.f = (cqi) obj;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(cqb cqb, int i, int i2) {
        css css = cqb.b;
        if (!(css == null || css.b() == null)) {
            crq crq = this.C;
            if (crq != null) {
                aaf aaf;
                if (crq.b.a(i2) != null) {
                    if (crq.c == null) {
                        aaf = (aaf) crq.a.a();
                        if (aaf == null) {
                            aaf = new aaf(4);
                        }
                        crq.c = aaf;
                    }
                    cmi.a(i2, crq.b, crq.c);
                }
                cmi.a(i, i2, crq.b, crq.c);
                aaf = crq.c;
                if (aaf != null && aaf.c() == 0) {
                    crq.a.a(crq.c);
                    crq.c = null;
                }
            }
        }
        Object obj = cqb.d;
        b();
        if (obj instanceof Drawable) {
            c();
            if (this.e.a(i2) != null) {
                if (this.f == null) {
                    this.f = new aaf(4);
                }
                cmi.a(i2, this.e, this.f);
            }
            cmi.a(i, i2, this.e, this.f);
            invalidate();
            k();
        } else if (obj instanceof View) {
            this.l = true;
            View view = (View) obj;
            view.cancelPendingInputEvents();
            abe.l(view);
            if (this.c.a(i2) != null) {
                if (this.d == null) {
                    this.d = new aaf(4);
                }
                cmi.a(i2, this.c, this.d);
            }
            cmi.a(i, i2, this.c, this.d);
        }
        a();
        if (this.a.a(i2) != null) {
            if (this.b == null) {
                this.b = new aaf(4);
            }
            cmi.a(i2, this.a, this.b);
        }
        cmi.a(i, i2, this.a, this.b);
        k();
        if (obj instanceof View) {
            abe.m((View) obj);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        coj coj = this.q;
        if (coj == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (cok.e == null) {
            cok.e = new cpa();
        }
        cok.e.b = motionEvent;
        cok.e.a = this;
        boolean booleanValue = ((Boolean) coj.a.m().a(coj, cok.e)).booleanValue();
        cok.e.b = null;
        cok.e.a = null;
        return booleanValue;
    }

    public final void a(boolean z) {
        if (this.w != z) {
            this.w = z;
            if (!z) {
                if (this.u) {
                    invalidate();
                    this.u = false;
                }
                if (this.v) {
                    h();
                    this.v = false;
                }
            }
        }
    }

    public final void h() {
        if (this.B) {
            if (this.w) {
                this.v = true;
            } else if (this.A != null && l()) {
                cmb cmb = this.A;
                if (cmb.b.isEnabled()) {
                    ViewParent parent = cmb.c.getParent();
                    if (parent != null) {
                        AccessibilityEvent b = cmb.b(-1, 2048);
                        b.setContentChangeTypes(1);
                        abo.a(parent, cmb.c, b);
                    }
                }
            }
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return (this.A != null && l() && this.A.a(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    private final boolean l() {
        cqb g = g();
        return g != null && g.c.r();
    }

    private final List m() {
        ArrayList arrayList = new ArrayList();
        aaf aaf = this.e;
        int i = 0;
        int c = aaf != null ? aaf.c() : 0;
        while (i < c) {
            cqi cqi = ((cqb) this.e.e(i)).a;
            if (cqi != null) {
                CharSequence charSequence = cqi.a;
                if (charSequence != null) {
                    arrayList.add(charSequence);
                }
            }
            i++;
        }
        CharSequence charSequence2 = this.t;
        if (charSequence2 != null) {
            arrayList.add(charSequence2);
        }
        return arrayList;
    }

    public final void a(View view) {
        this.l = true;
        if (this.z) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        cmj cmj = this.x;
        cmj.a = canvas;
        int i = 0;
        cmj.b = 0;
        aaf aaf = cmj.d.a;
        cmj.c = aaf != null ? aaf.c() : 0;
        super.dispatchDraw(canvas);
        if (this.x.a()) {
            this.x.b();
        }
        cmj = this.x;
        ComponentHost componentHost = cmj.d;
        cmh cmh = componentHost.j;
        if (cmh.c) {
            cqq cqq = componentHost.k;
            cmh.a.toArray(new String[0]);
            cqq.d();
            cmh.b.toArray(new Double[0]);
            cqq.e();
            cmh.c = false;
            cmh.a.clear();
            cmh.b.clear();
            cmj.d.k = null;
        }
        cmj.a = null;
        ArrayList arrayList = this.g;
        int size = arrayList != null ? arrayList.size() : 0;
        while (i < size) {
            Object obj = ((cqb) this.g.get(i)).d;
            if (obj instanceof Drawable) {
                ((Drawable) obj).draw(canvas);
            }
            i++;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.l) {
            int i3;
            i = getChildCount();
            if (this.y.length < i) {
                this.y = new int[(i + 5)];
            }
            aaf aaf = this.c;
            i = aaf != null ? aaf.c() : 0;
            int i4 = 0;
            int i5 = 0;
            while (i4 < i) {
                i3 = i5 + 1;
                this.y[i5] = indexOfChild((View) ((cqb) this.c.e(i4)).d);
                i4++;
                i5 = i3;
            }
            ArrayList arrayList = this.g;
            i = arrayList != null ? arrayList.size() : 0;
            for (i4 = 0; i4 < i; i4++) {
                Object obj = ((cqb) this.g.get(i4)).d;
                if (obj instanceof View) {
                    i3 = i5 + 1;
                    this.y[i5] = indexOfChild((View) obj);
                    i5 = i3;
                }
            }
            this.l = false;
        }
        if (this.x.a()) {
            this.x.b();
        }
        return this.y[i2];
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            aaf aaf = this.e;
            int c = aaf != null ? aaf.c() : 0;
            while (true) {
                c--;
                if (c < 0) {
                    break;
                }
                cqb cqb = (cqb) this.e.e(c);
                Object obj = cqb.d;
                if (obj instanceof crs) {
                    if ((cqb.j & 2) != 2) {
                        crs crs = (crs) obj;
                        if (crs.a(motionEvent) && crs.a(motionEvent, this)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.z = true;
        a(i, i2, i3, i4);
        this.z = false;
    }

    public final void requestLayout() {
        ViewParent viewParent = this;
        while (viewParent instanceof ComponentHost) {
            if (((ComponentHost) viewParent).i()) {
                viewParent = viewParent.getParent();
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public boolean i() {
        return this.z ^ 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        aaf aaf = this.e;
        int i = 0;
        int c = aaf != null ? aaf.c() : 0;
        while (i < c) {
            cqb cqb = (cqb) this.e.e(i);
            cmi.a((View) this, (Drawable) cqb.d, cqb.j, cqb.a);
            i++;
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        aaf aaf = this.e;
        int i = 0;
        int c = aaf != null ? aaf.c() : 0;
        while (i < c) {
            ((Drawable) ((cqb) this.e.e(i)).d).jumpToCurrentState();
            i++;
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        aaf aaf = this.e;
        int c = aaf != null ? aaf.c() : 0;
        for (int i2 = 0; i2 < c; i2++) {
            ((Drawable) ((cqb) this.e.e(i2)).d).setVisible(i == 0, false);
        }
    }

    public Object getTag() {
        Object obj = this.h;
        return obj == null ? super.getTag() : obj;
    }

    public final Object getTag(int i) {
        SparseArray sparseArray = this.i;
        if (sparseArray != null) {
            Object obj = sparseArray.get(i);
            if (obj != null) {
                return obj;
            }
        }
        return super.getTag(i);
    }

    public final void invalidate(Rect rect) {
        if (this.w) {
            this.u = true;
        } else {
            super.invalidate(rect);
        }
    }

    public final void invalidate(int i, int i2, int i3, int i4) {
        if (this.w) {
            this.u = true;
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }

    public final void invalidate() {
        if (this.w) {
            this.u = true;
        } else {
            super.invalidate();
        }
    }

    public final void b(boolean z) {
        if (z != this.B) {
            if (z && this.A == null) {
                boolean isFocusable = isFocusable();
                this.A = new cmb(this, isFocusable(), abe.f(this));
                setFocusable(isFocusable);
            }
            abe.a((View) this, z ? this.A : null);
            this.B = z;
            if (z) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof ComponentHost) {
                        ((ComponentHost) childAt).b(true);
                    } else {
                        cqi cqi = (cqi) childAt.getTag(R.id.component_node_info);
                        if (cqi != null) {
                            abe.a(childAt, new cmb(childAt, cqi, childAt.isFocusable(), abe.f(childAt)));
                        }
                    }
                }
            }
        }
    }

    public final void setAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        super.setAccessibilityDelegate(accessibilityDelegate);
        this.B = false;
    }

    public final boolean hasOverlappingRendering() {
        return cuj.k;
    }

    public final void setClipChildren(boolean z) {
        if (this.r) {
            this.s = z;
        } else {
            super.setClipChildren(z);
        }
    }

    @Deprecated
    public final void addView(View view) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void addView(View view, int i) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void addView(View view, int i, LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    /* Access modifiers changed, original: protected|final */
    @Deprecated
    public final boolean addViewInLayout(View view, int i, LayoutParams layoutParams, boolean z) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    /* Access modifiers changed, original: protected|final */
    @Deprecated
    public final void attachViewToParent(View view, int i, LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void removeView(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void removeAllViewsInLayout() {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    /* Access modifiers changed, original: protected|final */
    @Deprecated
    public final void removeDetachedView(View view, boolean z) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    public final List j() {
        aaf aaf = this.e;
        int c = aaf != null ? aaf.c() : 0;
        List list = null;
        for (int i = 0; i < c; i++) {
            cqb cqb = (cqb) this.e.e(i);
            if ((cqb.j & 4) != 0) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add((Drawable) cqb.d);
            }
        }
        return list;
    }

    public final void k() {
        aaf aaf = this.b;
        if (aaf != null && aaf.c() == 0) {
            this.b = null;
        }
        aaf = this.d;
        if (aaf != null && aaf.c() == 0) {
            this.d = null;
        }
    }

    public final void a(cqb cqb) {
        Drawable drawable = (Drawable) cqb.d;
        drawable.setCallback(null);
        invalidate(drawable.getBounds());
        k();
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 512 || i == 256) {
            CharSequence join;
            if (TextUtils.isEmpty(this.t)) {
                String str = ", ";
                join = !m().isEmpty() ? TextUtils.join(str, m()) : !getTextContent().getTextItems().isEmpty() ? TextUtils.join(str, getTextContent().getTextItems()) : null;
            } else {
                join = this.t;
            }
            if (join == null) {
                return false;
            }
            this.t = join;
            super.setContentDescription(this.t);
        }
        return super.performAccessibilityAction(i, bundle);
    }
}
