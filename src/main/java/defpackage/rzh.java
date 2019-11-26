package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: rzh */
public class rzh {
    public rzo a;
    public rzm b;
    public Intent c;
    public final boolean d;
    private Bundle e;

    public rzh(Context context, String str, String str2) {
        this(context, str, str2, true);
    }

    public Intent a(Intent intent) {
        return intent;
    }

    public rzh(Context context, String str, String str2, boolean z) {
        this.c = new Intent();
        this.c.setPackage("com.google.android.gms");
        this.c.setAction(str);
        this.e = new Bundle();
        rzm a = rzk.a();
        a.a.c = this.e;
        this.b = a;
        rzo a2 = BuyFlowConfig.a();
        String packageName = context.getPackageName();
        BuyFlowConfig buyFlowConfig = a2.a;
        buyFlowConfig.c = packageName;
        buyFlowConfig.d = str2;
        this.a = a2;
        this.d = z;
    }
}
