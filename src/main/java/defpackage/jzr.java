package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* renamed from: jzr */
final /* synthetic */ class jzr implements OnLongClickListener {
    private final jzo a;

    jzr(jzo jzo) {
        this.a = jzo;
    }

    public final boolean onLongClick(View view) {
        SwipeLayout swipeLayout = this.a.a;
        if (swipeLayout.j()) {
            swipeLayout.b(0.0f);
        } else {
            swipeLayout.c(0.0f);
        }
        return true;
    }
}
