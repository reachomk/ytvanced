package defpackage;

/* renamed from: afob */
public final class afob extends afoa {
    public final afot a;
    public final aqui b;

    afob(afot afot, aqui aqui) {
        this.a = afot;
        this.b = aqui;
    }

    public final afot a() {
        return this.a;
    }

    public final aqui b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 36) + valueOf2.length());
        stringBuilder.append("BatchContext{visitorContext=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", tier=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afoa) {
            afoa afoa = (afoa) obj;
            if (this.a.equals(afoa.a())) {
                aqui aqui = this.b;
                if (aqui == null ? afoa.b() == null : aqui.equals(afoa.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        aqui aqui = this.b;
        return hashCode ^ (aqui != null ? aqui.hashCode() : 0);
    }
}
