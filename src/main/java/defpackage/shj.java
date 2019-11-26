package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.deepauth.accountcreation.ui.BbbCreateAccountActivity;

/* renamed from: shj */
public final class shj implements OnClickListener {
    private final /* synthetic */ BbbCreateAccountActivity a;

    public final void onClick(View view) {
        BbbCreateAccountActivity bbbCreateAccountActivity = this.a;
        bbbCreateAccountActivity.g.a(view, bbbCreateAccountActivity.h, aodi.EVENT_ACCOUNT_CREATION_CREATE_ACCOUNT);
        this.a.i.a();
    }

    public /* synthetic */ shj(BbbCreateAccountActivity bbbCreateAccountActivity) {
        this.a = bbbCreateAccountActivity;
    }
}
