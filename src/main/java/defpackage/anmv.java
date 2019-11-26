package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: anmv */
public final class anmv extends qou implements anlp {
    public static final Creator CREATOR = new anmx();
    public final anmu a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Bundle g;

    public anmv(String str, String str2, String str3, String str4, anmu anmu, String str5, Bundle bundle) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.a = anmu;
        this.f = str5;
        if (bundle != null) {
            this.g = bundle;
        } else {
            this.g = Bundle.EMPTY;
        }
        this.g.setClassLoader(getClass().getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.b);
        qov.a(parcel, 2, this.c);
        qov.a(parcel, 3, this.d);
        qov.a(parcel, 4, this.e);
        qov.a(parcel, 5, this.a, i);
        qov.a(parcel, 6, this.f);
        qov.a(parcel, 7, this.g);
        qov.a(parcel, a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActionImpl { { actionType: '");
        stringBuilder.append(this.b);
        stringBuilder.append("' } { objectName: '");
        stringBuilder.append(this.c);
        stringBuilder.append("' } { objectUrl: '");
        stringBuilder.append(this.d);
        String str = "' } ";
        stringBuilder.append(str);
        if (this.e != null) {
            stringBuilder.append("{ objectSameAs: '");
            stringBuilder.append(this.e);
            stringBuilder.append(str);
        }
        if (this.a != null) {
            stringBuilder.append("{ metadata: '");
            stringBuilder.append(this.a.toString());
            stringBuilder.append(str);
        }
        if (this.f != null) {
            stringBuilder.append("{ actionStatus: '");
            stringBuilder.append(this.f);
            stringBuilder.append(str);
        }
        if (!this.g.isEmpty()) {
            stringBuilder.append("{ ");
            stringBuilder.append(this.g);
            stringBuilder.append(" } ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
