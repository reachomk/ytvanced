package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: ajt */
final class ajt extends ajn implements SubMenu {
    private final te d;

    ajt(Context context, te teVar) {
        super(context, teVar);
        this.d = teVar;
    }

    public final SubMenu setHeaderTitle(int i) {
        this.d.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.d.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderIcon(int i) {
        this.d.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.d.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.d.setHeaderView(view);
        return this;
    }

    public final void clearHeader() {
        this.d.clearHeader();
    }

    public final SubMenu setIcon(int i) {
        this.d.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }

    public final MenuItem getItem() {
        return a(this.d.getItem());
    }
}
