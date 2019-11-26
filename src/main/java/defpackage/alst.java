package defpackage;

import java.util.List;

/* renamed from: alst */
public final class alst implements aamt {
    private final alss a;
    private final int b;

    public alst(alss alss, alse alse) {
        this.a = alss;
        if (alse.b()) {
            this.b = 9;
        } else if (alse.a()) {
            this.b = 5;
        } else {
            this.b = 1;
        }
    }

    public final void a(asib asib) {
        List e = this.a.e();
        if (!e.isEmpty()) {
            ashn ashn = (ashn) ((anxo) asib.a().toBuilder());
            anxl anxl = asib.a().H;
            if (anxl == null) {
                anxl = axqr.d;
            }
            axqq axqq = (axqq) ((anxo) anxl.toBuilder());
            axqq.copyOnWrite();
            ((axqr) axqq.instance).b = anxl.emptyProtobufList();
            axqq.copyOnWrite();
            axqr axqr = (axqr) axqq.instance;
            if (!axqr.b.a()) {
                axqr.b = anxl.mutableCopy(axqr.b);
            }
            anvf.addAll(e, axqr.b);
            int i = this.b;
            axqq.copyOnWrite();
            axqr = (axqr) axqq.instance;
            if (i != 0) {
                axqr.a |= 1;
                axqr.c = i - 1;
                ashn.copyOnWrite();
                ashl ashl = (ashl) ashn.instance;
                ashl.H = (axqr) ((anxl) axqq.build());
                ashl.b |= 8388608;
                asib.a(ashn);
                return;
            }
            throw new NullPointerException();
        }
    }
}
