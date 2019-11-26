package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: allr */
public final class allr implements akot {
    public final aaas a;
    private final akvp b;
    private final View c;
    private final ImageView d = ((ImageView) this.c.findViewById(R.id.icon));
    private final TextView e = ((TextView) this.c.findViewById(R.id.text));
    private final acvx f;

    public allr(Context context, ViewGroup viewGroup, akvp akvp, aaas aaas, acvx acvx) {
        this.b = (akvp) amqw.a((Object) akvp);
        this.a = (aaas) amqw.a((Object) aaas);
        this.c = LayoutInflater.from(context).inflate(R.layout.add_connection_button, viewGroup, false);
        this.f = (acvx) amqw.a((Object) acvx);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        int a;
        arml arml;
        aykj aykj = (aykj) obj;
        if ((aykj.a & 1) != 0) {
            akvp akvp = this.b;
            arwf arwf = aykj.b;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a2 = arwh.a(arwf.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            a = akvp.a(a2);
        } else {
            a = 0;
        }
        if (a != 0) {
            this.d.setImageResource(a);
        } else {
            this.d.setImageDrawable(null);
        }
        TextView textView = this.e;
        if ((aykj.a & 2) != 0) {
            arml = aykj.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        this.c.setOnClickListener(new allq(this, aykj));
        this.f.a(aykj.e.d(), null);
    }
}
