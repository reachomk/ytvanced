package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: aagl */
public final class aagl implements aago, Parcelable {
    public static final Creator CREATOR = new aagk();
    private final nkz a;
    private List b;

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return TextUtils.join(".", this.a.j);
    }

    public final boolean a() {
        return f() == aagp.MULTI_SELECT;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(this.a, parcel);
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            aagl aagl = (aagl) obj;
            if (amqq.a(Integer.valueOf(d()), Integer.valueOf(aagl.d())) && amqq.a(f(), aagl.f()) && amqq.a(c(), aagl.c()) && amqq.a(g(), aagl.g()) && amqq.a(i(), aagl.i()) && amqq.a(j(), aagl.j()) && amqq.a(h(), aagl.h()) && amqq.a(Integer.valueOf(b()), Integer.valueOf(aagl.b()))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d()), f(), c(), g(), i(), j(), h(), Integer.valueOf(b())});
    }

    public final String toString() {
        String valueOf = String.valueOf(f());
        String g = g();
        String valueOf2 = String.valueOf(i());
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 38) + String.valueOf(g).length()) + valueOf2.length());
        stringBuilder.append("Question [type: ");
        stringBuilder.append(valueOf);
        stringBuilder.append("question:\"");
        stringBuilder.append(g);
        stringBuilder.append("\" answers: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final int d() {
        return this.a.i;
    }

    public final aagp f() {
        return aagp.a(this.a.d);
    }

    private final List c() {
        return Collections.unmodifiableList(this.a.j);
    }

    public final String g() {
        return this.a.b;
    }

    public final List i() {
        return Collections.unmodifiableList(this.a.c);
    }

    public final List j() {
        this.b = new ArrayList();
        for (String parse : this.a.f) {
            this.b.add(Uri.parse(parse));
        }
        return Collections.unmodifiableList(this.b);
    }

    public final String h() {
        return this.a.g;
    }

    public final int b() {
        return this.a.h;
    }

    /* synthetic */ aagl(nkz nkz) {
        this.a = (nkz) amqw.a((Object) nkz);
        xvd.a(nkz.b);
        boolean z = true;
        amqw.b(aagp.a(nkz.d) != aagp.UNSUPPORTED);
        if (nkz.c.size() <= 0) {
            z = false;
        }
        amqw.b(z);
    }
}
