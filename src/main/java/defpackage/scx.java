package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;

/* renamed from: scx */
final class scx implements OnClickListener {
    private final /* synthetic */ scs a;

    scx(scs scs) {
        this.a = scs;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ArrayList arrayList = new ArrayList();
        MediaTrack a = this.a.aa.a();
        if (a.a != -1) {
            arrayList.add(a);
        }
        a = this.a.ab.a();
        if (a != null) {
            arrayList.add(a);
        }
        for (scq a2 : this.a.Z.I) {
            a2.a(arrayList);
        }
        this.a.c.cancel();
    }
}
