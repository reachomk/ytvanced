package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.LinkedList;

/* renamed from: fis */
public final class fis implements Parcelable {
    public static final Creator CREATOR = new fir();
    public final LinkedList a;

    public fis() {
        this.a = new LinkedList();
    }

    public final int describeContents() {
        return 0;
    }

    public final void a(fiw fiw, nl nlVar, Object obj, String str) {
        this.a.addFirst(new fiu(fiw, nlVar, obj, str));
    }

    public final fiu a() {
        return (fiu) this.a.peek();
    }

    public final fiu b() {
        return (fiu) this.a.pollFirst();
    }

    public final fiu c() {
        fiu fiu = (fiu) this.a.peekLast();
        this.a.clear();
        return fiu;
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
    }

    /* synthetic */ fis(Parcel parcel) {
        this();
        parcel.readTypedList(this.a, fiu.CREATOR);
    }
}
