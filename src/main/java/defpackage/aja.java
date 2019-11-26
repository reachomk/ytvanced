package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;

/* renamed from: aja */
public final class aja implements tf {
    private int A = 16;
    private View B;
    private OnActionExpandListener C;
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public char e;
    public int f = 4096;
    public char g;
    public int h = 4096;
    public final aiw i;
    public aju j;
    public CharSequence k;
    public CharSequence l;
    public int m = 0;
    public aal n;
    public boolean o = false;
    private final int p;
    private CharSequence q;
    private Intent r;
    private Drawable s;
    private int t = 0;
    private OnMenuItemClickListener u;
    private ColorStateList v = null;
    private Mode w = null;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;

    aja(aiw aiw, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.i = aiw;
        this.a = i2;
        this.b = i;
        this.p = i3;
        this.c = i4;
        this.d = charSequence;
        this.m = i5;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final boolean b() {
        OnMenuItemClickListener onMenuItemClickListener = this.u;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        aiw aiw = this.i;
        if (aiw.a(aiw, (MenuItem) this)) {
            return true;
        }
        Intent intent = this.r;
        if (intent != null) {
            try {
                this.i.a.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        aal aal = this.n;
        if (aal == null || !aal.d()) {
            return false;
        }
        return true;
    }

    public final boolean isEnabled() {
        return (this.A & 16) != 0;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.A |= 16;
        } else {
            this.A &= -17;
        }
        this.i.b(false);
        return this;
    }

    public final int getGroupId() {
        return this.b;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }

    public final int getOrder() {
        return this.p;
    }

    public final Intent getIntent() {
        return this.r;
    }

    public final MenuItem setIntent(Intent intent) {
        this.r = intent;
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.g;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.g != c) {
            this.g = Character.toLowerCase(c);
            this.i.b(false);
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.g == c && this.h == i) {
            return this;
        }
        this.g = Character.toLowerCase(c);
        this.h = KeyEvent.normalizeMetaState(i);
        this.i.b(false);
        return this;
    }

    public final int getAlphabeticModifiers() {
        return this.h;
    }

    public final char getNumericShortcut() {
        return this.e;
    }

    public final int getNumericModifiers() {
        return this.f;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.e != c) {
            this.e = c;
            this.i.b(false);
        }
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.e == c && this.f == i) {
            return this;
        }
        this.e = c;
        this.f = KeyEvent.normalizeMetaState(i);
        this.i.b(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.e = c;
        this.g = Character.toLowerCase(c2);
        this.i.b(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.e = c;
        this.f = KeyEvent.normalizeMetaState(i);
        this.g = Character.toLowerCase(c2);
        this.h = KeyEvent.normalizeMetaState(i2);
        this.i.b(false);
        return this;
    }

    public final char c() {
        return !this.i.d() ? this.e : this.g;
    }

    public static void a(StringBuilder stringBuilder, int i, int i2, String str) {
        if ((i & i2) == i2) {
            stringBuilder.append(str);
        }
    }

    public final boolean d() {
        return this.i.e() && c() != 0;
    }

    public final SubMenu getSubMenu() {
        return this.j;
    }

    public final boolean hasSubMenu() {
        return this.j != null;
    }

    public final void a(aju aju) {
        this.j = aju;
        aju.setHeaderTitle(this.d);
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.d;
    }

    public final CharSequence a(ajo ajo) {
        if (ajo != null && ajo.b()) {
            return getTitleCondensed();
        }
        return this.d;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        this.i.b(false);
        aju aju = this.j;
        if (aju != null) {
            aju.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitle(int i) {
        setTitle(this.i.a.getString(i));
        return this;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.q;
        return charSequence == null ? this.d : charSequence;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.q = charSequence;
        this.i.b(false);
        return this;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return a(drawable);
        }
        int i = this.t;
        if (i == 0) {
            return null;
        }
        drawable = agb.b(this.i.a, i);
        this.t = 0;
        this.s = drawable;
        return a(drawable);
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.t = 0;
        this.s = drawable;
        this.z = true;
        this.i.b(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.s = null;
        this.t = i;
        this.z = true;
        this.i.b(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.v = colorStateList;
        this.x = true;
        this.z = true;
        this.i.b(false);
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.v;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.w = mode;
        this.y = true;
        this.z = true;
        this.i.b(false);
        return this;
    }

    public final Mode getIconTintMode() {
        return this.w;
    }

    private final Drawable a(Drawable drawable) {
        if (drawable != null && this.z && (this.x || this.y)) {
            drawable = st.d(drawable).mutate();
            if (this.x) {
                st.a(drawable, this.v);
            }
            if (this.y) {
                st.a(drawable, this.w);
            }
            this.z = false;
        }
        return drawable;
    }

    public final boolean isCheckable() {
        return (this.A & 1) != 0;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.A;
        int i2 = z | (i & -2);
        this.A = i2;
        if (i != i2) {
            this.i.b(false);
        }
        return this;
    }

    public final void a(boolean z) {
        this.A = (!z ? 0 : 4) | (this.A & -5);
    }

    public final boolean e() {
        return (this.A & 4) != 0;
    }

    public final boolean isChecked() {
        return (this.A & 2) == 2;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.A & 4) != 0) {
            aiw aiw = this.i;
            int i = this.b;
            int size = aiw.c.size();
            aiw.f();
            for (int i2 = 0; i2 < size; i2++) {
                aja aja = (aja) aiw.c.get(i2);
                if (aja.b == i && aja.e() && aja.isCheckable()) {
                    aja.e(aja == this);
                }
            }
            aiw.g();
        } else {
            e(z);
        }
        return this;
    }

    private final void e(boolean z) {
        int i = this.A;
        int i2 = (!z ? 0 : 2) | (i & -3);
        this.A = i2;
        if (i != i2) {
            this.i.b(false);
        }
    }

    public final boolean isVisible() {
        aal aal = this.n;
        return (aal == null || !aal.b()) ? (this.A & 8) == 0 : (this.A & 8) == 0 && this.n.c();
    }

    /* Access modifiers changed, original: final */
    public final boolean b(boolean z) {
        int i = this.A;
        int i2 = (!z ? 8 : 0) | (i & -9);
        this.A = i2;
        if (i != i2) {
            return true;
        }
        return false;
    }

    public final MenuItem setVisible(boolean z) {
        if (b(z)) {
            this.i.h();
        }
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.u = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.d;
        return charSequence != null ? charSequence.toString() : null;
    }

    public final boolean f() {
        return (this.A & 32) == 32;
    }

    public final boolean g() {
        return (this.m & 1) != 0;
    }

    public final boolean h() {
        return (this.m & 2) == 2;
    }

    public final void c(boolean z) {
        if (z) {
            this.A |= 32;
        } else {
            this.A &= -33;
        }
    }

    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.m = i;
            this.i.i();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    private final tf a(View view) {
        this.B = view;
        this.n = null;
        if (view != null && view.getId() == -1) {
            int i = this.a;
            if (i > 0) {
                view.setId(i);
            }
        }
        this.i.i();
        return this;
    }

    public final View getActionView() {
        View view = this.B;
        if (view == null) {
            aal aal = this.n;
            if (aal != null) {
                this.B = aal.a((MenuItem) this);
                return this.B;
            }
            view = null;
        }
        return view;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final aal a() {
        return this.n;
    }

    public final tf a(aal aal) {
        aal aal2 = this.n;
        if (aal2 != null) {
            aal2.a = null;
        }
        this.B = null;
        this.n = aal;
        this.i.b(true);
        aal = this.n;
        if (aal != null) {
            aal.a(new aiz(this));
        }
        return this;
    }

    public final boolean expandActionView() {
        if (!i()) {
            return false;
        }
        OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.i.a(this);
        }
        return false;
    }

    public final boolean collapseActionView() {
        if ((this.m & 8) == 0) {
            return false;
        }
        if (this.B == null) {
            return true;
        }
        OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.i.b(this);
        }
        return false;
    }

    public final boolean i() {
        if ((this.m & 8) != 0) {
            if (this.B == null) {
                aal aal = this.n;
                if (aal != null) {
                    this.B = aal.a((MenuItem) this);
                }
            }
            if (this.B != null) {
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z) {
        this.o = z;
        this.i.b(false);
    }

    public final boolean isActionViewExpanded() {
        return this.o;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public final tf a(CharSequence charSequence) {
        this.k = charSequence;
        this.i.b(false);
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.k;
    }

    public final tf b(CharSequence charSequence) {
        this.l = charSequence;
        this.i.b(false);
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.l;
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        b(charSequence);
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        a(charSequence);
        return this;
    }
}
