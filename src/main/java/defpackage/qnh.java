package defpackage;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: qnh */
public final class qnh {
    public static final pon a = new pon("CastDynamiteModule");

    public static poa a(Service service, qcs qcs, qcs qcs2) {
        try {
            return qnh.a(service.getApplicationContext()).a(qct.a((Object) service), qcs, qcs2);
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "newReconnectionServiceImpl", qnm.class.getSimpleName());
            return null;
        }
    }

    public static qnz a(Context context, AsyncTask asyncTask, qob qob, int i, int i2) {
        try {
            return qnh.a(context.getApplicationContext()).a(qct.a((Object) asyncTask), qob, i, i2);
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "newFetchBitmapTaskImpl", qnm.class.getSimpleName());
            return null;
        }
    }

    public static qnm a(Context context) {
        try {
            IBinder a = DynamiteModule.a(context, DynamiteModule.a, "com.google.android.gms.cast.framework.dynamite").a("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof qnm) {
                return (qnm) queryLocalInterface;
            }
            return new qnl(a);
        } catch (qda e) {
            throw new RuntimeException(e);
        }
    }
}
