package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.libraries.youtube.player.features.overlay.overflow.ui.DefaultOverflowOverlay;

/* renamed from: aiem */
public final class aiem implements OnClickListener {
    private final aajq[] a;
    private final /* synthetic */ DefaultOverflowOverlay b;

    public aiem(DefaultOverflowOverlay defaultOverflowOverlay, aajq[] aajqArr) {
        this.b = defaultOverflowOverlay;
        this.a = (aajq[]) amqw.a((Object) aajqArr);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i >= 0) {
            aajq[] aajqArr = this.a;
            if (i < aajqArr.length) {
                this.b.c.a(aajqArr[i].a);
                dialogInterface.dismiss();
                this.b.b();
                this.b.a.b();
            }
        }
    }
}
