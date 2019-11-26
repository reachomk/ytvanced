package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: vtp */
public final class vtp implements afnt, Parcelable {
    public static final Creator CREATOR = new vto();
    public final aojx a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final List n;
    public final List o;
    public final List p;
    public final List q;
    public final List r;
    public final List s;
    public final List t;
    public final List u;
    public final List v;

    public vtp(aojx aojx) {
        if (aojx == null) {
            aojx = aojx.w;
        }
        this.b = vtp.a(aojx.p);
        this.c = vtp.a(aojx.m);
        this.d = vtp.a(aojx.l);
        this.e = vtp.a(aojx.k);
        this.f = vtp.a(aojx.o);
        this.g = vtp.a(aojx.i);
        this.h = vtp.a(aojx.g);
        this.i = vtp.a(aojx.u);
        this.j = vtp.a(aojx.n);
        this.k = vtp.a(aojx.b);
        this.l = vtp.a(aojx.r);
        this.m = vtp.a(aojx.j);
        this.n = vtp.a(aojx.a);
        this.o = vtp.a(aojx.v);
        vtp.a(aojx.c);
        this.p = vtp.a(aojx.d);
        this.q = vtp.a(aojx.h);
        this.r = vtp.a(aojx.e);
        this.s = vtp.a(aojx.s);
        this.t = vtp.a(aojx.f);
        this.u = vtp.a(aojx.q);
        this.v = vtp.a(aojx.t);
        vtp.a(aojx.i);
        this.a = aojx;
    }

    public final int describeContents() {
        return 0;
    }

    private static List a(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (aojo aojo : list) {
            if (!TextUtils.isEmpty(aojo.b)) {
                try {
                    xvt.a(aojo.b);
                    arrayList.add(aojo);
                } catch (MalformedURLException unused) {
                    xtl.d("Badly formed uri - ignoring");
                }
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vtp)) {
            return false;
        }
        return amqq.a(this.a, ((vtp) obj).a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            xup.a(this.a, parcel);
        }
    }

    public final /* synthetic */ afns c() {
        return new vtr(this);
    }

    static {
        vtr vtr = new vtr();
    }
}
