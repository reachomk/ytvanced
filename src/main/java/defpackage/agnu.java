package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor.AutoCloseOutputStream;
import android.net.Uri;
import java.nio.channels.FileChannel;

/* renamed from: agnu */
public final class agnu implements agnw {
    private final Context a;
    private final bcaa b;
    private final Uri c;

    public final Uri a() {
        return this.c;
    }

    public final void e() {
    }

    public final FileChannel b() {
        return new AutoCloseOutputStream(ufq.a(this.a, this.c, "rw")).getChannel();
    }

    public final void c() {
        ((agmp) this.b.get()).a(this.c);
    }

    public final void d() {
        ((agmp) this.b.get()).a(this.c);
        ContentResolver contentResolver = this.a.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_pending", Integer.valueOf(0));
        contentResolver.update(this.c, contentValues, null, null);
    }

    /* synthetic */ agnu(Context context, bcaa bcaa, Uri uri) {
        this.a = context;
        this.b = bcaa;
        this.c = uri;
    }
}
