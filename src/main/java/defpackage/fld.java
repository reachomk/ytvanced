package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: fld */
public final /* synthetic */ class fld implements OnClickListener {
    private final fkz a;
    private final String b;
    private final byte[] c;

    public fld(fkz fkz, String str, byte[] bArr) {
        this.a = fkz;
        this.b = str;
        this.c = bArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        fkz fkz = this.a;
        String str = this.b;
        byte[] bArr = this.c;
        aaxj a = fkz.f.a();
        a.a = str;
        a.a(bArr);
        fkz.f.a(a, new flh(fkz));
    }
}
