package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.deepauth.accountcreation.CreateAccountActivity;

/* renamed from: sgw */
public final class sgw implements OnClickListener {
    private final /* synthetic */ CreateAccountActivity a;

    public sgw(CreateAccountActivity createAccountActivity) {
        this.a = createAccountActivity;
    }

    public final void onClick(View view) {
        CreateAccountActivity createAccountActivity = this.a;
        createAccountActivity.g.a(view, createAccountActivity.h, aodi.EVENT_ACCOUNT_CREATION_CREATE_ACCOUNT);
        this.a.i.a();
    }
}
