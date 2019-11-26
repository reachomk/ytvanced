package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

/* renamed from: qst */
public final class qst extends qou implements ptn {
    public static final Creator CREATOR = new qsw();
    private final int a;
    private int b;
    private Intent c;

    qst(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public qst() {
        this(2, 0, null);
    }

    public final Status a() {
        if (this.b == 0) {
            return Status.a;
        }
        return Status.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.b(parcel, 2, this.b);
        qov.a(parcel, 3, this.c, i);
        qov.a(parcel, a);
    }
}
