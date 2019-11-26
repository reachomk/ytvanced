package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Pair;
import java.io.IOException;

/* renamed from: akkv */
public final class akkv {
    public static Pair a(ContentResolver contentResolver, Uri uri) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        if (akkv.a(akkv.c(contentResolver, uri))) {
            return Pair.create(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        }
        return Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public static Bitmap b(ContentResolver contentResolver, Uri uri) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        options.inSampleSize = 1;
        int i = options.outWidth / 2;
        int i2 = options.outHeight / 2;
        while (i / options.inSampleSize > 1024 && i2 / options.inSampleSize > 1024) {
            int i3 = options.inSampleSize;
            options.inSampleSize = i3 + i3;
        }
        options.inJustDecodeBounds = false;
        return akkv.a(BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options), contentResolver, uri);
    }

    public static Bitmap a(Bitmap bitmap, ContentResolver contentResolver, Uri uri) {
        int c = akkv.c(contentResolver, uri);
        if (c == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) c);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            return createBitmap;
        } finally {
            bitmap.recycle();
        }
    }

    public static Bitmap a(ContentResolver contentResolver, Uri uri, Rect rect, int i, int i2) {
        Options options = new Options();
        options.inSampleSize = 1;
        int width = rect.width() / 2;
        int height = rect.height() / 2;
        while (i > 0 && width / options.inSampleSize > i && i2 > 0 && height / options.inSampleSize > i2) {
            int i3 = options.inSampleSize;
            options.inSampleSize = i3 + i3;
        }
        i = akkv.c(contentResolver, uri);
        if (i != 0) {
            Pair a = akkv.a(contentResolver, uri);
            Matrix matrix = new Matrix();
            matrix.postTranslate((float) ((-((Integer) a.first).intValue()) / 2), (float) ((-((Integer) a.second).intValue()) / 2));
            matrix.postRotate((float) (-i));
            if (akkv.a(i)) {
                matrix.postTranslate((float) (((Integer) a.second).intValue() / 2), (float) (((Integer) a.first).intValue() / 2));
            } else {
                matrix.postTranslate((float) (((Integer) a.first).intValue() / 2), (float) (((Integer) a.second).intValue() / 2));
            }
            RectF rectF = new RectF(rect);
            matrix.mapRect(rectF);
            rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(contentResolver.openInputStream(uri), false);
        Bitmap decodeRegion;
        try {
            decodeRegion = newInstance.decodeRegion(rect, options);
            if (i != 0) {
                Matrix matrix2 = new Matrix();
                matrix2.postRotate((float) i);
                Bitmap createBitmap = Bitmap.createBitmap(decodeRegion, 0, 0, decodeRegion.getWidth(), decodeRegion.getHeight(), matrix2, false);
                decodeRegion.recycle();
                newInstance.recycle();
                return createBitmap;
            }
            newInstance.recycle();
            return decodeRegion;
        } catch (IllegalArgumentException e) {
            try {
                Pair a2 = akkv.a(contentResolver, uri);
                String valueOf = String.valueOf(uri);
                String valueOf2 = String.valueOf(a2.first);
                String valueOf3 = String.valueOf(a2.second);
                String valueOf4 = String.valueOf(rect);
                int i4 = options.inSampleSize;
                StringBuilder stringBuilder = new StringBuilder((((valueOf.length() + 113) + valueOf2.length()) + valueOf3.length()) + valueOf4.length());
                stringBuilder.append("Unexpected exception while cropping an image: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(", size: ");
                stringBuilder.append(valueOf2);
                stringBuilder.append("x");
                stringBuilder.append(valueOf3);
                stringBuilder.append(", crop bounds: ");
                stringBuilder.append(valueOf4);
                stringBuilder.append(", scale: x");
                stringBuilder.append(i4);
                stringBuilder.append(", degrees: ");
                stringBuilder.append(i);
                xtl.a(stringBuilder.toString(), e);
                throw e;
            } catch (Throwable th) {
                newInstance.recycle();
            }
        } catch (Throwable th2) {
            decodeRegion.recycle();
        }
    }

    private static int c(ContentResolver contentResolver, Uri uri) {
        Cursor query;
        int i = 1;
        try {
            query = contentResolver.query(uri, new String[]{"orientation"}, null, null, null);
        } catch (IllegalArgumentException unused) {
            query = null;
        }
        if (query != null && query.moveToFirst()) {
            int columnIndex = query.getColumnIndex(r0);
            if (columnIndex != -1) {
                return query.getInt(columnIndex);
            }
        }
        try {
            aym aym = new aym(contentResolver.openInputStream(uri));
            ayn a = aym.a("Orientation");
            if (a != null) {
                try {
                    i = a.b(aym.e);
                } catch (NumberFormatException unused2) {
                }
            }
            switch (i) {
                case 3:
                case 4:
                    return 180;
                case 5:
                case 6:
                    return 90;
                case 7:
                case 8:
                    return -90;
                default:
                    return 0;
            }
        } catch (IOException unused3) {
            return 0;
        }
    }

    private static boolean a(int i) {
        return Math.abs(i % 180) == 90;
    }
}
