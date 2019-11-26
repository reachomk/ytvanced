package defpackage;

/* renamed from: ofx */
public final class ofx {
    public final ofz a;
    public final ofz b;

    public ofx(ofz ofz) {
        this(ofz, ofz);
    }

    public ofx(ofz ofz, ofz ofz2) {
        this.a = (ofz) oxz.a((Object) ofz);
        this.b = (ofz) oxz.a((Object) ofz2);
    }

    public final String toString() {
        Object obj;
        String valueOf = String.valueOf(this.a);
        if (this.a.equals(this.b)) {
            obj = "";
        } else {
            String valueOf2 = String.valueOf(this.b);
            StringBuilder stringBuilder = new StringBuilder(valueOf2.length() + 2);
            stringBuilder.append(", ");
            stringBuilder.append(valueOf2);
            obj = stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder((valueOf.length() + 2) + String.valueOf(obj).length());
        stringBuilder2.append("[");
        stringBuilder2.append(valueOf);
        stringBuilder2.append(obj);
        stringBuilder2.append("]");
        return stringBuilder2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ofx ofx = (ofx) obj;
            return this.a.equals(ofx.a) && this.b.equals(ofx.b);
        }
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
