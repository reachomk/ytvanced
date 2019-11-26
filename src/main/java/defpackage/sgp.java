package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.deepauth.accountcreation.AccountChooserActivity;

/* renamed from: sgp */
public final class sgp implements OnClickListener {
    private final /* synthetic */ AccountChooserActivity a;

    public final void onClick(View view) {
        if (!this.a.i.c()) {
            this.a.h.a(view, AccountChooserActivity.g, aodi.EVENT_ACCOUNT_SELECTION_SELECT_ACCOUNT);
            this.a.i.d();
        }
    }

    public /* synthetic */ sgp(AccountChooserActivity accountChooserActivity) {
        this.a = accountChooserActivity;
    }
}
