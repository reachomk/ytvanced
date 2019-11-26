package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.deepauth.accountcreation.AccountChooserActivity;

/* renamed from: sgo */
public final class sgo implements OnClickListener {
    private final /* synthetic */ AccountChooserActivity a;

    public final void onClick(View view) {
        if (!this.a.i.c()) {
            this.a.h.a(view, AccountChooserActivity.g, aodi.EVENT_ACCOUNT_SELECTION_USE_ANOTHER_ACCOUNT);
            this.a.setResult(8000, new Intent().putExtra("TOKEN_RESPONSE", this.a.i.e()));
            this.a.finish();
        }
    }

    public /* synthetic */ sgo(AccountChooserActivity accountChooserActivity) {
        this.a = accountChooserActivity;
    }
}
