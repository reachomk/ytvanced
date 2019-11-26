package defpackage;

import com.google.android.youtube.R;

/* renamed from: fuk */
final /* synthetic */ class fuk implements xar {
    private final fuf a;
    private final apxu b;
    private final Object c;

    fuk(fuf fuf, apxu apxu, Object obj) {
        this.a = fuf;
        this.b = apxu;
        this.c = obj;
    }

    public final void accept(Object obj) {
        fuf fuf = this.a;
        apxu apxu = this.b;
        Object obj2 = this.c;
        xpr.a(fuf.a, (int) R.string.delete_upload_done, 1);
        fuf.b.d(new aaxd(apxu, obj2));
    }
}
