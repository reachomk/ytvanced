package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Toast;
import com.google.android.gms.cast.framework.R;

/* renamed from: plb */
public final class plb {
    public static final pon a = new pon("SessionManager");
    public final poe b;
    private final Context c;

    public plb(poe poe, Context context) {
        this.b = poe;
        this.c = context;
    }

    public final pla a() {
        pzr.b("Must be called from the main thread.");
        try {
            return (pla) qct.a(this.b.a());
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "getWrappedCurrentSession", poe.class.getSimpleName());
            return null;
        }
    }

    public final void a(boolean z) {
        pzr.b("Must be called from the main thread.");
        try {
            this.b.a(z);
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "endCurrentSession", poe.class.getSimpleName());
        }
    }

    public final void a(ple ple, Class cls) {
        pzr.a((Object) ple);
        pzr.a((Object) cls);
        pzr.b("Must be called from the main thread.");
        try {
            this.b.a(new pno(ple, cls));
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "addSessionManagerListener", poe.class.getSimpleName());
        }
    }

    public final void a(Intent intent) {
        String str = "CAST_INTENT_TO_CAST_ROUTE_ID_KEY";
        try {
            Bundle extras = intent.getExtras();
            if (!(extras == null || extras.getString(str) == null)) {
                String string = extras.getString("CAST_INTENT_TO_CAST_DEVICE_NAME_KEY");
                if (!extras.getBoolean("CAST_INTENT_TO_CAST_NO_TOAST_KEY")) {
                    Toast.makeText(this.c, this.c.getString(R.string.cast_connecting_to_device, new Object[]{string}), 0).show();
                }
                this.b.a(new Bundle(extras));
                intent.removeExtra(str);
            }
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "startSession", poe.class.getSimpleName());
        }
    }
}
