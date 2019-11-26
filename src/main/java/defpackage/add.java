package defpackage;

import android.widget.ListView;

/* renamed from: add */
public final class add extends acq {
    private final ListView f;

    public add(ListView listView) {
        super(listView);
        this.f = listView;
    }

    public final boolean b() {
        return false;
    }

    public final void a(int i) {
        this.f.scrollListBy(i);
    }

    public final boolean b(int i) {
        ListView listView = this.f;
        int count = listView.getCount();
        if (count != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (i > 0) {
                if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                    return false;
                }
            } else if (i < 0) {
                if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
