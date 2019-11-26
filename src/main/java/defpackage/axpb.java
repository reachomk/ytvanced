package defpackage;

/* renamed from: axpb */
public final class axpb extends anxo implements anzf {
    private axpb() {
        super(axpc.f);
    }

    public final axpb a() {
        copyOnWrite();
        axpc axpc = (axpc) this.instance;
        axpc.a |= 1;
        axpc.b = true;
        return this;
    }

    public final axpb a(arml arml) {
        copyOnWrite();
        axpc axpc = (axpc) this.instance;
        if (arml != null) {
            axpc.d = arml;
            axpc.a |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    public final axpb a(aphm aphm) {
        copyOnWrite();
        axpc axpc = (axpc) this.instance;
        axpc.e = (aphj) ((anxl) aphm.build());
        axpc.a |= 8;
        return this;
    }

    /* synthetic */ axpb(byte b) {
        super(axpc.f);
    }
}
