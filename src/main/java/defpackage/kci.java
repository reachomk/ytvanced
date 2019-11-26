package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kci */
final class kci implements OnClickListener {
    private final /* synthetic */ kcj a;

    kci(kcj kcj) {
        this.a = kcj;
    }

    public final void onClick(View view) {
        kcj kcj = this.a;
        kck kck = kcj.c;
        if (kck != null) {
            kck.c = true;
            kcj.b.setText(kck.b);
            kcj.a.setVisibility(8);
        }
    }
}
