package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: kox */
final /* synthetic */ class kox implements OnClickListener {
    private final kov a;

    kox(kov kov) {
        this.a = kov;
    }

    public final void onClick(View view) {
        kov kov = this.a;
        View view2 = new koy(kov.a, new kow(kov)).d;
        aeg aeg = new aeg(kov.a);
        aeg.a(view2);
        aeg.a(R.string.cancel, null);
        kov.f = aeg.a();
        kov.f.show();
    }
}
