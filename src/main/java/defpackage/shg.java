package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.deepauth.accountcreation.ui.BbbCreateAccountActivity;

/* renamed from: shg */
public final class shg implements OnClickListener {
    private final /* synthetic */ BbbCreateAccountActivity a;

    public final void onClick(View view) {
        BbbCreateAccountActivity bbbCreateAccountActivity = this.a;
        bbbCreateAccountActivity.g.a(bbbCreateAccountActivity.j, bbbCreateAccountActivity.h, aodi.EVENT_ACCOUNT_SELECTION_USE_ANOTHER_ACCOUNT);
        bbbCreateAccountActivity = this.a;
        Intent intent = new Intent();
        sfc sfc = this.a.i.a;
        new seg(sfc.c).execute(new Context[]{sfc.a});
        bbbCreateAccountActivity.setResult(8000, intent.putExtra("TOKEN_RESPONSE", new sfq(sfc.b.a(sgn.APP_AUTH))));
        this.a.finish();
    }

    public /* synthetic */ shg(BbbCreateAccountActivity bbbCreateAccountActivity) {
        this.a = bbbCreateAccountActivity;
    }
}
