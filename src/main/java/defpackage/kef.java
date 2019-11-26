package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kef */
final /* synthetic */ class kef implements OnClickListener {
    private final kdw a;
    private final aphg b;

    kef(kdw kdw, aphg aphg) {
        this.a = kdw;
        this.b = aphg;
    }

    public final void onClick(View view) {
        this.a.a(this.b);
    }
}
