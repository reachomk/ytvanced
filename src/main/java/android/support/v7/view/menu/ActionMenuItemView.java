package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import defpackage.afy;
import defpackage.aii;
import defpackage.aik;
import defpackage.aiy;
import defpackage.aja;
import defpackage.ajo;
import defpackage.akm;
import defpackage.and;
import defpackage.aocf;
import defpackage.ask;

public class ActionMenuItemView extends AppCompatTextView implements ajo, akm, OnClickListener {
    public aja a;
    public aiy b;
    public aik c;
    private CharSequence d;
    private Drawable e;
    private and f;
    private boolean g;
    private int h;
    private int i;
    private int j;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public final boolean b() {
        return true;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.g = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afy.v, i, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(afy.w, 0);
        obtainStyledAttributes.recycle();
        this.j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.i = -1;
        setSaveEnabled(false);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = f();
        g();
    }

    private final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return i >= 480 || configuration.orientation == 2;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.i = i;
        super.setPadding(i, i2, i3, i4);
    }

    public final aja a() {
        return this.a;
    }

    public final void a(aja aja) {
        this.a = aja;
        Drawable icon = aja.getIcon();
        this.e = icon;
        int i = 0;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.j;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            icon.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(icon, null, null, null);
        g();
        this.d = aja.a((ajo) this);
        g();
        setId(aja.a);
        if (!aja.isVisible()) {
            i = 8;
        }
        setVisibility(i);
        setEnabled(aja.isEnabled());
        if (aja.hasSubMenu() && this.f == null) {
            this.f = new aii(this);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a.hasSubMenu()) {
            and and = this.f;
            if (and != null && and.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void onClick(View view) {
        aiy aiy = this.b;
        if (aiy != null) {
            aiy.a(this.a);
        }
    }

    private final void g() {
        int i = 1;
        int isEmpty = TextUtils.isEmpty(this.d) ^ 1;
        if (!(this.e == null || ((this.a.m & 4) == 4 && this.g))) {
            i = 0;
        }
        isEmpty &= i;
        CharSequence charSequence = null;
        setText(isEmpty != 0 ? this.d : null);
        CharSequence charSequence2 = this.a.k;
        if (TextUtils.isEmpty(charSequence2)) {
            setContentDescription(isEmpty == 0 ? this.a.d : null);
        } else {
            setContentDescription(charSequence2);
        }
        charSequence2 = this.a.l;
        if (TextUtils.isEmpty(charSequence2)) {
            if (isEmpty == 0) {
                charSequence = this.a.d;
            }
            ask.a(this, charSequence);
            return;
        }
        ask.a(this, charSequence2);
    }

    public final boolean c() {
        return TextUtils.isEmpty(getText()) ^ 1;
    }

    public final boolean d() {
        return c() && this.a.getIcon() == null;
    }

    public final boolean e() {
        return c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean c = c();
        if (c) {
            i3 = this.i;
            if (i3 >= 0) {
                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
        i3 = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (i3 == aocf.UNSET_ENUM_VALUE) {
            i = Math.min(i, this.h);
        } else {
            i = this.h;
        }
        if (i3 != 1073741824 && this.h > 0 && measuredWidth < i) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), i2);
        }
        if (!c && this.e != null) {
            super.setPadding((getMeasuredWidth() - this.e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
