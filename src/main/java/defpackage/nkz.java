package defpackage;

/* renamed from: nkz */
public final class nkz extends anxl implements anzf {
    public static final nkz k;
    private static volatile anzq l;
    public int a;
    public String b;
    public anyd c = anxl.emptyProtobufList();
    public String d;
    public int e;
    public anyd f;
    public String g;
    public int h;
    public int i;
    public anxz j;

    private nkz() {
        String str = "";
        this.b = str;
        this.d = str;
        this.f = anxl.emptyProtobufList();
        this.g = str;
        this.j = anxl.emptyIntList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001Ϫ\t\u0000\u0003\u0000\u0001\b\u0000\u0002\u001a\u0003\b\u0001\b\f\u0002\n\u001a\u000b\b\u0003\r\u0004\u0004ϩ\u0004\u0005Ϫ\u0016", new Object[]{"a", "b", "c", "d", "e", nle.a, "f", "g", "h", "i", "j"});
            case 3:
                return new nkz();
            case 4:
                return new nlc();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (nkz.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        nkz nkz = new nkz();
        k = nkz;
        anxl.registerDefaultInstance(nkz.class, nkz);
    }
}
