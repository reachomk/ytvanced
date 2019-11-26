package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.jar.EmbedOverflowOverlay;

/* renamed from: mtl */
public final class mtl implements OnClickListener {
    private final aahn[] a;
    private final /* synthetic */ EmbedOverflowOverlay b;

    public mtl(EmbedOverflowOverlay embedOverflowOverlay, aahn[] aahnArr) {
        this.b = embedOverflowOverlay;
        this.a = (aahn[]) amqw.a((Object) aahnArr);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i >= 0) {
            aahn[] aahnArr = this.a;
            if (i < aahnArr.length) {
                this.b.e.a(aahnArr[i].a);
                dialogInterface.dismiss();
                this.b.b();
                this.b.d.b();
            }
        }
    }
}
