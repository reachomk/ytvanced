package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: btm */
public abstract class btm implements bsv {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public btm(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    public abstract Object a(Uri uri, ContentResolver contentResolver);

    public abstract void a(Object obj);

    public final void b() {
    }

    public final int c() {
        return 1;
    }

    public final void a(bre bre, bsy bsy) {
        try {
            this.c = a(this.a, this.b);
            bsy.a(this.c);
        } catch (FileNotFoundException e) {
            bsy.a(e);
        }
    }

    public final void a() {
        Object obj = this.c;
        if (obj != null) {
            try {
                a(obj);
            } catch (IOException unused) {
            }
        }
    }
}
