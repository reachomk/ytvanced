package com.google.android.libraries.youtube.offline.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import defpackage.ahbs;
import defpackage.ahbt;
import java.util.ArrayDeque;

public class NonScrollableListView extends LinearLayout {
    public ListAdapter a;
    public OnItemClickListener b;
    public ahbs c;
    private SparseArray d;

    public NonScrollableListView(Context context) {
        super(context);
    }

    public NonScrollableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonScrollableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a() {
        removeAllViews();
        int count = this.a.getCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            View view = null;
            if (i2 >= count) {
                break;
            }
            int itemViewType = this.a.getItemViewType(i2);
            SparseArray sparseArray = this.d;
            ArrayDeque arrayDeque = (sparseArray == null || sparseArray.size() <= itemViewType) ? null : (ArrayDeque) this.d.get(itemViewType);
            if (!(arrayDeque == null || arrayDeque.isEmpty())) {
                view = (View) arrayDeque.removeFirst();
            }
            view = this.a.getView(i2, view, this);
            if (view != null) {
                addView(view);
                view.setOnClickListener(new ahbt(this, i2));
            }
            i2++;
        }
        setVisibility(count > 0 ? 0 : 8);
        if (this.d == null) {
            this.d = new SparseArray(this.a.getViewTypeCount());
        }
        while (i < getChildCount()) {
            count = this.a.getItemViewType(i);
            ArrayDeque arrayDeque2 = this.d.size() > count ? (ArrayDeque) this.d.get(count) : null;
            if (arrayDeque2 == null) {
                arrayDeque2 = new ArrayDeque();
                this.d.put(count, arrayDeque2);
            }
            arrayDeque2.add(getChildAt(i));
            i++;
        }
    }

    static {
        NonScrollableListView.class.getSimpleName();
    }
}
