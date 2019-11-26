package defpackage;

/* renamed from: asud */
public final class asud extends anxl implements anzf {
    public static final asud i;
    private static volatile anzq j;
    public int a;
    public String b;
    public String c;
    public asuf d;
    public String e;
    public String f;
    public int g;
    public float h;

    private asud() {
        String str = "";
        this.b = str;
        this.c = str;
        this.e = str;
        this.f = str;
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001\b\u0003\u0002\b\u0004\u0003\t\u0005\u0004\b\u0006\u0005\b\u0007\u0006\u0004\b\n\u0001\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new asud();
            case 4:
                return new asug();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (asud.class) {
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
        asud asud = new asud();
        i = asud;
        anxl.registerDefaultInstance(asud.class, asud);
    }
}
