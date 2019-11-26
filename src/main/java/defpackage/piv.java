package defpackage;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: piv */
public final class piv implements pik {
    private final /* synthetic */ String a;
    private final /* synthetic */ Bundle b;

    public piv(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        Bundle bundle = (Bundle) pih.a(rkb.a(iBinder).a(this.a, this.b));
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new pii(string);
    }
}
