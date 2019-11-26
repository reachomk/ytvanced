package defpackage;

/* renamed from: adhz */
final class adhz extends adil {
    private final tbn a;

    adhz(tbn tbn) {
        if (tbn != null) {
            this.a = tbn;
            return;
        }
        throw new NullPointerException("Null castDevice");
    }

    public final tbn a() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 26);
        stringBuilder.append("MdxCastScreen{castDevice=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adil)) {
            return false;
        }
        return this.a.equals(((adil) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
