package defpackage;

/* renamed from: yka */
final class yka extends ykr {
    public final String a;
    public final boolean b;
    public final long c;

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        long j = this.c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 89);
        stringBuilder.append("ChatTypingContact{contactEntityKey=");
        stringBuilder.append(str);
        stringBuilder.append(", active=");
        stringBuilder.append(z);
        stringBuilder.append(", lastActivityTime=");
        stringBuilder.append(j);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ykr) {
            ykr ykr = (ykr) obj;
            return this.a.equals(ykr.a()) && this.b == ykr.b() && this.c == ykr.c();
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = !this.b ? 1237 : 1231;
        long j = this.c;
        return ((hashCode ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final yku d() {
        return new yjz(this);
    }

    /* synthetic */ yka(String str, boolean z, long j) {
        this.a = str;
        this.b = z;
        this.c = j;
    }
}
