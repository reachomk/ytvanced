package defpackage;

/* renamed from: axqm */
public final class axqm extends anxo implements anzf {
    private axqm() {
        super(axqn.f);
    }

    public final axqm a(axql axql) {
        copyOnWrite();
        axqn axqn = (axqn) this.instance;
        if (axql != null) {
            axqn.a();
            axqn.b.add(axql);
            return this;
        }
        throw new NullPointerException();
    }

    public final axqm a(axqk axqk) {
        copyOnWrite();
        axqn axqn = (axqn) this.instance;
        axqn.a();
        axqn.b.add((axql) ((anxl) axqk.build()));
        return this;
    }

    public final axqm a() {
        copyOnWrite();
        ((axqn) this.instance).b = anxl.emptyProtobufList();
        return this;
    }

    /* synthetic */ axqm(byte b) {
        super(axqn.f);
    }
}
