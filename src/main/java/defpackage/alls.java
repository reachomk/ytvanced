package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alls */
public final class alls implements akot {
    public final allb a;
    public final aaas b;
    public aomm c;
    public acvx d;
    private final View e;
    private final TextView f = ((TextView) this.e.findViewById(R.id.title));
    private final akle g;

    public alls(Context context, allb allb, aaas aaas, akkq akkq) {
        this.a = (allb) amqw.a((Object) allb);
        this.b = (aaas) amqw.a((Object) aaas);
        this.e = LayoutInflater.from(context).inflate(R.layout.add_connection_compact_link, null, false);
        this.e.setOnClickListener(new allv(this));
        this.g = new akle(akkq, (ImageView) this.e.findViewById(R.id.thumbnail));
    }

    public final View K_() {
        return this.e;
    }

    public final void a(akpb akpb) {
        this.c = null;
        this.g.b();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aomm aomm = (aomm) obj;
        this.c = aomm;
        TextView textView = this.f;
        if ((aomm.a & 2) != 0) {
            arml = aomm.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(aabb.a(arml, this.b, false));
        akle akle = this.g;
        aygk aygk = aomm.d;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akle.a(aygk);
        this.d = akor.a;
    }
}
