package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.deepauth.accountcreation.ui.BbbAccountChooserActivity;

/* renamed from: shd */
public final class shd implements OnClickListener {
    private final /* synthetic */ BbbAccountChooserActivity a;

    public final void onClick(View view) {
        if (!this.a.i.c()) {
            this.a.h.a(view, BbbAccountChooserActivity.g, aodi.EVENT_ACCOUNT_SELECTION_SELECT_ACCOUNT);
            this.a.i.d();
        }
    }

    public /* synthetic */ shd(BbbAccountChooserActivity bbbAccountChooserActivity) {
        this.a = bbbAccountChooserActivity;
    }
}
