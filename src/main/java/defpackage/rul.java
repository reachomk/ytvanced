package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rul */
final class rul implements Creator {
    rul() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new rtz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        int readInt2 = parcel.readInt();
        Cursor matrixCursor = new MatrixCursor(strArr);
        int i = 0;
        if (readInt == 0 && readInt2 == 0) {
            matrixCursor = null;
        } else {
            while (i < readInt2) {
                matrixCursor.addRow(parcel.readArray(Object.class.getClassLoader()));
                i++;
            }
        }
        return new rtz(matrixCursor);
    }
}
