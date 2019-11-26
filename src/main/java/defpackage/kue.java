package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kue */
public final class kue extends krf {
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;

    public kue(akkq akkq, akvp akvp, akvo akvo, View view, View view2) {
        super(akkq, akvp, akvo, view, view2, false);
        this.f = (TextView) view2.findViewById(R.id.title);
        this.g = (TextView) view2.findViewById(R.id.advertiser);
        this.h = (TextView) view2.findViewById(R.id.price);
        this.i = (TextView) view2.findViewById(R.id.description);
    }

    public final void a(acvx acvx, Object obj, ajyx ajyx, aviq aviq) {
        super.a(acvx, obj, ajyx, aviq);
        CharSequence a = ajqy.a(ajyx.g);
        CharSequence a2 = ajqy.a(ajyx.f);
        CharSequence a3 = ajqy.a(ajyx.e);
        boolean z = ajyx.s;
        xpr.a(this.g, a);
        if (TextUtils.isEmpty(a2)) {
            this.f.setMaxLines(2);
            this.h.setVisibility(8);
        } else {
            this.f.setMaxLines(1);
            xpr.a(this.h, a2);
        }
        if (!z || TextUtils.isEmpty(a3)) {
            this.i.setMaxLines(0);
            this.i.setVisibility(8);
            return;
        }
        this.i.setMaxLines(3);
        xpr.a(this.i, a3);
    }
}
