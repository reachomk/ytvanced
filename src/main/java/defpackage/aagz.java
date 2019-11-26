package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aagz */
final class aagz implements Creator {
    aagz() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aagw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, aaha.CREATOR);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        parcel.readTypedList(arrayList2, aahi.CREATOR);
        return new aagw(readInt, unmodifiableList, Collections.unmodifiableList(arrayList2), (aahe) parcel.readParcelable(aahe.class.getClassLoader()));
    }
}
