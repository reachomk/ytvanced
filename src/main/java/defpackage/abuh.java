package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abuh */
public final class abuh implements akot {
    private final abrn a;
    private final anm b = new anm(3);
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.category_name));
    private final RecyclerView e = ((RecyclerView) this.c.findViewById(R.id.emoji_grid));

    public abuh(Context context, abrn abrn, abru abru) {
        this.c = View.inflate(context, abru.a(6), null);
        this.a = abrn;
        this.e.a(this.b);
        this.e.a((apa) abrn);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        abrn abrn = this.a;
        abrn.d = null;
        abrn.e();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ardy ardy = (ardy) obj;
        this.a.c = (abrf) akor.a("CONTROLLER_KEY");
        TextView textView = this.d;
        arml arml = ardy.b;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        if (ardy.c.size() > 0) {
            abrn abrn = this.a;
            abrn.d = ardy.c;
            abrn.aa_();
        }
    }
}
