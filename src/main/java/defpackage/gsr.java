package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.edit.geo.LocationSearchView;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.youtube.R;

/* renamed from: gsr */
final /* synthetic */ class gsr implements amro {
    private final gso a;
    private final zqs b;

    gsr(gso gso, zqs zqs) {
        this.a = gso;
        this.b = zqs;
    }

    public final Object get() {
        gso gso = this.a;
        zqs zqs = this.b;
        ViewAnimatorHelper viewAnimatorHelper = gso.J;
        for (int i = 0; i < viewAnimatorHelper.getChildCount(); i++) {
            View childAt = viewAnimatorHelper.getChildAt(i);
            if (childAt.getId() == R.id.location_search_view) {
                return zqs.a((LocationSearchView) childAt, new gtl(gso));
            }
        }
        throw new IllegalArgumentException(String.format("No such child with id: %s", new Object[]{Integer.valueOf(R.id.location_search_view)}));
    }
}
