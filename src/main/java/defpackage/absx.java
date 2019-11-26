package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: absx */
final /* synthetic */ class absx implements OnClickListener {
    private final absu a;
    private final audn b;

    absx(absu absu, audn audn) {
        this.a = absu;
        this.b = audn;
    }

    public final void onClick(View view) {
        this.a.a(this.b);
    }
}
