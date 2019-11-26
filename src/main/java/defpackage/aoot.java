package defpackage;

/* renamed from: aoot */
public final class aoot extends anxl implements anzf {
    public static final anyb d = new aoos();
    public static final aoot i;
    private static volatile anzq j;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anxz c = anxl.emptyIntList();
    public aogc e;
    public boolean f;
    public boolean g;
    public avwi h;

    private aoot() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0006\u0000\u0001\u0002\u0013\u0006\u0000\u0002\u0000\u0002\u001b\u0005\u001e\r\t\t\u000e\u0007\n\u000f\u0007\u000b\u0013\t\u000f", new Object[]{"a", "b", aoue.class, "c", aoqh.a(), "e", "f", "g", "h"});
            case 3:
                return new aoot();
            case 4:
                return new aoov();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aoot.class) {
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
        aoot aoot = new aoot();
        i = aoot;
        anxl.registerDefaultInstance(aoot.class, aoot);
    }
}
