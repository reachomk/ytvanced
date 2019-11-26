package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alol */
final class alol implements OnClickListener {
    private final /* synthetic */ aloi a;

    alol(aloi aloi) {
        this.a = aloi;
    }

    public final void onClick(View view) {
        allh allh = this.a.a;
        if (!allh.d()) {
            boolean c = allh.c();
            boolean b = allh.b(this.a.b);
            if (!c || b) {
                String str = this.a.b;
                xak.a();
                amqw.a(allh.a.contains(str));
                if ((b ^ 1) != 0) {
                    allh.d.clear();
                    allh.l = str;
                } else if (TextUtils.equals(allh.l, str)) {
                    allh.l = null;
                }
                allh.i();
                allh.j();
            }
        }
    }
}
