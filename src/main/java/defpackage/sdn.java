package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.libraries.cast.companionlibrary.widgets.MiniController;
import com.google.android.youtube.R;

/* renamed from: sdn */
public final class sdn extends sdc {
    private final /* synthetic */ MiniController a;

    public sdn(MiniController miniController) {
        this.a = miniController;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(this.a.getResources(), R.drawable.album_art_placeholder);
        }
        this.a.e.setImageBitmap(bitmap);
        MiniController miniController = this.a;
        if (this == miniController.f) {
            miniController.f = null;
        }
    }
}
