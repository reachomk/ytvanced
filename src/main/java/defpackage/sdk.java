package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.cast.companionlibrary.widgets.MiniController;
import com.google.android.youtube.R;

/* renamed from: sdk */
public final class sdk implements OnClickListener {
    private final /* synthetic */ MiniController a;

    public sdk(MiniController miniController) {
        this.a = miniController;
    }

    public final void onClick(View view) {
        MiniController miniController = this.a;
        if (miniController.b != null) {
            miniController.b(true);
            try {
                this.a.b.p();
            } catch (sbq unused) {
                this.a.b.a(R.string.ccl_failed_perform_action, -1);
            } catch (sbv unused2) {
                this.a.b.a(R.string.ccl_failed_no_connection_trans, -1);
            } catch (sbt unused3) {
                this.a.b.a(R.string.ccl_failed_no_connection, -1);
            }
        }
    }
}
