package defpackage;

/* renamed from: apdx */
public final class apdx extends anxl implements anzf {
    public static final apdx g;
    private static volatile anzq i;
    public int a;
    public aped b;
    public apeb c;
    public apdz d;
    public auxa e;
    public apej f;
    private byte h = (byte) 2;

    private apdx() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001ᡈ㴵\u0005\u0000\u0000\u0005ᡈЉ\u0004⮔Љ\u0000ﭥ㇃Љ\u0001㇊Љ\u0002㴵Љ\u0003", new Object[]{"a", "f", "b", "c", "d", "e"});
            case 3:
                return new apdx();
            case 4:
                return new apdw();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (apdx.class) {
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
        apdx apdx = new apdx();
        g = apdx;
        anxl.registerDefaultInstance(apdx.class, apdx);
    }
}
