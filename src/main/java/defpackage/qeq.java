package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;

/* renamed from: qeq */
public final class qeq implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qdz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        String str2 = str;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) qot.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c == 3) {
                str = qot.j(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                str2 = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new qdz(parcelFileDescriptor, str, str2);
    }
}
