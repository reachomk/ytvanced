package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kgk */
public final class kgk extends akpl {
    private final Context a;
    private final int b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.notification_text));
    private final fnb e;

    public kgk(Context context, fna fna) {
        this.a = (Context) amqw.a((Object) context);
        this.c = View.inflate(context, R.layout.playlist_notification, null);
        this.e = fna.a((TextView) this.c.findViewById(R.id.action_button));
        this.b = xss.a(context.getResources().getDisplayMetrics(), 15);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        awix awix = (awix) obj;
        LayoutParams layoutParams = this.c.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            MarginLayoutParams marginLayoutParams = new MarginLayoutParams(layoutParams);
            marginLayoutParams.topMargin = this.b;
            this.c.setLayoutParams(marginLayoutParams);
        }
        TextView textView = this.d;
        aphg aphg = null;
        if ((awix.a & 2) != 0) {
            arml = awix.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        for (awiv awiv : awix.c) {
            if ((awiv.a & 1) != 0) {
                aphg aphg2 = awiv.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                aphg = aphg2;
                this.c.setBackgroundColor(xwe.a(this.a, R.attr.colorPrimaryAlternate, R.color.color_brand_primary_alternate));
                this.d.setTextColor(this.a.getResources().getColor(17170443));
                this.e.a(aphg, akor.a);
            }
        }
        this.e.a(aphg, akor.a);
    }
}
