package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: rrg */
public final class rrg implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rrh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        List list = rrh.a;
        LocationRequest locationRequest = null;
        String str = locationRequest;
        String str2 = str;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                switch (c) {
                    case 5:
                        list = qot.c(parcel, readInt, pyq.CREATOR);
                        break;
                    case 6:
                        str = qot.j(parcel, readInt);
                        break;
                    case 7:
                        z = qot.c(parcel, readInt);
                        break;
                    case 8:
                        z2 = qot.c(parcel, readInt);
                        break;
                    case 9:
                        z3 = qot.c(parcel, readInt);
                        break;
                    case 10:
                        str2 = qot.j(parcel, readInt);
                        break;
                    default:
                        qot.b(parcel, readInt);
                        break;
                }
            }
            locationRequest = (LocationRequest) qot.a(parcel, readInt, LocationRequest.CREATOR);
        }
        qot.s(parcel, a);
        return new rrh(locationRequest, list, str, z, z2, z3, str2);
    }
}
