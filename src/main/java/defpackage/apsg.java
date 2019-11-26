package defpackage;

/* renamed from: apsg */
public final class apsg extends anxl implements anzf {
    public static final apsg i;
    private static volatile anzq j;
    public int a;
    public String b;
    public anvu c = anvu.a;
    public anyd d = anxl.emptyProtobufList();
    public String e;
    public String f;
    public String g;
    public String h;

    private apsg() {
        String str = "";
        this.b = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001\b\u0000\u0003\n\u0001\u0004\u001b\u0005\b\u0002\u0006\b\u0003\u0007\b\u0004\b\b\u0005", new Object[]{"a", "b", "c", "d", apru.class, "e", "f", "g", "h"});
            case 3:
                return new apsg();
            case 4:
                return new apsj();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (apsg.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apsg apsg = new apsg();
        i = apsg;
        anxl.registerDefaultInstance(apsg.class, apsg);
    }
}
