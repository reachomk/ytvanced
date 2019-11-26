package defpackage;

/* renamed from: axql */
public final class axql extends anxl implements anzf {
    public static final axql i;
    private static volatile anzq k;
    public int a;
    public int b = 0;
    public Object c;
    public String d;
    public String e;
    public boolean f;
    public arwf g;
    public axak h;
    private byte j = (byte) 2;

    private axql() {
        String str = "";
        this.d = str;
        this.e = str;
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
                return anxl.newMessageInfo(i, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0004\u0001\b\u0000\u0002\u0007\u0002\u0003м\u0000\u0004\t\u0006\u0005м\u0000\u0006м\u0000\b\b\u0001\tЉ\b", new Object[]{"c", "b", "a", "d", "f", axqp.class, "g", apxu.class, apxu.class, "e", "h"});
            case 3:
                return new axql();
            case 4:
                return new axqk();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (axql.class) {
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
        axql axql = new axql();
        i = axql;
        anxl.registerDefaultInstance(axql.class, axql);
    }
}
