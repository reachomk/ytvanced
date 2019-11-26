package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: vum */
final class vum implements Runnable {
    private final /* synthetic */ Uri a;
    private final /* synthetic */ List b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ vul d;

    vum(vul vul, Uri uri, List list, boolean z) {
        this.d = vul;
        this.a = uri;
        this.b = list;
        this.c = z;
    }

    public final void run() {
        String.valueOf(this.a).length();
        afqy a = this.d.a(this.a, this.b, this.c);
        aage aage = this.d.b;
        if (aage != null) {
            a.e = aage.bb_();
            a.f = this.d.b.b();
        }
        this.d.a.a(a, null, aftp.a);
    }
}
