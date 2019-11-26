package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;

/* renamed from: jpk */
public final class jpk extends apv {
    private final /* synthetic */ MainCollapsingToolbarLayout a;

    public jpk(MainCollapsingToolbarLayout mainCollapsingToolbarLayout) {
        this.a = mainCollapsingToolbarLayout;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        MainCollapsingToolbarLayout mainCollapsingToolbarLayout = this.a;
        boolean z = false;
        if (abe.D(mainCollapsingToolbarLayout) && !mainCollapsingToolbarLayout.isInEditMode()) {
            z = true;
        }
        if (!mainCollapsingToolbarLayout.c(z)) {
            this.a.a(null);
        }
    }
}
