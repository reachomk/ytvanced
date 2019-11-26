package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kuh */
public final class kuh extends krf {
    private final TextView f;
    private final TextView g;
    private final TextView h;

    public kuh(akkq akkq, akvp akvp, akvo akvo, View view, View view2) {
        super(akkq, akvp, akvo, view, view2, false);
        this.f = (TextView) view2.findViewById(R.id.advertiser);
        this.g = (TextView) view2.findViewById(R.id.separator);
        this.h = (TextView) view2.findViewById(R.id.price);
    }

    public final void a(acvx acvx, Object obj, ajyx ajyx, aviq aviq) {
        super.a(acvx, obj, ajyx, aviq);
        CharSequence a = ajqy.a(ajyx.f);
        CharSequence a2 = ajqy.a(ajyx.r);
        CharSequence a3 = ajqy.a(ajyx.g);
        if (TextUtils.isEmpty(a)) {
            this.h.setVisibility(8);
            this.g.setVisibility(8);
        } else {
            xpr.a(this.h, a);
            xpr.a(this.g, a2);
        }
        xpr.a(this.f, a3);
    }
}
