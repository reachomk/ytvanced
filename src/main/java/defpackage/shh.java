package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.deepauth.accountcreation.ui.BbbCreateAccountActivity;

/* renamed from: shh */
public final class shh implements OnClickListener {
    private final /* synthetic */ BbbCreateAccountActivity a;

    public shh(BbbCreateAccountActivity bbbCreateAccountActivity) {
        this.a = bbbCreateAccountActivity;
    }

    public final void onClick(View view) {
        BbbCreateAccountActivity bbbCreateAccountActivity = this.a;
        bbbCreateAccountActivity.g.a(view, bbbCreateAccountActivity.h, aodi.EVENT_ACCOUNT_CREATION_CANCEL);
        this.a.setResult(0);
        this.a.finish();
    }
}
