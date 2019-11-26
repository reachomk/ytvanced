package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: rzi */
public final class rzi extends rzh {
    public rzi(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_FIX_INSTRUMENT", "flow_fix_instrument");
    }

    public final Intent a(Intent intent) {
        byte[] byteArrayExtra = this.c.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        byte[] byteArrayExtra2 = this.c.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        boolean z = true;
        Object obj = (byteArrayExtra == null || byteArrayExtra.length <= 0) ? null : 1;
        Object obj2 = (byteArrayExtra2 == null || byteArrayExtra2.length <= 0) ? null : 1;
        boolean z2 = obj == null || obj2 == null;
        pzr.b(z2, "Only one of encrypted parameters or initialization token should be set");
        if (obj == null && obj2 == null) {
            z = false;
        }
        pzr.b(z, "Either encrypted parameters or initialization token should be set");
        return intent;
    }
}
