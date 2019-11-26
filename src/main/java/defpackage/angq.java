package defpackage;

/* renamed from: angq */
public final class angq extends anxl implements anzf {
    public static final angq e;
    private static volatile anzq g;
    public int a;
    public String b;
    public String c;
    public anyd d;
    private byte f = (byte) 2;

    private angq() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001Ԉ\u0000\u0002\b\u0001\u0004б", new Object[]{"a", "b", "c", "d", angs.class});
            case 3:
                return new angq();
            case 4:
                return new angp();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (angq.class) {
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
        angq angq = new angq();
        e = angq;
        anxl.registerDefaultInstance(angq.class, angq);
    }
}
