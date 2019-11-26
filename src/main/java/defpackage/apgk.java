package defpackage;

/* renamed from: apgk */
public final class apgk extends anxl implements anzf {
    public static final apgk d;
    private static volatile anzq f;
    public int a;
    public apgg b;
    public apga c;
    private byte e = (byte) 2;

    private apgk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001䖢䙇\u0002\u0000\u0000\u0001䖢\t\u0002䙇Љ\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new apgk();
            case 4:
                return new apgj();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (apgk.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apgk apgk = new apgk();
        d = apgk;
        anxl.registerDefaultInstance(apgk.class, apgk);
    }
}
