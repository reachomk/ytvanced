package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;

/* renamed from: gyr */
final /* synthetic */ class gyr implements OnClickListener {
    private final gyl a;

    gyr(gyl gyl) {
        this.a = gyl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        gyl gyl = this.a;
        String obj = gyl.ar.getText().toString();
        if (!TextUtils.equals(gyl.aq, obj)) {
            gyl.b(obj);
        }
    }
}
