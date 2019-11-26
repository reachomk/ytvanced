package defpackage;

/* renamed from: atca */
public final class atca extends anxl implements anzf {
    public static final atca h;
    private static volatile anzq j;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public apuj c;
    public atbq d;
    public anvu e = anvu.a;
    public int f;
    public int g;
    private byte i = (byte) 2;

    private atca() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\u001a\u0002\t\u0000\u0003Љ\u0001\u0004\n\u0002\u0005\u0004\u0003\u0006\u0004\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new atca();
            case 4:
                return new atbz();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (atca.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
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
        atca atca = new atca();
        h = atca;
        anxl.registerDefaultInstance(atca.class, atca);
    }
}
