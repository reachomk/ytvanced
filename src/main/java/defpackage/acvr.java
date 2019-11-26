package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: acvr */
class acvr implements Parcelable {
    public static final amul b = amul.g();
    public final acvy a;
    public final amul c;
    public final azfa d;
    public final atst e;
    public final int f;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a.a);
        i = this.f;
        int i2 = i - 1;
        if (i != 0) {
            parcel.writeInt(i2);
            xup.a(this.d, parcel);
            Bundle bundle = new Bundle();
            anze anze = this.e;
            if (anze != null) {
                aobp.a(bundle, "INTERACTION_LOGGING_CLIENT_DATA_KEY", anze);
            }
            parcel.writeBundle(bundle);
            int[] iArr = new int[this.c.size()];
            for (i2 = 0; i2 < this.c.size(); i2++) {
                iArr[i2] = ((auky) this.c.get(i2)).c;
            }
            parcel.writeIntArray(iArr);
            return;
        }
        throw null;
    }

    /* synthetic */ acvr(Parcel parcel) {
        this.a = new acvy(parcel.readLong());
        int a = attp.a(parcel.readInt());
        if (a == 0) {
            a = 1;
        }
        this.f = a;
        this.d = (azfa) xup.a(parcel, azfa.h);
        Bundle readBundle = parcel.readBundle(atst.class.getClassLoader());
        atst atst = null;
        if (readBundle != null) {
            String str = "INTERACTION_LOGGING_CLIENT_DATA_KEY";
            if (readBundle.containsKey(str)) {
                try {
                    atst = (atst) aobp.a(readBundle, str, atst.q, anxa.c());
                } catch (anyg e) {
                    afpc.a(2, afpf.logging, "Exception reading the InteractionLoggingClientData from Parcel.", e);
                }
            }
        }
        this.e = atst;
        int[] createIntArray = parcel.createIntArray();
        amuo amuo = new amuo();
        for (int a2 : createIntArray) {
            amuo.c(auky.a(a2));
        }
        this.c = amuo.a();
    }
}
