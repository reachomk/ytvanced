package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: keh */
final /* synthetic */ class keh implements OnClickListener {
    private final kdw a;
    private final byte[] b;
    private final fej c;
    private final apxu d;

    keh(kdw kdw, byte[] bArr, fej fej, apxu apxu) {
        this.a = kdw;
        this.b = bArr;
        this.c = fej;
        this.d = apxu;
    }

    public final void onClick(View view) {
        kdw kdw = this.a;
        byte[] bArr = this.b;
        fej fej = this.c;
        apxu apxu = this.d;
        kdw.a(bArr);
        fej.b(!fej.isSelected() ? 1 : 2);
        if (fej.isSelected()) {
            kdw.j.add(apxu);
        } else {
            kdw.j.remove(apxu);
        }
    }
}
