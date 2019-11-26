package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ivn */
public final class ivn implements akot {
    public apxu a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.view_all));

    public ivn(Context context, aaas aaas, ViewGroup viewGroup) {
        this.b = LayoutInflater.from(context).inflate(R.layout.watch_card_dropdown_view_all, viewGroup, false);
        this.c.setOnClickListener(new ivm(this, aaas));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ivp ivp = (ivp) obj;
        xpr.a(this.c, ajqy.a(ivp.a));
        this.a = ivp.b;
    }
}
