package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;

/* renamed from: vai */
public final class vai implements OnShowListener {
    public final /* synthetic */ vaj a;

    public vai(vaj vaj) {
        this.a = vaj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        vaj vaj = this.a;
        vaj.h = vaj.e.getButton(-1);
        vaj = this.a;
        vaj.i = vaj.e.getButton(-2);
        this.a.h.setOnClickListener(new val(this));
        this.a.i.setOnClickListener(new vak(this));
    }
}
