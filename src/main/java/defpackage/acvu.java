package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: acvu */
public final class acvu extends acvr {
    public static final Creator CREATOR = new acvt();

    private acvu(acvy acvy, amul amul, byte[] bArr) {
        int i = 9;
        if (!acvy.a(acvy.a, 9)) {
            i = acvy.a(acvy.a, 3) ? 3 : 1;
        }
        super(acvy, i, amul, bArr);
    }

    public final /* bridge */ /* synthetic */ int describeContents() {
        return 0;
    }

    acvu(auko auko) {
        this(new acvy(auko), amul.a(new anyc(auko.d, auko.e)), auko.b.d());
    }

    public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* synthetic */ acvu(acvy acvy, amul amul, byte[] bArr, byte b) {
        this(acvy, amul, bArr);
    }

    acvu(int i, azfa azfa) {
        super(9, azfa, acvr.b, null);
    }
}
