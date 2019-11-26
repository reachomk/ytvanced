package defpackage;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.UUID;

/* renamed from: tod */
public class tod extends tob {
    public final rzh a;

    public tod(rzh rzh) {
        this.a = rzh;
    }

    public final tnr a(Account account) {
        this.a.b.a.b = account;
        return this;
    }

    public final tnr a() {
        this.a.b.a.a = 1;
        return this;
    }

    public final tnr a(int i) {
        this.a.b.a.d = i;
        return this;
    }

    public final tnr a(tnt tnt) {
        if (tnt instanceof tog) {
            this.a.b.a.e = ((tog) tnt).a;
            return this;
        }
        throw new IllegalArgumentException("GcoreWalletCustomTheme is invalid.");
    }

    public final Intent b() {
        rzh rzh = this.a;
        rzo rzo = rzh.a;
        rzk rzk = rzh.b.a;
        BuyFlowConfig buyFlowConfig = rzo.a;
        buyFlowConfig.b = rzk;
        if (buyFlowConfig.a == null) {
            buyFlowConfig.a = UUID.randomUUID().toString();
        }
        BuyFlowConfig buyFlowConfig2 = rzo.a;
        rzh.c.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig2);
        if (rzh.d) {
            Object obj = buyFlowConfig2.b.b;
            pzr.a(obj, (Object) "Buyer account is required");
            rzh.c.putExtra("com.google.android.gms.wallet.account", obj);
        }
        return rzh.a(rzh.c);
    }
}
