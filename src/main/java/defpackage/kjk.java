package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kjk */
final /* synthetic */ class kjk implements OnClickListener {
    private final kjl a;
    private final gax b;
    private final aaas c;

    kjk(kjl kjl, gax gax, aaas aaas) {
        this.a = kjl;
        this.b = gax;
        this.c = aaas;
    }

    public final void onClick(View view) {
        this.a.a(this.b, this.c);
    }
}
