package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: aahd */
final class aahd implements Creator {
    aahd() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aaha[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        Uri uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        String readString = parcel.readString();
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, Uri.CREATOR);
        return new aaha(readInt, uri, readString, Collections.unmodifiableList(arrayList));
    }
}
