package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zao */
public final /* synthetic */ class zao implements OnClickListener {
    private final Runnable a;

    public zao(Runnable runnable) {
        this.a = runnable;
    }

    public final void onClick(View view) {
        this.a.run();
    }
}
