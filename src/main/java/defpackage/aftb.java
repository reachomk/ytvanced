package defpackage;

/* renamed from: aftb */
final /* synthetic */ class aftb implements bqj {
    private final Class a;

    aftb(Class cls) {
        this.a = cls;
    }

    public final void a(Object obj) {
        String valueOf = String.valueOf(this.a.getCanonicalName());
        String str = "Successful volley request for type ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
    }
}
