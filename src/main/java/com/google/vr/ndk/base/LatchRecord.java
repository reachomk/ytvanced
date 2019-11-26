package com.google.vr.ndk.base;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class LatchRecord implements Parcelable {
    public static final Creator CREATOR = new Creator() {
        public LatchRecord createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            if (LatchRecord.instance.serializedLatchRecord == null || LatchRecord.instance.serializedLatchRecord.length != readInt) {
                LatchRecord.instance.serializedLatchRecord = new byte[readInt];
            }
            parcel.readByteArray(LatchRecord.instance.serializedLatchRecord);
            return LatchRecord.instance;
        }

        public LatchRecord[] newArray(int i) {
            return new LatchRecord[i];
        }
    };
    public static LatchRecord instance = new LatchRecord();
    public byte[] serializedLatchRecord;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.serializedLatchRecord.length);
        parcel.writeByteArray(this.serializedLatchRecord);
    }
}
