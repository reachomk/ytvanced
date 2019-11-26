package defpackage;

/* renamed from: iqb */
final class iqb extends ise {
    private final boolean a;
    private final String b;
    private final abhw c;
    private final apxu d;
    private final atgy e;
    private final atgl f;

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final String b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final abhw c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final apxu d() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final atgy e() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final atgl f() {
        return this.f;
    }

    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 124) + length2) + length3) + valueOf3.length()) + valueOf4.length());
        stringBuilder.append("SearchServiceRequestBuilder{isPrefetch=");
        stringBuilder.append(z);
        stringBuilder.append(", query=");
        stringBuilder.append(str);
        stringBuilder.append(", searchService=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", navigationEndpoint=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", searchboxStats=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", searchFormData=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ise) {
            ise ise = (ise) obj;
            if (this.a == ise.a() && this.b.equals(ise.b()) && this.c.equals(ise.c())) {
                apxu apxu = this.d;
                if (apxu == null ? ise.d() != null : !apxu.equals(ise.d())) {
                    atgy atgy = this.e;
                    if (atgy == null ? ise.e() != null : !atgy.equals(ise.e())) {
                        atgl atgl = this.f;
                        if (atgl == null ? ise.f() == null : atgl.equals(ise.f())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        apxu apxu = this.d;
        int i = 0;
        hashCode = (hashCode ^ (apxu != null ? apxu.hashCode() : 0)) * 1000003;
        atgy atgy = this.e;
        hashCode = (hashCode ^ (atgy != null ? atgy.hashCode() : 0)) * 1000003;
        atgl atgl = this.f;
        if (atgl != null) {
            i = atgl.hashCode();
        }
        return hashCode ^ i;
    }

    /* synthetic */ iqb(boolean z, String str, abhw abhw, apxu apxu, atgy atgy, atgl atgl) {
        this.a = z;
        this.b = str;
        this.c = abhw;
        this.d = apxu;
        this.e = atgy;
        this.f = atgl;
    }
}
