package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.cast.companionlibrary.widgets.MiniController;

/* renamed from: sdm */
public final class sdm implements OnClickListener {
    private final /* synthetic */ MiniController a;

    public sdm(MiniController miniController) {
        this.a = miniController;
    }

    public final void onClick(View view) {
        sdq sdq = this.a.b;
        if (sdq != null) {
            sdq.q();
        }
    }
}
