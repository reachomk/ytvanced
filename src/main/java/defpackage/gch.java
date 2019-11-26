package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.AsyncTask;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import com.google.android.youtube.R;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: gch */
final class gch extends AsyncTask {
    private final WeakReference a;

    gch(gbt gbt) {
        this.a = new WeakReference(gbt);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        gbt gbt = (gbt) this.a.get();
        if (gbt != null && gge.a(gbt)) {
            if (gbt.af) {
                gbt.aq.setEnabled(false);
            } else {
                gbt.aq.setEnabled(true);
                xpr.a(gbt.aq, 1 ^ gbt.ak.a());
                gbt.Z.b(acwc.UPLOAD_VIDEO_SELECTION_BUTTON, gbt.ag);
                if (bitmap == null) {
                    gbt.aq.setImageDrawable(gbt.q().getDrawable(R.drawable.reel_gallery_button_waiting_icon_v2));
                } else {
                    gbt.aq.setImageBitmap(bitmap);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        gbt gbt = (gbt) this.a.get();
        if (gbt == null || !gge.a(gbt)) {
            return null;
        }
        Context M_ = gbt.M_();
        zjc zjc = M_ != null ? new zjc(M_) : null;
        if (zjc == null) {
            gbt.af = true;
            return null;
        }
        Cursor query;
        Cursor query2;
        try {
            query = zjc.c.getContentResolver().query(Media.EXTERNAL_CONTENT_URI, (String[]) zjc.a.toArray(new String[0]), null, null, "date_modified DESC LIMIT 1");
        } catch (SQLiteException | IllegalArgumentException | SecurityException e) {
            xtl.a("Error while trying to query content resolver for latest photo.", e);
            query = null;
        }
        File a = zjc.a(query);
        try {
            query2 = zjc.c.getContentResolver().query(Video.Media.EXTERNAL_CONTENT_URI, (String[]) zjc.b.toArray(new String[0]), null, null, "date_modified DESC LIMIT 1");
        } catch (SQLiteException | IllegalArgumentException | SecurityException e2) {
            xtl.a("Error while trying to query content resolver for latest video.", e2);
            query2 = null;
        }
        File a2 = zjc.a(query2);
        if (a == null && a2 == null) {
            gbt.af = true;
            return null;
        }
        Bitmap a3;
        if (a2 == null) {
            try {
                a3 = gbt.a(a);
            } catch (Exception unused) {
                xtl.c("Failed getting photo/video thumbnail as gallery button icon");
                return null;
            }
        } else if (a == null) {
            a3 = gbt.b(a2.getAbsolutePath());
        } else if (zjc.a(a) >= zjc.a(a2)) {
            a3 = gbt.a(a);
        } else {
            a3 = gbt.b(a2.getAbsolutePath());
        }
        if (a3 == null) {
            return null;
        }
        if (a3.isRecycled()) {
            return null;
        }
        int width = a3.getWidth() + 5;
        int height = a3.getHeight() + 5;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        BitmapShader bitmapShader = new BitmapShader(a3, TileMode.CLAMP, TileMode.CLAMP);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(null);
        paint.setColor(-1);
        int dimension = (int) (gbt.q().getDimension(R.dimen.reels_camera_gallery_waiting_icon_corner_radius) / 1.2f);
        int dimension2 = (int) (gbt.q().getDimension(R.dimen.reels_camera_gallery_waiting_icon_stroke_width) / 1.2f);
        float f = (float) dimension;
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), f, f, paint);
        paint.setShader(bitmapShader);
        float f2 = (float) dimension2;
        canvas.drawRoundRect(new RectF(f2, f2, (float) (width - dimension2), (float) (height - dimension2)), f, f, paint);
        return createBitmap;
    }
}
