package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: aji */
abstract class aji implements ajj, ajq, OnItemClickListener {
    public Rect g;

    aji() {
    }

    public abstract void a(int i);

    public abstract void a(aiw aiw);

    public final void a(Context context, aiw aiw) {
    }

    public abstract void a(View view);

    public abstract void a(OnDismissListener onDismissListener);

    public abstract void a(boolean z);

    public final boolean a(aja aja) {
        return false;
    }

    public abstract void b(int i);

    public abstract void b(boolean z);

    public final boolean b(aja aja) {
        return false;
    }

    public abstract void c(int i);

    /* Access modifiers changed, original: protected */
    public boolean g() {
        return true;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        aji.a(listAdapter).a.a((MenuItem) listAdapter.getItem(i), (ajj) this, !g() ? 4 : 0);
    }

    protected static int a(ListAdapter listAdapter, Context context, int i) {
        int i2 = 0;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup = null;
        View view = viewGroup;
        int i3 = 0;
        int i4 = 0;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            int i5 = itemViewType == i4 ? i4 : itemViewType;
            if (itemViewType != i4) {
                view = null;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i4 = view.getMeasuredWidth();
            if (i4 >= i) {
                return i;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
            i4 = i5;
        }
        return i3;
    }

    protected static ait a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (ait) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (ait) listAdapter;
    }

    protected static boolean b(aiw aiw) {
        int size = aiw.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = aiw.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
