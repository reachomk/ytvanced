package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zuf */
public final class zuf implements Parcelable {
    public static final Creator CREATOR = new zui();
    public ajwf a;
    private List b;

    public zuf(ajwf ajwf) {
        this.a = (ajwf) amqw.a((Object) ajwf);
    }

    public final int describeContents() {
        return 0;
    }

    public final List a() {
        if (this.b == null) {
            this.b = new ArrayList();
            ajwk[] ajwkArr = this.a.a;
            if (ajwkArr != null) {
                for (ajwk ajwk : ajwkArr) {
                    zud zud = new zud(ajwk.b);
                    if (zud.b != null) {
                        this.b.add(zud);
                    }
                }
            }
        }
        return this.b;
    }

    public final CharSequence b() {
        return ajqy.a(this.a.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List a = a();
        if (!a.isEmpty()) {
            ajwf ajwf = (ajwf) aocf.cloneUsingSerialization(this.a);
            ajwf.a = new ajwk[a.size()];
            for (int i2 = 0; i2 < a.size(); i2++) {
                ajwf.a[i2] = new ajwk();
                ajwf.a[i2].b = (ajwh) aocf.cloneUsingSerialization(((zud) this.b.get(i2)).a);
            }
            this.a = ajwf;
        }
        byte[] toByteArray = aocf.toByteArray(this.a);
        parcel.writeInt(toByteArray.length);
        parcel.writeByteArray(toByteArray);
    }

    public final byte[] c() {
        arwr arwr = this.a.e;
        if (arwr == null || (arwr.a & 2) == 0) {
            return null;
        }
        arwx arwx = arwr.c;
        if (arwx == null) {
            arwx = arwx.c;
        }
        return arwx.b.d();
    }

    public final byte[] d() {
        arwr arwr = this.a.f;
        if (arwr == null || (arwr.a & 2) == 0) {
            return null;
        }
        arwx arwx = arwr.c;
        if (arwx == null) {
            arwx = arwx.c;
        }
        return arwx.b.d();
    }
}
