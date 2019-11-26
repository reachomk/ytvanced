package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.design.tabs.TabLayout;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kc */
public final class kc extends LinearLayout {
    public TextView a;
    public ImageView b;
    public View c;
    public final Drawable d;
    private ka e;
    private TextView f;
    private ImageView g;
    private int h = 2;
    private final /* synthetic */ TabLayout i;

    public kc(TabLayout tabLayout, Context context) {
        Drawable drawable;
        abc abc;
        this.i = tabLayout;
        super(context);
        int i = this.i.n;
        if (i != 0) {
            this.d = agb.b(context, i);
            drawable = this.d;
            if (drawable != null && drawable.isStateful()) {
                this.d.setState(getDrawableState());
            }
        } else {
            this.d = null;
        }
        drawable = new GradientDrawable();
        drawable.setColor(0);
        if (this.i.i != null) {
            Drawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(1.0E-5f);
            gradientDrawable.setColor(-1);
            ColorStateList a = ho.a(this.i.i);
            if (VERSION.SDK_INT >= 21) {
                boolean z = this.i.u;
                if (z) {
                    drawable = null;
                }
                if (z) {
                    gradientDrawable = null;
                }
                drawable = new RippleDrawable(a, drawable, gradientDrawable);
            } else {
                st.a(st.d(gradientDrawable), a);
                drawable = new LayerDrawable(new Drawable[]{drawable, gradientDrawable});
            }
        }
        abe.a((View) this, drawable);
        this.i.invalidate();
        abe.a(this, tabLayout.b, tabLayout.c, tabLayout.d, tabLayout.e);
        setGravity(17);
        setOrientation(tabLayout.s ^ 1);
        setClickable(true);
        Context context2 = getContext();
        if (VERSION.SDK_INT >= 24) {
            abc = new abc(PointerIcon.getSystemIcon(context2, 1002));
        } else {
            abc = new abc(null);
        }
        abe.a((View) this, abc);
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        if (drawable != null && drawable.isStateful() && this.d.setState(drawableState)) {
            invalidate();
            this.i.invalidate();
        }
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.e == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.e.a();
        return true;
    }

    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.c;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(adw.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(adw.class.getName());
    }

    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int i3 = this.i.o;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = MeasureSpec.makeMeasureSpec(i3, aocf.UNSET_ENUM_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = this.i.l;
            mode = this.h;
            ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.i.m;
                }
            } else {
                mode = 1;
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f != textSize || (maxLines >= 0 && mode != maxLines)) {
                if (this.i.r == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.a.getLayout();
                    if (layout == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                        return;
                    }
                }
                this.a.setTextSize(0, f);
                this.a.setMaxLines(mode);
                super.onMeasure(i, i2);
            }
        }
    }

    public final void a(ka kaVar) {
        if (kaVar != this.e) {
            this.e = kaVar;
            a();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        ka kaVar = this.e;
        View view = this.c;
        Drawable drawable = null;
        if (view != null) {
            removeView(view);
            this.c = null;
        }
        this.f = null;
        this.g = null;
        boolean z = false;
        TextView textView;
        if (this.c == null) {
            if (this.b == null) {
                ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, this, false);
                addView(imageView, 0);
                this.b = imageView;
            }
            if (kaVar != null) {
                Drawable drawable2 = kaVar.b;
                if (drawable2 != null) {
                    drawable = st.d(drawable2).mutate();
                }
            }
            if (drawable != null) {
                st.a(drawable, this.i.h);
                Mode mode = this.i.k;
                if (mode != null) {
                    st.a(drawable, mode);
                }
            }
            if (this.a == null) {
                textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, this, false);
                addView(textView);
                this.a = textView;
                this.h = this.a.getMaxLines();
            }
            adl.a(this.a, this.i.f);
            ColorStateList colorStateList = this.i.g;
            if (colorStateList != null) {
                this.a.setTextColor(colorStateList);
            }
            a(this.a, this.b);
        } else {
            textView = this.f;
            if (!(textView == null && this.g == null)) {
                a(textView, this.g);
            }
        }
        if (!(kaVar == null || TextUtils.isEmpty(kaVar.d))) {
            setContentDescription(kaVar.d);
        }
        if (kaVar != null) {
            TabLayout tabLayout = kaVar.h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (tabLayout.c() == kaVar.e) {
                z = true;
            }
        }
        setSelected(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a4  */
    private final void a(android.widget.TextView r8, android.widget.ImageView r9) {
        /*
        r7 = this;
        r0 = r7.e;
        r1 = 0;
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        r0 = r1;
        goto L_0x0013;
    L_0x0007:
        r0 = r0.b;
        if (r0 == 0) goto L_0x0005;
    L_0x000b:
        r0 = defpackage.st.d(r0);
        r0 = r0.mutate();
    L_0x0013:
        r2 = r7.e;
        if (r2 == 0) goto L_0x001a;
    L_0x0017:
        r2 = r2.c;
        goto L_0x001b;
    L_0x001a:
        r2 = r1;
    L_0x001b:
        r3 = 8;
        r4 = 0;
        if (r9 != 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0033;
    L_0x0021:
        if (r0 != 0) goto L_0x002a;
    L_0x0023:
        r9.setVisibility(r3);
        r9.setImageDrawable(r1);
        goto L_0x0033;
    L_0x002a:
        r9.setImageDrawable(r0);
        r9.setVisibility(r4);
        r7.setVisibility(r4);
    L_0x0033:
        r0 = android.text.TextUtils.isEmpty(r2);
        r5 = r0 ^ 1;
        if (r8 == 0) goto L_0x0058;
    L_0x003b:
        if (r5 == 0) goto L_0x0052;
    L_0x003d:
        r8.setText(r2);
        r2 = r7.e;
        r2 = r2.g;
        r6 = 1;
        if (r2 != r6) goto L_0x004b;
    L_0x0047:
        r8.setVisibility(r4);
        goto L_0x004e;
    L_0x004b:
        r8.setVisibility(r3);
    L_0x004e:
        r7.setVisibility(r4);
        goto L_0x0058;
    L_0x0052:
        r8.setVisibility(r3);
        r8.setText(r1);
    L_0x0058:
        if (r9 == 0) goto L_0x009a;
    L_0x005a:
        r8 = r9.getLayoutParams();
        r8 = (android.view.ViewGroup.MarginLayoutParams) r8;
        if (r5 == 0) goto L_0x0072;
    L_0x0062:
        r2 = r9.getVisibility();
        if (r2 != 0) goto L_0x0072;
    L_0x0068:
        r2 = r7.getContext();
        r2 = defpackage.hc.a(r2, r3);
        r2 = (int) r2;
        goto L_0x0073;
    L_0x0072:
        r2 = 0;
    L_0x0073:
        r3 = r7.i;
        r3 = r3.s;
        if (r3 != 0) goto L_0x0089;
    L_0x0079:
        r3 = r8.bottomMargin;
        if (r2 == r3) goto L_0x009a;
    L_0x007d:
        r8.bottomMargin = r2;
        r8.setMarginEnd(r4);
        r9.setLayoutParams(r8);
        r9.requestLayout();
        goto L_0x009a;
    L_0x0089:
        r3 = r8.getMarginEnd();
        if (r2 == r3) goto L_0x009a;
    L_0x008f:
        r8.setMarginEnd(r2);
        r8.bottomMargin = r4;
        r9.setLayoutParams(r8);
        r9.requestLayout();
    L_0x009a:
        r8 = r7.e;
        if (r8 == 0) goto L_0x00a1;
    L_0x009e:
        r8 = r8.d;
        goto L_0x00a2;
    L_0x00a1:
        r8 = r1;
    L_0x00a2:
        if (r0 != 0) goto L_0x00a5;
    L_0x00a4:
        r8 = r1;
    L_0x00a5:
        defpackage.ask.a(r7, r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc.a(android.widget.TextView, android.widget.ImageView):void");
    }
}
