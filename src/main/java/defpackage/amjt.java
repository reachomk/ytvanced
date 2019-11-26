package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Video.Thumbnails;

/* renamed from: amjt */
public final class amjt extends AsyncTask {
    private final Context a;
    private final amjs b;

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.b.a((Bitmap) obj);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        amjr amjr = ((amjr[]) objArr)[0];
        Uri uri = amjr.a;
        Long l = amjr.b;
        Object obj = null;
        if (uri != null && DocumentsContract.isDocumentUri(this.a, uri)) {
            try {
                obj = DocumentsContract.getDocumentThumbnail(this.a.getContentResolver(), uri, new Point(96, 96), new CancellationSignal());
            } catch (Exception e) {
                afpc.a(1, afpf.upload, "Upload Error", e);
            }
        }
        return (obj == null && l != null && xun.a(this.a, "android.permission.READ_EXTERNAL_STORAGE")) ? Thumbnails.getThumbnail(this.a.getContentResolver(), l.longValue(), 3, new Options()) : obj;
    }

    public /* synthetic */ amjt(Context context, amjs amjs) {
        this.a = context;
        this.b = amjs;
    }
}
