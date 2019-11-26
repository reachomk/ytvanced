package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: yyc */
public final class yyc {
    public final yye a;
    public final View b;

    public yyc(View view, akkq akkq) {
        this.b = (View) amqw.a((Object) view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.typing_status_list);
        view.getContext();
        recyclerView.a(new ans(0, false));
        this.a = new yye(akkq);
        recyclerView.a(this.a);
        xpr.a(view, false);
    }
}
