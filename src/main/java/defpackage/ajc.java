package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: ajc */
public final class ajc extends aim implements MenuItem {
    public final tf d;
    public Method e;

    public ajc(Context context, tf tfVar) {
        super(context);
        if (tfVar != null) {
            this.d = tfVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final int getItemId() {
        return this.d.getItemId();
    }

    public final int getGroupId() {
        return this.d.getGroupId();
    }

    public final int getOrder() {
        return this.d.getOrder();
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.d.setTitle(i);
        return this;
    }

    public final CharSequence getTitle() {
        return this.d.getTitle();
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.d.setTitleCondensed(charSequence);
        return this;
    }

    public final CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.d.setIcon(i);
        return this;
    }

    public final Drawable getIcon() {
        return this.d.getIcon();
    }

    public final MenuItem setIntent(Intent intent) {
        this.d.setIntent(intent);
        return this;
    }

    public final Intent getIntent() {
        return this.d.getIntent();
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.d.setShortcut(c, c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.d.setShortcut(c, c2, i, i2);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.d.setNumericShortcut(c);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.d.setNumericShortcut(c, i);
        return this;
    }

    public final char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    public final int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.d.setAlphabeticShortcut(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.d.setAlphabeticShortcut(c, i);
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    public final int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    public final MenuItem setCheckable(boolean z) {
        this.d.setCheckable(z);
        return this;
    }

    public final boolean isCheckable() {
        return this.d.isCheckable();
    }

    public final MenuItem setChecked(boolean z) {
        this.d.setChecked(z);
        return this;
    }

    public final boolean isChecked() {
        return this.d.isChecked();
    }

    public final MenuItem setVisible(boolean z) {
        return this.d.setVisible(z);
    }

    public final boolean isVisible() {
        return this.d.isVisible();
    }

    public final MenuItem setEnabled(boolean z) {
        this.d.setEnabled(z);
        return this;
    }

    public final boolean isEnabled() {
        return this.d.isEnabled();
    }

    public final boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    public final SubMenu getSubMenu() {
        return a(this.d.getSubMenu());
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new ajf(this, onMenuItemClickListener) : null);
        return this;
    }

    public final ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    public final void setShowAsAction(int i) {
        this.d.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.d.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new ajd(view);
        }
        this.d.setActionView(view);
        return this;
    }

    public final MenuItem setActionView(int i) {
        this.d.setActionView(i);
        View actionView = this.d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.d.setActionView(new ajd(actionView));
        }
        return this;
    }

    public final View getActionView() {
        View actionView = this.d.getActionView();
        return actionView instanceof ajd ? (View) ((ajd) actionView).a : actionView;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        aal aje = new aje(this, this.a, actionProvider);
        tf tfVar = this.d;
        if (actionProvider == null) {
            aje = null;
        }
        tfVar.a(aje);
        return this;
    }

    public final ActionProvider getActionProvider() {
        aal a = this.d.a();
        return a instanceof ajb ? ((ajb) a).b : null;
    }

    public final boolean expandActionView() {
        return this.d.expandActionView();
    }

    public final boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    public final boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.d.setOnActionExpandListener(onActionExpandListener != null ? new ajg(this, onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.d.a(charSequence);
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.d.b(charSequence);
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.d.setIconTintMode(mode);
        return this;
    }

    public final Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }
}
