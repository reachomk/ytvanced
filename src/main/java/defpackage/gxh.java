package defpackage;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: gxh */
final class gxh implements OnClickListener {
    private final /* synthetic */ gxf a;

    gxh(gxf gxf) {
        this.a = gxf;
    }

    public final void onClick(View view) {
        if (gxf.a(gxq.a(this.a.al)) == awnx.PRIVATE) {
            gxf gxf = this.a;
            if (gxf.an == null) {
                Builder builder = new Builder(gxf.a);
                builder.setTitle(R.string.save_playlist_changes_dialog_title);
                builder.setMessage(R.string.save_playlist_changes_dialog_content);
                builder.setPositiveButton(R.string.save_playlist_menu_item_title, new gxj(gxf));
                builder.setNegativeButton(R.string.cancel, new gxl());
                gxf.an = builder.create();
            }
            gxf.an.show();
            return;
        }
        this.a.ac.a(gxb.b(this.a.ak));
    }
}
