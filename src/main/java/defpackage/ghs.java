package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ghs */
final /* synthetic */ class ghs implements OnClickListener {
    private final ghn a;
    private final int b;

    ghs(ghn ghn, int i) {
        this.a = ghn;
        this.b = i;
    }

    public final void onClick(View view) {
        ghn ghn = this.a;
        int i = this.b;
        ghn.an.b(i);
        ((gil) ghn.ap.c(i)).f();
    }
}
