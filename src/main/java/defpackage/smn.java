package defpackage;

/* renamed from: smn */
final /* synthetic */ class smn implements bbnv {
    private final smh a;

    smn(smh smh) {
        this.a = smh;
    }

    public final Object a(Object obj) {
        String str = (String) obj;
        swm swm = this.a.a;
        str = String.valueOf(str);
        String str2 = "/system/template/";
        return swm.b(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
