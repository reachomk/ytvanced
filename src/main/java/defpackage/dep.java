package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: dep */
public final class dep implements der {
    public final String a;
    public final String b;
    public final dew c;
    public final boolean d;
    public final int e;
    public final int[] f;
    public final Bundle g;
    public final dfc h;
    private final boolean i;
    private final dfh j;

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final dew d() {
        return this.c;
    }

    public final int e() {
        return this.e;
    }

    public final boolean f() {
        return this.d;
    }

    public final int[] g() {
        return this.f;
    }

    public final Bundle h() {
        return this.g;
    }

    public final dfc i() {
        return this.h;
    }

    public final boolean j() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            dep dep = (dep) obj;
            return this.a.equals(dep.a) && this.b.equals(dep.b);
        }
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String quote = JSONObject.quote(this.a);
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        boolean z = this.d;
        int i = this.e;
        String arrays = Arrays.toString(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        boolean z2 = this.i;
        String valueOf4 = String.valueOf(this.j);
        int length = String.valueOf(quote).length();
        int length2 = String.valueOf(str).length();
        int length3 = valueOf.length();
        int length4 = String.valueOf(arrays).length();
        int length5 = valueOf2.length();
        StringBuilder stringBuilder = new StringBuilder(((((((length + 159) + length2) + length3) + length4) + length5) + valueOf3.length()) + valueOf4.length());
        stringBuilder.append("JobInvocation{tag='");
        stringBuilder.append(quote);
        stringBuilder.append("', service='");
        stringBuilder.append(str);
        stringBuilder.append("', trigger=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", recurring=");
        stringBuilder.append(z);
        stringBuilder.append(", lifetime=");
        stringBuilder.append(i);
        stringBuilder.append(", constraints=");
        stringBuilder.append(arrays);
        stringBuilder.append(", extras=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", retryStrategy=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", replaceCurrent=");
        stringBuilder.append(z2);
        stringBuilder.append(", triggerReason=");
        stringBuilder.append(valueOf4);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* synthetic */ dep(deo deo) {
        this.a = deo.a;
        this.b = deo.b;
        this.c = deo.c;
        this.h = deo.h;
        this.d = deo.d;
        this.e = deo.e;
        this.f = deo.f;
        this.g = deo.g;
        this.i = deo.i;
        this.j = deo.j;
    }
}
