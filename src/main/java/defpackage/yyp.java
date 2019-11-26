package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yyp */
public final class yyp {
    public final ImageView a;
    public final TextView b;
    public final RecyclerView c;
    public final akkq d;
    private final View e;

    public yyp(View view, akkq akkq) {
        this.a = (ImageView) amqw.a((ImageView) view.findViewById(R.id.avatar));
        this.b = (TextView) amqw.a((TextView) view.findViewById(R.id.name));
        this.c = (RecyclerView) amqw.a((RecyclerView) view.findViewById(R.id.recycler_view));
        RecyclerView recyclerView = this.c;
        view.getContext();
        recyclerView.a(new ans());
        this.e = (View) amqw.a(view.findViewById(R.id.loading_indicator));
        this.d = (akkq) amqw.a((Object) akkq);
    }

    public final void a(boolean z) {
        xpr.a(this.c, z);
    }

    public final void b(boolean z) {
        xpr.a(this.e, z);
    }
}
