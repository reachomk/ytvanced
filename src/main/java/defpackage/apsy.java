package defpackage;

/* renamed from: apsy */
public final class apsy extends aadt {
    public final aprf a;

    /* renamed from: b */
    public final apsz a(aadw aadw) {
        return new apsz((aprc) ((anxl) this.a.build()), aadw);
    }

    public final apsy a(String... strArr) {
        Object obj = strArr[0];
        aprf aprf = this.a;
        aprf.copyOnWrite();
        aprc aprc = (aprc) aprf.instance;
        if (obj != null) {
            aprc.a();
            aprc.c.add(obj);
            return this;
        }
        throw new NullPointerException();
    }

    public final apsy a() {
        aprf aprf = this.a;
        aprf.copyOnWrite();
        ((aprc) aprf.instance).c = anxl.emptyProtobufList();
        return this;
    }

    /* synthetic */ apsy(aprf aprf) {
        this.a = aprf;
    }
}
