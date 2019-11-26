package defpackage;

import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.youtube.R;
import java.util.Collection;

/* renamed from: ezv */
public final class ezv {
    private final aej a;
    private final SparseArray b = new SparseArray();
    private int c;
    private boolean d;

    public ezv(aej aej, acwa acwa) {
        this.a = (aej) amqw.a((Object) aej);
        amqw.a((Object) acwa);
    }

    public final synchronized void a(ezu ezu) {
        amqw.a((Object) ezu);
        int a = ezu.a();
        if (this.b.get(a) != ezu) {
            this.b.put(a, ezu);
            this.a.w_();
        }
    }

    public final synchronized void a(Collection collection) {
        this.b.clear();
        for (ezu ezu : collection) {
            this.b.put(ezu.a(), ezu);
        }
        this.a.w_();
    }

    public final synchronized boolean a(Menu menu, MenuInflater menuInflater, xoe xoe) {
        if (!this.d) {
            Object h = this.a.g().h();
            amqw.a(h);
            a(xwe.a(h, R.attr.colorButtonNormal, 0));
        }
        return ezw.a(menu, menuInflater, xoe, this.b, this.c);
    }

    public final synchronized boolean a(MenuItem menuItem) {
        ezu ezu = (ezu) this.b.get(menuItem.getItemId());
        if (ezu == null) {
            return false;
        }
        if (menuItem instanceof fof) {
            ((fof) menuItem).e();
        }
        return ezu.b(menuItem);
    }

    public final void a(int i) {
        boolean z = this.d;
        if (!z || this.c != i) {
            this.c = i;
            if (z) {
                this.a.w_();
            }
            this.d = true;
        }
    }
}
