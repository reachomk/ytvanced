package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.cast.companionlibrary.widgets.MiniController;

/* renamed from: sdl */
public final class sdl implements OnClickListener {
    private final /* synthetic */ MiniController a;

    public sdl(MiniController miniController) {
        this.a = miniController;
    }

    public final void onClick(View view) {
        sdq sdq = this.a.b;
        if (sdq != null) {
            sdq.r();
        }
    }
}
