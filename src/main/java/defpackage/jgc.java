package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jgc */
public final class jgc {
    public final Activity a;
    public final akkq b;
    public final aaas c;
    public ajsi d;
    public apqu e;
    public AlertDialog f;
    public View g;
    public ImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    private final View n;
    private final View o = this.n.findViewById(R.id.additional_offers);
    private final TextView p = ((TextView) this.n.findViewById(R.id.header));
    private final TextView q = ((TextView) this.n.findViewById(R.id.prices));
    private final TextView r = ((TextView) this.n.findViewById(R.id.additional_info));

    public jgc(Activity activity, akkq akkq, aaas aaas, View view) {
        this.a = (Activity) amqw.a((Object) activity);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (aaas) amqw.a((Object) aaas);
        this.n = (View) amqw.a((Object) view);
        this.o.setOnClickListener(new jgb(this));
    }

    public final void a(ajsi ajsi) {
        this.d = ajsi;
        int i = 8;
        if (ajsi == null) {
            this.n.setVisibility(8);
            return;
        }
        arml arml;
        this.n.setVisibility(0);
        TextView textView = this.p;
        if (textView != null) {
            xpr.a(textView, ajqy.a(ajsi.a));
        }
        apqu apqu = ajsi.b.b;
        if (apqu == null) {
            apqu = apqu.i;
        }
        TextView textView2 = this.q;
        arml arml2 = null;
        if ((apqu.a & 16) != 0) {
            arml = apqu.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView2.setText(ajqy.a(arml));
        textView2 = this.r;
        if ((apqu.a & 32) != 0) {
            arml2 = apqu.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        textView2.setText(ajqy.a(arml2));
        View view = this.o;
        if (jgc.b(ajsi) != null) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public static apqu b(ajsi ajsi) {
        if (ajsi != null) {
            apne apne = ajsi.c;
            if (!(apne == null || (apne.a & 1) == 0)) {
                apqu apqu = apne.b;
                if (apqu == null) {
                    apqu = apqu.i;
                }
                return apqu;
            }
        }
        return null;
    }
}
