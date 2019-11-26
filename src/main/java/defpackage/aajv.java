package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aajv */
final class aajv implements Creator {
    aajv() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aajs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        aten aten;
        try {
            aten = (aten) xup.a(parcel, aten.j);
        } catch (IllegalArgumentException e) {
            xtl.a("Error reading streaming data", e);
            aten = null;
        }
        if (aten == null) {
            aten = aten.j;
        }
        aten aten2 = aten;
        aajo aajo = (aajo) aajo.CREATOR.createFromParcel(parcel);
        String readString = parcel.readString();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        int readInt = parcel.readInt();
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        return new aajs(aten2, readString, readLong, readLong2, readInt, aajo, readString2, parcel.readInt(), xup.a(parcel));
    }
}
