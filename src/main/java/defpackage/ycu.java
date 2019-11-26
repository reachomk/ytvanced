package defpackage;

/* renamed from: ycu */
public final class ycu {
    public final akmx a;

    public ycu(akmx akmx) {
        this.a = (akmx) amqw.a((Object) akmx);
    }

    public static String a(Object obj) {
        if (obj instanceof ycp) {
            obj = ((ycp) obj).a;
        } else if (obj instanceof ycs) {
            obj = ((ycs) obj).a;
        }
        return zcz.b(obj);
    }

    public static boolean b(Object obj) {
        if ((obj instanceof ycp) || (obj instanceof ycs)) {
            return true;
        }
        return zcz.a(obj);
    }
}
