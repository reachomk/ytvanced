package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* renamed from: hfb */
public final class hfb extends BaseSavedState {
    public static final Creator CREATOR = new hfa();
    public boolean a;

    public hfb(Parcel parcel) {
        super(parcel);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.a = z;
    }

    public hfb(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
