package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: akoc */
public final class akoc extends BaseAdapter implements akng, akos {
    private final akpb a;
    private final Map b = new WeakHashMap();
    private final akmy c = new akmy();
    private final HashSet d;
    private aknh e;

    akoc(akpi akpi, akpb akpb) {
        this.a = (akpb) amqw.a((Object) akpb);
        this.e = aknt.a;
        this.d = new HashSet();
        a(new akof(akpi));
    }

    public final void a(akov akov) {
        this.d.add(akov);
    }

    public final void b(akov akov) {
        this.d.remove(akov);
    }

    public final void a(akoq akoq) {
        this.c.a(akoq);
    }

    public final void a(aknh aknh) {
        amqw.a((Object) aknh);
        this.e.a((akng) this);
        this.e = aknh;
        this.e.b(this);
        notifyDataSetChanged();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object view2;
        akot a;
        View K_;
        Object item = getItem(i);
        if (a(i)) {
            view2 = (View) this.b.get(item);
        }
        if (view2 != null) {
            a = akoz.a(view2);
        } else {
            int a2 = this.a.a(item);
            if (a2 != -1) {
                a = this.a.a(a2, viewGroup);
            } else {
                a = new akns(viewGroup.getContext());
            }
            K_ = a.K_();
            akoz.a(K_, a, a2);
            LayoutParams layoutParams = K_.getLayoutParams();
            if (!(layoutParams == null || (layoutParams instanceof AbsListView.LayoutParams))) {
                K_.setLayoutParams(new AbsListView.LayoutParams(layoutParams.width, layoutParams.height));
            }
            view2 = a.K_();
        }
        K_ = a.K_();
        akor c = K_ != null ? akoz.c(K_) : null;
        if (c == null) {
            c = new akor();
            akoz.a(K_, c);
        }
        c.a();
        c.a("position", Integer.valueOf(i));
        this.c.a(c, this.e, i);
        this.e.a(c, i);
        a.a_(c, item);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((akov) it.next()).a(a, item);
        }
        if (a(i)) {
            this.b.put(item, view2);
        }
        return view2;
    }

    private final boolean a(int i) {
        return getItemViewType(i) == -1;
    }

    public final int getItemViewType(int i) {
        i = this.a.a(getItem(i));
        return i != -1 ? i + 1 : 0;
    }

    public final int getViewTypeCount() {
        return this.a.a() + 1;
    }

    public final int getCount() {
        return this.e.d();
    }

    public final Object getItem(int i) {
        return this.e.c(i);
    }

    public final long getItemId(int i) {
        return this.e.a(i);
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.b.clear();
    }

    public final void bF_() {
        notifyDataSetChanged();
    }

    public final void d_(int i, int i2) {
        notifyDataSetChanged();
    }

    public final void e_(int i, int i2) {
        notifyDataSetChanged();
    }

    public final void f_(int i, int i2) {
        notifyDataSetChanged();
    }

    public final void g_(int i, int i2) {
        notifyDataSetChanged();
    }
}
