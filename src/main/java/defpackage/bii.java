package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: bii */
final class bii extends bij {
    public final Parcel a;
    private final SparseIntArray e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;

    bii(Parcel parcel) {
        Parcel parcel2 = parcel;
        this(parcel2, parcel.dataPosition(), parcel.dataSize(), "", new zj(), new zj(), new zj());
    }

    private bii(Parcel parcel, int i, int i2, String str, zj zjVar, zj zjVar2, zj zjVar3) {
        super(zjVar, zjVar2, zjVar3);
        this.e = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.a = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    public final void a() {
        int i = this.i;
        if (i >= 0) {
            i = this.e.get(i);
            int dataPosition = this.a.dataPosition();
            this.a.setDataPosition(i);
            this.a.writeInt(dataPosition - i);
            this.a.setDataPosition(dataPosition);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bij b() {
        Parcel parcel = this.a;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        int i2 = i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h);
        stringBuilder.append("  ");
        return new bii(parcel, dataPosition, i2, stringBuilder.toString(), this.b, this.c, this.d);
    }

    public final void a(String str) {
        this.a.writeString(str);
    }
}
