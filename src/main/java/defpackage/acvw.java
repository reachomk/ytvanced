package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: acvw */
public final class acvw extends acvr {
    public static final Creator CREATOR = new acvv();

    private acvw(acvy acvy, amul amul, byte[] bArr) {
        int i = 5;
        if (!acvy.a(acvy.a, 5)) {
            i = acvy.a(acvy.a, 2) ? 2 : 1;
        }
        super(acvy, i, amul, bArr);
    }

    public final /* bridge */ /* synthetic */ int describeContents() {
        return 0;
    }

    acvw(auko auko) {
        this(new acvy(auko), amul.a(new anyc(auko.d, auko.e)), auko.b.d());
    }

    public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* synthetic */ acvw(acvy acvy, amul amul, byte[] bArr, byte b) {
        this(acvy, amul, bArr);
    }

    acvw(int i, azfa azfa, atst atst) {
        super(i, azfa, acvr.b, atst);
    }
}
