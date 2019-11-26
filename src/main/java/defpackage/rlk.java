package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: rlk */
public abstract class rlk {
    private static final rmm a;

    rlk() {
    }

    public abstract Object a();

    public abstract Object a(rmm rmm);

    public abstract Object b();

    private final Object c() {
        rmm rmm = a;
        if (rmm == null) {
            qml.b("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return a(rmm);
        } catch (RemoteException e) {
            qml.b("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final Object d() {
        try {
            return b();
        } catch (RemoteException e) {
            qml.b("Cannot invoke remote loader.", e);
            return null;
        }
    }

    public final Object a(Context context, boolean z) {
        Object c;
        if (!z) {
            rlj.a();
            if (!qmh.b(context)) {
                z = true;
            }
        }
        String str = "com.google.android.gms.ads.dynamite";
        if (DynamiteModule.a(context, str) > DynamiteModule.a(context, str, false)) {
            z = true;
        }
        roe.a(context);
        if (!((Boolean) rlj.d().a(roe.r)).booleanValue() && r6) {
            c = c();
            if (c == null) {
                c = d();
            }
        } else {
            c = d();
            if (c == null) {
                c = c();
            }
        }
        return c == null ? a() : c;
    }

    static {
        rmm rmm = null;
        try {
            Object newInstance = rle.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    rmm = queryLocalInterface instanceof rmm ? (rmm) queryLocalInterface : new rml(iBinder);
                }
            } else {
                qml.b("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            qml.b("Failed to instantiate ClientApi class.");
        }
        a = rmm;
    }
}
