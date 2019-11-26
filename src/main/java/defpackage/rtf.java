package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: rtf */
public final class rtf extends qou {
    public static final Creator CREATOR = new rtr();
    private List a = new ArrayList();
    private List b = new ArrayList();
    private List c = new ArrayList();
    private String d;
    private rsu e;
    private boolean f;
    private boolean g;
    private String h;
    private String i;
    private String j;
    private int k;
    private double l;
    private long m;

    public rtf(List list, List list2, List list3, String str, rsu rsu, boolean z, boolean z2, String str2, String str3, String str4, int i, double d, long j) {
        this.c = list3;
        this.a = list;
        this.b = list2;
        this.d = str;
        this.e = rsu;
        this.f = z;
        this.g = z2;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = i;
        this.l = d;
        this.m = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rtf)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        rtf rtf = (rtf) obj;
        return pzj.a(this.a, rtf.a) && pzj.a(null, null) && pzj.a(this.b, rtf.b) && pzj.a(null, null) && pzj.a(this.d, rtf.d) && pzj.a(this.e, rtf.e) && pzj.a(this.c, rtf.c) && pzj.a(Boolean.valueOf(this.f), Boolean.valueOf(rtf.f)) && pzj.a(Boolean.valueOf(this.g), Boolean.valueOf(rtf.g)) && pzj.a(this.h, rtf.h) && pzj.a(this.i, rtf.i) && pzj.a(this.j, rtf.j) && pzj.a(Integer.valueOf(this.k), Integer.valueOf(rtf.k)) && pzj.a(Double.valueOf(this.l), Double.valueOf(rtf.l)) && pzj.a(Long.valueOf(this.m), Long.valueOf(rtf.m));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, this.b, this.c, null, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i, this.j, Integer.valueOf(this.k), Double.valueOf(this.l), Long.valueOf(this.m)});
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("names", this.a);
        a.a("emails", null);
        a.a("photos", this.b);
        a.a("sortedContactMethods", this.c);
        a.a("phones", null);
        a.a("provenanceReference", this.d);
        a.a("metadata", this.e);
        a.a("isStarred", Boolean.valueOf(this.f));
        a.a("sendToVoicemail", Boolean.valueOf(this.g));
        a.a("customRingtone", this.h);
        a.a("lookupKey", this.i);
        a.a("secondaryProvenanceReference", this.j);
        a.a("pinnedPosition", Integer.valueOf(this.k));
        a.a("score", Double.valueOf(this.l));
        a.a("lastUpdatedTimestamp", Long.valueOf(this.m));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 3, Collections.unmodifiableList(this.a));
        qov.b(parcel, 5, Collections.unmodifiableList(this.b));
        qov.b(parcel, 6, this.c);
        qov.a(parcel, 7, this.d);
        qov.a(parcel, 8, this.e, i);
        qov.a(parcel, 9, this.f);
        qov.a(parcel, 10, this.g);
        qov.a(parcel, 11, this.h);
        qov.a(parcel, 12, this.i);
        qov.a(parcel, 13, this.j);
        qov.b(parcel, 14, this.k);
        qov.a(parcel, 15, this.l);
        qov.a(parcel, 16, this.m);
        qov.a(parcel, a);
    }
}
