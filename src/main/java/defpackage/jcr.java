package defpackage;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jcr */
public final class jcr extends DataSetObserver {
    private final ViewGroup a;
    private final List b = new ArrayList();
    private ListAdapter c;

    public jcr(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.c;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this);
        }
        this.c = listAdapter;
        listAdapter.registerDataSetObserver(this);
        a();
    }

    public final void onChanged() {
        a();
    }

    private final void a() {
        this.a.removeAllViews();
        for (int i = 0; i < this.c.getCount(); i++) {
            View view;
            if (i < this.b.size()) {
                view = this.c.getView(i, (View) this.b.get(i), this.a);
            } else {
                view = this.c.getView(i, null, this.a);
                this.b.add(view);
            }
            this.a.addView(view);
        }
    }
}
