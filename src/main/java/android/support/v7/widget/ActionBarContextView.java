package android.support.v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.abr;
import defpackage.abs;
import defpackage.afy;
import defpackage.ahv;
import defpackage.aiw;
import defpackage.ajl;
import defpackage.ajw;
import defpackage.ajy;
import defpackage.akf;
import defpackage.aocf;
import defpackage.arz;
import defpackage.asy;

public class ActionBarContextView extends ajw {
    public CharSequence g;
    public CharSequence h;
    public View i;
    public boolean j;
    private View k;
    private LinearLayout l;
    private TextView m;
    private TextView n;
    private int o;
    private int p;
    private int q;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        arz a = arz.a(context, attributeSet, afy.x, i, 0);
        abe.a((View) this, a.a(afy.y));
        this.o = a.f(afy.C, 0);
        this.p = a.f(afy.B, 0);
        this.e = a.e(afy.A, 0);
        this.q = a.f(afy.z, R.layout.abc_action_mode_close_item_material);
        a.a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        akf akf = this.d;
        if (akf != null) {
            akf.f();
            this.d.h();
        }
    }

    public final void a(int i) {
        this.e = i;
    }

    public final void a(View view) {
        View view2 = this.k;
        if (view2 != null) {
            removeView(view2);
        }
        this.k = view;
        if (view != null) {
            LinearLayout linearLayout = this.l;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.l = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void a(CharSequence charSequence) {
        this.g = charSequence;
        c();
    }

    public final void b(CharSequence charSequence) {
        this.h = charSequence;
        c();
    }

    private final void c() {
        if (this.l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            this.l = (LinearLayout) getChildAt(getChildCount() - 1);
            this.m = (TextView) this.l.findViewById(R.id.action_bar_title);
            this.n = (TextView) this.l.findViewById(R.id.action_bar_subtitle);
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
        }
        this.m.setText(this.g);
        this.n.setText(this.h);
        int isEmpty = TextUtils.isEmpty(this.g) ^ 1;
        boolean isEmpty2 = TextUtils.isEmpty(this.h);
        int i = isEmpty2 ^ 1;
        int i2 = 0;
        this.n.setVisibility(!isEmpty2 ? 0 : 8);
        LinearLayout linearLayout = this.l;
        if (isEmpty == 0 && i == 0) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        if (this.l.getParent() == null) {
            addView(this.l);
        }
    }

    public final void a(ahv ahv) {
        View view = this.i;
        if (view == null) {
            this.i = LayoutInflater.from(getContext()).inflate(this.q, this, false);
            addView(this.i);
        } else if (view.getParent() == null) {
            addView(this.i);
        }
        this.i.findViewById(R.id.action_mode_close_button).setOnClickListener(new ajy(ahv));
        aiw aiw = (aiw) ahv.b();
        akf akf = this.d;
        if (akf != null) {
            akf.g();
        }
        this.d = new akf(getContext());
        this.d.c();
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        aiw.a(this.d, this.b);
        akf akf2 = this.d;
        ajl ajl = akf2.h;
        if (akf2.h == null) {
            akf2.h = (ajl) akf2.d.inflate(akf2.f, this, false);
            akf2.h.a(akf2.c);
            akf2.a();
        }
        ajl ajl2 = akf2.h;
        if (ajl != ajl2) {
            ((ActionMenuView) ajl2).a(akf2);
        }
        this.c = (ActionMenuView) ajl2;
        abe.a(this.c, null);
        addView(this.c, layoutParams);
    }

    public final void a() {
        removeAllViews();
        this.k = null;
        this.c = null;
    }

    public final boolean b() {
        akf akf = this.d;
        if (akf == null) {
            return false;
        }
        return akf.e();
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        StringBuilder stringBuilder;
        if (MeasureSpec.getMode(i) != 1073741824) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            int i4;
            i = MeasureSpec.getSize(i);
            int i5 = this.e;
            if (i5 <= 0) {
                i5 = MeasureSpec.getSize(i2);
            }
            i2 = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - i2;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i6, aocf.UNSET_ENUM_VALUE);
            View view = this.i;
            if (view != null) {
                paddingLeft = ajw.a(view, paddingLeft, makeMeasureSpec);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.i.getLayoutParams();
                paddingLeft -= marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            }
            ActionMenuView actionMenuView = this.c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = ajw.a((View) this.c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.l;
            int i7 = 0;
            if (linearLayout != null && this.k == null) {
                if (this.j) {
                    this.l.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    makeMeasureSpec = this.l.getMeasuredWidth();
                    i4 = makeMeasureSpec <= paddingLeft ? paddingLeft - makeMeasureSpec : paddingLeft;
                    this.l.setVisibility(makeMeasureSpec > paddingLeft ? 8 : 0);
                    paddingLeft = i4;
                } else {
                    paddingLeft = ajw.a((View) linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.k;
            if (view2 != null) {
                LayoutParams layoutParams = view2.getLayoutParams();
                i4 = layoutParams.width != -2 ? 1073741824 : aocf.UNSET_ENUM_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = aocf.UNSET_ENUM_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i6 = Math.min(layoutParams.height, i6);
                }
                this.k.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i4), MeasureSpec.makeMeasureSpec(i6, i3));
            }
            if (this.e <= 0) {
                i5 = getChildCount();
                i3 = 0;
                while (i7 < i5) {
                    paddingLeft = getChildAt(i7).getMeasuredHeight() + i2;
                    if (paddingLeft > i3) {
                        i3 = paddingLeft;
                    }
                    i7++;
                }
                setMeasuredDimension(i, i3);
                return;
            }
            setMeasuredDimension(i, i5);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = asy.a(this);
        int paddingRight = z ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        i4 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.i;
        if (!(view == null || view.getVisibility() == 8)) {
            int i5;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.i.getLayoutParams();
            if (z) {
                i5 = marginLayoutParams.rightMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
            }
            if (z) {
                i2 = marginLayoutParams.leftMargin;
            } else {
                i2 = marginLayoutParams.rightMargin;
            }
            paddingRight = ajw.a(paddingRight, i5, z);
            paddingRight = ajw.a(paddingRight + ajw.a(this.i, paddingRight, paddingTop, i4, z), i2, z);
        }
        LinearLayout linearLayout = this.l;
        if (!(linearLayout == null || this.k != null || linearLayout.getVisibility() == 8)) {
            paddingRight += ajw.a(this.l, paddingRight, paddingTop, i4, z);
        }
        view = this.k;
        if (view != null) {
            ajw.a(view, paddingRight, paddingTop, i4, z);
        }
        if (z) {
            i3 = getPaddingLeft();
        } else {
            i3 = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            ajw.a(actionMenuView, i3, paddingTop, i4, z ^ 1);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public final void a(boolean z) {
        if (z != this.j) {
            requestLayout();
        }
        this.j = z;
    }

    public final /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public final /* synthetic */ abr a(int i, long j) {
        abr abr = this.f;
        if (abr != null) {
            abr.a();
        }
        abs abs;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            abr p = abe.p(this);
            p.a(1.0f);
            p.a(j);
            abs = this.a;
            abs.a(p, 0);
            p.a(abs);
            return p;
        }
        abr p2 = abe.p(this);
        p2.a(0.0f);
        p2.a(j);
        abs = this.a;
        abs.a(p2, i);
        p2.a(abs);
        return p2;
    }

    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}
