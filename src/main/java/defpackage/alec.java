package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alec */
final class alec implements OnClickListener {
    private final /* synthetic */ axip a;
    private final /* synthetic */ aldw b;

    alec(aldw aldw, axip axip) {
        this.b = aldw;
        this.a = axip;
    }

    public final void onClick(View view) {
        this.b.af.d(new alhi());
        this.b.b(this.a.b);
        this.b.dismiss();
    }
}
