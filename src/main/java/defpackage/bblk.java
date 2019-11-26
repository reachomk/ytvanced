package defpackage;

import java.util.Map;

/* renamed from: bblk */
final class bblk extends bbln {
    private final Map a;
    private final Map b;

    bblk(Map map, Map map2) {
        if (map != null) {
            this.a = map;
            if (map2 != null) {
                this.b = map2;
                return;
            }
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        throw new NullPointerException("Null numbersOfLatencySampledSpans");
    }

    public final Map a() {
        return this.a;
    }

    public final Map b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 78) + valueOf2.length());
        stringBuilder.append("PerSpanNameSummary{numbersOfLatencySampledSpans=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", numbersOfErrorSampledSpans=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbln) {
            bbln bbln = (bbln) obj;
            return this.a.equals(bbln.a()) && this.b.equals(bbln.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
