package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: qfv */
public final class qfv extends qou {
    public static final Creator CREATOR = new qhh();
    public GoogleHelp a;
    private final String b;
    private final String c;

    qfv(GoogleHelp googleHelp, String str, String str2) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.a, i);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, a);
    }
}
