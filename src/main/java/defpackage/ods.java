package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: ods */
public final class ods implements Parcelable {
    public static final Creator CREATOR = new odv();
    public final UUID a;
    public final String b;
    public final String c;
    public final byte[] d;
    private int e;

    public ods(UUID uuid, String str, byte[] bArr) {
        this(uuid, null, str, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public ods(UUID uuid, String str, String str2, byte[] bArr) {
        this.a = (UUID) oxz.a((Object) uuid);
        this.b = str;
        this.c = (String) oxz.a((Object) str2);
        this.d = bArr;
    }

    ods(Parcel parcel) {
        this.a = new UUID(parcel.readLong(), parcel.readLong());
        this.b = parcel.readString();
        this.c = (String) ozp.a(parcel.readString());
        this.d = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        return nyr.a.equals(this.a) || uuid.equals(this.a);
    }

    public final boolean a() {
        return this.d != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ods)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ods ods = (ods) obj;
        return ozp.a(this.b, ods.b) && ozp.a(this.c, ods.c) && ozp.a(this.a, ods.a) && Arrays.equals(this.d, ods.d);
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        i = this.a.hashCode() * 31;
        String str = this.b;
        i = ((((i + (str != null ? str.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d);
        this.e = i;
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a.getMostSignificantBits());
        parcel.writeLong(this.a.getLeastSignificantBits());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }
}
