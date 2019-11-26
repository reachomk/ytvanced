package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: aagh */
public final class aagh implements aagi, afnt, Parcelable {
    public static final Creator CREATOR = new aagg();
    public static final aagj b = new aagj();
    public final nkx a;
    private List c;

    private aagh() {
        this.a = nkx.b;
    }

    public final apxu Y() {
        return null;
    }

    public final aybu Z() {
        return null;
    }

    public final apxu aa() {
        return null;
    }

    public final int ab() {
        return 5;
    }

    public final boolean ac() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            if (amqq.a(X(), ((aagh) obj).X())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{X()});
    }

    public final String toString() {
        String valueOf = String.valueOf(X().toString());
        String str = "Survey ";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(this.a, parcel);
    }

    public final List X() {
        if (this.c == null) {
            this.c = new ArrayList();
            for (nkz nkz : this.a.a) {
                Object aagl;
                List list = this.c;
                aagn aagn = new aagn(nkz);
                nlc nlc = aagn.a;
                nlc.copyOnWrite();
                ((nkz) nlc.instance).f = anxl.emptyProtobufList();
                List list2 = aagn.c;
                nlc.copyOnWrite();
                nkz nkz2 = (nkz) nlc.instance;
                if (!nkz2.f.a()) {
                    nkz2.f = anxl.mutableCopy(nkz2.f);
                }
                anvf.addAll(list2, nkz2.f);
                if (((nkz) aagn.a.instance).j.size() <= 0) {
                    int a = nlb.a(((nkz) aagn.a.instance).e);
                    boolean z = true;
                    if (a == 0) {
                        a = 1;
                    }
                    aagm a2 = aagm.a(a, aagn.b);
                    nlc nlc2 = aagn.a;
                    nlc2.copyOnWrite();
                    ((nkz) nlc2.instance).c = anxl.emptyProtobufList();
                    List list3 = aagn.b;
                    int i = 0;
                    if (list3.size() != a2.a.size()) {
                        z = false;
                    }
                    amqw.b(z);
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < list3.size(); i2++) {
                        arrayList.add((String) list3.get(((Integer) a2.a.get(i2)).intValue()));
                    }
                    while (i < arrayList.size()) {
                        nlc2 = aagn.a;
                        String str = (String) arrayList.get(i);
                        nlc2.copyOnWrite();
                        nkz nkz3 = (nkz) nlc2.instance;
                        if (str != null) {
                            if (!nkz3.c.a()) {
                                nkz3.c = anxl.mutableCopy(nkz3.c);
                            }
                            nkz3.c.add(str);
                            i++;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    nlc nlc3 = aagn.a;
                    nlc3.copyOnWrite();
                    ((nkz) nlc3.instance).j = anxl.emptyIntList();
                    List list4 = a2.a;
                    nlc3.copyOnWrite();
                    nkz nkz4 = (nkz) nlc3.instance;
                    if (!nkz4.j.a()) {
                        nkz4.j = anxl.mutableCopy(nkz4.j);
                    }
                    anvf.addAll(list4, nkz4.j);
                }
                try {
                    aagl = new aagl((nkz) anxl.parseFrom(nkz.k, ((nkz) ((anxl) aagn.a.build())).toByteArray(), anxa.c()));
                } catch (anyg unused) {
                    aagl = null;
                }
                list.add(aagl);
            }
            this.c = Collections.unmodifiableList(this.c);
        }
        return this.c;
    }

    public final /* synthetic */ aago ad() {
        return (aagl) X().get(0);
    }

    public final /* synthetic */ afns c() {
        return new aagj(this);
    }

    /* synthetic */ aagh(nkx nkx) {
        amqw.a((Object) nkx);
        amqw.b(nkx.a.size() > 0);
        this.a = nkx;
    }

    static {
        aagh aagh = new aagh();
    }
}
