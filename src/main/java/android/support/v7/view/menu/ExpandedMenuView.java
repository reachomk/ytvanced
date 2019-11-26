package android.support.v7.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import defpackage.aiw;
import defpackage.aiy;
import defpackage.aja;
import defpackage.ajl;
import defpackage.arz;

public final class ExpandedMenuView extends ListView implements aiy, ajl, OnItemClickListener {
    private static final int[] a = new int[]{16842964, 16843049};
    private aiw b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        arz a = arz.a(context, attributeSet, a, i, 0);
        if (a.h(0)) {
            setBackgroundDrawable(a.a(0));
        }
        if (a.h(1)) {
            setDivider(a.a(1));
        }
        a.a();
    }

    public final void a(aiw aiw) {
        this.b = aiw;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final boolean a(aja aja) {
        return this.b.a((MenuItem) aja, 0);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((aja) getAdapter().getItem(i));
    }
}
