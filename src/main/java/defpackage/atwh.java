package defpackage;

/* renamed from: atwh */
public final class atwh extends anxl implements anzf {
    public static final atwh j;
    private static volatile anzq l;
    public int a;
    public arwf b;
    public anyd c = anxl.emptyProtobufList();
    public String d = "";
    public arml e;
    public arml f;
    public axak g;
    public boolean h;
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private atwh() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0004\u0001\t\u0000\u0002Л\u0003\b\u0001\u0004Љ\u0002\u0005Љ\u0003\u0006Љ\u0004\b\n\u0007\t\u0007\u0005", new Object[]{"a", "b", "c", aygk.class, "d", "e", "f", "g", "i", "h"});
            case 3:
                return new atwh();
            case 4:
                return new atwj();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (atwh.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atwh atwh = new atwh();
        j = atwh;
        anxl.registerDefaultInstance(atwh.class, atwh);
    }
}
