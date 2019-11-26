package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity;
import java.util.List;

/* renamed from: rva */
public final class rva implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new FetchBackUpDeviceContactInfoResponseEntity[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                qot.b(parcel, readInt);
            } else {
                list = qot.c(parcel, readInt, ruv.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new FetchBackUpDeviceContactInfoResponseEntity(list);
    }
}
