package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: rtq */
public final class rtq implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rte[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        AvatarReference avatarReference = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 3) {
                qot.b(parcel, readInt);
            } else {
                avatarReference = (AvatarReference) qot.a(parcel, readInt, AvatarReference.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new rte(avatarReference);
    }
}
