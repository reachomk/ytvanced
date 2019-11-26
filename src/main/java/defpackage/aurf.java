package defpackage;

/* renamed from: aurf */
public final class aurf extends anxo implements anzf {
    private aurf() {
        super(aurc.b);
    }

    public final aurf a(auri auri) {
        copyOnWrite();
        aurc aurc = (aurc) this.instance;
        if (!aurc.a.a()) {
            aurc.a = anxl.mutableCopy(aurc.a);
        }
        aurc.a.add((aurg) ((anxl) auri.build()));
        return this;
    }

    public final aurf a() {
        copyOnWrite();
        ((aurc) this.instance).a = anxl.emptyProtobufList();
        return this;
    }

    /* synthetic */ aurf(byte b) {
        super(aurc.b);
    }
}
