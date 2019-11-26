package defpackage;

/* renamed from: appg */
public final class appg extends anxl implements anzf {
    public static final appg g;
    private static volatile anzq i;
    public int a;
    public aphj b;
    public appo c;
    public appc d;
    public appe e;
    public appi f;
    private byte h = (byte) 2;

    private appg() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0007\u000b\u0005\u0000\u0000\u0005\u0007Љ\u0000\bЉ\u0001\tЉ\u0002\nЉ\u0003\u000bЉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new appg();
            case 4:
                return new appj();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (appg.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        appg appg = new appg();
        g = appg;
        anxl.registerDefaultInstance(appg.class, appg);
    }
}
