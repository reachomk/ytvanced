package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

@qlp
/* renamed from: rol */
public final class rol extends pcd {
    private final roj a;
    private final List b = new ArrayList();

    public rol(roj roj) {
        String str = "";
        this.a = roj;
        try {
            this.a.a();
        } catch (RemoteException e) {
            qml.a(str, e);
        }
        try {
            for (Object next : roj.b()) {
                roo roo = null;
                if (next instanceof IBinder) {
                    IBinder iBinder = (IBinder) next;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        roo = queryLocalInterface instanceof roo ? (roo) queryLocalInterface : new roq(iBinder);
                    }
                }
                if (roo != null) {
                    this.b.add(new rop(roo));
                }
            }
        } catch (RemoteException e2) {
            qml.a(str, e2);
        }
    }
}
