package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ArrayAdapter;

/* renamed from: aigd */
final class aigd implements OnClickListener {
    private final /* synthetic */ ArrayAdapter a;
    private final /* synthetic */ aigf b;

    aigd(ArrayAdapter arrayAdapter, aigf aigf) {
        this.a = arrayAdapter;
        this.b = aigf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.a((ajis) this.a.getItem(i));
        dialogInterface.dismiss();
    }
}
