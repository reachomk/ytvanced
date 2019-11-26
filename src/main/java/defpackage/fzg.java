package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: fzg */
final class fzg implements anij {
    private final Bitmap a;
    private final File b;

    public final anjv a() {
        File file = this.b;
        String valueOf = String.valueOf(new SimpleDateFormat("'IMAGE'_yyyyMMdd_HHmmssmm", Locale.getDefault()).format(new Date(System.currentTimeMillis())));
        String str = "image.jpeg";
        if (str.length() == 0) {
            str = new String(valueOf);
        } else {
            str = valueOf.concat(str);
        }
        Object file2 = new File(file, str);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        this.a.compress(CompressFormat.JPEG, 92, fileOutputStream);
        fileOutputStream.close();
        return anjf.a(file2);
    }

    /* synthetic */ fzg(File file, Bitmap bitmap) {
        this.b = file;
        this.a = bitmap;
    }
}
