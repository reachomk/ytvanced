package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: bvy */
final class bvy implements bsm {
    private static final chr b = new chr(50);
    private final bwb c;
    private final bsm d;
    private final bsm e;
    private final int f;
    private final int g;
    private final Class h;
    private final bsq i;
    private final bsr j;

    bvy(bwb bwb, bsm bsm, bsm bsm2, int i, int i2, bsr bsr, Class cls, bsq bsq) {
        this.c = bwb;
        this.d = bsm;
        this.e = bsm2;
        this.f = i;
        this.g = i2;
        this.j = bsr;
        this.h = cls;
        this.i = bsq;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bvy) {
            bvy bvy = (bvy) obj;
            if (this.g == bvy.g && this.f == bvy.f && chv.a(this.j, bvy.j) && this.h.equals(bvy.h) && this.d.equals(bvy.d) && this.e.equals(bvy.e) && this.i.equals(bvy.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g;
        bsr bsr = this.j;
        if (bsr != null) {
            hashCode = (hashCode * 31) + bsr.hashCode();
        }
        return (((hashCode * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.c.a(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(bArr);
        bsr bsr = this.j;
        if (bsr != null) {
            bsr.a(messageDigest);
        }
        this.i.a(messageDigest);
        byte[] bArr2 = (byte[]) b.b(this.h);
        if (bArr2 == null) {
            bArr2 = this.h.getName().getBytes(a);
            b.b(this.h, bArr2);
        }
        messageDigest.update(bArr2);
        this.c.b(bArr);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int i = this.f;
        int i2 = this.g;
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.i);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 131) + length2) + length3) + valueOf4.length()) + valueOf5.length());
        stringBuilder.append("ResourceCacheKey{sourceKey=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", signature=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", width=");
        stringBuilder.append(i);
        stringBuilder.append(", height=");
        stringBuilder.append(i2);
        stringBuilder.append(", decodedResourceClass=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", transformation='");
        stringBuilder.append(valueOf4);
        stringBuilder.append("', options=");
        stringBuilder.append(valueOf5);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
