package defpackage;

import org.json.JSONObject;

/* renamed from: adxx */
final class adxx extends adym {
    private final adiv a;
    private final JSONObject b;

    public final adiv a() {
        return this.a;
    }

    public final JSONObject b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 26) + valueOf2.length());
        stringBuilder.append("MdxMessage{method=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", data=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adym) {
            adym adym = (adym) obj;
            return this.a.equals(adym.a()) && this.b.equals(adym.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    /* synthetic */ adxx(adiv adiv, JSONObject jSONObject) {
        this.a = adiv;
        this.b = jSONObject;
    }
}
