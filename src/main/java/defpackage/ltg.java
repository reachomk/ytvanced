package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: ltg */
public final class ltg extends fmc {
    private final aknh a;
    private final int b;

    public ltg(aknh aknh, int i) {
        this.a = aknh;
        this.b = i;
    }

    public final int a(int i) {
        Object c = this.a.c(i);
        if (c instanceof awzo) {
            return this.b;
        }
        return c instanceof ajsw ? 1 : 0;
    }

    public final long b(int i) {
        Object c = this.a.c(i);
        return c != null ? (long) c.hashCode() : Long.MAX_VALUE;
    }

    public final void a(View view, View view2) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.related_chip_cloud);
        if (recyclerView != null) {
            RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(R.id.related_chip_cloud);
            if (recyclerView2 != null) {
                recyclerView2.n.a(recyclerView.n.j());
                int a = recyclerView.m.a();
                if (a == recyclerView2.m.a()) {
                    for (int i = 0; i < a; i++) {
                        View childAt = recyclerView.getChildAt(i);
                        View childAt2 = recyclerView2.getChildAt(i);
                        if ((childAt instanceof fej) && (childAt2 instanceof fej)) {
                            ((fej) childAt2).b(((fej) childAt).m);
                        }
                    }
                }
            }
        }
    }
}
