package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* renamed from: alu */
public final class alu extends BaseSavedState {
    public static final Creator CREATOR = new alt();
    public boolean a;

    public alu(Parcelable parcelable) {
        super(parcelable);
    }

    alu(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != (byte) 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a);
    }
}
