package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: phe */
public final class phe extends qou {
    public static final Creator CREATOR = new pia();
    private final String a;
    private final String b;
    private final String c;

    public phe(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String toString() {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, i);
    }
}
