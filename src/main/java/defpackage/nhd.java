package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: nhd */
public final class nhd implements ngn {
    public static final Creator CREATOR = new nhg();
    public static final nhd a = new nhd("", "", "", "", new ngm(0, 0), new nhh(0, 0));
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final ngm e;
    public final nhh f;
    private final CharSequence g;

    public nhd(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ngm ngm, nhh nhh) {
        this.b = str;
        this.c = charSequence;
        this.g = charSequence2;
        this.d = charSequence3;
        this.e = ngm;
        this.f = nhh;
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() + 527) * 31) + this.c.hashCode()) * 31) + this.g.hashCode()) * 31) + this.d.hashCode()) * 31;
        ngm ngm = this.e;
        int i = 0;
        hashCode = (hashCode + (ngm != null ? ngm.hashCode() : 0)) * 31;
        nhh nhh = this.f;
        if (nhh != null) {
            i = nhh.hashCode();
        }
        return hashCode + i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nhd) {
            nhd nhd = (nhd) obj;
            if (TextUtils.equals(this.b, nhd.b) && TextUtils.equals(this.c, nhd.c) && TextUtils.equals(this.g, nhd.g) && TextUtils.equals(this.d, nhd.d)) {
                ngm ngm = this.e;
                if (ngm == null ? nhd.e != null : !ngm.equals(nhd.e)) {
                    nhh nhh = this.f;
                    if (nhh == null ? nhd.f == null : nhh.equals(nhd.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final ngq a() {
        return ngq.RELATED_VIDEO_ITEM;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        TextUtils.writeToParcel(this.c, parcel, i);
        TextUtils.writeToParcel(this.g, parcel, i);
        TextUtils.writeToParcel(this.d, parcel, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }

    /* synthetic */ nhd(Parcel parcel) {
        this(parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (ngm) parcel.readParcelable(ngm.class.getClassLoader()), (nhh) parcel.readParcelable(nhh.class.getClassLoader()));
    }
}
