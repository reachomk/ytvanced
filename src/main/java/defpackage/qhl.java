package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qhl */
public final class qhl extends qou {
    public static final Creator CREATOR = new qhr();
    public long a = -1;
    public long b = -1;
    public int c = -1;
    public Bundle d = new Bundle();
    private int e = -1;
    private long f = -1;
    private boolean g = false;
    private int h = -1;
    private boolean i = false;
    private boolean j = false;

    qhl(int i, long j, long j2, long j3, int i2, Bundle bundle, boolean z, int i3, boolean z2, boolean z3) {
        this.e = i;
        this.a = j;
        this.b = j2;
        this.f = j3;
        this.c = i2;
        this.d = bundle;
        this.g = z;
        this.h = i3;
        this.i = z2;
        this.j = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.e);
        qov.a(parcel, 3, this.a);
        qov.a(parcel, 4, this.b);
        qov.a(parcel, 5, this.f);
        qov.b(parcel, 6, this.c);
        qov.a(parcel, 7, this.d);
        qov.a(parcel, 8, this.g);
        qov.b(parcel, 9, this.h);
        qov.a(parcel, 10, this.i);
        qov.a(parcel, 11, this.j);
        qov.a(parcel, i);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append("[\nmLatencyMicros: ");
        stringBuilder.append(this.e);
        stringBuilder.append("\nmDurationMicros: ");
        stringBuilder.append(this.a);
        stringBuilder.append("\nmBytesDownloaded: ");
        stringBuilder.append(this.b);
        stringBuilder.append("\nmBytesUploaded: ");
        stringBuilder.append(this.f);
        stringBuilder.append("\nmMeasurementType: ");
        stringBuilder.append(this.c);
        stringBuilder.append("\nmIsNoConnectivity: ");
        stringBuilder.append(this.g);
        stringBuilder.append("\nmConnectivityType: ");
        stringBuilder.append(this.h);
        stringBuilder.append("\nmIsCaptivePortal: ");
        stringBuilder.append(this.i);
        stringBuilder.append("\nmHighPriority: ");
        stringBuilder.append(this.j);
        String str = "\n";
        stringBuilder.append(str);
        for (String str2 : this.d.keySet()) {
            stringBuilder.append("custom param: ");
            stringBuilder.append(str2);
            stringBuilder.append("/");
            stringBuilder.append(this.d.getString(str2));
            stringBuilder.append(str);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    static {
        qho qho = new qho();
    }
}
