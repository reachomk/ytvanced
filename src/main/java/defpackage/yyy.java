package defpackage;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yyy */
public final class yyy implements yxs {
    private final RecyclerView a;
    private final View b;
    private final View c;
    private final TextView d = ((TextView) amqw.a((TextView) this.c.findViewById(R.id.error_message)));
    private final xsd e;
    private boolean f;
    private boolean g;

    public yyy(yxv yxv, View view, apa apa, xsd xsd) {
        this.a = (RecyclerView) amqw.a((RecyclerView) view.findViewById(R.id.recycler_view));
        RecyclerView recyclerView = this.a;
        view.getContext();
        recyclerView.a(new ans());
        this.a.a(apa);
        this.b = (View) amqw.a(view.findViewById(R.id.loading_indicator));
        this.c = (View) amqw.a(view.findViewById(R.id.error_container));
        this.c.findViewById(R.id.error_retry_button).setOnClickListener(new yzb(yxv));
        this.e = (xsd) amqw.a((Object) xsd);
    }

    public final void a(String str) {
        this.e.a(str);
    }

    public final void a(boolean z) {
        this.f = z;
        a();
    }

    public final void b(String str) {
        this.g = TextUtils.isEmpty(str) ^ 1;
        this.d.setText(str);
        a();
    }

    private final void a() {
        View view = this.b;
        boolean z = false;
        boolean z2 = this.f && !this.g;
        xpr.a(view, z2);
        xpr.a(this.c, this.g);
        view = this.a;
        if (!(this.f || this.g)) {
            z = true;
        }
        xpr.a(view, z);
    }
}
