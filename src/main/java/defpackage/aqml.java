package defpackage;

/* renamed from: aqml */
public final class aqml extends anxl implements anzf {
    public static final aqml i;
    private static volatile anzq k;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public apxu c;
    public arml d;
    public arwf e;
    public arml f;
    public apxu g;
    public araq h;
    private byte j = (byte) 2;

    private aqml() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0006\u0001Л\u0002Љ\u0000\u0003Љ\u0001\u0006\t\u0002\u0007Љ\u0003\bЉ\u0007\tЉ\u0004", new Object[]{"a", "b", aqmn.class, "c", "d", "e", "f", "h", "g"});
            case 3:
                return new aqml();
            case 4:
                return new aqmo();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aqml.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqml aqml = new aqml();
        i = aqml;
        anxl.registerDefaultInstance(aqml.class, aqml);
    }
}
