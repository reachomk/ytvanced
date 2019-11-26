package defpackage;

/* renamed from: anyw */
public final class anyw {
    public final anyv a;

    private anyw(aobm aobm, Object obj, aobm aobm2, Object obj2) {
        this.a = new anyv(aobm, obj, aobm2, obj2);
    }

    public static anyw a(aobm aobm, Object obj, aobm aobm2, Object obj2) {
        return new anyw(aobm, obj, aobm2, obj2);
    }

    static void a(anwm anwm, anyv anyv, Object obj, Object obj2) {
        anxg.a(anwm, anyv.a, 1, obj);
        anxg.a(anwm, anyv.c, 2, obj2);
    }

    static int a(anyv anyv, Object obj, Object obj2) {
        return anxg.a(anyv.a, 1, obj) + anxg.a(anyv.c, 2, obj2);
    }
}
