package defpackage;

/* renamed from: aiwi */
public final class aiwi implements aiyh {
    private final aiwl a;
    private final aixa b;

    public aiwi(aiwl aiwl, aixa aixa) {
        this.a = aiwl;
        this.b = aixa;
    }

    public final aixk a(aiqq aiqq) {
        xak.a();
        return this.b.a(this.a.a(aiqq), null);
    }

    public final aixk a(aizx aizx) {
        if (aizx != null) {
            if (aizx instanceof aizs) {
                aizm a = this.a.a(aizx);
                if (a != null) {
                    return this.b.a(a, null);
                }
                return null;
            }
            afpf afpf = afpf.player;
            String simpleName = aizx.getClass().getSimpleName();
            String str = "Sequencer state restoration failed: ";
            if (simpleName.length() == 0) {
                simpleName = new String(str);
            } else {
                simpleName = str.concat(simpleName);
            }
            afpc.a(1, afpf, simpleName);
        }
        return null;
    }
}
