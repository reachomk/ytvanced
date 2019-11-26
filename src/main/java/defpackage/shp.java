package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: shp */
final /* synthetic */ class shp implements OnClickListener {
    private final shn a;

    shp(shn shn) {
        this.a = shn;
    }

    public final void onClick(View view) {
        shn shn = this.a;
        shn.h.a(view, shn.g, aodi.EVENT_ACCOUNT_SELECTION_USE_ANOTHER_ACCOUNT);
        shn.setResult(8000, new Intent().putExtra("TOKEN_RESPONSE", shn.i.e()));
        shn.finish();
    }
}
