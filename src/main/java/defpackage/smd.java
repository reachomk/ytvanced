package defpackage;

/* renamed from: smd */
final /* synthetic */ class smd implements bbnv {
    private final swm a;

    smd(swm swm) {
        this.a = swm;
    }

    public final Object a(Object obj) {
        swm swm = this.a;
        String valueOf = String.valueOf((String) obj);
        String str = "/system/template/";
        return swm.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
