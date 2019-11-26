package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: shb */
final class shb implements Creator {
    private shb() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new sgz[0];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        sio sio = (sio) parcel2.readParcelable(sio.class.getClassLoader());
        String[] createStringArray = parcel.createStringArray();
        antp a = antp.a(parcel.readString());
        sgc sgc = (sgc) parcel2.readParcelable(sgc.class.getClassLoader());
        sfi sfi = (sfi) parcel2.readParcelable(sfi.class.getClassLoader());
        HashMap hashMap = new HashMap();
        parcel2.readMap(hashMap, HashMap.class.getClassLoader());
        seo seo = (seo) parcel2.readParcelable(seo.class.getClassLoader());
        boolean z = parcel.readByte() > (byte) 0;
        Collection arrayList = new ArrayList();
        parcel2.readStringList(arrayList);
        return new sgz(readString, readString2, readString3, readString4, readString5, sio, createStringArray, a, sgc, sfi, hashMap, seo, z, amul.a(arrayList));
    }

    /* synthetic */ shb(byte b) {
    }
}
