package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ammd */
public abstract class ammd extends dhx implements amme {
    public ammd() {
        super("com.google.android.youtube.player.internal.IYouTubeService");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder b;
        if (i == 1) {
            b = b();
            parcel2.writeNoException();
            parcel2.writeStrongBinder(b);
        } else if (i == 2) {
            amma amlz;
            b = parcel.readStrongBinder();
            if (b != null) {
                IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                amlz = queryLocalInterface instanceof amma ? (amma) queryLocalInterface : new amlz(b);
            } else {
                amlz = null;
            }
            IInterface a = a(amlz);
            parcel2.writeNoException();
            dhw.a(parcel2, a);
        } else if (i == 3) {
            a(dhw.a(parcel));
            parcel2.writeNoException();
        } else if (i != 4) {
            return false;
        } else {
            b = c();
            parcel2.writeNoException();
            parcel2.writeStrongBinder(b);
        }
        return true;
    }
}
