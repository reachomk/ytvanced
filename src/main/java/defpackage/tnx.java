package defpackage;

import android.content.Context;

/* renamed from: tnx */
public final class tnx extends tod implements tnv {
    public tnx(Context context) {
        super(new rzj(context));
    }

    public final tnv a(byte[] bArr) {
        rzh rzh = this.a;
        if (rzh instanceof rzj) {
            ((rzj) rzh).c.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
            return this;
        }
        throw new ClassCastException("baseIntentBuilder should be an instance of BuyFlowIntentBuilder");
    }

    public final tnv b(byte[] bArr) {
        rzh rzh = this.a;
        if (rzh instanceof rzj) {
            ((rzj) rzh).c.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
            return this;
        }
        throw new ClassCastException("baseIntentBuilder should be an instance of BuyFlowIntentBuilder");
    }
}
