package defpackage;

/* renamed from: aiax */
public final class aiax implements aiay, ajan, xcp {
    private final aizy a;
    private final aiav b;

    public aiax(aizy aizy, aiav aiav) {
        this.a = aizy;
        this.b = (aiav) amqw.a((Object) aiav);
        ((hwq) aiav).c.a((aiay) this);
    }

    public final long e() {
        return 4096;
    }

    public final void a(String str) {
        aizy aizy = this.a;
        aizy.e.a(str);
        if (aizy.D() != null) {
            aizy.D().c_(str);
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().e.a(ajcg.b(ajam.O(), 4096)).a(ajcg.a(ajam.O(), 4096)).a(new aiba(this), aiaz.a)};
    }

    public final void a(aetv aetv) {
        this.b.f(aetv.b());
        if (aetv.b()) {
            aahr aahr = aetv.c;
            aahn[] aahnArr = aetv.f;
            Object k = aahr != null ? aahr.k() : null;
            int i = 0;
            while (i < aahnArr.length) {
                if (aahnArr[i].a.equals(k)) {
                    break;
                }
                i++;
            }
            i = -1;
            this.b.a(aahnArr, i);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aetv.class};
        } else if (i == 0) {
            a((aetv) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
