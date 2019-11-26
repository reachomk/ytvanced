package defpackage;

/* renamed from: apjs */
public final class apjs extends anxl implements anzf {
    public static final apjs c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private apjs() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000䎱䎱\u0001\u0000\u0000\u0001䎱м\u0000", new Object[]{"b", "a", arut.class});
            case 3:
                return new apjs();
            case 4:
                return new apjr();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (apjs.class) {
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
        apjs apjs = new apjs();
        c = apjs;
        anxl.registerDefaultInstance(apjs.class, apjs);
    }
}
