package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: rzj */
public final class rzj extends rzh {
    public rzj(Context context) {
        super(context, "com.google.android.gms.wallet.ACTION_CHECKOUT", "flow_checkout", false);
    }

    public final Intent a(Intent intent) {
        boolean z = true;
        if (this.c.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS") == null && this.c.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN") == null) {
            z = false;
        }
        pzr.b(z, "Either buyflow params or initialization token is required");
        return intent;
    }
}
