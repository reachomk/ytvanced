package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: agkt */
public final class agkt implements OnClickListener {
    private final /* synthetic */ agvz a;

    public agkt(agvz agvz) {
        this.a = agvz;
    }

    public final void onClick(View view) {
        for (agqy a : this.a.k().c()) {
            this.a.k().c(a.a());
        }
    }
}
