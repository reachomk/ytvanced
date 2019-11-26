package defpackage;

/* renamed from: gtx */
final class gtx extends gwo {
    private final Object a = null;
    private final Object b;
    private final Object c;
    private final fis d;
    private final nl e;
    private final nl f;
    private final fiw g;
    private final boolean h;
    private final boolean i;

    /* Access modifiers changed, original: final */
    public final Object a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final Object b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final Object c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final fis d() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final nl e() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final nl f() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final fiw g() {
        return this.g;
    }

    /* Access modifiers changed, original: final */
    public final boolean h() {
        return this.h;
    }

    /* Access modifiers changed, original: final */
    public final boolean i() {
        return this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        boolean z = this.h;
        boolean z2 = this.i;
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        int length5 = valueOf5.length();
        StringBuilder stringBuilder = new StringBuilder(((((((length + 186) + length2) + length3) + length4) + length5) + valueOf6.length()) + valueOf7.length());
        stringBuilder.append("RetainedState{superState=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", masterState=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", detailState=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", detailBackStack=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", masterSavedState=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", detailSavedState=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", detailRetainedDescriptor=");
        stringBuilder.append(valueOf7);
        stringBuilder.append(", showingDetail=");
        stringBuilder.append(z);
        stringBuilder.append(", startedInOfflineMode=");
        stringBuilder.append(z2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gwo) {
            gwo gwo = (gwo) obj;
            Object obj2 = this.a;
            if (obj2 == null ? gwo.a() != null : !obj2.equals(gwo.a())) {
                obj2 = this.b;
                if (obj2 == null ? gwo.b() != null : !obj2.equals(gwo.b())) {
                    obj2 = this.c;
                    if (obj2 == null ? gwo.c() != null : !obj2.equals(gwo.c())) {
                        fis fis = this.d;
                        if (fis == null ? gwo.d() != null : !fis.equals(gwo.d())) {
                            nl nlVar = this.e;
                            if (nlVar == null ? gwo.e() != null : !nlVar.equals(gwo.e())) {
                                nlVar = this.f;
                                if (nlVar == null ? gwo.f() != null : !nlVar.equals(gwo.f())) {
                                    fiw fiw = this.g;
                                    if (fiw == null ? gwo.g() == null : fiw.equals(gwo.g())) {
                                        return this.h == gwo.h() && this.i == gwo.i();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = ((obj != null ? obj.hashCode() : 0) ^ 1000003) * 1000003;
        Object obj2 = this.b;
        hashCode = (hashCode ^ (obj2 != null ? obj2.hashCode() : 0)) * 1000003;
        obj2 = this.c;
        hashCode = (hashCode ^ (obj2 != null ? obj2.hashCode() : 0)) * 1000003;
        fis fis = this.d;
        hashCode = (hashCode ^ (fis != null ? fis.hashCode() : 0)) * 1000003;
        nl nlVar = this.e;
        hashCode = (hashCode ^ (nlVar != null ? nlVar.hashCode() : 0)) * 1000003;
        nlVar = this.f;
        hashCode = (hashCode ^ (nlVar != null ? nlVar.hashCode() : 0)) * 1000003;
        fiw fiw = this.g;
        if (fiw != null) {
            i = fiw.hashCode();
        }
        int i2 = 1237;
        hashCode = (((hashCode ^ i) * 1000003) ^ (!this.h ? 1237 : 1231)) * 1000003;
        if (this.i) {
            i2 = 1231;
        }
        return hashCode ^ i2;
    }

    /* synthetic */ gtx(Object obj, Object obj2, Object obj3, fis fis, nl nlVar, nl nlVar2, fiw fiw, boolean z, boolean z2) {
        this.b = obj2;
        this.c = obj3;
        this.d = fis;
        this.e = nlVar;
        this.f = nlVar2;
        this.g = fiw;
        this.h = z;
        this.i = z2;
    }
}
