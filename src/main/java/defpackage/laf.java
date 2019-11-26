package defpackage;

import android.view.MenuItem;

/* renamed from: laf */
final class laf extends fai {
    private final apxu a;
    private final CharSequence b;
    private final /* synthetic */ kzs c;

    laf(kzs kzs, apxu apxu, CharSequence charSequence) {
        this.c = kzs;
        this.a = apxu;
        this.b = charSequence;
    }

    public final int a() {
        return 0;
    }

    public final boolean b() {
        return true;
    }

    public final int c() {
        return 0;
    }

    public final ezx d() {
        return null;
    }

    public final CharSequence e() {
        return null;
    }

    public final int f() {
        return 0;
    }

    public final void a(MenuItem menuItem) {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            menuItem.setTitle(charSequence);
        }
    }

    public final boolean b(MenuItem menuItem) {
        this.c.e.a(this.a, null);
        return true;
    }
}
