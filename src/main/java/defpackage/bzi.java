package defpackage;

/* renamed from: bzi */
final class bzi implements bzd {
    private final String a;

    bzi(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 29);
        stringBuilder.append("StringHeaderFactory{value='");
        stringBuilder.append(str);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bzi)) {
            return false;
        }
        return this.a.equals(((bzi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
