package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

/* renamed from: pyv */
public final class pyv {
    public final String a;
    public final ComponentName b;
    public final int c;
    private final String d;

    public pyv(String str, String str2, int i) {
        this.d = pzr.a(str);
        this.a = pzr.a(str2);
        this.b = null;
        this.c = 129;
    }

    public pyv(ComponentName componentName) {
        this.d = null;
        this.a = null;
        this.b = (ComponentName) pzr.a((Object) componentName);
        this.c = 129;
    }

    public final String toString() {
        String str = this.d;
        return str == null ? this.b.flattenToString() : str;
    }

    public final Intent a() {
        String str = this.d;
        if (str != null) {
            return new Intent(str).setPackage(this.a);
        }
        return new Intent().setComponent(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b, Integer.valueOf(this.c)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pyv) {
            pyv pyv = (pyv) obj;
            return pzj.a(this.d, pyv.d) && pzj.a(this.a, pyv.a) && pzj.a(this.b, pyv.b) && this.c == pyv.c;
        }
    }
}
