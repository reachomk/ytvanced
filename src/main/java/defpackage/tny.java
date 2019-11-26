package defpackage;

import android.content.Context;

/* renamed from: tny */
public final class tny extends tod implements tnw {
    public tny(Context context) {
        super(new rzi(context));
    }

    public final tnw a(byte[] bArr) {
        rzh rzh = this.a;
        if (rzh instanceof rzi) {
            ((rzi) rzh).c.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
            return this;
        }
        throw new ClassCastException("baseIntentBuilder should be an instance of FixInstrumentIntentBuilder");
    }
}
