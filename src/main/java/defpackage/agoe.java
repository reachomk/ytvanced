package defpackage;

/* renamed from: agoe */
final class agoe extends agoh {
    private final String a;
    private final String b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final String toString() {
        Object obj;
        String str = this.a;
        int i = this.f;
        if (i == 0) {
            obj = "null";
        } else if (i == 0) {
            throw null;
        } else if (i != 0) {
            obj = Integer.toString(i - 1);
        } else {
            throw null;
        }
        String valueOf = String.valueOf(obj);
        String str2 = this.b;
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 136) + valueOf.length()) + String.valueOf(str2).length());
        stringBuilder.append("ShallowMp4Box{type=");
        stringBuilder.append(str);
        stringBuilder.append(", userType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", majorBrand=");
        stringBuilder.append(str2);
        stringBuilder.append(", size=");
        stringBuilder.append(j);
        stringBuilder.append(", boxOffset=");
        stringBuilder.append(j2);
        stringBuilder.append(", dataOffset=");
        stringBuilder.append(j3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agoh) {
            agoh agoh = (agoh) obj;
            if (this.a.equals(agoh.a())) {
                int i = this.f;
                int f = agoh.f();
                if (i != 0) {
                    return i == f && this.b.equals(agoh.b()) && this.c == agoh.c() && this.d == agoh.d() && this.e == agoh.e();
                } else {
                    throw null;
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.f;
        if (i != 0) {
            int hashCode2 = this.b.hashCode();
            long j = this.c;
            long j2 = this.d;
            long j3 = this.e;
            return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
        }
        throw null;
    }

    agoe(String str, int i, String str2, long j, long j2, long j3) {
        if (str != null) {
            this.a = str;
            if (i != 0) {
                this.f = i;
                if (str2 != null) {
                    this.b = str2;
                    this.c = j;
                    this.d = j2;
                    this.e = j3;
                    return;
                }
                throw new NullPointerException("Null majorBrand");
            }
            throw new NullPointerException("Null userType");
        }
        throw new NullPointerException("Null type");
    }

    public final int f() {
        return this.f;
    }
}
