package defpackage;

/* renamed from: yll */
public final class yll extends ylj {
    private final String a;

    public final String a() {
        return this.a;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
        stringBuilder.append("AddParticipantsActionBarItemConfig{conversationId=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ylj)) {
            return false;
        }
        return this.a.equals(((ylj) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public /* synthetic */ yll(String str) {
        this.a = str;
    }
}
