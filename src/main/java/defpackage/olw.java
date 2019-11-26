package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: olw */
public final class olw implements oll {
    public static final Creator CREATOR = new olz();
    private final String a;
    private final String b;

    public olw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    olw(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            olw olw = (olw) obj;
            return ozp.a(this.a, olw.a) && ozp.a(this.b, olw.b);
        }
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(str2).length());
        stringBuilder.append("ICY: title=\"");
        stringBuilder.append(str);
        stringBuilder.append("\", url=\"");
        stringBuilder.append(str2);
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
