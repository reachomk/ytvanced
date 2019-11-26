package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: fpo */
final /* synthetic */ class fpo implements Iterable {
    private final ViewGroup a;

    fpo(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final Iterator iterator() {
        return new fpn(this.a);
    }
}
