package defpackage;

/* renamed from: axex */
public final class axex extends anxl implements anzf {
    public static final axex c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private axex() {
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
                return anxl.newMessageInfo(c, "\u0001\u000e\u0001\u0000⫩ﵬ橈\u000e\u0000\u0000\u000e⫩м\u0000㍽м\u0000㥚м\u0000㥴м\u0000㱾м\u0000㵔м\u0000䆵м\u0000䎫м\u0000丘м\u0000凔м\u0000怋м\u0000拄м\u0000斿м\u0000ﵬ橈м\u0000", new Object[]{"b", "a", apni.class, ariq.class, axbo.class, ayqv.class, avzg.class, aomx.class, axkn.class, apgs.class, ayed.class, argn.class, avua.class, axqh.class, arje.class, arri.class});
            case 3:
                return new axex();
            case 4:
                return new axew();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (axex.class) {
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
        axex axex = new axex();
        c = axex;
        anxl.registerDefaultInstance(axex.class, axex);
    }
}
