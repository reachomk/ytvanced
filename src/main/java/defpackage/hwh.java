package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hwh */
final /* synthetic */ class hwh implements OnClickListener {
    private final hwf a;

    hwh(hwf hwf) {
        this.a = hwf;
    }

    public final void onClick(View view) {
        hwf hwf = this.a;
        byte[] bArr = hwf.f;
        if (bArr != null) {
            hwf.e.a(3, new acvs(bArr), null);
        }
    }
}
