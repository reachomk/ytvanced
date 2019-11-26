package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kpx */
public final class kpx extends krf {
    private final TextView f;
    private final ImageView g;
    private final TextView h;

    public kpx(akkq akkq, akvp akvp, akvo akvo, View view, View view2) {
        super(akkq, akvp, akvo, view, view2, true);
        this.f = (TextView) view2.findViewById(R.id.description);
        this.h = (TextView) view2.findViewById(R.id.advertiser_name_or_website);
        this.g = (ImageView) view2.findViewById(R.id.channel_thumbnail);
    }

    public final void a(acvx acvx, Object obj, ajyq ajyq, awpi awpi) {
        super.a(acvx, obj, ajyq, awpi, true);
        arml arml = awpi.i;
        if (arml == null) {
            arml = arml.f;
        }
        Spanned a = ajqy.a(arml);
        Spanned a2 = ajqy.a(ajyq.g);
        aygk aygk = awpi.g;
        if (aygk == null) {
            aygk = aygk.f;
        }
        kqs.a(this.f, a);
        kqs.a(this.h, a2);
        kqs.a(this.g, aygk, this.a);
    }
}
