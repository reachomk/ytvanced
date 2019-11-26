package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.firebase.jobdispatcher.GooglePlayReceiver;

/* renamed from: dev */
final class dev {
    public final der a;
    public final long b;
    private final def c;

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        try {
            this.c.a(GooglePlayReceiver.a.a(this.a, new Bundle()), i);
        } catch (RemoteException e) {
            Log.e("FJD.JobService", "Failed to send result to driver", e);
        }
    }

    /* synthetic */ dev(der der, def def, long j) {
        this.a = der;
        this.c = def;
        this.b = j;
    }
}
