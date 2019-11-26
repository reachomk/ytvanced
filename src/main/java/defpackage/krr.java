package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: krr */
public final class krr extends krc {
    private final TextView e;

    public krr(akkq akkq, akvp akvp, akvo akvo, View view, View view2) {
        super(akkq, akvp, akvo, view, view2, false);
        this.e = (TextView) view2.findViewById(R.id.website);
    }

    public final void a(acvx acvx, Object obj, ajzc ajzc, aviq aviq) {
        amqw.a((Object) ajzc);
        Spanned a = ajqy.a(ajzc.a);
        Spanned a2 = ajqy.a(ajzc.b);
        awqa awqa = ajzc.j;
        boolean z = ajzv.b(ajzc.f, aphg.class) && aviq != null;
        a(acvx, obj, a, a2, awqa, z, (auvn) ajzv.a(ajzc.f, auvn.class));
        a(null, (aohe) ajzv.a(ajzc.k, aohe.class), null, false);
        xpr.a(this.e, ajqy.a(ajzc.c));
    }
}
