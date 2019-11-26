package defpackage;

/* renamed from: vzd */
final class vzd extends vzc {
    private final String b;
    private final aaft c;

    vzd(String str, aaft aaft) {
        this.b = str;
        this.c = aaft;
    }

    public final String a() {
        return this.b;
    }

    public final aaft b() {
        return this.c;
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 56) + valueOf.length());
        stringBuilder.append("AdOverlayContentMetadata{title=");
        stringBuilder.append(str);
        stringBuilder.append(", videoThumbnailDetails=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vzc) {
            vzc vzc = (vzc) obj;
            String str = this.b;
            if (str == null ? vzc.a() != null : !str.equals(vzc.a())) {
                aaft aaft = this.c;
                if (aaft == null ? vzc.b() == null : aaft.equals(vzc.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) ^ 1000003) * 1000003;
        aaft aaft = this.c;
        if (aaft != null) {
            i = aaft.hashCode();
        }
        return hashCode ^ i;
    }
}
