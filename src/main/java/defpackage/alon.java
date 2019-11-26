package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alon */
public final class alon implements akot {
    public apxu a;
    private final akvp b;
    private final View c;
    private final ImageView d = ((ImageView) this.c.findViewById(R.id.icon));
    private final TextView e = ((TextView) this.c.findViewById(R.id.text));
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public alon(Context context, alop alop, akvp akvp, aaas aaas) {
        amqw.a((Object) alop);
        amqw.a((Object) aaas);
        amqw.a((Object) context);
        this.b = (akvp) amqw.a((Object) akvp);
        this.c = View.inflate(context, R.layout.sharing_option_button, null);
        this.c.setOnClickListener(new alom(this, aaas, alop));
        this.f = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_top_padding);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_bottom_padding);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_right_padding);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_left_padding);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_first_item_top_padding);
        this.k = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_last_item_bottom_padding);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arwh a;
        arml arml;
        aphg aphg = (aphg) obj;
        boolean a2 = akor.a("isFirstItem", false);
        boolean a3 = akor.a("isLastItem", false);
        if (a2) {
            this.c.setPadding(this.h, this.j, this.i, this.f);
        } else if (a3) {
            this.c.setPadding(this.h, this.g, this.i, this.k);
        } else {
            this.c.setPadding(this.h, this.g, this.i, this.f);
        }
        akvp akvp = this.b;
        if ((aphg.a & 16) != 0) {
            arwf arwf = aphg.e;
            if (arwf == null) {
                arwf = arwf.c;
            }
            a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
        } else {
            a = arwh.UNKNOWN;
        }
        int a4 = akvp.a(a);
        if (a4 != 0) {
            this.d.setImageResource(a4);
        }
        TextView textView = this.e;
        if ((aphg.a & 128) != 0) {
            arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        apxu apxu = aphg.n;
        if (apxu == null) {
            apxu = apxu.d;
        }
        this.a = apxu;
    }
}
