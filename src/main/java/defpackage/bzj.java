package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: bzj */
final class bzj implements bsv {
    private static final String[] a = new String[]{"_data"};
    private final Context b;
    private final Uri c;

    bzj(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final int c() {
        return 1;
    }

    public final Class d() {
        return File.class;
    }

    public final void a(bre bre, bsy bsy) {
        Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
        CharSequence charSequence = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    charSequence = query.getString(query.getColumnIndexOrThrow("_data"));
                }
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            String valueOf = String.valueOf(this.c);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 30);
            stringBuilder.append("Failed to find file path for: ");
            stringBuilder.append(valueOf);
            bsy.a(new FileNotFoundException(stringBuilder.toString()));
            return;
        }
        bsy.a(new File(charSequence));
    }
}
