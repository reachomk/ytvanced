package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wuc */
final /* synthetic */ class wuc implements OnClickListener {
    private final wud a;

    wuc(wud wud) {
        this.a = wud;
    }

    public final void onClick(View view) {
        wud wud = this.a;
        wud.a(wud.b.getVisibility() != 0);
    }
}
