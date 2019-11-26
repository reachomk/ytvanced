package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: anmu */
public final class anmu extends qou {
    public static final Creator CREATOR = new anmp();
    public int a = 0;
    private final boolean b;
    private final String c;
    private final String d;
    private final byte[] e;
    private final boolean f;

    anmu(int i, boolean z, String str, String str2, byte[] bArr, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = z2;
    }

    public anmu(boolean z, String str) {
        this.b = z;
        this.c = null;
        this.d = str;
        this.e = null;
        this.f = false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 4, this.d);
        qov.a(parcel, 5, this.e);
        qov.a(parcel, 6, this.f);
        qov.a(parcel, i);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MetadataImpl { { eventStatus: '");
        stringBuilder.append(this.a);
        stringBuilder.append("' } { uploadable: '");
        stringBuilder.append(this.b);
        String str = "' } ";
        stringBuilder.append(str);
        if (this.c != null) {
            stringBuilder.append("{ completionToken: '");
            stringBuilder.append(this.c);
            stringBuilder.append(str);
        }
        if (this.d != null) {
            stringBuilder.append("{ accountName: '");
            stringBuilder.append(this.d);
            stringBuilder.append(str);
        }
        if (this.e != null) {
            stringBuilder.append("{ ssbContext: [ ");
            for (byte b : this.e) {
                stringBuilder.append("0x");
                stringBuilder.append(Integer.toHexString(b));
                stringBuilder.append(" ");
            }
            stringBuilder.append("] } ");
        }
        stringBuilder.append("{ contextOnly: '");
        stringBuilder.append(this.f);
        stringBuilder.append("' } }");
        return stringBuilder.toString();
    }
}
