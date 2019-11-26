package defpackage;

/* renamed from: akqd */
public final class akqd {
    public final akqc a = new akqc();
    public final akqc b = new akqc();
    public final akqc c = new akqc();
    public final akqc d = new akqc();

    public static akqa a(akqc akqc, aqj aqj) {
        Object a = akqd.a(aqj);
        return a != null ? akqc.a(a) : null;
    }

    public static Class a(aqj aqj) {
        Object obj;
        if (aqj == null) {
            obj = null;
        } else if (aqj instanceof akoy) {
            obj = ((akoy) aqj).p;
        } else {
            obj = akoz.a(aqj.a);
        }
        if (obj != null) {
            return obj.getClass();
        }
        return null;
    }
}
