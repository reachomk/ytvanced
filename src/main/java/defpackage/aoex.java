package defpackage;

/* renamed from: aoex */
public final class aoex extends anxl implements anzf {
    public static final aoex e;
    private static volatile anzq g;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public aoev c;
    public arml d;
    private byte f = (byte) 2;

    private aoex() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0001\u0003\u0001Л\u0005Љ\u0003\u0007Љ\u0002", new Object[]{"a", "b", aoew.class, "d", "c"});
            case 3:
                return new aoex();
            case 4:
                return new aoey();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aoex.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoex aoex = new aoex();
        e = aoex;
        anxl.registerDefaultInstance(aoex.class, aoex);
    }
}
