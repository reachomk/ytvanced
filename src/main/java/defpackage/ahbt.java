package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;

/* renamed from: ahbt */
public final class ahbt implements OnClickListener {
    private final /* synthetic */ int a;
    private final /* synthetic */ NonScrollableListView b;

    public ahbt(NonScrollableListView nonScrollableListView, int i) {
        this.b = nonScrollableListView;
        this.a = i;
    }

    public final void onClick(View view) {
        NonScrollableListView nonScrollableListView = this.b;
        OnItemClickListener onItemClickListener = nonScrollableListView.b;
        if (onItemClickListener != null) {
            int i = this.a;
            onItemClickListener.onItemClick(null, view, i, nonScrollableListView.a.getItemId(i));
        }
    }
}
