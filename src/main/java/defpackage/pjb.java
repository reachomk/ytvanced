package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: pjb */
public final class pjb extends qou {
    public static final Creator CREATOR = new pqv();
    public String a;
    private String b;
    private final List c;
    private final List d;
    private String e;
    private Uri f;

    pjb(String str, String str2, List list, List list2, String str3, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = str3;
        this.f = uri;
    }

    private pjb() {
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("applicationId: ");
        stringBuilder.append(this.a);
        stringBuilder.append(", name: ");
        stringBuilder.append(this.b);
        stringBuilder.append(", images.count: ");
        List list = this.c;
        int i = 0;
        stringBuilder.append(list != null ? list.size() : 0);
        stringBuilder.append(", namespaces.count: ");
        list = this.d;
        if (list != null) {
            i = list.size();
        }
        stringBuilder.append(i);
        stringBuilder.append(", senderAppIdentifier: ");
        stringBuilder.append(this.e);
        stringBuilder.append(", senderAppLaunchUrl: ");
        stringBuilder.append(this.f);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.b(parcel, 4, this.c);
        qov.a(parcel, 5, Collections.unmodifiableList(this.d));
        qov.a(parcel, 6, this.e);
        qov.a(parcel, 7, this.f, i);
        qov.a(parcel, a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pjb) {
            pjb pjb = (pjb) obj;
            return ppj.a(this.a, pjb.a) && ppj.a(this.c, pjb.c) && ppj.a(this.b, pjb.b) && ppj.a(this.d, pjb.d) && ppj.a(this.e, pjb.e) && ppj.a(this.f, pjb.f);
        }
    }
}
