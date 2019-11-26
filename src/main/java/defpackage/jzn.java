package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jzn */
public final class jzn extends akpl {
    public final aaas a;
    private final Context b;
    private final akou c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final View i;
    private final ViewGroup j;

    public jzn(Context context, flu flu, aaas aaas) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (akou) amqw.a((Object) flu);
        this.a = (aaas) amqw.a((Object) aaas);
        View inflate = View.inflate(context, R.layout.channel_about_metadata_item, null);
        this.d = (TextView) inflate.findViewById(R.id.description);
        this.e = (TextView) inflate.findViewById(R.id.joined_date);
        this.f = (TextView) inflate.findViewById(R.id.subscribers);
        this.g = (TextView) inflate.findViewById(R.id.views);
        this.h = inflate.findViewById(R.id.description_separator);
        this.i = inflate.findViewById(R.id.stats_separator);
        this.j = (ViewGroup) inflate.findViewById(R.id.links);
        flu.a(inflate);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c.a();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        apki apki = (apki) obj;
        TextView textView = this.d;
        arml arml2 = null;
        if ((apki.a & 4) != 0) {
            arml = apki.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.e;
        if ((apki.a & 1024) != 0) {
            arml = apki.k;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        anyd<apjw> anyd = apki.g;
        this.j.removeAllViews();
        boolean z = false;
        if (anyd.isEmpty()) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
            for (apjw apjw : anyd) {
                TextView textView2 = (TextView) View.inflate(this.b, R.layout.channel_link_item, null);
                if ((apjw.a & 1) != 0) {
                    apxu apxu = apjw.b;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    textView2.setOnClickListener(new jzm(this, apxu));
                }
                if ((apjw.a & 4) != 0) {
                    arml = apjw.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                xpr.a(textView2, ajqy.a(arml));
                this.j.addView(textView2, new LayoutParams(-2, -2));
            }
        }
        boolean z2 = (this.d.getVisibility() == 8 && this.e.getVisibility() == 8 && this.j.getVisibility() == 8) ? false : true;
        xpr.a(this.h, z2);
        textView = this.f;
        if ((apki.a & 128) != 0) {
            arml = apki.h;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.g;
        if ((apki.a & 256) != 0) {
            arml2 = apki.i;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml2));
        if (!(this.f.getVisibility() == 8 || this.g.getVisibility() == 8)) {
            z = true;
        }
        xpr.a(this.i, z);
        this.c.a(akor);
    }
}
