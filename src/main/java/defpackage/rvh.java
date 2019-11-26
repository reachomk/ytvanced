package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rvh */
public final class rvh extends qou implements Parcelable {
    public static final Creator CREATOR = new rve();
    private final String a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;

    public rvh(String str, List list, List list2, List list3, List list4, List list5) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list;
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        if (this.g == null) {
            list = this.b;
            if (list != null) {
                this.g = new ArrayList(list.size());
                for (rvd add : this.b) {
                    this.g.add(add);
                }
            }
        }
        qov.b(parcel, 4, this.g);
        if (this.h == null) {
            list = this.c;
            if (list != null) {
                this.h = new ArrayList(list.size());
                for (rvn add2 : this.c) {
                    this.h.add(add2);
                }
            }
        }
        qov.b(parcel, 5, this.h);
        if (this.k == null) {
            list = this.f;
            if (list != null) {
                this.k = new ArrayList(list.size());
                for (ruu add3 : this.f) {
                    this.k.add(add3);
                }
            }
        }
        qov.b(parcel, 9, this.k);
        if (this.i == null) {
            list = this.d;
            if (list != null) {
                this.i = new ArrayList(list.size());
                for (ruz add4 : this.d) {
                    this.i.add(add4);
                }
            }
        }
        qov.b(parcel, 11, this.i);
        if (this.j == null) {
            list = this.e;
            if (list != null) {
                this.j = new ArrayList(list.size());
                for (rvi add5 : this.e) {
                    this.j.add(add5);
                }
            }
        }
        qov.b(parcel, 13, this.j);
        qov.a(parcel, i);
    }
}
