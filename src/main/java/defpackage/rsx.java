package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rsx */
public final class rsx extends qou {
    public static final Creator CREATOR = new rtj();
    private rtf a;

    public rsx(rtf rtf) {
        this.a = rtf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a, i);
        qov.a(parcel, a);
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("person", this.a);
        return a.toString();
    }
}
