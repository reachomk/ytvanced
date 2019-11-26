package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ajet */
public final class ajet {
    public final afqv a;
    public final afmq b;
    public final ajev[] c;
    public aakm d;
    private final Executor e;
    private final afpu f;
    private ajeu g = new ajeu();
    private xvo h;
    private int i;
    private int j;
    private boolean k;

    ajet(afqv afqv, afmq afmq, Executor executor, afpu afpu, ajev... ajevArr) {
        this.a = (afqv) amqw.a((Object) afqv);
        this.b = (afmq) amqw.a((Object) afmq);
        this.e = (Executor) amqw.a((Object) executor);
        this.f = (afpu) amqw.a((Object) afpu);
        this.c = (ajev[]) amqw.a((Object) ajevArr);
    }

    public final synchronized void a(xvo xvo) {
        this.h = xvo;
        int length = xvo.a().toString().length();
        this.j += length - this.i;
        this.i = length;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(aakm aakm) {
        this.d = (aakm) amqw.a((Object) aakm);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(boolean z) {
        this.k = z;
    }

    public final synchronized void a(String str, String str2) {
        int b = b(str, str2);
        int i = this.j;
        for (ajev a : this.c) {
            i += a.a();
        }
        if (i + b > 1900) {
            if (a()) {
                b = b(str, str2);
            } else {
                return;
            }
        }
        this.j += b;
        this.g.b(str, str2);
    }

    public final synchronized boolean a() {
        if (this.h != null) {
            if (this.d != null) {
                if (!this.k) {
                    return false;
                }
                for (List isEmpty : this.g.a.values()) {
                    if (!isEmpty.isEmpty()) {
                        ajeu ajeu = this.g;
                        xvo a = xvo.a(this.h);
                        afpt c = this.f.c();
                        this.g = new ajeu();
                        this.j = this.i;
                        this.e.execute(new ajes(this, ajeu, a, c));
                        return true;
                    }
                }
                return true;
            }
        }
        afpc.a(2, afpf.media, "Tried to send ping before trackingURI info received. QOE events will be lost.");
        return false;
    }

    private final int b(String str, String str2) {
        List list = (List) this.g.a.get(str);
        int length = (list == null || list.isEmpty()) ? str.length() + 1 : 0;
        return (length + str2.length()) + 1;
    }
}
