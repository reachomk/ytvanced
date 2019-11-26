package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kql */
public final class kql extends krf {
    private final TextView f;
    private final RatingBar g;
    private final TextView h;
    private final TextView i;
    private final ImageView j;

    public kql(akkq akkq, akvp akvp, akvo akvo, View view, View view2) {
        super(akkq, akvp, akvo, view, view2, true);
        this.f = (TextView) view2.findViewById(R.id.rating_text);
        this.g = (RatingBar) view2.findViewById(R.id.rating_bar);
        this.h = (TextView) view2.findViewById(R.id.price_text);
        this.i = (TextView) view2.findViewById(R.id.description);
        this.j = (ImageView) view2.findViewById(R.id.channel_thumbnail);
    }

    public final void a(acvx acvx, Object obj, ajym ajym, awpq awpq) {
        super.a(acvx, obj, ajym, awpq, true);
        float f = ajym.d;
        int i = ajym.e;
        int i2 = ajym.f;
        Spanned a = ajqy.a(ajym.n);
        arml arml = awpq.i;
        if (arml == null) {
            arml = arml.f;
        }
        Spanned a2 = ajqy.a(arml);
        aygk aygk = awpq.g;
        if (aygk == null) {
            aygk = aygk.f;
        }
        kqt.a(this.f, this.g, f, i, i2);
        kqt.a(this.h, a);
        kqt.a(this.i, a2);
        kqt.a(this.j, aygk, this.a);
    }
}
