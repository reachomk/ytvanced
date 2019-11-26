package defpackage;

import android.view.MenuItem;

/* renamed from: kfq */
final /* synthetic */ class kfq implements aot {
    private final kfo a;

    kfq(kfo kfo) {
        this.a = kfo;
    }

    public final boolean a(MenuItem menuItem) {
        ezu ezu = (ezu) this.a.b.get(((aja) menuItem).a);
        if (ezu == null) {
            return false;
        }
        return ezu.b(menuItem);
    }
}
