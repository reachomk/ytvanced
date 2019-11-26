package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import defpackage.bcie;

public class UnguessableToken implements Parcelable {
    public static final Creator CREATOR = new bcie();
    private final long a;
    private final long b;

    private UnguessableToken(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final int describeContents() {
        return 0;
    }

    private static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    public long getHighForSerialization() {
        return this.a;
    }

    public long getLowForSerialization() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken unguessableToken = (UnguessableToken) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return unguessableToken;
    }

    public /* synthetic */ UnguessableToken(long j, long j2, bcie bcie) {
        this(j, j2);
    }
}
