package defpackage;

/* renamed from: atao */
public final class atao extends anxl implements anzf {
    public static final atao h;
    private static volatile anzq j;
    public int a;
    public ashy b;
    public anyd c = anxl.emptyProtobufList();
    public long d;
    public long e;
    public int f;
    public float g;
    private byte i = (byte) 2;

    private atao() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001Љ\u0000\u0002\u001b\u0003\u0003\u0001\u0004\u0003\u0002\u0005\u000b\u0003\u0006\u0001\u0004", new Object[]{"a", "b", "c", atak.class, "d", "e", "f", "g"});
            case 3:
                return new atao();
            case 4:
                return new atan();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (atao.class) {
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
        atao atao = new atao();
        h = atao;
        anxl.registerDefaultInstance(atao.class, atao);
    }
}
