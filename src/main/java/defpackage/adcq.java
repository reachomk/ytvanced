package defpackage;

/* renamed from: adcq */
final class adcq extends adcv {
    private final String b;

    adcq(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null ssid");
    }

    public final String a() {
        return this.b;
    }

    public final String toString() {
        String str = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 21);
        stringBuilder.append("PersistentSsid{ssid=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adcv)) {
            return false;
        }
        return this.b.equals(((adcv) obj).a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }
}
