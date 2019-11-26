package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: wgg */
final /* synthetic */ class wgg implements Runnable {
    private final wgd a;
    private final Bitmap b;

    wgg(wgd wgd, Bitmap bitmap) {
        this.a = wgd;
        this.b = bitmap;
    }

    public final void run() {
        Uri fromFile;
        wgd wgd = this.a;
        Bitmap bitmap = this.b;
        try {
            File file = new File(wgd.a.M_().getCacheDir(), "comment");
            if (!file.exists()) {
                file.mkdir();
            }
            File createTempFile = File.createTempFile("attached_image_data", ".png", file);
            bitmap.compress(CompressFormat.PNG, 100, new FileOutputStream(createTempFile));
            fromFile = Uri.fromFile(createTempFile);
        } catch (IOException e) {
            xtl.a("Exception reading from cropped image file", e);
            fromFile = null;
        }
        wfz wfz = wgd.a;
        wfz.b.b(wfz.aa, wfz.ab, fromFile);
    }
}
