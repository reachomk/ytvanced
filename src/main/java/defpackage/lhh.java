package defpackage;

import java.util.concurrent.Executor;

/* renamed from: lhh */
final class lhh implements lho {
    public final alua a;
    public final Executor b;
    private final afpu c;
    private String d;
    private altm e = a();

    lhh(alua alua, afpu afpu, Executor executor) {
        this.a = alua;
        this.c = afpu;
        this.b = executor;
    }

    public final void a(lhr lhr, anjg anjg) {
        Object obj;
        alua alua = this.a;
        altm a = a();
        lfs lfs = (lfs) lft.e.createBuilder();
        int i = 0;
        while (i < lhr.c.size()) {
            byte[] a2 = lhr.a((apxu) lhr.c.get(i));
            if (a2 == null) {
                obj = lft.e;
                break;
            }
            anvu a3 = anvu.a(a2);
            lfu lfu = (lfu) lfv.c.createBuilder();
            lfu.copyOnWrite();
            lfv lfv = (lfv) lfu.instance;
            if (a3 != null) {
                lfv.a |= 1;
                lfv.b = a3;
                lfv lfv2 = (lfv) ((anxl) lfu.build());
                lfs.copyOnWrite();
                lft lft = (lft) lfs.instance;
                if (lfv2 != null) {
                    if (!lft.b.a()) {
                        lft.b = anxl.mutableCopy(lft.b);
                    }
                    lft.b.add(lfv2);
                    i++;
                } else {
                    throw new NullPointerException();
                }
            }
            throw new NullPointerException();
        }
        int i2 = lhr.b;
        lfs.copyOnWrite();
        lft lft2 = (lft) lfs.instance;
        lft2.a |= 1;
        lft2.c = i2;
        lfs.copyOnWrite();
        lft lft3 = (lft) lfs.instance;
        lft3.a |= 2;
        lft3.d = 4;
        obj = (lft) ((anxl) lfs.build());
        anjf.a(alua.a(a, obj, alux.a()), anjg, aniv.a);
    }

    /* Access modifiers changed, original: final */
    public final altm a() {
        altm a;
        synchronized (this) {
            Object a2 = this.c.a() ? this.c.c().a() : null;
            if (this.e == null || !amqq.a(this.d, a2)) {
                this.d = a2;
                if (this.c.a()) {
                    String a3 = this.c.c().a();
                    amqw.a("AppGlobalScope".equals(a3) ^ 1, "userId cannot be %s. Use createAppGlobalKey to generate an app scoped key.", (Object) "AppGlobalScope");
                    amqw.a("SignedOutID".equals(a3) ^ 1, "userId cannot be %s. Use createSignedOutUserKey to generate a key for signed out user.", (Object) "SignedOutID");
                    a = altm.a(a3, "PlaybackQueueDataStore", "queue");
                } else {
                    a = altm.a("SignedOutID", "PlaybackQueueDataStore", "queue");
                }
                this.e = a;
            }
            a = this.e;
        }
        return a;
    }
}
