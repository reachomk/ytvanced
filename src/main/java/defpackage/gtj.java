package defpackage;

import android.view.MenuItem;
import android.widget.ImageButton;
import com.google.android.youtube.R;

/* renamed from: gtj */
final /* synthetic */ class gtj implements Runnable {
    private final gso a;

    gtj(gso gso) {
        this.a = gso;
    }

    public final void run() {
        gso gso = this.a;
        MenuItem menuItem = gso.ah;
        ImageButton imageButton = menuItem != null ? (ImageButton) menuItem.getActionView() : null;
        if (imageButton != null) {
            int i = gso.ag;
            if (i == 1) {
                imageButton.setEnabled(true);
                imageButton.setContentDescription(imageButton.getResources().getString(R.string.start_upload_button));
                imageButton.setOnClickListener(new gta(gso));
                imageButton.setImageAlpha(255);
            } else if (i != 2) {
                imageButton.setEnabled(false);
                imageButton.setImageAlpha(64);
                imageButton.setOnClickListener(null);
            } else {
                gso.ah.setVisible(false);
                imageButton.setContentDescription(imageButton.getResources().getString(R.string.starting_upload_button));
                imageButton.setEnabled(false);
                imageButton.setOnClickListener(null);
            }
        }
    }
}
