package defpackage;

import java.util.Objects;

/* renamed from: ucd */
public final class ucd {
    public final String a;
    public final int b;

    public ucd(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ucd) {
            ucd ucd = (ucd) obj;
            if (this.a.equals(ucd.a) && this.b == ucd.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        return String.format("{path: %s, retainedHeapSizeBytes: %d}", new Object[]{this.a, Integer.valueOf(this.b)});
    }
}
