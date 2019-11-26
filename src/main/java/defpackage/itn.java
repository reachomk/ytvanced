package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: itn */
public final class itn implements akot {
    private final View a;
    private final akou b;
    private final TextView c = ((TextView) this.a.findViewById(R.id.title));

    public itn(Context context, flu flu) {
        amqw.a((Object) context);
        this.b = (akou) amqw.a((Object) flu);
        this.a = View.inflate(context, R.layout.exploratory_results_header, null);
        flu.a(this.a);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        this.c.setText(ajqy.a(((ajuq) obj).a));
        this.b.a(akor);
    }
}
