package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.concurrent.Executor;

/* renamed from: fxc */
final /* synthetic */ class fxc implements OnClickListener {
    private final fwz a;
    private final apxu b;
    private final Object c;

    fxc(fwz fwz, apxu apxu, Object obj) {
        this.a = fwz;
        this.b = apxu;
        this.c = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        fwz fwz = this.a;
        apxu apxu = this.b;
        Object obj = this.c;
        aaml aaml = (aaml) fwz.d.get();
        aaml.a(aabc.a(apxu));
        anjv a = fwz.e.a(aaml);
        Executor executor = fwz.f;
        xoi xoi = fwz.c;
        xoi.getClass();
        xan.a(a, executor, new fxb(xoi), new fxe(fwz, apxu, obj), ankh.a);
    }
}
