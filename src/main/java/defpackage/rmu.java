package defpackage;

import android.os.RemoteException;

@qlp
/* renamed from: rmu */
public final class rmu extends pbm {
    public rmu(rms rms) {
        try {
            rms.a();
        } catch (RemoteException e) {
            qml.a("", e);
        }
    }
}
