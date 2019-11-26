package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import defpackage.pxy;
import defpackage.pxz;
import defpackage.qou;
import defpackage.qov;
import java.io.Closeable;

public final class DataHolder extends qou implements Closeable {
    public static final Creator CREATOR = new pxy();
    public final String[] a;
    public Bundle b;
    public final CursorWindow[] c;
    public int[] d;
    public int e;
    private final int f;
    private final int g;
    private final Bundle h;
    private boolean i = false;
    private boolean j = true;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f = i;
        this.a = strArr;
        this.c = cursorWindowArr;
        this.g = i2;
        this.h = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.a);
        qov.a(parcel, 2, this.c, i);
        qov.b(parcel, 3, this.g);
        qov.a(parcel, 4, this.h);
        qov.b(parcel, 1000, this.f);
        qov.a(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.c;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        try {
            if (this.j && this.c.length > 0 && !a()) {
                close();
                String obj = toString();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 178);
                stringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                stringBuilder.append(obj);
                stringBuilder.append(")");
                Log.e("DataBuffer", stringBuilder.toString());
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    static {
        pxz pxz = new pxz(new String[0]);
    }
}
