package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: allu */
public final class allu implements akot {
    public final aaas a;
    public aomo b;
    private final View c;
    private final View d = this.c.findViewById(R.id.spacing);
    private final TextView e = ((TextView) this.c.findViewById(R.id.text));

    public allu(Context context, aaas aaas) {
        amqw.a((Object) context);
        this.a = (aaas) amqw.a((Object) aaas);
        this.c = LayoutInflater.from(context).inflate(R.layout.add_connection, null, false);
        this.c.findViewById(R.id.click_area).setOnClickListener(new allx(this));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aomo aomo = (aomo) obj;
        this.b = aomo;
        this.d.setVisibility(akor.a("position", -1) != 0 ? 0 : 8);
        TextView textView = this.e;
        if ((aomo.a & 2) != 0) {
            arml = aomo.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
    }
}
