package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import com.google.android.libraries.youtube.edit.geo.EditLocation;

/* renamed from: zqk */
public final class zqk extends BaseSavedState {
    public static final Creator CREATOR = new zqn();
    public zrb a;
    public auka b;

    public zqk(Parcelable parcelable) {
        super(parcelable);
    }

    public zqk(Parcel parcel) {
        super(parcel);
        this.a = (zrb) parcel.readParcelable(EditLocation.class.getClassLoader());
        this.b = (auka) ((ajrb) parcel.readParcelable(ajrb.class.getClassLoader())).a(auka.i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(new ajrb(this.b), 0);
    }
}
