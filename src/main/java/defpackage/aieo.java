package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: aieo */
final /* synthetic */ class aieo implements OnClickListener {
    public static final OnClickListener a = new aieo();

    private aieo() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
