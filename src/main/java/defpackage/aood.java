package defpackage;

/* renamed from: aood */
public final class aood extends anxl implements anzf {
    public static final aood i;
    private static volatile anzq j;
    public int a;
    public String b;
    public long c;
    public long d;
    public int e;
    public int f;
    public String g;
    public int h;

    private aood() {
        String str = "";
        this.b = str;
        this.g = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\f\u0003\u0005\f\u0004\b\b\u0007\t\f\b", new Object[]{"a", "b", "c", "d", "e", aonr.a, "f", aono.a, "g", "h", aonq.a});
            case 3:
                return new aood();
            case 4:
                return new aooc();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aood.class) {
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
        aood aood = new aood();
        i = aood;
        anxl.registerDefaultInstance(aood.class, aood);
    }
}
