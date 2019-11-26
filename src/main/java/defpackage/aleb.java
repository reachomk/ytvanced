package defpackage;

import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: aleb */
final class aleb extends aaj {
    private final /* synthetic */ aldw b;

    aleb(aldw aldw) {
        this.b = aldw;
    }

    public final void a(View view, aca aca) {
        super.a(view, aca);
        RecyclerView recyclerView = this.b.ae;
        if (VERSION.SDK_INT >= 22) {
            aca.a.setTraversalAfter(recyclerView);
        }
    }
}
