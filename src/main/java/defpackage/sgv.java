package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.deepauth.accountcreation.CreateAccountActivity;

/* renamed from: sgv */
public final class sgv implements OnClickListener {
    private final /* synthetic */ CreateAccountActivity a;

    public sgv(CreateAccountActivity createAccountActivity) {
        this.a = createAccountActivity;
    }

    public final void onClick(View view) {
        CreateAccountActivity createAccountActivity = this.a;
        createAccountActivity.g.a(view, createAccountActivity.h, aodi.EVENT_ACCOUNT_CREATION_CANCEL);
        this.a.setResult(0);
        this.a.finish();
    }
}
