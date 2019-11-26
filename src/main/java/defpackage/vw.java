package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.List;

/* renamed from: vw */
public abstract class vw extends Binder implements vx {
    public vw() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = "android.support.v4.media.session.IMediaControllerCallback";
        if (i != 1598968902) {
            Bundle bundle = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface(str);
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    a(readString, bundle);
                    return true;
                case 2:
                    parcel.enforceInterface(str);
                    a();
                    return true;
                case 3:
                    xs xsVar;
                    parcel.enforceInterface(str);
                    if (parcel.readInt() != 0) {
                        xsVar = (xs) xs.CREATOR.createFromParcel(parcel);
                    }
                    a(xsVar);
                    return true;
                case 4:
                    vj vjVar;
                    parcel.enforceInterface(str);
                    if (parcel.readInt() != 0) {
                        vjVar = (vj) vj.CREATOR.createFromParcel(parcel);
                    }
                    a(vjVar);
                    return true;
                case 5:
                    parcel.enforceInterface(str);
                    a((List) parcel.createTypedArrayList(xk.CREATOR));
                    return true;
                case 6:
                    CharSequence charSequence;
                    parcel.enforceInterface(str);
                    if (parcel.readInt() != 0) {
                        charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                    a(charSequence);
                    return true;
                case 7:
                    parcel.enforceInterface(str);
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    a(bundle);
                    return true;
                case 8:
                    xq xqVar;
                    parcel.enforceInterface(str);
                    if (parcel.readInt() != 0) {
                        xqVar = (xq) xq.CREATOR.createFromParcel(parcel);
                    }
                    a(xqVar);
                    return true;
                case 9:
                    parcel.enforceInterface(str);
                    a(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface(str);
                    parcel.readInt();
                    b();
                    return true;
                case 11:
                    parcel.enforceInterface(str);
                    a(parcel.readInt() != 0);
                    return true;
                case 12:
                    parcel.enforceInterface(str);
                    b(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface(str);
                    c();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString(str);
        return true;
    }
}
