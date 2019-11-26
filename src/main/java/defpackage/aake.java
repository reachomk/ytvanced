package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aake */
final class aake implements Creator {
    aake() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aakf[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        anvu anvu = (anvu) parcel.readSerializable();
        int readInt = parcel.readInt();
        awej awej = (awej) awek.d.createBuilder();
        awej.copyOnWrite();
        awek awek = (awek) awej.instance;
        if (anvu != null) {
            awek.a |= 1;
            awek.b = anvu;
            awej.copyOnWrite();
            awek awek2 = (awek) awej.instance;
            awek2.a |= 2;
            awek2.c = readInt;
            return new aakf((awek) ((anxl) awej.build()));
        }
        throw new NullPointerException();
    }
}
