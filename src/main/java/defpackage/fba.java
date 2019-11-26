package defpackage;

/* renamed from: fba */
final class fba extends fdl {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final aybc e;
    public final ayao f;
    public final axzw g;
    public final ayaa h;
    public final feb i;
    public final CharSequence j;
    public final int k;
    public final apxu l;
    public final String m;
    public final int n;
    public final int o;

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final int d() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final aybc e() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final ayao f() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final axzw g() {
        return this.g;
    }

    /* Access modifiers changed, original: final */
    public final ayaa h() {
        return this.h;
    }

    /* Access modifiers changed, original: final */
    public final feb i() {
        return this.i;
    }

    /* Access modifiers changed, original: final */
    public final CharSequence j() {
        return this.j;
    }

    /* Access modifiers changed, original: final */
    public final int k() {
        return this.k;
    }

    /* Access modifiers changed, original: final */
    public final apxu l() {
        return this.l;
    }

    /* Access modifiers changed, original: final */
    public final String m() {
        return this.m;
    }

    public final String toString() {
        Object obj;
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        int i = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.j);
        int i2 = this.n;
        Object obj2 = "null";
        if (i2 == 0) {
            obj = obj2;
        } else if (i2 == 0) {
            throw null;
        } else if (i2 != 0) {
            obj = Integer.toString(i2 - 1);
        } else {
            throw null;
        }
        String valueOf7 = String.valueOf(obj);
        int i3 = this.o;
        if (i3 != 0) {
            if (i3 == 0) {
                throw null;
            } else if (i3 != 0) {
                obj2 = Integer.toString(i3 - 1);
            } else {
                throw null;
            }
        }
        String valueOf8 = String.valueOf(obj2);
        int i4 = this.k;
        String valueOf9 = String.valueOf(this.l);
        String str = this.m;
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        int length5 = valueOf5.length();
        int length6 = valueOf6.length();
        int length7 = valueOf7.length();
        int length8 = valueOf8.length();
        String str2 = str;
        StringBuilder stringBuilder = new StringBuilder((((((((((length + 305) + length2) + length3) + length4) + length5) + length6) + length7) + length8) + valueOf9.length()) + String.valueOf(str).length());
        stringBuilder.append("SurveyBottomUiModel{rateLimited=");
        stringBuilder.append(z);
        stringBuilder.append(", shownOnFullscreen=");
        stringBuilder.append(z2);
        stringBuilder.append(", counterfactual=");
        stringBuilder.append(z3);
        stringBuilder.append(", surveyType=");
        stringBuilder.append(i);
        stringBuilder.append(", surveySupportedRenderers=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", singleOptionSurvey=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", checkboxSurvey=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", freeTextSurvey=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", responseListener=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", question=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", displayTime=");
        stringBuilder.append(valueOf7);
        stringBuilder.append(", displayStart=");
        stringBuilder.append(valueOf8);
        stringBuilder.append(", displayDelaySec=");
        stringBuilder.append(i4);
        stringBuilder.append(", dismissalEndpoint=");
        stringBuilder.append(valueOf9);
        stringBuilder.append(", cpn=");
        stringBuilder.append(str2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fdl) {
            fdl fdl = (fdl) obj;
            if (this.a == fdl.a() && this.b == fdl.b() && this.c == fdl.c() && this.d == fdl.d() && this.e.equals(fdl.e())) {
                ayao ayao = this.f;
                if (ayao == null ? fdl.f() != null : !ayao.equals(fdl.f())) {
                    axzw axzw = this.g;
                    if (axzw == null ? fdl.g() != null : !axzw.equals(fdl.g())) {
                        ayaa ayaa = this.h;
                        if (ayaa == null ? fdl.h() != null : !ayaa.equals(fdl.h())) {
                            feb feb = this.i;
                            if (feb == null ? fdl.i() != null : !feb.equals(fdl.i())) {
                                CharSequence charSequence = this.j;
                                if (charSequence == null ? fdl.j() != null : !charSequence.equals(fdl.j())) {
                                    int i = this.n;
                                    int o = fdl.o();
                                    if (i == 0) {
                                        throw null;
                                    } else if (i == o) {
                                        i = this.o;
                                        o = fdl.p();
                                        if (i == 0) {
                                            throw null;
                                        } else if (i == o && this.k == fdl.k()) {
                                            apxu apxu = this.l;
                                            if (apxu == null ? fdl.l() != null : !apxu.equals(fdl.l())) {
                                                String str = this.m;
                                                if (str == null ? fdl.m() == null : str.equals(fdl.m())) {
                                                    return true;
                                                }
                                            }
                                        }
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
        int i = 1237;
        int i2 = ((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003;
        if (this.c) {
            i = 1231;
        }
        i2 = (((((i2 ^ i) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        ayao ayao = this.f;
        int i3 = 0;
        i2 = (i2 ^ (ayao != null ? ayao.hashCode() : 0)) * 1000003;
        axzw axzw = this.g;
        i2 = (i2 ^ (axzw != null ? axzw.hashCode() : 0)) * 1000003;
        ayaa ayaa = this.h;
        i2 = (i2 ^ (ayaa != null ? ayaa.hashCode() : 0)) * 1000003;
        feb feb = this.i;
        i2 = (i2 ^ (feb != null ? feb.hashCode() : 0)) * 1000003;
        CharSequence charSequence = this.j;
        i2 = (i2 ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003;
        i = this.n;
        if (i != 0) {
            i2 = (i2 ^ i) * 1000003;
            i = this.o;
            if (i != 0) {
                i2 = (((i2 ^ i) * 1000003) ^ this.k) * 1000003;
                apxu apxu = this.l;
                i2 = (i2 ^ (apxu != null ? apxu.hashCode() : 0)) * 1000003;
                String str = this.m;
                if (str != null) {
                    i3 = str.hashCode();
                }
                return i2 ^ i3;
            }
            throw null;
        }
        throw null;
    }

    /* Access modifiers changed, original: final */
    public final fdo n() {
        return new fbc(this);
    }

    /* Access modifiers changed, original: final */
    public final int o() {
        return this.n;
    }

    /* Access modifiers changed, original: final */
    public final int p() {
        return this.o;
    }

    /* synthetic */ fba(boolean z, boolean z2, boolean z3, int i, aybc aybc, ayao ayao, axzw axzw, ayaa ayaa, feb feb, CharSequence charSequence, int i2, int i3, int i4, apxu apxu, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = aybc;
        this.f = ayao;
        this.g = axzw;
        this.h = ayaa;
        this.i = feb;
        this.j = charSequence;
        this.n = i2;
        this.o = i3;
        this.k = i4;
        this.l = apxu;
        this.m = str;
    }
}
