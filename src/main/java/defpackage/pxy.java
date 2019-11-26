package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: pxy */
public final class pxy implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = strArr;
        Bundle bundle = cursorWindowArr;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                strArr = qot.q(parcel, readInt);
            } else if (c == 2) {
                cursorWindowArr = (CursorWindow[]) qot.b(parcel, readInt, CursorWindow.CREATOR);
            } else if (c == 3) {
                i3 = qot.d(parcel, readInt);
            } else if (c == 4) {
                bundle = qot.l(parcel, readInt);
            } else if (c != 1000) {
                qot.b(parcel, readInt);
            } else {
                i2 = qot.d(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i3, bundle);
        dataHolder.b = new Bundle();
        a = 0;
        while (true) {
            String[] strArr2 = dataHolder.a;
            if (a >= strArr2.length) {
                break;
            }
            dataHolder.b.putInt(strArr2[a], a);
            a++;
        }
        dataHolder.d = new int[dataHolder.c.length];
        a = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = dataHolder.c;
            if (i < cursorWindowArr2.length) {
                dataHolder.d[i] = a;
                a += dataHolder.c[i].getNumRows() - (a - cursorWindowArr2[i].getStartPosition());
                i++;
            } else {
                dataHolder.e = a;
                return dataHolder;
            }
        }
    }
}
