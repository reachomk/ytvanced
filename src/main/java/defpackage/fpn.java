package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: fpn */
final class fpn implements Iterator {
    private int a = (this.b.getChildCount() - 1);
    private final /* synthetic */ ViewGroup b;

    fpn(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final boolean hasNext() {
        return this.a >= 0;
    }

    public final /* synthetic */ Object next() {
        View childAt = this.b.getChildAt(this.a);
        this.a--;
        return childAt;
    }
}
