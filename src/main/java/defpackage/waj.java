package defpackage;

/* renamed from: waj */
public final class waj implements aamt {
    private final bcaa a;

    public waj(bcaa bcaa) {
        this.a = (bcaa) amqw.a((Object) bcaa);
    }

    public final void a(asib asib) {
        xak.b();
        wal wal = (wal) this.a.get();
        anxl anxl = ((ashy) asib.instance).j;
        if (anxl == null) {
            anxl = ashf.b;
        }
        ashe ashe = (ashe) ((anxo) anxl.toBuilder());
        ashe.copyOnWrite();
        ((ashf) ashe.instance).a = anxl.emptyProtobufList();
        atwr atwr = (atwr) atwo.e.createBuilder();
        String c = wal.c();
        atwr.copyOnWrite();
        atwo atwo = (atwo) atwr.instance;
        if (c != null) {
            atwo.a |= 1;
            atwo.d = c;
            String b = wal.b();
            atwr.copyOnWrite();
            atwo atwo2 = (atwo) atwr.instance;
            if (b != null) {
                atwo2.b = 2;
                atwo2.c = b;
                ashe.copyOnWrite();
                ashf ashf = (ashf) ashe.instance;
                if (!ashf.a.a()) {
                    ashf.a = anxl.mutableCopy(ashf.a);
                }
                ashf.a.add((atwo) ((anxl) atwr.build()));
                asib.copyOnWrite();
                ashy ashy = (ashy) asib.instance;
                ashy.j = (ashf) ((anxl) ashe.build());
                ashy.a |= 256;
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
