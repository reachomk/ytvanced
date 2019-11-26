package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pko */
public final class pko extends qou {
    public static final Creator CREATOR = new pnr();
    public final String a;
    public final boolean b;
    public final plh c;
    public final boolean d;
    public final boolean e;
    private final List f;
    private final boolean g;
    private final pjr h;
    private final double i;

    public pko(String str, List list, boolean z, pjr pjr, boolean z2, plh plh, boolean z3, double d, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.a = str;
        int size = list != null ? list.size() : 0;
        this.f = new ArrayList(size);
        if (size > 0) {
            this.f.addAll(list);
        }
        this.g = z;
        if (pjr == null) {
            pjr = new pjr();
        }
        this.h = pjr;
        this.b = z2;
        this.c = plh;
        this.d = z3;
        this.i = d;
        this.e = z4;
    }

    public final List a() {
        return Collections.unmodifiableList(this.f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, a());
        qov.a(parcel, 4, this.g);
        qov.a(parcel, 5, this.h, i);
        qov.a(parcel, 6, this.b);
        qov.a(parcel, 7, this.c, i);
        qov.a(parcel, 8, this.d);
        qov.a(parcel, 9, this.i);
        qov.a(parcel, 10, this.e);
        qov.a(parcel, a);
    }
}
