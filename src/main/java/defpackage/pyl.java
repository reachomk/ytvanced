package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: pyl */
public final class pyl extends pza {
    private pyd a;
    private final int b;

    public pyl(pyd pyd, int i) {
        this.a = pyd;
        this.b = i;
    }

    public final void a() {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        pzr.a(this.a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.a(i, iBinder, bundle, this.b);
        this.a = null;
    }

    public final void a(int i, IBinder iBinder, pyu pyu) {
        pzr.a(this.a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        pzr.a((Object) pyu);
        this.a.K = pyu;
        a(i, iBinder, pyu.a);
    }
}
