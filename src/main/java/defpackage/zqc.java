package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Thumbnails;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;

/* renamed from: zqc */
final class zqc {
    private static final Point a = new Point(512, 384);

    static Bitmap a(Context context, zix zix, CancellationSignal cancellationSignal) {
        amqw.a((Object) context);
        amqw.a((Object) zix);
        ContentResolver contentResolver = context.getContentResolver();
        String str = "Gallery Error";
        Bitmap bitmap = null;
        if (zix.h() == 2) {
            File file;
            try {
                file = new File(URI.create(zix.b().toString()));
            } catch (IllegalArgumentException e) {
                afpc.a(1, afpf.upload, str, e);
                file = null;
            }
            if (file != null) {
                Bitmap decodeStream;
                try {
                    decodeStream = BitmapFactory.decodeStream(new FileInputStream(file));
                } catch (FileNotFoundException e2) {
                    afpc.a(1, afpf.upload, str, e2);
                    decodeStream = null;
                }
                if (decodeStream != null) {
                    Matrix matrix = new Matrix();
                    matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) decodeStream.getWidth(), (float) decodeStream.getHeight()), new RectF(0.0f, 0.0f, (float) a.x, (float) a.y), ScaleToFit.CENTER);
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                }
            }
        } else if (DocumentsContract.isDocumentUri(context, zix.b())) {
            try {
                bitmap = DocumentsContract.getDocumentThumbnail(contentResolver, zix.b(), a, cancellationSignal);
            } catch (Exception e22) {
                afpc.a(1, afpf.upload, str, e22);
            }
        } else {
            bitmap = zix.h() == 0 ? Thumbnails.getThumbnail(contentResolver, zix.a(), 1, null) : Images.Thumbnails.getThumbnail(contentResolver, zix.a(), 1, null);
        }
        if (zix.h() != 1) {
            return bitmap;
        }
        return akkv.a(bitmap, contentResolver, zix.b());
    }
}
