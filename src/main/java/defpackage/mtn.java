package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.jar.EmbedOverflowOverlay;

/* renamed from: mtn */
public final class mtn implements OnClickListener {
    private final aajq[] a;
    private final /* synthetic */ EmbedOverflowOverlay b;

    public mtn(EmbedOverflowOverlay embedOverflowOverlay, aajq[] aajqArr) {
        this.b = embedOverflowOverlay;
        this.a = (aajq[]) amqw.a((Object) aajqArr);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i >= 0) {
            aajq[] aajqArr = this.a;
            if (i < aajqArr.length) {
                this.b.f.a(aajqArr[i].a);
                dialogInterface.dismiss();
                this.b.b();
                this.b.d.b();
            }
        }
    }
}
