package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/* renamed from: bsu */
public final class bsu extends btm {
    public bsu(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public final Class d() {
        return AssetFileDescriptor.class;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 28);
        stringBuilder.append("FileDescriptor is null for: ");
        stringBuilder.append(valueOf);
        throw new FileNotFoundException(stringBuilder.toString());
    }
}
