package defpackage;

import android.graphics.drawable.Drawable;
import android.support.design.tabs.TabLayout;
import android.view.View;

/* renamed from: ka */
public final class ka {
    public Object a;
    public Drawable b;
    public CharSequence c;
    public CharSequence d;
    public int e = -1;
    public View f;
    public final int g = 1;
    public TabLayout h;
    public kc i;

    public final ka a(Drawable drawable) {
        this.b = drawable;
        TabLayout tabLayout = this.h;
        if (tabLayout.p == 1 || tabLayout.r == 2) {
            tabLayout.a(true);
        }
        b();
        return this;
    }

    public final void a() {
        TabLayout tabLayout = this.h;
        if (tabLayout != null) {
            tabLayout.b(this);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final ka a(CharSequence charSequence) {
        this.d = charSequence;
        b();
        return this;
    }

    public final void b() {
        kc kcVar = this.i;
        if (kcVar != null) {
            kcVar.a();
        }
    }
}
