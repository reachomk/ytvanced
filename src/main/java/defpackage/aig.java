package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

/* renamed from: aig */
public final class aig implements tf {
    private final int a;
    private CharSequence b;
    private CharSequence c;
    private Intent d;
    private char e;
    private int f = 4096;
    private char g;
    private int h = 4096;
    private Drawable i;
    private final Context j;
    private CharSequence k;
    private CharSequence l;
    private ColorStateList m = null;
    private Mode n = null;
    private boolean o = false;
    private boolean p = false;
    private int q = 16;

    public aig(Context context, CharSequence charSequence) {
        this.j = context;
        this.a = 16908332;
        this.b = charSequence;
    }

    public final aal a() {
        return null;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final View getActionView() {
        return null;
    }

    public final int getGroupId() {
        return 0;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.g;
    }

    public final int getAlphabeticModifiers() {
        return this.h;
    }

    public final Drawable getIcon() {
        return this.i;
    }

    public final Intent getIntent() {
        return this.d;
    }

    public final int getItemId() {
        return this.a;
    }

    public final char getNumericShortcut() {
        return this.e;
    }

    public final int getNumericModifiers() {
        return this.f;
    }

    public final CharSequence getTitle() {
        return this.b;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.c;
        return charSequence == null ? this.b : charSequence;
    }

    public final boolean isCheckable() {
        return (this.q & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.q & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.q & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.q & 8) == 0;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.g = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.g = Character.toLowerCase(c);
        this.h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.q = z | (this.q & -2);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.q = (!z ? 0 : 2) | (this.q & -3);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.q = (!z ? 0 : 16) | (this.q & -17);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.i = drawable;
        b();
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.i = ra.a(this.j, i);
        b();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.d = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.e = c;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.e = c;
        this.f = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.e = c;
        this.g = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.e = c;
        this.f = KeyEvent.normalizeMetaState(i);
        this.g = Character.toLowerCase(c2);
        this.h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.b = this.j.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.c = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.q & 8;
        if (z) {
            i = 0;
        }
        this.q = i2 | i;
        return this;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final tf a(aal aal) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final tf a(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.k;
    }

    public final tf b(CharSequence charSequence) {
        this.l = charSequence;
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.l;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.m = colorStateList;
        this.o = true;
        b();
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.m;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.n = mode;
        this.p = true;
        b();
        return this;
    }

    public final Mode getIconTintMode() {
        return this.n;
    }

    private final void b() {
        Drawable drawable = this.i;
        if (drawable == null) {
            return;
        }
        if (this.o || this.p) {
            this.i = st.d(drawable);
            this.i = this.i.mutate();
            if (this.o) {
                st.a(this.i, this.m);
            }
            if (this.p) {
                st.a(this.i, this.n);
            }
        }
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.l = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }
}
