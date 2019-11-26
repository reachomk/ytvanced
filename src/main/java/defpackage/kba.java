package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kba */
final class kba {
    public final ViewGroup a;
    public final akkq b;
    public final TextView c;
    public final zyw d;
    public final int e;
    public final ImageView f;
    public final TextView g;
    public final TextView h;
    public final ImageView i;
    public final fnb j;
    public final eza k;
    public final /* synthetic */ kbb l;

    kba(kbb kbb, Context context, akkq akkq, zyw zyw) {
        this.l = kbb;
        this.b = akkq;
        this.d = zyw;
        if (xss.b(context) && foh.L(zyw)) {
            this.a = (LinearLayout) View.inflate(context, R.layout.compact_promoted_item_linear_feed_tablet, null);
        } else {
            this.a = (RelativeLayout) View.inflate(context, R.layout.compact_promoted_item, null);
        }
        this.f = (ImageView) this.a.findViewById(R.id.thumbnail);
        this.g = (TextView) this.a.findViewById(R.id.title);
        this.h = (TextView) this.a.findViewById(R.id.subtitle);
        this.c = (TextView) this.a.findViewById(R.id.button);
        this.j = kbb.b.a(this.c);
        this.i = (ImageView) this.a.findViewById(R.id.dismiss_button);
        this.i.setOnClickListener(new kbd(this));
        this.e = context.getResources().getDimensionPixelSize(R.dimen.slight_start_end_padding);
        this.k = new eza(xwe.a(context, R.attr.yt10PercentLayer, 0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
    }
}
