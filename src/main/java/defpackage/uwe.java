package defpackage;

/* renamed from: uwe */
final /* synthetic */ class uwe implements amqv {
    private final uwc a;

    uwe(uwc uwc) {
        this.a = uwc;
    }

    public final boolean a(Object obj) {
        axgu axgu;
        uwc uwc = this.a;
        axgw axgw = (axgw) obj;
        if (axgw.a == 64166933) {
            axgu = (axgu) axgw.b;
        } else {
            axgu = axgu.g;
        }
        boolean z = false;
        if (axgw.a == 64166933) {
            if (!"FINGERPRINT".equalsIgnoreCase(axgu.b)) {
                z = true;
            } else if (uwc.a.a()) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }
}
