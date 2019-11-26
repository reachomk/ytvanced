package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qqx */
public final class qqx extends qou {
    public static final Creator CREATOR = new qra();
    public qpa a = null;
    public byte[] b;
    private final int c;

    qqx(int i, byte[] bArr) {
        this.c = i;
        this.b = bArr;
        a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.c);
        byte[] bArr = this.b;
        if (bArr == null) {
            bArr = riu.a(this.a);
        }
        qov.a(parcel, 2, bArr);
        qov.a(parcel, i);
    }

    public final void a() {
        qpa qpa = this.a;
        if (qpa == null && this.b != null) {
            return;
        }
        if (qpa != null && this.b == null) {
            return;
        }
        if (qpa != null && this.b != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (qpa == null && this.b == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }
}
