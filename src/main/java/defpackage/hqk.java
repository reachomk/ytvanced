package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hqk */
final /* synthetic */ class hqk implements OnClickListener {
    private final hqj a;
    private final String b;

    hqk(hqj hqj, String str) {
        this.a = hqj;
        this.b = str;
    }

    public final void onClick(View view) {
        this.a.c.a(ekc.a(this.b), null);
    }
}
