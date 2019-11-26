package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kpu */
public final class kpu extends kre {
    public final TextView a;
    public final ImageView b;
    public final TextView c;

    public kpu(akkq akkq, akvp akvp, akvo akvo, View view, View view2, View view3, Context context, aaas aaas, fhb fhb, gal gal, elv elv, jty jty, jup jup, akou akou) {
        super(akkq, akvp, akvo, view, view2, view3, context, aaas, fhb, gal, elv, jty, jup, akou);
        this.a = (TextView) view3.findViewById(R.id.description);
        this.c = (TextView) view3.findViewById(R.id.advertiser_name_or_website);
        this.b = (ImageView) view3.findViewById(R.id.channel_thumbnail);
    }
}
