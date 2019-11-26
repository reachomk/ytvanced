package defpackage;

import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: kgo */
public final class kgo {
    public final ajya a;
    public final boolean b;
    public final boolean c;

    public kgo(ajya ajya, aafl aafl) {
        this.a = (ajya) amqw.a((Object) ajya);
        boolean z = false;
        boolean z2 = aafl != null && aafl.b();
        this.b = z2;
        if (aafl != null && aafl.a()) {
            z = true;
        }
        this.c = z;
    }

    /* Access modifiers changed, original: final */
    public final aphv a() {
        axak axak = this.a.o;
        if (axak == null) {
            return null;
        }
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.toggleButtonRenderer);
        axak.a(access$000);
        Object b = axak.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (aphv) b;
    }
}
