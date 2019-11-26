package defpackage;

/* renamed from: avdn */
public final class avdn extends anxl implements anzf {
    public static final avdn c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private avdn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000ﻼ⨻玨\u0003\u0000\u0000\u0003ﻼ⨻м\u0000㩂м\u0000玨м\u0000", new Object[]{"b", "a", aulk.class, avdt.class, awnz.class});
            case 3:
                return new avdn();
            case 4:
                return new avdq();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (avdn.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avdn avdn = new avdn();
        c = avdn;
        anxl.registerDefaultInstance(avdn.class, avdn);
    }
}
