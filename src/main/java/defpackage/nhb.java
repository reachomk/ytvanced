package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: nhb */
public final class nhb implements ngn {
    public static final Creator CREATOR = new nhe();
    public final int a;
    public final String b;
    public final long c;
    public final long d;

    public nhb(int i, String str, long j, long j2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nhb) {
            nhb nhb = (nhb) obj;
            if (this.a == nhb.a && TextUtils.equals(this.b, nhb.b) && this.c == nhb.c && this.d == nhb.d) {
                return true;
            }
        }
        return false;
    }

    public final ngq a() {
        return ngq.PLAYBACK_EVENT_DATA;
    }

    public final String toString() {
        String obj = super.toString();
        int i = this.a;
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 86) + String.valueOf(str).length());
        stringBuilder.append(obj);
        stringBuilder.append(" TYPE: ");
        stringBuilder.append(i);
        stringBuilder.append(" ID: ");
        stringBuilder.append(str);
        stringBuilder.append(" TIMESTAMP: ");
        stringBuilder.append(j);
        stringBuilder.append(" DURATION: ");
        stringBuilder.append(j2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }

    /* synthetic */ nhb(Parcel parcel) {
        this(parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readLong());
    }
}
