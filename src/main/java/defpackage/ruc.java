package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: ruc */
final class ruc extends rua {
    private final ptu a;

    public ruc(ptu ptu) {
        this.a = ptu;
    }

    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        run run = null;
        Status status = new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        if (dataHolder != null) {
            run = new run(dataHolder);
        }
        this.a.a(new ruf(status, run));
    }
}
