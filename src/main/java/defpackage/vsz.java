package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: vsz */
public final class vsz implements aago, Parcelable {
    public static final Creator CREATOR = new vsy();
    private final axzf a;
    private List b;
    private List c;

    public vsz(axzf axzf) {
        this.a = (axzf) amqw.a((Object) axzf);
    }

    public final int d() {
        return 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return "";
    }

    public final String h() {
        return "";
    }

    public final boolean a() {
        return this.a.e > 1;
    }

    public final int b() {
        axzj axzj = this.a.f;
        if (axzj == null) {
            axzj = axzj.f;
        }
        if (axzj.b <= 0) {
            return 15;
        }
        axzj = this.a.f;
        if (axzj == null) {
            axzj = axzj.f;
        }
        return axzj.b;
    }

    public final int c() {
        axzj axzj = this.a.f;
        if (axzj == null) {
            axzj = axzj.f;
        }
        if (axzj.c <= 0) {
            return 0;
        }
        axzj = this.a.f;
        if (axzj == null) {
            axzj = axzj.f;
        }
        return axzj.c;
    }

    public final aagp f() {
        int i = this.a.e;
        if (i <= 0) {
            return aagp.UNSUPPORTED;
        }
        if (i != 1) {
            return aagp.MULTI_SELECT;
        }
        return aagp.SINGLE_ANSWERS;
    }

    public final String g() {
        axzf axzf = this.a;
        if ((axzf.a & 1) != 0) {
            arml arml = axzf.b;
            if (arml == null) {
                arml = arml.f;
            }
            return ajqy.a(arml).toString();
        }
        xtl.c("Survey question doesn't contain any question text.");
        return "";
    }

    public final List i() {
        if (this.b == null) {
            this.b = new ArrayList();
            for (arml a : this.a.d) {
                this.b.add(ajqy.a(a).toString());
            }
        }
        return Collections.unmodifiableList(this.b);
    }

    public final List j() {
        if ((this.a.a & 16) == 0) {
            return Collections.emptyList();
        }
        if (this.c == null) {
            this.c = new ArrayList();
            axzj axzj = this.a.f;
            if (axzj == null) {
                axzj = axzj.f;
            }
            for (aojo aojo : axzj.d) {
                try {
                    this.c.add(xvt.a(aojo.b));
                } catch (MalformedURLException unused) {
                    xtl.d("Badly formed uri - ignoring");
                }
            }
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vsz)) {
            return false;
        }
        return amqq.a(this.a, ((vsz) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
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

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(this.a, parcel);
    }
}
