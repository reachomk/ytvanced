package android.support.design.internal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.aiw;
import defpackage.ajl;
import defpackage.ans;

public class NavigationMenuView extends RecyclerView implements ajl {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public final void a(aiw aiw) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(new ans(1, false));
    }
}
