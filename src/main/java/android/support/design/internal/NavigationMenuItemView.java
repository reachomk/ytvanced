package android.support.design.internal;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.aaj;
import defpackage.abe;
import defpackage.aja;
import defpackage.ajo;
import defpackage.anp;
import defpackage.ask;
import defpackage.gw;
import defpackage.gx;

public class NavigationMenuItemView extends gw implements ajo {
    private static final int[] b = new int[]{16842912};
    public boolean a;
    private int c;
    private final CheckedTextView d;
    private FrameLayout e;
    private aja f;
    private final aaj g;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public final boolean b() {
        return false;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new gx(this);
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        this.d = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.d.setDuplicateParentStateEnabled(true);
        abe.a(this.d, this.g);
    }

    public final void a(aja aja) {
        this.f = aja;
        setVisibility(!aja.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            Drawable stateListDrawable;
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(b, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            abe.a((View) this, stateListDrawable);
        }
        boolean isCheckable = aja.isCheckable();
        refreshDrawableState();
        if (this.a != isCheckable) {
            this.a = isCheckable;
            this.g.a(this.d, 2048);
        }
        isCheckable = aja.isChecked();
        refreshDrawableState();
        this.d.setChecked(isCheckable);
        setEnabled(aja.isEnabled());
        this.d.setText(aja.d);
        Drawable icon = aja.getIcon();
        if (icon != null) {
            int i = this.c;
            icon.setBounds(0, 0, i, i);
        }
        this.d.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = aja.getActionView();
        if (actionView != null) {
            if (this.e == null) {
                this.e = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.e.removeAllViews();
            this.e.addView(actionView);
        }
        setContentDescription(aja.k);
        ask.a(this, aja.l);
        aja = this.f;
        FrameLayout frameLayout;
        anp anp;
        if (aja.d == null && aja.getIcon() == null && this.f.getActionView() != null) {
            this.d.setVisibility(8);
            frameLayout = this.e;
            if (frameLayout != null) {
                anp = (anp) frameLayout.getLayoutParams();
                anp.width = -1;
                this.e.setLayoutParams(anp);
                return;
            }
        }
        this.d.setVisibility(0);
        frameLayout = this.e;
        if (frameLayout != null) {
            anp = (anp) frameLayout.getLayoutParams();
            anp.width = -2;
            this.e.setLayoutParams(anp);
        }
    }

    public final aja a() {
        return this.f;
    }

    /* Access modifiers changed, original: protected|final */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        aja aja = this.f;
        if (aja != null && aja.isCheckable() && this.f.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        return onCreateDrawableState;
    }
}
