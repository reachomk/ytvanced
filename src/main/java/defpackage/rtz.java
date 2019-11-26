package defpackage;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: rtz */
public final class rtz implements Parcelable {
    public static final Creator CREATOR = new rul();
    private final Cursor a;
    private final int b;

    public rtz(Cursor cursor) {
        this.a = cursor;
        this.b = cursor != null ? cursor.getCount() : 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Cursor cursor = this.a;
        if (cursor != null) {
            try {
                i = cursor.getColumnCount();
                parcel.writeInt(i);
                parcel.writeStringArray(this.a.getColumnNames());
                parcel.writeInt(this.b);
                this.a.moveToPosition(-1);
                while (this.a.moveToNext()) {
                    Object[] objArr = new Object[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        int type = this.a.getType(i2);
                        if (type == 0) {
                            objArr[i2] = null;
                        } else if (type == 1) {
                            objArr[i2] = Integer.valueOf(this.a.getInt(i2));
                        } else if (type == 2) {
                            objArr[i2] = Float.valueOf(this.a.getFloat(i2));
                        } else if (type == 3) {
                            objArr[i2] = this.a.getString(i2);
                        } else if (type == 4) {
                            objArr[i2] = this.a.getBlob(i2);
                        }
                    }
                    parcel.writeArray(objArr);
                }
            } finally {
                this.a.close();
            }
        } else {
            parcel.writeInt(0);
            parcel.writeStringArray(new String[0]);
            parcel.writeInt(0);
        }
    }
}
