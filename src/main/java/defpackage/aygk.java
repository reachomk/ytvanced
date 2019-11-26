package defpackage;

/* renamed from: aygk */
public final class aygk extends anxp implements anzf {
    public static final aygk f;
    private static volatile anzq i;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public boolean c;
    public aodx d;
    public boolean e;
    private byte g = (byte) 2;

    private aygk() {
    }

    public final void b() {
        if (!this.b.a()) {
            this.b = anxl.mutableCopy(this.b);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0003\u0007\u0001\u0004\t\u0002\u0005\u0007\u0003", new Object[]{"a", "b", aygm.class, "c", "d", "e"});
            case 3:
                return new aygk();
            case 4:
                return new aygj();
            case 5:
                return f;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aygk.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
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
        aygk aygk = new aygk();
        f = aygk;
        anxl.registerDefaultInstance(aygk.class, aygk);
    }
}
