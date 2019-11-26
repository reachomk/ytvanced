package defpackage;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* renamed from: rsf */
public final class rsf implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        List list = LocationResult.a;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                qot.b(parcel, readInt);
            } else {
                list = qot.c(parcel, readInt, Location.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new LocationResult(list);
    }
}
