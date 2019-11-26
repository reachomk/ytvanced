package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.libraries.youtube.player.features.overlay.overflow.ui.DefaultOverflowOverlay;

/* renamed from: aiel */
public final class aiel implements OnClickListener {
    private final aahn[] a;
    private final /* synthetic */ DefaultOverflowOverlay b;

    public aiel(DefaultOverflowOverlay defaultOverflowOverlay, aahn[] aahnArr) {
        this.b = defaultOverflowOverlay;
        this.a = (aahn[]) amqw.a((Object) aahnArr);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i >= 0) {
            aahn[] aahnArr = this.a;
            if (i < aahnArr.length) {
                this.b.b.a(aahnArr[i].a);
                dialogInterface.dismiss();
                this.b.b();
                this.b.a.b();
            }
        }
    }
}
