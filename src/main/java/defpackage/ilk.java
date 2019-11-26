package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ilk */
final /* synthetic */ class ilk implements OnClickListener {
    private final ilf a;
    private final ahcd b;

    ilk(ilf ilf, ahcd ahcd) {
        this.a = ilf;
        this.b = ahcd;
    }

    public final void onClick(View view) {
        ilf ilf = this.a;
        ahcd ahcd = this.b;
        ajxx ajxx = ilf.h;
        if (ajxx != null) {
            ahcd.b(ajxx.a);
        }
    }
}
