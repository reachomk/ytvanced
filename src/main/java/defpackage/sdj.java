package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.cast.companionlibrary.widgets.MiniController;
import com.google.android.youtube.R;

/* renamed from: sdj */
public final class sdj implements OnClickListener {
    private final /* synthetic */ MiniController a;

    public sdj(MiniController miniController) {
        this.a = miniController;
    }

    public final void onClick(View view) {
        MiniController miniController = this.a;
        if (miniController.b != null) {
            miniController.b(false);
            try {
                miniController = this.a;
                miniController.b.a(miniController.a.getContext());
            } catch (Exception unused) {
                this.a.b.a(R.string.ccl_failed_perform_action, -1);
            }
        }
    }
}
