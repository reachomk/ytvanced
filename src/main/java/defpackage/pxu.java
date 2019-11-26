package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;

/* renamed from: pxu */
public final class pxu implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) qot.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                i2 = qot.d(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new BitmapTeleporter(i, parcelFileDescriptor, i2);
    }
}
