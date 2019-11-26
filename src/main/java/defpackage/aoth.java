package defpackage;

/* renamed from: aoth */
public final class aoth extends anxl implements anzf {
    public static final aoth k;
    private static volatile anzq l;
    public int a;
    public int b;
    public aotb c;
    public aosx d;
    public boolean e;
    public boolean f;
    public anyd g = anxl.emptyProtobufList();
    public boolean h;
    public aost i;
    public aotf j;

    private aoth() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001㤸\t\u0000\u0001\u0000\u0001\f\u0000\u0003\t\u0003\u0005\u0007\u0005\u0006\u0007\u0006\t\u001a\n\u0007\u0007\u000b\t\t㗞\t\u0002㤸\t\b", new Object[]{"a", "b", aotm.a, "d", "e", "f", "g", "h", "j", "c", "i"});
            case 3:
                return new aoth();
            case 4:
                return new aotk();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aoth.class) {
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
        aoth aoth = new aoth();
        k = aoth;
        anxl.registerDefaultInstance(aoth.class, aoth);
    }
}
