package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* renamed from: bvj */
final class bvj implements bsm {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final bsm g;
    private final Map h;
    private final bsq i;
    private int j;

    bvj(Object obj, bsm bsm, int i, int i2, Map map, Class cls, Class cls2, bsq bsq) {
        this.b = chw.a(obj);
        this.g = (bsm) chw.a((Object) bsm, "Signature must not be null");
        this.c = i;
        this.d = i2;
        this.h = (Map) chw.a((Object) map);
        this.e = (Class) chw.a((Object) cls, "Resource class must not be null");
        this.f = (Class) chw.a((Object) cls2, "Transcode class must not be null");
        this.i = (bsq) chw.a((Object) bsq);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bvj) {
            bvj bvj = (bvj) obj;
            if (this.b.equals(bvj.b) && this.g.equals(bvj.g) && this.d == bvj.d && this.c == bvj.c && this.h.equals(bvj.h) && this.e.equals(bvj.e) && this.f.equals(bvj.f) && this.i.equals(bvj.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        i = this.b.hashCode();
        this.j = i;
        i = (i * 31) + this.g.hashCode();
        this.j = i;
        i = (i * 31) + this.c;
        this.j = i;
        i = (i * 31) + this.d;
        this.j = i;
        i = (i * 31) + this.h.hashCode();
        this.j = i;
        i = (i * 31) + this.e.hashCode();
        this.j = i;
        i = (i * 31) + this.f.hashCode();
        this.j = i;
        i = (i * 31) + this.i.hashCode();
        this.j = i;
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        int i3 = this.j;
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 151) + length2) + length3) + length4) + valueOf5.length()) + valueOf6.length());
        stringBuilder.append("EngineKey{model=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", width=");
        stringBuilder.append(i);
        stringBuilder.append(", height=");
        stringBuilder.append(i2);
        stringBuilder.append(", resourceClass=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", transcodeClass=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", signature=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", hashCode=");
        stringBuilder.append(i3);
        stringBuilder.append(", transformations=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", options=");
        stringBuilder.append(valueOf6);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
