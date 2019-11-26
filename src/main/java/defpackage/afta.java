package defpackage;

/* renamed from: afta */
final /* synthetic */ class afta implements bqk {
    private final Class a;

    afta(Class cls) {
        this.a = cls;
    }

    public final void a(bqn bqn) {
        String valueOf = String.valueOf(this.a.getCanonicalName());
        String str = "Volley request failed for type ";
        xtl.a(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), (Throwable) bqn);
    }
}
