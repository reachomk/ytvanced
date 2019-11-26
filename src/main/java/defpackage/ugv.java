package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* renamed from: ugv */
public final class ugv extends BaseSavedState {
    public static final Creator CREATOR = new ugu();
    public final ugo a;
    private final float[] b;

    public ugv(Parcelable parcelable, ugo ugo, float[] fArr) {
        super(parcelable);
        this.a = ugo;
        this.b = fArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a.toString());
        parcel.writeFloatArray(this.b);
    }

    /* synthetic */ ugv(Parcel parcel) {
        super(parcel);
        this.a = ugo.a(parcel.readString());
        this.b = parcel.createFloatArray();
    }
}
