package defpackage;

import android.database.DataSetObserver;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;

/* renamed from: ahbs */
public final class ahbs extends DataSetObserver {
    private final /* synthetic */ NonScrollableListView a;

    protected ahbs(NonScrollableListView nonScrollableListView) {
        this.a = nonScrollableListView;
    }

    public final void onChanged() {
        NonScrollableListView nonScrollableListView = this.a;
        if (nonScrollableListView.a != null) {
            nonScrollableListView.a();
        }
    }

    public final void onInvalidated() {
        onChanged();
    }
}
