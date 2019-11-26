package defpackage;

/* renamed from: lid */
public final class lid implements lix {
    private final int a;
    private final amwi b;

    public lid(int i, float f) {
        this.a = i;
        boolean z = true;
        if (f > f) {
            afpf afpf = afpf.main;
            r3 = new Object[2];
            Float valueOf = Float.valueOf(f);
            r3[0] = valueOf;
            r3[1] = valueOf;
            afpc.a(2, afpf, String.format("Flexy FixedRangeResizeConstraint cannot have minAspectRatio=%s > maxAspectRatio=%s", r3));
        }
        if (f < 0.0f) {
            z = false;
        }
        Comparable valueOf2 = Float.valueOf(f);
        amqw.a(z, "Invalid minAspectRatio=%s", (Object) valueOf2);
        this.b = amwi.a(valueOf2, valueOf2);
    }

    public final int a() {
        return this.a;
    }

    public final amwi a(float f) {
        amqw.a(f > 0.0f);
        return this.b;
    }
}
