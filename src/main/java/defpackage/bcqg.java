package defpackage;

/* renamed from: bcqg */
public abstract class bcqg implements bcqf {
    protected bcqg() {
    }

    /* renamed from: a */
    public final int compareTo(bcqf bcqf) {
        long b = b();
        long b2 = bcqf.b();
        if (b >= b2) {
            return b <= b2 ? 0 : 1;
        } else {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcqf) {
            if (b() == ((bcqf) obj).b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long b = b();
        return (int) (b ^ (b >>> 32));
    }

    public final String toString() {
        long b = b();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        bcsy.a(stringBuffer, b);
        while (true) {
            if (stringBuffer.length() >= (b >= 0 ? 6 : 7)) {
                break;
            }
            stringBuffer.insert(b >= 0 ? 2 : 3, "0");
        }
        if ((b / 1000) * 1000 == b) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
