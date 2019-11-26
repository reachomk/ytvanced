package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: yxf */
public final class yxf {
    public final RecyclerView a;
    private final View b;

    public yxf(View view) {
        this.a = (RecyclerView) amqw.a((RecyclerView) view.findViewById(R.id.recycler_view));
        RecyclerView recyclerView = this.a;
        view.getContext();
        recyclerView.a(new ans());
        this.b = (View) amqw.a(view.findViewById(R.id.loading_indicator));
    }

    public final void a(boolean z) {
        xpr.a(this.a, z);
    }

    public final void b(boolean z) {
        xpr.a(this.b, z);
    }
}
