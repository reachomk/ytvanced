package defpackage;

/* renamed from: ailo */
public abstract class ailo {
    public abstract float a();

    public abstract float b();

    public abstract bcpu c();

    public static ailo a(float f, float f2, bcpu bcpu) {
        boolean z = true;
        boolean z2 = f >= 0.0f && f <= 1.0f;
        Object valueOf = Float.valueOf(f);
        String str = "input is not a valid opacity: %s";
        amqw.a(z2, str, valueOf);
        boolean z3 = f2 >= 0.0f && f2 <= 1.0f;
        amqw.a(z3, str, valueOf);
        if (bcpu.b < 0) {
            z = false;
        }
        amqw.a(z, "duration is negative: %s", (Object) bcpu);
        return new ailj(f, f2, bcpu);
    }
}
