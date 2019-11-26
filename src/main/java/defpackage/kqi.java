package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kqi */
public final class kqi extends kre {
    public final TextView a;
    public final RatingBar b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public kqi(akkq akkq, akvp akvp, akvo akvo, View view, View view2, View view3, Context context, aaas aaas, fhb fhb, gal gal, elv elv, jty jty, jup jup, akou akou) {
        super(akkq, akvp, akvo, view, view2, view3, context, aaas, fhb, gal, elv, jty, jup, akou);
        this.a = (TextView) view3.findViewById(R.id.rating_text);
        this.b = (RatingBar) view3.findViewById(R.id.rating_bar);
        this.c = (TextView) view3.findViewById(R.id.price_text);
        this.d = (TextView) view3.findViewById(R.id.description);
        this.e = (ImageView) view3.findViewById(R.id.channel_thumbnail);
    }
}
