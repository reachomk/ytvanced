package defpackage;

import java.util.ArrayList;

/* renamed from: bhh */
final class bhh extends bhc {
    private final /* synthetic */ zj a;
    private final /* synthetic */ bhe b;

    bhh(bhe bhe, zj zjVar) {
        this.b = bhe;
        this.a = zjVar;
    }

    public final void a(bgx bgx) {
        ((ArrayList) this.a.get(this.b.a)).remove(bgx);
        bgx.b((bhd) this);
    }
}
