package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: aju */
public final class aju extends aiw implements SubMenu {
    public final aiw k;
    public final aja l;

    public aju(Context context, aiw aiw, aja aja) {
        super(context);
        this.k = aiw;
        this.l = aja;
    }

    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    public final boolean d() {
        return this.k.d();
    }

    public final boolean e() {
        return this.k.e();
    }

    public final MenuItem getItem() {
        return this.l;
    }

    public final void a(aiv aiv) {
        this.k.a(aiv);
    }

    public final aiw m() {
        return this.k.m();
    }

    /* Access modifiers changed, original: final */
    public final boolean a(aiw aiw, MenuItem menuItem) {
        return super.a(aiw, menuItem) || this.k.a(aiw, menuItem);
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    public final SubMenu setHeaderIcon(int i) {
        a(0, null, i, null, null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        a(i, null, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    public final boolean a(aja aja) {
        return this.k.a(aja);
    }

    public final boolean b(aja aja) {
        return this.k.b(aja);
    }

    public final String b() {
        aja aja = this.l;
        int i = aja != null ? aja.a : 0;
        if (i == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("android:menu:actionviewstates:");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    public final boolean c() {
        return this.k.c();
    }
}
