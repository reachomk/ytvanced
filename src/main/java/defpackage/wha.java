package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: wha */
final class wha implements OnClickListener {
    private final /* synthetic */ wga a;
    private final /* synthetic */ wgy b;

    wha(wgy wgy, wga wga) {
        this.b = wgy;
        this.a = wga;
    }

    public final void onClick(View view) {
        wgy wgy = this.b;
        wga wga = this.a;
        int i = wgy.i;
        if (i <= 0 || wga.c <= ((long) i) * 1048576) {
            wgy.h.a(wga);
        } else {
            AlertDialog create = new Builder(wgy.c).setMessage(wgy.c.getString(R.string.image_gallery_file_size_too_large_error, new Object[]{Integer.valueOf(i)})).setPositiveButton(17039370, null).create();
            if (create != null) {
                create.show();
                ((TextView) create.findViewById(16908299)).setLineSpacing(0.0f, 1.2f);
            }
        }
    }
}
