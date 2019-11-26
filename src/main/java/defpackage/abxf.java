package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;

/* renamed from: abxf */
final class abxf implements OnClickListener {
    private final /* synthetic */ abxb a;

    public final void onClick(View view) {
        ugo ugo;
        ExpandingScrollView expandingScrollView = this.a.b;
        int ordinal = expandingScrollView.d.ordinal();
        if (ordinal == 0) {
            ugo = ugo.HIDDEN;
        } else if (ordinal == 1) {
            ugo = ugo.EXPANDED;
        } else if (ordinal == 2 || ordinal == 3) {
            ugo = ugo.COLLAPSED;
        } else {
            ugo = expandingScrollView.d;
        }
        if (ugo != expandingScrollView.d) {
            expandingScrollView.a(ugo);
        }
    }

    /* synthetic */ abxf(abxb abxb) {
        this.a = abxb;
    }
}
