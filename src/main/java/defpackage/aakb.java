package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aakb */
public final class aakb implements Parcelable, Comparable {
    public static final Creator CREATOR = new aakc();
    public final String a;
    public final amro b;
    public final Set c;

    public aakb(aule aule) {
        boolean z = true;
        if ((aule.a & 1) == 0) {
            z = false;
        }
        amqw.b(z);
        this.a = aule.b;
        this.b = amrn.a(new aaka(this));
        this.c = new HashSet();
        if (aule.c.size() != 0) {
            for (aula aula : aule.c) {
                Set set = this.c;
                Object a = aulc.a(aula.b);
                if (a == null) {
                    a = aulc.UNKNOWN;
                }
                set.add(a);
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public aakb(nke nke) {
        this.a = (nke.a & 1) != 0 ? nke.b : "";
        this.b = amrn.a(new aakd(this));
        this.c = new HashSet();
        for (Integer intValue : nke.c) {
            aulc a = aulc.a(intValue.intValue());
            if (a != null) {
                this.c.add(a);
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        nkd nkd = (nkd) nke.d.createBuilder();
        String str = this.a;
        nkd.copyOnWrite();
        nke nke = (nke) nkd.instance;
        if (str != null) {
            nke.a |= 1;
            nke.b = str;
            for (aulc aulc : this.c) {
                int i2 = aulc.e;
                nkd.copyOnWrite();
                nke nke2 = (nke) nkd.instance;
                if (!nke2.c.a()) {
                    nke2.c = anxl.mutableCopy(nke2.c);
                }
                nke2.c.d(i2);
            }
            xup.a((nke) ((anxl) nkd.build()), parcel);
            return;
        }
        throw new NullPointerException();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((aakb) obj).a);
    }
}
