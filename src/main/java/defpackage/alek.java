package defpackage;

import android.app.Activity;
import android.util.SparseArray;

/* renamed from: alek */
public final class alek implements allb {
    public static final amur a = amur.a(avwe.ADDRESS_BOOK, "android.permission.READ_CONTACTS", avwe.ANDROID_CAMERA, "android.permission.CAMERA", avwe.WRITE_EXTERNAL_STORAGE, "android.permission.WRITE_EXTERNAL_STORAGE");
    public alfs b;
    private final Activity c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final SparseArray g = new SparseArray();

    public alek(Activity activity, bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.c = (Activity) amqw.a((Object) activity);
        this.d = (bcaa) amqw.a((Object) bcaa);
        this.e = (bcaa) amqw.a((Object) bcaa2);
        this.f = (bcaa) amqw.a((Object) bcaa3);
    }

    public final boolean a(avwc avwc) {
        alep b = b(avwc);
        return b.a.checkSelfPermission(b.b) == 0;
    }

    public final void a(aqhy aqhy, alla alla) {
        if (aqhy != null) {
            akcq.a(this.c, aqhy, (aaas) this.d.get(), (acvx) this.e.get(), new alen(alla), null);
        }
    }

    public final void a(avwc avwc, aqhy aqhy, alla alla) {
        if (aqhy != null) {
            this.b = alfs.a(this.c, aqhy, (aaas) this.d.get(), (acvx) this.e.get(), (akkq) this.f.get(), new alem(this, avwc, alla), null);
            return;
        }
        b(avwc).a(false, alla);
    }

    /* Access modifiers changed, original: final */
    public final alep b(avwc avwc) {
        amqw.a(avwc != null);
        avwe a = avwe.a(avwc.b);
        if (a == null) {
            a = avwe.INVALID;
        }
        return a(a);
    }

    public final alep a(avwe avwe) {
        if (this.g.get(avwe.g, null) == null && a.containsKey(avwe)) {
            this.g.put(avwe.g, new alep(this.c, avwe, (String) a.get(avwe)));
        }
        if (((alep) this.g.get(avwe.g, null)) != null) {
            return (alep) this.g.get(avwe.g);
        }
        throw new IllegalArgumentException("Unsupported Permission Type");
    }
}
