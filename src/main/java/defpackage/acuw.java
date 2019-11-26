package defpackage;

/* renamed from: acuw */
final class acuw implements afsw {
    public final /* synthetic */ njz a;
    public final /* synthetic */ afpt b;
    public final /* synthetic */ acuu c;

    acuw(acuu acuu, njz njz, afpt afpt) {
        this.c = acuu;
        this.a = njz;
        this.b = afpt;
    }

    public final void a(bqn bqn) {
        String valueOf = String.valueOf(asnf.class.getCanonicalName());
        String str = "Volley request retry failed for type ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        xtl.a(valueOf, (Throwable) bqn);
        this.c.d.execute(new acuv(this, bqn));
    }
}
