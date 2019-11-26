package defpackage;

/* renamed from: qyt */
public final class qyt extends ret implements rgj {
    private qyt() {
        super(qyu.zzryy);
    }

    public final qyt a(String str) {
        b();
        ((qyu) this.a).zzryv = str;
        return this;
    }

    public final qyt a(rdg rdg) {
        b();
        qyu qyu = (qyu) this.a;
        if (rdg != null) {
            qyu.zzryw = rdg;
            return this;
        }
        throw new NullPointerException();
    }

    public final qyt a(qyw qyw) {
        b();
        qyu qyu = (qyu) this.a;
        if (qyw != null) {
            qyu.zzryx = qyw.a();
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ qyt(byte b) {
        super(qyu.zzryy);
    }
}
