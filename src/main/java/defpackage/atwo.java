package defpackage;

/* renamed from: atwo */
public final class atwo extends anxl implements anzf {
    public static final atwo e;
    private static volatile anzq g;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    private byte f = (byte) 2;

    private atwo() {
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
                return anxl.newMessageInfo(e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\b\u0000\u0002;\u0000\u0003м\u0000\u00047\u0000\u0005:\u0000\u00063\u0000", new Object[]{"c", "b", "a", "d", arml.class});
            case 3:
                return new atwo();
            case 4:
                return new atwr();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atwo.class) {
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
        atwo atwo = new atwo();
        e = atwo;
        anxl.registerDefaultInstance(atwo.class, atwo);
    }
}
