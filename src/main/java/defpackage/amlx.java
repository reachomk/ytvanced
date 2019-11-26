package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: amlx */
public abstract class amlx extends dhx implements amly {
    public amlx() {
        super("com.google.android.youtube.player.internal.IServiceBroker");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        amlg amlf;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
            amlf = queryLocalInterface instanceof amlg ? (amlg) queryLocalInterface : new amlf(readStrongBinder);
        } else {
            amlf = null;
        }
        amlg amlg = amlf;
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        dhw.a(parcel, Bundle.CREATOR);
        a(amlg, readInt, readString, readString2, readString3);
        parcel2.writeNoException();
        return true;
    }
}
