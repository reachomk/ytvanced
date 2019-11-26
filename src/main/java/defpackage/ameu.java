package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.net.Uri;
import android.os.CancellationSignal;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Video.Thumbnails;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: ameu */
public final class ameu implements amev {
    private static final String[] a = new String[]{"_id"};
    private final ContentResolver b;
    private final Uri c;

    public ameu(Uri uri, ContentResolver contentResolver) {
        this.c = uri;
        this.b = contentResolver;
    }

    public final boolean a() {
        return true;
    }

    public final amey a(File file) {
        AssetFileDescriptor openAssetFileDescriptor = this.b.openAssetFileDescriptor(this.c, "r");
        try {
            long length = openAssetFileDescriptor.getLength();
            if (length != -1) {
                amey amey = new amey(this.b.openInputStream(this.c), length);
                return amey;
            }
            try {
                openAssetFileDescriptor.close();
            } catch (IOException unused) {
            }
            return new amey(this.b.openInputStream(this.c));
        } finally {
            try {
                openAssetFileDescriptor.close();
            } catch (IOException unused2) {
            }
        }
    }

    public final Bitmap a(Point point) {
        try {
            Bitmap documentThumbnail = DocumentsContract.getDocumentThumbnail(this.b, this.c, point, new CancellationSignal());
            if (documentThumbnail == null) {
                if (point.x <= 96) {
                    if (point.y <= 96) {
                        documentThumbnail = a(3, new Options());
                    }
                }
                documentThumbnail = a(1, new Options());
            }
            return documentThumbnail;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    private final Bitmap a(int i, Options options) {
        Cursor query = this.b.query(this.c, a, null, null, null);
        String valueOf;
        StringBuilder stringBuilder;
        if (query == null) {
            valueOf = String.valueOf(this.c);
            stringBuilder = new StringBuilder(valueOf.length() + 35);
            stringBuilder.append("Content resolver did not recognize ");
            stringBuilder.append(valueOf);
            throw new FileNotFoundException(stringBuilder.toString());
        } else if (query.moveToFirst()) {
            try {
                long j = query.getLong(query.getColumnIndexOrThrow("_id"));
                if (query.moveToNext()) {
                    valueOf = String.valueOf(this.c);
                    StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 47);
                    stringBuilder2.append("Multiple content resolver entries returned for ");
                    stringBuilder2.append(valueOf);
                    throw new AssertionError(stringBuilder2.toString());
                }
                Bitmap thumbnail = Thumbnails.getThumbnail(this.b, j, i, options);
                return thumbnail;
            } finally {
                query.close();
            }
        } else {
            valueOf = String.valueOf(this.c);
            stringBuilder = new StringBuilder(valueOf.length() + 30);
            stringBuilder.append("No content resolver entry for ");
            stringBuilder.append(valueOf);
            throw new FileNotFoundException(stringBuilder.toString());
        }
    }

    public final ayuo a(String str, String str2) {
        ayur ayur = (ayur) ayuo.d.createBuilder();
        axca axca = (axca) axcb.c.createBuilder();
        axca.a(str);
        ayur.copyOnWrite();
        ayuo ayuo = (ayuo) ayur.instance;
        ayuo.b = (axcb) ((anxl) axca.build());
        ayuo.a |= 1;
        return (ayuo) ((anxl) ayur.build());
    }
}
