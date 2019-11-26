package defpackage;

/* renamed from: ian */
final class ian extends ice {
    private final int a;
    private final aich b;
    private final fob c;
    private final ejd d;
    private final String e;
    private final icg f;
    private final aicd g;

    /* Access modifiers changed, original: final */
    public final int a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final aich b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final fob c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final ejd d() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final String e() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final icg f() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final aicd g() {
        return this.g;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String str = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 143) + length2) + length3) + length4) + valueOf4.length()) + valueOf5.length());
        stringBuilder.append("Model{inlinePlaybackState=");
        stringBuilder.append(i);
        stringBuilder.append(", controlsState=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", currentInlineVideo=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", playerViewMode=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", errorMessage=");
        stringBuilder.append(str);
        stringBuilder.append(", videoTimes=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", controlsOverlayStyle=");
        stringBuilder.append(valueOf5);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ice) {
            ice ice = (ice) obj;
            if (this.a == ice.a()) {
                aich aich = this.b;
                if (aich == null ? ice.b() != null : !aich.equals(ice.b())) {
                    fob fob = this.c;
                    if (fob == null ? ice.c() != null : !fob.equals(ice.c())) {
                        ejd ejd = this.d;
                        if (ejd == null ? ice.d() != null : !ejd.equals(ice.d())) {
                            String str = this.e;
                            if (str == null ? ice.e() != null : !str.equals(ice.e())) {
                                icg icg = this.f;
                                if (icg == null ? ice.f() != null : !icg.equals(ice.f())) {
                                    aicd aicd = this.g;
                                    if (aicd == null ? ice.g() == null : aicd.equals(ice.g())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        aich aich = this.b;
        int i2 = 0;
        i = (i ^ (aich != null ? aich.hashCode() : 0)) * 1000003;
        fob fob = this.c;
        i = (i ^ (fob != null ? fob.hashCode() : 0)) * 1000003;
        ejd ejd = this.d;
        i = (i ^ (ejd != null ? ejd.hashCode() : 0)) * 1000003;
        String str = this.e;
        i = (i ^ (str != null ? str.hashCode() : 0)) * 1000003;
        icg icg = this.f;
        i = (i ^ (icg != null ? icg.hashCode() : 0)) * 1000003;
        aicd aicd = this.g;
        if (aicd != null) {
            i2 = aicd.hashCode();
        }
        return i ^ i2;
    }

    /* synthetic */ ian(int i, aich aich, fob fob, ejd ejd, String str, icg icg, aicd aicd) {
        this.a = i;
        this.b = aich;
        this.c = fob;
        this.d = ejd;
        this.e = str;
        this.f = icg;
        this.g = aicd;
    }
}
